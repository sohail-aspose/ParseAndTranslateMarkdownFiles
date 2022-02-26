import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Utils.*;

public class BlogPostParsing {

    static String targetLanguage = "";

    public static void translateABlogPost(String filePath, String targetLang) {
        try {
            targetLanguage = targetLang;

            String markdownText = Utils.readFile(filePath);
            // Find paragraphs
            Pattern p = Pattern.compile("(.+?)\n");
            Matcher m = p.matcher(markdownText);

            ArrayList<String> contentList = new ArrayList<>();
            while (m.find()) {
                contentList.add(m.group(0));
            }

            boolean isCodeSample = false;
            for(String textString : contentList) {
                if(textString.startsWith("```")) {
                    isCodeSample = !isCodeSample;
                    continue;
                } else if(isCodeSample) {
                    continue;
                } else if(textString.startsWith("---") || textString.startsWith("author: ") ||
                    textString.startsWith("date: ") || textString.startsWith("categories:") ||
                        textString.startsWith("tags:")) {
                    continue;
                } else if(textString.startsWith("title: ")) {
                    markdownText = translateTitle(textString, markdownText);
                } else if(textString.startsWith("summary: ")) {
                    markdownText = translateSummary(textString, markdownText);
                } else if(textString.startsWith("url: ")) {
                    markdownText = translateURL(textString, markdownText);
                } else if(textString.startsWith("  -")) {
                    markdownText = translateCategoryOrTag(textString, markdownText);
                } else if(textString.startsWith("{{< figure")) {
                    markdownText = translateAltAndCaptionTextOfAFigure(textString, markdownText);
                } else if(textString.startsWith("{{< gist")) {
                    markdownText = translateGist(textString, markdownText);
                } else if(textString.startsWith("## ")) {
                    markdownText = translateHeading(textString, markdownText);
                } else if(isAHyperlinkAtEndOfABlogPost(textString)) {
                    continue;
                } else if(isBulletPoint(textString)) {
                    markdownText = translateBulletPoint(textString, markdownText);
                } else if(isOrderListItem(textString)) {
                    markdownText = translateOrderListItem(textString, markdownText);
                } else if(isEmptyLine(textString)) {
                    continue;
                } else {
                    markdownText = translateContent(textString, markdownText);
                }
            }
            saveTranslatedBlogPost(filePath, markdownText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String translateTitle(String textString, String markdownText) {
        Pattern p = Pattern.compile("title: (.+?)\n");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String textToTranslate = m.group(1);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(matchedString, "title: \"" + translatedString + "\"\n");
        }
        return markdownText;
    }

    static String translateSummary(String textString, String markdownText) {
        Pattern p = Pattern.compile("summary: ['|\"](.+?)['|\"]");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String textToTranslate = m.group(1);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(matchedString, "summary: \"" + translatedString + "\"");
        }
        return markdownText;
    }

    static String translateURL(String textString, String markdownText) {
        Pattern p = Pattern.compile("url: (.+?)(\n)");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String textToTranslate = m.group(1);
            String endingMatchedString = m.group(2);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(matchedString, "url: /" + targetLanguage + translatedString + endingMatchedString);
        }
        return markdownText;
    }

    static String translateCategoryOrTag(String textString, String markdownText) {
        Pattern p = Pattern.compile(" {2}- ['|\"]?([A-Za-z0-9]+[.][A-Za-z0-9]+) (.+?)['|\"]?\n");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String categoryName = m.group(1);
            String textToTranslate = m.group(2);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);
            // Remove \n as last character from matchedString.
            matchedString = matchedString.substring(0, matchedString.length()-1);

            markdownText = markdownText.replace(matchedString, "  - \"" + categoryName + " " + translatedString + "\"");
        } else {
            // Look for tags
            p = Pattern.compile(" {2}- ['|\"]?(.+?)['|\"]?\n");
            m = p.matcher(textString);

            if (m.find()) {
                String matchedString = m.group(0);
                String textToTranslate = m.group(1);

                String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);
                // Remove \n as last character from matchedString.
                matchedString = matchedString.substring(0, matchedString.length()-1);

                markdownText = markdownText.replace(matchedString, "  - \"" + translatedString + "\"");
            }
        }
        return markdownText;
    }

    static String translateAltAndCaptionTextOfAFigure(String textString, String markdownText) {
        Pattern p = Pattern.compile("alt=\"(.+?)\"");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String textToTranslate = m.group(1);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(matchedString, "alt=\"" + translatedString + "\"");
        }

        // Translate Caption
        p = Pattern.compile("caption=\"(.+?)\"");
        m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String textToTranslate = m.group(1);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(matchedString, "caption=\"" + translatedString + "\"");
        }

        return markdownText;
    }

    static String translateGist(String textString, String markdownText) {
        // Get Gist content, translate comments and insert code sample in the blog post.
        markdownText = GistsTranslation.translateGistsOfABlogPost(textString, markdownText, targetLanguage);
        return markdownText;

    }

    static String translateHeading(String textString, String markdownText) {
        // Ref: https://stackoverflow.com/questions/9801630/what-is-the-difference-between-square-brackets-and-parentheses-in-a-regex
        Pattern p = Pattern.compile("## (.+?)( \\{|\n)");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            String matchedString = m.group(0);
            String textToTranslate = m.group(1);
            String endingMatchedString = m.group(2);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(matchedString, "## " + translatedString + endingMatchedString);
        }
        return markdownText;
    }

    static boolean isAHyperlinkAtEndOfABlogPost(String textString) {
        Pattern p = Pattern.compile(" \\[\\d{1,3}]: ");
        Matcher m = p.matcher(textString);
        return m.find();
    }

    static boolean isBulletPoint(String textString) {
        Pattern p = Pattern.compile(" +\\* (.+?)\n");
        Matcher m = p.matcher(textString);

        return m.find();
    }

    static String translateBulletPoint(String textString, String markdownText) {
        Pattern p = Pattern.compile(" +(\\* \\[(.+?)])");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            //String matchedString = m.group(0);
            String textToReplace = m.group(1);
            String textToTranslate = m.group(2);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(textToReplace, "* [" + translatedString + "]");
        } else {
            p = Pattern.compile(" +(\\* (.+?))\n");
            m = p.matcher(textString);

            if (m.find()) {
                //String matchedString = m.group(0);
                String textToReplace = m.group(1);
                String textToTranslate = m.group(2);

                String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

                markdownText = markdownText.replace(textToReplace, "* " + translatedString);
            }
        }
        return markdownText;
    }

    static boolean isOrderListItem(String textString) {
        Pattern p = Pattern.compile(" *[\\d{1,3}]\\. (.+?)\n");
        Matcher m = p.matcher(textString);

        return m.find();
    }

    static String translateOrderListItem(String textString, String markdownText) {
        Pattern p = Pattern.compile(" *(([\\d{1,3}])\\. (.+?))\n");
        Matcher m = p.matcher(textString);

        if (m.find()) {
            //String matchedString = m.group(0);
            String textToReplace = m.group(1);
            String digitNumber = m.group(2);
            String textToTranslate = m.group(3);

            String translatedString = GoogleTranslationAPI.translateString(textToTranslate, targetLanguage);

            markdownText = markdownText.replace(textToReplace, digitNumber + ". " + translatedString);
        }
        return markdownText;
    }

    static boolean isEmptyLine(String textString) {
        Pattern p = Pattern.compile("^[ ]*[\\t]*\n");
        Matcher m = p.matcher(textString);
        return m.find();
    }

    static String translateContent(String textString, String markdownText) {
        String translatedString = GoogleTranslationAPI.translateString(textString, targetLanguage);
        return markdownText.replace(textString, translatedString + "\n");
    }

    static void saveTranslatedBlogPost(String filePath, String markdownText) {
        // Create a new file and write content to it.
        String newFilePath = filePath.substring(0, filePath.length()-2);
        newFilePath = newFilePath + targetLanguage + ".md";
        try {
            PrintWriter prw = new PrintWriter(newFilePath);
            prw.println(markdownText);
            prw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Successfully Translated: "+ filePath);
    }
}
