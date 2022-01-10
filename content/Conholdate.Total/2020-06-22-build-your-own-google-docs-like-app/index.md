---
title: Build your own Google Docs like App
author: Muhammad Sohail
date: 2020-06-22T18:16:50+00:00
url: /2020/06/22/build-your-own-google-docs-like-app/
featured_image: /wp-content/uploads/sites/27/2020/06/Real-Time-Collaborative-Text-Editor-940x198.jpg
categories:
  - Conholdate.Total Product Family
tags:
  - Create Google Docs
  - google docs
  - Real-time collaborative editor
  - Rich Text

---
Several customers have approached us and asked how they can create a Google Docs like web app using our APIs. [Google Docs][1] is a word processor that allows users to create and edit files online while collaborating with other users in real-time. 

This blog post explains how easy it is to create a lite version of Google Docs that has the following features:

  * Rich Text Editing (change text font, size, colour, style (boldface, italic), alignment etc.).
  * Real-time collaborative editing of the same document. Multiple users can access the document at the same time and modify it.
  * Upload content of an existing Word Document into an editor.
  * Save text in the editor as MS Word, PDF, TXT or HTML document.

Our end product will look as follows:

{{< figure align=center src="images/Real-Time-Collaborative-Text-Editor-1-1024x505.jpg" alt="Google Docs like App Interface">}}
 

  * [Tools and Technologies][2]
  * [Integrate Firepad][3]
  * [Upload Content of an Existing Word Document into an Editor][4]
  * [Integrate GroupDocs.Editor][5]
  * [Form Data Handling][6]

## Tools and Technologies &#8211; Create Google Docs like App {#Tools-and-Technologies}

We will develop the Google Docs like web app in ASP.NET Core and use the following two libraries:

  * [Firepad][7] is an open-source, collaborative text editor. It uses the [Firebase][8] Realtime Database as a backend so it requires no server-side code and can be added to any web app simply by including the JavaScript files.
  * [GroupDocs.Editor for .NET][9] gives us an ability to edit most popular document formats using any [WYSIWYG][10] editor without any additional applications. We will load document via GroupDocs.Editor into Firepad, edit document in a way we want and save it back to original document format.

I have used [Visual Studio for Mac][11] as an [IDE][12]. However, you can download the free community edition of Visual Studio, depending upon your platform, from [here][13]. Let&#8217;s start.

Create a new ASP.NET Core Web Application project and name the project &#8220;GoogleDocsLite&#8221;.

<div class="wp-block-image">
  

{{< figure align=center src="images/ASP.NET-Core-New-Project-1024x318.jpg" alt="Create a new ASP.NET Core Web App">}}

</div>

Run the application to ensure everything is set up properly. 

## Integrate Firepad {#Integrate-Firepad}

We can add Firepad to our web app by including the following JavaScript files in the **<head>** section of **_Layout.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;!-- Firebase --&gt;
&lt;script src="https://www.gstatic.com/firebasejs/7.13.2/firebase-app.js"&gt;&lt;/script&gt;
&lt;script src="https://www.gstatic.com/firebasejs/7.13.2/firebase-auth.js"&gt;&lt;/script&gt;
&lt;script src="https://www.gstatic.com/firebasejs/7.13.2/firebase-database.js"&gt;&lt;/script&gt;

&lt;!-- CodeMirror --&gt;
&lt;script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.17.0/codemirror.js"&gt;&lt;/script&gt;
&lt;link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.17.0/codemirror.css" /&gt;

&lt;!-- Firepad --&gt;
&lt;link rel="stylesheet" href="https://firepad.io/releases/v1.5.9/firepad.css" /&gt;
&lt;script src="https://firepad.io/releases/v1.5.9/firepad.min.js"&gt;&lt;/script&gt;

&lt;!-- userlist --&gt;
&lt;script src="~/js/firepad-userlist.js"&gt;&lt;/script&gt;
&lt;link rel="stylesheet" href="~/css/firepad-userlist.css" /&gt;</pre>

To create a Firepad, we will initialize Firebase, CodeMirror and then Firepad. Add the following script and HTML code in **Index.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;script&gt;
    function init() {
        // Initialize Firebase.
        // TODO: replace with your Firebase project configuration.
        var config = {
            apiKey: '',
            authDomain: "",
            databaseURL: ""
        };
        firebase.initializeApp(config);
        
        // Get Firebase Database reference.
        var firepadRef = getExampleRef();
        
        // Create CodeMirror (with lineWrapping on).
        var codeMirror = CodeMirror(document.getElementById('firepad'), { lineWrapping: true });

        // Create a random ID to use as our user ID (we must give this to firepad and FirepadUserList).
        var userId = Math.floor(Math.random() * 9999999999).toString();

        // Create Firepad (with rich text features and our desired userId).
        var firepad = Firepad.fromCodeMirror(firepadRef, codeMirror,
                    { richTextToolbar: true, richTextShortcuts: true, userId: userId });

        // Create FirepadUserList (with our desired userId).
        var firepadUserList = FirepadUserList.fromDiv(firepadRef.child('users'),
        document.getElementById('userlist'), userId);
    }
    
    // Helper to get hash from end of URL or generate a random one.
    function getExampleRef() {
        var ref = firebase.database().ref();
        var hash = window.location.hash.replace(/#/g, '');
        if (hash) {
            ref = ref.child(hash);
        } else {
            ref = ref.push(); // generate unique location.
            window.location = window.location + '#' + ref.key; // add it as a hash to the URL.
        }
        if (typeof console !== 'undefined') {
            console.log('Firebase data: ', ref.toString());
        }
        return ref;
    }
&lt;/script&gt;

&lt;div id="userlist"&gt;&lt;/div&gt;
&lt;div id="firepad"&gt;&lt;/div&gt;</pre>

Please replace the contents of **config** with your own Firebase project&#8217;s config. 

We want the above script to execute once a web page has completely loaded all content (script files, CSS files etc.). So, call **init()** function from the **onLoad** event attribute of **<body>** element in **_Layout.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;body onload="init()"&gt;</pre>

Your <body> element should look as follows. If it contains unnecessary tags like <header>, <footer>, please remove them.

<div class="wp-block-image">
  

{{< figure align=center src="images/Body-Element-1024x451.jpg" alt="Body Element">}}

</div>

If you run the project, you will notice that **firepad** and **userlist** are not aligned properly. Please use the following CSS code to adjust the size/position of the **firepad** and **userlist**. You may add the following code within **<head>** element of **_Layout.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="css" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;style&gt;
    html {
        height: 100%;
    }

    body {
        margin: 0;
        height: 100%;
    }

    /* We make the user list 175px and firepad fill the rest of the page. */
    #userlist {
        position: absolute;
        left: 0;
        top: 50px;
        bottom: 0;
        height: auto;
        width: 175px;
    }

    #firepad {
        position: absolute;
        left: 175px;
        top: 50px;
        bottom: 0;
        right: 0;
        height: auto;
    }
&lt;/style&gt;</pre>

Firepad has been successfully set up.

## Upload Content of an Existing Word Document into an Editor {#Upload-Content-of-an-Existing-Word-Document-into-an-Editor}

Now we want to give our users a way to upload content of an exiting Word Document in the text editor. On the frontend, we add an **<input>** element of type **file** that lets a user select a Word Document from their local machine. On the backend, we use [GroupDocs.Editor][9] library to retrieve the content of a Word Document as HTML string. Finally, we use Firepad&#8217;s **setHtml()** method to show content in the text editor.

Add the following **<form>** element in **Index.cshtml** file before **<div id=&#8221;userlist&#8221;>** tag.

<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">&lt;form method="post" enctype="multipart/form-data" id="uploadForm"&gt;
    &lt;input asp-for="UploadedDocument" /&gt;
    &lt;input type="submit" value="Upload Document" class="btn btn-primary" asp-page-handler="UploadDocument" /&gt;
&lt;/form&gt;</pre>

In **Index.cshtml.cs** file, define a corresponding property.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">[BindProperty]
public IFormFile UploadedDocument { get;  set; }</pre>

Run the project and click on the **Choose file** button. Select a Word Document that you want to upload and click on the **Upload Document** button. Nothing will happen because we have not yet defined the handler in **Index.cshtml.cs**. Before we do this, let&#8217;s first add GroupDocs.Editor library in our project. 

## Integrate GroupDocs.Editor {#Integrate-GroupDocs.Editor}

**GroupDocs.Editor** is available as a NuGet package so we can easily add it to our project. Right-click on the project and select **Manage NuGet Packages** option. The **Manage NuGet Packages** window will open, select the **Browse** tab, and enter **GroupDocs.Editor** in the search field. **GroupDocs.Editor** should appear as a first result, select it and then click on **Add Package** button.

{{< figure align=center src="images/Manage-NuGet-Package-1024x645.jpg" alt="Add GroupDocs.Editor via NuGet Package Manager">}}
 

When the package is successfully added, it will appear under **NuGet** subfolder in the **Dependencies** folder. 

## Form Data Handling {#Form-Data-Handling}

Now we write a handler (**OnPostUploadDocument()** method) that will be called when a user clicks on **Upload Document** button. **UploadedDocument** object (of type **IFormFile**) contains content of the uploaded document. First, we save the document on the server then use **GroupDocs.Editor** library to get its content as HTML string. Please add the following code in **Index.cshtml.cs** file.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">private readonly IWebHostEnvironment _hostingEnvironment;

public string DocumentContent { get; set; }

public IndexModel(IWebHostEnvironment hostingEnvironment)
{
    _hostingEnvironment = hostingEnvironment;
}

public void OnPostUploadDocument()
{
    var projectRootPath = Path.Combine(_hostingEnvironment.ContentRootPath, "UploadedDocuments");
    var filePath = Path.Combine(projectRootPath, UploadedDocument.FileName);
    UploadedDocument.CopyTo(new FileStream(filePath, FileMode.Create));
    ShowDocumentContentInTextEditor(filePath);
}

private void ShowDocumentContentInTextEditor(string filePath)
{
    WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
    Editor editor = new Editor(filePath, delegate { return loadOptions; }); //passing path and load options (via delegate) to the constructor
    EditableDocument document = editor.Edit(new WordProcessingEditOptions()); //opening document for editing with format-specific edit options

    DocumentContent = document.GetContent();
}</pre>

Firepad provides two events for listening. One of them is &#8216;**ready**&#8216; which fires once Firepad has retrieved the initial editor contents. We attach a callback to this event type and in the callback, we pass **DocumentContent** string as an argument to **setHtml()** method of **firepad** object. Please add the following code in the **init()** function in **Index.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="js" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">firepad.on('ready', function () {
    if (firepad.isHistoryEmpty()) {
        var documentContent = '@Model.DocumentContent';
        if (documentContent.length != 0) {   
            firepad.setHtml(htmlDecode(documentContent));
        } else {
            firepad.setText("Welcome to your own private pad! Share the URL above and collaborate with your friends.");
        }
    }
});</pre>

You may have noticed that we passed the **documentContent** string first to **htmlDecode()** method before passing to **setHtml()** method. It is to replace character entities such as **&lt**, **&gt** with signs (**<** and **>**). The **htmlDecode()** method looks as follows.

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">function htmlDecode(input) {
    var e = document.createElement('div');
    e.innerHTML = input;
    return e.childNodes[0].nodeValue;
}</pre>

Run the project, now you should be able to upload the content of a Word Document into an editor. 

In [part II][14] of this post, I have explained how we can extend our application to include the following features:

  * Download content of the editor as MS Word, PDF, TXT or HTML document.
  * Share the URL with friends so that they can edit the document at the same time.

Please [check it out][14].

Complete source code of the project is available on [GitHub][15].

## See Also

  * <https://blog.conholdate.com/2020/06/29/build-your-own-google-docs-like-app-part-two/>

 [1]: https://www.google.com/docs/about/
 [2]: #Tools-and-Technologies
 [3]: #Integrate-Firepad
 [4]: #Upload-Content-of-an-Existing-Word-Document-into-an-Editor
 [5]: #Integrate-GroupDocs.Editor
 [6]: #Form-Data-Handling
 [7]: https://firepad.io/
 [8]: https://firebase.google.com/
 [9]: https://products.groupdocs.com/editor
 [10]: https://en.wikipedia.org/wiki/WYSIWYG
 [11]: https://visualstudio.microsoft.com/vs/mac/
 [12]: https://en.wikipedia.org/wiki/Integrated_development_environment
 [13]: https://visualstudio.microsoft.com/
 [14]: https://blog.conholdate.com/2020/06/29/build-your-own-google-docs-like-app-part-two/
 [15]: https://github.com/sohail-aspose/GoogleDocsLite




