---
title: Create ASP.NET PDF Editor with Barcode Features
author: Muhammad Sohail
date: 2020-07-10T23:31:48+00:00
url: /2020/07/10/create-asp.net-pdf-editor-with-barcode-features/
categories:
  - Conholdate.Total Product Family
tags:
  - asp.net pdf editor
  - asp.net pdf editor with barcode
  - create pdf with barcode in asp.net
  - generate pdf invoices with barcode

---
The [PDF][1] (Portable Document Format) has become one of the widely used formats in the world of digital documents. Various industries are using PDF format to generate their reports, invoices, bills, and other types of business documents. The barcode, on the other hand, has become an essential part of the business that contains information in a machine-readable form. These days, you may even find a barcode on your bills and invoices. In this article, I&#8217;ll present a use case where you need to create a PDF file and embed a barcode on it, for example, when generating an invoice. For the demonstration, I&#8217;ll create an ASP.NET PDF Editor using which you will be able to generate the PDF files and barcodes using C# within ASP.NET Core web application.

This ASP.NET web application will have the following features:

  * A WYSIWYG editor to write the content of the PDF document.
  * Option to generate a barcode based on provided text.
  * Option to set the desired symbology of the barcode.

## Prerequisites for Generating PDFs having Barcode in ASP.NET

The following are the tools and APIs that you would need to create the ASP.NET PDF Editor having barcode features.

  * Visual Studio 2017 or later.
  * [Aspose.PDF for .NET][2] &#8211; A .NET PDF API.
  * [Aspose.BarCode for .NET][3] &#8211; .NET Barcode Generator and Scanner API.

## Create ASP.NET PDF Editor with Barcode Features

Let&#8217;s begin our journey and see how to create our ASP.NET PDF Editor that will let to generate PDF and embed barcode with a single click. 

  * Create a new&nbsp;**ASP.NET Core Web Application**&nbsp;in Visual Studio. 

{{< figure align=center src="images/ASP.NET-Core-MVC-Web-Application.jpg" alt="Create ASP.NET Core web application">}}
 

  * Select&nbsp;**Web Application (Model-View-Controller)**&nbsp;from the templates.

{{< figure align=center src="images/MVC-Project-Template.jpg" alt="ASP.NET MVC">}}
 

  * Install the packages of&nbsp;**Aspose.PDF**, **Aspose.BarCode**&nbsp;and&nbsp;**CKEditor**.

{{< figure align=center src="images/NPM-.jpg" alt="Add Aspose .NET PDF and Barcode APIs">}}
 

  * Download the CKEditor’s&nbsp;[package][4], extract it, and copy/paste the folder in&nbsp;**wwwroot**&nbsp;directory. You can also integrate any of your favorite WYSIWYG HTML editors based on your requirement.

  * Add the following script in **Views/Home/index.cshtml** view. 

<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">@{
    ViewData["Title"] = "PDF Creator";
}
&lt;script src="~/ckeditor/ckeditor.js"&gt;&lt;/script&gt;
&lt;br /&gt;
&lt;form method="post"&gt;
    &lt;div class="row"&gt;
        &lt;div class="col-md-12"&gt;
            &lt;textarea name="editor1" id="editor1" rows="80" cols="80"&gt;
                Start creating your PDF document.
            &lt;/textarea&gt;
            &lt;br /&gt;
            &lt;script&gt;
                // Replace the &lt;textarea id="editor1"&gt; with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace('editor1');
            &lt;/script&gt;
        &lt;/div&gt;
        &lt;hr /&gt;
    &lt;/div&gt;
    &lt;div class="row"&gt;
        &lt;div class="col-md-12"&gt;
            &lt;h3&gt;Create a Barcode&lt;/h3&gt;
        &lt;/div&gt;
    &lt;/div&gt;
    &lt;hr /&gt;
    &lt;div class="row"&gt;
        &lt;div class="col-md-9 form-horizontal" align="center"&gt;
            &lt;div class="form-group"&gt;
                &lt;label class="control-label col-sm-2" for="CodeText"&gt;Code Text&lt;/label&gt;
                &lt;div class="col-sm-10"&gt;
                    &lt;input class="form-control" type="text" name="codeText" id="codeText" placeholder="Code text" /&gt;
                &lt;/div&gt;
            &lt;/div&gt;
            &lt;div class="form-group"&gt;
                &lt;label class="control-label col-sm-2" for="barcodeType"&gt;Symbology&lt;/label&gt;
                &lt;div class="col-sm-10"&gt;
                    &lt;select name="barcodeType" class="form-control"&gt;
                        &lt;option value="Code128"&gt;Code128&lt;/option&gt;
                        &lt;option value="Code11"&gt;Code11&lt;/option&gt;
                        &lt;option value="QR"&gt;QR&lt;/option&gt;
                        &lt;option value="Pdf417"&gt;Pdf417&lt;/option&gt;
                        &lt;option value="Datamatrix"&gt;Datamatrix&lt;/option&gt;
                    &lt;/select&gt;
                &lt;/div&gt;
            &lt;/div&gt;
        &lt;/div&gt;
    &lt;/div&gt;
    &lt;hr /&gt;
    &lt;div class="row"&gt;
        &lt;div class="col-md-12" align="center"&gt;
            &lt;input type="submit" class="btn btn-lg btn-success" value="Generate PDF" /&gt;
        &lt;/div&gt;
    &lt;/div&gt;
&lt;/form&gt;</pre>

  * Add the following methods in **Controllers/HomeController.cs**.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">[HttpPost]
public FileResult Index(string editor1, string codeText, string barcodeType)
{
	// generate a barcode
	string barcodeImagePath = Path.Combine("wwwroot/barcodes/", Guid.NewGuid() + ".png");
	SymbologyEncodeType type = GetBarcodeSymbology(barcodeType);
	BarcodeGenerator generator = new BarcodeGenerator(type, codeText);
	generator.Parameters.BackColor = System.Drawing.Color.Transparent;
	// set resolution of the barcode image
	generator.Parameters.Resolution = 200;
	// generate barcode
	generator.Save(barcodeImagePath, BarCodeImageFormat.Png);

	// create a unique file name for PDF
	string fileName = Guid.NewGuid() + ".pdf";
	// convert HTML text to stream
	byte[] byteArray = Encoding.UTF8.GetBytes(editor1);
	// generate PDF from the HTML
	MemoryStream stream = new MemoryStream(byteArray);
	HtmlLoadOptions options = new HtmlLoadOptions();
	Document pdfDocument = new Document(stream, options);

	// add barcode image to the generated PDF 
	pdfDocument = InsertImage(pdfDocument, barcodeImagePath);

	// create memory stream for the PDF file
	Stream outputStream = new MemoryStream();
	// save PDF to output stream
	pdfDocument.Save(outputStream);

	// return generated PDF file
	return File(outputStream, System.Net.Mime.MediaTypeNames.Application.Pdf, fileName);
}
private SymbologyEncodeType GetBarcodeSymbology(string symbology)
{
	if (symbology.ToLower() == "qr")
		return EncodeTypes.QR;
	else if (symbology.ToLower() == "code128")
		return EncodeTypes.Code128;
	else if (symbology.ToLower() == "code11")
		return EncodeTypes.Code11;
	else if (symbology.ToLower() == "pdf417")
		return EncodeTypes.Pdf417;
	else if (symbology.ToLower() == "datamatrix")
		return EncodeTypes.DataMatrix;
	else
		return EncodeTypes.Code128; // default barcode type
}
private Document InsertImage(Document document, string barcodeImagePath)
{
	// get page from Pages collection of PDF file
	Aspose.Pdf.Page page = document.Pages[1];
	// create an image instance
	Aspose.Pdf.Image img = new Aspose.Pdf.Image();
	img.IsInLineParagraph = true;
	// set Image Width and Height in Points
	img.FixWidth = 100;
	img.FixHeight = 100;
	img.HorizontalAlignment = HorizontalAlignment.Right;
	img.VerticalAlignment = VerticalAlignment.Top;
	// set image type as SVG
	img.FileType = Aspose.Pdf.ImageFileType.Unknown;
	// path for source barcode image file
	img.File = barcodeImagePath;
	page.Paragraphs.Add(img);
	// return updated PDF document
	return document;
}</pre>

  * Build the application and run it in your favorite browser. 

{{< figure align=center src="images/Generate-PDF-with-Barcode-in-ASP.NET_.jpg" alt="ASP.NET PDF Editor with Barcode Features">}}
 

## Generating a PDF with ASP.NET PDF Editor

The following are the steps as well as the demonstration of how to generate a PDF file and embed a barcode with a single click.

  * Write or copy/paste the content of the PDF document in the editor area.
  * Set the code text to generate the barcode.
  * Select your desired barcode symbology (see all [supported barcode symbologies][5]).
  * Click the **Generate PDF** button to create the PDF having a barcode on it.<figure class="wp-block-embed-youtube wp-block-embed is-type-video is-provider-youtube wp-embed-aspect-4-3 wp-has-aspect-ratio">

<div class="wp-block-embed__wrapper">
</div></figure> 

## Download Source Code

You can download the complete source code of this ASP.NET PDF Editor from [here][6].

## Try Aspose APIs for Free

Get your [temporary license][7] and try our APIs for free for one month. 

## See Also

  * [Create your own Google Docs like application in ASP.NET][8]

 [1]: https://docs.fileformat.com/pdf/
 [2]: https://products.aspose.com/pdf/net
 [3]: https://products.aspose.com/barcode/net
 [4]: https://ckeditor.com/ckeditor-4/download/
 [5]: https://docs.aspose.com/display/barcodenet/Barcode+Supported+Symbologies
 [6]: https://github.com/usman-aziz/ASP.NET-PDF-Editor-with-Barcode
 [7]: https://purchase.conholdate.com/temporary-license
 [8]: https://blog.conholdate.com/2020/06/22/build-your-own-google-docs-like-app/




