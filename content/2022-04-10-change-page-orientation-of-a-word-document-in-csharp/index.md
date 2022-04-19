---
title: 'Change Page Orientation of a Word Document in C#'
date: Sun, 10 Apr 2022 14:14:00 +0000
draft: false
url: /2022/04/10/change-page-orientation-of-a-word-document-in-csharp/
author: 'Shoaib Khan'
summary: 'Every page of the document may contain different layouts. It depends on the content of the page; that which orientation suits it. As a developer, we can change the orientation of each page to the one it suits. In this article, we will learn to **change the orientation of a page in a Word document using C#**. Separately, we will see how to change the portrait layout to landscape and then how to change the landscape orientation to portrait with the .NET applications.'
tags: ['change orientation', 'change page orientation in CSharp', 'how to change the orientation of one page in word', 'how to make one page landscape in word', 'landscape to portrait', 'page orientation', 'portrait to landscape in CSharp']
categories: ['GroupDocs.Merger Product Family']
---

Every page of the document may contain different layouts. It depends on the content of the page; that which orientation suits it. As a developer, we can change the orientation of each page to the one it suits. In this article, we will learn to **change the orientation of a page in a Word document using C#**. Separately, we will see how to change the portrait layout to landscape and then how to change the landscape orientation to portrait with the .NET applications.

{{< figure align=center src="images/change-page-orientation-in-csharp.jpg" alt="Change Page Orientation of DOC/DOCX using C#">}}

## .NET API for Changing Word Page Orientation
**GroupDocs.Merger** showcases the .NET API that enables changing the orientation of Word document pages. Additionally, the API allows moving pages, removing pages, splitting of documents, extraction, and rotation of document pages within the .NET applications. We will use this [GroupDocs.Merger for .NET][1] to change the page orientation of DOC/DOCX files using C#. For the details and other features of the API, you can visit the [documentation][2].

You can download the **DLLs** or **MSI** installer from the [downloads section][3] or install the API in your .NET application via [NuGet][4].

```
PM> Install-Package GroupDocs.Merger
```

## Change Orientation of a Word Page to Landscape using C#

Let’s begin with a simple way how to programmatically make a page landscape in a Word document. The following steps allow changing the page orientation of a Word document to landscape using C#:

- Load the Word document using [Merger][5].
- Prepare the [orientation options][6] and set the [mode][7] to landscape.
- Change the orientation using [ChangeOrientation()][8].
- Save the updated document using the appropriate [Save()][9].

The following C# code changes the portrait orientation of some pages of a Word document to the landscape.

{{< gist GroupDocsGists 0e88b7ea17c45581f7d9d70cdaf1cd35 "PageOrientationLandscape.cs" >}}

## Change Orientation of a Word Page to Portrait using C#

Similarly, you can make any set of pages of the Word document in portrait orientation. The following steps allow changing the orientation of a Word document page to portrait using C#:

- Load the Word document using [Merger][5].
- Prepare the [orientation options][6] and set the [mode][7] to portrait.
- Use [ChangeOrientation()][8] method to change the orientation.
- Use the appropriate [Save()][9] method to save the updated document.

The following C# code changes the portrait orientation of some pages of a Word document to portrait.

{{< gist GroupDocsGists 0e88b7ea17c45581f7d9d70cdaf1cd35 "PageOrientationPortrait.cs" >}}

## Get a Free API License
You can [get a free temporary license][10] in order to use the API without the evaluation limitations.

## Conclusion
To conclude, we learned how to change the page orientation of Word documents using C# within .NET applications. We saw the source code example that changed the portrait orientation of the selected pages of a DOCX file to the landscape. Similarly, we changed the landscape orientation of the selected pages to portrait using the C# example. You can try building your own application that can toggle the orientation Word pages online.

For more details about the API, visit the documentation. For queries, contact us via the [forum][11].

## See Also
- [Rearrange Pages in Word using C#][12]
- [Add and Remove the Password Protection of Word Documents using C#][13]
- [Compare Word Documents][14]
- [Edit Word Documents][15]
- [Add or Remove Annotations or Markup Word files][16]

[1]: https://products.groupdocs.com/merger/net/
[2]: https://docs.groupdocs.com/merger/
[3]: https://downloads.groupdocs.com/merger
[4]: https://www.nuget.org/packages/groupdocs.merger
[5]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger
[6]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/orientationoptions
[7]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/orientationmode
[8]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/changeorientation
[9]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/save/index
[10]: https://purchase.groupdocs.com/temporary-license
[11]: https://forum.groupdocs.com/
[12]: https://blog.groupdocs.com/2022/02/05/move-word-pages-using-csharp/
[13]: https://blog.groupdocs.com/2021/11/27/password-protect-word-documents-using-csharp/
[14]: https://blog.groupdocs.com/2021/12/01/compare-word-documents-using-csharp/
[15]: https://blog.groupdocs.com/2021/03/26/edit-word-documents-in-csharp/
[16]: https://blog.groupdocs.com/2021/06/23/annotate-word-documents-using-csharp/