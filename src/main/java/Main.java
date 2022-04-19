import java.io.File;
import java.io.FilenameFilter;

public class Main {
    
    // ToDo:
    // 1. Move all hyperlinks at the end of the file.
    // 2. If six (`) are appearing like `````` replace them with ```\n```
    // 3. If thee (`) are appearing along with gist like >}}```, replace them with >}}\n\n```.
    public static void main(String[] args) {
        //FixIssuesInExportedContent.fixIssuesInExportedContent();
        String targetLanguageName = "zh"; // fr for French and zh for Chinese
        translateBlogPosts(targetLanguageName);
    }

    public static void translateBlogPosts(String targetLanguage) {
        // For Windows
        //File folder = new File("E:\\ParseAndTranslateMarkdownFiles\\ParseAndTranslateMarkdownFiles\\content");
        // For Mac
        File folder = new File("content/");

        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return !fileName.equals("_index.md");
            }
        });

        for (File listOfFolder : listOfFiles) {
            if (listOfFolder.isDirectory()) {
                File indexFile = new File(listOfFolder, "index.md");
                if (indexFile.exists()) {
                    BlogPostParsing.translateABlogPost(indexFile.getPath(), targetLanguage);
                }
            }
        }
    }
}
