import Utils.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixIssuesInExportedContent {

    public static String BLOG_URL = "https://blog.groupdocs.com";
    public static String CONTENT_FOLDER_PATH = "content/";

    public static void fixIssuesInExportedContent() {
        // Step 0: Remove type: post in the front matter of all blog posts.
        // Step 0.1: Replace excerpt tag in the front matter with summary.
        // Step 0.2: Remove <p> and </p> tags from the excerpt/summary.
        // Step 1: Read all files inside CONTENT_FOLDER_PATH that ends with md.
        // Step 2: Create folder for each file without md part.
        // Step 3: Copy the index.md file to the respective folder.
        // Step 4: Create images folder inside all file folders.
        // Step 5: Extract URLs of images from an MD file, download images and place them
        // inside file's images folder.
        // Step 6: Fetch <figure></figure> tag and replace it with Hugo figure tag.
        // Step 7: Read Blog web content, fetch GISTs URLs and place Hugo shortcode for GIST.
        // Step 8: Format and show Code Samples.

        //step0();
        /*step1ToStep3();
        step4();
        step5();
        step6();
        step7();*/
        //placeAllHyperlinksAtTheEndOfTheFile();
        /*capitalizeAuthorName();
        addCategoryToFrontMatter();
        deleteUnnecessaryFolders();*/
        //findDraftPosts();
        //deleteTranslatedFiles();

        appendLanguageCodeToSeeAlsoBlogURLs();
    }

    public static void step0() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return fileName.endsWith(".md") && !fileName.equals("_index.md");
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
            String markdownText = Utils.readFile(filePath);
            markdownText = markdownText.replace("type: post\n", "");
            markdownText = markdownText.replace("excerpt", "summary");
            markdownText = markdownText.replace("<p>", "");
            markdownText = markdownText.replace("</p>", "");
            markdownText = markdownText.replace("<P>", "");
            markdownText = markdownText.replace("</P>", "");
            markdownText = markdownText.replace("&nbsp;", " ");
            markdownText = markdownText.replace("``````", "```\n```");
            markdownText = markdownText.replace(">}}```", ">}}\n\n```");

            // Format Code Samples in the blog posts.
            ArrayList<String> preCodes = new ArrayList();
            Pattern p = Pattern.compile("<pre class=.*?>(<code>)?");
            Matcher m = p.matcher(markdownText);
            while (m.find()) {
                preCodes.add(m.group(0));
            }

            for(String aPreCode : preCodes) {
                markdownText = markdownText.replace(aPreCode, "```\n");
            }

            preCodes = new ArrayList();
            p = Pattern.compile("(</code>)?</pre>");
            m = p.matcher(markdownText);
            while (m.find()) {
                preCodes.add(m.group(0));
            }

            for(String aPreCode : preCodes) {
                markdownText = markdownText.replace(aPreCode, "\n```");
            }

            // Format Code Samples in the blog posts.
            markdownText = markdownText.replace("&lt;", "<");
            markdownText = markdownText.replace("&gt;", ">");

            // Replace <strong> </strong> tags with ** **.
            p = Pattern.compile("<strong>(.*)</strong>");
            m = p.matcher(markdownText);
            ArrayList<String> strongTextWithTag = new ArrayList<>();
            ArrayList<String> strongTextWithOutTag = new ArrayList<>();
            while (m.find()) {
                strongTextWithTag.add(m.group(0));
                strongTextWithOutTag.add(m.group(1));
            }

            for(int i=0; i<strongTextWithTag.size(); i++) {
                markdownText = markdownText.replace(strongTextWithTag.get(i),
                        "**" + strongTextWithOutTag.get(i) + "**");
            }

            // Remove BaseURL from the url in the front matter.
            // Fetch Blog URL
            p = Pattern.compile("url: " + BLOG_URL + "(.*)");
            m = p.matcher(markdownText);
            String fetchedBlogURL = null;
            String urlFM = null;
            while (m.find()) {
                urlFM = m.group(0);
                fetchedBlogURL = m.group(1);
            }

            markdownText = markdownText.replace(urlFM, "url: " + fetchedBlogURL);

            overwriteFileContent(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void overwriteFileContent(String indexFilePath, String markdownText) throws Exception {
        // Replace content of the file with updated markup text.
        PrintWriter prw = new PrintWriter(indexFilePath);
        prw.println(markdownText);
        prw.close();
    }

    public static void step1ToStep3() {
        try {
            File folder = new File(CONTENT_FOLDER_PATH);
            File[] listOfFiles = folder.listFiles(new FilenameFilter() {
                public boolean accept(File directory, String fileName) {
                    return fileName.endsWith(".md") && !fileName.contains("_index");
                }
            });

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    //System.out.println(listOfFiles[i].getName());
                    String filePath = listOfFiles[i].getPath();

                    // Derive folder name for a blog post.
                    String markdownText = Utils.readFile(filePath);
                    Pattern p = Pattern.compile("url: (.*)");
                    Matcher m = p.matcher(markdownText);
                    String folderPath = null;
                    if (m.find()) {
                        folderPath = m.group(1);
                    }
                    folderPath = folderPath.replace(BLOG_URL, "");
                    if (folderPath.startsWith("/")) {
                        folderPath = folderPath.substring(1);
                    }
                    if (folderPath.endsWith("/")) {
                        folderPath = folderPath.substring(0, folderPath.length() - 1);
                    }
                    folderPath = folderPath.replaceAll("/", "-");
                    //folderPath = folderPath.replace("?p=", "");

                    //System.out.println(listOfFiles[i].getAbsolutePath());
                    //System.out.println(listOfFiles[i].getCanonicalPath());
                    //String folderPath = filePath.substring(0, filePath.length() - 3);

                    folderPath = "content/" + folderPath;
                    File theDir = new File(folderPath);
                    if (!theDir.exists()) {
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
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFolders = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return directory.isDirectory() && !fileName.equals("images");
            }
        });

        for (int i = 0; i < listOfFolders.length; i++) {
            if (listOfFolders[i].isDirectory()) {
                File theDir = new File(listOfFolders[i].getPath(), "images");
                if (!theDir.exists()) {
                    theDir.mkdirs();
                }
            }
        }
    }

    public static void step5() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFolders = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return directory.isDirectory() && !fileName.equals("images");
            }
        });

        for (int i = 0; i < listOfFolders.length; i++) {
            if (listOfFolders[i].isDirectory()) {
                executeStep5(listOfFolders[i].getPath());
            }
        }
    }

    static void executeStep5Deprecate(String folderPath) {
        try {
            //String folderPath = "content/Conholdate.Total/2020-06-22-build-your-own-google-docs-like-app/";
            String saveAt = new File(folderPath, "images").getPath() + File.separator;
            File indexFile = new File(folderPath, "index.md");
            ArrayList<String> urls = new ArrayList();
            if (indexFile.exists()) {
                String markdownText = Utils.readFile(indexFile.getPath());

                // I used ? after * to make it lazy instead of greedy.
                // Please read https://www.regular-expressions.info/repeat.html for details.
                // Parenthesis are for capturing the matched string.
                Pattern p = Pattern.compile("!\\[(.*?)\\]\\((.*?)[\\) ]");
                Matcher m = p.matcher(markdownText);
                while (m.find()) {
                    // Check this https://stackoverflow.com/questions/17969436/java-regex-capturing-groups/17969618
                    // to learn about groups.
                    //System.out.println(m.group(0)); // Matches complete Pattern.
                    //System.out.println(m.group(1)); // To get the captured string.
                    //System.out.println(m.group(2)); // To get the captured string.
                    urls.add(m.group(2));
                }
            }
            for (String url : urls) {
                String fileName = url.substring(url.lastIndexOf('/') + 1);
                downloadImageAndSaveToLocalDir(url, saveAt + fileName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void executeStep5(String folderPath) {
        try {
            System.out.println("Downloading images of " + folderPath);
            //String folderPath = "content/Conholdate.Total/2020-06-22-build-your-own-google-docs-like-app/";
            String saveAt = new File(folderPath, "images").getPath() + File.separator;
            File indexFile = new File(folderPath, "index.md");
            ArrayList<String> urls = new ArrayList();
            if (indexFile.exists()) {
                String markdownText = Utils.readFile(indexFile.getPath());

                // I used ? after * to make it lazy instead of greedy.
                // Please read https://www.regular-expressions.info/repeat.html for details.
                // Parenthesis are for capturing the matched string.
                Pattern p = Pattern.compile("src=\"(.*?[.].{3,5})\"");
                Matcher m = p.matcher(markdownText);
                while (m.find()) {
                    // Check this https://stackoverflow.com/questions/17969436/java-regex-capturing-groups/17969618
                    // to learn about groups.
                    //System.out.println(m.group(0)); // Matches complete Pattern.
                    //System.out.println(m.group(1)); // To get the captured string.
                    urls.add(m.group(1));
                }
            }
            for (String url : urls) {
                String fileName = url.substring(url.lastIndexOf('/') + 1);
                downloadImageAndSaveToLocalDir(url, saveAt + fileName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void downloadImageAndSaveToLocalDir(String imageURL, String saveAt) {
        try {
            URL url = new URL(imageURL);

            // To tackle problem of redirection.
            URLConnection connection = url.openConnection();
            String redirect = connection.getHeaderField("Location");
            if (redirect != null){
                url = new URL(redirect);
            }

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

    public static void step7() {
        File folder = new File(CONTENT_FOLDER_PATH);
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
            String markdownText = Utils.readFile(filePath);
            // Fetch Blog URL
            Pattern p = Pattern.compile("url: (.*)");
            Matcher m = p.matcher(markdownText);
            String blogURL = null;
            if (m.find()) {
                blogURL = BLOG_URL + m.group(1);
            }

            if (blogURL == null) {
                return;
            }

            String pageContent = getPageSource(blogURL);
            // Find GIST URLs
            ArrayList<String> gistsURLs = new ArrayList<String>();
            p = Pattern.compile("<scriptsrc=\"(https://gist.github.com/.+?)\">");
            m = p.matcher(pageContent);
            while (m.find()) {
                gistsURLs.add(m.group(1));
            }

            ArrayList<String> redirectedURLs = new ArrayList<String>();
            for (String aURL : gistsURLs) {
                redirectedURLs.add(getRedirectedURL(aURL));
            }

            ArrayList<String> gistTags = new ArrayList<String>();
            for (String aRedirectedURL : redirectedURLs) {
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
            for (String aGistTag : gistTags) {
                markdownText = markdownText.replaceFirst("\\[gist (.*?)\\]", aGistTag);
            }
            // To remove extra \ before gist tag.
            markdownText = markdownText.replace("\\{{<", "{{<");
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
        while (sc.hasNext()) {
            sb.append(sc.next());
        }
        //Retrieving the String from the String Buffer object
        return sb.toString();
    }

    public static void step6() {
        File folder = new File(CONTENT_FOLDER_PATH);
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
            String markdownText = Utils.readFile(indexFilePath);
            //System.out.println("Before: " + markdownText);
            // . (dot) matches all characters except new line (\n\r). Therefore, I used
            // [\s\S] instead of . (dot).
            // Details: https://www.regular-expressions.info/dot.html
            // https://stackoverflow.com/questions/3222649/any-character-including-newline-java-regex/25071906
            Pattern p = Pattern.compile("<figure[\\s\\S]*?</figure>");
            Matcher m = p.matcher(markdownText);
            while (m.find()) {
                figures.add(m.group(0));
            }

            // Iterate over each figure and fetch src, alt and caption.
            for (String figure : figures) {
                String srcIs = null;
                String altIs = null;
                String captionIs = null;
                // Find src
                p = Pattern.compile("src=\"(.*?[.].{3,5})\"");
                m = p.matcher(figure);
                if (m.find()) {
                    String srcURL = m.group(1);
                    srcIs = srcURL.substring(srcURL.lastIndexOf('/') + 1);
                }

                // Find alt
                p = Pattern.compile("alt=\"(.*?)\"");
                m = p.matcher(figure);
                if (m.find()) {
                    String srcURL = m.group(1);
                    altIs = srcURL.substring(srcURL.lastIndexOf('/') + 1);
                }

                // Find caption
                p = Pattern.compile("<figcaption>(.*?)</figcaption>");
                m = p.matcher(figure);
                if (m.find()) {
                    captionIs = m.group(1);
                }

                if (srcIs != null) {
                    StringBuilder hugoFigureSB = new StringBuilder("\n\n{{< figure align=center src=\"images/" + srcIs + "\"");
                    if (altIs != null) {
                        hugoFigureSB.append(" alt=\"").append(altIs).append("\"");
                    }
                    if (captionIs != null) {
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

    public static void stepTemp() {
        File folder = new File(CONTENT_FOLDER_PATH);
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
                File indexFile = new File(listOfFolder, "index.fr.md");
                if (indexFile.exists()) {
                    executeStepTemp(indexFile.getPath());
                }
            }
        }
    }

    public static void executeStepTemp(String filePath) {
        try {
            String markdownText = Utils.readFile(filePath);

            Pattern p = Pattern.compile("<strong>(.*)</strong>");
            Matcher m = p.matcher(markdownText);
            ArrayList<String> strongTextWithTag = new ArrayList<>();
            ArrayList<String> strongTextWithOutTag = new ArrayList<>();
            while (m.find()) {
                strongTextWithTag.add(m.group(0));
                strongTextWithOutTag.add(m.group(1));
            }

            for(int i=0; i<strongTextWithTag.size(); i++) {
                markdownText = markdownText.replace(strongTextWithTag.get(i),
                        "**" + strongTextWithOutTag.get(i) + "**");
            }

            overwriteFileContent(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findDraftPosts() {
        try {
            File folder = new File(CONTENT_FOLDER_PATH);
            File[] listOfFiles = folder.listFiles(new FilenameFilter() {
                public boolean accept(File directory, String fileName) {
                    return fileName.endsWith(".md") && !fileName.contains("_index");
                }
            });

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    String filePath = listOfFiles[i].getPath();
                    String markdownText = Utils.readFile(filePath);
                    if(markdownText.contains("draft: true")) {
                        //System.out.println(listOfFiles[i].getName());
                        // Move them to another folder
                        Path source = Paths.get(filePath);
                        Path destination = Paths.get("content/draftPosts/" + listOfFiles[i].getName());
                        Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void capitalizeAuthorName() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    executeCapitalizeAuthorNameStep(indexFile.getPath());
                }
            }
        }
    }

    public static void executeCapitalizeAuthorNameStep(String filePath) {
        try {
            String markdownText = Utils.readFile(filePath);

            Pattern p = Pattern.compile("author: (.*)");
            Matcher m = p.matcher(markdownText);
            String authorName = "";
            while (m.find()) {
                authorName = m.group(1);

                String updatedAuthorName = authorName.replace(".", " ");
                updatedAuthorName = WordUtils.capitalize(updatedAuthorName);

                markdownText = markdownText.replace(authorName, "'" + updatedAuthorName + "'");

                overwriteFileContent(filePath, markdownText);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addCategoryToFrontMatter() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    executeAddCategoryToFrontMatter(indexFile.getPath());
                }
            }
        }
    }

    public static void executeAddCategoryToFrontMatter(String filePath) {
        try {
            String markdownText = Utils.readFile(filePath);

            Pattern p = Pattern.compile("tags: (.*)");
            Matcher m = p.matcher(markdownText);
            String tags = "";
            while (m.find()) {
                tags = m.group(1);
            }

            if(tags != "") {
                p = Pattern.compile("'GroupDocs\\.(.*?) Product Family'");
                m = p.matcher(tags);
                ArrayList<String> categories = new ArrayList<>();
                while (m.find()) {
                    categories.add(m.group(0));
                }

                String updatedTags = tags;
                for(String category : categories){
                    updatedTags = updatedTags.replaceFirst(category + "(, )?", "");
                }
                // Remove "All" tag if it exists in the tags.
                updatedTags = updatedTags.replaceFirst("'All'(, )?", "");

                if(categories.size() > 0) {
                    StringBuilder categoriesTag = new StringBuilder("categories: [");
                    for (int i = 0; i < categories.size(); i++) {
                        if (i == 0) {
                            categoriesTag.append(categories.get(i));
                        } else {
                            categoriesTag.append(", " + categories.get(i));
                        }
                    }
                    categoriesTag.append("]");

                    markdownText = markdownText.replace(tags, updatedTags + "\n" + categoriesTag.toString());
                }
            }

            overwriteFileContent(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteUnnecessaryFolders() {
        ArrayList<String> unnecessaryFolders = new ArrayList<>();
        unnecessaryFolders.add(CONTENT_FOLDER_PATH + "recent-posts");
        unnecessaryFolders.add(CONTENT_FOLDER_PATH + "newsletters");
        unnecessaryFolders.add(CONTENT_FOLDER_PATH + "categories");
        unnecessaryFolders.add(CONTENT_FOLDER_PATH + "archives");

        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        ArrayList<File> foldersToDelete = new ArrayList<File>();
        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                if(unnecessaryFolders.contains(listOfFolder.getPath())) {
                    foldersToDelete.add(listOfFolder);
                }
            }
        }

        try {
            for (File folderToDelete : foldersToDelete) {
                FileUtils.deleteDirectory(folderToDelete);
            }
        } catch (Exception e) {
            System.out.println("Error while deleting unnecessary folders");
        }
    }

    public static void deleteTranslatedFiles() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.fr.md"); // for Chinese use index.zh.md
                if (indexFile.exists()) {
                    if(!indexFile.delete()) {
                        System.out.println("Not Deleted: " + indexFile.getPath());
                    }
                }
            }
        }
    }

    public static void placeAllHyperlinksAtTheEndOfTheFile() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    executePlaceAllHyperlinksAtTheEndOfTheFile(indexFile.getPath());
                }
            }
        }
    }

    public static void executePlaceAllHyperlinksAtTheEndOfTheFile(String filePath) {
        try {
            String markdownText = Utils.readFile(filePath);

            Pattern p = Pattern.compile("(\\[.+?\\])\\((.+?)\\)(\\))?");
            Matcher m = p.matcher(markdownText);
            ArrayList<String> hyperlinks = new ArrayList();
            ArrayList<String> firstParts = new ArrayList();
            ArrayList<String> lastParts = new ArrayList();
            while (m.find()) {
                hyperlinks.add(m.group(0));
                firstParts.add(m.group(1));
                if(m.group(3) == null) {
                    lastParts.add(m.group(2));
                } else {
                    lastParts.add(m.group(2) + m.group(3));
                }

                /*System.out.println(m.group(0));
                System.out.println(m.group(1));
                if(m.group(3) == null) {
                    System.out.println(m.group(2));
                } else {
                    System.out.println(m.group(2) + m.group(3));
                }*/
            }

            for(int i=0; i<hyperlinks.size(); i++) {
                int urlIndex = i+1;
                markdownText = StringUtils.replaceOnce(markdownText, hyperlinks.get(i), firstParts.get(i) + "[" + urlIndex + "]");
            }

            // Append URLs at the end of the file.
            StringBuilder markdownBuilder = new StringBuilder(markdownText);
            markdownBuilder.append("\n\n");
            for(int i=0; i<lastParts.size(); i++) {
                int urlIndex = i+1;
                markdownBuilder.append("[" + urlIndex + "]: " + lastParts.get(i) + "\n");
            }

            overwriteFileContent(filePath, markdownBuilder.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void appendLanguageCodeToSeeAlsoBlogURLs() {
        File folder = new File(CONTENT_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        String[] languageFileNames = {"index.de.md", "index.es.md", "index.fr.md", "index.it.md", "index.ja.md",
                "index.ko.md", "index.ru.md", "index.zh.md", "index.pt.md" };
        String[] languageCodes = {"de", "es", "fr", "it", "ja", "ko", "ru", "zh", "pt" };

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                for(int i=0; i<languageFileNames.length; i++) {
                    File indexFile = new File(listOfFolder, languageFileNames[i]);
                    if (indexFile.exists()) {
                        executeAppendLanguageCodeToSeeAlsoBlogURLs(indexFile.getPath(), languageCodes[i]);
                    }
                }
            }
        }
    }

    public static void executeAppendLanguageCodeToSeeAlsoBlogURLs(String filePath, String languageCode) {
        try {
            String markdownText = Utils.readFile(filePath);

            markdownText = markdownText.replace("https://blog.aspose.com/" + languageCode + "/", "https://blog.aspose.com/");
            markdownText = markdownText.replace("https://blog.aspose.com/", "https://blog.aspose.com/" + languageCode + "/");

            overwriteFileContent(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}