---
title: 'Convert HTML to PDF using C# .NET API'
author: Nayyer Shahbaz
date: 2021-04-08T17:54:18+00:00
url: /2021/04/08/convert-html-to-pdf-using-csharp-net-api/
categories:
  - Conholdate.Total Product Family
tags:
  - 'C# .NET API for PDF to HTML'
  - 'C# API to convert HTML to PDF'
  - Convert HTML to PDF
  - 'Convert PDF to HTML using C#'
  - HTML to PDF conversion API

---


{{< figure align=center src="images/icon-1.png" alt="PDF to HTML conversion">}}
 

The [PDF][2] (_Portable Document Format_) is one of the widely used document formats for cross-platform data and information sharing. One of its unique capabilities includes that a document&#8217;s fidelity stays intact when viewing on any platform using the application as per Adobe specifications. Furthermore, the [HTML][3] (_HyperText Markup Language_) is also a leading file format for web page development and most web browsers support this format. However, PDF is widely accepted as it can be easily viewed on any device without losing document formatting. Therefore, in this article, we are going to discuss steps on how to convert the [HTML][3] file to [PDF][2] format using .NET API.

  * [C# API to Convert HTML to PDF][4]
  * [Convert HTML to PDF in C#][5]
  * [Embed fonts during conversion][6]
  * [Convert Web pages to PDF][7]
  * [Render complete HTML on a single page][8]

## C# API to Convert HTML to PDF {#C--API-to-Convert-HTML-to-PDF}

In order to perform the conversion operation, first, we need to install [Aspose.PDF for .NET][9] on the system. The API is available on the [NuGet][10] library. Please run the following command on Package Manager Console to install it:

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">Install-Package Aspose.Pdf</pre>

Once the installation is complete, the Aspose.PDF for .NET will appear under the Packages folder in solution explorer. 

## Convert HTML to PDF in C# {#Convert-HTML-to-PDF-in-C-}

Given below are the steps on how you can Convert HTML to PDF using C#

<ol type="1">
  <li>
    Create an instance of the <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/license">License</a> class to remove any limitations during the PDF `file generation process
  </li>
  <li>
    Create an object of <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions">HtmlLoadOptions</a> class while passing input HTML base url as argument to <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions">HtmlLoadOptions</a>(&#8230;) constructor
  </li>
  <li>
    Initialize object of <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/document">Document</a> class and pass <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions">HtmlLoadOptions</a> object as an argument to its constructor
  </li>
  <li>
    Call <a href="https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4">Save</a>(&#8230;) method of Document object and render the output in PDF format
  </li>
</ol>

{{< gist conholdate-gists 6b7ce982069cbc65d037e262d1792d10 "Examples-DotNET-CSharp-HTML-to-PDF-Conversion-1.cs" >}}

## Embed fonts during conversion {#Embed-fonts-during-conversion}

Most HTML pages often use fonts (i.g. fonts from local folders, Google Fonts, etc), and in order to preserve the layout of pages, the same fonts shall be embedded during the rendering process. So in order to control the embedding of fonts in the resultant document, we need to use [IsEmbedFonts][11] property.

{{< gist conholdate-gists 6b7ce982069cbc65d037e262d1792d10 "Examples-DotNET-CSharp-Embed-Fonts-during-Conversion-1.cs" >}}

The unit of measurement in Aspose.PDF is Points. And, we know that A3 measures 297 × 420 millimeters or 11.69 × 16.54 inches. So, the dimensions are rounded off to 842 × 1190 points. In the following code snippet, we are adjusting the page size of the resultant document as A3 and page orientation as Landscape.

{{< gist conholdate-gists 6b7ce982069cbc65d037e262d1792d10 "Examples-DotNET-CSharp-Set-Page-Dimensions-during-Conversion-1.cs" >}}

## Convert Web page to PDF {#Convert-Web-page-to-PDF}

Other than the conversion of HTML files, we may also have a requirement to directly convert a web page to PDF format. So in order to accomplish this requirement, first we will fetch the remote Web page contents using the HttpClient instance, create a Stream object and then pass the Stream instance to the Document object. The reason we need the content in Stream is that the Document instance only accepts files or steam objects.

The following section explains the steps on how to convert a Web page to PDF using C# 

  1. Read the contents of the page using an [HttpClient][12] object
  2. Instantiate the&nbsp;[][13][HtmlLoadOptions][13]&nbsp;object and set the base URL
  3. Initialize a [Document][14] object and pass the stream object and [HtmlLoadOptions][13] instance as arguments
  4. Call the [Save(String)][15] method from the Document class to generate the output

{{< gist conholdate-gists 6b7ce982069cbc65d037e262d1792d10 "Examples-DotNET-CSharp-WebPage-to-PDF-Conversion-1.cs" >}}

## Render complete HTML on a single page {#Render-complete-HTML-on-a-single-page}

During the HTML to PDF conversion, the length of the resultant file is according to the content length of an input HTML document. Therefore, if the input HTML is comprised of multiple pages, then the resultant file will also span over multiple pages. However, we may confine the output to a single PDF page. In order to accomplish this requirement, the [IsRenderToSinglePage][16] property of HtmlLoadOptions class can be used.

Given below is the code snippet for rendering the complete HTML content on a single PDF page using C#.

{{< gist conholdate-gists 6b7ce982069cbc65d037e262d1792d10 "Examples-DotNET-CSharp-HTML-to-Single-Page-1.cs" >}}

## Get a Free License

You may request&nbsp;<a rel="noreferrer noopener" href="https://purchase.aspose.com/temporary-license" >a free temporary license</a>&nbsp;to try the API without any evaluation limitations.

## Conclusion {#Conclusion}

In this article, we have learned about the approach of converting HTML files to PDF format using .NET API. If you are further interested to learn about other exciting features being offered by Aspose.PDF for .NET, please visit the [Key features][17] page. A complete set of examples can be found over the [GitHub repository][18].

## Quick Tip

We have also developed free online applications to quickly check the features being offered by our APIs. So you may check the [Aspose.PDF Conversion App][19] to transform HTML file to PDF format. Furthermore, you may also use various other file formats and accomplish your conversion requirements.

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/icon-1.png
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://docs.fileformat.com/web/html/
 [4]: #C--API-to-Convert-HTML-to-PDF
 [5]: #Convert-HTML-to-PDF-in-C-
 [6]: #Embed-fonts-during-conversion
 [7]: #Convert-Web-page-to-PDF
 [8]: #Render-complete-HTML-on-a-single-page
 [9]: https://products.aspose.com/pdf/net
 [10]: https://www.nuget.org/packages/Aspose.PDF/
 [11]: https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions/properties/isembedfonts
 [12]: https://docs.microsoft.com/en-us/dotnet/api/system.net.http.httpclient?view=net-5.0
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions
 [14]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [15]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions/properties/isrendertosinglepage
 [17]: https://docs.aspose.com/pdf/net/key-features/
 [18]: https://github.com/aspose-pdf/Aspose.Pdf-for-.NET
 [19]: https://products.aspose.app/pdf/conversion




