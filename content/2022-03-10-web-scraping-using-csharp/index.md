---
title: 'Web Scraping using C#'
author: Muzammil Khan
date: 2022-03-10T06:43:17+00:00
summary: 'Web Scraping is a technique used to extract data from websites. In this article, you will learn **how to perform web scraping with HTML parsing using C#**.'
url: /2022/03/10/web-scraping-using-csharp/

categories:
  - Conholdate.Total Product Family
tags:
  - 'C# Web Scraping API'
  - 'Web Crawling using C#'
  - Extract Data from Websites
  - 'Extract Data from Websites using C#'
---

{{< figure align=center src="images/web-scraping-using-csharp.jpg" alt="Web Scraping using C#">}}
 
Web Scraping is a technique used to extract data from websites. It helps to automate the process of extracting data from websites and [HTML][16] files. As a C# developer, we can easily inspect, capture and extract data, such as images, video, audio, etc., from the web pages. In this article, we will learn **how to perform web scraping with HTML parsing using C#**.

The following topics shall be covered in this article:

  * [C# Web Scraping API][1]
  * [Read and Extract HTML using C#][2]
  * [Inspect Document Elements using C#][3]
  * [Find Specific Element using Filters in C#][4]
  * [Query Data from HTML using C#][5]
  * [Extract using CSS Selector in C#][6]

## C# Web Scraping API {#CSharp-Web-Scraping-API}

For web scraping from HTML files or URLs, We will be using [Aspose.HTML for .NET][7] API. It is an advanced HTML processing API that allows to generate, modify, extract data, convert and render HTML documents without any external software. Please either [download][8] the DLL of the API or install it using [NuGet][9].

```
PM> Install-Package Aspose.Html
```

## Read and Extract HTML using C# {#Read-and-Extract-HTML-using-CSharp}

We can read and extract HTML from any HTML document by following the steps given below:

  1. Load an HTML document using the _**[HTMLDocument][10]**_ class.
  2. Display the inner HTML of the file to the console.

The following code sample shows **how to read and extract HTML content using C#**.

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_ReadDocument.cs" >}}

{{< figure align=center src="images/Read-and-Extract-HTML-using-CSharp.jpg" alt="Read and Extract HTML using C#." caption="Read and Extract HTML using C#.">}}

Similarly, we can read and extract HTML from live websites as shown below:

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_ReadFromURL.cs" >}}
 

## Inspect Document Elements using C# {#Inspect-Document-Elements-using-CSharp}

We can inspect the document and its elements by following the steps given below:

  1. Load an HTML document using the _**[HTMLDocument][10]**_ class.
  2. Get the HTML element of the document.
  3. Get the first/last elements of the HTML element.
  4. Display element details such as TagName, TextContent.

The following code sample shows **how to inspect the document elements using C#**.

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_InspectDocumentElements.cs" >}}


## Find Specific Elements using Filters in C# {#Find-Specific-Element-using-Filters-in-CSharp}

We can use custom filters to find specific elements such as get all images, links, etc. For this purpose, the API provides the TreeWalker interface. It allows navigating a document tree or subtree using the view of the document defined by their whatToShow flags and filter (if any). We can find specific elements using filters by following the steps given below:

  1. Define filters using the NodeFilter class and override the AcceptNode() method.
  2. Load an HTML document using the _**[HTMLDocument][10]**_ class.
  3. Call the CreateTreeWalker() method. It takes root node, what to show, and NodeFilter as arguments.

The following code sample shows **how to read and extract HTML content using C#**.

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_FindUsingFilters.cs" >}}

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_Filters.cs" >}}

## Query Data from HTML using C# {#Query-Data-from-HTML-using-CSharp}

We can also use XPath Query to query data from an HTML document by following the steps given below:

  1. Load an HTML document using the _**[HTMLDocument][10]**_ class.
  2. Call the Evaluate() method. It takes XPath expression string, document, and type as arguments.
  3. Finally, loop through the resulting nodes and display text

The following code sample shows **how to query data with XPath queries using C#**.

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_XPathQuery.cs" >}}
 
## Extract using CSS Selector in C# {#Extract-using-CSS-Selector-in-CSharp}

We can extract HTML content using CSS selectors as well. For this purpose, the API provides the [QuerySelectorAll()][11] method that allows navigation through an HTML document and searches the needed elements. It takes the query selector as a parameter and returns a matching NodeList of all the elements. We can query using CSS selectors by following the steps given below:

  1. Load an HTML document using the _**[HTMLDocument][10]**_ class.
  2. Call the QuerySelectorAll() method. It takes the query selector as an argument.
  3. Finally, loop through the resulting list of elements.

The following code sample shows **how to extract HTML content using CSS selectors in C#**.

{{< gist conholdate-gists 796e183d59ef66fff44bb7cfb6926ee8 "WebScraping_CSharp_ExtractUsingCSSSelector.cs" >}}
 
## Get a Free License

Please try the API without evaluation limitations by requesting [a free temporary license][12].

## Conclusion

In this article, we have learned how to:
  * read and extract the content of an HTML document using C#;
  * inspect Document Elements and find a specific element from HTML;
  * query a specific data and extract data using CSS Selector;

Besides, you can learn more about Aspose.HTML for .NET API using the [documentation][13]. In case of any ambiguity, please feel free to contact us on the [forum][14].

## See Also

  * [C# Convert HTML to JPG, PNG, BMP and GIF Image with .NET][15]

  [1]: #CSharp-Web-Scraping-API
  [2]: #Read-and-Extract-HTML-using-CSharp
  [3]: #Inspect-Document-Elements-using-CSharp
  [4]: #Find-Specific-Element-using-Filters-in-CSharp
  [5]: #Query-Data-from-HTML-using-CSharp
  [6]: #Extract-using-CSS-Selector-in-CSharp
  [7]: https://products.aspose.com/html/net/
  [8]: https://downloads.aspose.com/html/net/
  [9]: https://www.nuget.org/packages/aspose.html
  [10]: https://apireference.aspose.com/html/net/aspose.html/htmldocument
  [11]: https://apireference.aspose.com/html/net/aspose.html.dom/document/methods/queryselectorall
  [12]: https://purchase.conholdate.com/temporary-license
  [13]: https://docs.aspose.com/html/net/
  [14]: https://forum.aspose.com/c/html/
  [15]: https://blog.aspose.com/2020/05/30/html-to-jpg-png-bmp-and-gif-images-csharp/
  [16]: https://docs.fileformat.com/web/html/