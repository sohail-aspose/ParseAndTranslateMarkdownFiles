---
title: 'Convert PDF to Excel using C#'
author: Muzammil Khan
date: 2021-03-31T03:23:05+00:00
summary: 'Easily export tabular data from PDF files into Excel sheets (.xlsx or .xls) programmatically in your .NET application. In this article, you are going to learn <strong>how to convert PDF to Excel using C#</strong>. '
url: /2021/03/31/convert-pdf-to-excel-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - Convert PDF to Excel
  - Convert PDF to XLSX
  - Export Data from PDF to Excel
  - Export DataTable to Excel

---


{{< figure align=center src="images/Convert-PDF-to-Excel.jpg" alt="Convert PDF to Excel">}}
 

You can easily export tabular data from PDF files into Excel sheets (_.xlsx_ or _.xls_) programmatically in your .NET application. Such conversion is useful when you need to edit data or need to apply various calculations available in Excel. In this article, you are going to learn **how to convert PDF to Excel using C#**.

The following topics shall be covered in this article:

  * [C# API to Convert PDF to Excel][2]
  * [Convert PDF to Excel][3]

## C# API to Convert PDF to Excel {#net-conversion-api}

I will be using [GroupDocs.Conversion for .NET API][4] for the conversion of [PDF][5] to [XLSX][6]. This API provides a fast, efficient, and reliable file conversion solution into .NET applications without installing any external software. It also enables you to build powerful document conversion applications in C#, ASP.NET, and other .NET related technologies.

You can either&nbsp;[download][7]&nbsp;the DLL of the API or install it using [NuGet][8].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Conversion</code></pre>

## Convert PDF to Excel using C# {#convert-pdf-to-xlsx}

You can convert PDF documents to Excel by following the simple steps given below:

  1. Set _**[PdfLoadOptions][9]**_ if any apply.
  2. Set conversion options using&nbsp;_**[SpreadsheetConvertOptions][10]**_
  3. Create an instance of the _**[Converter][11]**_ class
  4. Provide the file path and load options
  5. Call the _**[Convert][12]**_ method along with the output file path and convert options

The following&nbsp;code sample shows&nbsp;**how to export tabular data from a PDF file into an Excel sheet using C#**.

{{< gist conholdate-gists 232e09604ed755b11d02e1c025524ac3 "ConvertPDFtoXLSX.cs" >}}

{{< figure align=center src="images/ConvertPDFtoXLSX-1024x484.jpg" alt="Convert PDF to XLSX" caption="Convert PDF to XLSX">}}
 

The **_PdfLoadOptions_** class provides various options for loading PDF documents. These&nbsp;[properties][14] include&nbsp;the **FlattenAllFields, HidePdfAnnotations, Password**, and&nbsp;**RemoveEmbeddedFiles**. You may find more details in the [documentation][15].

The **SpreadsheetConvertOptions** class provides certain [properties][16] for converting files from other formats to Spreadsheet file type. 

  * The **_PageNumber_** property defines the starting page number of the source document to convert. 
  * The **_PagesCount_** property defines the total number of pages to be converted starting from **_PageNumber_**. 
  * You may convert specific pages by providing a list of page indexes to **_Pages_** property. 
  * You can set a password for the converted file using the **_Password_** property. 
  * The **_Zoom_** property can be used to set the zoom level in percentage for the converted file. 
  * The **_Format_** property defines the output format of the converted file. 

You can find more details about &#8220;[converting to a spreadsheet with advanced options][17]&#8221; in the documentation.

## Get a Free License

You can try the API without evaluation limitations by requesting [a free temporary license][18].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;export table data from** **PDF documents to Excel sheets** using C#. You can learn even more about GroupDocs.Conversion .NET API using the&nbsp;[documentation][19]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][20].

## See Also

  * [Export Data to Excel in C#][21]
  * [Convert CAD Drawings to PDF in C# .NET][22]
  * [C# Convert WebP Images to JPG, PNG, TIFF & PDF][23]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/03/Convert-PDF-to-Excel.jpg
 [2]: #net-conversion-api
 [3]: #convert-pdf-to-xlsx
 [4]: https://products.groupdocs.com/conversion/net
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://docs.fileformat.com/spreadsheet/xlsx/
 [7]: https://downloads.groupdocs.com/conversion/net
 [8]: https://www.nuget.org/packages/GroupDocs.Conversion
 [9]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.load/pdfloadoptions
 [10]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/spreadsheetconvertoptions
 [11]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion/converter
 [12]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.converter/convert/methods/16
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/03/ConvertPDFtoXLSX.jpg
 [14]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.load/pdfloadoptions/properties/index
 [15]: https://docs.groupdocs.com/conversion/net/load-pdf-document-with-options/
 [16]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/spreadsheetconvertoptions/properties/index
 [17]: https://docs.groupdocs.com/conversion/net/convert-to-spreadsheet-with-advanced-options/
 [18]: https://purchase.groupdocs.com/temporary-license
 [19]: https://docs.groupdocs.com/conversion/net/
 [20]: https://forum.groupdocs.com/c/conversion/11
 [21]: https://blog.conholdate.com/2020/08/10/export-data-to-excel-in-csharp/
 [22]: https://blog.groupdocs.com/2020/11/08/convert-cad-drawings-to-pdf-in-csharp/
 [23]: https://blog.groupdocs.com/2020/06/30/convert-webp-to-jpg-png-tiff-and-pdf-in-csharp/




