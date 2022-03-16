---
title: 'Add Hyperlinks and Bookmarks Dynamically using C#'
author: Muzammil Khan
date: 2022-03-11T06:43:17+00:00
summary: 'Hyperlinks and bookmarks are handy for the users to navigate the relevant content quickly. In this article, you will learn **how to add hyperlinks and bookmarks to your reports dynamically using C#**.'
url: /2022/03/11/add-hyperlinks-and-bookmarks-dynamically-using-csharp/

categories:
  - Conholdate.Total Product Family
tags:
  - 'C# API to Add Hyperlinks and Bookmarks Dynamically'
  - 'Add Hyperlinks Dynamically C#'
  - 'Add Bookmarks Dynamically C#'
  - 'Insert Hyperlinks to Reports C#'
  - 'Insert Bookmarks to Reports C#'
---

{{< figure align=center src="images/add-hyperlinks-and-bookmarks-dynamically-using-csharp.jpg" alt="Add Hyperlinks and Bookmarks Dynamically using C#">}}
 
Hyperlinks and bookmarks are handy for the users to navigate the relevant content quickly. When a hyperlink is clicked, it opens the URL in the browser or navigates to the specified bookmark location within the document. In this article, we will learn **how to add hyperlinks and bookmarks to reports dynamically using C#**.

The following topics shall be covered in this article:

  * [C# API to Add Hyperlinks and Bookmarks Dynamically][1]
  * [Add Hyperlinks Dynamically using C#][2]
  * [Add Bookmarks Dynamically using C#][3]
  * [Insert Bookmark as Hyperlink using C#][4]

## C# API to Add Hyperlinks and Bookmarks Dynamically {#CSharp-API-to-Add-Hyperlinks-and-Bookmarks-Dynamically}

For adding hyperlinks and bookmarks to reports dynamically, We will be using [GroupDocs.Assembly for .NET][5] API. It allows building powerful document automation and report generation applications. It fetches data from the data source as per the defined template document, assembles it, and generates reports in the specified output format. Please either [download][6] the DLL of the API or install it using [NuGet][7].

```
PM> Install-Package GroupDocs.Assembly
```

## Add Hyperlinks Dynamically using C# {#Add-Hyperlinks-Dynamically-using-CSharp}

We can insert hyperlinks to reports dynamically using the link tags. The syntax of a link tag to be used in the template document is defined as follows:

```
<<link [uri_expression][display_text_expression]>>
```

The **uri_expression** defines the URI for a hyperlink, whereas the **display_text_expression** defines the text to be displayed for the hyperlink.

We can insert hyperlinks to reports dynamically by following the steps given below:

  1. Create an instance of the _**[DocumentAssembler][8]**_ class.
  2. Call the AssembleDocument() method to assemble the document. It takes source document template path, target document path, and data source as arguments.

The following code sample shows **how to add hyperlinks dynamically using C#**.

{{< gist conholdate-gists cbf7d18732b7a855f90544abe71b88d4 "AddHyperlinksAndBookmarksDynamically_CSharp_InsertHyperlinks.cs" >}}

{{< figure align=center src="images/Add-Hyperlinks-Dynamically-using-CSharp.jpg" alt="Add Hyperlinks Dynamically using C#." caption="Add Hyperlinks Dynamically using C#.">}}
 

## Add Bookmarks Dynamically using C# {#Add-Bookmarks-Dynamically-using-CSharp}

We can insert bookmarks to reports dynamically using the bookmark tags. The syntax of a bookmark tag to be used in the template document is defined as follows:

```
<<bookmark [bookmark_expression]>>
bookmarked_content
<</bookmark>>
```

The **bookmark_expression** defines the name of a bookmark to be inserted.

We can insert bookmarks to reports dynamically by following the steps given below:

  1. Create an instance of the _**[DocumentAssembler][8]**_ class.
  2. Call the AssembleDocument() method to assemble the document. It takes source document template path, target document path, and data source as arguments.

The following code sample shows **how to add bookmarks dynamically using C#**.

{{< gist conholdate-gists cbf7d18732b7a855f90544abe71b88d4 "AddHyperlinksAndBookmarksDynamically_CSharp_InsertBookmarks.cs" >}}


## Insert Bookmark as Hyperlink using C# {#Insert-Bookmark-as-Hyperlink-using-CSharp}

We can also link bookmarks to hyperlinks within a document by following the steps mentioned earlier. However, we just need to set the same value for the uriExpression and bookmark_expression as shown below:

```
const string bookmark_expression = "gd_bookmark";
const String uriExpression = "gd_bookmark";
```

The following code sample shows **how to insert a bookmark as a hyperlink using C#**.

{{< gist conholdate-gists cbf7d18732b7a855f90544abe71b88d4 "AddHyperlinksAndBookmarksDynamically_CSharp_BookmarkAsLink.cs" >}}

{{< figure align=center src="images/Insert-Bookmark-as-Hyperlink-using-CSharp.jpg" alt="Insert Bookmark as Hyperlink using C#." caption="Insert Bookmark as Hyperlink using C#.">}}

## Get a Free License

Please try the API without evaluation limitations by requesting [a free temporary license][9].

## Conclusion

In this article, we have learned how to:
  * insert hyperlinks and bookmarks to reports dynamically using C#;
  * add a hyperlink to a bookmark dynamically.

Besides, you can learn more about GroupDcos.Assembly for .NET API using the [documentation][10]. In case of any ambiguity, please feel free to contact us on the [forum][11].

## See Also

  * [Generate Reports from Excel Data in C#][12]

  [1]: #CSharp-API-to-Add-Hyperlinks-and-Bookmarks-Dynamically
  [2]: #Add-Hyperlinks-Dynamically-using-CSharp
  [3]: #Add-Bookmarks-Dynamically-using-CSharp
  [4]: #Insert-Bookmark-as-Hyperlink-using-CSharp
  [5]: https://products.groupdocs.com/assembly/net/
  [6]: https://downloads.groupdocs.com/assembly/net
  [7]: https://www.nuget.org/packages/groupdocs.assembly
  [8]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly/documentassembler
  [9]: https://purchase.conholdate.com/temporary-license
  [10]: https://docs.groupdocs.com/assembly/net/
  [11]: https://forum.groupdocs.com/c/assembly/15
  [12]: https://blog.conholdate.com/2021/04/29/generate-reports-from-excel-data-in-csharp/