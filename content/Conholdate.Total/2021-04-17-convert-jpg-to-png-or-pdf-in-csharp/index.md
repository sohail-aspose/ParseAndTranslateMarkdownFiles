---
title: 'Convert JPG to PNG or PDF in C#'
author: Nayyer Shahbaz
date: 2021-04-17T00:54:23+00:00
url: /2021/04/17/convert-jpg-to-png-or-pdf-in-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'C# API for JPEG to PNG conversion'
  - 'Convert JPEG to PDF in C#'
  - convert jpg to png
  - JPEG2000 to PNG conversion APII
  - 'jpg to png in c#'

---


{{< figure align=center src="images/jpg-png.png" alt="convert JPG to PNG">}}
 

[JPEG][2] and [PNG][3] are among the popular raster image formats and are popular for their methods of lossy compression. You get the option to adjust the compression level to achieve the desired quality level and at the same time reduce the storage size. However, sometimes your system only accepts a particular format, so you need to load your existing set of images and save them to the desired output. Instead of using conventional applications with limited features and incurring manual provision of input files, programming APIs stay one step ahead due to their flexibility and the capabilities to perform all the operations in a batch format.

  * [Image processing API][4]
  * [Convert JPG to PNG in C#][5]
  * [JPG to PDF conversion in C#][6]

## Image processing API {#Image-processing-API}

<div class="wp-block-image">
  

{{< figure align=center src="images/Screenshot-2021-04-16-at-4.09.29-PM.png" alt="">}}

</div>

Aspose.Imaging for .NET is an amazing programming API offering the capabilities to create, manipulate and convert [supported file formats][7]. It functions independently of other graphics applications and does not require any image editor to be installed on the machine. It can be used with ASP.NET web applications or Windows desktop applications. [Aspose.Imaging for .NET][8] is bundled inside [Conholdate.Total for .NET][9] suite. So if you have purchased a subscription for [Conholdate.Total for .NET][9], then you definitely can perform all the image processing operations using [Aspose.Imaging for .NET][8] API.

In order to use the API, the first step is its installation. You may follow either of the steps to perform the installation.

  * Download [DLL files][10] and manually reference them in your project
  * Open [NuGet][11] package manager, search for **Aspose.Imaging** and install it.
  * Run the following command from the NuGet Package Manager Console

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">Install-Package Aspose.Imaging</pre>

## Convert JPG to PNG in C# {#Convert-JPG-to-PNG-in-C-}

The API is robust enough to identify the format of the input image and you only need to specify the source image either in the form of a Stream instance or by providing the path to the file on the local system. In the following steps, we are going to explain how to load a [JPEG][12] image and save the output in [PNG][13] format.

  1. First of all, we need to create an instance of [Aspose.Imaging.License][14] object. Call the [SetLicense(&#8230;)][15] and provide the path of Conholdate.Total.NET.lic file as an argument
  2. Secondly, create an object of [Image][16] class which is a base class of all image types, and pass the result of Aspose.Imaging.Image.Load(..) method which takes the Steam or string path of an image file to be loaded
  3. Create an instance of PngOptions class
  4. Finally, call the [Save(String)][17] method of the [Image][16] class and pass the location where you want to save the resultant [PNG][13] file

{{< gist conholdate-gists f256c562ad7f6f9c83a7ae04871ec4c6 "Examples-DotNET-CSharp-JPG-to-PNG-1.cs" >}}

The PngOptions class also provides various properties and in the example below, we have specified to generate the color type of resultant image as Grayscale. Also, the compression level for a resultant image is specified as 4. Please note that the **CompressionLevel** property accepts values between 0-9 where 9 is maximum compression and 0 is the default value.

{{< gist conholdate-gists f256c562ad7f6f9c83a7ae04871ec4c6 "Examples-DotNET-CSharp-JPG-to-PNG-Grayscale-1.cs" >}}

The source file and resultant grayscale image can be downloaded from following links

  * [samsung_gaalxy.jpg][18]
  * [Grayscale.png][19]

## JPG to PDF conversion in C# {#JPG-to-PDF-conversion-in-Csharp}

Aspose.Imaging for .NET is equally capable of converting JPG images to [PDF][20] (Portable Document Format). During the conversion, you also get the capabilities to set DocumentInfo as well as [PDF/A][21] compliance details. The following steps explain the process of loading raster images and their conversion to [PDF][20] format.

  1. The first step is to create an instance of the [License][14] class.
  2. Secondly, call the [SetLicense(&#8230;)][15] method and provide the path of Conholdate.Total.NET.lic file. The license is initialized to eliminate all the restrictions which are present in the evaluation version
  3. Thirdly, create an object of [Image][16] class which is a base class of all image types, and pass the output of [Aspose.Imaging.Image.Load(..)][22] method
  4. Now create an instance of [PdfOptions][23] class
  5. In order to set PDF document information such as Author, Title, Subject, etc, create an object of [PdfDocumentInfo][24] class and pass its value to [PdfDocumentInfo][25] object of [PdfOptions][23] class
  6. Now in order to save the PDF file with PDF/A compliance information, please create an instance of [PdfCoreOptions][26] class and associate it with [PdfCoreOptions][27] property of [PdfOptions][23] object
  7. Finally, call the [Save(String)][17] method of the [Image][16] class to generate the output PDF document

{{< gist conholdate-gists f256c562ad7f6f9c83a7ae04871ec4c6 "Examples-DotNET-CSharp-JPG-to-PDF-1.cs" >}}

The sample files used in the above example can be downloaded from the following links

  * [samsung_gaalxy.jpg][18]
  * [_output.pdf][28]

## Get a Free License

You may request&nbsp;<a rel="noreferrer noopener" href="https://purchase.aspose.com/temporary-license" >a free temporary license</a>&nbsp;to try the API without any evaluation limitations.

## Conclusion

In this article, we have discussed the various capabilities of [Aspose.Imaging for .NET][8] specifically to convert JPG to PNG format as well as their rendering to PDF format. Please note that [Aspose.Imaging for .NET][8] is way more powerful and offers a plethora of options, comparing to what has been discussed above. It enables your .NET applications to draw as well as perform basic to advanced level processing of raster & vector images.

Furthermore, [Aspose.Imaging for .NET][8] offers robust image compression and high processing speed through native byte access and a range of efficient algorithms. It not only manipulate, export and convert images but also lets you dynamically draw objects using pixel manipulation and Graphics Path. For more information, please explore product [documentation][29] and in case you encounter any issue while using the API, please feel free to contact via the [product support forum][30].

## See Also

  * [Convert GIF to DICOM and JPEG to PNG using C# .NET REST API][31]
  * [Object recognition through images using Java Cloud SDK][32]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/jpg-png.png
 [2]: https://wiki.fileformat.com/image/jpeg/
 [3]: https://wiki.fileformat.com/image/png/
 [4]: #Image-processing-API
 [5]: #Convert-JPG-to-PNG-in-C-
 [6]: #JPG-to-PDF-conversion-in-Csharp
 [7]: https://docs.aspose.com/imaging/net/supported-file-formats/
 [8]: https://products.aspose.com/imaging/net
 [9]: https://products.conholdate.com/total/net
 [10]: https://downloads.aspose.com/imaging/net
 [11]: https://www.nuget.org/packages/Aspose.Imaging/
 [12]: https://docs.fileformat.com/image/jpeg/
 [13]: https://docs.fileformat.com/image/png/
 [14]: https://apireference.aspose.com/imaging/net/aspose.imaging/license
 [15]: https://apireference.aspose.com/imaging/net/aspose.imaging.license/setlicense/methods/1
 [16]: https://apireference.aspose.com/imaging/net/aspose.imaging/image
 [17]: https://apireference.aspose.com/imaging/net/aspose.imaging.datastreamsupporter/save/methods/2
 [18]: https://www.dropbox.com/s/g2fobiwgjhvftfw/samsung_galaxy.jpg?dl=0
 [19]: https://www.dropbox.com/s/zrm1oxdetnpuogc/Grayscale.png?dl=0
 [20]: https://docs.fileformat.com/pdf/
 [21]: https://docs.fileformat.com/pdf/a/
 [22]: https://apireference.aspose.com/imaging/net/aspose.imaging.image/load/methods/2
 [23]: https://apireference.aspose.com/imaging/net/aspose.imaging.imageoptions/pdfoptions
 [24]: https://apireference.aspose.com/imaging/net/aspose.imaging.fileformats.pdf/pdfdocumentinfo
 [25]: https://apireference.aspose.com/imaging/net/aspose.imaging.imageoptions/pdfoptions/properties/pdfdocumentinfo
 [26]: https://apireference.aspose.com/imaging/net/aspose.imaging.fileformats.pdf/pdfcoreoptions
 [27]: https://apireference.aspose.com/imaging/net/aspose.imaging.imageoptions/pdfoptions/properties/pdfcoreoptions
 [28]: https://www.dropbox.com/s/pusa3gzj3umqjn6/_output.pdf?dl=0
 [29]: https://docs.aspose.com/imaging/net/
 [30]: https://forum.aspose.com/c/imaging/14
 [31]: https://blog.aspose.cloud/2021/04/04/convert-gif-to-dicom-and-jpeg-to-png-using-c-.net-rest-api/
 [32]: https://blog.aspose.cloud/2020/07/01/object-recognition-through-images-using-java-cloud-sdk/




