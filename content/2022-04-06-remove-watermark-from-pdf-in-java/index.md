---
title: 'Remove Watermarks from PDF Documents in Java'
date: Wed, 06 Apr 2022 14:14:00 +0000
draft: false
url: /2022/04/06/remove-watermark-from-pdf-in-java/
author: 'Shoaib Khan'
summary: 'Watermarks are mostly used to mentioned documents as drafts and to avoid any illegal use of confidential documents. When draft as finalized or confidentiality is over, you can remove the watermarks from such documents. Watermarks can be either text or image-based. In this article, we will have a look about **how to remove watermarks from PDF documents in Java**.'
tags: ['delete watermark', 'how to remove watermark in java', 'remove watermark', 'remove watermark from pdf', 'Watermark Remover', 'watermark remover application']
categories: ['GroupDocs.Watermark Product Family']
---

Watermarks are mostly used to mentioned documents as drafts and to avoid any illegal use of confidential documents. When draft as finalized or confidentiality is over, you can remove the watermarks from such documents. Watermarks can be either text or image-based. In this article, we will have a look about **how to remove watermarks from PDF documents in Java**.

{{< figure align=center src="images/removing-watermark-from-pdf.jpg" alt="Programmatically Remove Watermarks from PDF files.">}}

## Java API to Remove PDF Watermarks

[GroupDocs.Watermark][1] provides Java API to deal with watermarks within documents and images of different [file formats][2]. If you are making a watermark removal app, It provides you some useful ways to:

- Remove all the watermarks from the PDF document
- Remove hyperlink watermarks
- Delete watermarks with particular text formatting

Let’s learn how a Java developer can remove watermarks from PDF using [GroupDocs.Watermark for Java][3] API in different ways. First of all, download and configure the API with your application.

### Download or Configure

You can download the JAR file from the [downloads][4] section or use the latest repository and dependency [Maven][5] configurations within your Java applications.

```
<repository>
	<id>GroupDocsJavaAPI</id>
	<name>GroupDocs Java API</name>
	<url>https://repository.groupdocs.com/repo/</url>
</repository>
<dependency>
        <groupId>com.groupdocs</groupId>
        <artifactId>groupdocs-watermark</artifactId>
        <version>21.3</version> 
</dependency>
```

## Remove All Watermarks from PDF Files in Java

The API gives you the power to easily find and then remove a particular watermark and all the watermarks from the document. The following steps show how to remove all the watermarks from a PDF document in Java.

- Load the PDF document using [Watermarker][6].
- Fetch all the [possible watermarks][7] as a collection using search.
- Traverse the whole collection and remove every watermark or the one that meets the criterion.
- Save the updated PDF having no watermark on it.

The following Java code removes all the watermarks from a PDF document.

{{< gist GroupDocsGists 216355e47a4da58e9f874d4fafbf5bb5 "RemoveAllWatermark.java" >}}

## Remove Hyperlink Watermark in Java

The watermarking API allows to search and remove hyperlinks from the PDF document. The following steps allow removing hyperlink watermarks from a PDF document within the Java application.

- Load the PDF file using [Watermarker][6].
- Fetch the [possible watermarks][7] as a collection using search.
- Traverse the collection and remove the watermark(s) that meets the criterion.
- Save the updated PDF with no more watermarks on it.

The following Java code sample shows how to find and remove hyperlink watermarks with a particular URL from a PDF document.

{{< gist GroupDocsGists 216355e47a4da58e9f874d4fafbf5bb5 "RemoveHyperlinkWatermarks.java" >}}

## Remove Watermark from PDF with particular Text Formatting in Java

The watermark having the specific text formatting can also be removed. You can provide the font name, its size, color, etc as the search criterion. The API will find the watermarks having matched properties. The following steps demonstrate how to search and remove watermarks from a PDF file having a specific text formatting in Java.

- Load the PDF file using [Watermarker][6].
- Set the search criterion using [TextFormattingSearchCriteria][8].
- Provide all the required formatting properties.
- Search and get all the [possible watermarks][7] as a collection by providing the defined criteria.
- Remove all the searched watermarks using the **clear()** method.
- Save the updated PDF having no watermark with the defined properties.

The following Java code removes the watermarks in a PDF document having the specified text formatting.

{{< gist GroupDocsGists 216355e47a4da58e9f874d4fafbf5bb5 "RemoveWatermarkWithFormatting.java" >}}

## Conclusion
To sum up, we learned ways to remove different watermarks from the PDF documents in Java. We specifically removed all the applied watermarks, then removed hyperlinks watermarks and watermarks with specific text formatting. Try building your own Java application for finding and removing the watermarks from PDF documents. Besides, you can learn more about [GroupDocs.Watermark for Java][3] from its [documentation][9]. For queries, contact us via the [forum][10].

## See Also

- [Watermark Password Protected Documents in Java][11]
- [Watermark Excel Sheets in Java][12]
- [Add Watermark to PDF Files in Java][13]
- [Watermark Presentation Slides using Java][14]
- [Find and Remove Watermarks from Documents in Java][15]

[1]: https://products.groupdocs.com/watermark
[2]: https://docs.groupdocs.com/conversion/java/supported-document-formats/
[3]: https://products.groupdocs.com/watermark/java/
[4]: https://downloads.groupdocs.com/watermark
[5]: https://repository.groupdocs.com/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs
[6]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker
[7]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/PossibleWatermarkCollection
[8]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/TextFormattingSearchCriteria
[9]: https://docs.groupdocs.com/watermark/java/
[10]: https://forum.groupdocs.com/
[11]: https://blog.groupdocs.com/2021/11/26/watermark-password-protected-documents-in-java/
[12]: https://blog.groupdocs.com/2021/11/10/watermark-excel-sheets-in-java/
[13]: https://blog.groupdocs.com/2021/06/26/add-watermark-to-pdf-in-java/
[14]: https://blog.groupdocs.com/2021/06/09/watermark-presentation-slides-using-java/
[15]: https://blog.groupdocs.com/2020/11/30/find-and-remove-watermarks-from-documents-in-java/