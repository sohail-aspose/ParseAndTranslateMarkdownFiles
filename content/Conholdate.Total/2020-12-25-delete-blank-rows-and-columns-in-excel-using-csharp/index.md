---
title: 'Delete Blank Rows and Columns in Excel using C#'
author: Muhammad Sohail
date: 2020-12-25T13:06:24+00:00
summary: 'In this article, I will explain how to delete blank rows and columns in an excel file using C#. I will also explain why references (used in formulas, charts and tables) should be updated automatically while deleting blank rows and columns.'
url: /2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/
categories:
  - Conholdate.Total Product Family

---
In this article, I will explain how to delete blank rows and columns in an excel file using C#. I will also explain how to update references automatically (used in formulas, charts and tables) while deleting blank rows and columns.

  * [Delete Blank Rows in Excel using C#][1]
  * [Update References Automatically while Deleting Blank Rows][2]{.broken_link}
  * [Delete Blank Columns in Excel using C#][3]{.broken_link}

## C# API to Remove Blank Rows and Columns

[Aspose.Cells for .NET][4] is a well-known spreadsheet manipulation API that lets you create and process Excel files from within your .NET applications. The API allows you to remove blank rows and columns in the Excel files in a few lines of code. You can either [download][5] the binaries of the API or get it installed using [NuGet][6].

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">PM&gt; Install-Package Aspose.Cells</pre>

## Delete Blank Rows in Excel using C# {#Delete-Blank-Rows-in-Excel}

The following are the steps to delete all blank rows in Excel using C#.

  * Open an Excel file using the [Workbook][7] object.
  * Access the worksheet that has the blank rows. The worksheet can be accessed either by index (zero-based) or by name.
  * Call [Cells.DeleteBlankRows()][8] method to delete all blank rows that do not contain any data.

The following sample code shows how to remove blanks rows in Excel using C#.

{{< gist sohail-aspose 87c28286360b9f0b2948524ddb6d82e7 "DeleteBlankRows.cs" >}}

{{< figure align=center src="images/Remove-Blank-Rows.jpg" alt="Delete Blank Rows" caption="Fig 1: Delete Blank Rows">}}
 

Please note that [Cells.DeleteBlankRows][8] method removes the blank rows even if some sort of formatting is applied to them. It also removes the formatted blank rows below your data.

{{< figure align=center src="images/Formatted-Blank-Rows.jpg" alt="Delete Formatted Blank Rows" caption="Fig 2: Delete Formatted Blank Rows">}}
 

If you want to delete blank rows from all worksheets in an Excel document, simply iterate over [WorksheetCollection][11] and call [DeleteBlankRows][8] method on each worksheet as shown in the following code:

{{< gist sohail-aspose e0b5fa34b542212ea63edcd83630464b "DeleteBlankRowsFromAllWorksheets.cs" >}}

## Update References Automatically while Deleting Blank Rows {#Update-References-Automatically}

Deleting blank rows can break references in formulas, charts and tables. For example, the cell B2 in the second worksheet has a formula **=Sheet1!C3** which is referring to cell C3 in the first worksheet as shown in the following figure.

{{< figure align=center src="images/Worksheet-With-Formula-1024x640.jpg" alt="A cell in Sheet2 is referring to a value in Sheet1." caption="Fig 3: A cell in Sheet2 is referring to a value in Sheet1.">}}
 

If we remove blank rows in Sheet1, the value **lima@gmail.com** will move to cell C1. But the formula (=Sheet1!C3) will not update and the cell B2 will contain an invalid value as shown below. 

{{< figure align=center src="images/Cell-with-Invalid-Value-1024x640.jpg" alt="After removing blank rows, formula in Cell B2 has not updated." caption="Fig 4: After removing blank rows, formula in Cell B2 has not updated.">}}
 

We can avoid this issue by using [DeleteOptions.UpdateReference][14] property and set it to **true**. It will ensure that the references are updated while deleting blank rows. The following sample code shows how to use **DeleteOptions.UpdateReference** property.

{{< gist sohail-aspose ddb6500c965458e0d8e782163151427a "UpdateReferencesWhileDeletingBlankRows.cs" >}}

As shown in the following image, the formula has been updated and the cell B2 contains a valid value.

{{< figure align=center src="images/Cell-with-Valid-value-1024x640.jpg" alt="Formula has been updated and the cell contains a valid value." caption="Fig 5: Formula has been updated and the cell contains a valid value.">}}
 

## Delete Blank Columns in Excel using C# {#Delete-Blank-Columns-in-Excel}

The steps to delete blank columns are same as for deleting blank rows. We use [Cells.DeleteBlankColumns][16] method to delete all blank columns that do not contain any data. The following sample code shows how to delete blank rows and columns in C#.

{{< gist sohail-aspose c87d1de331de3b6aa01eb0705aa81c96 "DeleteBlankRowsAndColumns.cs" >}}

{{< figure align=center src="images/Delete-Blank-Rows-and-Columns-1024x640.jpg" alt="Delete Blank Rows and Columns" caption="Fig 6: Delete Blank Rows and Columns">}}
 

## Conclusion

In this article, you have learnt how to delete blank rows and columns in Excel file using C#. Moreover, you have learnt how to update references (used in formulas, charts and tables) automatically while deleting blank rows and columns. Please check the [documentation][18] of Aspose.Cells for .NET for more information. If you have any questions, please feel free to post them at our [Support Forum][19]. We will answer them in a few hours.

## See Also

  * [Create MS Excel Files Programmatically in C# without MS Office][20]
  * [Convert MS Excel XLSX Files to DOCX using C#][21]

 [1]: #Delete-Blank-Rows-in-Excel
 [2]: http://Update-References-Automatically
 [3]: http://Delete-Blank-Columns-in-Excel
 [4]: https://products.aspose.com/cells/net
 [5]: https://downloads.aspose.com/cells/net
 [6]: http://nuget.org/packages/Aspose.Cells
 [7]: https://apireference.aspose.com/cells/net/aspose.cells/workbook
 [8]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleteblankrows
 [9]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Remove-Blank-Rows.jpg
 [10]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Formatted-Blank-Rows.jpg
 [11]: https://apireference.aspose.com/cells/net/aspose.cells/worksheetcollection
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Worksheet-With-Formula.jpg
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Cell-with-Invalid-Value.jpg
 [14]: https://apireference.aspose.com/cells/net/aspose.cells/deleteoptions/properties/updatereference
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Cell-with-Valid-value.jpg
 [16]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleteblankcolumns
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Delete-Blank-Rows-and-Columns.jpg
 [18]: https://docs.aspose.com/cells/net/
 [19]: https://forum.aspose.com/
 [20]: https://blog.aspose.com/2020/01/21/create-excel-xls-xlsx-programmatically-in-csharp-net/
 [21]: https://blog.aspose.com/2020/10/15/convert-excel-xlsx-to-docx-using-csharp/




