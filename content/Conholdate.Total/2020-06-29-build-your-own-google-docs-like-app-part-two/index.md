---
title: Build your own Google Docs like App (Part -II)
author: Muhammad Sohail
date: 2020-06-29T13:25:59+00:00
url: /2020/06/29/build-your-own-google-docs-like-app-part-two/
featured_image: /wp-content/uploads/sites/27/2020/06/Real-Time-Collaborative-Text-Editor-1-940x198.jpg
robotsmeta:
  - index,follow
categories:
  - Conholdate.Total Product Family
tags:
  - Collaborative editing
  - Download Content as PDF
  - Download Content as Word Document
  - Real time editing

---
In the [first blog post][1], we created a Google Docs like web app that has the following features:

  * Rich Text Editing (change text font, size, colour, style (boldface, italic), alignment etc.).
  * Real-time collaborative editing of the same document. Multiple users can access the document at the same time and modify it.
  * Upload content of an existing Word Document into an editor.

In this blog post, we will extend our web-application to include the following features:

  * Download content of the editor as MS Word, PDF, TXT or HTML document.
  * Share the URL with friends so that they can edit the document at the same time.

The final product will look as follows:

{{< figure align=center src="images/Real-Time-Collaborative-Text-Editor-1-1024x505.jpg" alt="Google Docs like App Interface">}}
 

  * Download Content of the Editor As
      * [Microsoft Word Document][2]
      * [PDF Document][3]
      * [Plain Text Document][4]
  * [Share URL of an Editor with friends][5]

## Download Content of the Editor as Microsoft Word Document {#Download-Content-As-MS-Word}

First, we add an **<input>** element of type **submit** to our **form** to show the &#8220;**Download Document**&#8221; button on the front-end. We use **asp-page-handler** attribute to specify the handler of the button. Our form element now looks as follows:

<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;form method="post" enctype="multipart/form-data" id="uploadForm"&gt;
    &lt;input asp-for="UploadedDocument" /&gt;
    
    &lt;input type="submit" value="Upload Document" class="btn btn-primary" asp-page-handler="UploadDocument" /&gt;
    &lt;input type="submit" value="Download Document" class="btn btn-primary" asp-page-handler="DownloadDocument" /&gt;

    &lt;input asp-for="DocumentContent" type="hidden" /&gt;
&lt;/form&gt;</pre>

You may have noticed that we have added another **<input>** element of type **hidden**. This element is bound to **DocumentContent** property in **Index.cshtml.cs**. We will use this property to store the content of the editor as an HTML string.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">[BindProperty]
public string DocumentContent { get; set; }</pre>

[Firepad][6] provides another event **synced** for listening. It is fired when our local client edits the document and when those edits have been successfully written to Firebase. We attach a callback to this event type in order to set the value of **DocumentContent** property to **firepad.getHtml()**. Please add the following code in the **init()** function in **Index.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">firepad.on('synced', function (isSynced) {
    // isSynced will be false immediately after the user edits 
    // the pad, and true when their edit has been saved to Firebase.
    if (isSynced) {
        document.getElementById("DocumentContent").value = firepad.getHtml();
    }
});</pre>

Now we implement the functionality of **OnPostDownloadDocument()** handler. We use [GroupDocs.Editor][7] library to save contents of the editor as Microsoft Word document, which are stored in **DocumentContent** property. The handler returns the Word document as a response to the user.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">public FileResult OnPostDownloadDocument()
{
    // Editor object is referencing to the document initially uploaded for editing.
    WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
    Editor editor = new Editor(UploadedDocumentPath, delegate { return loadOptions; });
    
    // &lt;html&gt;, &lt;head&gt; and &lt;body&gt; tags are missing in the HTML string stored in DocumentContent, so we are adding them manually.
    string completeHTML = "&lt;!DOCTYPE html&gt;&lt;html&gt;&lt;head&gt;&lt;title&gt;&lt;/title&gt;&lt;/head&gt;&lt;body&gt;" + DocumentContent + "&lt;/body&gt;&lt;/html&gt;";
    EditableDocument document = EditableDocument.FromMarkup(completeHTML, null);
    
    // Path to the output document        
    var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "DownloadedDocuments");
    var outputPath = Path.Combine(projectRootPath, Path.GetFileName(UploadedDocumentPath));
    
    // Save the Word Document at the outputPath 
    WordProcessingSaveOptions saveOptions = new WordProcessingSaveOptions(WordProcessingFormats.Docx);
    editor.Save(document, outputPath, saveOptions);
    
    // Return the Word Document as response to the User
    var bytes = System.IO.File.ReadAllBytes(outputPath);        
    return new FileContentResult(bytes, new MediaTypeHeaderValue("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))
    {
        FileDownloadName = Path.GetFileName(UploadedDocumentPath)
    };
}</pre>

**UploadedDocumentPath** variable is defined as a **volatile** **string** to keep the value of the uploaded document path between sessions.

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">static volatile string UploadedDocumentPath;

public void OnPostUploadDocument()
{
    var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "UploadedDocuments");
    var filePath = Path.Combine(projectRootPath, UploadedDocument.FileName);
    UploadedDocument.CopyTo(new FileStream(filePath, FileMode.Create));

    // Retain the path of uploaded document between sessions.
    UploadedDocumentPath = filePath;

    ShowDocumentContentInTextEditor();
}</pre>

Please check [Save Document][8] and [Create EditableDocument from file or markup][9] articles to learn more about GroupDocs.Editor classes.

Run the project and test the following use case:

  1. Upload content of an existing Word document into an editor by clicking on the **Upload Document** button.
  2. Make desired changes in the content.
  3. Click on the **Download Document** button to download the updated content as a Word Document.

## Download Content of the Editor as PDF Document {#Download-Content-As-PDF}

We need to make a few modifications in **OnPostDownloadDocument()** handler to return PDF document as a response. We use [PdfSaveOptions][10] instead of [WordProcessingSaveOptions][11] and use **application/pdf** as a MIME type.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">public FileResult OnPostDownloadDocument()
{
    WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
    Editor editor = new Editor(UploadedDocumentPath, delegate { return loadOptions; });

    string completeHTML = "&lt;!DOCTYPE html&gt;&lt;html&gt;&lt;head&gt;&lt;title&gt;&lt;/title&gt;&lt;/head&gt;&lt;body&gt;" + DocumentContent + "&lt;/body&gt;&lt;/html&gt;";
    EditableDocument document = EditableDocument.FromMarkup(completeHTML, null);

    var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "DownloadedDocuments");
    var outputPath = Path.Combine(projectRootPath, Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".pdf");

    PdfSaveOptions saveOptions = new PdfSaveOptions();
    editor.Save(document, outputPath, saveOptions);

    var bytes = System.IO.File.ReadAllBytes(outputPath);
    return new FileContentResult(bytes, new MediaTypeHeaderValue("application/pdf"))
    {
        FileDownloadName = Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".pdf"
    };
}</pre>

## Download Content of the Editor as Plain Text Document {#Download-Content-As-Plain-Text-Document}

In order to return a plain text document (.txt) as a response, we use [TextSaveOptions][12] class and use **text/plain** as a MIME type.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">public FileResult OnPostDownloadDocument()
{
    WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
    Editor editor = new Editor(UploadedDocumentPath, delegate { return loadOptions; });

    string completeHTML = "&lt;!DOCTYPE html&gt;&lt;html&gt;&lt;head&gt;&lt;title&gt;&lt;/title&gt;&lt;/head&gt;&lt;body&gt;" + DocumentContent + "&lt;/body&gt;&lt;/html&gt;";
    EditableDocument document = EditableDocument.FromMarkup(completeHTML, null);

    var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "DownloadedDocuments");
    var outputPath = Path.Combine(projectRootPath, Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".txt");

    TextSaveOptions saveOptions = new TextSaveOptions();
    editor.Save(document, outputPath, saveOptions);

    var bytes = System.IO.File.ReadAllBytes(outputPath);
    return new FileContentResult(bytes, new MediaTypeHeaderValue("text/plain"))
    {
        FileDownloadName = Path.GetFileNameWithoutExtension(UploadedDocumentPath) + ".txt"
    };
}</pre>

## Share URL of an Editor with friends {#Share-URL-With-Friends}

We should provide users with a convenient way to copy the URL of an editor and share it with friends. To do this, add an **<input>** element of type **text** in **Index.cshtml**. 

<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;div&gt;
    &lt;strong&gt;
        &lt;label for="shareURL"&gt;Edit with Friends: &lt;/label&gt;
    &lt;/strong&gt;
    &lt;input type="text" name="shareURL" id="shareURL" size="50"&gt;
&lt;/div&gt;</pre>

Add the above **<div>** element before **<div id=&#8221;userlist&#8221;>** tag. We set value of this text input field to URL of an editor by using the following line of code. Add this code in **init()** function in **Index.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">document.getElementById("shareURL").value = window.location.origin + window.location.pathname + window.location.hash;</pre>

We will make minor changes to our CSS to ensure that the text input field is shown properly. Set top position of **firepad** and **userlist** to **100px**, and add a left margin to the text input field.

<pre class="EnlighterJSRAW" data-enlighter-language="css" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">#userlist {
    position: absolute;
    left: 0;
    top: 100px;
    bottom: 0;
    height: auto;
    width: 175px;
}

#firepad {
    position: absolute;
    left: 175px;
    top: 100px;
    bottom: 0;
    right: 0;
    height: auto;
}

#uploadForm {
    margin: 16px 2px;
}

#shareURL {
    margin-left: 123px;
}</pre>

Run the project, you should see a text field that lets you copy the URL of the editor. Share it with your friends and edit the document simultaneously with them.

Complete source code of the project is available on [GitHub][13].

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




