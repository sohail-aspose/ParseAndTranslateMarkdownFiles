package com.company;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String BLOG_URL = "https://blog.conholdate.com";

    public static void main(String[] args) {
        // Step 0: Remove type: post in the front matter of all blog posts.
        // Step 0.1: Replace excerpt tag in the front matter with summary.
        // Step 0.2: Remove <p> and </p> tags from the excerpt/summary.
        // Step 1: Read all files inside Conholdate.Total that ends with md.
        // Step 2: Create folder for each file without md part.
        // Step 3: Copy the index.md file yo the respective folder.
        // Step 4: Create images folder inside all file folders.
        // Step 5: Extract URLs of images from an MD file, download images and place them
        // inside file's images folder.
        // Step 6: Fetch <figure></figure> tag and replace it with Hugo figure tag.
        // Step 7: Read Blog web content, fetch GISTs URLs and place Hugo shortcode for GIST.

        step0();
        step1ToStep3();
        step4();
        step5();
        step6();
        step7();
    }

    public static void step0() {
        File folder = new File("content/Conholdate.Total/");
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        /*for (File aFile : listOfFiles) {
            executeStep0(aFile.getPath());
        }*/

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    executeStep0(indexFile.getPath());
                }
            }
        }
    }

    public static void executeStep0(String filePath) {
        try {
            String markdownText = readFile(filePath);
            markdownText = markdownText.replace("type: post\n", "");
            markdownText = markdownText.replace("excerpt", "summary");
            markdownText = markdownText.replace("<p>", "");
            markdownText = markdownText.replace("</p>", "");
            markdownText = markdownText.replace("<P>", "");
            markdownText = markdownText.replace("</P>", "");
            overwriteFileContent(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void overwriteFileContent(String indexFilePath, String markdownText) throws Exception {
        // Replace content of the file with updated markup text.
        PrintWriter prw= new PrintWriter(indexFilePath);
        prw.println(markdownText);
        prw.close();
    }

    public static void step1ToStep3() {
        try {
            File folder = new File("content/Conholdate.Total/");
            File[] listOfFiles = folder.listFiles(new FilenameFilter() {
                public boolean accept(File directory, String fileName) {
                    return fileName.endsWith(".md") && !fileName.contains("_index");
                }
            });

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println(listOfFiles[i].getName());
                    String filePath = listOfFiles[i].getPath();
                    //System.out.println(listOfFiles[i].getAbsolutePath());
                    //System.out.println(listOfFiles[i].getCanonicalPath());
                    String folderPath = filePath.substring(0, filePath.length() - 3);
                    File theDir = new File(folderPath);
                    if (!theDir.exists()){
                        theDir.mkdirs();
                    }

                    Path source = Paths.get(filePath);
                    Path destination = Paths.get(folderPath);
                    Files.move(source, destination.resolve(Paths.get("index.md")), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void step4() {
        File folder = new File("content/Conholdate.Total/");
        File[] listOfFolders = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return directory.isDirectory() && !fileName.equals("images");
            }
        });

        for (int i = 0; i < listOfFolders.length; i++) {
            if(listOfFolders[i].isDirectory()) {
                File theDir = new File(listOfFolders[i].getPath(), "images");
                if (!theDir.exists()){
                    theDir.mkdirs();
                }
            }
        }
    }

    public static void step5() {
        File folder = new File("content/Conholdate.Total/");
        File[] listOfFolders = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return directory.isDirectory() && !fileName.equals("images");
            }
        });

        for (int i = 0; i < listOfFolders.length; i++) {
            if(listOfFolders[i].isDirectory()) {
                executeStep5(listOfFolders[i].getPath());
            }
        }
    }

    static void executeStep5(String folderPath){
        try {
            //String folderPath = "content/Conholdate.Total/2020-06-22-build-your-own-google-docs-like-app/";
            String saveAt = new File(folderPath, "images").getPath() + File.separator;
            File indexFile = new File(folderPath, "index.md");
            ArrayList<String> urls = new ArrayList();
            if (indexFile.exists()) {
                String markdownText = readFile(indexFile.getPath());

                // I used ? after * to make it lazy instead of greedy.
                // Please read https://www.regular-expressions.info/repeat.html for details.
                // Parenthesis are for capturing the matched string.
                Pattern p = Pattern.compile("src=\"(.*?[.].{3,5})\"");
                Matcher m = p.matcher(markdownText);
                while(m.find()) {
                    // Check this https://stackoverflow.com/questions/17969436/java-regex-capturing-groups/17969618
                    // to learn about groups.
                    //System.out.println(m.group(0)); // Matches complete Pattern.
                    //System.out.println(m.group(1)); // To get the captured string.
                    urls.add(m.group(1));
                }
            }
            for(String url : urls) {
                String fileName = url.substring( url.lastIndexOf('/')+1);
                downloadImageAndSaveToLocalDir(url, saveAt + fileName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void downloadImageAndSaveToLocalDir(String imageURL, String saveAt) {
        try {
            URL url = new URL(imageURL);
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1 != (n = in.read(buf))) {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();

            FileOutputStream fos = new FileOutputStream(saveAt);
            fos.write(response);
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error while downloading the following image: " + imageURL);
        }
    }

    static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, StandardCharsets.UTF_8);
    }

    public static void step7() {
        File folder = new File("content/Conholdate.Total/");
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    gistParsing(indexFile.getPath());
                }
            }
        }
    }

    public static void gistParsing(String filePath) {
        try {
            String markdownText = readFile(filePath);
            // Fetch Blog URL
            Pattern p = Pattern.compile("url: (.*)");
            Matcher m = p.matcher(markdownText);
            String blogURL = null;
            while(m.find()) {
                blogURL = BLOG_URL + m.group(1);
            }

            if(blogURL == null) {
                return;
            }

            String pageContent = getPageSource(blogURL);
            // Find GIST URLs
            ArrayList<String> gistsURLs = new ArrayList<String>();
            p = Pattern.compile("<scriptsrc=\"(https://gist.github.com/.+?)\">");
            m = p.matcher(pageContent);
            while(m.find()) {
                gistsURLs.add(m.group(1));
            }

            ArrayList<String> redirectedURLs = new ArrayList<String>();
            for(String aURL : gistsURLs) {
                redirectedURLs.add(getRedirectedURL(aURL));
            }

            ArrayList<String> gistTags = new ArrayList<String>();
            for(String aRedirectedURL : redirectedURLs) {
                p = Pattern.compile("https://gist.github.com/(.*?)/(.*?).js[?]file=(.*)");
                m = p.matcher(aRedirectedURL);
                while (m.find()) {
                    String username = m.group(1);
                    String gistID = m.group(2);
                    String filename = m.group(3);
                    StringBuilder gistBuilder = new StringBuilder("{{< gist");
                    gistBuilder.append(" " + username);
                    gistBuilder.append(" " + gistID);
                    gistBuilder.append(" \"" + filename + "\"");
                    gistBuilder.append(" >}}");
                    gistTags.add(gistBuilder.toString());
                }
            }

            // Replace GISTs in markdowntext with Hugo Gist Shortcode.
            for(String aGistTag : gistTags) {
                markdownText = markdownText.replaceFirst("<div class=\"oembed-gist\">[\\s\\S]*?</div>", aGistTag);
            }

            overwriteFileContent(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error while parsing GISTs data");
        }
    }

    public static String getRedirectedURL(String aURL) throws Exception {
        URLConnection con = new URL(aURL).openConnection();
        // System.out.println( "orignal url: " + con.getURL() );
        con.connect();
        // System.out.println( "connected url: " + con.getURL() );
        InputStream is = con.getInputStream();
        //System.out.println( "redirected url: " + con.getURL() );
        is.close();

        return con.getURL().toString();
    }

    public static String getPageSource(String aURL) throws Exception {
        //Instantiating the URL class
        URL url = new URL(aURL);
        //Retrieving the contents of the specified page
        Scanner sc = new Scanner(url.openStream());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()) {
            sb.append(sc.next());
        }
        //Retrieving the String from the String Buffer object
        return sb.toString();
    }

    public static void step6() {
        File folder = new File("content/Conholdate.Total/");
        File[] listOfFolders = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return directory.isDirectory() && !fileName.equals("images");
            }
        });

        for (File listOfFolder : listOfFolders) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    executeStep6(indexFile.getPath());
                }
            }
        }
    }

    public static void executeStep6(String indexFilePath) {
        try {
            //System.out.println(indexFilePath);
            ArrayList<String> figures = new ArrayList<String>();
            String markdownText = readFile(indexFilePath);
            //System.out.println("Before: " + markdownText);
            // . (dot) matches all characters except new line (\n\r). Therefore, I used
            // [\s\S] instead of . (dot).
            // Details: https://www.regular-expressions.info/dot.html
            // https://stackoverflow.com/questions/3222649/any-character-including-newline-java-regex/25071906
            Pattern p = Pattern.compile("<figure[\\s\\S]*?</figure>");
            Matcher m = p.matcher(markdownText);
            while(m.find()) {
                figures.add(m.group(0));
            }

            // Iterate over each figure and fetch src, alt and caption.
            for(String figure : figures) {
                String srcIs = null;
                String altIs = null;
                String captionIs = null;
                // Find src
                p = Pattern.compile("src=\"(.*?[.].{3,5})\"");
                m = p.matcher(figure);
                if(m.find()) {
                    String srcURL = m.group(1);
                    srcIs = srcURL.substring( srcURL.lastIndexOf('/')+1);
                }

                // Find alt
                p = Pattern.compile("alt=\"(.*?)\"");
                m = p.matcher(figure);
                if(m.find()) {
                    String srcURL = m.group(1);
                    altIs = srcURL.substring( srcURL.lastIndexOf('/')+1);
                }

                // Find caption
                p = Pattern.compile("<figcaption>(.*?)</figcaption>");
                m = p.matcher(figure);
                if(m.find()) {
                    String srcURL = m.group(1);
                    captionIs = srcURL.substring( srcURL.lastIndexOf('/')+1);
                }

                if(srcIs != null) {
                    StringBuilder hugoFigureSB = new StringBuilder("\n\n{{< figure align=center src=\"images/" + srcIs + "\"");
                    if(altIs != null) {
                        hugoFigureSB.append(" alt=\"").append(altIs).append("\"");
                    }
                    if(captionIs != null) {
                        hugoFigureSB.append(" caption=\"").append(captionIs).append("\"");
                    }
                    hugoFigureSB.append(">}}\n");

                    markdownText = markdownText.replace(figure, hugoFigureSB.toString());
                }
            }

            // Replace content of the file with updated markup text.
            overwriteFileContent(indexFilePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
