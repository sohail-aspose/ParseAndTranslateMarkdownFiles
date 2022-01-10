---
title: 'Render ZIP Archives using C#'
author: Muzammil Khan
date: 2021-07-06T10:34:08+00:00
summary: 'You can easily render your ZIP archives programmatically in .NET applications. In this article, you will learn <strong>how to render ZIP archives using C#</strong>.'
url: /2021/07/06/render-zip-archives-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'C# API to View ZIP Files'
  - GroupDocs.Viewer for .NET
  - Render ZIP Archives in HTML
  - Render ZIP Archives in PDF
  - Render ZIP Archives to JPG

---


{{< figure align=center src="images/render-zip-archives-using-csharp.jpg" alt="Render ZIP Archives using C#">}}
 

ZIP files contain one or more compressed files or folders to act as a single file. These are widely used to save storage space and increase the performance of your computers. You can effectively transfer your files and folders in a ZIP archive from one location to another. As a C# developer, you can easily render ZIP archives and view their content programmatically. This article will be focusing on&nbsp;**how to render ZIP archives using C#**.

The following topics are discussed/covered in this article:

  * [C# API to View ZIP Files][2]
  * [Render ZIP Archives in HTML][3]
  * [Render Specific Folder from ZIP Archives in HTML][4]
  * [View Content of ZIP Archives in PDF][5]
  * [Render ZIP Archives to JPG][6]
  * [Get a List of Folders from ZIP archives][7]
  * [Render and Rename ZIP Files][8]

## C# API to View ZIP Files {#csharp-zip-viewer-api}

For the rendering of ZIP files, I will be using&nbsp;[GroupDocs.Viewer for .NET API][9]. It is a powerful document viewer API that supports over 170 file and document types. The API provides the most flexible document viewing solution to render and display widely used file formats anywhere without installing any external software. It also enables you to quickly view PDF, HTML, XML, Microsoft Office Word, Excel worksheets, PowerPoint presentations, Outlook emails, Visio diagrams, Project, metafiles, images, and various other file formats with ease and with fewer programming hazards.

You can either&nbsp;[download][10]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][11].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Viewer</code></pre>

## Render ZIP Archives in HTML {#render-zip-to-html}

You can render the ZIP file in HTML by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Viewer][12]**&nbsp;_class
  2. Provide the input file path
  3. Create an instance of&nbsp;[_**HtmlViewOptions**_&nbsp;][13]class
  4. Provide output file path
  5. Call the&nbsp;_**[View()][14]**_&nbsp;method and pass HtmlViewOptions

The following&nbsp;code sample shows&nbsp;**how to render the ZIP file in HTML using C#**.

{{< gist conholdate-gists 5422784fe83368b8e4e4bba3e2d03c37 "RenderZIP_CSharp_RenderInHTML.cs" >}}

{{< figure align=center src="images/render-zip-to-html-1024x499.jpg" alt="Render ZIP Archives in HTML" caption="Render ZIP Archives in HTML">}}
 

The **[Viewer][12]** class is the main class that provides functionality to&nbsp;control the document rendering process. The [View()][14] method of this class creates the view of all document pages.

The&nbsp;**[HtmlViewOptions&nbsp;][13]**class provides options for the rendering of documents into HTML format. The&nbsp;[ForEmbeddedResources][16]&nbsp;constructor method creates a new instance of&nbsp;_HtmlViewOptions_&nbsp;class for rendering into HTML with embedded resources. As you can see, I have provided the output file path in the code example.

You can find more details about “[Document HTML Viewer][17]” in the documentation.

## Render Specific Folder from ZIP Archives in HTML {#Render-Specific-Folder-from-ZIP-Archives}

You can render a specific folder available inside the ZIP file in HTML by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Viewer][12]**&nbsp;_class
  2. Provide the input file path
  3. Create an instance of&nbsp;[_**HtmlViewOptions**_&nbsp;][13]class
  4. Provide output file path
  5. Set the folder name to render
  6. Call the&nbsp;_**[View()][14]**_&nbsp;method and pass HtmlViewOptions

The following&nbsp;code sample shows&nbsp;**how to render a specific folder from the ZIP file in HTML using C#**.

{{< gist conholdate-gists 5422784fe83368b8e4e4bba3e2d03c37 "RenderZIP_CSharp_RenderSpecificFolderInHTML.cs" >}}

{{< figure align=center src="images/Render-Specific-Folder-from-ZIP-Archives-1024x457.jpg" alt="Render Specific Folder from ZIP Archives in HTML" caption="Render Specific Folder from ZIP Archives in HTML">}}
 

The **[ArchiveOptions][19]** class provides options for the rendering of archive files. It enables you to render a specific folder from ZIP archives by providing the name of the folder available inside the archive.

## View Content of ZIP Archives in PDF {#render-zip-to-pdf}

You can render the ZIP file in PDF document by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Viewer][12]**&nbsp;_class
  2. Provide the input file path
  3. Create an instance of&nbsp;[_**PdfViewOptions**_&nbsp;][20]class
  4. Provide output file path
  5. Call the&nbsp;_**[View()][14]**_&nbsp;method and pass PdfViewOptions

The following&nbsp;code sample shows&nbsp;**how to render the ZIP file in PDF using C#**.

{{< gist conholdate-gists 5422784fe83368b8e4e4bba3e2d03c37 "RenderZIP_CSharp_RenderInPDF.cs" >}}

{{< figure align=center src="images/render-zip-to-pdf-1024x539.jpg" alt="View Content of ZIP Archives in PDF" caption="View Content of ZIP Archives in PDF">}}
 

The **[PdfViewOptions][20] **class provides options for the rendering of documents into PDF format. You can find more details about “[Document PDF Viewer][22]” in the documentation.

## Render ZIP Archives to JPG {#render-zip-to-jpg}

You can render the ZIP file in JPG image by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Viewer][12]**&nbsp;_class
  2. Provide the input file path
  3. Create an instance of&nbsp;[_**JpgViewOptions**_&nbsp;][23]class
  4. Provide output file path
  5. Call the&nbsp;_**[View()][14]**_&nbsp;method and pass JpgViewOptions

The following&nbsp;code sample shows&nbsp;**how to render the ZIP file in JPG image using C#**.

{{< gist conholdate-gists 5422784fe83368b8e4e4bba3e2d03c37 "RenderZIP_CSharp_RenderInJPG.cs" >}}

{{< figure align=center src="images/render-zip-to-jpg-1024x537.jpg" alt="Render ZIP Archives to JPG" caption="Render ZIP Archives to JPG">}}
 

You can render documents to JPG or PNG image formats. The **[JpgViewOptions][23] **class provides options for the rendering of documents into JPG format. Similarly, the **[PngViewOptions][25] **class provides options for rendering documents into PNG format.

You can find more details about “[Document Image Viewer][26]” in the documentation.

## Get a List of Folders from ZIP archives {#Get-a-List-of-Folders-from-ZIP-archives}

You can get a list of all the folders and subfolders from the ZIP file programmatically by following the steps given below:

  1. Create an instance of the&nbsp;_**[Viewer][12]**&nbsp;_class
  2. Provide the input file path
  3. Create **_[ViewInfoOptions][27]_**
  4. Create **_[ViewInfo][28]_** instance by calling [_**GetViewInfo()**_][29] method
  5. Get **_[ArchiveViewInfo][30]_**
  6. Show the results

The following&nbsp;code sample shows&nbsp;**how to get a list of folders from the ZIP file using C#**.

{{< gist conholdate-gists 5422784fe83368b8e4e4bba3e2d03c37 "RenderZIP_CSharp_GetFoldersList.cs" >}}

{{< figure align=center src="images/Get-a-List-of-Folders-from-ZIP-archives-1024x598.jpg" alt="Get a List of Folders from ZIP archives" caption="Get a List of Folders from ZIP archives">}}
 

The **[ViewInfoOptions][27]** class provides options used for retrieving the information about the view. It provides various methods to get view information for specific formats. I used the [ForHtmlView()][32] method which initializes a new instance of&nbsp;ViewInfoOptions&nbsp;class to retrieve information about the view when rendering into HTML. 

The **[ViewInfo][28]** class provides view information for the generic documents. The [GetViewInfo()][29] method of the Viewer class returns information about the view and document-specific information.

The **[ArchiveViewInfo][30]** class provides view information for the archive file.

## Render and Rename ZIP Files {#Render-and-Rename-ZIP-Files}

You can rename ZIP files while rendering programmatically by following the steps given below:

  1. Create an instance of the&nbsp;_**[Viewer][12]**&nbsp;_class
  2. Provide the input file path
  3. Create an instance of&nbsp;[_**PdfViewOptions**_&nbsp;][20]class
  4. Provide output file path
  5. Set new file name to display
  6. Call the&nbsp;_**[View()][14]**_&nbsp;method and pass PdfViewOptions

The following&nbsp;code sample shows&nbsp;**how to rename ZIP file while rendering using C#**.

{{< gist conholdate-gists 5422784fe83368b8e4e4bba3e2d03c37 "RenderZIP_CSharp_RenderAndRenameFile.cs" >}}

{{< figure align=center src="images/Render-and-Rename-ZIP-Files-1024x538.jpg" alt="Render and Rename ZIP Files" caption="Render and Rename ZIP Files">}}
 

The **[ArchiveOptions][19]** class provides the _FileName_ property which is used to display the file name in the header. You can set a new display name as shown in the above code example. By default, it displays the name of the source file.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][34].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;render ZIP archives using&nbsp;C#**. You have also learned **how to convert and view the content of ZIP files** in HTML, PDF, and JPG images. Moreover, you have learned **how to get a list of folders and subfolders from the ZIP archive** programmatically in C#. You can learn more about GroupDocs.Viewer for .NET API using the&nbsp;[documentation][35]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][36].

## See Also

  * [View CAD files in C# using .NET API][37]
  * [Play and Pause Animated GIF and APNG Images using C#][38]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-archives-using-csharp.jpg
 [2]: #csharp-zip-viewer-api
 [3]: #render-zip-to-html
 [4]: #Render-Specific-Folder-from-ZIP-Archives
 [5]: #render-zip-to-pdf
 [6]: #render-zip-to-jpg
 [7]: #Get-a-List-of-Folders-from-ZIP-archives
 [8]: #Render-and-Rename-ZIP-Files
 [9]: https://products.groupdocs.com/viewer/net
 [10]: https://downloads.groupdocs.com/viewer/net
 [11]: https://www.nuget.org/packages/GroupDocs.Viewer
 [12]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer
 [13]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/htmlviewoptions
 [14]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/view
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-to-html.jpg
 [16]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options.htmlviewoptions/forembeddedresources/methods/4
 [17]: https://docs.groupdocs.com/viewer/net/document-viewer-html-viewer/
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Render-Specific-Folder-from-ZIP-Archives.jpg
 [19]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/archiveoptions
 [20]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/pdfviewoptions
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-to-pdf.jpg
 [22]: https://docs.groupdocs.com/viewer/net/document-viewer-pdf-viewer/
 [23]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/jpgviewoptions
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-to-jpg.jpg
 [25]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/pngviewoptions
 [26]: https://docs.groupdocs.com/viewer/net/document-viewer-image-viewer/
 [27]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/viewinfooptions
 [28]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.results/viewinfo
 [29]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/getviewinfo
 [30]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.results/archiveviewinfo
 [31]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Get-a-List-of-Folders-from-ZIP-archives.jpg
 [32]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/viewinfooptions/methods/forhtmlview
 [33]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Render-and-Rename-ZIP-Files.jpg
 [34]: https://purchase.groupdocs.com/temporary-license
 [35]: https://docs.groupdocs.com/viewer/net/
 [36]: https://forum.groupdocs.com/c/viewer/
 [37]: https://blog.groupdocs.com/2021/04/27/view-cad-documents-using-charp/
 [38]: https://blog.groupdocs.com/2021/02/28/play-pause-animated-gif-and-apng-in-web-pages-using-csharp/




