---
title: 'Compare PDF Files and Highlight Differences using C#'
author: Muzammil Khan
date: 2021-04-14T07:04:18+00:00
summary: 'Compare two or more PDF files and highlight the differences in a separate PDF file programmatically. Compare password protected files using C# in your .NET application. In this article, you are going to learn <strong>how to compare two or more PDF documents and highlight differences using C#</strong>. '
url: /2021/04/14/compare-pdf-files-and-highlight-differences-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - Compare Multiple PDF Files
  - Compare PDF Files
  - 'Compare PDF Files using CSharp'

---


{{< figure align=center src="images/Compare-PDF-Files.jpg" alt="">}}
 

In certain cases, you may need to compare two or more PDF documents in your .NET application. You can easily compare and highlight the differences programmatically. In this article, you will learn&nbsp;**how to compare two or more PDF files and highlight differences using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Compare PDF Documents][2]
  * [Compare Two PDF Files using C#][3]
  * [Compare Password Protected PDF Files using C#][4]

## C# API to Compare PDF Documents {#csharp-comparison-api}

For comparing [PDF][5] documents, I will be using [GroupDocs.Comparison for .NET API][6]. It compares to detect content changes for words, paragraphs, and characters while providing a comparison document that lists a summary of differences. The .NET compare library supports checking differences in both, content as well as the text style of popular image and document formats such as PDF, HTML, Outlook email, Microsoft Office Word documents, Excel spreadsheets, PowerPoint presentations, OneNote, Visio diagrams, text, and images. It can be used to develop applications in any development environment that targets the .NET platform.

You can either&nbsp;[download][7]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][8].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Comparison</code></pre>

## Compare Two PDF Files using C# {#Compare-Two-PDF-Files-using-Csharp}

You can compare two PDF documents by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][9]**_ class
  2. Provide the source PDF file path to the constructor
  3. [Add][10] target PDF file to the comparison
  4. Call the&nbsp;_**[Compare][11]**_ method along with the output file path

The following&nbsp;code sample shows&nbsp;**how to compare two PDF documents and highlight the differences using C#**.

{{< gist conholdate-gists 2321805fadc51663641102e19a8abbae "ComparePDFFiles_CSharp_CompareTwoPDFs.cs" >}}

{{< figure align=center src="images/ComparePDFFilesUsingC-1024x644.png" alt="Compare Two PDF Files using C#" caption="Compare Two PDF Files using C#">}}
 

The resulting document includes a summary page at the end of the document showing the summary of changes as shown below:

{{< figure align=center src="images/image.png" alt="Summary of Changes" caption="Summary of Changes">}}
 

If you want to compare multiple PDF files then you just need to add multiple target PDF files to the comparison as shown below:

<pre class="wp-block-code"><code>comparer.Add("target2.docx");
comparer.Add("target3.docx");</code></pre>

## Compare Password Protected PDF Files using C# {#Compare-Password-Protected-PDF-Files-using-Csharp}

You can compare password-protected PDF documents by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][9]**_ class
  2. Provide the source PDF file path to the constructor
  3. Provide a password for the source file using _LoadOptions_
  4. Add target PDF file to the comparison
  5. Provide a password for the target file using _LoadOptions_
  6. Call the&nbsp;_**[Compare][11]**_ method along with the output file path

The following&nbsp;code sample shows&nbsp;**how to compare password-protected PDF documents using C#**.

{{< gist conholdate-gists 2321805fadc51663641102e19a8abbae "ComparePDFFiles_CSharp_ComparePasswordProtectedFiles.cs" >}}

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][14].

## Conclusion

In this article, you have learned&nbsp;**how **to compare two or more PDF documents and highlight differences****&nbsp;using C#. You can learn even more about GroupDocs.Comparison .NET API using the&nbsp;[documentation][15]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][16].

## See Also

  * [Render Visio Diagrams in HTML, PDF, and Image using Java][17]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Compare-PDF-Files.jpg
 [2]: #csharp-comparison-api
 [3]: #Compare-Two-PDF-Files-using-Csharp
 [4]: #Compare-Password-Protected-PDF-Files-using-Csharp
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://products.groupdocs.com/comparison/net
 [7]: https://downloads.groupdocs.com/comparison/net
 [8]: https://www.nuget.org/packages/GroupDocs.Comparison
 [9]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison/comparer
 [10]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/add/methods/2
 [11]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/compare/methods/7
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/ComparePDFFilesUsingC.png
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/image.png
 [14]: https://purchase.groupdocs.com/temporary-license
 [15]: https://docs.groupdocs.com/comparison/net/
 [16]: https://forum.groupdocs.com/c/comparison/
 [17]: https://blog.conholdate.com/2021/04/07/render-visio-diagrams-in-html-pdf-and-image-using-java/




