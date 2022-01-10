---
title: Remove Watermarks from PDF Documents using Java
author: Muzammil Khan
date: 2021-05-28T09:39:06+00:00
summary: 'You can easily remove watermarks from documents programmatically. In this article, you will learn <strong>how to remove watermarks from PDF documents using Java</strong>.'
url: /2021/05/28/remove-watermarks-from-pdf-documents-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Remove Text Watermarks using Java
  - remove watermark
  - Remove Watermarks from PDF
  - Remove Watermarks using Java

---


{{< figure align=center src="images/Remove-Watermarks-from-PDF-Documents-using-Java.jpg" alt="Remove Watermarks from PDF Documents using Java">}}
 

The watermark image or text is used to identify the&nbsp;document&#8217;s&nbsp;author or copyright information. You can detect all the available watermarks in a document and then remove them. As a Java developer, you can easily remove watermarks from documents programmatically. In this article, you will learn&nbsp;**how to remove watermarks from PDF documents using Java**.

The following topics are discussed/covered in this article:

  * [Java API for Watermark Removal][2]
  * [Remove All Watermarks from PDF using Java][3]
  * [Text Only Watermarks Removal from PDF using Java][4]
  * [Remove Watermarks with Particular Text Formatting][5]
  * [Image Only Watermarks Removal from PDF using Java][6]

## Java API for Watermark Removal {#api-for-extracting-text}

I will be using&nbsp;[GroupDocs.Watermark for Java][7]&nbsp;API for removing watermarks from [PDF][8] documents. It allows performing image and text watermarking operations. It also enables you to apply new watermarks, search and delete existing watermarks in files of supported formats such as Word, Excel, Powerpoint, and PDF.

You can&nbsp;[download][9]&nbsp;the JAR of the API or just add the following **_pom.xml_** configuration in your Maven-based Java applications to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-watermark&lt;/artifactId&gt;
        &lt;version&gt;20.5&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Remove All Watermarks from PDF using Java {#Remove-All-Watermarks-from-PDF-using-Java}

You can easily remove all watermarks from your PDF documents by following the simple steps mentioned below:

  * Create an instance of _[Watermarker][10]_ class
  * Specify the path to the input PDF file
  * Populate _[PossibleWatermarkCollection][11]_ by calling the&nbsp;_[search()][12]&nbsp;_method
  * Call the [clear()][13] method to remove all watermarks
  * Save the updated file

The following code sample shows how to remove all watermarks available in a PDF document using Java.

{{< gist conholdate-gists c594d9bb1236cdeb23b2f0246e0a3a74 "RemoveWatermarks_Java_RemoveAll.java" >}}

{{< figure align=center src="images/Remove-All-Watermarks-from-PDF-using-Java-1024x602.jpg" alt="Remove All Watermarks from PDF using Java" caption="Remove All Watermarks from PDF using Java">}}
 

The [Watermarker][10] class facilitates adding, removing, and searching watermarks in a document.

The _[PossibleWatermarkCollection][11]_ class represents a collection of possible watermarks found in a content.

The [search()][12] method of the Watermarker class searches all possible watermarks in the document. It returns the result set as PossibleWatermarkCollection.

## Text Only Watermarks Removal from PDF using Java {#Text-Only-Watermarks-Removal-from-PDF-using-Java}

You can easily remove all text-only watermarks from your PDF documents by following the simple steps mentioned below:

  * Create an instance of _[Watermarker][10]_ class
  * Specify the path to the input PDF file
  * Populate _[PossibleWatermarkCollection][11]_ by calling the&nbsp;_[search()][12]&nbsp;_method
  * Check if getText() is not null or empty for all PossibleWatermarks
  * Then pass the index to the [_removeAt()_][15] method to remove it
  * Save the updated file

The following code sample shows how to remove only the text watermarks available in a PDF document using Java.

{{< gist conholdate-gists c594d9bb1236cdeb23b2f0246e0a3a74 "RemoveWatermarks_Java_RemoveAllTextWatermarks.java" >}}

{{< figure align=center src="images/Text-Only-Watermarks-Removal-from-PDF-using-Java-1024x591.jpg" alt="Text Only Watermarks Removal from PDF using Java" caption="Text Only Watermarks Removal from PDF using Java">}}
 

The [_removeAt()_][15] method removes the item at the specified index from the PossibleWatermarksCollection.

## Remove Watermarks with Particular Text Formatting {#Remove-Watermark-with-Particular-Text-Formatting}

You can remove text watermarks available with particular formatting from your PDF documents by following the simple steps mentioned below:

  * Create an instance of _[Watermarker][10]_ class
  * Specify the path to the input PDF file
  * Define the _[TextFormattingSearchCriteria][17]_
  * Populate _[PossibleWatermarkCollection][11]_ by calling the&nbsp;_[search()][12]&nbsp;_method
  * Call the [clear()][13] method to remove all found watermarks
  * Save the updated file

The following code sample shows how to remove the text watermarks with particular text formatting from a PDF document using Java.

{{< gist conholdate-gists c594d9bb1236cdeb23b2f0246e0a3a74 "RemoveWatermarks_Java_RemoveWithTextFormatting.java" >}}

{{< figure align=center src="images/Remove-Watermarks-with-Particular-Text-Formatting-1024x599.jpg" alt="Remove Watermarks with Particular Text Formatting" caption="Remove Watermarks with Particular Text Formatting">}}
 

## Image Only Watermarks Removal from PDF using Java {#Image-Only-Watermarks-Removal-from-PDF-using-Java}

You can easily remove all image only watermarks from your PDF documents by following the simple steps mentioned below:

  * Create an instance of _[Watermarker][10]_ class
  * Specify the path to the input PDF file
  * Populate _[PossibleWatermarkCollection][11]_ by calling the&nbsp;_[search()][12]&nbsp;_method
  * Check if getImageData() is not null for all PossibleWatermarks
  * Then pass the index to the [_removeAt(_)][15] method to remove it
  * Save the updated file

The following code sample shows how to remove only the image watermarks available in a PDF document using Java.

{{< gist conholdate-gists c594d9bb1236cdeb23b2f0246e0a3a74 "RemoveWatermarks_Java_RemoveAllImageWatermarks.java" >}}

{{< figure align=center src="images/Image-Only-Watermarks-Removal-from-PDF-using-Java-1024x599.jpg" alt="Image Only Watermarks Removal from PDF using Java" caption="Image Only Watermarks Removal from PDF using Java">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][20].

## Conclusion

In this article, you have learned **how to remove text or image watermarks from a PDF document using Java**. Furthermore, you have learned how to remove text-only or image-only watermarks from documents. You can learn more about GroupDocs.Watermark for Java API using the [documentation][21]. In case of any ambiguity, please feel free to contact us on the [forum][22].

## See Also

  * [Find and Remove Watermarks from Documents in Java][23]
  * [Find and Replace Watermarks in Documents using REST API][24]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove-Watermarks-from-PDF-Documents-using-Java.jpg
 [2]: https://blog.conholdate.com/2021/05/21/extract-text-from-doc-or-docx-using-csharp/#api-for-extracting-text
 [3]: #Remove-All-Watermarks-from-PDF-using-Java
 [4]: #Text-Only-Watermarks-Removal-from-PDF-using-Java
 [5]: #Remove-Watermark-with-Particular-Text-Formatting
 [6]: #Image-Only-Watermarks-Removal-from-PDF-using-Java
 [7]: https://products.groupdocs.com/watermark/java
 [8]: https://docs.fileformat.com/pdf/
 [9]: https://downloads.groupdocs.com/watermark/java
 [10]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker
 [11]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/PossibleWatermarkCollection
 [12]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker#search()
 [13]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.common/RemoveOnlyListBase#clear()
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove-All-Watermarks-from-PDF-using-Java.jpg
 [15]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.common/RemoveOnlyListBase#removeAt(int)
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Text-Only-Watermarks-Removal-from-PDF-using-Java.jpg
 [17]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/TextFormattingSearchCriteria
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove-Watermarks-with-Particular-Text-Formatting.jpg
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Image-Only-Watermarks-Removal-from-PDF-using-Java.jpg
 [20]: https://purchase.groupdocs.com/temporary-license
 [21]: https://docs.groupdocs.com/watermark/java/
 [22]: https://forum.groupdocs.com/c/watermark/
 [23]: https://blog.groupdocs.com/2020/11/30/find-and-remove-watermarks-from-documents-in-java/
 [24]: https://blog.groupdocs.cloud/2021/02/09/find-and-replace-watermark-using-rest-api/




