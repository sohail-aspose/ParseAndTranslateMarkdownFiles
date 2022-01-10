---
title: Edit Word Documents using Java
author: Muzammil Khan
date: 2021-06-07T10:47:00+00:00
summary: 'You can easily edit Word documents (DOC, DOCX or DOTM) programmatically. In this article, you will learn <strong>how to edit Word documents using Java</strong>.'
url: /2021/06/07/edit-word-documents-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Edit DOCX using Java
  - Edit Word Documents using Java
  - GroupDocs.Editor for Java
  - GroupDocs.Editor Product Family

---


{{< figure align=center src="images/Edit-docx-documents-using-Java.jpg" alt="Edit Word DOCX using Java">}}
 

You can programmatically edit all the Word processing document formats such as DOC, DOCX, or DOTM easily. As a Java developer, you can edit Word documents in your Java applications. In this article, you will learn&nbsp;**how to edit word documents using Java**.

The following topics are discussed/covered in this article:

  * [Java API for Editing Word Documents][2]
  * [Edit Word Documents using Java][3]

## Java API for Editing Word Documents {#api-for-editing-word-documents}

For editing [DOCX][4] files, I will be using&nbsp;[GroupDocs.Editor for Java][5]&nbsp;API. It allows you to programmatically edit Word processing documents, Excel sheets, or documents of other supported formats. The API enables you to load documents and convert them into HTML. It provides HTML to external UI for editing and then save HTML to the original document after manipulation.

You can&nbsp;[download][6]&nbsp;the JAR of the API or just add the following **_pom.xml_** configuration in your Maven-based Java applications to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-editor&lt;/artifactId&gt;
        &lt;version&gt;20.11.0&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Edit Word Documents using Java {#Edit-DOCX-using-Java}

You can easily edit Word documents programmatically by following the simple steps mentioned below:

  * Define **_[WordProcessingLoadOptions][7]_**
  * Create an instance of the **_[Editor][8]_** class
  * Specify the path to the input DOCX file
  * Define **_[WordProcessingEditOptions][9]_** 
  * Call the **_[edit()][10]_** method and get the **_[EditableDocument][11]_** object
  * Grab document content and associated resources from **_EditableDocument_**
  * Call the [_**getEmbeddedHtml()**_][12] method to get the document as a single base64-encoded String
  * Update content by calling the _**replace()**_ method
  * Call the **_[fromMarkup()][13]_** method and create a new EditableDocument instance
  * Define [**_WordProcessingSaveOptions_**][14]
  * Call the **_[save()][15]_** method and save the updated file
  * Dispose of the objects

The following code sample shows how to edit DOCX files using Java.

{{< gist conholdate-gists c088e5434c3cb536a3ecc1a9b918eb49 "EditDOCX_Java_Edit.java" >}}

{{< figure align=center src="images/Edit-Word-Documents-using-Java-1024x457.jpg" alt="Edit Word Documents using Java" caption="Edit Word Documents using Java">}}
 

The [WordprocessingLoadOptions][7] class provides various options for loading Word documents like DOC, DOCX, RTF, ODT, etc. into the Editor class.

  * The [setPassword][17] method allows specifying the password for opening the password-protected documents.

The [Editor][8] class is the main class that provides methods for loading, editing, and saving documents of all supportable formats. 

The [WordProcesingEditOptions][9] class enables you to specify custom options for opening the Word processing documents to edit.

  * The [setEnabledLanguageInformation][18] method specifies whether language information is exported to the HTML markup in a form of &#8216;lang&#8217; HTML attributes.
  * The [setEnablePagination][19] method allows to enable or disable pagination in the resultant HTML document.

The [EditableDocument][11] class internally stores the document and provides methods for generating HTML markup and producing resources.

The [WordProcessingSaveOptions][14] class provides custom options for generating and saving Word documents after editing.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][20].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;edit Word documents using Java**. You can learn more about GroupDocs.Editor for Java API using the [documentation][21]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][22].

## See Also

  * [Edit Word Documents or Excel Sheets using REST API][23]
  * [Edit Word Documents in C# | Build your own .NET Word Editor][24]

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




