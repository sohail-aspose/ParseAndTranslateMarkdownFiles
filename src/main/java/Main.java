import java.io.File;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) {
        String targetLanguageName = "fr"; // zh for chinese
        translateBlogPosts(targetLanguageName);
    }

    public static void translateBlogPosts(String targetLanguage) {
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
