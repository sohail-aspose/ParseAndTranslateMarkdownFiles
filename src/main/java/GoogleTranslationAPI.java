import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.unbescape.html.HtmlEscape;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class GoogleTranslationAPI {


    static String KEY_FILE_PATH = "/Users/muhammadsohailismail/Documents/Aspose/Hugo/rugged-shuttle-339315-77b182de5e7c.json";
    public static ArrayList<String> translateArrayList(ArrayList<String> commentsToTranslate, String targetLanguage) {
        ArrayList<String> translatedComments = new ArrayList<>();

        try {
            Translate translate = TranslateOptions
                    .newBuilder()
                    .setCredentials(
                            ServiceAccountCredentials
                                    .fromStream(new FileInputStream(
                                            KEY_FILE_PATH)))
                    .build().getService();

            List<Translation> translations = translate.translate(commentsToTranslate,
                    Translate.TranslateOption.sourceLanguage("en"),
                    Translate.TranslateOption.targetLanguage(targetLanguage));

            for(Translation aTranslation : translations) {
                // Unescape HTML Code such as &#39;
                String unescapedText = HtmlEscape.unescapeHtml(aTranslation.getTranslatedText());
                translatedComments.add(unescapedText);
            }

            //System.out.printf("Translated Text:\n\t%s\n", translations.get(0).getTranslatedText());
            //System.out.printf("Translated Text:\n\t%s\n", translations.get(1).getTranslatedText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return translatedComments;
    }

    public static String translateString(String textToTranslate, String targetLanguage) {
        if(textToTranslate.trim().isEmpty()) {
            return textToTranslate;
        }

        String translatedText = textToTranslate;

        try {
            Translate translate = TranslateOptions
                    .newBuilder()
                    .setCredentials(
                            ServiceAccountCredentials
                                    .fromStream(new FileInputStream(
                                            KEY_FILE_PATH)))
                    .build().getService();

            Translation translation = translate.translate(textToTranslate,
                    Translate.TranslateOption.sourceLanguage("en"),
                    Translate.TranslateOption.targetLanguage(targetLanguage));


            // Unescape HTML Code such as &#39;
            translatedText = HtmlEscape.unescapeHtml(translation.getTranslatedText());

        } catch (Exception e) {
            System.out.println("Exception while translating content.");
            System.out.println(e.getMessage());
        }
        return translatedText;
    }
}
