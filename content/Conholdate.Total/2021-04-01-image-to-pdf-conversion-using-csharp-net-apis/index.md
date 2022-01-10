---
title: 'Image to PDF conversion using C# .NET API'
author: Nayyer Shahbaz
date: 2021-04-01T17:42:08+00:00
url: /2021/04/01/image-to-pdf-conversion-using-csharp-net-apis/
categories:
  - Conholdate.Total Product Family
tags:
  - .NET API for JPEG to PDF
  - Convert Image to PDF
  - Image to PDF conversion
  - JPEG to PDF conversion API
  - PNG to PDF conversion API

---


{{< figure align=center src="images/JPEG-PDF.jpg" alt="Image to PDF conversion">}}
 

&#8220;**A**&nbsp;**picture is worth**&nbsp;**a&nbsp;thousand words**&#8220;. The&nbsp;ideas can be conveyed by a single still&nbsp;**image** in an efficacious mechanism than a mere verbal description. Therefore, images are widely used in daily life. A large variety of image formats including [JPEG][2], [PNG][3], [BMP][4], [GIF][5], [TIFF][6], etc are used for information sharing. However, if we stumble upon a requirement to share a large set of images, either we need to archive them into one bundle or make a booklet in a format that can be easily viewed on receiving end. So, our choice is Portable Document Format ([PDF][7]) because it maintains the document fidelity irrespective of application software, hardware as well as Operating System being used for viewing the file. Therefore, in this article, we are going to talk about the Image to PDF conversion feature using [Conholdate.Total for .NET][8] APIs.

<blockquote class="wp-block-quote">
  
    However, before we proceed further, let&#8217;s discuss some points highlighting a difference between Conholdate.Total for .NET and Aspose.Total for .NET.
  
</blockquote>

[Aspose.Total for .NET][9] is a collection of programming APIs specifically developed to create, manipulate and transform leading file formats. It includes Word, Excel, PDF, PowerPoint, Outlook, Diagram, MS Project, HTML, and more than other 100 file formats all within the standard desktop, Console, ASP.NET, and VB.NET applications.

Albeit, [Conholdate.Total for .NET][8] also includes Aspose.Total for .NET. But, it also includes [GroupDocs.Total for .NET][10]. It provides extra capabilities to view, convert, annotate, compare, sign, assemble, edit, search, and parse the most commonly used document formats. So in this single package, you get the capabilities to load files, view them, manipulate them and render the output in other supported formats i.e. [Load MS Word file and save into JPEG format][11].

So in this article, we are going to discuss the feature to load the [raster image file][12] and save the output in [PDF][7] format using C# .NET.

  * [Convert Image to PDF in C#][13]
  * [Get a Free License][14]

## Convert Image to PDF in C# {#Convert-Image-to-PDF-in-Csharp}

The API is a leading programming solution offering the capabilities to deal with MS Word ([DOC][15], [DOCX][16], [RTF][17], [DOT][18], [DOTX][19], [DOTM][20], [DOCM][21]), **OpenOffice:** [ODT][22], [OTT][23] files. The API empowers the developers to modify, generate, render, convert and print documents without using Microsoft Word. It supports the feature to render the output in [DOC][15], [RTF][17], [HTML][24], [OpenDocument][22], [PDF][7], [XPS][25], [EPUB][26], and many more. So we can use this API for Image to PDF conversion. 

In order to use the API, you may either [download][27] the .dll or open [NuGet][28] package manager, search for **Aspose.Words** and install. Please run the following command on Package Manager Console to install it.

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">Install-Package Aspose.Words -Version 21.3.0  </pre>

Please follow the steps given below to perform the conversion operation

**C#.NET**

  * Create an instance of [Document][29] class.
  * Create an instance of [DocumentBuilder][30] and pass the Document object as an argument.
  * Call [InsertImage(&#8230;)][31] method of DocumentBuilder class and pass source image path as argument.
  * Call [Save][32](..) method and provide resultant file name as argument.

{{< gist conholdate-gists 68e44224753bacdc4b97c9ee931205a7 "Examples-DotNET-CSsharp-JPEG-to-PDF-1.cs" >}}

## Get a Free License {#Get-a-Free-License}

In order to use the API without any limitations, please consider requesting a [Free temporary license][33].

## Conclusion

In this article, we have learned about the capabilities of [Conholdate.Total for .NET][8] package for the conversion of raster images to PDF format.

## **Related articles**

You may consider visiting following links for details on 

  * [Convert PDF Files to SVG using C#][34]
  * [Convert PDF Pages to PNG Images using C#][35]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/03/JPEG-PDF.jpg
 [2]: https://docs.fileformat.com/image/jpeg/
 [3]: https://docs.fileformat.com/image/png/
 [4]: https://docs.fileformat.com/image/bmp/
 [5]: https://docs.fileformat.com/image/gif/
 [6]: https://docs.fileformat.com/image/tiff/
 [7]: https://docs.fileformat.com/pdf/
 [8]: https://products.conholdate.com/total/net
 [9]: https://products.aspose.com/total/net
 [10]: https://products.groupdocs.com/total/net
 [11]: https://docs.aspose.com/words/net/converting-to-fixed-page-format/
 [12]: https://docs.fileformat.com/image/
 [13]: #Convert-Image-to-PDF-in-Csharp
 [14]: #Get-a-Free-License
 [15]: https://docs.fileformat.com/word-processing/doc/
 [16]: https://docs.fileformat.com/word-processing/docx/
 [17]: https://docs.fileformat.com/word-processing/rtf/
 [18]: https://docs.fileformat.com/word-processing/dot/
 [19]: https://docs.fileformat.com/word-processing/dotx/
 [20]: https://docs.fileformat.com/word-processing/dotm/
 [21]: https://docs.fileformat.com/word-processing/docm/
 [22]: https://docs.fileformat.com/word-processing/odt/
 [23]: https://docs.fileformat.com/word-processing/ott/
 [24]: https://docs.fileformat.com/web/html/
 [25]: https://docs.fileformat.com/page-description-language/xps/
 [26]: https://docs.fileformat.com/ebook/epub/
 [27]: https://downloads.aspose.com/words/net
 [28]: https://www.nuget.org/packages/Aspose.Words/
 [29]: https://apireference.aspose.com/words/net/aspose.words/document
 [30]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder
 [31]: https://apireference.aspose.com/words/net/aspose.words.documentbuilder/insertimage/methods/9
 [32]: https://apireference.aspose.com/words/net/aspose.words.document/save/methods/2
 [33]: https://purchase.aspose.com/temporary-license
 [34]: https://blog.aspose.com/2021/02/04/convert-pdf-files-to-svg-using-csharp/
 [35]: https://blog.aspose.com/2020/11/25/pdf-to-png-using-csharp/




