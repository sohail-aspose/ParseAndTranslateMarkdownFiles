---
title: 'Convert PDF to HTML using C#'
author: Muzammil Khan
date: 2021-12-07T13:24:11+00:00
summary: 'As a C# developer, you can easily convert your PDF documents to HTML webpages. In this article, you will learn <strong>how to convert PDF documents to HTML webpages using C#</strong>.'
url: /2021/12/07/convert-pdf-to-html-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'CSharp .NET API for PDF to HTML'
  - Convert PDF to HTML
  - 'Convert PDF to HTML using CSharp'
  - PDF to HTML

---


{{< figure align=center src="images/convert-pdf-to-html-using-csharp.jpg" alt="Convert PDF to HTML using C#">}}
 

[PDF][2]&nbsp;is the most popular format for sharing and printing documents. In certain cases, we may need to convert PDF documents to [HTML][3] webpages. Such conversion helps to share the content of PDF documents so that relevant stakeholders could view them in any browser easily.&nbsp;In this article, we will learn&nbsp;**how to convert PDF documents to HTML webpages using C#**.

The following topics shall be covered in this article:

  * [C# API to Convert PDF to HTML — Free Download][4]
  * [PDF to HTML Conversion using C#][5]
  * [Convert Range of Pages from PDF to HTML][6]
  * [Convert Specific Pages of PDF to HTML][7]
  * [PDF to HTML Conversion with Watermark in C#][8]

## C# API to Convert PDF to HTML — Free Download {#CSharp-API-to-Convert-PDF-to-HTML-Free-Download}

We will be using [GroupDocs.Conversion for .NET][9] API to convert PDF to HTML. It provides fast, efficient, and reliable file conversion solutions to end-users. Please either [download][10] the DLL of the API or install it using [NuGet][11].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Conversion</code></pre>

## PDF to HTML Conversion using C# {#PDF-to-HTML-Conversion-using-CSharp}

We can easily convert PDF documents to HTML webpages programmatically by following the simple steps given below:

  1. Firstly, load a PDF document using the&nbsp;**_[Converter][12]_**&nbsp;class with input file path as argument. It is the main class that controls the document conversion process.
  2. Next, create an instance of the&nbsp;[**_MarkupConvertOptions_**][13] class. It provides various options for conversion to Markup file types. 
  3. Then, optionally set various convert options such as&nbsp;_FixedLayout_,&nbsp;_FixedLayoutShowBorders_, etc.
  4. Finally, call the&nbsp;_**[Converter.Convert()][14]**&nbsp;_method to save the converted HTML file. This method takes the path of the output file and convert options as an argument.

The following&nbsp;code sample shows&nbsp;**how to convert **a PDF document** to an HTML webpage using C#**.

{{< gist conholdate-gists 0ced0101511adb959e3e13bdaff191cd "ConvertPDFtoHTML_CSharp_Convert.cs" >}}

{{< figure align=center src="images/Convert-PDF-to-HTML-in-CSharp-1024x512.jpg" alt="Convert PDF to HTML in C#." caption="Convert PDF to HTML in C#.">}}
 

## Convert Range of Pages from PDF to HTML {#Convert-Range-of-Pages-from-PDF-to-HTML-in-CSharp}

We can convert a range of pages of a PDF document to HTML programmatically by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;**_[Converter][12]_**&nbsp;class with input file path as argument.
  2. Next, create an instance of the&nbsp;[**_MarkupConvertOptions_**][13] class.
  3. Then, set page number to start conversion from
  4. After that, set pages count to convert total number of pages
  5. Finally, call the&nbsp;_**[Converter.Convert()][14]**&nbsp;_method with output file path and convert options to save the converted HTML file.

The following&nbsp;code sample shows&nbsp;**how to convert **a range of pages from a PDF document** to an HTML file in C#.**

{{< gist conholdate-gists 0ced0101511adb959e3e13bdaff191cd "ConvertPDFtoHTML_CSharp_ConvertPagesRange.cs" >}}

## Convert Specific Pages of PDF to HTML {#Convert-Specific-Pages-of-PDF-to-HTML-in-CSharp}

We can convert specific pages of a PDF document to HTML by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;**_[Converter][12]_**&nbsp;class with input file path as argument.
  2. Next, create an instance of the&nbsp;[**_MarkupConvertOptions_**][13] class.
  3. Then, provide specific page numbers in a comma-separated list to convert.
  4. Finally, call the&nbsp;_**[Converter.Convert()][14]**&nbsp;_method with output file path and convert options to save the converted HTML file.

The following&nbsp;code sample shows&nbsp;**how to convert **specific pages of a PDF document** to an HTML file in C#.**

{{< gist conholdate-gists 0ced0101511adb959e3e13bdaff191cd "ConvertPDFtoHTML_CSharp_ConvertSpecificPages.cs" >}}

## PDF to HTML Conversion with Watermark in C# {#PDF-to-HTML-Conversion-with-Watermark-in-CSharp}

We can convert PDF documents to HTML webpages and add watermarks to converted HTML files programmatically by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;**_[Converter][12]_**&nbsp;class with input file path as argument.
  2. Next, create an instance of the _**[WatermarkOptions][16]**_ class.
  3. Then, set various options such as&nbsp;_Text_,&nbsp;_Color_,&nbsp;_Width_,&nbsp;_Height_,&nbsp;_Font_, etc.
  4. Next, create an instance of the&nbsp;[**_MarkupConvertOptions_**][13] class.
  5. After that, assign _**WatermarkOptions**_ to **_MarkupConvertOptions_**.
  6. Finally, call the&nbsp;_**[Converter.Convert()][14]**&nbsp;_method with output file path and convert options to save the converted HTML file.

The following&nbsp;code sample shows&nbsp;**how to convert a PDF document to an HTML document with a watermark**.

{{< gist conholdate-gists 0ced0101511adb959e3e13bdaff191cd "ConvertPDFtoHTML_CSharp_ConvertWithWatermark.cs" >}}

{{< figure align=center src="images/PDF-to-HTML-Conversion-with-Watermark-in-CSharp-1024x880.jpg" alt="PDF to HTML Conversion with Watermark in C#." caption="PDF to HTML Conversion with Watermark in C#.">}}
 

## Get a Free License

Please try the API without evaluation limitations by requesting&nbsp;[a free temporary license][18].

## Conclusion

In this article, we have learned **how to convert PDF documents to HTML webpages in C#**. We have also seen **how to convert specific pages of a PDF to HTML and add a watermark to the converted file** programmatically. Besides, you can learn more about GroupDocs.Conversion for .NET API using the [documentation][19]. In case of any ambiguity, please feel free to contact us on the [forum][20].

## See Also

  * [Convert PDF to Images using C#][21]
  * [Convert PDF to Excel using C#][22]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/convert-pdf-to-html-using-csharp.jpg
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://docs.fileformat.com/web/html/
 [4]: #CSharp-API-to-Convert-PDF-to-HTML-Free-Download
 [5]: #PDF-to-HTML-Conversion-using-CSharp
 [6]: #Convert-Range-of-Pages-from-PDF-to-HTML-in-CSharp
 [7]: #Convert-Specific-Pages-of-PDF-to-HTML-in-CSharp
 [8]: #PDF-to-HTML-Conversion-with-Watermark-in-CSharp
 [9]: https://products.groupdocs.com/conversion/net
 [10]: https://downloads.groupdocs.com/conversion/net
 [11]: https://www.nuget.org/packages/groupdocs.conversion
 [12]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion/Converter
 [13]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/markupconvertoptions
 [14]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.converter/convert/methods/16
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Convert-PDF-to-HTML-in-CSharp.jpg
 [16]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/WatermarkOptions
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/PDF-to-HTML-Conversion-with-Watermark-in-CSharp.jpg
 [18]: https://purchase.conholdate.com/temporary-license
 [19]: https://docs.groupdocs.com/conversion/net/
 [20]: https://forum.groupdocs.com/c/conversion/11
 [21]: https://blog.conholdate.com/2021/09/23/convert-pdf-to-images-using-csharp/
 [22]: https://blog.conholdate.com/2021/03/31/convert-pdf-to-excel-using-csharp/




