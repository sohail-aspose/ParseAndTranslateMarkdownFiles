---
title: Delete Blank Rows and Columns in Excel using Java
author: Muzammil Khan
date: 2021-11-23T10:48:02+00:00
summary: 'As a Java developer, you can easily remove blank rows and columns from Excel worksheets. In this article, you will learn <strong>how to delete blank rows and columns in Excel using Java</strong>.'
url: /2021/11/23/delete-blank-rows-and-columns-in-excel-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Delete Blank Columns in Excel using Java
  - Delete Blank Rows and Columns in Java
  - Delete Blank Rows Columns
  - Delete Blank Rows in Excel using Java

---


{{< figure align=center src="images/delete-blank-rows-and-columns-in-excel-using-java.jpg" alt="Delete Blank Rows and Columns in Excel using Java">}}
 

We can easily remove blank rows and columns from Excel worksheets programmatically. In this article, we will learn&nbsp;**how to delete blank rows and columns in Excel using Java**.

The following topics shall be covered in this article:

  * [Java API to Delete Blank Rows and Columns in Excel][2]
  * [Delete Blank Rows in Excel using Java][3]
  * [Delete Blank Columns in Excel using Java][4]
  * [Update References Automatically while Deleting Blank Rows and Columns][5]

## Java API to Delete Blank Rows and Columns in Excel {#Java-API-to-Delete-Blank-Rows-and-Columns-in-Excel}

For removing blank rows and columns from [XLSX][6]&nbsp;files, we will be using&nbsp;[Aspose.Cells for Java][7] API. Please either&nbsp;[download][8]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in a Maven-based Java application.

<pre class="wp-block-code"><code>&lt;repository&gt;
    &lt;id&gt;AsposeJavaAPI&lt;/id&gt;
    &lt;name&gt;Aspose Java API&lt;/name&gt;
    &lt;url&gt;https://repository.aspose.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
    &lt;groupId&gt;com.aspose&lt;/groupId&gt;
    &lt;artifactId&gt;aspose-cells&lt;/artifactId&gt;
    &lt;version&gt;21.11&lt;/version&gt;
&lt;/dependency&gt;</code></pre>

## Delete Blank Rows in Excel using Java {#Delete-Blank-Rows-in-Excel-using-Java}

We can delete blank rows from Excel worksheets programmatically by following the steps given below:

  * Firstly, load an Excel file using the&nbsp;[Workbook][9]&nbsp;class.
  * Next, call the [Workbook.getWorksheets()][10] method and get worksheets in [WorksheetCollection][11] object.
  * Then, access the worksheet that has the blank rows either by its index (zero-based) or by name.
  * After that, call the [Cells.deleteBlankRows()][12] method to delete the blank rows from the accessed worksheet.
  * Finally, call the [save()][13] method with output file path to save the output file.

The following sample code shows **how to remove blank rows from Excel using Java**.

{{< gist conholdate-gists c9b7b07928ec009c33bdd59f3b927668 "DeleteBlankRowsColumnsInExcel_Java_DeleteBlankRows.java" >}}

{{< figure align=center src="images/Delete-Blank-Rows-in-Excel-using-Java-1024x457.jpg" alt="Delete Blank Rows in Excel using Java." caption="Delete Blank Rows in Excel using Java.">}}
 

Similarly, we can delete blank rows from all worksheets in an Excel document. We will simply iterate over WorksheetCollection and call the [deleteBlankRows()][12]&nbsp;method on each worksheet as shown in the following code example:

{{< gist conholdate-gists c9b7b07928ec009c33bdd59f3b927668 "DeleteBlankRowsColumnsInExcel_Java_DeleteBlankRowsFromWorkbook.java" >}}

## Delete Blank Columns in Excel using Java {#Delete-Blank-Columns-in-Excel-using-Java}

We can delete blank columns from Excel worksheets programmatically by following the steps given below:

  * Firstly, load an Excel file using the&nbsp;[Workbook][9]&nbsp;class.
  * Next, call the [Workbook.getWorksheets()][10] method and get worksheets in [WorksheetCollection][11] object.
  * Then, access the worksheet that has the blank columns either by its index (zero-based) or by name.
  * After that, call the [Cells.deleteBlankColumns()][15] method to delete the blank columns from the accessed worksheet.
  * Finally, call the [save()][13] method with output file path to save the output file.

The following sample code shows **how to remove blank columns from Excel using Java**.

{{< gist conholdate-gists c9b7b07928ec009c33bdd59f3b927668 "DeleteBlankRowsColumnsInExcel_Java_DeleteBlankColumns.java" >}}

{{< figure align=center src="images/Delete-Blank-Columns-in-Excel-using-Java-1024x457.jpg" alt="Delete Blank Columns in Excel using Java." caption="Delete Blank Columns in Excel using Java.">}}
 

## Update References Automatically while Deleting Blank Rows and Columns {#Update-References-Automatically-while-Deleting-Blank-Rows-and-Columns}

Deleting blank rows or columns can break references in formulas, charts, and tables. For example, cell A1 in Sheet2 has a formula&nbsp;**=Sheet1!C7**&nbsp;which is referring to cell C7 of the first worksheet as shown in the following figure.

{{< figure align=center src="images/A-cell-A1-in-Sheet2-is-referring-to-a-value-of-cell-C7-in-Sheet1-1024x542.jpg" alt="A cell A1 in Sheet2 is referring to a value of cell C7 in Sheet1." caption="A cell A1 in Sheet2 is referring to a value of cell C7 in Sheet1.">}}
 

If we remove blank rows in Sheet1, the value of **C7 (650000)**&nbsp;will be moved to cell C6. But the formula (=Sheet1!C7) will not update and cell A1 will show the value of C7 which will be **550000** in this case. We can avoid this issue by setting the&nbsp;[DeleteOptions.setUpdateReference][18] to&nbsp;**true**. It will ensure that the references are updated while deleting blank rows.

We can update references automatically while deleting blank rows from Excel worksheets programmatically by following the steps given below:

  * Firstly, load an Excel file using the&nbsp;[Workbook][9]&nbsp;class.
  * Next, call the [Workbook.getWorksheets()][10] method and get worksheets in [WorksheetCollection][11] object.
  * Then, access the worksheet either by index (zero-based) or by name that has the blank rows.
  * Next, create an instance of the [DeleteOptions][19] class
  * Then, call [setUpdateReferences()][18] to true. It will update the references in other sheets while deleting the blank rows.
  * After that, call the [Cells.deleteBlankRows()][12] method with DeleteOptions object as an argument to delete the blank rows from the accessed worksheet.
  * Finally, call the [save()][13] method with output file path to save the output file.

The following sample code shows **how to update references while deleting the blank rows in Excel**.

{{< gist conholdate-gists c9b7b07928ec009c33bdd59f3b927668 "DeleteBlankRowsColumnsInExcel_Java_UpdateReferencesAutomatically.java" >}}

Similarly, we can update references while deleting the blank columns in Excel. However, we just need to call the [deleteBlankColumns()][20] method with the DeleteOptions as an argument.

## Get a Free License

Please try the API without evaluation limitations by requesting&nbsp;[a free temporary license][21].

## Conclusion

In this article, we have learned&nbsp;**how to&nbsp;delete rows and columns in Excel using&nbsp;Java**. We have also seen&nbsp;**how to update references while deleting rows and columns**&nbsp;programmatically. Besides, you can learn more about Aspose.Cells for Java API using the&nbsp;[documentation][22]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][23].

## See Also

  * [Export Data to Excel in Java][24]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/delete-blank-rows-and-columns-in-excel-using-java.jpg
 [2]: #Java-API-to-Delete-Blank-Rows-and-Columns-in-Excel
 [3]: #Delete-Blank-Rows-in-Excel-using-Java
 [4]: #Delete-Blank-Columns-in-Excel-using-Java
 [5]: #Update-References-Automatically-while-Deleting-Blank-Rows-and-Columns
 [6]: https://docs.fileformat.com/spreadsheet/xlsx/
 [7]: https://products.aspose.com/cells/java/
 [8]: https://downloads.aspose.com/cells/java
 [9]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook
 [10]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#Worksheets
 [11]: https://apireference.aspose.com/cells/java/com.aspose.cells/WorksheetCollection
 [12]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#deleteBlankRows()
 [13]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#save(java.lang.String)
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Delete-Blank-Rows-in-Excel-using-Java.jpg
 [15]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#deleteBlankColumns()
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Delete-Blank-Columns-in-Excel-using-Java.jpg
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/A-cell-A1-in-Sheet2-is-referring-to-a-value-of-cell-C7-in-Sheet1.jpg
 [18]: https://apireference.aspose.com/cells/java/com.aspose.cells/deleteoptions#UpdateReference
 [19]: https://apireference.aspose.com/cells/java/com.aspose.cells/DeleteOptions
 [20]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#deleteBlankColumns(com.aspose.cells.DeleteOptions)
 [21]: https://purchase.conholdate.com/temporary-license
 [22]: https://docs.aspose.com/cells/java/
 [23]: https://forum.aspose.com/c/cells/9
 [24]: https://blog.conholdate.com/2021/08/27/export-data-to-excel-in-java/




