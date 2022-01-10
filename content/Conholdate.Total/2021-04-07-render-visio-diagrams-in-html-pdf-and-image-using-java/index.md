---
title: Render Visio Diagrams in HTML, PDF, and Image using Java
author: Muzammil Khan
date: 2021-04-07T08:54:39+00:00
summary: 'Render Visio diagram (.vsdx, .vssx, .vstx) files in HTML, PDF, and other popular image formats programmatically. In this article, you will learn <strong>how to render Visio diagrams in HTML, PDF, and Image using Java</strong>. '
url: /2021/04/07/render-visio-diagrams-in-html-pdf-and-image-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - render as PDF
  - Render Visio File as HTML
  - Render Visio File as Image
  - Render Visio Files
  - Render VSDX as PDF

---


{{< figure align=center src="images/View-Visio-Files-using-Java-1024x576.jpg" alt="Render Visio Files using Java">}}
 

Microsoft Visio is a popular vector graphics tool that helps you visualize data-connected business process flows. It can be used to draw a variety of diagrams such as flowcharts, organization charts, building plans, floor plans, data flow diagrams, process flow diagrams, business process modeling, swimlane diagrams, 3D maps, and many more. As a Java developer, you can easily render Visio diagrams in HTML, PDF, and other popular image formats programmatically. In this article, you will learn&nbsp;**how to render Visio diagrams in HTML, PDF, and Image using Java**.

The following topics are discussed/covered in this article:

  * [Java API to View Visio Files][2]
  * [Render Visio VSSX in HTML][3]
  * [Render Visio VSTX in PDF][4]
  * [View Visio VSDX as Image][5]

## Java API to View Visio Files {#java-viewer-api}

I will be using&nbsp;[GroupDocs.Viewer for Java API][6]&nbsp;for the rendering of Visio files. It provides a most flexible document viewing solution to render and display widely used file formats anywhere. Using this API, you can create powerful document and image rendering applications in Java without installing any external software. It enables you to quickly view PDF, HTML, XML, Microsoft Office Word, Excel worksheets, PowerPoint presentations, Outlook emails, Visio diagrams, Project, metafiles, images, and various other file formats with ease and fewer programming hazards.

### Download and Configure

[Get the library][7]&nbsp;from downloads or just add the following **_pom.xml_** configuration in your Maven-based Java applications to try the below-mentioned examples. 

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsArtifactRepository&lt;/id&gt;
	&lt;name&gt;GroupDocs Artifact Repository&lt;/name&gt;
	&lt;url&gt;https://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-viewer&lt;/artifactId&gt;
        &lt;version&gt;21.2&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Render Visio VSSX in HTML {#render-vssx-to-html}

You can render the Visio VSSX file in HTML by following the simple steps given below:

  1. Create an instance of the&nbsp;**[Viewer][8]**&nbsp;class
  2. Provide the input file path
  3. Create an instance of [_**HtmlViewOptions**_][9] class
  4. Provide output file path
  5. Call the&nbsp;_**[View][10]**_ method and pass HtmlViewOptions

The following&nbsp;code sample shows&nbsp;**how to render the VSSX file in HTML using Java**.

{{< gist conholdate-gists 9748954ecb8a030999ccf7862c2d28ec "RenderVisioFiles_Java_VSSX_to_HTML.java" >}}

{{< figure align=center src="images/Render-VSSX-in-HTML-1024x457.jpg" alt="Render VSSX in HTML" caption="Render VSSX in HTML">}}
 

The&nbsp;**_HtmlViewOptions_&nbsp;**class provides options for rendering documents into HTML format. The [ForEmbeddedResources][12] constructor creates a new instance of&nbsp;_HtmlViewOptions_&nbsp;class for rendering into HTML with embedded resources. It provides certain options for various file formats such as VisioRenderingOptions for Visio files, Watermark options to set text watermark, security options, rendering options to render hidden pages, notes, and comments, etc.

You can find more details about “[Document HTML Viewer][13]” in the documentation.

## Render Visio VSTX in PDF {#render-vstx-to-pdf}

You can render the Visio VSTX file in PDF format by following the simple steps given below:

  1. Create an instance of the&nbsp;**[Viewer][8]**&nbsp;class
  2. Provide the input file path
  3. Create an instance of [_**PdfViewOptions**_][14] class
  4. Provide output file path
  5. Call the&nbsp;_**[View][10]**_ method and pass PdfViewOptions

The following&nbsp;code sample shows&nbsp;**how to render the VSTX file in PDF using Java**.

{{< gist conholdate-gists 9748954ecb8a030999ccf7862c2d28ec "RenderVisioFiles_Java_VSTX_to_PDF.java" >}}

{{< figure align=center src="images/Render-VSTX-in-PDF-1024x457.jpg" alt="Render VSTX in PDF" caption="Render VSTX in PDF">}}
 

The&nbsp;**_PdfViewOptions_&nbsp;**class provides options for rendering documents into PDF format. It also allows setting separate options for different file formats including text watermark, security options, and rendering of hidden pages, notes, and comments, etc.

You can find more details about “[Document PDF Viewer][16]” in the documentation.

## Render Visio VSDX as Image {#render-vsdx-to-image}

You can render the Visio VSDX file in JPG or PNG format by following the simple steps given below:

  1. Create an instance of the&nbsp;**[Viewer][8]**&nbsp;class
  2. Provide the input file path
  3. Create an instance of [_**PngViewOptions**_][17] class
  4. Provide output file path
  5. Call the&nbsp;_**[View][10]**_ method and pass PngViewOptions

The following&nbsp;code sample shows&nbsp;**how to render the VSDX file in PNG using Java**.

{{< gist conholdate-gists 9748954ecb8a030999ccf7862c2d28ec "RenderVisioFiles_Java_VSDX_to_PNG.java" >}}

{{< figure align=center src="images/Render-VSDX-in-PNG-1024x457.jpg" alt="Render VSDX as PNG" caption="Render VSDX as PNG">}}
 

You may also render the Visio files in JPG using Java as shown below:

{{< gist conholdate-gists 9748954ecb8a030999ccf7862c2d28ec "RenderVisioFiles_Java_VSDX_to_JPG.java" >}}

{{< figure align=center src="images/Render-VSDX-in-JPG-1024x457.jpg" alt="Render VSDX as JPG" caption="Render VSDX as JPG">}}
 

The&nbsp;**_PngViewOptions_&nbsp;**class provides options for rendering documents into PNG format. Similarly, the&nbsp;**_JpgViewOptions_&nbsp;**class provides options for rendering documents into JPG format. Both of the classes also provide setting options for other formats along with text watermark, security options, and rendering of hidden pages, notes, and comments, etc.

You can find more details about “[Document Image Viewer][20]” in the documentation.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][21].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;render Visio (.vsdx, .vstx, .vssx) files in HTML, PDF, PNG, and Jpg**&nbsp;using Java. You can learn even more about GroupDocs.Viewer Java API using the&nbsp;[documentation][22]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][23].

## See Also

  * [[View messages from desired folders in Outlook Data Files (OST/PST)][24]][25]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/View-Visio-Files-using-Java.jpg
 [2]: #java-viewer-api
 [3]: #render-vssx-to-html
 [4]: #render-vstx-to-pdf
 [5]: #render-vsdx-to-image
 [6]: https://products.groupdocs.com/viewer/java
 [7]: https://downloads.groupdocs.com/viewer/java
 [8]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer/Viewer
 [9]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/HtmlViewOptions
 [10]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer/Viewer#view(com.groupdocs.viewer.options.ViewOptions)
 [11]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSSX-in-HTML.jpg
 [12]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/HtmlViewOptions#forEmbeddedResources(java.lang.String)
 [13]: https://docs.groupdocs.com/viewer/java/document-viewer-html-viewer/
 [14]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/PdfViewOptions
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSTX-in-PDF.jpg
 [16]: https://docs.groupdocs.com/viewer/java/document-viewer-pdf-viewer/
 [17]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/PngViewOptions
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSDX-in-PNG.jpg
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSDX-in-JPG.jpg
 [20]: https://docs.groupdocs.com/viewer/java/document-viewer-image-viewer/
 [21]: https://purchase.groupdocs.com/temporary-license
 [22]: https://docs.groupdocs.com/viewer/java/
 [23]: https://forum.groupdocs.com/c/viewer/
 [24]: https://blog.groupdocs.com/2019/08/24/view-messages-from-desired-folders-in-outlook-data-files-ostpst/
 [25]: https://blog.conholdate.com/2020/08/10/export-data-to-excel-in-csharp/




