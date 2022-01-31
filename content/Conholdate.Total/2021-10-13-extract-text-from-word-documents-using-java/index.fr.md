---
title: Extract Text from Word Documents using Java
author: Muzammil Khan
date: 2021-10-13T03:52:00+00:00
summary: "En tant que développeur Java, vous pouvez facilement extraire du texte de vos fichiers Word (DOC ou DOCX) par programmation. Dans cet article, vous apprendrez <strong>à extraire du texte de documents Word à l'aide de Java</strong> ."
url: /2021/10/13/extraire-texte-des-documents-word-en-utilisant-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Extraction de texte de document"
  - "Extraire du texte formaté à l'aide de Java"
  - "Extraire le texte"
  - "Extraire le texte" from DOCX
  - "Extraire le texte" from Word
  - "Extraction de texte"
  - "Extraction de texte" API
  - "API d'extraction de texte pour Java"

---


{{< figure align=center src="images/Extract-Text-from-Word-using-Java.jpg" alt="Extraire du texte de documents Word à l'aide de Java">}}
 

Dans certains cas, vous devrez peut-être extraire du texte de vos documents Word à diverses fins. En tant que développeur Java, vous pouvez facilement extraire du texte de fichiers [DOC][2] ou [DOCX][3] par programmation. Dans cet article, vous apprendrez **comment extraire du texte de documents Word à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour extraire du texte de documents Word][4]
  * [Extraire du texte de documents Word à l'aide de Java][5]
  * [Extraire le texte de pages spécifiques d'un document Word à l'aide de Java][6]
  * [Obtenir la surbrillance à partir de documents Word à l'aide de Java][7]
  * [Extraire le texte formaté de DOCX à l'aide de Java][8]
  * [Extraire le texte par table des matières à l'aide de Java][9]

## API Java pour extraire du texte de documents Word {#Java-API-to-Extract-Text-from-Word-Documents}

Pour extraire le texte des fichiers DOC ou DOCX, nous utiliserons l'API [GroupDocs.Parser for Java][10]. Il permet d'extraire du texte, des métadonnées et des images à partir des formats de fichiers populaires de [Word][11], [PDF][12], [Excel][13] et [PowerPoint][14]. Il prend également en charge l'extraction de texte brut, formaté et structuré à partir des fichiers de [formats pris en charge] [15].
Vous pouvez [télécharger][16] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>https://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-parser</artifactId><version>21.2</version></dépendance></pre>
## Extraire du texte de documents Word à l'aide de Java {#Extract-Text-from-Word-Documents-using-Java}

Vous pouvez analyser n'importe quel document Word et extraire du texte en suivant les étapes simples mentionnées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Parser][17].
  * Ensuite, appelez la _[Parser.getText()][18] _method pour extraire le texte du document chargé.
  * Obtenez les résultats de la _[Parser.getText()][18] _method dans l'objet _[TextReader][19] _class.
  * Enfin, appelez la <span><a style="font-style: italic" href="https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/TextReader#readToEnd()">méthode TextReader.readToEnd()</a></span> _ _ pour lire tous les caractères de la position actuelle à la fin du lecteur de texte et les renvoyer sous la forme d'une chaîne.

L'exemple de code suivant montre comment extraire du texte d'un fichier DOCX à l'aide de Java.
```
// Créer une instance de la classe Parser
Parser parser = new Parser("C:\\Files\\sample.docx");

// Extraire un texte brut dans le lecteur
try (TextReader reader = parser.getText()) {
    // Print a text from the document
    // If text extraction isn't supported, a reader is null
    System.out.println(reader == null ? "Text extraction isn't supported" : reader.readToEnd());
}
```

{{< figure align=center src="images/Extract-Text-from-Word-Documents-using-Java-1024x457.jpg" alt="Extraire du texte de documents Word à l'aide de Java" caption="Extraire du texte de documents Word à l'aide de Java">}}
 

## Extraire le texte de pages spécifiques d'un document Word à l'aide de Java {#Extract-Text-from-Specific-Pages-of-a-Document-using-Java}

Vous pouvez analyser un document Word et extraire le texte d'une page spécifique en suivant les étapes simples mentionnées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Parser][17].
  * Ensuite, utilisez [Parser.getFeatures().isText()][21] pour vérifier si le document prend en charge la fonctionnalité d'extraction de texte. En savoir plus sur les [fonctionnalités prises en charge][22].
  * Maintenant, appelez la méthode _[Parser.getDocumentInfo()][23]_ pour obtenir les informations générales sur le document. Tels que le type de fichier, le nombre de pages, la taille, etc.
  * Obtenez les résultats de la méthode _[Parser.getDocumentInfo()][23]_ dans l'objet d'interface [IDocumentInfo][24].
  * Ensuite, vérifiez si _[IDocumentInfo.getPageCount()][25]_ n'est pas nul. Cette méthode renvoie le nombre total de pages du document.
  * Itérez sur toutes les pages et appelez la méthode [Parser.getText()][26] pour chaque index de page pour extraire le texte et obtenir des résultats dans l'objet de classe [TextReader][19].
  * Enfin, affichez les résultats en appelant la méthode [TextReader.readToEnd()][27] pour lire le texte extrait.

L'exemple de code suivant montre comment extraire le texte des pages une par une à l'aide de Java.
```
// Créer une instance de la classe Parser
Parser parser = new Parser("C:\\Files\\sample.docx");

// Vérifiez si le document prend en charge l'extraction de texte
if (!parser.getFeatures().isText()) {
    System.out.println("The document doesn't support text extraction.");
    return;
}

// Obtenir les informations sur le document
IDocumentInfo documentInfo = parser.getDocumentInfo();

// Vérifiez si le document contient des pages
if (documentInfo.getPageCount() == 0) {
    System.out.println("The document has zero pages.");
    return;
}

// Itérer sur les pages
for (int p = 0; p < documentInfo.getPageCount(); p++) {
    // Print a page number
    System.out.println(String.format("Page number: %d/%d", p + 1, documentInfo.getPageCount()));
    // Extract a text into the reader
    try (TextReader reader = parser.getText(p)) {
        // Print a text from the document
        // We ignore null-checking as we have checked text extraction feature support earlier
        System.out.println(reader.readToEnd());
    }
}
```

{{< figure align=center src="images/Get-Text-from-Pages-using-Java-1-1024x710.jpg" alt="Extraire le texte de pages spécifiques d'un document à l'aide de Java" caption="Extraire le texte de pages spécifiques d'un document à l'aide de Java">}}
 

## Obtenir la surbrillance à partir de documents Word à l'aide de Java {#Get-Highlight-from-Documents-using-Java}

Une surbrillance est une partie du texte qui est généralement utilisée pour expliquer le contexte du texte trouvé dans la fonctionnalité de recherche. Vous pouvez extraire un surlignage d'un document en suivant les étapes simples mentionnées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Parser][17].
  * Créez une instance de l'objet de classe [HighlightOptions][29] et transmettez la longueur maximale comme paramètre d'entrée à son constructeur pour extraire une surbrillance de longueur fixe.
  * Ensuite, appelez la méthode [Parser.getHighlight()][30] avec la position de départ et l'objet de classe [HighlightOptions][29] pour extraire une surbrillance du document en tant qu'objet de la classe [HighlightItem][31].
  * Enfin, appelez les méthodes [Highlight.getPosition()][32] et [HighlightItem.getText()][33] pour obtenir la position et le texte de la surbrillance.

L'exemple de code suivant montre comment extraire une surbrillance d'un document à l'aide de Java.
```
// Créer une instance de la classe Parser
try (Parser parser = new Parser("C:\\Files\\sample.docx")) {
    // Extract a highlight:
    HighlightItem hl = parser.getHighlight(0, true, new HighlightOptions(8));
    // Check if highlight extraction is supported
    if (hl == null) {
        System.out.println("Highlight extraction isn't supported");
        return;
    }
    // Print an extracted highlight
    System.out.println(String.format("At %d: %s", hl.getPosition(), hl.getText()));
}
```

<pre class="wp-block-code"><code>At 0: Overview</code></pre>
## Extraire le texte formaté de DOCX à l'aide de Java {#Extract-Formatted-Text-from-DOCX-using-Java}

Vous pouvez analyser des documents Word et extraire du texte sans perdre la mise en forme du style en suivant les étapes simples mentionnées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Parser][17].
  * Définissez les _[FormattedTextOptions][34]_ et définissez le _[FormattedTextMode][35]_ sur HTML. Il vous permet d'extraire un texte au format HTML du document.
  * Ensuite, appelez la méthode [Parser.getFormattedText()][26] pour extraire le texte formaté.
  * Obtenez les résultats de la _[Parser.getText()][18] _method dans l'objet _[TextReader][19] _class.
  * Enfin, appelez la méthode [TextReader.readToEnd()][27] pour lire tout le texte.

L'exemple de code suivant montre comment extraire du texte formaté d'un fichier DOCX à l'aide de Java.
```
// Créer une instance de la classe Parser
try (Parser parser = new Parser("C:\\Files\\sample.docx")) {
    // Extract a formatted text into the reader
    try (TextReader reader = parser.getFormattedText(new FormattedTextOptions(FormattedTextMode.Html))) {
        // Print a formatted text from the document
        // If formatted text extraction isn't supported, a reader is null
        System.out.println(reader == null ? "Formatted text extraction isn't suppported" : reader.readToEnd());
    }
}
```

{{< figure align=center src="images/Extract-Formatted-Text-from-DOCX-using-Java-1024x365.jpg" alt="Extraire le texte formaté de DOCX à l'aide de Java" caption="Extraire le texte formaté de DOCX à l'aide de Java">}}
 

## Extraire le texte par table des matières à l'aide de Java {#Extract-Text-by-Table-of-Contents-using-Java}

Vous pouvez extraire du texte du document par la table des matières en suivant les étapes simples mentionnées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Parser][17].
  * Ensuite, appelez la méthode [Parser.getToc()][37] pour extraire une table des matières sous la forme d'une collection d'objets de classe [TocItem][38]. Le [TocItem][38] représente l'élément qui est utilisé dans la fonctionnalité d'extraction de la table des matières.
  * Maintenant, vérifiez si la collection n'est pas _null_.
  * Ensuite, parcourez la collection de TocItem et appelez la méthode [TocItem.extractText()][39] pour extraire le texte du document auquel l'objet [TocItem][38] fait référence.
  * Obtenez les résultats dans l'objet de classe [TextReader][19].
  * Enfin, appelez la méthode [TextReader.readToEnd()][27] pour lire tout le texte.

L'exemple de code suivant montre comment extraire du texte par table des matières à partir de documents Word à l'aide de Java.
```
// Créer une instance de la classe Parser
try (Parser parser = new Parser("C:\\Files\\sampleTOC.docx")) {
    // Get table of contents
    Iterable<TocItem> tocItems = parser.getToc();
    // Check if toc extraction is supported
    if (tocItems == null) {
        System.out.println("Table of contents extraction isn't supported");
    }
    else
    {
        // Iterate over items
        for (TocItem tocItem : tocItems) {
            // Print the text of the chapter
            try (TextReader reader = tocItem.extractText()) {
                System.out.println("----");
                System.out.println(reader.readToEnd());
            }
        }
    }
}
```

{{< figure align=center src="images/Extract-Text-by-Table-of-Contents-using-Java-1024x457.jpg" alt="Extraire le texte par table des matières à l'aide de Java" caption="Extraire le texte par table des matières à l'aide de Java">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][41].
## Conclusion

Dans cet article, vous avez appris **comment extraire du texte de documents Word à l'aide de Java**. De plus, vous avez vu **comment extraire du texte formaté d'un fichier DOCX** par programmation. Cet article a également expliqué ** comment extraire du texte par la table des matières ** et extraire un surlignage d'un document. En outre, vous pouvez en savoir plus sur l'API GroupDocs.Parser pour Java en utilisant la [documentation][42]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][43].
## See Also

  * [Extraire des données de factures ou de reçus en Java][44]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Extract-Text-from-Word-using-Java.jpg
 [2]: https://docs.fileformat.com/word-processing/doc/
 [3]: https://docs.fileformat.com/word-processing/docx/
 [4]: #Java-API-to-Extract-Text-from-Word-Documents
 [5]: #Extract-Text-from-Word-Documents-using-Java
 [6]: #Extract-Text-from-Specific-Pages-of-a-Document-using-Java
 [7]: #Get-Highlight-from-Documents-using-Java
 [8]: #Extract-Formatted-Text-from-DOCX-using-Java
 [9]: #Extract-Text-by-Table-of-Contents-using-Java
 [10]: https://products.groupdocs.com/parser/net
 [11]: https://docs.fileformat.com/word-processing/
 [12]: https://docs.fileformat.com/pdf/
 [13]: https://docs.fileformat.com/spreadsheet/
 [14]: https://docs.fileformat.com/presentation/
 [15]: https://docs.groupdocs.com/parser/java/supported-document-formats/
 [16]: https://downloads.groupdocs.com/parser/java
 [17]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser/Parser
 [18]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser/Parser#getText()
 [19]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/TextReader
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Extract-Text-from-Word-Documents-using-Java.jpg
 [21]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.options/Features#isText()
 [22]: https://docs.groupdocs.com/parser/java/get-supported-features/
 [23]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser/Parser#getDocumentInfo()
 [24]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.options/IDocumentInfo
 [25]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.options/IDocumentInfo#getPageCount()
 [26]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser/Parser#getFormattedText(com.groupdocs.parser.options.FormattedTextOptions)
 [27]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/TextReader#readToEnd()
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Get-Text-from-Pages-using-Java-1.jpg
 [29]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.options/HighlightOptions
 [30]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser/Parser#getHighlight(int,%20boolean,%20com.groupdocs.parser.options.HighlightOptions)
 [31]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/HighlightItem
 [32]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/HighlightItem#getPosition()
 [33]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/HighlightItem#getText()
 [34]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.options/FormattedTextOptions
 [35]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.options/FormattedTextMode
 [36]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Extract-Formatted-Text-from-DOCX-using-Java.jpg
 [37]: https://apireference.groupdocs.com/java/parser/com.groupdocs.parser/Parser#getToc()
 [38]: https://apireference.groupdocs.com/java/parser/com.groupdocs.parser.data/TocItem
 [39]: https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/TocItem#extractText()
 [40]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Extract-Text-by-Table-of-Contents-using-Java.jpg
 [41]: https://purchase.groupdocs.com/temporary-license
 [42]: https://docs.groupdocs.com/parser/java/
 [43]: https://forum.groupdocs.com/c/parser/
 [44]: https://blog.groupdocs.com/2021/01/22/extract-data-from-invoices-or-receipts-in-java/





