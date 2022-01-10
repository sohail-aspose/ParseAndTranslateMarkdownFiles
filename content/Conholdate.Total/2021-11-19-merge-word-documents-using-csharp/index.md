---
title: 'Merge Word Documents using C#'
author: Muzammil Khan
date: 2021-11-19T03:48:57+00:00
summary: 'As a C# developer, you can easily merge two or more Word documents into a single document programmatically. In this article, you will learn <strong>how to merge Word documents using C#</strong>.'
url: /2021/11/19/merge-word-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Combine Word Files using C#'
  - 'Merge DOCX Files using C#'
  - 'Merge Word Documents in C#'
  - Merge Word into PDF

---


{{< figure align=center src="images/Merge-Word-Documents-using-CSharp-1.jpg" alt="Merge Word Documents using C#">}}
 

We can easily merge two or more Word documents into a single document using C#. We do it because sharing or printing a single file is easier than processing multiple files. In this article, we will learn&nbsp;**how to merge Word documents using C#**.

The following topics shall be covered in this article:

  * [C# API to Merge Word Documents][2]
  * [Merge Two or More Word Documents using C#][3]
  * [Combine Specific Pages of Word Documents using C#][4]
  * [Merge DOCX Files and Secure with Password using C#][5]
  * [Merge Word Document into PDF using C#][6]

## C# API to Merge Word Documents {#CSharp-API-to-Merge-Word-Documents}

For merging [DOC][7] or [DOCX][8]&nbsp;files, we will be using [GroupDocs.Merger for .NET][9] API. Please either [download][10]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][11].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Merger</code></pre>

## Merge Two or More Word Documents using C# {#Merge-Two-or-More-Word-Documents-using-CSharp}

We can easily merge two or more Word documents programmatically by following the steps given below:

  * Firstly, load the DOCX file using the&nbsp;**_[Merger][12]_**&nbsp;class.
  * Next, call the&nbsp;**_[Merger.Join()][13]_**&nbsp;method with target DOCX file path to merge with the loaded file.
  * Then, repeat the above step to merge more files.
  * Finally, call the&nbsp;**_[Merger.Save()][14]_**&nbsp;method with the output file path to save the merged file.

The following code sample shows how to merge two or more DOCX files using C#.

{{< gist conholdate-gists ecfd21e81d2b497b08fb4b017b13cf23 "MergeWordDocuments_CSharp_Merge.cs" >}}

{{< figure align=center src="images/Merge-Word-Documents-using-CSharp-1024x365.jpg" alt="Merge two or more Word Documents using C#" caption="Merge two or more Word Documents using C#.">}}
 

## Combine Specific Pages of Word Documents using C# {#Combine-Specific-Pages-of-Word-Documents-using-CSharp}

We can combine specific pages of Word documents programmatically by following the simple steps mentioned below:

  * Firstly, load the DOCX file using the&nbsp;**_[Merger][12]_**&nbsp;class.
  * Next, create an instance of the&nbsp;**_[JoinOptions][16]_&nbsp;**class with the start page and end page number. You may also set range mode to join odd or even pages from the specified page range. 
  * Then, call the _**[Merger.Join()][13]**_ method with the target DOCX file path and _JoinOptions_ object as arguments. The _JoinOptions_ object merges specific pages of the target file with the source file.
  * Finally, call the&nbsp;**_[Merger.Save()][14]_**&nbsp;method with the output file path to save the merged file.

The following code sample shows how to combine selected pages of Word documents using C#.

{{< gist conholdate-gists ecfd21e81d2b497b08fb4b017b13cf23 "MergeWordDocuments_CSharp_CombinePages.cs" >}}

## Merge DOCX Files and Secure with Password using C# {#Merge-and-Secure-with-Password-using-CSharp}

We can merge two or more DOCX files and then secure the merged file with a password programmatically by following the simple steps given below:

  * Firstly, load the DOCX file using the&nbsp;**_[Merger][12]_**&nbsp;class.
  * Next, call the&nbsp;**_[Merger.Join()][13]_**&nbsp;method with target DOCX file path to merge with the loaded file.
  * Optionally, repeat the above step to merge more files.
  * Then, set password using&nbsp;**_[AddPasswordOptions][17]_**
  * After that, call the&nbsp;**_[Merger.AddPassword()][18]_**&nbsp;method with&nbsp;_AddPasswordOptions_.
  * Finally, call the&nbsp;**_[Merger.Save()][14]_**&nbsp;method to save the password-protected merged file.

The following code sample shows how to merge multiple Word documents and then **secure the merged file with a password using C#**.

{{< gist conholdate-gists ecfd21e81d2b497b08fb4b017b13cf23 "MergeWordDocuments_CSharp_MergeAndSecure.cs" >}}

## Merge Word Documents into PDF using C# {#Merge-Word-Document-into-PDF-using-CSharp}

We can merge Word documents into a PDF document programmatically by following the simple steps given below:

  * Firstly, load the PDF file using the&nbsp;**_[Merger][12]_**&nbsp;class.
  * Next, call the&nbsp;**_[Merger.Join()][13]_**&nbsp;method with target DOCX file path to merge with the loaded file.
  * Optionally, repeat the above step to merge more files.
  * Finally, call the&nbsp;**_[Merger.Save()][14]_**&nbsp;method with the output PDF file path to save the merged file.

The following code sample shows **how to merge DOCX files into a PDF file using C#**.

{{< gist conholdate-gists ecfd21e81d2b497b08fb4b017b13cf23 "MergeWordDocuments_CSharp_MergeDOCXWithPDF.cs" >}}

## Get a Free License

Please try the API without evaluation limitations by requesting&nbsp;[a free temporary license][19].

## Conclusion

In this article, we have learned&nbsp;**how to&nbsp;merge two or more Word documents using&nbsp;C#**. We have also seen **how to combine specific pages of Word documents** programmatically. This article also explained how to merge DOCX files into a PDF file using C#. Besides, you can learn more about GroupDocs.Merger for .NET API using the&nbsp;[documentation][20]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][21].

## See Also

  * [Merge Multiple File Types into One File using C#][22]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Merge-Word-Documents-using-CSharp-1.jpg
 [2]: #CSharp-API-to-Merge-Word-Documents
 [3]: #Merge-Two-or-More-Word-Documents-using-CSharp
 [4]: #Combine-Specific-Pages-of-Word-Documents-using-CSharp
 [5]: #Merge-and-Secure-with-Password-using-CSharp
 [6]: #Merge-Word-Document-into-PDF-using-CSharp
 [7]: https://docs.fileformat.com/word-processing/doc/
 [8]: https://docs.fileformat.com/word-processing/docx/
 [9]: https://products.groupdocs.com/merger/net
 [10]: https://downloads.groupdocs.com/merger/net
 [11]: https://www.nuget.org/packages/groupdocs.merger
 [12]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/Merger
 [13]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.merger/join/methods/2
 [14]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.merger/save/methods/1
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Merge-Word-Documents-using-CSharp.jpg
 [16]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/JoinOptions
 [17]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/AddPasswordOptions
 [18]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/addpassword
 [19]: https://purchase.groupdocs.com/temporary-license
 [20]: https://docs.groupdocs.com/merger/net/
 [21]: https://forum.groupdocs.com/c/merger/
 [22]: https://blog.groupdocs.com/2021/05/04/merge-multiple-file-types-using-csharp/




