import java.io.File;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) {
        String targetLanguageName = "zh"; // zh for chinese
        translateBlogPosts(targetLanguageName);
    }

    public static void translateBlogPosts(String targetLanguage) {
        // For Windows
        File folder = new File("E:\\ParseAndTranslateMarkdownFiles\\ParseAndTranslateMarkdownFiles\\content");
        // For Mac
        //File folder = new File("content/");

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
