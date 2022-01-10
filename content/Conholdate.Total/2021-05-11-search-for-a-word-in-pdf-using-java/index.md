---
title: Search for a Word in PDF using Java
author: Muzammil Khan
date: 2021-05-11T12:32:49+00:00
summary: 'Search for a word or any text in PDF documents programmatically in your Java applications. In this article, you will learn <strong>how to search for a word in PDF documents using Java</strong>.'
url: /2021/05/11/search-for-a-word-in-pdf-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Search a Word in PDF
  - Search in Documents
  - Search in PDF using Java
  - Search Text in PDF
  - Search Text in PDF using Java

---


{{< figure align=center src="images/Search-in-PDF-1.jpg" alt="Search for a word in PDF using Java">}}
 

You may need to search for a specific text from Word or PDF documents. As a Java developer, you can search any text from PDF documents programmatically. In this article, you will learn&nbsp;**how to search for a word in PDF documents using Java**.

The following topics are discussed/covered in this article:

  * [Java API for Searching Text][2]
  * [Search Text in PDF using Java][3]

## Java API for Searching Text {#api-for-searching-text}

I will be using [GroupDocs.Search for Java][4] API for searching in [PDF][5] documents. It allows you to perform text search operations in all popular document formats such as PDF, Word, Excel, PowerPoint, and many more. You can fetch your required information from files, documents, emails, and archives easily using this API. It also enables you to create and merge multiple indexes. You can use simple, Boolean, Regular Expression (Regex), Fuzzy, and other types of queries to rapidly and smartly search through indexes. 

### Download and Configure

You can&nbsp;[download][6]&nbsp;the JAR of the API or just add the following **_pom.xml_** configuration in your Maven-based Java applications to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-search&lt;/artifactId&gt;
        &lt;version&gt;20.11&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Search Text in PDF using Java {#search-text-from-pdf}

You can easily search any text or a specific word in your PDF documents by following the simple steps mentioned below:

  * Create an [Index][7]
  * Specify the path to the index folder
  * Subscribe to [index events][8]
  * Add files to Index by calling the [add][9] method
  * Perform a search using the [search][10] method
  * Use [SearchResult][11] and print summary
  * Highlight the searched results in the output using the [highlight][12] method

The following code sample shows how to search a word from a PDF document using Java.

{{< gist conholdate-gists 19b2660177df759b284e9442403e92cf "SearchInPDF_Java_search.java" >}}

The above code sample shall generate the following output:

<pre class="wp-block-code"><code>Documents found: 1
Total occurrences found: 6
	Document: C:\Files\Lorem ipsum.pdf
	Occurrences: 6

Generated HTML file can be opened with Internet browser.
The file can be found by the following path:
C:\Output\Highlighted.html</code></pre>

{{< figure align=center src="images/Search-word-in-PDF-1-1024x531.jpg" alt="Search for a word in PDF document using Java" caption="Search for a word in PDF document using Java">}}
 

### The Index and Index Event

The [Index][7] class is the main class for indexing documents and search through them. An index can be created in memory or on disk by calling the constructor of this class. I have created it on disk so that it can be reused. 

To receive information about indexing errors, I have subscribed to the [ErrorOccurred][8] event. It will show the errors if any occurred during indexing the files.

### Add Files to Index

The [add][9] method of the Index class adds a file or all files in a folder or subfolders by an absolute or relative path. All the documents on the given path will be indexed.

### Perform a Search Operation

The Index class provides various [search][10] methods to perform the search operation. You can search by simple keyword or by defining a [SearchQuery][14].

The [SearchResult][11] class provides details of a search result matching a search query. Some of the methods are described here:

  * The [getOccurrenceCount][15]() method returns the total number of occurrences found
  * The getDocumentCount() method provides the number of documents found in the Index
  * The [getFoundDocument(int)][16] method returns the [FoundDocument][17]
  * The [FoundDocument.getOccurrenceCount()][18] method returns the number of occurrences found in the document

### Highlight the Search Results

The [HtmlHighlighter][19] class facilitates highlighting the search results in an entire document text formatted in HTML.

The [highlight][12] method of the Index class generates HTML output highlighting occurrences of found terms. You can find more details about “[Highlighting Search Results][20]” in the documentation.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][21].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;search for a word in a PDF document using Java**. You can learn more about GroupDocs.Search for Java API using the&nbsp;[documentation][22]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][23].

## See Also

  * [Search Text in Word, Excel, PDF, ZIP Document Formats using C# .NET][24]
  * [Build your full text search solution programmatically in C#][25]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Search-in-PDF-1.jpg
 [2]: #api-for-searching-text
 [3]: #search-text-from-pdf
 [4]: https://products.groupdocs.com/search/java
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://downloads.groupdocs.com/search/java
 [7]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index
 [8]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.events/EventHub#ErrorOccurred
 [9]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index#add(java.lang.String)
 [10]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index#search(java.lang.String)
 [11]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/SearchResult
 [12]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index#highlight(com.groupdocs.search.results.FoundDocument,%20com.groupdocs.search.highlighters.Highlighter)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Search-word-in-PDF-1.jpg
 [14]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/SearchQuery
 [15]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/SearchResult#getOccurrenceCount()
 [16]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/SearchResult#getFoundDocument(int)
 [17]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/FoundDocument
 [18]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/FoundDocument#getOccurrenceCount()
 [19]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.highlighters/HtmlHighlighter
 [20]: https://docs.groupdocs.com/search/java/highlighting-search-results/
 [21]: https://purchase.groupdocs.com/temporary-license
 [22]: https://docs.groupdocs.com/search/java/
 [23]: https://forum.groupdocs.com/c/search/
 [24]: https://blog.groupdocs.com/2020/05/29/search-text-in-word-excel-pdf-zip-document-formats-using-csharp-net/
 [25]: https://blog.groupdocs.com/2019/11/22/build-your-full-text-search-solution-in-csharp/




