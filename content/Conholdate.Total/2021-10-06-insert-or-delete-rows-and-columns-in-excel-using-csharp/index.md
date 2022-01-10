---
title: 'Insert or Delete Rows and Columns in Excel using C#'
author: Muzammil Khan
date: 2021-10-06T10:01:28+00:00
summary: 'As a C# developer, you can easily insert or delete the rows and columns in the Excel worksheets programmatically. In this article, you will learn <strong>how to insert or delete rows and columns in an Excel sheet using C#</strong>.'
url: /2021/10/06/insert-or-delete-rows-and-columns-in-excel-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - Delete Columns from Excel
  - Delete Rows from Excel
  - Insert Columns in Excel
  - Insert Rows in Excel

---


{{< figure align=center src="images/insert-or-delete-rows-and-columns-in-excel-using-csharp.jpg" alt="Insert or Delete Rows and Columns in Excel using C#">}}
 

As a C# developer, you can easily insert or delete the rows and columns in the Excel worksheets programmatically. In this article, you will learn&nbsp;**how to insert or delete rows and columns in an Excel sheet using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Insert or Delete Rows and Columns][2]
  * [Insert Rows in Excel Worksheets using C#][3]
  * [Insert Rows with Formatting in Excel Worksheets using C#][4]
  * [Delete Rows from Excel Worksheets using C#][5]
  * [Insert Columns in Excel Worksheets using C#][6]
  * [Delete Columns from Excel Worksheets using C#][7]

## C# API to Insert or Delete Rows and Columns {#CSharp-API-to-Insert-or-Delete-Rows-and-Columns}

For inserting or deleting the rows and columns in&nbsp;an&nbsp;[Excel][8]&nbsp;sheet, I will be using&nbsp;[Aspose.Cells for .NET API][9]. It&nbsp;is a well-known spreadsheet manipulation API that lets you create and process Excel files from within your .NET applications. The API allows you to insert single or multiple rows and columns in the Excel files. It also enables you to delete the rows and columns programmatically.

You can either&nbsp;[download][10]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][11].

<pre class="wp-block-code"><code>Install-Package Aspose.Cells</code></pre>

## Insert Rows in Excel Worksheets using C# {#Insert-Rows-in-Excel-Worksheets-using-CSharp}

You can insert rows in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;[Workbook][12]&nbsp;class with the input file path.
  * Create an instance of the&nbsp;[Worksheet][13]&nbsp;class.
  * Access the worksheet from&nbsp;[Worksheets][14]&nbsp;collection by its index.
  * Insert rows by calling the&nbsp;[InsertRows()][15]&nbsp;method and pass the row index to start from and total rows to insert.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows&nbsp;**how to insert multiple rows in an Excel sheet using C#**.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_InsertRows.cs" >}}

{{< figure align=center src="images/Insert-Multiple-Rows-in-Excel-Worksheets-using-CSharp-1024x426.jpg" alt="Insert Rows in Excel Worksheets using C#" caption="Insert Multiple Rows in Excel Worksheets using C#.">}}
 

Similarly, you can insert a single row in an Excel sheet using the following code example.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_InsertRow.cs" >}}

{{< figure align=center src="images/Insert-Rows-in-Excel-Worksheets-using-CSharp-1024x342.jpg" alt="Insert a single Row in Excel Worksheets using C#" caption="Insert a single Row in Excel Worksheets using C#">}}
 

The&nbsp;[Workbook][12]&nbsp;class of the API represents an Excel workbook. You can get a collection of all the available worksheets within a workbook using the&nbsp;[Worksheets][14]&nbsp;property of this class. Any single worksheet of an Excel workbook can be accessed from the Worksheets&#8217; collection by using its index. The&nbsp;[Worksheet][13]&nbsp;class represents a single worksheet. It exposes several properties and methods to perform various operations on the worksheet. The&nbsp;[Cells][19]&nbsp;property of this class represents a collection of cells available in the worksheet. The [Cells][20] class represents an individual cell within the worksheet.

The&nbsp;[InsertRow()][21]&nbsp;method of the&nbsp;[Cells][20]&nbsp;class allows inserting a single row at the specified index. The Cells class also provides the&nbsp;[InsertRows()][15]&nbsp;method to insert more than one row at the same time. It takes a row index from where to start inserting rows and the total number of new rows to insert as input parameters.

The&nbsp;[Save()][16]&nbsp;method of the Workbook class saves the workbook at the given file path specified as an input parameter.

## Insert Rows with Formatting in Excel Worksheets using C# {#Insert-Rows-with-Formatting-in-Excel-Worksheets-using-CSharp}

You can insert rows with formatting in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;[Workbook][12]&nbsp;class with the input file path.
  * Create an instance of the&nbsp;[Worksheet][13]&nbsp;class.
  * Access the worksheet from&nbsp;[Worksheets][14]&nbsp;collection by its index.
  * Create an instance of the [InsertOptions][22] class.
  * Set the [CopyFormatType][23] property
  * Call the&nbsp;[InsertRows()][24]&nbsp;method with the row index, total rows to insert and pass the _InsertOptions_.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows&nbsp;**how to insert rows with formatting in an Excel sheet using C#**.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_InsertRowWithFormatting.cs" >}}

The [InsertOptions][22] class of the API represents options while inserting the rows or columns. The [CopyFormatType][23] property of this class represents the type of copying format when inserting rows and supports the following types:

  * SameAsAbove — allows copying formats same as above row.
  * SameAsBelow — allows copying formats same as below row.
  * Clear — allows clearing formatting.

## Delete Rows from Excel Worksheets using C# {#Delete-Rows-from-Excel-Worksheets-using-CSharp}

You can delete rows from Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;[Workbook][12]&nbsp;class with the input file path.
  * Create an instance of the&nbsp;[Worksheet][13]&nbsp;class.
  * Access the worksheet from&nbsp;[Worksheets][14]&nbsp;collection by its index.
  * Delete the rows by calling the&nbsp;[DeleteRows()][25]&nbsp;method and pass the row index and total rows to delete.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows&nbsp;**how to delete rows from an Excel sheet using C#**.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_DeleteRows.cs" >}}

The&nbsp;[DeleteRow()][26]&nbsp;method of the&nbsp;[Cells][20]&nbsp;class allows deleting a single row at the specified index. Similarly, the [DeleteRows()][25] method allows deleting more than one row. It takes a row index from where to start deleting rows and the total number of rows to delete as input parameters.

## Insert Columns in Excel Worksheets using C# {#Insert-Columns-in-Excel-Worksheets-using-CSharp}

You can insert columns in Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;[Workbook][12]&nbsp;class with the input file path.
  * Create an instance of the&nbsp;[Worksheet][13]&nbsp;class.
  * Access the worksheet from&nbsp;[Worksheets][14]&nbsp;collection by its index.
  * Insert a column by calling the&nbsp;[InsertColumn()][27]&nbsp;method and pass the column index where to insert a new column.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows&nbsp;**how to insert a column in an Excel sheet using C#**.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_InsertColumn.cs" >}}

{{< figure align=center src="images/Insert-Column-in-Excel-Worksheets-using-CSharp-1024x332.jpg" alt="Insert a single Column in Excel Worksheets using C#" caption="Insert a single Column in Excel Worksheets using C#.">}}
 

Similarly, you can insert multiple columns in an Excel sheet using the code sample given below:

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_InsertColumns.cs" >}}

{{< figure align=center src="images/Insert-Columns-in-Excel-Worksheets-using-CSharp-1024x430.jpg" alt="Insert Multiple Columns in Excel Worksheets using C#." caption="Insert Multiple Columns in Excel Worksheets using C#.">}}
 

For inserting columns in Excel worksheets, the&nbsp;[Cells][20]&nbsp;class provides the&nbsp;[InsertColumns()][30]&nbsp;method to insert multiple columns in a worksheet. It takes a column index from where to start inserting columns and the total number of new columns to insert as input parameters. The Cells class also provides the&nbsp;[InsertColumn()][27]&nbsp;method to insert a single column at the specified index.

## Delete Columns from Excel Worksheets using C# {#Delete-Columns-from-Excel-Worksheets-using-CSharp}

You can delete columns from Excel sheets programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;[Workbook][12]&nbsp;class with the input file path.
  * Create an instance of the&nbsp;[Worksheet][13]&nbsp;class.
  * Access the worksheet from&nbsp;[Worksheets][14]&nbsp;collection by its index.
  * Delete a column by calling the&nbsp;[DeleteColumn()][31]&nbsp;method and pass the column index to delete.
  * Call the&nbsp;_[Save()][16]_&nbsp;method with the output file path.

The following code sample shows&nbsp;**how to delete a column from an Excel sheet using C#**.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_DeleteAColumn.cs" >}}

Similarly, you can delete multiple columns from an Excel sheet using the following code example.

{{< gist conholdate-gists 1edeb7f514e5f836a74b1c7f17c925b6 "InsertDeleteRowsColumns_CSharp_DeleteColumns.cs" >}}

The [DeleteColumns()][32] method allows deleting multiple columns at once. It takes three parameters, a column index from where to start deleting the columns, the total number of columns to delete as input parameters, and a true or false value to indicate whether to update the references in other worksheets. Similarly, the [DeleteColumn()][31] method of the [Cells][20] class allows deleting a single column at the specified index.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][33].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;insert rows or columns in Excel files**&nbsp;using C#. You have also learned&nbsp;**how to delete rows and columns from Excel files&nbsp;**programmatically. Moreover, you have learned&nbsp;**how to insert multiple rows or columns in an Excel sheet**. Furthermore, you have learned **how to delete multiple rows or columns from Excel files using C#**. You can learn more about Aspose.Cells for .NET API using the&nbsp;[documentation][34]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][35].

## See Also

  * [Hide and Show Rows or Columns in Excel Worksheet using C#][36]
  * [Delete Blank Rows and Columns in Excel using C#][37]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/insert-or-delete-rows-and-columns-in-excel-using-csharp.jpg
 [2]: #CSharp-API-to-Insert-or-Delete-Rows-and-Columns
 [3]: #Insert-Rows-in-Excel-Worksheets-using-CSharp
 [4]: #Insert-Rows-with-Formatting-in-Excel-Worksheets-using-CSharp
 [5]: #Delete-Rows-from-Excel-Worksheets-using-CSharp
 [6]: #Insert-Columns-in-Excel-Worksheets-using-CSharp
 [7]: #Delete-Columns-from-Excel-Worksheets-using-CSharp
 [8]: https://docs.fileformat.com/spreadsheet/xlsx/
 [9]: https://products.aspose.com/cells/net/
 [10]: https://downloads.aspose.com/cells/net
 [11]: https://www.nuget.org/packages/aspose.cells
 [12]: https://apireference.aspose.com/cells/net/aspose.cells/workbook
 [13]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet
 [14]: https://apireference.aspose.com/cells/net/aspose.cells/workbook/properties/worksheets
 [15]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertrows
 [16]: https://apireference.aspose.com/cells/net/aspose.cells.workbook/save/methods/2
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Multiple-Rows-in-Excel-Worksheets-using-CSharp.jpg
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Rows-in-Excel-Worksheets-using-CSharp.jpg
 [19]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet/properties/cells
 [20]: https://apireference.aspose.com/cells/net/aspose.cells/cells
 [21]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertrow
 [22]: https://apireference.aspose.com/cells/net/aspose.cells/insertoptions
 [23]: https://apireference.aspose.com/cells/net/aspose.cells/insertoptions/properties/copyformattype
 [24]: https://apireference.aspose.com/cells/net/aspose.cells.cells/insertrows/methods/1
 [25]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleterows
 [26]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleterow
 [27]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertcolumn
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Column-in-Excel-Worksheets-using-CSharp.jpg
 [29]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Columns-in-Excel-Worksheets-using-CSharp.jpg
 [30]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertcolumns
 [31]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deletecolumn
 [32]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deletecolumns
 [33]: https://purchase.aspose.com/temporary-license
 [34]: https://docs.aspose.com/cells/net/
 [35]: https://forum.aspose.com/c/cells/9
 [36]: https://blog.conholdate.com/2021/09/28/hide-and-show-rows-or-columns-in-excel-using-csharp/
 [37]: https://blog.conholdate.com/2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/




