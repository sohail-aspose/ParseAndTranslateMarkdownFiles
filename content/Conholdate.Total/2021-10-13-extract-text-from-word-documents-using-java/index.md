---
title: Extract Text from Word Documents using Java
author: Muzammil Khan
date: 2021-10-13T03:52:00+00:00
summary: 'As a Java developer, you can easily extract text from your Word (DOC or DOCX) files programmatically. In this article, you will learn <strong>how to extract text from Word documents using Java</strong>.'
url: /2021/10/13/extract-text-from-word-documents-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Document Text Extraction
  - Extract Formatted Text using Java
  - Extract Text
  - Extract Text from DOCX
  - Extract Text from Word
  - Text Extraction
  - Text Extraction API
  - Text Extractor API for Java

---


{{< figure align=center src="images/Extract-Text-from-Word-using-Java.jpg" alt="Extract Text from Word Documents using Java">}}
 

In certain cases, you may need to extract text from your Word documents for various purposes. As a Java developer, you can easily extract text from [DOC][2] or [DOCX][3] files programmatically. In this article, you will learn **how to extract text from Word documents using Java**.

The following topics are discussed/covered in this article:

  * [Java API to Extract Text from Word Documents][4]
  * [Extract Text from Word Documents using Java][5]
  * [Extract Text from Specific Pages of a Word Document using Java][6]
  * [Get Highlight from Word Documents using Java][7]
  * [Extract Formatted Text from DOCX using Java][8]
  * [Extract Text by Table of Contents using Java][9]

## Java API to Extract Text from Word Documents {#Java-API-to-Extract-Text-from-Word-Documents}

For extracting text from the DOC or DOCX files, we will be using [GroupDocs.Parser for Java][10] API. It allows extracting text, metadata, and images from popular file formats of [Word][11], [PDF][12], [Excel][13], and [PowerPoint][14]. It also supports the extraction of raw, formatted, and structured text from the files of [supported formats][15].

You can&nbsp;[download][16]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in your Maven-based Java application to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;https://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
	&lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
	&lt;artifactId&gt;groupdocs-parser&lt;/artifactId&gt;
	&lt;version&gt;21.2&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Extract Text from Word Documents using Java {#Extract-Text-from-Word-Documents-using-Java}

You can parse any Word document and extract text by following the simple steps mentioned below:

  * Firstly, load the DOCX file using the [Parser][17] class.
  * Then, call the&nbsp;_[Parser.getText()][18]&nbsp;_method to extract text from the loaded document.
  * Get results of the&nbsp;_[Parser.getText()][18]&nbsp;_method in the&nbsp;_[TextReader][19]&nbsp;_class object.
  * Finally, call the&nbsp;<span><a style="font-style: italic" href="https://apireference.groupdocs.com/parser/java/com.groupdocs.parser.data/TextReader#readToEnd()">TextReader.readToEnd()</a></span>_&nbsp;_method to read all characters from the current position to the end of the text reader and return them as one string.

The following code sample shows how to extract text from a DOCX file using Java.

{{< gist conholdate-gists 79a521084b9713201f9efa2d90460e9f "ExtractTextFromWord_Java_ExtractText.java" >}}

{{< figure align=center src="images/Extract-Text-from-Word-Documents-using-Java-1024x457.jpg" alt="Extract Text from Word Documents using Java" caption="Extract Text from Word Documents using Java">}}
 

## Extract Text from Specific Pages of a Word Document using Java {#Extract-Text-from-Specific-Pages-of-a-Document-using-Java}

You can parse a Word document and extract text from a specific page by following the simple steps mentioned below:

  * Firstly, load the DOCX file using the [Parser][17] class.
  * Then, use [Parser.getFeatures().isText()][21]&nbsp;to check whether the document supports text extraction feature. Read more about [supported features][22].
  * Now, call the&nbsp;_[Parser.getDocumentInfo()][23]_ method&nbsp;to get the general information about the document. Such as File Type, Page Count, Size, etc.
  * Get results of the&nbsp;_[Parser.getDocumentInfo()][23]_ method in the [IDocumentInfo][24] interface object.
  * Then, check if the&nbsp;_[IDocumentInfo.getPageCount()][25]_&nbsp;is not zero. This method returns the total number of document pages.
  * Iterate over all the pages and call the&nbsp;[Parser.getText()][26]&nbsp;method for each page index to extract text and get results in [TextReader][19] class object.
  * Finally, show results by calling the&nbsp;[TextReader.readToEnd()][27] method to read the extracted text.

The following code sample shows how to extract text from pages one by one using Java.

{{< gist conholdate-gists 79a521084b9713201f9efa2d90460e9f "ExtractTextFromWord_Java_ExtractTextFromPages.java" >}}

{{< figure align=center src="images/Get-Text-from-Pages-using-Java-1-1024x710.jpg" alt="Extract Text from Specific Pages of a Document using Java" caption="Extract Text from Specific Pages of a Document using Java">}}
 

## Get Highlight from Word Documents using Java {#Get-Highlight-from-Documents-using-Java}

A highlight is a part of the text which is usually used to explain the context of the found text in the search functionality. You can extract a highlight from a document by following the simple steps mentioned below:

  * Firstly, load the DOCX file using the [Parser][17] class.
  * Create an instance of the [HighlightOptions][29] class object and pass maximum length as an input parameter to its constructor to extract a fixed-length highlight.
  * Then, call the [Parser.getHighlight()][30] method with start position and [HighlightOptions][29] class object to extract a highlight from the document as an object of the [HighlightItem][31]&nbsp;class.
  * Finally, call the [Highlight.getPosition()][32] and the [HighlightItem.getText()][33] methods to get the position and text of the highlight.

The following code sample shows how to extract a highlight from a document using Java.

{{< gist conholdate-gists 79a521084b9713201f9efa2d90460e9f "ExtractTextFromWord_Java_ExtractHighlight.java" >}}

<pre class="wp-block-code"><code>At 0: Overview</code></pre>

## Extract Formatted Text from DOCX using Java {#Extract-Formatted-Text-from-DOCX-using-Java}

You can parse Word documents and extract text without losing the style formatting by following the simple steps mentioned below:

  * Firstly, load the DOCX file using the [Parser][17] class.
  * Define the&nbsp;_[FormattedTextOptions][34]_ and set the&nbsp;_[FormattedTextMode][35]_&nbsp;to HTML. It enables you to extract an HTML formatted text from the document.
  * Then, call the&nbsp;[Parser.getFormattedText()][26]&nbsp;method to extract formatted text.
  * Get results of the&nbsp;_[Parser.getText()][18]&nbsp;_method in the&nbsp;_[TextReader][19]&nbsp;_class object.
  * Finally, call the&nbsp;[TextReader.readToEnd()][27] method to read all the text.

The following code sample shows how to extract formatted text from a DOCX file using Java.

{{< gist conholdate-gists 79a521084b9713201f9efa2d90460e9f "ExtractTextFromWord_Java_ExtractFormattedText.java" >}}

{{< figure align=center src="images/Extract-Formatted-Text-from-DOCX-using-Java-1024x365.jpg" alt="Extract Formatted Text from DOCX using Java" caption="Extract Formatted Text from DOCX using Java">}}
 

## Extract Text by Table of Contents using Java {#Extract-Text-by-Table-of-Contents-using-Java}

You can extract text from the document by the table of contents by following the simple steps mentioned below:

  * Firstly, load the DOCX file using the [Parser][17] class.
  * Then, call the&nbsp;[Parser.getToc()][37]&nbsp;method to extract a table of contents as a collection of&nbsp;[TocItem][38]&nbsp;class objects. The [TocItem][38] represents the item which is used in the table of contents extraction functionality.
  * Now, check if the collection is not&nbsp;_null_.
  * Then, iterate over TocItem&#8217;s collection and call the [TocItem.extractText()][39] method to extract text from the document to which the [TocItem][38] object refers.
  * Get results in the [TextReader][19] class object.
  * Finally, call the&nbsp;[TextReader.readToEnd()][27] method to read all the text.

The following code sample shows how to extract text by the table of contents from Word documents using Java.

{{< gist conholdate-gists 79a521084b9713201f9efa2d90460e9f "ExtractTextFromWord_Java_ExtractTOC.java" >}}

{{< figure align=center src="images/Extract-Text-by-Table-of-Contents-using-Java-1024x457.jpg" alt="Extract Text by Table of Contents using Java" caption="Extract Text by Table of Contents using Java">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][41].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;extract text from Word documents using Java**. Moreover, you have seen **how to extract formatted text from a DOCX file** programmatically. This article also explained **how to extract text by the table of contents** and extract a highlight from a document. Besides, you can learn more about GroupDocs.Parser for Java API using the&nbsp;[documentation][42]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][43].

## See Also

  * [Extract Data from Invoices or Receipts in Java][44]

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




