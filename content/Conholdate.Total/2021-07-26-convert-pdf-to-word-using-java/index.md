---
title: Convert PDF to Word using Java
author: Muzammil Khan
date: 2021-07-26T15:22:27+00:00
summary: 'As a Java developer, you can easily convert your PDF documents into Word documents (.docx or .doc) programmatically. This article will be focusing on <strong>how to convert PDF documents into Word document using Java</strong>.'
url: /2021/07/26/convert-pdf-to-word-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Convert PDF to DOCX
  - Convert PDF to Word
  - Convert PDF using Java
  - Convert Specific Pages using Java
  - GroupDocs.Conversion for Java

---


{{< figure align=center src="images/convert-pdf-to-word-using-java.jpg" alt="">}}
 

You can easily convert your PDF documents into Word documents (_.docx&nbsp;_or_&nbsp;.doc_) programmatically in your Java applications. Such conversion is useful when you need to edit the text of your PDF documents or may need to apply the text formatting. In this article, you are going to learn&nbsp;**how to convert PDF to Word using Java**.

The following topics are discussed/covered in this article:

  * [Java API to Convert PDF to Word][2]
  * [Convert PDF to Word using Java][3]
  * [Convert Specific Pages of PDF to Word][4]
  * [Load Pasword Protected PDF and Convert to Word][5]

## Java API to Convert PDF to Word {#java-conversion-api}

I will be using&nbsp;[GroupDocs.Conversion for Java API][6]&nbsp;for the conversion of&nbsp;[PDF][7]&nbsp;to&nbsp;[DOCX][8]. This API provides a fast, efficient, and reliable file conversion solution into Java applications without installing any external software. It supports conversions among all popular business document formats such as PDF, HTML, Email, Word, Excel, PowerPoint, Project, Photoshop, CorelDraw, AutoCAD, raster image file formats, and many more. It also allows you to display the whole ‎document, or render it partially to speed up the process. The API is compatible with all Java versions and supports popular operating systems (Windows, Linux, macOS) that are capable to run Java runtime.

### Download and Configure

You can&nbsp;[download][9]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in your Maven-based Java application to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-conversion&lt;/artifactId&gt;
        &lt;version&gt;21.7&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Convert PDF to Word using Java {#convert-pdf-to-docx}

You can convert PDF documents to Word by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Converter][10]**_&nbsp;class
  2. Provide the input file path
  3. Create an instance of [**_WordProcessingConvertOptions_**][11]
  4. Set the start page number
  5. Provide total pages to convert
  6. Set output file format
  7. Call the&nbsp;_**[Convert()][12]**&nbsp;_method along with the output file path and convert options

The following&nbsp;code sample shows&nbsp;**how to convert a PDF file into a Word document using Java**.

{{< gist conholdate-gists 99232eacdaa6d5399b0f7f9327e18e89 "ConvertPDFtoWord_Java_Convert.java" >}}

{{< figure align=center src="images/convert-pdf-to-docx-1024x549.jpg" alt="Convert PDF to Word using Java" caption="Convert PDF to Word using Java">}}
 

The [Converter][10] class is the main class that controls the document conversion process. It provides various methods to convert documents of supported file formats. The [Convert()][12] method of this class converts source documents and takes two input parameters, the file path to the source document and [ConvertOptions][14] to convert a specific source document to desired target file type.

The [WordProcessingConvertOptions][11] class provides options for conversion to WordProcessing file type. The _setPageNumber()_ method allows setting the starting page number to start conversion. Whereas, the _setPagesCount()_ method defines the total number of pages to be converted starting from the defined page number. The setFormat() method of this class enables you to set the output format of the converted document. It takes the [WordProcessingFileType][15] enumeration type as input.

## Convert Specific Pages of PDF to Word {#convert-specific-pages-of-pdf-to-docx}

You can convert specific pages of a PDF document to Word by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Converter][10]**_&nbsp;class
  2. Provide the input file path
  3. Create an instance of [**_WordProcessingConvertOptions_**][11]
  4. Set page numbers list to convert
  5. Call the&nbsp;_**[Convert()][12]**&nbsp;_method along with the output file path and convert options

The following&nbsp;code sample shows&nbsp;**how to convert specific pages from a PDF file into a Word document using Java**.

{{< gist conholdate-gists 99232eacdaa6d5399b0f7f9327e18e89 "ConvertPDFtoWord_Java_ConvertSpecificPages.java" >}}

The [WordProcessingConvertOptions][11] class provides the _setPages()_ method to convert specific page numbers defined in a comma-separated list from a source document.

## Load Pasword Protected PDF and Convert to Word {#convert-password-protected-pdf-to-docx}

You can convert password-protected PDF documents to Word by following the simple steps given below:

  1. Create **_[PdfLoadOptions][16]_**
  2. Set password
  3. Create an instance of the&nbsp;_**[Converter][10]**_&nbsp;class
  4. Provide the input file path
  5. Create an instance of [**_WordProcessingConvertOptions_**][11]
  6. Call the&nbsp;_**[Convert()][12]**&nbsp;_method along with the output file path and convert options

The following&nbsp;code sample shows&nbsp;****how to convert a password-protected PDF file into a Word document using Java****.

{{< gist conholdate-gists 99232eacdaa6d5399b0f7f9327e18e89 "ConvertPDFtoWord_Java_ConvertPasswordProtected.java" >}}

The [PdfLoadOptions][16] class provides various options to load PDF documents. The _setPassword()_ method of this class enables you to unprotect the protected document by providing its password. 

You can find more details about &#8220;[Load PDF document with options][17]&#8221; in the documentation.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][18].

## Conclusion

In this article, you have learned **how to convert PDF documents to Word** using Java. You have also learned **how to convert a password-protected PDF file to a Word document**. Moreover, you have learned **how to convert specific pages from a PDF to a Word document** programmatically. You can learn even more about GroupDocs.Conversion Java API using the [documentation][19]. In case of any ambiguity, please feel free to contact us on the [forum][20].

## See Also

  * [][21][Convert Any Image to PDF in Java][22]
  * [Convert Presentations to PDF in Java][23]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/convert-pdf-to-word-using-java.jpg
 [2]: #java-conversion-api
 [3]: #convert-pdf-to-docx
 [4]: #convert-specific-pages-of-pdf-to-docx
 [5]: #convert-password-protected-pdf-to-docx
 [6]: https://products.groupdocs.com/conversion/java
 [7]: https://docs.fileformat.com/pdf/
 [8]: https://docs.fileformat.com/word-processing/docx/
 [9]: https://downloads.groupdocs.com/conversion/java
 [10]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion/Converter
 [11]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.convert/WordProcessingConvertOptions
 [12]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion/Converter#convert(java.lang.String,%20com.groupdocs.conversion.options.convert.ConvertOptions)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/convert-pdf-to-docx.jpg
 [14]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.convert/ConvertOptions
 [15]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.filetypes/WordProcessingFileType
 [16]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.load/PdfLoadOptions
 [17]: https://docs.groupdocs.com/conversion/java/load-pdf-document-with-options/
 [18]: https://purchase.groupdocs.com/temporary-license
 [19]: https://docs.groupdocs.com/conversion/java/
 [20]: https://forum.groupdocs.com/c/conversion/11
 [21]: https://blog.conholdate.com/2021/03/31/convert-pdf-to-excel-using-csharp/
 [22]: https://blog.groupdocs.com/2021/04/21/convert-images-to-pdf-in-java/
 [23]: https://blog.groupdocs.com/2021/02/15/convert-presentations-odp-pptx-ppt-to-pdf-in-java/




