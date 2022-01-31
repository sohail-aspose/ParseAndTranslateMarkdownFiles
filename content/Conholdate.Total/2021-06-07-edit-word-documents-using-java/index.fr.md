---
title: Edit Word Documents using Java
author: Muzammil Khan
date: 2021-06-07T10:47:00+00:00
summary: "Vous pouvez facilement éditer des documents Word (DOC, DOCX ou DOTM) par programmation. Dans cet article, vous apprendrez <strong>à modifier des documents Word à l'aide de Java</strong> ."
url: /2021/06/07/edit-word-documents-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Modifier DOCX à l'aide de Java"
  - "Modifier des documents Word à l'aide de Java"
  - "GroupDocs.Editor pour Java"
  - "GroupDocs.Editor Famille de produits"

---


{{< figure align=center src="images/Edit-docx-documents-using-Java.jpg" alt="Modifier Word DOCX à l'aide de Java">}}
 

Vous pouvez facilement modifier par programmation tous les formats de documents de traitement de texte tels que DOC, DOCX ou DOTM. En tant que développeur Java, vous pouvez modifier des documents Word dans vos applications Java. Dans cet article, vous apprendrez **comment modifier des documents Word à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour l'édition de documents Word][2]
  * [Modifier des documents Word à l'aide de Java][3]

## API Java pour l'édition de documents Word {#api-for-editing-word-documents}

Pour éditer les fichiers [DOCX][4], j'utiliserai l'API [GroupDocs.Editor for Java][5]. Il vous permet de modifier par programmation des documents de traitement de texte, des feuilles Excel ou des documents d'autres formats pris en charge. L'API vous permet de charger des documents et de les convertir en HTML. Il fournit du HTML à l'interface utilisateur externe pour l'édition, puis enregistre le HTML dans le document d'origine après manipulation.
Vous pouvez [télécharger][6] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans vos applications Java basées sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-editor</artifactId><version>20.11.0</version></dépendance></pre>
## Modifier des documents Word à l'aide de Java {#Edit-DOCX-using-Java}

Vous pouvez facilement modifier des documents Word par programmation en suivant les étapes simples mentionnées ci-dessous :
  * Définir **_[WordProcessingLoadOptions][7]_**
  * Créez une instance de la classe **_[Editor][8]_**
  * Spécifiez le chemin d'accès au fichier DOCX d'entrée
  * Définir **_[WordProcessingEditOptions][9]_**
  * Appelez la méthode **_[edit()][10]_** et obtenez l'objet **_[EditableDocument][11]_**
  * Récupérez le contenu du document et les ressources associées à partir de **_EditableDocument_**
  * Appelez la méthode [_**getEmbeddedHtml()**_][12] pour obtenir le document sous la forme d'une seule chaîne encodée en base64
  * Mettre à jour le contenu en appelant la méthode _**replace()**_
  * Appelez la méthode **_[fromMarkup()][13]_** et créez une nouvelle instance EditableDocument
  * Définir [**_WordProcessingSaveOptions_**][14]
  * Appelez la méthode **_[save()][15]_** et enregistrez le fichier mis à jour
  * Jeter les objets

L'exemple de code suivant montre comment modifier des fichiers DOCX à l'aide de Java.
```
//Fichier d'entrée
String inputFilePath = "C:\\Files\\Sample.docx";

//Charger le document avec les options de chargement
WordProcessingLoadOptions wordLoadOptions = new WordProcessingLoadOptions();
wordLoadOptions.setPassword("some password"); // Password if required
Editor editor = new Editor(inputFilePath, wordLoadOptions);

// Spécifier les options d'édition
WordProcessingEditOptions editOptions = new WordProcessingEditOptions();
editOptions.setEnableLanguageInformation(true);
editOptions.setEnablePagination(true);

//Ouvrir le document d'entrée à modifier
EditableDocument beforeEdit = editor.edit(editOptions);

//Récupérer le contenu du document et les ressources associées à partir d'un document modifiable
String content = beforeEdit.getContent();
List<IImageResource> images = beforeEdit.getImages();
List<FontResourceBase> fonts = beforeEdit.getFonts();
List<CssText> stylesheets = beforeEdit.getCss();

//Obtenir le document sous la forme d'une seule chaîne encodée en base64, où toutes les ressources (images, polices, etc.) sont intégrées dans cette chaîne avec le contenu textuel principal
String allEmbeddedInsideString = beforeEdit.getEmbeddedHtml();
//Modifier le contenu
String allEmbeddedInsideStringEdited = allEmbeddedInsideString.replace("Subtitle", "Edited subtitle");

//Créer une nouvelle instance EditableDocument à partir du contenu et des ressources modifiés
EditableDocument afterEdit = EditableDocument.fromMarkup(allEmbeddedInsideStringEdited, null);

//chemin du document de sortie
String outputPath = "C:\\Files\\Sample_output.docx";
//Enregistrer les options
WordProcessingSaveOptions saveOptions = new WordProcessingSaveOptions(WordProcessingFormats.Docx);
//Enfin, enregistrez dans le chemin
editor.save(afterEdit, outputPath, saveOptions);

//Disposez les objets
beforeEdit.dispose();
afterEdit.dispose();
editor.dispose();
```

{{< figure align=center src="images/Edit-Word-Documents-using-Java-1024x457.jpg" alt="Modifier des documents Word à l'aide de Java" caption="Modifier des documents Word à l'aide de Java">}}
 

La classe [WordprocessingLoadOptions][7] fournit diverses options pour charger des documents Word tels que DOC, DOCX, RTF, ODT, etc. dans la classe Editor.
  * La méthode [setPassword][17] permet de spécifier le mot de passe pour ouvrir les documents protégés par mot de passe.

La classe [Editor][8] est la classe principale qui fournit des méthodes pour charger, éditer et enregistrer des documents de tous les formats pris en charge.
La classe [WordProcesingEditOptions][9] vous permet de spécifier des options personnalisées pour ouvrir les documents de traitement de texte à modifier.
  * La méthode [setEnabledLanguageInformation][18] spécifie si les informations de langue sont exportées vers le balisage HTML sous la forme d'attributs HTML 'lang'.
  * La méthode [setEnablePagination][19] permet d'activer ou de désactiver la pagination dans le document HTML résultant.

La classe [EditableDocument][11] stocke le document en interne et fournit des méthodes pour générer un balisage HTML et produire des ressources.
La classe [WordProcessingSaveOptions][14] fournit des options personnalisées pour générer et enregistrer des documents Word après modification.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][20].
## Conclusion

Dans cet article, vous avez appris **comment modifier des documents Word à l'aide de Java**. Vous pouvez en savoir plus sur GroupDocs.Editor pour l'API Java en utilisant la [documentation][21]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][22].
## See Also

  * [Modifier des documents Word ou des feuilles Excel à l'aide de l'API REST][23]
  * [Modifier des documents Word en C# | Créez votre propre éditeur de mots .NET][24]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Edit-docx-documents-using-Java.jpg
 [2]: #api-for-editing-word-documents
 [3]: #Edit-DOCX-using-Java
 [4]: https://docs.fileformat.com/word-processing/docx/
 [5]: https://products.groupdocs.com/editor/java
 [6]: https://downloads.groupdocs.com/editor/java
 [7]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor.options/WordProcessingLoadOptions
 [8]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor/Editor
 [9]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor.options/wordprocessingeditoptions
 [10]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor/Editor#edit()
 [11]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor/EditableDocument
 [12]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor/EditableDocument#getEmbeddedHtml()
 [13]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor/EditableDocument#fromMarkup(java.lang.String,%20java.util.List)
 [14]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor.options/WordProcessingSaveOptions
 [15]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor/Editor#save(com.groupdocs.editor.EditableDocument,%20java.lang.String,%20com.groupdocs.editor.options.ISaveOptions)
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Edit-Word-Documents-using-Java.jpg
 [17]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor.options/WordProcessingLoadOptions#setPassword(java.lang.String)
 [18]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor.options/WordProcessingEditOptions#setEnableLanguageInformation(boolean)
 [19]: https://apireference.groupdocs.com/editor/java/com.groupdocs.editor.options/WordProcessingEditOptions#setEnablePagination(boolean)
 [20]: https://purchase.groupdocs.com/temporary-license
 [21]: https://docs.groupdocs.com/editor/java/
 [22]: https://forum.groupdocs.com/c/editor/
 [23]: https://blog.groupdocs.cloud/2021/02/12/edit-word-or-excel-documents-using-rest-api/
 [24]: https://blog.groupdocs.com/2021/03/26/edit-word-documents-in-csharp/





