---
title: 'Compare Two or More Word Documents using C#'
author: Muzammil Khan
date: 2021-10-01T10:14:16+00:00
summary: 'As a C# developer, you can easily compare two or more Word documents or compare multiple versions of the same Word file for the differences and similarities programmatically in your .NET applications. In this article, you will learn <strong>how to compare two or more Word documents and highlight differences using C#</strong>.'
url: /2021/10/01/compare-two-or-more-word-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - API to Compare Word Files
  - Compare Multiple DOCX Files
  - Compare Two or More Documents
  - Compare Word Documents

---


{{< figure align=center src="images/compare-two-or-more-word-documents-using-csharp.jpg" alt="Compare Two or More Word Documents using C#" caption="Compare Two or More Word Documents using C#">}}
 

You can easily compare two or more Word documents or compare multiple versions of the same Word file for the differences and similarities programmatically in your .NET applications. In this article, you will learn&nbsp;**how to compare two or more Word documents and highlight differences using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Compare DOCX Files][2]
  * [Compare Two or More Word Documents using C#][3]
  * [Compare Word Documents using Stream in C#][4]
  * [Get Text of the Changes using C#][5]
  * [Documents Properties Comparison using C#][6]
  * [Compare Password Protected Word Documents using C#][7]
  * [Compare Bookmarks in Word Documents using C#][8]

## C# API to Compare DOCX Files {#CSharp-API-to-Compare-DOCX-Files}

For comparing two or more&nbsp;[DOCX][9]&nbsp;files, I will be using&nbsp;[GroupDocs.Comparison for .NET API][10]. It compares two or more documents and finds out the changes in the content of the documents for words, paragraphs, and characters. As a result, it produces a comparison document that highlights the differences and lists a summary of the differences. It also enables you to detect changes and differences in text style between similar document formats. The API supports comparing all industry-standard document formats such as PDF, HTML, Word, Excel, PowerPoint, Outlook emails, Visio diagrams, OpenDocument, AutoCAD, and images.

You can either&nbsp;[download][11]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][12].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Comparison</code></pre>

## Compare Two or More Word Documents using C# {#Compare-Word-Documents-using-CSharp}

You can compare two or more Word documents programmatically by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][13]&nbsp;**_class with the source DOCX file path
  2. Call the **_[Add()][14]_** method with the target DOCX file to add to the comparison
  3. Repeat the above step to add more files in comparison
  4. Call the&nbsp;_**[Compare()][15]**_&nbsp;method with the output file path

The following&nbsp;code sample shows&nbsp;**how to compare two or more Word documents and highlights the differences using C#**.

{{< gist conholdate-gists 23b7b42c35b7a5b0a9fcb0a3790e389b "CompareDOCX_CSharp_Compare.cs" >}}

{{< figure align=center src="images/source_and_target_docx_files-1024x657.jpg" alt="Source and Target DOCX Files" caption="Source and Target DOCX Files">}}
 

{{< figure align=center src="images/Compare-Word-Documents-using-CSharp-1024x794.jpg" alt="Compare Two or More Word Documents using C#" caption="Compare Two or More Word Documents using C#">}}
 

The resulting document also includes a summary page at the end of the document that shows the summary of all the changes found in the comparison.

The [Comparer][13]_** **_class is the main class that enables you to control and execute the comparison process. It provides several methods to compare two or more documents. The [Add()][14] method of this class, adds a file to the comparison process. You can easily add multiple files to the comparison by using the Add() method as shown below:

<pre class="wp-block-code"><code>comparer.Add("target1.docx");
comparer.Add("target2.docx");
comparer.Add("target3.docx");</code></pre>

The&nbsp;[Compare()][15]&nbsp;method of the&nbsp;[Comparer][13] class compares the source and target documents. This method highlights the differences and saves results to the file path provided as an input parameter.

## Compare Word Documents using Stream in C# {#Compare-Word-Documents-using-Stream-in-CSharp}

You can compare two or more Word documents using FileStream by following the steps given below:

  1. Read source file in a Stream object
  2. Read target file in another Stream object
  3. Create an instance of the&nbsp;_**[Comparer][13]&nbsp;**_class with&nbsp;the source Stream object
  4. Call the **_[Add()][14]_** method with the target Stream object to add to the comparison
  5. Call the&nbsp;_**[Compare()][15]**_&nbsp;method with the output file path

The following&nbsp;code sample shows&nbsp;**how to compare Word documents using FileStream in C#**.

{{< gist conholdate-gists 23b7b42c35b7a5b0a9fcb0a3790e389b "CompareDOCX_CSharp_CompareUsingStream.cs" >}}

## Get Text of the Changes using C# {#Get-Text-of-the-Changes-using-CSharp}

You can get the text of the changes found in the comparison of Word documents programmatically by following the simple steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][13]&nbsp;**_class with the source DOCX file path
  2. Call the **_[Add()][14]_** method with the target DOCX file to add to the comparison
  3. Repeat the above step to add more files in comparison
  4. Call the&nbsp;_**[Compare()][15]**_&nbsp;method
  5. Call the&nbsp;**_[GetChanges()][18]_**&nbsp;method to get the details of changes
  6. Show the changes

The following&nbsp;code sample shows&nbsp;**how to get the text of the changes using C#**.

{{< gist conholdate-gists 23b7b42c35b7a5b0a9fcb0a3790e389b "CompareDOCX_CSharp_GetChanges.cs" >}}

<pre class="wp-block-code"><code>Count of changes: 10
Change Type: Inserted, Text:
Change Type: Inserted, Text:  Company ‼ HYPERLINK "http://www.aspose.com/" ¶Aspose Pty Ltd§ Division GroupDocs
Change Type: Inserted, Text:
Change Type: Inserted, Text: Cool
Change Type: Deleted, Text: test
Change Type: Inserted, Text:
Change Type: Inserted, Text: signatures
Change Type: Inserted, Text:
Change Type: Deleted, Text: Customers
Change Type: Deleted, Text: GroupDocs is used by companies of all sizes across the globe, from large multinational firms to small freelance businesses. They come to us because they have a need for a simple, one-stop-shop, document management solution.</code></pre>

You can get a list of changes between source and target files by calling the [GetChanges()][18] method of the [Comparer][13] class. It returns a list of [ChangeInfo][19] objects. The [ChangeInfo][19]_ _class represents information about the changes and provides various properties to get details of the changes such as [Text][20], [Type][21], etc.

## Documents Properties Comparison using C# {#Documents-Properties-Comparison-using-CSharp}

You can compare built-in, custom properties and variable properties of Word documents programmatically by following the steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][13]&nbsp;**_class with&nbsp;the source DOCX file path
  2. Call the **_[Add()][14]_** method with the target DOCX file to add to the comparison
  3. Repeat the above step to add more files in comparison
  4. Create an instance of the **_[CompareOptions][22]_**
  5. Set the [CompareVariableProperty][23] to true
  6. Set the [CompareDocumentProperty][24] to true
  7. Call the&nbsp;_**[Compare()][25]**_&nbsp;method with the output file path and **_CompareOptions_**

The following&nbsp;code sample shows&nbsp;**how to compare documents properties using C#**.

{{< gist conholdate-gists 23b7b42c35b7a5b0a9fcb0a3790e389b "CompareDOCX_CSharp_CompareProperties.cs" >}}

{{< figure align=center src="images/Documents-Properties-Comparison-using-CSharp-957x1024.jpg" alt="Documents Properties Comparison using C#" caption="Documents Properties Comparison using C#">}}
 

You can enhance your comparison process by applying various compare options. For this purpose, the [**CompareOptions**][22] class allows setting various compare options to achieve specific results. The [CompareDocumentProperty][24] of this class enables you to turn on the comparison of built-in and custom properties in Word format. The [CompareVariableProperty][23] allows turning on the comparison of variables properties in Word format.

## Compare Password Protected Word Documents using C# {#Compare-Password-Protected-Word-Documents-using-CSharp}

You can compare two or more password-protected Word documents programmatically by following the steps given below:

  1. Create an instance of the [_**LoadOptions**_][27] class
  2. Provide the password for the source file
  3. Create an instance of the&nbsp;_**[Comparer][13]&nbsp;**_class with&nbsp;the source DOCX file path and **_LoadOptions_**
  4. Call the **_[Add()][14]_** method with the target DOCX file path and **_LoadOptions_** instance with password
  5. Repeat the above step to add more files in comparison
  6. Call the&nbsp;_**[Compare()][15]**_&nbsp;method with the output file path

The following&nbsp;code sample shows&nbsp;**how to compare password-protected Word documents using C#**.

{{< gist conholdate-gists 23b7b42c35b7a5b0a9fcb0a3790e389b "CompareDOCX_CSharp_ComparePasswordProtected.cs" >}}

The [**LoadOptions**][27] class enables you to specify additional options while loading a document. It provides the following properties to specify:

  * FontDirectories — List of font directories to load.
  * LoadText — Indicates that the strings passed are comparison text, not file paths (for Text Comparison only).
  * Password — Password of document.

## Compare Bookmarks in Word Documents using C# {#Compare-Bookmarks-in-Word-Documents-using-CSharp}

You can compare bookmarks available in Word documents programmatically by following the steps given below:

  1. Create an instance of the&nbsp;_**[Comparer][13]&nbsp;**_class with&nbsp;the source DOCX file path
  2. Call the **_[Add()][14]_** method with the target DOCX file to add to the comparison
  3. Repeat the above step to add more files in comparison
  4. Create an instance of the **_[CompareOptions][22]_**
  5. Set the [CompareBookmarks][28] to true
  6. Call the&nbsp;_**[Compare()][25]**_&nbsp;method with the output file path and **_CompareOptions_**

The following&nbsp;code sample shows&nbsp;**how to compare bookmarks in Word documents using C#**.

{{< gist conholdate-gists 23b7b42c35b7a5b0a9fcb0a3790e389b "CompareDOCX_CSharp_CompareBookmarks.cs" >}}

{{< figure align=center src="images/Compare-Bookmarks-in-Word-Documents-using-CSharp-1.jpg" alt="Compare Bookmarks in Word Documents using C#" caption="Compare Bookmarks in Word Documents using C#">}}
 

The [CompareBookmarks][28] property allows you to compare the bookmarks available in the source and target documents.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][30].

## Conclusion

In this article, you have learned&nbsp;**how&nbsp;to compare two or more Word documents and highlight** **differences** using C#. You have also learned&nbsp;**how to get the list of highlighted changes.**&nbsp;Moreover, you have learned&nbsp;**how to compare bookmarks in Word documents**&nbsp;programmatically. Furthermore, you have learned **how to compare password-protected Word documents using C#**. You can learn more about GroupDocs.Comparison for .NET API using the [documentation][31]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][32].

## See Also

  * [Compare PDF Files using C# and Highlight Differences][33]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/compare-two-or-more-word-documents-using-csharp.jpg
 [2]: #CSharp-API-to-Compare-DOCX-Files
 [3]: #Compare-Word-Documents-using-CSharp
 [4]: #Compare-Word-Documents-using-Stream-in-CSharp
 [5]: #Get-Text-of-the-Changes-using-CSharp
 [6]: #Documents-Properties-Comparison-using-CSharp
 [7]: #Compare-Password-Protected-Word-Documents-using-CSharp
 [8]: #Compare-Bookmarks-in-Word-Documents-using-CSharp
 [9]: https://docs.fileformat.com/word-processing/docx/
 [10]: https://products.groupdocs.com/comparison/net
 [11]: https://downloads.groupdocs.com/comparison/net
 [12]: https://www.nuget.org/packages/groupdocs.comparison
 [13]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison/comparer
 [14]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/add/methods/2
 [15]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/compare/methods/7
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/source_and_target_docx_files.jpg
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Compare-Word-Documents-using-CSharp.jpg
 [18]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison/comparer/methods/getchanges
 [19]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.result/changeinfo
 [20]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.result/changeinfo/properties/text
 [21]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.result/changeinfo/properties/type
 [22]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions
 [23]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions/properties/comparevariableproperty
 [24]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions/properties/comparedocumentproperty
 [25]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/compare/methods/8
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Documents-Properties-Comparison-using-CSharp.jpg
 [27]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/loadoptions
 [28]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions/properties/comparebookmarks
 [29]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Compare-Bookmarks-in-Word-Documents-using-CSharp-1.jpg
 [30]: https://purchase.groupdocs.com/temporary-license
 [31]: https://docs.groupdocs.com/comparison/net/
 [32]: https://forum.groupdocs.com/c/comparison/
 [33]: https://blog.conholdate.com/2021/04/14/compare-pdf-files-and-highlight-differences-using-csharp/




