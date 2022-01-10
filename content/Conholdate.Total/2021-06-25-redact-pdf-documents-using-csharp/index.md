---
title: 'Redact PDF Documents using C#'
author: Muzammil Khan
date: 2021-06-25T05:04:20+00:00
summary: 'You can easily redact your PDF documents programmatically using C# in your .NET applications. This article will be focusing on <strong>how to redact PDF documents using C#</strong>.'
url: /2021/06/25/redact-pdf-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Multiple Redaction in PDF using C#'
  - Redact Images in PDF
  - Redact Metadata in PDF
  - 'Redact PDF using C#'
  - Redact Text in PDF

---


{{< figure align=center src="images/Redact-PDF-Documents-using-CSharp.jpg" alt="Redact PDF Documents using C#">}}
 

You can redact PDF documents programmatically without installing any external applications. As a C# developer, you can easily redact your PDF documents in your .NET applications. This article will be focusing on&nbsp;**how to redact PDF documents using C#**.

The following topics are discussed/covered in this article:

  * [C# API for PDF Redaction][2]
  * [Redact Text in PDF using C#][3]
  * [Metadata Redaction in PDF using C#][4]
  * [Redact Images in PDF using C#][5]
  * [Apply Multiple Redactions in PDF using C#][6]

## C# API for PDF Redaction {#api-for-pdf-redaction}

For redaction in [PDF][7] documents, I will be using&nbsp;[GroupDocs.Redaction for .NET][8]&nbsp;API. It allows you to redact PDF, Word, Excel, PowerPoint, and image files. It also enables you to remove the classified information from over 30 types of supported formats. You can apply various types of redaction such as text redaction, metadata ‎redaction, annotation redaction, and tabular document redaction.

You can either&nbsp;[download][9]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][10].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Redaction</code></pre>

## Redact Text in PDF using C# {#Redact-Text-in-PDF}

You can easily apply text redaction in PDF documents by following the simple steps mentioned below:

  * Create an instance of&nbsp;the _[**Redactor**][11]_ class with the input file path
  * Create the **_[ExactPhraseRedaction][12]_** class instance with _SearchPhrase_ and the _**[ReplacementOptions][13]**_
  * Call the&nbsp;_[Redactor.Apply()][14]_ method
  * Get results in the&nbsp;_**[RedactorChangeLog][15]**_ class object
  * Call the [Redactor.Save()][16] method

The following code sample shows **how to redact text in a PDF document using C#**.

{{< gist conholdate-gists cbc555b45fcfab5c422828bb5d743d37 "RedactPDF_CSharp_RedactText.cs" >}}

{{< figure align=center src="images/Redact-Text-in-PDF-using-csharp-1024x457.jpg" alt="Redact Text in PDF using C#" caption="Redact Text in PDF using C#">}}
 

The [Redactor][11] is the main class provides various methods to perform the document redaction process. It also enables you to open, redact and save documents. The _Apply()_ method of this class applies the defined redaction to the document. Moreover, the _Save()_ method of this class saves the document to a file.

The [ExactPhraseRedaction][12] provides methods to perform a text redaction to replace an exact phrase in the document. It also allows to search case sensitive data by setting the _IsCaseSensitive_ to true.

The [ReplacementOptions][13] represents options for matched text replacement.

The [RedactorChangeLog][15] class represents results for a list of redactions, passed to Apply() method of&nbsp;[Redactor][11]&nbsp;class.

## Metadata Redaction in PDF using C# {#Redact-Metadata-in-PDF}

You can apply metadata redaction in PDF documents by following the simple steps mentioned below:

  * Create an instance of&nbsp;the _[**Redactor**][11]_ class with the input file path
  * Create the **_[EraseMetadataRedaction][18]_** class instance with **_[MetadataFilter][19]_** to include
  * Call the&nbsp;_[Redactor.Apply()][14]_ method
  * Call the [Redactor.Save()][16] method

The following code sample shows **how to redact metadata in a PDF document using C#**.

{{< gist conholdate-gists cbc555b45fcfab5c422828bb5d743d37 "RedactPDF_CSharp_RedactMetadata.cs" >}}

{{< figure align=center src="images/Redact-Metadata-in-PDF-using-csharp-1024x835.jpg" alt="Redact Metadata in PDF using C#" caption="Redact Metadata in PDF using C#">}}
 

The [EraseMetadataRedaction][21] class provides methods to erase all the metadata. It also enable to erase metadata matching specific MetadataFilters from the document.

The [MetadataFilters][19] is a list of the most common types of document metadata such as Author, Comments, Company.

## Redact Images in PDF using C# {#Redact-Images-in-PDF}

You can apply image redaction in PDF documents by following the simple steps mentioned below:

  * Create an instance of&nbsp;the _[**Redactor**][11]_ class with the input file path
  * Define drawing points and size
  * Create the **_[ImageAreaRedaction][22]_** class instance with drawing points and **_[RegionReplacementOptions][23]_**
  * Call the&nbsp;_[Redactor.Apply()][14]_ method
  * Call the [Redactor.Save()][16] method

The following code sample shows **how to redact images in a PDF document using C#**.

{{< gist conholdate-gists cbc555b45fcfab5c422828bb5d743d37 "RedactPDF_CSharp_RedactImages.cs" >}}

{{< figure align=center src="images/Redact-Images-in-PDF-using-csharp-1024x457.jpg" alt="Redact Images in PDF using C#" caption="Redact Images in PDF using C#">}}
 

The [ImageAreaRedaction][22] class allows to place a colored rectangle in given area of an image document.

The [RegionReplacementOption][23] class represents the color and area parameters for a region to be replaced with image.

## Apply Multiple Redactions in PDF using C# {#Apply-Multiple-Redactions-in-PDF}

You can apply multiple redactions in PDF documents by following the simple steps mentioned below:

  * Create an instance of&nbsp;the _[**Redactor**][11]_ class with the input file path
  * Create the **_[ExactPhraseRedaction][12]_**, **_[RegexRedaction][25]_**, and **_[EraseMetadataRedaction][21]_**
  * Add created redactions to the redaction list
  * Call the&nbsp;_[Redactor.Apply()][26]_ method
  * Call the [Redactor.Save()][16] method, show errors if failed

The following code sample shows **how to apply multiple redactions in a PDF document using C#**.

{{< gist conholdate-gists cbc555b45fcfab5c422828bb5d743d37 "RedactPDF_CSharp_MultipleRedaction.cs" >}}

{{< figure align=center src="images/Apply-Multiple-Redactions-in-PDF-using-csharp-1-1024x536.jpg" alt="Apply Multiple Redactions in PDF using C#" caption="Apply Multiple Redactions in PDF using C#">}}
 

The [RegexRedaction][25] class allows to perform a text redaction. You can search and replace any text in the document by matching a text using regular expression.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][28].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;redaction PDF documents using&nbsp;C#**. You have also learned how to redact Text, Metadata and Images in PDF documents. Moreover, you have learned how to apply multiple redactions in PDF using C#. You can learn more about GroupDocs.Redaction for .NET API using the&nbsp;[documentation][29]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][30].

## See Also

  * [Find and Replace Text in Documents Programmatically using C#][31]
  * [How to Redact in Word Processing Documents Using C# or Java][32]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-PDF-Documents-using-CSharp.jpg
 [2]: #api-for-pdf-redaction
 [3]: #Redact-Text-in-PDF
 [4]: #Redact-Metadata-in-PDF
 [5]: #Redact-Images-in-PDF
 [6]: #Apply-Multiple-Redactions-in-PDF
 [7]: https://docs.fileformat.com/pdf/
 [8]: https://products.groupdocs.com/redaction/net
 [9]: https://downloads.groupdocs.com/redaction/net
 [10]: https://www.nuget.org/packages/GroupDocs.Redaction
 [11]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactor
 [12]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/exactphraseredaction
 [13]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/replacementoptions
 [14]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactor/methods/apply
 [15]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactorchangelog
 [16]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactor/methods/save
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-Text-in-PDF-using-csharp.jpg
 [18]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/metadatasearchredaction
 [19]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/metadatafilters
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-Metadata-in-PDF-using-csharp.jpg
 [21]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/erasemetadataredaction
 [22]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/imagearearedaction
 [23]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/regionreplacementoptions
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-Images-in-PDF-using-csharp.jpg
 [25]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/regexredaction
 [26]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactor/apply/methods/1
 [27]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Apply-Multiple-Redactions-in-PDF-using-csharp-1.jpg
 [28]: https://purchase.groupdocs.com/temporary-license
 [29]: https://docs.groupdocs.com/redaction/net/
 [30]: https://forum.groupdocs.com/c/redaction/
 [31]: https://blog.groupdocs.com/2019/09/20/find-and-replace-text-in-word-excel-powerpoint-pdf-documents-net-api/
 [32]: https://blog.groupdocs.com/2019/12/05/how-to-redact-in-word/




