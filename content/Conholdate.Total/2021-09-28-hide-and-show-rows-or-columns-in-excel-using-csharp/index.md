---
title: 'Hide and Show Rows or Columns in Excel using C#'
author: Muzammil Khan
date: 2021-09-28T05:53:10+00:00
summary: 'As a C# developer, you can easily hide and show the rows or columns in the Excel worksheets programmatically. In this article, you will learn <strong>how to hide and show rows or columns of an Excel sheet using C#</strong>.'
url: /2021/09/28/hide-and-show-rows-or-columns-in-excel-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - Hide Columns in Excel
  - Hide Rows and Columns
  - Hide Rows in Excel
  - hide/unhide rows and columns

---


{{< figure align=center src="images/hide-or-show-rows-and-columns-in-excel-using-csharp.jpg" alt="Hide or Show Rows and Columns in Excel using C#">}}
 

As a C# developer, you can easily hide and show the rows or columns in the Excel worksheets programmatically. In this article, you will learn **how to hide and show rows or columns of an Excel sheet using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Hide and Show Rows or Columns][2]
  * [Hide Rows and Columns using C#][3]
  * [Show Hidden Rows and Columns using C#][4]
  * [Hide Multiple Rows and Columns using C#][5]
  * [Show All Hidden Rows and Columns using C#][6]

## C# API to Hide and Show Rows or Columns {#CSharp-API-to-Hide-and-Show-Rows-or-Columns}

For hiding and showing the rows and columns in&nbsp;an [Excel][7]&nbsp;sheet, I will be using&nbsp;[Aspose.Cells for .NET API][8]. It&nbsp;is a well-known spreadsheet manipulation API that lets you create and process Excel files from within your .NET applications. The API allows you to hide any of the rows and columns in the Excel files or show the hidden rows and columns programmatically.

You can either&nbsp;[download][9]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][10].

<pre class="wp-block-code"><code>Install-Package Aspose.Cells</code></pre>

## Hide Rows and Columns using C# {#Hide-Rows-and-Columns-using-CSharp}

You can hide rows and columns in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the [Workbook][11] class with the input file path.
  * Create an instance of the [Worksheet][12] class.
  * Access the worksheet from [Worksheets][13] collection by its index.
  * Hide the row by calling the [HideRow()][14] method and pass the row index to hide.
  * Hide the column by calling the [HideColumn()][15] method and pass the column index to hide.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows **how to hide the rows and columns in an Excel sheet using C#**.

{{< gist conholdate-gists c8b7bf4199a0f3276845b27d310d7b43 "HideUnhideRowsColumns_CSharp_Hide.cs" >}}

{{< figure align=center src="images/Hide-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Hide Rows and Columns using C#" caption="Hide Rows and Columns using C#.">}}
 

The [Workbook][11] class represents an Excel workbook and provides several properties and methods to work with the workbook. The [Worksheets][13] property of this class represents the collection of available worksheets. The [Worksheet][12] class represents a single worksheet of an Excel workbook. It exposes several properties and methods to perform various operations on the worksheet. The [Cells][18] property of this class represents a collection of cells available in the worksheet.

The [HideRow()][14] method of the [Cells][19] class hides a specific row. It takes a row index as an input parameter to hide that row. The Cells class also provides the [HideColumn()][15] method to hide a specific column based on the column index provided as an input parameter.

The [Save()][16] method of the Workbook class saves the workbook at the specified file path provided as an input parameter.

## Show Hidden Rows and Columns using C# {#Show-Hidden-Rows-and-Columns-using-CSharp}

You can show the specific hidden rows and columns in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the [Workbook][11] class with the input file path.
  * Create an instance of the [Worksheet][12] class.
  * Access the worksheet from [Worksheets][13] collection by its index.
  * Show the hidden row by calling the [UnhideRow()][20] method
  * Pass the row index of the hidden row and row height to set.
  * Show the hidden column by calling the [UnhideColumn()][21] method
  * Pass the column index of the hidden column and column width to set.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows **how to show the specific** **hidden rows and columns in an Excel sheet using C#**.

{{< gist conholdate-gists c8b7bf4199a0f3276845b27d310d7b43 "HideUnhideRowsColumns_CSharp_Show.cs" >}}

{{< figure align=center src="images/Show-Hidden-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Show Hidden Rows and Columns using C#" caption="Show Hidden Rows and Columns using C#">}}
 

The [UnhideRow()][20] method of the [Cells][19] class shows a specific hidden row in the worksheet. It takes a row index of a hidden row as an input parameter to make it visible. The Cells class also provides the [unhideColumn()][21] method to show a hidden column based on the column index provided as an input parameter.

## Hide Multiple Rows and Columns using C# {#Hide-Multiple-Rows-and-Columns-using-CSharp}

You can hide multiple rows and columns in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the [Workbook][11] class with the input file path.
  * Create an instance of the [Worksheet][12] class.
  * Access the worksheet from [Worksheets][13] collection by its index.
  * Call the [HideRows()][23] method, pass the starting row index and total rows to hide.
  * Call the [HideColumns()][24] method, pass the starting column index and total columns to hide.
  * Save by calling the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows **how to hide multiple rows and columns in an Excel sheet using C#**.

{{< gist conholdate-gists c8b7bf4199a0f3276845b27d310d7b43 "HideUnhideRowsColumns_CSharp_HideMultiple.cs" >}}

{{< figure align=center src="images/Hide-Multiple-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Hide Multiple Rows and Columns using C#" caption="Hide Multiple Rows and Columns using C#.">}}
 

The Cells class provides the [HideRows()][23] method to hide multiple rows. You need to specify the starting row index and the total number of rows to hide as input parameters. Similarly, for hiding multiple columns, the Cells class provides the [HideColumns()][24] method that takes the column index and the total number of columns to hide as input parameters.

## Show All Hidden Rows and Columns using C# {#Show-All-Hidden-Rows-and-Columns-using-CSharp}

You can show all the hidden rows and columns in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the [Workbook][11] class with the input file path.
  * Create an instance of the [Worksheet][12] class.
  * Access the worksheet from [Worksheets][13] collection by its index.
  * Check [IsHidden][26] property for all rows one by one, if true then 
      * Call the [UnhideRow()][20] method with row index and row height to set.
  * Check [IsHidden][27] property for all columns one by one, if true then
      * Call the [UnhideColumn()][21] method with column index and column width to set.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows **how to show all the hidden rows and columns in an Excel sheet using C#**.

{{< gist conholdate-gists c8b7bf4199a0f3276845b27d310d7b43 "HideUnhideRowsColumns_CSharp_ShowAll.cs" >}}

{{< figure align=center src="images/Show-All-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Show All Hidden Rows and Columns using C#" caption="Show All Hidden Rows and Columns using C#.">}}
 

The [IsHidden][26] property of the [Row][29] class indicates whether the row is hidden. Similarly, the [IsHidden][27] property of the [Column][30] class indicates whether the column is hidden.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][31].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;hide columns and rows in Excel files** using C#. You have also learned&nbsp;**how to show hidden columns and rows in Excel files** programmatically. Moreover, you have learned&nbsp;**how to hide multiple rows and columns in an Excel sheet**. This article also explained&nbsp;**how to show all hidden rows and columns in Excel using C#**. You can learn more about Aspose.Cells for .NET API using the&nbsp;[documentation][32]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][33].

## See Also

  * [Delete Blank Rows and Columns in Excel using C#][34]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/hide-or-show-rows-and-columns-in-excel-using-csharp.jpg
 [2]: #CSharp-API-to-Hide-and-Show-Rows-or-Columns
 [3]: #Hide-Rows-and-Columns-using-CSharp
 [4]: #Show-Hidden-Rows-and-Columns-using-CSharp
 [5]: #Hide-Multiple-Rows-and-Columns-using-CSharp
 [6]: #Show-All-Hidden-Rows-and-Columns-using-CSharp
 [7]: https://docs.fileformat.com/spreadsheet/xlsx/
 [8]: https://products.aspose.com/cells/net/
 [9]: https://downloads.aspose.com/cells/net
 [10]: https://www.nuget.org/packages/aspose.cells
 [11]: https://apireference.aspose.com/cells/net/aspose.cells/workbook
 [12]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet
 [13]: https://apireference.aspose.com/cells/net/aspose.cells/workbook/properties/worksheets
 [14]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hiderow
 [15]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hidecolumn
 [16]: https://apireference.aspose.com/cells/net/aspose.cells.workbook/save/methods/2
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Hide-Rows-and-Columns-using-CSharp.jpg
 [18]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet/properties/cells
 [19]: https://apireference.aspose.com/cells/net/aspose.cells/cells
 [20]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/unhiderow
 [21]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/unhidecolumn
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Show-Hidden-Rows-and-Columns-using-CSharp.jpg
 [23]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hiderows
 [24]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hidecolumns
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Hide-Multiple-Rows-and-Columns-using-CSharp.jpg
 [26]: https://apireference.aspose.com/cells/net/aspose.cells/row/properties/ishidden
 [27]: https://apireference.aspose.com/cells/net/aspose.cells/column/properties/ishidden
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Show-All-Rows-and-Columns-using-CSharp.jpg
 [29]: https://apireference.aspose.com/cells/net/aspose.cells/row
 [30]: https://apireference.aspose.com/cells/net/aspose.cells/column
 [31]: https://purchase.aspose.com/temporary-license
 [32]: https://docs.aspose.com/cells/net/
 [33]: https://forum.aspose.com/c/cells/9
 [34]: https://blog.conholdate.com/2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/




