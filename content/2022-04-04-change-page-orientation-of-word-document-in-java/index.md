---
title: 'Change Page Orientation of a Word Document in Java'
date: Mon, 04 Apr 2022 14:14:00 +0000
draft: false
url: /2022/04/04/change-page-orientation-of-word-document-in-java/
author: 'Shoaib Khan'
summary: 'Page orientation depends on the content layout of the page. As a developer, we can programmatically change the orientation of each page to the one it suits. In this article, we will learn to **change the orientation of a page in a Word document in Java**. Separately, we will see how to change the landscape orientation to portrait and then how to change the portrait orientation to landscape with the Java applications.'
tags: ['change orientation', 'change page orientation in Java', 'how to change the orientation of one page in word', 'how to make one page landscape in word', 'landscape to portrait', 'portrait to landscape in java']
categories: ['GroupDocs.Merger Product Family']
---

Page orientation depends on the content layout of the page. As a developer, we can programmatically change the orientation of each page to the one it suits. In this article, we will learn to **change the orientation of a page in a Word document in Java**. Separately, we will see how to change the landscape orientation to portrait and then how to change the portrait orientation to landscape with the Java applications.

{{< figure align=center src="images/change-page-orientation-in-java.jpg" alt="Change Page Orientation of DOC/DOCX in Java">}}

## Java API for Changing Word Page Orientation

[GroupDocs.Merger for Java][1] is the API to deal with document pages within the Java applications. It allows changing the orientation of Word document pages and many other supporting document formats. We will use it to change the page orientation of DOC/DOCX files. For the details and other features of the API, you can visit the documentation.

### Download and Configure

Get the library from the downloads section. For your Maven-based Java application, just add the following pom.xml configuration. After this, you can try the examples of this article as well the many more example available on GitHub. For the details, you may visit the API Reference.

```
<repository>
	<id>GroupDocsJavaAPI</id>
	<name>GroupDocs Java API</name>
	<url>http://repository.groupdocs.com/repo/</url>
</repository>
<dependency>
        <groupId>com.groupdocs</groupId>
        <artifactId>groupdocs-merger</artifactId>
        <version>22.2</version> 
</dependency>
```
## Change Orientation of a Word Page to Landscape in Java

Start with how to programmatically make a page landscape in a Word document. The following steps allow changing the page orientation of a Word DOC/DOCX document to landscape in Java:

- Prepare the [orientation option][8] and set it to landscape mode.
- Load the Word document using [Merger][7].
- Change the orientation using the **changeOrientation()** method.
- Save the updated document using the appropriate **save()** method.

The following Java code changes the portrait orientation of some pages of a Word document to the landscape.

{{< gist GroupDocsGists a193326b0ad309b457e477f0486a5a86 "PageOrientationLandscape.java" >}}

## Change Orientation of a Word Page to Portrait in Java
Likewise, you can set any set of pages of the Word document in portrait orientation. The following steps allow changing the orientation of a Word document page to portrait in Java:

- Load the Word document using [Merger][7].
- Prepare the [orientation option][8] and set the mode to portrait.
- Use the **changeOrientation()** method to change the orientation.
- Use the **appropriate save()** method to save the updated document.

The following Java code changes the portrait orientation of some pages of a Word document to portrait.

{{< gist GroupDocsGists a193326b0ad309b457e477f0486a5a86 "PageOrientationPortrait.java" >}}

## Get a Free API License
You can [get a free temporary license][9] in order to use the API without the evaluation limitations.

## Conclusion
To conclude, we learned how to change the page orientation of Word documents within Java applications. We discussed the code snippet that changed the landscape orientation of the selected pages of a DOCX file to the portrait. Similarly, we changed the portrait orientation of the selected pages to landscape using the Java code example. Start building your own application that can toggle the orientation of Word pages.

For more details about the API, visit the [documentation][3a]. For queries, contact us via the [forum][10].

## See Also
- [Annotate Word files in Java][11]
- [Edit Word Documents in Java][12]
- [Rearrange Pages in Word using Java][13]
- [Render Word documents as Minified HTML in Java][14]

[1]: https://products.groupdocs.com/merger/java/
[2]: https://downloads.groupdocs.com/merger
[3]: https://docs.groupdocs.com/merger/
[3a]: https://docs.groupdocs.com/merger/java/
[4]: https://docs.groupdocs.com/merger/java/supported-document-formats/
[5]: https://github.com/groupdocs-merger
[6]: https://apireference.groupdocs.com/merger/java
[7]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger
[8]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/OrientationOptions
[9]: https://purchase.groupdocs.com/temporary-license
[10]: https://forum.groupdocs.com/
[11]: https://blog.groupdocs.com/2022/03/19/annotate-word-documents-in-java/
[12]: https://blog.groupdocs.com/2022/03/30/edit-word-documents-in-java/
[13]: https://blog.groupdocs.com/2022/03/01/move-word-pages-using-java/
[14]: https://blog.groupdocs.com/2022/03/04/render-word-documents-as-minified-html-in-java/