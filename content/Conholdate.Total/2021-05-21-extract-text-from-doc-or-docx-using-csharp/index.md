---
title: 'Extract Text from DOC or DOCX using C#'
author: Muzammil Khan
date: 2021-05-21T17:01:28+00:00
summary: 'Easily extract text from Word or PDF documents programmatically. In this article, you will learn <strong>how to extract text from the DOC or DOCX documents using C#</strong>.'
url: /2021/05/21/extract-text-from-doc-or-docx-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Extract Formatted Text using C#'
  - Extract Text
  - Extract Text from DOCX
  - 'Extract Text from Page using C#'
  - Extract Text from Word

---


{{< figure align=center src="images/Extract-Text-from-DOCX.jpg" alt="Extract Text from DOCX">}}
 

Most of the data is represented as visual text in documents, images, and on the web so extraction of text data is sometimes the most needed thing. You may need to extract text or images from Word or PDF documents. As a C# developer, you can easily extract text from documents programmatically. In this article, you will learn&nbsp;**how to extract text from the DOC or DOCX documents using C#**.

The following topics are discussed/covered in this article:

  * [C# API for Text Extraction][2]
  * [Extract Text from DOCX using C#][3]
  * [Get Formatted Text from DOCX using C#][4]
  * [Extract Formatted Text from Pages using C#][5]

## C# API for Text Extraction {#api-for-extracting-text}

I will be using&nbsp;[GroupDocs.Parser for .NET][6]&nbsp;API for extracting a text from [DOCX][7]&nbsp;documents. It allows extracting text, metadata, and images from supported file format documents such as Word, PDF, Excel, and Powerpoint. It also supports the extraction of raw, formatted & structured text as well as metadata from the files of supported formats.

You can either&nbsp;[download][8]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][9].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Parser</code></pre>

## Extract Text from DOCX using C# {#Extract-Text-from-DOCX-using-CSharp}

You can easily parse any document and extract text by following the simple steps mentioned below:

  * Create an instance of _[Parser][10]_ class
  * Specify the file path
  * Call the _[GetText][11]_ method of the Parser class to extract text
  * Get results in the _TextReader_ class object
  * Show results by calling the _ReadToEnd_ method of TextReader class

The following code sample shows how to extract text from a DOCX file using C#.

{{< gist conholdate-gists f97b365916bb38e917d273418dc88fc2 "ExtractTextfromDOCX_csharp_PlainText.cs" >}}

{{< figure align=center src="images/Extract-Text-from-DOCX-using-CSharp-1024x528.jpg" alt="Extract Text from DOCX using C#" caption="Extract Text from DOCX using C#">}}
 

The [Parser][10] class is the main class that provides parsing functionality and extraction of text and images. I specified the input file path in the [constructor][13] of this class.

The [GetText()][14] method of the Parser class extracts a text from the specified document.

## Get Formatted Text from DOCX using C# {#Get-Formatted-Text-from-DOCX-using-CSharp}

You can easily parse Word document and extract text without losing the style formatting by following the simple steps mentioned below:

  * Create an instance of _[Parser][10]_ class
  * Specify the file path
  * Define _[FormattedTextOptions][15]_
  * Set _[FormattedTextMode][16]_ to HTML
  * Call the [GetFormattedText][17] method of the Parser class to extract text
  * Get results in the TextReader class object
  * Show results by calling the ReadToEnd method of TextReader class

The following code sample shows how to extract formatted text from a DOCX file using C#.

{{< gist conholdate-gists f97b365916bb38e917d273418dc88fc2 "ExtractTextfromDOCX_csharp_FormattedText.cs" >}}

{{< figure align=center src="images/image-1-1024x335.png" alt="Extract Formatted Text from DOCX using C#" caption="Extract Formatted Text from DOCX using C#">}}
 

The [FormattedTextOptions][15] class provides the options which are used for formatted text extraction such as the extraction _[Mode][16]_. I set extraction mode to the HTML that extracts a document text as&nbsp;<a rel="noreferrer noopener"  href="https://docs.groupdocs.com/display/parsernet/HTML">HTML</a>.

The [GetFormattedText()][19] method of the Parser class extracts a formatted&nbsp;text from the specified document.

## Extract Formatted Text from Pages using C# {#Extract-Formatted-Text-from-Pages-using-CSharp}

You can easily parse Word document and extract formatted text from a specific page of the document by following the simple steps mentioned below:

  * Create an instance of _[Parser][10]_ class
  * Specify the file path
  * Check if the _[FormattedText][20]_ is true
  * Call the _[GetDocumentInfo][21]_ to get pages count
  * Check if the _[PageCount][22]_ is not zero
  * Define _[FormattedTextOptions][15]_
  * Set _[FormattedTextMode][16]_ to HTML
  * Call the [GetFormattedText][17] method for each page index to extract text
  * Get results in the TextReader class object
  * Show results by calling the ReadToEnd method of TextReader class

The following code sample shows how to extract formatted text from pages one by one using C#.

{{< gist conholdate-gists f97b365916bb38e917d273418dc88fc2 "ExtractTextfromDOCX_csharp_FormattedTextFromPages.cs" >}}

{{< figure align=center src="images/image-1024x363.png" alt="Extract Formatted Text from Pages using C#" caption="Extract Formatted Text from Pages using C#">}}
 

The Parser class provides [Features][24] property representing the [Features][25] class. It can be used to check whether a feature is supported for the document. You may read more about supported features in the &#8220;[Get Supported Features][26]&#8221; section.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][27].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;extract text from Word documents using** C#. You can learn more about GroupDocs.Parser for .NET API using the&nbsp;[documentation][28]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][29].

## See Also

  * [Extract Images from PDF, Excel, PPT, Word Documents in C#][30]
  * [Extract Specific Data from PDF using Python][31]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Extract-Text-from-DOCX.jpg
 [2]: #api-for-extracting-text
 [3]: #Extract-Text-from-DOCX-using-CSharp
 [4]: #Get-Formatted-Text-from-DOCX-using-CSharp
 [5]: #Extract-Formatted-Text-from-Pages-using-CSharp
 [6]: https://products.groupdocs.com/parser/net
 [7]: https://docs.fileformat.com/word-processing/docx/
 [8]: https://downloads.groupdocs.com/parser/net
 [9]: https://www.nuget.org/packages/GroupDocs.Parser
 [10]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser
 [11]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/gettext/index
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Extract-Text-from-DOCX-using-CSharp.jpg
 [13]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/constructors/7
 [14]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/gettext
 [15]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/formattedtextoptions
 [16]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/formattedtextoptions/properties/mode
 [17]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/getformattedtext/index
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/image-1.png
 [19]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/getformattedtext
 [20]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/features/properties/formattedtext
 [21]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/getdocumentinfo
 [22]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/idocumentinfo/properties/pagecount
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/image.png
 [24]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/properties/features
 [25]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/features
 [26]: https://docs.groupdocs.com/parser/net/get-supported-features/
 [27]: https://purchase.groupdocs.com/temporary-license
 [28]: https://docs.groupdocs.com/parser/net/
 [29]: https://forum.groupdocs.com/c/parser/
 [30]: https://blog.groupdocs.com/2020/10/28/extract-images-from-pdf-word-excel-ppt-using-csharp/
 [31]: https://blog.groupdocs.cloud/2021/04/28/extract-specific-data-from-pdf-using-python/




