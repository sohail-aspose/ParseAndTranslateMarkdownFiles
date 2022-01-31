---
title: 'Convert PDF to Images using C#'
author: Muzammil Khan
date: 2021-09-23T06:07:49+00:00
summary: 'As a C# developer, you can easily convert all the pages of a PDF file to PNG, JPG, TIFF, or BMP images programmatically in your .NET applications. In this article, you will learn <strong>how to convert PDF to Images using C#</strong>.'
url: /2021/09/23/convert-pdf-to-images-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'CSharp API to Convert PDF to Images'
  - extract image from PDF
  - PDF to BMP
  - PDF to Image
  - PDF to Image conversion
  - PDF to JPG
  - PDF to PNG
  - PDF to TIFF

---


{{< figure align=center src="images/convert-pdf-to-images-using-csharp.jpg" alt="Convert PDF to Images using C#">}}
 

You may need to share the pages of PDF documents as image files with others. As a C# developer, you can easily convert PDF files to PNG, JPG, TIFF, or BMP programmatically in your .NET applications. In this article, you will learn&nbsp;**how to convert PDF to Images using C#**.

The following topics are discussed/covered in this article:

  * [PDF to Image Conversion C# API][2]
  * [Convert PDF to PNG Images using C#][3]
  * [Convert PDF to JPG Images using C#][4]
  * [PDF to BMP Conversion in C#][5]
  * [PDF to TIFF Conversion in C#][6]
  * [Extract Images from PDF documents using C#][7]

## PDF to Image Conversion C# API {#PDF-to-Image-Conversion-CSharp-API}

For converting&nbsp;[PDF][8] to images, I will be using&nbsp;[Aspose.PDF for .NET API][9]. It&nbsp;is a powerful PDF file management API that lets you manipulate PDF documents from within your .NET applications. It allows you to create, modify, convert, render, secure and print documents without using Adobe Acrobat. 

You can either&nbsp;[download][10]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][11].

<pre class="wp-block-code"><code>Install-Package Aspose.Pdf</code></pre>

## Convert PDF to PNG Images using C# {#Convert-PDF-to-PNG-Images-using-CSharp}

You can convert PDF files to PNG images programmatically by following the steps given below:

  * Create an instance of the **_[Document][12]_** class with the input PDF file path.
  * Loop through all the pages of the PDF using&nbsp;[**_Document.Pages_**][13]&nbsp;collection and do the following:
      * Create an instance of the **_[Resolution][14]_** class and set its value.
      * Create an instance of the [**_PngDevice_**][15]&nbsp;class and pass Width, Height and Resolution object.
      * Call the [**_Process(Page, String)_**][16]&nbsp;method with the page number and the output PNG image path to convert the page to a PNG.

The following code sample shows how to convert PDF pages to PNG images using C#.

{{< gist conholdate-gists bbe3c8e7913bf18be1676123ce194bdc "ConvertPDFtoImages_CSharp_PDFtoPNG.cs" >}}

{{< figure align=center src="images/Convert-PDF-to-PNG-Images-using-CSharp-1024x604.jpg" alt="Convert PDF to PNG Images using C#" caption="Convert PDF to PNG Images using C#">}}
 

The [Document][12] class represents the PDF document. It provides several properties and methods to perform various functionalities. The [Document.Pages][13] collection is a collection of document pages and the page numbering starts from 1 in the collection. The [Resolution][14] class defines the image resolution. The [PngDevice][15] class allows saving pages of the PDF document into PNG images. This class provides the following methods to save pages into PNG images:

  * [Process(Page, String)][16] — Performs some operation on the given page and saves results into the file at given path.
  * [Process(Page, Stream)][18] — Converts the page into PNG and saves it in the output stream.

## Convert PDF to JPG Images using C# {#Convert-PDF-to-JPG-Images-using-CSharp}

You can convert PDF files to JPG images programmatically by following the steps given below:

  * Create an instance of the **_[Document][12]_** class with the input file path.
  * Loop through all the pages of the PDF using&nbsp;[**_Document.Pages_**][13]&nbsp;collection and do the following:
      * Create an instance of the **_[Resolution][14]_** class and set its value.
      * Create an instance of the [**_JpegDevice_**][19]&nbsp;class and pass Width, Height and Resolution object.
      * Call the [**_Process(Page, String)_**][16]&nbsp;method with the page number and the output JPG image path to convert the page to a JPG.

The following code sample shows how to convert PDF pages to JPG images using C#.

{{< gist conholdate-gists bbe3c8e7913bf18be1676123ce194bdc "ConvertPDFtoImages_CSharp_PDFtoJPG.cs" >}}

{{< figure align=center src="images/Convert-PDF-to-JPG-Images-using-CSharp-1024x605.jpg" alt="Convert PDF to JPG Images using C#" caption="Convert PDF to JPG Images using C#">}}
 

## PDF to BMP Conversion using C# {#PDF-to-BMP-Conversion-using-CSharp}

You can convert PDF files to BMP images programmatically by following the steps given below:

  * Create an instance of the **_[Document][12]_** class with the input file path.
  * Loop through all the pages of the PDF using&nbsp;[**_Document.Pages_**][13]&nbsp;collection and do the following:
      * Create an instance of the _**[Resolution][14]**_ class and set its value.
      * Create an instance of the [**_BmpDevice_**][21]&nbsp;class and pass Width, Height and Resolution object.
      * Call the [**_Process(Page, String)_**][16]&nbsp;method with the page number and the output BMP image path to convert the page to a BMP.

The following code sample shows how to convert PDF pages to BMP images using C#.

{{< gist conholdate-gists bbe3c8e7913bf18be1676123ce194bdc "ConvertPDFtoImages_CSharp_PDFtoBMP.cs" >}}

{{< figure align=center src="images/Convert-PDF-to-BMP-Images-using-CSharp-1024x603.jpg" alt="PDF to BMP Conversion using C#" caption="PDF to BMP Conversion using C#">}}
 

## PDF to TIFF Conversion using C# {#PDF-to-TIFF-Conversion-using-CSharp}

You can convert PDF files to TIFF programmatically by following the steps given below:

  * Create an instance of the **_[Document][12]_** class with the input file path.
  * Initialize an instance of the&nbsp;**_[Resolution][14]_** class and set its value.
  * Create an instance of the **_[TiffSettings][23]_**&nbsp;class.
  * Set various properties such as _Compression_, _Depth_, _Shape_, and _SkipBlankPages_, etc.
  * Create an instance of the [**_TiffDevice_**][24]&nbsp;class with the **_Resolution_** and the **_TiffSettings_** objects.
  * Call the [**_Process(Document, String)_**][25]&nbsp;method with the Document object and the output TIFF file path to convert the document to a TIFF.

The following code sample shows how to convert a PDF file to a TIFF using C#.

{{< gist conholdate-gists bbe3c8e7913bf18be1676123ce194bdc "ConvertPDFtoImages_CSharp_PDFtoTIFF.cs" >}}

{{< figure align=center src="images/Convert-PDF-to-TIFF-Images-using-CSharp-1024x603.jpg" alt="PDF to TIFF Conversion using C#" caption="PDF to TIFF Conversion using C#">}}
 

The [TiffSettings][23] class provides several settings for converting a PDF to TIFF. You can set Brightness, Compression, CoordinateType, Depth, Margins, Shape, and SkipBlankPages while converting PDF to TIFF.

## Extract Images from PDF Documents using C# {#Extract-Images-from-PDF-Documents-using-CSharp}

You can extract all the images from any PDF file programmatically by following the steps given below:

  * Create an instance of the **_[Document][12]_** class with the input file path.
  * For each page, create&nbsp;[XImage][27]&nbsp;instance for every image in the&nbsp;[Page.Resources.Images][28]&nbsp;collection.
  * Create an instance of the&nbsp;[FileStream][29]&nbsp;class with the output image file path.
  * Call the **_[Save()][30]_** method with the FileStream object to save the image
  * Finally, close the&nbsp;_FileStream_ using Close() method.

The following code sample shows how to extract images from a PDF document using C#.

{{< gist conholdate-gists bbe3c8e7913bf18be1676123ce194bdc "ConvertPDFtoImages_CSharp_ExtractImagesFromPDF.cs" >}}

{{< figure align=center src="images/Extract-Images-from-PDF-Documents-using-CSharp-1024x604.jpg" alt="Extract Images from PDF Documents using C#" caption="Extract Images from PDF Documents using C#">}}
 

The [XImage][32] class represents the image X-Object. It provides several properties and methods to work with images. The XImage class provides the following methods to save the image object:

  * [Save(Stream)][30] — Saves image data into stream as JPEG image.
  * [Save(Stream, ImageFormat)][33] — Saves image into stream with requested format.
  * The [Save(Stream, Int32)][34] method — Saves image data into stream as JPEG image with specified resolution.
  * The [Save(Stream, ImageFormat, Int32)][35] method — Saves image into stream with requested format and specified resolution.

The&nbsp;[Page.Resources.Images][28]&nbsp;collection represents the collection of images for the specific page.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][36].

## Conclusion

In this article, you have learned&nbsp;**how to **convert PDF file pages to images** using C#**. You have also learned&nbsp;**how to convert PDF to PNG, PDF to JPG, PDF to BMP, and PDF to TIFF**&nbsp;programmatically. Moreover, you have learned **how to extract images from a PDF file using C#**. The API also offers compression options, table creation & manipulation, graph & image functions, extensive hyperlink functionality, stamp and watermark tasks, extended security controls and custom font handling. You can learn more about Aspose.PDF for .NET API using the&nbsp;[documentation][37]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][38].

## See Also

  * [Classify PDF Documents using C#][39]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/convert-pdf-to-images-using-csharp.jpg
 [2]: #PDF-to-Image-Conversion-CSharp-API
 [3]: #Convert-PDF-to-PNG-Images-using-CSharp
 [4]: #Convert-PDF-to-JPG-Images-using-CSharp
 [5]: #PDF-to-BMP-Conversion-using-CSharp
 [6]: #PDF-to-TIFF-Conversion-using-CSharp
 [7]: #Extract-Images-from-PDF-Documents-using-CSharp
 [8]: https://docs.fileformat.com/pdf/
 [9]: https://products.aspose.com/pdf
 [10]: https://downloads.aspose.com/pdf/net
 [11]: https://www.nuget.org/packages/Aspose.PDF/
 [12]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf/document/properties/pages
 [14]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/resolution
 [15]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/pngdevice
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices.pagedevice/process/methods/1
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-PNG-Images-using-CSharp.jpg
 [18]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/pngdevice/methods/process
 [19]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/jpegdevice
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-JPG-Images-using-CSharp.jpg
 [21]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/bmpdevice
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-BMP-Images-using-CSharp.jpg
 [23]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/tiffsettings
 [24]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/tiffdevice
 [25]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices.documentdevice/process/methods/3
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-TIFF-Images-using-CSharp.jpg
 [27]: https://apireference.aspose.com/net/pdf/aspose.pdf/ximage
 [28]: https://apireference.aspose.com/pdf/net/aspose.pdf/resources/properties/images
 [29]: https://docs.microsoft.com/en-us/dotnet/api/system.io.filestream
 [30]: https://apireference.aspose.com/pdf/net/aspose.pdf/ximage/methods/save
 [31]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Extract-Images-from-PDF-Documents-using-CSharp.jpg
 [32]: https://apireference.aspose.com/pdf/net/aspose.pdf/ximage
 [33]: https://apireference.aspose.com/pdf/net/aspose.pdf.ximage/save/methods/1
 [34]: https://apireference.aspose.com/pdf/net/aspose.pdf.ximage/save/methods/3
 [35]: https://apireference.aspose.com/pdf/net/aspose.pdf.ximage/save/methods/2
 [36]: https://purchase.aspose.com/temporary-license
 [37]: https://docs.aspose.com/pdf/net/
 [38]: https://forum.aspose.com/c/pdf/10
 [39]: https://blog.conholdate.com/2021/07/01/classify-pdf-documents-using-csharp/




