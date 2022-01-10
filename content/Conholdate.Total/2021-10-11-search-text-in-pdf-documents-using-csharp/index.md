---
title: 'Search Text in PDF Documents using C#'
author: Muzammil Khan
date: 2021-10-11T06:51:13+00:00
summary: 'As a C# developer, you can easily search for any text from PDF documents programmatically in your .NET applications. In this article, you will learn <strong>how to search for a word in PDF documents using C#</strong>.'
url: /2021/10/11/search-text-in-pdf-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - API for Searching Text
  - Case-Sensitive Search
  - Search a Word in PDF
  - Search in Documents
  - Search Text in PDF

---


{{< figure align=center src="images/search-for-a-word-in-pdf-using-csharp.jpg" alt="Search for a Word in PDF using C#">}}
 

You may need to search for a piece of particular information, text phrase, or a word from your documents. As a C# developer, you can easily search for any text from PDF documents programmatically in your .NET applications. In this article, you will learn&nbsp;**how to search text in PDF documents using C#**.

The following topics are discussed/covered in this article:

  * [C# API for Searching Text][2]
  * [Search Text in PDF Documents using C#][3]
  * [Case-Sensitive Text Search in PDF using C#][4]

## C# API for Searching Text {#api-for-searching-text}

For searching text in&nbsp;[PDF][5]&nbsp;documents, I will be using&nbsp;[GroupDocs.Search for .NET][6]&nbsp;API. It allows you to perform text search operations in all [popular document formats][7] such as PDF, Word, Excel, PowerPoint, and many more. It also enables you to fetch your required information from files, documents, emails, and archives. You can create and merge multiple indexes to rapidly and smartly search through them using simple, Boolean, Regular Expression (Regex), Fuzzy, and other types of queries.&nbsp;

You can either&nbsp;[download][8]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][9].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Search</code></pre>

## Search Text in PDF Documents using C# {#Search-Text-in-PDF-Documents-using-CSharp}

You can search for any text or a specific word in your PDF documents programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;[Index][10] class
  * Specify the path to the index folder
  * Subscribe to the&nbsp;[index events][11]
  * Add PDF files to the Index by calling the&nbsp;[Add()][12]&nbsp;method
  * Define a search query
  * Perform a search using the&nbsp;[Search()][13]&nbsp;method with search query
  * Use the&nbsp;[SearchResult][14]&nbsp;and print summary
  * Highlight the searched results in the output using the&nbsp;[Highlight()][15]&nbsp;method

The following code sample shows **how to search text in PDF documents using C#**.

{{< gist conholdate-gists 5c75c32a9c2dfcd6aeee53c634266130 "SearchInPDF_CSharp_Search.cs" >}}

The above code sample will generate the following output:

<pre class="wp-block-code"><code>Documents found: 1
Total occurrences found: 4
        Document: C:\Files\Files\sample.pdf
        Occurrences: 4

Generated HTML file can be opened with Internet browser.
The file can be found by the following path:
C:\Files\Files\Highlighted.html</code></pre>

{{< figure align=center src="images/Search-Text-or-Word-in-PDF-using-CSharp.jpg" alt="Search-Text-or-Word-in-PDF-using-CSharp" caption="Highlighted the Searched Text in PDF Documents using C#">}}
 

### The Index and Index Event

The&nbsp;[Index][10]&nbsp;class is the main class that provides functionality to index the documents and search through them. An index can be created in memory or on disk by calling the constructor of this class. In the above code example, I have created the index on disk so that it can be reused.

The&nbsp;[ErrorOccurred][11]&nbsp;event shows the errors if any occurs during indexing the files. So, you need to subscribe to this in order to receive information about indexing errors.

### Add Files to the Index

The&nbsp;[Add()][12]&nbsp;method of the Index class adds a file or all files in a specified folder or subfolders by an absolute or relative path. All the documents on the given path will be indexed.

### Perform a Search Operation

The Index class provides various&nbsp;[Search][13]&nbsp;methods to perform the search operation. You can search by providing a simple keyword or by defining a&nbsp;[SearchQuery][17].

The&nbsp;[SearchResult][14]&nbsp;class provides details of a search result matching a search query. The following methods and properties of this class facilitate getting details of search results:

  * The&nbsp;[OccurrenceCount][18] property shows the total number of occurrences found.
  * The [DocumentCount][19] property provides the number of documents found in the Index.
  * The&nbsp;[GetFoundDocument(int)][20]&nbsp;method returns the&nbsp;[FoundDocument][21] by its index.
  * The&nbsp;[FoundDocument.OccurrenceCount][22] property returns the number of occurrences found in the document.

### Highlight the Search Results

The&nbsp;[HtmlHighlighter][23]&nbsp;class highlights the search results in an entire text of the document formatted in HTML.

The&nbsp;[Highlight()][15]&nbsp;method of the Index class generates HTML output highlighting occurrences of found terms. You can find more details about “[Highlighting Search Results][24]” in the documentation.

## Case-Sensitive Text Search in PDF using C# {#Case-Sensitive-Text-Search-in-Files-using-CSharp}

You can search for any specific text phrase or a word considering uppercase and lowercase letters in your PDF documents programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;[Index][10] class
  * Specify the path to the index folder
  * Add PDF files to the Index by calling the&nbsp;[Add()][12]&nbsp;method
  * Create an instance of the [SearchOptions][25]
  * Set the [UseCaseSensitiveSearch][26] property to true
  * Define a search query
  * Perform a search using the&nbsp;[Search()][13]&nbsp;method with search query and the SearchOptions
  * Use the&nbsp;[SearchResult][14]&nbsp;and print summary

The following code sample shows **how to perform a **case-sensitive text**** **search in a PDF document using C#**.

{{< gist conholdate-gists 5c75c32a9c2dfcd6aeee53c634266130 "SearchInPDF_CSharp_SearchCaseSensitive.cs" >}}

<pre class="wp-block-code"><code>Documents found: 1
Total occurrences found: 2
        Document: C:\Files\Files\sample.pdf
        Occurrences: 2</code></pre>

The [SearchOptions][25] class provides options to perform the search operations. The [UseCaseSensitiveSearch][26] property of this class allows you to perform a case-sensitive search for a word or text. 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][27].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;search text in a PDF document using C#**. You have also learned **how to perform a** **case-sensitive text search in a PDF document using C#**. You can learn more about GroupDocs.Search for .NET API using the&nbsp;[documentation][28]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][29].

## See Also

  * [Search Text in Word, Excel, PDF, ZIP Document Formats using C# .NET][30]
  * [Build your full text search solution programmatically in C#][31]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/search-for-a-word-in-pdf-using-csharp.jpg
 [2]: #api-for-searching-text
 [3]: #Search-Text-in-PDF-Documents-using-CSharp
 [4]: #Case-Sensitive-Text-Search-in-Files-using-CSharp
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://products.groupdocs.com/search/net
 [7]: https://docs.groupdocs.com/search/net/supported-document-formats/
 [8]: https://downloads.groupdocs.com/search/net
 [9]: https://www.nuget.org/packages/groupdocs.search
 [10]: https://apireference.groupdocs.com/search/net/groupdocs.search/index
 [11]: https://apireference.groupdocs.com/search/net/groupdocs.search.events/eventhub/events/erroroccurred
 [12]: https://apireference.groupdocs.com/search/net/groupdocs.search.index/add/methods/1
 [13]: https://apireference.groupdocs.com/search/net/groupdocs.search.index/search/methods/2
 [14]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult
 [15]: https://apireference.groupdocs.com/search/net/groupdocs.search/index/methods/highlight
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Search-Text-or-Word-in-PDF-using-CSharp.jpg
 [17]: https://apireference.groupdocs.com/search/net/groupdocs.search/SearchQuery
 [18]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult/properties/occurrencecount
 [19]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult/properties/documentcount
 [20]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult/methods/getfounddocument
 [21]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/FoundDocument
 [22]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/founddocument/properties/occurrencecount
 [23]: https://apireference.groupdocs.com/search/net/groupdocs.search.highlighters/HtmlHighlighter
 [24]: https://docs.groupdocs.com/search/net/highlighting-search-results/
 [25]: https://apireference.groupdocs.com/search/net/groupdocs.search.options/searchoptions
 [26]: https://apireference.groupdocs.com/search/net/groupdocs.search.options/searchoptions/properties/usecasesensitivesearch
 [27]: https://purchase.groupdocs.com/temporary-license
 [28]: https://docs.groupdocs.com/search/net/
 [29]: https://forum.groupdocs.com/c/search/
 [30]: https://blog.groupdocs.com/2020/05/29/search-text-in-word-excel-pdf-zip-document-formats-using-csharp-net/
 [31]: https://blog.groupdocs.com/2019/11/22/build-your-full-text-search-solution-in-csharp/




