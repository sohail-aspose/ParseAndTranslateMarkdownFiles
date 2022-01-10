---
title: Merge Word Documents using Java
author: Muzammil Khan
date: 2021-06-21T15:26:55+00:00
summary: 'As a Java developer, you can easily merge tow or more Word documents or combine pages from different Word files in your Java applications. In this article, you will learn <strong>how to merge Word documents using Java</strong>.'
url: /2021/06/21/merge-word-documents-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Combine Word files using Java
  - Merge DOCX Files using Java
  - Merge Word Documents using Java
  - Merge Word into PDF

---


{{< figure align=center src="images/Merge-Word-Documents-using-Java.jpg" alt="Merge Word Documents using Java">}}
 

You can programmatically merge two or more Word documents into a single document. As a Java developer, you can easily merge Word documents in your Java applications. In this article, you will learn&nbsp;**how to merge Word documents using Java**.

The following topics are discussed/covered in this article:

  * [Java API for Merging Word Documents][2]
  * [Merge Word Documents using Java][3]
  * [Combine Specific Pages of Word Documents using Java][4]
  * [Merge and Secure with Password using Java][5]
  * [Merge Word Document into PDF using Java][6]

## Java API for Merging Word Documents {#API-for-Merging-Word-Documents}

For merging [DOCX][7]&nbsp;files, I will be using&nbsp;[GroupDocs.Merger for Java][8]&nbsp;API. It allows you to develop high-performance applications that can combine, rip, shuffle, cut or delete pages, slides, and diagrams on the go.‎ It enables you to reorder or replace document pages, change page orientation, manage document passwords and perform other manipulations easily for the supported file formats such as Word, Excel, PDF, and PowerPoint.

You can&nbsp;[download][9]&nbsp;the JAR of the API or just add the following **_pom.xml_** configuration in your Maven-based Java applications to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-merger&lt;/artifactId&gt;
        &lt;version&gt;20.11&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Merge Word Documents using Java {#Merge-Multiple-Word-Documents-using-Java}

You can easily merge two or more Word documents programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;**_[Merger][10]_** class
  * Specify the path to the input DOCX file
  * Call the&nbsp;**_[join()][11]_**&nbsp;method and specify the path to the target DOCX file
  * Repeat the above step and add more files to merge
  * Call the&nbsp;**_[save()][12]_**&nbsp;method and save the merged file

The following code sample shows how to merge multiple DOCX files using Java.

{{< gist conholdate-gists 9d404af999079633a15bc719fca77557 "MergeDOCX_Java_MergeWordDocuments.java" >}}

{{< figure align=center src="images/Merge-Multiple-Word-Documents-using-Java-1024x457.jpg" alt="Merge Multiple Word Documents using Java" caption="Merge Multiple Word Documents using Java">}}
 

The **[Merger][10]** class is the main class that controls the document merging process. It provides various methods to join, extract, remove and split document pages.

The **[Join()][11]** method of the **Merger** class joins the two or more documents into one single document. It takes a document from the file path or from the input stream as an input parameter. You may also provide **JoinOptions** as well.

The **[save()][12]** method of the **Merger** class saves the resultant document to&nbsp;the provided file path. You may also save the document to the OutputStream.

## Combine Specific Pages of Word Documents using Java {#Combine-Specific-Pages-of-Word-Documents-using-Java}

You can combine specific pages of Word documents programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;**_[Merger][10]_** class
  * Specify the path to the input DOCX file
  * Define **_[JoinOptions][14]_** and set the start and end page number
  * Call the&nbsp;**_[join()][11]_**&nbsp;method and specify the path to the target DOCX file
  * Call the&nbsp;**_[save()][12]_**&nbsp;method and save the merged file

The following code sample shows how to combine selected pages of Word documents using Java.

{{< gist conholdate-gists 9d404af999079633a15bc719fca77557 "MergeDOCX_Java_CombinePages.java" >}}

The **[JoinOptions][14]** class provides options such as start page number, end page number and mode for joining the documents.

## Merge and Secure with Password using Java {#Merge-and-Secure-with-Password-using-Java}

You can merge two or more Word documents and then secure with a password programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;**_[Merger][10]_** class
  * Specify the path to the input DOCX file
  * Call the&nbsp;**_[join()][11]_**&nbsp;method and specify the path to the target DOCX file
  * Repeat the above step and add more files to merge
  * Set password using **_[AddPasswordOptions][15]_**
  * Call the **_[addPassword()][16]_** method with _AddPasswordOptions_
  * Call the&nbsp;**_[save()][12]_**&nbsp;method to save the password-protected merged file

The following code sample shows how to merge multiple DOCX files and then secure the merged file with a password using Java.

{{< gist conholdate-gists 9d404af999079633a15bc719fca77557 "MergeDOCX_Java_MergeAndSecure.java" >}}

The **[AddPasswordOptions][15]** class provides options to set password for document protection.

The **[addPassword()][16]** method of the **Merger** class gets **AddPasswordOptions** as an input parameter and protects the document with a password.

## Merge Word Document into PDF using Java {#Merge-Word-Document-into-PDF-using-Java}

You can merge two or more Word documents into a PDF document programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;**_[Merger][10]_** class
  * Specify the path to the input PDF file
  * Call the&nbsp;**_[join()][11]_**&nbsp;method and specify the path to the target DOCX file
  * Call the&nbsp;**_[save()][12]_**&nbsp;method and save the merged PDF file

The following code sample shows how to merge DOCX files into a PDF file using Java.

{{< gist conholdate-gists 9d404af999079633a15bc719fca77557 "MergeDOCX_Java_MergeWordIntoPDF.java" >}}

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][17].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;merge Word documents using Java**. You can learn more about GroupDocs.Merger for Java API using the [documentation][18]. In case of any ambiguity, please feel free to contact us on the [forum][19].

## See Also

  * [Merge Multiple File Types into One File using Java][20]
  * [Split or Merge PDF, PowerPoint, Excel, Word, Documents in Java][21]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Merge-Word-Documents-using-Java.jpg
 [2]: #API-for-Merging-Word-Documents
 [3]: #Merge-Multiple-Word-Documents-using-Java
 [4]: #Combine-Specific-Pages-of-Word-Documents-using-Java
 [5]: #Merge-and-Secure-with-Password-using-Java
 [6]: #Merge-Word-Document-into-PDF-using-Java
 [7]: https://docs.fileformat.com/word-processing/docx/
 [8]: https://products.groupdocs.com/merger/java
 [9]: https://downloads.groupdocs.com/merger/java
 [10]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger
 [11]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#join(java.lang.String)
 [12]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#save(java.lang.String)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Merge-Multiple-Word-Documents-using-Java.jpg
 [14]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/JoinOptions
 [15]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/AddPasswordOptions
 [16]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#addPassword(com.groupdocs.merger.domain.options.interfaces.IAddPasswordOptions)
 [17]: https://purchase.groupdocs.com/temporary-license
 [18]: https://docs.groupdocs.com/merger/java/
 [19]: https://forum.groupdocs.com/c/merger/
 [20]: https://blog.groupdocs.com/2021/06/13/merge-multiple-file-types-using-java/
 [21]: https://blog.groupdocs.com/2020/05/20/merge-pdf-word-excel-powerpoint-documents-in-java/




