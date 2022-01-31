---
title: 'Add Shapes in PDF Documents using C#'
author: Muzammil Khan
date: 2021-11-11T05:04:14+00:00
summary: 'As a C# developer, you can add drawing shapes in PDF documents programmatically. In this article, you will learn <strong>how to add shapes in PDF documents using C#</strong>.'
url: /2021/11/11/add-shapes-in-pdf-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Add Circle in PDF using CSharp'
  - 'Add Rectangle in PDF using CSharp'
  - 'Add Shapes in PDF using CSharp'
  - Draw Shapes in PDF
  - Drawing Shapes

---


{{< figure align=center src="images/add-shapes-in-pdf-documents-using-csharp.jpg" alt="Add Shapes in PDF Documents using C#">}}
 

You may need to add various types of graphs or shapes to your PDF files to present data or information interactively. As a C# developer, you can add drawing shapes in PDF documents programmatically. In this article, you will learn&nbsp;**how to add shapes in PDF documents using C#**.

The following topics are discussed/covered in this article:

<ul id="C--API-to-Add-Graphs-in-PDF-Documents">
  <li>
    <a href="#CSharp-API-to-Draw-Shapes-in-PDF-Documents">C# API to Draw Shapes in PDF Documents</a>
  </li>
  <li>
    <a href="#Create-Filled-Rectangle-in-PDF-Documents-using-CSharp">Create Filled Rectangle in PDF Documents using C#</a>
  </li>
  <li>
    <a href="#Add-Circle-in-PDF-Documents-using-CSharp">Add Circle in PDF Documents using C#</a>
  </li>
  <li>
    <a href="#Draw-Lines-Across-the-Page-in-PDF-Documents-using-CSharp">Draw Lines Across the Page in PDF Documents using C#</a>
  </li>
  <li>
    <a href="#Add-Ellipse-in-PDF-Documents-using-CSharp">Add Ellipse in PDF Documents using C#</a>
  </li>
</ul>

## C# API to Draw Shapes in PDF Documents {#CSharp-API-to-Draw-Shapes-in-PDF-Documents}

For adding shapes in [PDF][2] files, we will be using&nbsp;[Aspose.PDF for .NET API][3]. It allows you to generate, modify, convert, render, secure and print [supported documents][4] without using Adobe Acrobat. It also provides compression options, table creation & manipulation, graph & image functions, stamp and watermark tasks, extended security controls, and custom font handling.

You can either&nbsp;[download][5]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][6].

<pre class="wp-block-code"><code>Install-Package Aspose.PDF</code></pre>

## Create Filled Rectangle in PDF Documents using C# {#Create-Filled-Rectangle-in-PDF-Documents-using-CSharp}

You can create a filled rectangle in PDF documents programmatically by following the steps given below:

  * Firstly, create a new document using the&nbsp;[Document][7]&nbsp;class.
  * Now, call the [Document.Pages.Add()][8] method to add an empty page to pages collection of the PDF file.
  * Create an instance of the&nbsp;[Graph][9]&nbsp;class with height and width for the graph.
  * Then, call the [Page.Paragraphs.Add()][10] method to add graph object to paragraphs collection of the page instance.
  * Now, create an instance of the [Rectangle][11] class and set its left and bottom position, along with its width and height.
  * Optionally, specify the fill color for [the Graph object][12].
  * Then, add the rectangle object to [the shape collection][13] of the Graph object.
  * Finally, call the&nbsp;[Document.Save()][14]&nbsp;method with output file path to save the file.

The following&nbsp;code sample shows&nbsp;**how to create a filled rectangle in PDF documents using C#**.

{{< gist conholdate-gists e929a4caba1bc968da0767d9dcac90eb "AddGraphsInPDF_CSharp_AddFilledRectangle.cs" >}}

{{< figure align=center src="images/Create-Filled-Rectangle-in-PDF-Documents-using-CSharp.jpg" alt="Create Filled Rectangle in PDF Documents using C#." caption="Create Filled Rectangle in PDF Documents using C#.">}}
 

## Add Circle in PDF Documents using C# {#Add-Circle-in-PDF-Documents-using-CSharp}

You can add a circle in PDF documents programmatically by following the steps given below:

  * Firstly, create a new document using the&nbsp;[Document][7]&nbsp;class.
  * Now, call the [Document.Pages.Add()][8] method to add an empty page to pages collection of the PDF file.
  * Create an instance of the&nbsp;[Graph][9]&nbsp;class with height and width for the graph.
  * Then, call the [Page.Paragraphs.Add()][10] method to add graph object to paragraphs collection of the page instance.
  * Now, create an instance of the [Circle][16] class and set its X and Y position, along with its radius.
  * Then, set the color and fill color for the circle.
  * Add the circle object to [the shape collection][13] of the Graph object.
  * Finally, call the&nbsp;[Document.Save()][14]&nbsp;method with output file path to save the file.

The following&nbsp;code sample shows&nbsp;**how to add a circle in PDF documents using C#**.

{{< gist conholdate-gists e929a4caba1bc968da0767d9dcac90eb "AddGraphsInPDF_CSharp_AddCircle.cs" >}}

{{< figure align=center src="images/Add-Circle-in-PDF-Documents-using-CSharp.jpg" alt="Add Circle in PDF Documents using C#." caption="Add Circle in PDF Documents using C#.">}}
 

## Draw Lines Across the Page in PDF Documents using C# {#Draw-Lines-Across-the-Page-in-PDF-Documents-using-CSharp}

You can draw lines across the page in PDF documents programmatically by following the steps given below:

  * Firstly, create a new document using the&nbsp;[Document][7]&nbsp;class.
  * Now, call the [Document.Pages.Add()][8] method to add an empty page to pages collection of the PDF file.
  * Then, set page margins on all sides as 0.
  * Create an instance of the&nbsp;[Graph][9]&nbsp;class with page width and page height.
  * Now, create an instance of the [Line][18] class with line position array to create a line starting from lower-left to top-right corner of the page.
  * Then, add the line object to [the shape collection][13] of the Graph object.
  * Now, create another instance of the [Line][18] class with line position array to draw a line from top-left corner of the page to bottom-right corner of the page.
  * Then, add the second instance of the line object to [the shape collection][13] of the Graph object.
  * Call the [Page.Paragraphs.Add()][10] method to add graph object to paragraphs collection of the page instance.
  * Finally, call the&nbsp;[Document.Save()][14]&nbsp;method with output file path to save the file.

The following&nbsp;code sample shows&nbsp;**how to draw lines across the page in PDF documents using C#**.

{{< gist conholdate-gists e929a4caba1bc968da0767d9dcac90eb "AddGraphsInPDF_CSharp_DrawLines.cs" >}}

{{< figure align=center src="images/Draw-Line-Across-the-Page-in-PDF-Documents-using-CSharp.png" alt="Draw a Line Across the Page in PDF Documents using C#." caption="Draw a Line Across the Page in PDF Documents using C#.">}}
 

## Add Ellipse in PDF Documents using C# {#Add-Ellipse-in-PDF-Documents-using-CSharp}

You can add an ellipse with text inside in PDF documents programmatically by following the steps given below:

  * Firstly, create a new document using the&nbsp;[Document][7]&nbsp;class.
  * Now, call the [Document.Pages.Add()][8] method to add an empty page to pages collection of the PDF file.
  * Create an instance of the&nbsp;[Graph][9]&nbsp;class with height and width for the graph.
  * Create an instance of the [TextFragment][20] class with the text value to show inside the graph object.
  * Then, set font and size for the text.
  * Now, create an instance of the [Ellipse][21] class and set its left and bottom position, along with its width and height.
  * Then, set the color, fill color and assign the TextFragment object to its text property.
  * Now, add the ellipse object to [the shape collection][13] of the Graph object.
  * Then, call the [Page.Paragraphs.Add()][10] method to add graph object to paragraphs collection of the page instance.
  * Finally, call the&nbsp;[Document.Save()][14]&nbsp;method with output file path to save the file.

The following&nbsp;code sample shows&nbsp;**how to create an ellipse with text in PDF documents using C#**.

{{< gist conholdate-gists e929a4caba1bc968da0767d9dcac90eb "AddGraphsInPDF_CSharp_AddEllipse.cs" >}}

{{< figure align=center src="images/Add-Ellipse-in-PDF-Documents-using-CSharp.jpg" alt="Add Ellipse in PDF Documents using C#." caption="Add Ellipse in PDF Documents using C#.">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][23].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;add shapes in PDF documents using&nbsp;C#**. Particularly, you have seen how to add a filled rectangle, circle, line, and ellipse in PDF documents programmatically. Similarly, you can create an arc and a curve in PDF files. You can learn more about Aspose.PDF for .NET API using the [documentation][24]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][25].

## See Also

  * [Convert PDF to Images using C#][26]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/add-shapes-in-pdf-documents-using-csharp.jpg
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://products.aspose.com/pdf/net/
 [4]: https://docs.aspose.com/pdf/net/supported-file-formats/
 [5]: https://downloads.aspose.com/pdf/net
 [6]: https://www.nuget.org/packages/aspose.pdf
 [7]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [8]: https://apireference.aspose.com/pdf/net/aspose.pdf/pagecollection/methods/add
 [9]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/graph
 [10]: https://apireference.aspose.com/pdf/net/aspose.pdf/paragraphs/methods/add
 [11]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/rectangle
 [12]: https://apireference.aspose.com/pdf/net/aspose.pdf/graphinfo
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/graph/properties/shapes
 [14]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Create-Filled-Rectangle-in-PDF-Documents-using-CSharp.jpg
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/circle
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Add-Circle-in-PDF-Documents-using-CSharp.jpg
 [18]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/line
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Draw-Line-Across-the-Page-in-PDF-Documents-using-CSharp.png
 [20]: https://apireference.aspose.com/pdf/net/aspose.pdf.text/textfragment
 [21]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/ellipse
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Add-Ellipse-in-PDF-Documents-using-CSharp.jpg
 [23]: https://purchase.groupdocs.com/temporary-license
 [24]: https://docs.aspose.com/pdf/net/
 [25]: https://forum.aspose.com/c/pdf
 [26]: https://blog.conholdate.com/2021/09/23/convert-pdf-to-images-using-csharp/




