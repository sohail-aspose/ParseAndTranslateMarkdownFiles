---
title: MS Word Automation – Create, Edit, or Convert Word Documents using Java
author: Muzammil Khan
date: 2021-12-01T06:16:36+00:00
summary: "En tant que développeur Java, vous pouvez automatiser Word pour créer de nouveaux documents Word, éditer ou modifier ceux qui existent déjà, ou les convertir dans d'autres formats sans utiliser Microsoft Office. Dans cet article, nous allons apprendre <strong>à automatiser MS Word pour créer, modifier ou convertir des documents Word à l'aide de Java</strong> ."
url: /2021/12/01/ms-word-automation-create-edit-or-convert-word-documents-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Convertir Word en PDF en utilisant Java"
  - "Créer des documents Word en Java"
  - "Modifier DOCX à l'aide de Java"
  - "Modifier des documents Word à l'aide de Java"
  - "Automatisation des mots Java"
  - "Analyser des documents Word en Java"

---


{{< figure align=center src="images/automate-word-to-create-edit-or-convert-word-documents-using-java.jpg" alt="Microsoft Word Automation - Créer, modifier ou convertir des documents Word à l'aide de Java">}}
 

L'automatisation de Word vous permet de créer de nouveaux documents Word, d'éditer ou de modifier ceux qui existent déjà, ou de les convertir dans d'autres formats sans utiliser Microsoft Office. Toutes les actions que nous pouvons effectuer via l'interface utilisateur de MS Word peuvent également être effectuées par programme en utilisant Automation. Dans cet article, nous allons apprendre **comment automatiser MS Word pour créer, modifier ou convertir des documents Word à l'aide de Java**.
Les sujets suivants seront traités dans cet article :
  * [API Java Word Automation pour créer, modifier ou convertir des documents Word][2]
  * [Créer des documents Word à l'aide de Java][3]
  * [Éditer ou modifier des documents Word à l'aide de Java][4]
  * [Rechercher et remplacer du texte dans des documents Word à l'aide de Java][5]
  * [Convertir des documents Word à l'aide de Java][6]
  * [Analyser des documents Word à l'aide de Java][7]

## API Java Word Automation pour créer, modifier ou convertir des documents Word {#Java-Word-Automation-API}

Pour automatiser Word, nous utiliserons l'API [Aspose.Words for Java][8]. Il s'agit d'une solution d'automatisation Word complète et riche en fonctionnalités pour créer, modifier ou analyser des documents Word par programme. Veuillez soit [télécharger][9] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans une application Java basée sur Maven.
<pre class="wp-block-code"><code><repository><id>AsposeJavaAPI</id><name>API Java Aspose</name><url>https://repository.aspose.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.aspose</groupId><artifactId>mots asposés</artifactId><version>21.11</version><type>pom</type></dépendance></pre>
## Créer des documents Word à l'aide de Java {#Create-Word-Documents-using-Java}

Nous pouvons créer des documents Word par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, créez une instance de la classe **_[Document][10]_**. Cette classe représente un document Word.
  * Ensuite, créez une instance de la classe **_[DocumentBuilder][11]_** avec l'objet **_Document_** comme argument. Cette classe fournit des méthodes pour insérer du texte, des images et d'autres contenus, spécifier la mise en forme de la police, des paragraphes et des sections.
  * Ensuite, insérez/écrivez des éléments pour ajouter du texte, des paragraphes, un tableau ou une image à l'aide de l'objet **_DocumentBuilder_**.
  * Enfin, appelez la méthode **_[Document.save()][12]_** avec le chemin du fichier de sortie pour enregistrer le fichier créé.

L'exemple de code suivant montre **comment créer un document Word (DOCX) à l'aide de Java**.
```
// Ouvrez le document.
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Définir la police pour les éléments suivants
Font font = builder.getFont();
font.setSize(25);
font.setBold(true);
font.setColor(Color.BLACK);
font.setName("Arial");

// Insérer du texte
builder.writeln("Welcome!");

// Définir la police pour les éléments suivants
font.setSize(12);
font.setBold(false);

// Insérer un paragraphe
builder.writeln("Aspose.Words for Java is a class library that enables your applications to perform a great range of document processing tasks.\r\n"
    + "\r\n"
    + "Aspose.Words supports most of the popular document formats such as DOC, DOCX, RTF, HTML, Markdown, PDF, XPS, EPUB, and others.\r\n"
    + "\r\n"
    + "With Aspose.Words for Java, you can generate, modify, convert, render, and print documents without third-party applications or Office Automation.");
builder.writeln();

font.setBold(true);
builder.writeln("This is a sample table");

font.setBold(false);
// Insérer un tableau
Table table = builder.startTable();
builder.insertCell();
table.autoFit(AutoFitBehavior.AUTO_FIT_TO_CONTENTS);

builder.getCellFormat().setVerticalAlignment(CellVerticalAlignment.CENTER);

builder.write("This is row 1 cell 1");
builder.insertCell();
builder.write("This is row 1 cell 2");
builder.endRow();
builder.insertCell();
builder.write("This is row 2 cell 1");
builder.insertCell();
builder.write("This is row 2 cell 2");
builder.endRow();
builder.endTable();
builder.writeln();

// Insérer une image
builder.insertImage("C:\\Files\\Words\\words_java.jpg");

// Insérer un saut de page 
builder.insertBreak(BreakType.PAGE_BREAK);             
// tous les éléments après le saut de page seront insérés à la page suivante.

// Enregistrer le document
doc.save("C:\\Files\\Words\\document.docx");
```

{{< figure align=center src="images/Create-Word-Documents-using-Java.png" alt="Créer des documents Word à l'aide de Java" caption="Créez des documents Word à l'aide de Java.">}}
 

## Éditer ou modifier des documents Word à l'aide de Java {#Edit-or-Modify-Word-Documents-using-Java}

Dans la section précédente, nous avons créé un document Word. Maintenant, éditons-le et changeons le contenu du document. Nous pouvons éditer des documents Word par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, chargez un document Word en utilisant la classe **_[Document][10]_** avec le chemin du fichier d'entrée comme argument.
  * Ensuite, accédez à la section spécifique par son index.
  * Ensuite, accédez au contenu du premier paragraphe en tant qu'objet de la classe **_[Run][14]_**. La classe **_Run_** représente une série de caractères avec le même formatage de police. Tout le texte du document est stocké dans des séquences de texte.
  * Après cela, définissez le texte à mettre à jour pour le paragraphe consulté.
  * Enfin, appelez la méthode **_[Document.save()][12]_** avec le chemin du fichier de sortie pour enregistrer le fichier mis à jour.

L'exemple de code suivant montre **comment modifier un document Word (DOCX) à l'aide de Java**.
```
// Charger le document
Document doc = new Document("C:\\Files\\Words\\document.docx");

// Accéder au paragraphe
Run paragraph = doc.getSections().get(0).getBody().getFirstParagraph().getRuns().get(0);
paragraph.setText("This is updated text");  

// Enregistrer le document
doc.save("C:\\Files\\Words\\Document_updated.docx");
```

{{< figure align=center src="images/Edit-or-Modify-Word-Documents-using-Java.jpg" alt="Éditer ou modifier des documents Word à l'aide de Java" caption="Modifier ou modifier des documents Word à l'aide de Java.">}}
 

## Rechercher et remplacer du texte dans des documents Word à l'aide de Java {#Find-and-Replace-Text-in-Word-Documents-using-Java}

Nous pouvons également mettre à jour le contenu des documents Word en utilisant le mécanisme de recherche et de remplacement de l'API. Nous pouvons le faire par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, chargez un document Word en utilisant la classe **_[Document][10]_** avec le chemin du fichier d'entrée comme argument.
  * Ensuite, créez une instance de la classe **_[FindReplaceOptions][16]_**.
  * Ensuite, appelez la méthode [**_replace()_**][17] avec la chaîne de recherche, la chaîne de remplacement et l'objet **_FindReplaceOptions_** comme arguments. Cette méthode doit remplacer chaque occurrence de la chaîne de recherche par la chaîne de remplacement.
  * Enfin, appelez la méthode **_[Document.save()][12]_** avec le chemin du fichier de sortie pour enregistrer le fichier mis à jour.

L'exemple de code suivant montre **comment rechercher et remplacer un texte spécifique dans un document Word (DOCX) à l'aide de Java**.
```
// Charger le document
Document doc = new Document("C:\\Files\\Words\\document.docx");

// Mettre à jour en utilisant rechercher et remplacer
// Spécifiez la chaîne de recherche et la chaîne de remplacement à l'aide de la méthode Replace.
doc.getRange().replace("Aspose.Words", "Hello", new FindReplaceOptions());

// Enregistrer le document
doc.save("C:\\Files\\Words\\Document_updated.docx");
```

{{< figure align=center src="images/Find-and-Replace-Text-in-Word-Documents-using-Java-1024x457.jpg" alt="Rechercher et remplacer du texte dans des documents Word à l'aide de Java" caption="Rechercher et remplacer du texte dans des documents Word à l'aide de Java">}}
 

## Convertir des documents Word à l'aide de Java {#Convert-Word-Documents-using-Java}

Nous pouvons convertir des documents Word vers d'autres formats tels que PDF, XPS, EPUB, HTML, JPG, PNG, etc. par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, chargez un document Word en utilisant la classe **_[Document][10]_** avec le chemin du fichier d'entrée comme argument.
  * Ensuite, créez une instance de la classe **_[PdfSaveOptions][19]_** avec l'objet **_Document_** comme argument. Cette classe fournit des options supplémentaires lors de l'enregistrement d'un document au format PDF.
  * Ensuite, spécifiez le niveau de conformité aux normes PDF pour le document de sortie en définissant _**[PdfSaveOptions.Compliance][20]**_ sur **_[PdfCompliance.PDF_17][21]_**.
  * Enfin, appelez la méthode **_[Document.save()][12]_** avec le chemin du fichier de sortie et l'objet **_PdfSaveOptions_** comme argument pour enregistrer le fichier PDF.

L'exemple de code suivant montre **comment convertir un document Word (DOCX) en PDF à l'aide de Java**.
```
// Charger le document
Document doc = new Document("C:\\Files\\Words\\document.docx");

// Fournir la conformité PDFSaveOption à PDF17
PdfSaveOptions options = new PdfSaveOptions();
options.setCompliance(PdfCompliance.PDF_17);

// Convertir Word en PDF
doc.save("C:\\Files\\Words\\output.pdf", options);
```

{{< figure align=center src="images/Convert-Word-Documents-using-Java.jpg" alt="Convertir des documents Word en PDF." caption="Convertir des documents Word à l'aide de Java">}}
 

## Analyser des documents Word à l'aide de Java {#Parse-Word-Documents-using-Java}

Nous pouvons analyser des documents Word et extraire le contenu sous forme de texte brut par programme en suivant les étapes ci-dessous :
  * Chargez un document Word en utilisant la classe **_[Document][10]_** avec le chemin du fichier d'entrée comme argument.
  * Appelez la méthode **_[Document.save()][12]_** pour enregistrer le document Word en tant que fichier texte. Cette méthode prend le chemin du fichier de sortie comme argument.

L'exemple de code suivant montre **comment analyser un document Word (DOCX) à l'aide de Java**.
```
// Chargez le document à partir du disque.
Document doc = new Document("C:\\Files\\Words\\document.docx");

// Enregistrer en texte brut 
doc.save("C:\\Files\\Words\\output.txt");
```

{{< figure align=center src="images/Parse-Word-Documents-using-Java-1024x554.jpg" alt="Extraire du texte de documents Word." caption="Analyser des documents Word à l'aide de Java.">}}
 

## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][24].
## Conclusion

Dans cet article, nous avons appris **comment automatiser Word pour créer, modifier ou convertir des documents Word à l'aide de Java**. Nous avons également vu **comment rechercher et remplacer du texte dans des documents Word** par programmation. En outre, vous pouvez en savoir plus sur l'API Aspose.Words pour Java en utilisant la [documentation][25]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][26].
## See Also

  * [Extraire du texte de documents Word à l'aide de Java][27]
  * [Fusionner des documents Word à l'aide de Java][28]
  * [Modifier des documents Word à l'aide de Java][29]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/automate-word-to-create-edit-or-convert-word-documents-using-java.jpg
 [2]: #Java-Word-Automation-API
 [3]: #Create-Word-Documents-using-Java
 [4]: #Edit-or-Modify-Word-Documents-using-Java
 [5]: #Find-and-Replace-Text-in-Word-Documents-using-Java
 [6]: #Convert-Word-Documents-using-Java
 [7]: #Parse-Word-Documents-using-Java
 [8]: https://products.aspose.com/words/java/
 [9]: https://downloads.aspose.com/words/java
 [10]: https://apireference.aspose.com/words/java/com.aspose.words/Document
 [11]: https://apireference.aspose.com/words/java/com.aspose.words/DocumentBuilder
 [12]: https://apireference.aspose.com/words/java/com.aspose.words/document#save(java.lang.String)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Create-Word-Documents-using-Java.png
 [14]: https://apireference.aspose.com/words/java/com.aspose.words/Run
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Edit-or-Modify-Word-Documents-using-Java.jpg
 [16]: https://apireference.aspose.com/words/java/com.aspose.words/FindReplaceOptions
 [17]: https://apireference.aspose.com/words/java/com.aspose.words/range#replace(java.util.regex.Pattern,java.lang.String,com.aspose.words.FindReplaceOptions)
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Find-and-Replace-Text-in-Word-Documents-using-Java.jpg
 [19]: https://apireference.aspose.com/words/java/com.aspose.words/PdfSaveOptions
 [20]: https://apireference.aspose.com/words/java/com.aspose.words/pdfsaveoptions#Compliance
 [21]: https://apireference.aspose.com/words/java/com.aspose.words/pdfcompliance#PDF_17
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Convert-Word-Documents-using-Java.jpg
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Parse-Word-Documents-using-Java.jpg
 [24]: https://purchase.conholdate.com/temporary-license
 [25]: https://docs.aspose.com/words/java/
 [26]: https://forum.aspose.com/c/words
 [27]: https://blog.conholdate.com/2021/10/13/extract-text-from-word-documents-using-java/
 [28]: https://blog.conholdate.com/2021/06/21/merge-word-documents-using-java/
 [29]: https://blog.conholdate.com/2021/06/07/edit-word-documents-using-java/





