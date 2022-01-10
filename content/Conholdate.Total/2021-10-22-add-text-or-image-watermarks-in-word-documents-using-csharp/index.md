---
title: 'Add Text or Image Watermarks in Word Documents using C#'
author: Muzammil Khan
date: 2021-10-22T10:35:19+00:00
summary: 'As a C# developer, you can easily add text or image watermarks in Word documents programmatically. In this article, you will learn <strong>how to add text or image watermarks in Word documents using C#.</strong>'
url: /2021/10/22/add-text-or-image-watermarks-in-word-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Add Image Watermark using C#'
  - 'Add Text Watermark using C#'
  - Add Watermark
  - Add Watermark Image

---


{{< figure align=center src="images/add-text-or-image-watermarks-in-word-documents-using-csharp.jpg" alt="Add Text or Image Watermarks in Word Documents using C#">}}
 

As a C# developer, you can easily add text or image watermarks in Word documents programmatically. A watermark is a sort of message in the form of text or an image, usually used to identify or protect the documents by showing copyright information, disclaimer, logo, stamp, or signature. In this article, you will learn&nbsp;**how to add text or image watermarks in Word documents using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Add Watermark in Word Documents][2]
  * [Add Text Watermark in Word Documents using C#][3]
  * [Add Image Watermark in Word Documents using C#][4]
  * [Watermark the Images of a Word Document using C#][5]
  * [Add Watermark to Specific Pages in Word Documents using C#][6]
  * [Add Watermark to Header or Footer of Word Documents using C#][7]

## C# API to Add Watermark in Word Documents {#CSharp-API-to-Add-Watermark-in-Word-Documents}

For adding text or image watermarks in [DOC][8] or [DOCX][9]&nbsp;files, we will be using&nbsp;[GroupDocs.Watermark for .NET][10]&nbsp;API. It enables you to add, edit, search and remove image and text watermarks in [supported file formats][11]. It also allows obtaining the basic information about source documents such as file type, size, pages count, page height and width, etc. The document preview feature of the API allows generating image representations of document pages for a better understanding of the document.

You can either&nbsp;[download][12]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][13].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Watermark</code></pre>

## Add Text Watermark in Word Documents using C# {#Add-Text-Watermark-in-Word-Documents-using-CSharp}

You can add a text watermark to Word documents by following the steps given below:

  * Firstly, load the DOCX file using the&nbsp;[Watermarker][14]&nbsp;class.
  * Initialize the font to be used for watermark text using the [Font][15] class.
  * Create an instance of the [TextWatermark][16] class to create a text watermark. Pass the text to show as watermark and defined font object as input parameters.
  * Now, set various [watermark properties][17] such as Foreground Color, Background Color, Rotate Angle, Height, Width, Opacity, etc.
  * Then, call the [Watermarker.Add()][18] method to add the text watermark to the document.
  * Finally, call the [Watermarker.Save()][19] method to save the watermarked Word document.

The following code sample shows **how to add a text watermark in a DOCX file using C#**.

{{< gist conholdate-gists c8f2a9a3364bda3b3656eca5cdc7d466 "AddWatermarksToDOCX_CSharp_AddTextWatermark.cs" >}}

{{< figure align=center src="images/Add-Text-Watermark-in-Word-Documents-using-CSharp-1024x620.jpg" alt="Add Text Watermark in Word Documents using C#." caption="Add Text Watermark in Word Documents using C#">}}
 

## Add Image Watermark in Word Documents using C# {#Add-Image-Watermark-in-Word-Documents-using-CSharp}

You can add an image as a watermark to Word documents by following the steps given below:

  * Firstly, load the DOCX file using the&nbsp;[Watermarker][14]&nbsp;class.
  * Create an instance of the [ImageWatermark][21] class with the image path to create an image watermark.
  * Now, set various [watermark properties][17] such as Alignment, Height, Width, etc.
  * Then, call the [Watermarker.Add()][18] method to add the image watermark to the document.
  * Finally, call the [Watermarker.Save()][19] method to save the watermarked Word document.

The following code sample shows **how to add an image watermark in a DOCX file using C#**.

{{< gist conholdate-gists c8f2a9a3364bda3b3656eca5cdc7d466 "AddWatermarksToDOCX_CSharp_AddImageWatermark.cs" >}}

{{< figure align=center src="images/Add-Image-Watermark-in-Word-Documents-using-CSharp-1024x617.jpg" alt="Add Image Watermark in Word Documents using C#." caption="Add Image Watermark in Word Documents using C#">}}
 

## Watermark the Images of a Word Document using C# {#Watermark-Images-in-Word-Documents-using-CSharp}

You can add text watermark to the images in Word documents by following the steps given below:

  * Firstly, load the DOCX file using the&nbsp;[Watermarker][14]&nbsp;class.
  * Create an instance of the [TextWatermark][16] class to create a text watermark. Pass the text to show as watermark and the font to be used for watermark text using the [Font][15] class as input parameters.
  * Now, set various [watermark properties][17] e.g. Foreground Color, Alignment, Rotate Angle, Scale Factor, etc.
  * Then, Call the&nbsp;[Watermarker.GetImages()][23] method to find all images in the document and get results in the [WatermarkableImageCollection][24] class object.
  * For each image in WatermarkableImageCollection, add watermark by calling the [WatermarkableImage.Add()][25] method with the TextWatermark object.
  * Finally, call the [Watermarker.Save()][19] method to save the watermarked Word document.

The following code sample shows **how to add a text watermark to the images in a DOCX file using C#**.

{{< gist conholdate-gists c8f2a9a3364bda3b3656eca5cdc7d466 "AddWatermarksToDOCX_CSharp_AddWatermarkToImages.cs" >}}

{{< figure align=center src="images/Watermark-Images-in-Word-Documents-using-CSharp-1024x925.jpg" alt="Watermark Images in Word Documents using C#." caption="Watermark Images in Word Documents using C#.">}}
 

## Add Watermark to Specific Pages in Word Documents using C# {#Add-Watermark-to-Specific-Pages-in-Word-Documents-using-CSharp}

You can add watermark to a specific page of the Word document by following the steps given below:

  * Firstly, load the DOCX file using the&nbsp;[Watermarker][14]&nbsp;class.
  * Initialize the font to be used for watermark text using the [Font][15] class.
  * Create an instance of the [TextWatermark][16] class to create a text watermark. Pass the text to show as watermark and defined font object as input parameters.
  * Now, set various [watermark properties][17] such as Foreground Color, Background Color, Alignment, etc.
  * Create an instance of the [WordProcessingWatermarkPagesOptions][27] class
  * Now, set the [PageNumbers][28] to add the watermark. You can set a single page number or a comma separated list of page numbers. We set it to the [WordProcessingContent.PageCount][29] which indicates the last page of the document here.
  * Then, call the [Watermarker.Add()][18] method to add the defined watermark.
  * Finally, call the [Watermarker.Save()][19] method to save the watermarked Word document.

The following code sample shows **how to add a text watermark to a specific page in a DOCX file using C#**.

{{< gist conholdate-gists c8f2a9a3364bda3b3656eca5cdc7d466 "AddWatermarksToDOCX_CSharp_AddWatermarkToSpecificPages.cs" >}}

## Add Watermark to Header or Footer of Word Documents using C# {#Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp}

You can add a watermark to the header or footer sections of the Word documents by following the steps given below:

  * Firstly, load the DOCX file using the&nbsp;[Watermarker][14]&nbsp;class.
  * Create an instance of the [ImageWatermark][21] class with the image path to create an image watermark.
  * Then, set various [watermark properties][17] such as Alignment, Height, Width, etc.
  * Create an instance of the [WordProcessingWatermarkSectionOptions][30] class.
  * Now, set the [WordProcessingWatermarkSectionOptions.SectionIndex][31] to 0 to add watermark to the first section of the document.
  * Then, call the [Watermarker.Add()][18] method to add the image watermark to first section.
  * Call the&nbsp;[Watermarker.GetContent()][32]&nbsp;method to get the content for the loaded document and get results in the&nbsp;[WordProcessingContent][33]&nbsp;class object.
  * Loop through all the sections and call the [LinkToPrevious()][34] method with true boolean value as input parameter. It will link all headers and footers of all the sections with the first section.
  * Finally, call the [Watermarker.Save()][19] method to save the watermarked Word document.

The following code sample shows **how to add a watermark to a header or footer section in a DOCX file using C#**.

{{< gist conholdate-gists c8f2a9a3364bda3b3656eca5cdc7d466 "AddWatermarksToDOCX_CSharp_AddWatermarkToHeaderFooter.cs" >}}

{{< figure align=center src="images/Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp-1024x603.jpg" alt="Add Watermark to Header or Footer of Word Documents using C#." caption="Add Watermark to Header or Footer of Word Documents using C#.">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][36].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;add text or image watermark in the Word documents using C#**. Moreover, you have seen&nbsp;**how to add watermark to a specific page of a Word document**&nbsp;programmatically. This article also explained&nbsp;**how to add watermark to images in the DOCX file** using C#. Besides, you can learn more about GroupDocs.Watermark for .NET API using the&nbsp;[documentation][37]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][38].

## See Also

  * [Add Watermark to PDF using C#][39]
  * [Add Watermark to Presentations in C#][40]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/add-text-or-image-watermarks-in-word-documents-using-csharp.jpg
 [2]: #CSharp-API-to-Add-Watermark-in-Word-Documents
 [3]: #Add-Text-Watermark-in-Word-Documents-using-CSharp
 [4]: #Add-Image-Watermark-in-Word-Documents-using-CSharp
 [5]: #Watermark-Images-in-Word-Documents-using-CSharp
 [6]: #Add-Watermark-to-Specific-Pages-in-Word-Documents-using-CSharp
 [7]: #Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp
 [8]: https://docs.fileformat.com/word-processing/doc
 [9]: https://docs.fileformat.com/word-processing/docx
 [10]: https://products.groupdocs.com/watermark/java
 [11]: https://docs.groupdocs.com/watermark/net/supported-document-formats/
 [12]: https://downloads.groupdocs.com/watermark/net
 [13]: https://www.nuget.org/packages/groupdocs.watermark
 [14]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/Watermarker
 [15]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/font
 [16]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/textwatermark
 [17]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/textwatermark/properties/index
 [18]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/watermarker/methods/add
 [19]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarker/save/methods/4
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Text-Watermark-in-Word-Documents-using-CSharp.jpg
 [21]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/imagewatermark
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Image-Watermark-in-Word-Documents-using-CSharp.jpg
 [23]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/watermarker/methods/getimages
 [24]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.image/watermarkableimagecollection
 [25]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.image/watermarkableimage/methods/add
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Watermark-Images-in-Word-Documents-using-CSharp.jpg
 [27]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarkpagesoptions
 [28]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarkpagesoptions/properties/pagenumbers
 [29]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.wordprocessing/wordprocessingcontent/properties/pagecount
 [30]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarksectionoptions
 [31]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarksectionoptions/properties/sectionindex
 [32]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/watermarker/methods/getcontent/_1
 [33]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.wordprocessing/wordprocessingcontent
 [34]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.wordprocessing/wordprocessingheaderfootercollection/methods/linktoprevious
 [35]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp.jpg
 [36]: https://purchase.groupdocs.com/temporary-license
 [37]: https://docs.groupdocs.com/watermark/net/
 [38]: https://forum.groupdocs.com/c/watermark/
 [39]: https://blog.groupdocs.com/2021/07/27/watermark-pdf-files-using-csharp/
 [40]: https://blog.groupdocs.com/2021/05/01/add-watermark-to-presentations-using-csharp/




