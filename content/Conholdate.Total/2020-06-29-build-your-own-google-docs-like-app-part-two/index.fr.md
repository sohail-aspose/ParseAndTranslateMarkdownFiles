---
title: Build your own Google Docs like App (Part -II)
author: Muhammad Sohail
date: 2020-06-29T13:25:59+00:00
url: /2020/06/29/créez-votre-propre-application-google-docs-like-part-two/
image_en vedette : /wp-content/uploads/sites/27/2020/06/Real-Time-Collaborative-Text-Editor-1-940x198.jpgrobotsméta :  - "indexer, suivre"
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Édition collaborative"
  - "Télécharger le contenu au format PDF"
  - "Télécharger le contenu en tant que document Word"
  - "Édition en temps réel"

---
Dans le [premier article de blog][1], nous avons créé une application Web de type Google Docs qui présente les fonctionnalités suivantes :
  * Édition de texte enrichi (modifier la police du texte, sa taille, sa couleur, son style (gras, italique), l'alignement, etc.).
  * Édition collaborative en temps réel d'un même document. Plusieurs utilisateurs peuvent accéder au document en même temps et le modifier.
  * Téléchargez le contenu d'un document Word existant dans un éditeur.

Dans cet article de blog, nous allons étendre notre application Web pour inclure les fonctionnalités suivantes :
  * Téléchargez le contenu de l'éditeur sous forme de document MS Word, PDF, TXT ou HTML.
  * Partagez l'URL avec des amis afin qu'ils puissent modifier le document en même temps.

Le produit final ressemblera à ceci :
{{< figure align=center src="images/Real-Time-Collaborative-Text-Editor-1-1024x505.jpg" alt="Google Docs comme App Interface">}} 

  * Télécharger le contenu de l'éditeur en tant que
      * [Document Microsoft Word][2]
      * [Documents PDF][3]
      * [Document en texte brut][4]
  * [Partager l'URL d'un éditeur avec des amis][5]

## Télécharger le contenu de l'éditeur en tant que document Microsoft Word {#Download-Content-As-MS-Word}Tout d'abord, nous ajoutons un **<input> ** élément de type **soumettre** à notre **formulaire** pour afficher le bouton "**Télécharger le document**" sur le front-end. Nous utilisons l'attribut **asp-page-handler** pour spécifier le gestionnaire du bouton. Notre élément de formulaire ressemble maintenant à ceci :
<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> <form method="post" enctype="multipart/form-data" id="uploadForm"><input asp-for="UploadedDocument" />    
<input type="submit" value="Télécharger le document" class="btn btn-primary" asp-page-handler="Télécharger le document" /><input type="submit" value="Télécharger le document" class="btn btn-primary" asp-page-handler="Télécharger le document" />
<input asp-for="DocumentContent" type="hidden" /></form></pre>
Vous avez peut-être remarqué que nous avons ajouté un autre **<input> **élément de type **masqué**. Cet élément est lié à la propriété **DocumentContent** dans **Index.cshtml.cs**. Nous utiliserons cette propriété pour stocker le contenu de l'éditeur sous forme de chaîne HTML.
<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> [Propriété de liaison]chaîne publique DocumentContent { obtenir ; ensemble; }</pre>[Firepad] [6] fournit un autre événement ** synchronisé ** pour l'écoute. Il est déclenché lorsque notre client local modifie le document et lorsque ces modifications ont été écrites avec succès dans Firebase. Nous attachons un rappel à ce type d'événement afin de définir la valeur de la propriété **DocumentContent** sur **firepad.getHtml()**. Veuillez ajouter le code suivant dans la fonction **init()** dans **Index.cshtml**.
<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> firepad.on('synced', function (isSynced) {// isSynced sera faux immédiatement après les modifications de l'utilisateur// le pad, et true lorsque leur modification a été enregistrée dans Firebase.si (est synchronisé) {document.getElementById("DocumentContent").value = firepad.getHtml();}});</pre>
Nous implémentons maintenant la fonctionnalité du gestionnaire **OnPostDownloadDocument()**. Nous utilisons la bibliothèque [GroupDocs.Editor][7] pour enregistrer le contenu de l'éditeur en tant que document Microsoft Word, qui est stocké dans la propriété **DocumentContent**. Le gestionnaire renvoie le document Word en réponse à l'utilisateur.
<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> public FileResult OnPostDownloadDocument(){// L'objet de l'éditeur fait référence au document initialement téléchargé pour l'édition.WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();Editor editor = new Editor(UploadedDocumentPath, délégué { return loadOptions; });    
// Les balises <html>, <head> et <body> manquent dans la chaîne HTML stockée dans DocumentContent, nous les ajoutons donc manuellement.string completeHTML = "<!DOCTYPE html><html><head><title></title></head><body>" + DocumentContent + "</body></html>" ;Document EditableDocument = EditableDocument.FromMarkup(completeHTML, null);    
// Chemin vers le document de sortievar projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "DownloadedDocuments");var outputPath = Path.Combine(projectRootPath, Path.GetFileName(UploadedDocumentPath));    
// Enregistrer le document Word dans le chemin de sortieWordProcessingSaveOptions saveOptions = new WordProcessingSaveOptions(WordProcessingFormats.Docx);editor.Save(document, outputPath, saveOptions);    
// Renvoie le document Word en réponse à l'utilisateurvar octets = System.IO.File.ReadAllBytes(outputPath);renvoie un nouveau FileContentResult (octets, nouveau MediaTypeHeaderValue ("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))    {FileDownloadName = Path.GetFileName(UploadedDocumentPath)} ;}</pre>La variable **UploadedDocumentPath** est définie comme une **chaîne** volatile** pour conserver la valeur du chemin du document téléchargé entre les sessions.
<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> chaîne volatile statique UploadedDocumentPath ;
public void OnPostUploadDocument(){var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "UploadedDocuments");var filePath = Path.Combine(projectRootPath, UploadedDocument.FileName);UploadedDocument.CopyTo(nouveau FileStream(filePath, FileMode.Create));
// Conserver le chemin du document téléchargé entre les sessions.UploadedDocumentPath = filePath;
ShowDocumentContentInTextEditor();}</pre>Veuillez consulter les articles [Enregistrer le document][8] et [Créer un document modifiable à partir d'un fichier ou d'un balisage][9] pour en savoir plus sur les classes GroupDocs.Editor.
Exécutez le projet et testez le cas d'utilisation suivant :
  1. Téléchargez le contenu d'un document Word existant dans un éditeur en cliquant sur le bouton **Télécharger le document**.
  2. Effectuez les modifications souhaitées dans le contenu.
  3. Cliquez sur le bouton **Télécharger le document** pour télécharger le contenu mis à jour sous forme de document Word.

## Télécharger le contenu de l'éditeur en tant que document PDF {#Download-Content-As-PDF}Nous devons apporter quelques modifications au gestionnaire **OnPostDownloadDocument()** pour renvoyer le document PDF en réponse. Nous utilisons [PdfSaveOptions][10] au lieu de [WordProcessingSaveOptions][11] et utilisons **application/pdf** comme type MIME.
<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> public FileResult OnPostDownloadDocument(){WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();Editor editor = new Editor(UploadedDocumentPath, délégué { return loadOptions; });
string completeHTML = "<!DOCTYPE html><html><head><title></title></head><body>" + DocumentContent + "</body></html>" ;Document EditableDocument = EditableDocument.FromMarkup(completeHTML, null);
var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "DownloadedDocuments");var outputPath = Path.Combine(projectRootPath, Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".pdf");
PdfSaveOptions saveOptions = new PdfSaveOptions();editor.Save(document, outputPath, saveOptions);
var octets = System.IO.File.ReadAllBytes(outputPath);renvoie un nouveau FileContentResult(octets, new MediaTypeHeaderValue("application/pdf"))    {FileDownloadName = Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".pdf"} ;}</pre>## Télécharger le contenu de l'éditeur en tant que document en texte brut {#Download-Content-As-Plain-Text-Document}Afin de renvoyer un document en texte brut (.txt) en réponse, nous utilisons la classe [TextSaveOptions][12] et utilisons **text/plain** comme type MIME.
<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> public FileResult OnPostDownloadDocument(){WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();Editor editor = new Editor(UploadedDocumentPath, délégué { return loadOptions; });
string completeHTML = "<!DOCTYPE html><html><head><title></title></head><body>" + DocumentContent + "</body></html>" ;Document EditableDocument = EditableDocument.FromMarkup(completeHTML, null);
var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "DownloadedDocuments");var outputPath = Path.Combine(projectRootPath, Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".txt");
TextSaveOptions saveOptions = new TextSaveOptions();editor.Save(document, outputPath, saveOptions);
var octets = System.IO.File.ReadAllBytes(outputPath);renvoie un nouveau FileContentResult (octets, nouveau MediaTypeHeaderValue ("text/plain"))    {FileDownloadName = Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".txt"} ;}</pre>## Partager l'URL d'un éditeur avec des amis {#Share-URL-With-Friends}Nous devrions fournir aux utilisateurs un moyen pratique de copier l'URL d'un éditeur et de la partager avec des amis. Pour cela, ajoutez un **<input> ** élément de type **texte** dans **Index.cshtml**.
<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> <div><fort><label for="shareURL">Modifier avec des amis : </label></strong><input type="text" name="shareURL" id="shareURL" size="50"></div></pre>
Ajoutez ce qui précède **<div> ** élément avant **<div id=”userlist”> ** étiqueter. Nous définissons la valeur de ce champ de saisie de texte sur l'URL d'un éditeur en utilisant la ligne de code suivante. Ajoutez ce code dans la fonction **init()** dans **Index.cshtml**.
<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> document.getElementById("shareURL").value = window.location.origin + window.location.pathname + window.location.hash ;</pre>
Nous apporterons des modifications mineures à notre CSS pour nous assurer que le champ de saisie de texte s'affiche correctement. Définissez la position supérieure de **firepad** et **userlist** sur **100px**, et ajoutez une marge de gauche au champ de saisie de texte.
<pre class="EnlighterJSRAW" data-enlighter-language="css" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">#userlist {position : absolue ;gauche : 0 ;haut : 100px ;bas : 0 ;hauteur : automatique ;largeur : 175 pixels ;}#firepad {position : absolue ;gauche : 175 px ;haut : 100px ;bas : 0 ;droite : 0 ;hauteur : automatique ;}#uploadForm {marge : 16px 2px ;}#shareURL {marge gauche : 123 px ;}</pre>Exécutez le projet, vous devriez voir un champ de texte qui vous permet de copier l'URL de l'éditeur. Partagez-le avec vos amis et modifiez le document simultanément avec eux.
Le code source complet du projet est disponible sur [GitHub][13].
## See Also

  * <https://blog.conholdate.com/2020/06/22/build-your-own-google-docs-like-app/>

 [1]: https://blog.conholdate.com/2020/06/22/build-your-own-google-docs-like-app/
 [2]: #Download-Content-As-MS-Word
 [3]: #Download-Content-As-PDF
 [4]: #Download-Content-As-Plain-Text-Document
 [5]: #Share-URL-With-Friends
 [6]: https://firepad.io/docs/
 [7]: https://products.groupdocs.com/editor/net
 [8]: https://docs.groupdocs.com/display/editornet/Save+document
 [9]: https://docs.groupdocs.com/display/editornet/Create+EditableDocument+from+file+or+markup
 [10]: https://apireference.groupdocs.com/editor/net/groupdocs.editor.options/pdfsaveoptions
 [11]: https://apireference.groupdocs.com/editor/net/groupdocs.editor.options/wordprocessingsaveoptions
 [12]: https://apireference.groupdocs.com/editor/net/groupdocs.editor.options/textsaveoptions
 [13]: https://github.com/sohail-aspose/GoogleDocsLite





