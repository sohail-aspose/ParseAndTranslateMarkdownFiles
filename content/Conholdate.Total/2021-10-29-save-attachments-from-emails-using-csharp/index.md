---
title: 'Save Attachments from Emails using C#'
author: Muzammil Khan
date: 2021-10-29T11:03:23+00:00
summary: 'As a C# developer, you can easily extract and save the attachments from email messages programmatically. In this article, you will learn <strong>how to save attachments from emails using C#</strong>.'
url: /2021/10/29/save-attachments-from-emails-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Save Attachments using CSharp'
  - 'Save Email Attachments in CSharp'
  - 'View Attachments using CSharp'
  - View Email Attachments as PDF

---


{{< figure align=center src="images/save-attachments-from-emails-using-csharp.jpg" alt="Save Attachments from Emails using C#">}}
 

As a C# developer, you can easily extract and save the attachments from email messages programmatically. In this article, you will learn **how to save attachments from emails using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Save Email Attachments][2]
  * [Extract and Save Attachments from Emails using C#][3]
  * [Save Attachments as PDF from Emails using C#][4]

## C# API to Save Email Attachments {#CSharp-API-to-Save-Email-Attachments}

For saving the attachments from [MSG][5] files, we will be using&nbsp;[GroupDocs.Viewer for .NET API][6]. It is a powerful document viewer API to render and display widely used file formats without installing any external software. It also enables you to quickly view popular [supported file formats][7] of&nbsp;[Word][8],&nbsp;[Excel][9],&nbsp;[PowerPoint][10], [Outlook emails][11], [Project][12], [PDF][13], [HTML][14], and [XML][15].

You can either&nbsp;[download][16]&nbsp;the DLL of the API or install it using [NuGet][17].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Viewer</code></pre>

## Extract and Save Attachments from Emails using C# {#Extract-and-Save-Attachments-from-Emails-using-CSharp}

You can extract and save attachments from email MSG files programmatically by following the steps given below:

  * Firstly, load the MSG file using the&nbsp;[Viewer][18]&nbsp;class.
  * Then, call the [Viewer.GetAttachments()][19] method to get all the attachments of the loaded MSG file. Get the results as a collection of attachments.
  * For each attachment in the collection, save the attachment by calling the [Viewer.SaveAttachment()][20] method. Pass the attachment object and file path to save it.

The following&nbsp;code sample shows&nbsp;**how to extract and save the attachments contained by email MSG file using C#**.

{{< gist conholdate-gists 7e1594cdf39a2d6efa1c01708fd02bb4 "SaveAttachmentsFromEmail_CSharp_ExtractAndSave.cs" >}}

{{< figure align=center src="images/Extract-and-Save-Attachments-from-Emails-using-CSharp-1024x511.jpg" alt="Extract and Save Attachments from Emails using C#" caption="Extract and save attachments from emails using C#.">}}
 

## Save Attachments as PDF from Emails using C# {#Save-Attachments-as-PDF-from-Emails-using-CSharp}

You can save the email message attachments as PDF programmatically by following the steps given below:

  * Create an instance of the [Attachment][22] class with the attached file name and file path.
  * Initialize an instance of the MemoryStream class.
  * Load the MSG file using the&nbsp;[Viewer][18]&nbsp;class.
  * Then, call the [Viewer.SaveAttachment()][20] method and pass the Attachment and the MemoryStream object as input parameters. It will extract and save the specified attachment in the memory stream.
  * Now, load the MemoryStream object using the [Viewer][18]&nbsp;class.
  * Then, create an instance of the [PdfViewOptions][23] class with the output PDF file path.
  * Finally, call the [Viewer.View()][24] method to save and view the attachment as a PDF.

The following&nbsp;code sample shows&nbsp;**how to save and view the attachment as a PDF from an email MSG file using C#**.

{{< gist conholdate-gists 7e1594cdf39a2d6efa1c01708fd02bb4 "SaveAttachmentsFromEmail_CSharp_SaveAsPDF.cs" >}}

{{< figure align=center src="images/Save-Attachments-as-PDF-from-Emails-using-CSharp-1024x561.jpg" alt="" caption="Save attachments as PDF from emails using C#.">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][26].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;**extract and save the attachments contained by email MSG file using** C#**. Moreover, you have seen&nbsp;**how to save a specific attachment as a PDF**&nbsp;programmatically. Besides, you can learn more about GroupDocs.Viewer for .NET API using the&nbsp;[documentation][27]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][28].

## See Also

  * [Render ZIP Archives using C#][29]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/save-attachments-from-emails-using-csharp.jpg
 [2]: #CSharp-API-to-Save-Email-Attachments
 [3]: #Extract-and-Save-Attachments-from-Emails-using-CSharp
 [4]: #Save-Attachments-as-PDF-from-Emails-using-CSharp
 [5]: https://docs.fileformat.com/email/msg/
 [6]: https://products.groupdocs.com/viewer/net
 [7]: https://docs.groupdocs.com/viewer/net/supported-document-formats/
 [8]: https://docs.fileformat.com/word-processing/
 [9]: https://docs.fileformat.com/spreadsheet/
 [10]: https://docs.fileformat.com/presentation/
 [11]: https://docs.fileformat.com/email/
 [12]: https://docs.fileformat.com/project-management/
 [13]: https://docs.fileformat.com/pdf/
 [14]: https://docs.fileformat.com/web/html/
 [15]: https://docs.fileformat.com/web/xml/
 [16]: https://downloads.groupdocs.com/viewer/net
 [17]: https://www.nuget.org/packages/GroupDocs.Viewer
 [18]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/Viewer
 [19]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/getattachments
 [20]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/saveattachment
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Extract-and-Save-Attachments-from-Emails-using-CSharp.jpg
 [22]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.results/attachment
 [23]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/pdfviewoptions
 [24]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/view
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Save-Attachments-as-PDF-from-Emails-using-CSharp.jpg
 [26]: https://purchase.groupdocs.com/temporary-license
 [27]: https://docs.groupdocs.com/viewer/net/
 [28]: https://forum.groupdocs.com/c/viewer/
 [29]: https://blog.conholdate.com/2021/07/06/render-zip-archives-using-csharp/




