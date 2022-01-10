---
title: Compare Word Documents and Highlight Differences using Java
author: Muzammil Khan
date: 2021-08-03T17:17:27+00:00
summary: 'As a Java developer, you can easily compare your two or more Word documents programmatically. In this article, you will learn <strong>how to compare two or more Word documents and highlight differences using Java</strong>.'
url: /2021/08/03/compare-word-documents-and-highlight-differences-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Compare Multiple DOCX Files
  - Compare Word Documents
  - Compare Word Files using Java
  - Java API to Compare Documents

---


{{< figure align=center src="images/compare-word-documents-and-highlight-differences-using-java.jpg" alt="Compare Word Documents and Highlight Differences using Java">}}
 

You can easily compare two or more Word documents and highlight the differences programmatically. You may need to compare multiple versions of the same Word file or different files for the differences and similarities in your Java application. In this article, you will learn&nbsp;**how to compare two or more Word documents and highlight differences using Java**.

The following topics are discussed/covered in this article:

  * [Java API to Compare Word Documents][2]
  * [Compare Word Documents using Java][3]
  * [Get Text of the Changes using Java][4]
  * [Compare Bookmarks in Word Documents][5]

## Java API to Compare Word Documents {#java-comparison-api}

I will be using [GroupDocs.Comparison for Java API][6] for comparing the [DOCX][7] documents. It compares to detect content changes for words, paragraphs, and characters while providing a comparison document that lists a summary of differences. It also enables you to detect changes and differences in text style between similar document formats. The API supports comparing all industry-standard document formats such as PDF, HTML, Word, Excel, PowerPoint, Outlook emails, Visio diagrams, OpenDocument, AutoCAD, and images.

You can&nbsp;[download][8]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in your Maven-based Java application to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-comparison&lt;/artifactId&gt;
        &lt;version&gt;21.6&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Compare Word Documents using Java {#Compare-Word-Documents-using-Java}

You can compare two or more Word documents by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][9]&nbsp;**_class
  2. Provide the source DOCX file path to the constructor
  3. **_[Add][10]_** target DOCX file to the comparison
  4. Call the&nbsp;_**[Compare()][11]**_ method along with the output file path

The following&nbsp;code sample shows&nbsp;**how to compare Word documents and highlights the differences using Java**.

{{< gist conholdate-gists 0820fa9bb316a147466d99f751724789 "CompareDOCX_Java_CompareWordFiles.java" >}}

{{< figure align=center src="images/source-and-target-word-documents-1024x671.jpg" alt="Source and Target Word Documents" caption="Source and Target Documents">}}
 

{{< figure align=center src="images/result-1024x679.jpg" alt="Compare Two Word Documents using Java" caption="Compare Two Word Documents using Java">}}
 

The resulting document also includes a summary page at the end of the document. It shows the summary of all the changes.

The **[Comparer][9]** class is the main class that controls the documents comparison process. The [Compare()][11] method of this class compares the source and target documents. This method saves results to the file path provided as an input parameter. The [Add()][10] method of this class, adds a&nbsp;file to the comparison process. You can easily add multiple files to the comparison by using the Add() method as shown below:

<pre class="wp-block-code"><code>comparer.Add("target2.docx");
comparer.Add("target3.docx");</code></pre>

## Get Text of the Changes using Java {#Get-Changes-Text-using-Java}

You can get the text of the changes programmatically by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][9]&nbsp;**_class
  2. Provide the source DOCX file path to the constructor
  3. _**[Add][10]**_ target DOCX file to the comparison
  4. Call the&nbsp;_**[Compare()][11]&nbsp;**_method
  5. Call the **_[getChanges()][14]_** method and get the details of changes
  6. Show the changes

The following code sample shows **how to get the text of the changes using Java**.

{{< gist conholdate-gists 0820fa9bb316a147466d99f751724789 "CompareDOCX_Java_GetChanges.java" >}}

<pre class="wp-block-code"><code>Count of changes: 10
Change Type: 2, Text: 
Change Type: 2, Text:  Company  HYPERLINK "http://www.aspose.com/" Aspose Pty Ltd Division GroupDocs 
Change Type: 2, Text: 
Change Type: 2, Text: Cool 
Change Type: 3, Text: test 
Change Type: 2, Text:  
Change Type: 2, Text: signatures
Change Type: 2, Text: Our 
Change Type: 2, Text: char&#091;
Change Type: 2, Text: 255] </code></pre>

You can get a list of changes between source and target files by calling the **[getChanges()][14]** method of the _Comparer_ class. It returns a list of [ChangeInfo][15] objects. The _ChangeInfo_ class provides methods to get details of the changes such as [_getText()_][16] to get the text of a specific change.

## Compare Bookmarks in Word Documents {#Compare-Bookmarks-in-Word-Documents-using-Java}

You can compare bookmarks present in Word documents programmatically by following the simple steps given below:

  1. Create an instance of the _**[Comparer][9] **_class
  2. Provide the source DOCX file path to the constructor
  3. **_[Add][10]_** target DOCX file to the comparison
  4. Create an instance of the **_[CompareOptions][17]_**
  5. Set the _**[CompareBookmarks][18]**_ to true
  6. Call the [**_Compare()_**][19] method along with the output file path and _CompareOptions_ object

The following&nbsp;code sample shows&nbsp;**how to compare bookmarks in Word documents using Java**.

{{< gist conholdate-gists 0820fa9bb316a147466d99f751724789 "CompareDOCX_Java_CompareBookmarks.java" >}}

{{< figure align=center src="images/Compare-Bookmarks-in-Word-Documents-using-Java-1024x333.jpg" alt="Compare Bookmarks in Word Documents using Java" caption="Compare Bookmarks in Word Documents using Java">}}
 

You can enhance your comparison process by applying various compare options. For this purpose, the [**CompareOptions**][17] class enables you to set different compare options by providing various methods. The _setCompareBookmarks()_ method enables you to compare the bookmarks available in the source and target documents.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][21].

## Conclusion

In this article, you have learned&nbsp;**how&nbsp;to compare two or more Word documents and highlight** **differences** using Java. You have also learned&nbsp;**how to get the text of highlighted changes.** Moreover, you have learned&nbsp;**how to compare bookmarks in Word documents**&nbsp;programmatically. You can learn more about GroupDocs.Comparison for Java API using the&nbsp;[documentation][22]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][23].

## See Also

  * [Compare Images in Java to Highlight Differences][24]
  * [Compare Text, Word, and PDF files using Java Comparison Library][25]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/compare-word-documents-and-highlight-differences-using-java.jpg
 [2]: #java-comparison-api
 [3]: #Compare-Word-Documents-using-Java
 [4]: #Get-Changes-Text-using-Java
 [5]: #Compare-Bookmarks-in-Word-Documents-using-Java
 [6]: https://products.groupdocs.com/comparison/java
 [7]: https://docs.fileformat.com/word-processing/docx/
 [8]: https://downloads.groupdocs.com/comparison/java
 [9]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer
 [10]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#add(java.nio.file.Path)
 [11]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#Comparer(java.lang.String)
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/source-and-target-word-documents.jpg
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/result.jpg
 [14]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#getChanges()
 [15]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.result/ChangeInfo
 [16]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.result/ChangeInfo#getText()
 [17]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.options/CompareOptions
 [18]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.options/CompareOptions#setCompareBookmarks(boolean)
 [19]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#compare(java.lang.String,%20com.groupdocs.comparison.options.CompareOptions)
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Compare-Bookmarks-in-Word-Documents-using-Java.jpg
 [21]: https://purchase.groupdocs.com/temporary-license
 [22]: https://docs.groupdocs.com/comparison/java/
 [23]: https://forum.groupdocs.com/c/comparison/
 [24]: https://blog.groupdocs.com/2021/06/16/compare-images-in-java/
 [25]: https://blog.groupdocs.com/2020/07/15/compare-text-word-pdf-files-with-java-difference-library/




