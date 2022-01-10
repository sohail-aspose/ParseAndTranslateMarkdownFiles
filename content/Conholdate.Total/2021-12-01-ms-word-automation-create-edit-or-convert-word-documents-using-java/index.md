---
title: MS Word Automation – Create, Edit, or Convert Word Documents using Java
author: Muzammil Khan
date: 2021-12-01T06:16:36+00:00
summary: 'As a Java developer, you can automate Word to create new Word documents, edit or modify the existing ones, or convert them into other formats without using Microsoft Office. In this article, we will learn <strong>how to automate MS Word to create, edit, or convert Word documents using Java</strong>.'
url: /2021/12/01/ms-word-automation-create-edit-or-convert-word-documents-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Convert Word to PDF using Java
  - Create Word Documents in Java
  - Edit DOCX using Java
  - Edit Word Documents using Java
  - Java Word Automation
  - Parse Word Documents in Java

---


{{< figure align=center src="images/automate-word-to-create-edit-or-convert-word-documents-using-java.jpg" alt="Microsoft Word Automation — Create, Edit, or Convert Word Documents using Java">}}
 

Automation of Word enables you to create new Word documents, edit or modify the existing ones, or convert them into other formats without using Microsoft Office. All the actions that we can perform through the user interface of MS Word can also be performed programmatically by using Automation. In this article, we will learn **how to automate MS Word to create, edit, or convert Word documents using Java**.

The following topics shall be covered in this article:

  * [Java Word Automation API to Create, Edit, or Convert Word Documents][2]
  * [Create Word Documents using Java][3]
  * [Edit or Modify Word Documents using Java][4]
  * [Find and Replace Text in Word Documents using Java][5]
  * [Convert Word Documents using Java][6]
  * [Parse Word Documents using Java][7]

## Java Word Automation API to Create, Edit, or Convert Word Documents {#Java-Word-Automation-API}

For automating Word, we will be using&nbsp;[Aspose.Words for Java][8]&nbsp;API. It is a complete and feature-rich Word automation solution to create, edit, or analyze Word documents programmatically. Please either&nbsp;[download][9]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in a Maven-based Java application.

<pre class="wp-block-code"><code>&lt;repository&gt;
    &lt;id&gt;AsposeJavaAPI&lt;/id&gt;
    &lt;name&gt;Aspose Java API&lt;/name&gt;
    &lt;url&gt;https://repository.aspose.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
    &lt;groupId&gt;com.aspose&lt;/groupId&gt;
    &lt;artifactId&gt;aspose-words&lt;/artifactId&gt;
    &lt;version&gt;21.11&lt;/version&gt;
    &lt;type&gt;pom&lt;/type&gt;
&lt;/dependency&gt;</code></pre>

## Create Word Documents using Java {#Create-Word-Documents-using-Java}

We can create Word documents programmatically by following the steps given below:

  * Firstly, create an instance of the **_[Document][10]_**&nbsp;class. This class represents a Word document.
  * Next, create an instance of the **_[DocumentBuilder][11]_** class with the **_Document_** object as argument. This class provides methods&nbsp;to insert text, images and other content, specify font, paragraph, and section formatting.
  * Then, insert/write elements to add some text, paragraphs, table, or image using the **_DocumentBuilder_** object.
  * Finally, call the&nbsp;**_[Document.save()][12]_**&nbsp;method with the output file path to save the created file.

The following code sample shows **how to create a Word document (DOCX) using Java**.

{{< gist conholdate-gists bf147783599fa06ba512c0d6a461df0c "AutomateWord_Java_CreateWordDocument.java" >}}

{{< figure align=center src="images/Create-Word-Documents-using-Java.png" alt="Create Word Documents using Java" caption="Create Word Documents using Java.">}}
 

## Edit or Modify Word Documents using Java {#Edit-or-Modify-Word-Documents-using-Java}

In the previous section, we have created a Word document. Now, let&#8217;s edit it and change the content of the document. We can edit Word documents programmatically by following the steps given below:

  * Firstly, load a Word document using the **_[Document][10]_**&nbsp;class with input file path as argument.
  * Next, access the specific section by its index.
  * Then, access the first paragraph content as an object of the **_[Run][14]_** class. The **_Run_** class represents a run of characters with the same font formatting. All the text of the document is stored in runs of text.
  * After that, set the text to update for the accessed paragraph.
  * Finally, call the&nbsp;**_[Document.save()][12]_**&nbsp;method with the output file path to save the updated file.

The following code sample shows **how to edit a Word document (DOCX) using Java**.

{{< gist conholdate-gists bf147783599fa06ba512c0d6a461df0c "AutomateWord_Java_EditWordDocument.java" >}}

{{< figure align=center src="images/Edit-or-Modify-Word-Documents-using-Java.jpg" alt="Edit or Modify Word Documents using Java" caption="Edit or Modify Word Documents using Java.">}}
 

## Find and Replace Text in Word Documents using Java {#Find-and-Replace-Text-in-Word-Documents-using-Java}

We can also update the content of Word documents by using the find and replace mechanism of the API. We can do this programmatically by following the steps given below:

  * Firstly, load a Word document using the **_[Document][10]_**&nbsp;class with input file path as argument.
  * Next, create an instance of the **_[FindReplaceOptions][16]_** class.
  * Then, call the [**_replace()_**][17] method with the search string, the replace string and the **_FindReplaceOptions_** object as arguments. This method shall replace every occurrence of the search string with the replace string.
  * Finally, call the&nbsp;**_[Document.save()][12]_**&nbsp;method with the output file path to save the updated file.

The following code sample shows **how to find and replace specific text in a Word document (DOCX) using Java**.

{{< gist conholdate-gists bf147783599fa06ba512c0d6a461df0c "AutomateWord_Java_FindAndReplace.java" >}}

{{< figure align=center src="images/Find-and-Replace-Text-in-Word-Documents-using-Java-1024x457.jpg" alt="Find and Replace Text in Word Documents using Java" caption="Find and Replace Text in Word Documents using Java">}}
 

## Convert Word Documents using Java {#Convert-Word-Documents-using-Java}

We can convert Word documents to other formats such as PDF, XPS, EPUB, HTML, JPG, PNG, etc. programmatically by following the steps given below:

  * Firstly, load a Word document using the **_[Document][10]_**&nbsp;class with input file path as argument.
  * Next, create an instance of the **_[PdfSaveOptions][19]_** class with the **_Document_** object as argument. This class provides additional options when saving a document into the PDF.
  * Then, specify the PDF standards compliance level for the output document by setting the _**[PdfSaveOptions.Compliance][20]**_ to **_[PdfCompliance.PDF_17][21]_**.
  * Finally, call the&nbsp;**_[Document.save()][12]_**&nbsp;method with the output file path and **_PdfSaveOptions_** object as argument to save the PDF file.

The following code sample shows **how to convert a Word document (DOCX) to a PDF using Java**.

{{< gist conholdate-gists bf147783599fa06ba512c0d6a461df0c "AutomateWord_Java_ConvertWordDocument.java" >}}

{{< figure align=center src="images/Convert-Word-Documents-using-Java.jpg" alt="Convert Word Documents to PDF." caption="Convert Word Documents using Java">}}
 

## Parse Word Documents using Java {#Parse-Word-Documents-using-Java}

We can parse Word documents and extract the content as plain text programmatically by following the steps given below:

  * Load a Word document using the **_[Document][10]_**&nbsp;class with input file path as argument.
  * Call the&nbsp;**_[Document.save()][12]_**&nbsp;method to save the Word document as a text file. This method takes the path of the output file as an argument.

The following code sample shows **how to parse a Word document (DOCX) using Java**.

{{< gist conholdate-gists bf147783599fa06ba512c0d6a461df0c "AutomateWord_Java_ParseWordDocument.java" >}}

{{< figure align=center src="images/Parse-Word-Documents-using-Java-1024x554.jpg" alt="Extract text from Word Documents." caption="Parse Word Documents using Java.">}}
 

## Get a Free License

Please try the API without evaluation limitations by requesting&nbsp;[a free temporary license][24].

## Conclusion

In this article, we have learned&nbsp;**how to&nbsp;automate Word to create, edit, or convert Word documents using Java**. We have also seen&nbsp;**how to find and replace text in Word documents**&nbsp;programmatically. Besides, you can learn more about Aspose.Words for Java API using the&nbsp;[documentation][25]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][26].

## See Also

  * [Extract Text from Word Documents using Java][27]
  * [Merge Word Documents using Java][28]
  * [Edit Word Documents using Java][29]

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




