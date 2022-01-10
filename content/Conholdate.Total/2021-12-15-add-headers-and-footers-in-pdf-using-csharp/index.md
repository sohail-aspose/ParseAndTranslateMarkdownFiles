---
title: 'Add Headers and Footers in PDF using C#'
author: Muzammil Khan
date: 2021-12-15T04:38:40+00:00
summary: 'As a C# developer, you can add text or image in the headers and footers of the PDF documents. In this article, you will learn <strong>how to add headers and footers in PDF documents using C#</strong>.'
url: /2021/12/15/add-headers-and-footers-in-pdf-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Add Headers and Footer in C#'
  - 'Add Image in Footers using C#'
  - 'Add Image in Headers using C#'
  - 'Add Page Numbers in Footer using C#'
  - 'Add Text in Footers using C#'
  - 'Add Text in Headers using C#'

---


{{< figure align=center src="images/add-headers-and-footers-in-pdf-using-csharp.jpg" alt="Add Headers and Footers in PDF using C#">}}
 

Header and footer sections in a document show document information, such as the title of the document, logo, the chapter heading, page numbers, etc. We can add any text or image in the headers/footers of the PDF document programmatically. In this article, we will learn&nbsp;**how to add headers and footers in PDF documents using C#**.

The following topics shall be covered in this article:

<ul id="CSharp-API-to-Add-Graphs-in-PDF-Documents">
  <li>
    <a href="#CSharp-API-to-Add-Headers-and-Footers-in-PDF-Documents">C# API to Add Headers and Footers in PDF Documents</a>
  </li>
  <li>
    <a href="#Add-Text-in-Header-of-PDF-using-CSharp">Add Text in Header of PDF using C#</a>
  </li>
  <li>
    <a href="#Add-Text-in-Footer-of-PDF-using-CSharp">Add Text in Footer of PDF using C#</a>
  </li>
  <li>
    <a href="#Insert-Image-in-Header-of-PDF-using-CSharp">Insert Image in Header of PDF using C#</a>
  </li>
  <li>
    <a href="#Insert-Image-in-Footer-of-PDF-using-CSharp">Insert Image in Footer of PDF using C#</a>
  </li>
  <li>
    <a href="#Add-Different-Headers-and-Footers-on-Different-Pages">Add Different Headers and Footers on Different Pages</a>
  </li>
  <li>
    <a href="#Add-Page-Numbers-in-Footer-of-PDF-using-CSharp">Add Page Numbers in Footer of PDF using C#</a>
  </li>
</ul>

## C# API to Add Headers and Footers in PDF Documents {#CSharp-API-to-Add-Headers-and-Footers-in-PDF-Documents}

For adding headers and footers in&nbsp;[PDF][2]&nbsp;files, we will be using&nbsp;[Aspose.PDF for .NET API][3]. It allows us to generate, modify, convert, render, secure and print&nbsp;[supported documents][4]&nbsp;without using Adobe Acrobat. Please either [download][5]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][6].

<pre class="wp-block-code"><code>Install-Package Aspose.PDF</code></pre>

## Add Text in Header of PDF using C# {#Add-Text-in-Header-of-PDF-using-CSharp}

We can add text in the header of an existing PDF document by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;[**_Document_**][7] class with input file path as an argument. It is the main class that represents a PDF document and allows performing various functionalities.
  2. Next, create an instance of the _**[TextStamp][8]**_ class with a text to show in the header of the document.
  3. Then, set various properties such as _TopMargin_, _HorizontalAlignment_, and _VerticalAlignment_ as Top, etc.
  4. Optionally, set _ForegroundColor_, _Font_, _FontStyle_, _FontSize_, _BackgroundColor_, _RotateAngle_ and _Zoom_ level for the text.
  5. After that, loop through all the pages and add header using the **_[Page.AddStamp()][9]_** method with _TextStamp_ object.
  6. Finally, call the **_[Document.Save()][10]_** method with the output file path as an argument to save the output file.

The following&nbsp;code sample shows&nbsp;**how to add text in the header of a PDF document using C#**.

{{< gist conholdate-gists 85433c042f80d481575ee80989790c27 "AddHeaderFooterInPDF_CSharp_TextInHeader.cs" >}}

{{< figure align=center src="images/Add-Text-In-Header-of-PDF-using-CSharp.jpg" alt="Add Text in Header of PDF using C#." caption="Add Text in Header of PDF using C#.">}}
 

## Add Text in Footer of PDF using C# {#Add-Text-in-Footer-of-PDF-using-CSharp}

We can add text in the footer of PDF documents programmatically by following the steps mentioned earlier. However, we need to set _BottomMargin_ and _VerticalAlignment_ as Bottom to show the text in the footer.

The following&nbsp;code sample shows&nbsp;****how to add text in the footer of a PDF document using C#**.**

{{< gist conholdate-gists 85433c042f80d481575ee80989790c27 "AddHeaderFooterInPDF_CSharp_TextInFooter.cs" >}}

{{< figure align=center src="images/Add-Text-In-Footer-of-PDF-using-CSharp-1024x396.jpg" alt="Add Text in Footer of PDF using C#." caption="Add Text in Footer of PDF using C#.">}}
 

## Insert Image in Header of PDF using C# {#Insert-Image-in-Header-of-PDF-using-CSharp}

We can also add an image in the header of an existing PDF document by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;[**_Document_**][7] class with input file path as an argument.
  2. Next, create an instance of the _**[ImageStamp][13]**_ class with image file path as an argument.
  3. Then, set various properties such as _TopMargin_, _HorizontalAlignment_, and _VerticalAlignment_ as Top, etc.
  4. After that, loop through all the pages and add header using the **_[Page.AddStamp()][9]_** method with _ImageStamp_ object.
  5. Finally, call the **_[Document.Save()][10]_** method with the output file path as an argument to save the output file.

The following&nbsp;code sample shows&nbsp;**how to add an image in the header of a PDF document using C#**.

{{< gist conholdate-gists 85433c042f80d481575ee80989790c27 "AddHeaderFooterInPDF_CSharp_ImageInHeader.cs" >}}

{{< figure align=center src="images/Add-Image-In-Header-of-PDF-using-CSharp-1024x498.jpg" alt="Insert Image in Header of PDF using C#." caption="Insert Image in Header of PDF using C#.">}}
 

## Insert Image in Footer of PDF using C# {#Insert-Image-in-Footer-of-PDF-using-CSharp}

We can add images in the footer of PDF documents programmatically by following the steps mentioned earlier. However, we need to set _BottomMargin_ and _VerticalAlignment_ as Bottom to show the image in the footer.

The following&nbsp;code sample shows&nbsp;****how to add an image in the footer of a PDF document using C#**.**

{{< gist conholdate-gists 85433c042f80d481575ee80989790c27 "AddHeaderFooterInPDF_CSharp_ImageInFooter.cs" >}}

{{< figure align=center src="images/Add-Image-In-Footer-of-PDF-using-CSharp-1024x498.jpg" alt="Insert Image in Footer of PDF using C#." caption="Insert Image in Footer of PDF using C#.">}}
 

## Add Different Headers and Footers on Different Pages {#Add-Different-Headers-and-Footers-on-Different-Pages}

We can add different headers/footers for different pages in a single PDF document by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;[**_Document_**][7] class with input file path as an argument. 
  2. Next, create multiple instances of the _**[ImageStamp][13]**_ class with image file path and/or the _**[TextStamp][8]**_ class with a text to show.
  3. Then, set various properties such as _TopMargin_, _HorizontalAlignment_, and _VerticalAlignment_ as Top for the header and _BottomMargin_ and _VerticalAlignment_ as Bottom for the footer.
  4. After that, add header or footer using the **_[Page.AddStamp()][9]_** method with _ImageStamp_ or _TextStamp_ object for a page.
  5. Finally, call the **_[Document.Save()][10]_** method with the output file path as an argument to save the output file.

The following&nbsp;code sample shows&nbsp;**how to add multiple headers and footers in a single PDF document using C#**.

{{< gist conholdate-gists 85433c042f80d481575ee80989790c27 "AddHeaderFooterInPDF_CSharp_MultipleHeaders.cs" >}}

## Add Page Numbers in Footer of PDF using C# {#Add-Page-Numbers-in-Footer-of-PDF-using-CSharp}

We can add page numbers in the footer section of PDF documents by following the steps given below:

  1. Firstly, load a PDF document using the&nbsp;[**_Document_**][7] class with input file path as an argument.
  2. Next, do the following for each page in the **_[Document.Pages][16]_** collection.
      * Create an instance of the _**[TextStamp][8]**_ class with a text concatenated with the current page number.
      * Then, set various properties such as _BottomMargin_, _HorizontalAlignment_, and _VerticalAlignment_ as Bottom, etc.
      * After that, call the **_[Page.AddStamp()][9]_** method with the _TextStamp_ object to add page number in the footer.
  3. Finally, call the **_[Document.Save()][10]_** method with the output file path as an argument to save the output file.

The following&nbsp;code sample shows&nbsp;**how to add a page number for each page in the footer of a PDF document using C#**.

{{< gist conholdate-gists 85433c042f80d481575ee80989790c27 "AddHeaderFooterInPDF_CSharp_AddPageNoInFooter.cs" >}}

{{< figure align=center src="images/Add-Page-No-In-Footer-of-PDF-using-CSharp-1024x501.jpg" alt="Add Page Numbers in the Footer." caption="Add Page Numbers in Footer of PDF using C#.">}}
 

## Get a Free API License {#Get-a-Free-License}

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][18].

## Conclusion

In this article, we have learned **how to add a text or an image in the headers/footers of existing PDF files using C#**. We have also seen **how to add different headers on different pages in a PDF document** and **how to add a page number in the footer of a document**. Besides, you can learn more about Aspose.PDF for .NET API using the&nbsp;[documentation][19]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][20].

## See Also

  * [Add Shapes in PDF Documents using C#][21]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/add-headers-and-footers-in-pdf-using-csharp.jpg
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://products.aspose.com/pdf/net/
 [4]: https://docs.aspose.com/pdf/net/supported-file-formats/
 [5]: https://downloads.aspose.com/pdf/net
 [6]: https://www.nuget.org/packages/aspose.pdf
 [7]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [8]: https://apireference.aspose.com/pdf/net/aspose.pdf/textstamp
 [9]: https://apireference.aspose.com/pdf/net/aspose.pdf/page/methods/addstamp
 [10]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
 [11]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Text-In-Header-of-PDF-using-CSharp.jpg
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Text-In-Footer-of-PDF-using-CSharp.jpg
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf/imagestamp
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Image-In-Header-of-PDF-using-CSharp.jpg
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Image-In-Footer-of-PDF-using-CSharp.jpg
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf/document/properties/pages
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Page-No-In-Footer-of-PDF-using-CSharp.jpg
 [18]: https://purchase.conholdate.com/temporary-license
 [19]: https://docs.aspose.com/pdf/net/
 [20]: https://forum.aspose.com/
 [21]: https://blog.conholdate.com/2021/11/11/add-shapes-in-pdf-documents-using-csharp/




