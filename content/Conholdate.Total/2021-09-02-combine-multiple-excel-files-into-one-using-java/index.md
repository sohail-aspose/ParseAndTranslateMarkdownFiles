---
title: Combine Multiple Excel Files into One using Java
author: Muzammil Khan
date: 2021-09-02T05:12:15+00:00
summary: ' As a Java developer, you can easily merge multiple Excel files into one file programmatically. In this article, you will learn <strong>how to combine multiple Excel files into one using Java.</strong>'
url: /2021/09/02/combine-multiple-excel-files-into-one-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Combine Excel Files using Java
  - Combine Multiple Workbooks into One
  - Combine Multiple Worksheets into One
  - Merge Columns into Single Worksheet
  - Merge Specific Worksheets into One

---


{{< figure align=center src="images/combine-multiple-excel-files-into-one-using-java.jpg" alt="ombine Multiple Excel Files into One using Java">}}
 

You have several Excel workbooks, and you want to combine them together into one file for reporting or to keep data in one place. As a Java developer, you can easily merge multiple Excel files into one file programmatically. In this article, you will learn&nbsp;**how to combine multiple Excel files into one using Java**.

The following topics are discussed/covered in this article:

  * [Java API to Merge Excel Files][2]
  * [Combine Multiple Excel Files into One using Java][3]
  * [Combine Specific Worksheets of Multiple Excel Files into One using Java][4]
  * [Merge Multiple Worksheets into One Worksheet using Java][5]
  * [Consolidate Columns of Multiple Worksheets into One using Java][6]

## Java API to Merge Excel Files {#Java-API-to-Merge-Excel-Files}

For merging multiple [Excel][7] files, I will be using&nbsp;[Aspose.Cells for Java API][8]. This API enables you to create, manipulate, convert, protect or print spreadsheets without relying on Microsoft Excel. It allows you to perform Excel automation features programmatically in your Java applications.

You can&nbsp;[download][9]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in your Maven-based Java application to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
    &lt;id&gt;AsposeJavaAPI&lt;/id&gt;
    &lt;name&gt;Aspose Java API&lt;/name&gt;
    &lt;url&gt;https://repository.aspose.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
    &lt;groupId&gt;com.aspose&lt;/groupId&gt;
    &lt;artifactId&gt;aspose-cells&lt;/artifactId&gt;
    &lt;version&gt;21.8&lt;/version&gt;
&lt;/dependency&gt;</code></pre>

## Combine Multiple Excel Files into One using Java {#Combine-Multiple-Excel-Files-using-Java}

You can easily combine multiple Excel files into a single file programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class with first source file
  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class with second source file
  * Repeat above step for combining more than two files
  * Call the&nbsp;[_combine()_][11]&nbsp;method with second source file instance
  * Repeat above step for all source files one by one
  * Save the output file by calling the&nbsp;_[save()][12]_&nbsp;method of the&nbsp;_Workbook_&nbsp;class

The following code sample shows&nbsp;**how to combine multiple Excel files into one file using Java**.

{{< gist conholdate-gists 413f3fdf681361ad1a625a876955689a "CombineMultipleExcelFiles_Java_CombineWorkbooks.java" >}}

{{< figure align=center src="images/Combine-Multiple-Excel-Files-using-Java-1024x727.jpg" alt="Combine Multiple Excel Files into One using Java" caption="Combine Multiple Excel Files into One using Java">}}
 

The&nbsp;**[Workbook][10]**&nbsp;class of the API is the main class used to create an Excel Spreadsheet. It enables you to open and save the native Excel files. It also provides several properties and methods to work with Excel Spreadsheet. The **_[combine()][11]_** method of this class combines the current workbook with another Workbook object. The&nbsp;**[_save()_][12]**&nbsp;method of the _Workbook_ class saves the output file at the specified file path.

## Combine Specific Worksheets of Multiple Excel Files into One using Java {#Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java}

You can easily combine specific worksheets from multiple Excel files into a single file programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class for source file 1
  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class for source file 2
  * Repeat above step for combining worksheets from more than two files
  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class for destination file
  * Add worksheet(s) using _[add()][14]_ method of the _WorksheetCollection_ class
  * Call the _[copy()][15]_ method to copy specified worksheet from source file 1 to destination file
  * Call the _copy()_ method to copy specified worksheet from source file 2 to destination file
  * Rename worksheets in destination file by using the _[setName()][16]_ method
  * Save the destination file by calling the&nbsp;_[save()][12]_&nbsp;method of the&nbsp;_Workbook_&nbsp;class

The following code sample shows&nbsp;**how to combine specific worksheets from multiple Excel files into one file using Java**.

{{< gist conholdate-gists 413f3fdf681361ad1a625a876955689a "CombineMultipleExcelFiles_Java_CombineSpecificWorksheets.java" >}}

{{< figure align=center src="images/Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java-1024x561.jpg" alt="Combine Specific Worksheets of Multiple Excel Files into One using Java" caption="Combine Specific Worksheets of Multiple Excel Files into One using Java">}}
 

The **[getWorksheets()][18]** property method of the Workbook class returns a collection of all the worksheets in a Workbook. You can add a worksheet to the collection of worksheets using the **[add()][14]** method. 

The [**Worksheet**][19] class of this API represents a single worksheet. It provides several properties and methods to work with a worksheet. The **[copy()][20]** method of this class copies content and formats from another worksheet. The Worksheet class also provides **get()** methods to get a specific worksheet by its index or by its name. The **[setName()][16]** property method sets the name of the worksheet.

## Merge Multiple Worksheets into One Worksheet using Java {#Merge-Multiple-Worksheets-into-One-Worksheet-using-Java}

You can easily merge multiple worksheets of an Excel file into a single worksheet programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class for source file
  * Add a new worksheet using the _add()_ method
  * Iterate over source worksheets and do the following: 
      * create a range of cells and columns for one worksheet using the _[createRange()][21]_ method
      * Copy data from a source range to the destination range using the _[copy()][22]_ method
  * Save the output file by calling the&nbsp;_[save()][12]_&nbsp;method of the&nbsp;_Workbook_&nbsp;class

The following code sample shows&nbsp;**how to merge multiple worksheets into one worksheet using Java**.

{{< gist conholdate-gists 413f3fdf681361ad1a625a876955689a "CombineMultipleExcelFiles_Java_MergeMultipleWorksheets.java" >}}

{{< figure align=center src="images/Merge-Multiple-Worksheets-into-One-Worksheet-using-Java-1024x623.jpg" alt="Merge Multiple Worksheets into One Worksheet using Java" caption="Merge Multiple Worksheets into One Worksheet using Java">}}
 

The **[getCells()][24]** property method of the Worksheet class provides the collection of the Cells available in the worksheet. The **[Cells][25]** class of the API represents a collection of objects relevant to a cell, such as&nbsp;a [Cell][26],&nbsp;[Row][27], etc. The **[getMaxDisplayRange()][28]** property method of the Cells class provides the max range which includes data, merged cells, and shapes. The **[Range][29]** class represents a range of cells within a spreadsheet.

The Cells class provides the following methods to create a range of cells:

  * **[createRange][21]**(int firstIndex, int number, boolean isVertical) method to create a Range object from rows of cells or columns of cells.
  * **[createRange][30]**(int firstRow, int firstColumn, int totalRows, int totalColumns) method to create a Range object from a range of cells.
  * The **[createRange][31]**(java.lang.String address) method creates a Range object from an address of the range.
  * The **[createRange][32]**(java.lang.String upperLeftCell, java.lang.String lowerRightCell) method creates a Range object from a range of cells.

The **[copy()][22]** method of the Range class copies all kinds of data (including formulas), formatting, drawing objects, etc. from a source range to the destination range.

## Consolidate Columns of Multiple Worksheets into One using Java {#Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java}

You can easily merge columns of multiple worksheets into a single worksheet programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][10]&nbsp;_class for source file
  * Add a new worksheet using the _add()_ method
  * Iterate over source worksheets and do the following: 
      * Copy all columns one by one using the _[copyColumn()][33]_ method with source worksheets cells and column index
  * Save the output file by calling the&nbsp;_[save()][12]_&nbsp;method of the&nbsp;_Workbook_&nbsp;class

The following code sample shows&nbsp;**how to consolidate columns of multiple worksheets into one worksheet using Java**.

{{< gist conholdate-gists 413f3fdf681361ad1a625a876955689a "CombineMultipleExcelFiles_Java_MergeColumnsOfMultipleWorksheets.java" >}}

{{< figure align=center src="images/Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java-1024x527.jpg" alt="Consolidate Columns of Multiple Worksheets into One using Java" caption="Consolidate Columns of Multiple Worksheets into One using Java">}}
 

The **[getColumns()][35]** property method of the Cells class provides the collection of the columns available in the worksheet. The **[ColumnCollection][36]** class represents the collection of the individual columns in a worksheet, whereas the **[Column][37]** class represents a single column in a worksheet. 

The **[copyColumn()][33]** method of the Cells class copies the data and formats of a whole column. The Cells class also provides overloaded copyColumn() methods to copy data with the PasteOptions, column number, source, and destination total columns, etc.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][38].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;combine multiple Excel files into one file**. You have also learned&nbsp;**how to combine specific worksheets of multiple Excel files using Java**. Moreover, you have learned&nbsp;**how to merge multiple worksheets into a single worksheet** programmatically. This article also explained **how to consolidate columns of multiple worksheets into one using Java**. You can learn more about Aspose.Cells for Java API using the [documentation][39]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][40].

## See Also

  * [Export Data to Excel in Java][41]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/combine-multiple-excel-files-into-one-using-java.jpg
 [2]: #Java-API-to-Merge-Excel-Files
 [3]: #Combine-Multiple-Excel-Files-using-Java
 [4]: #Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java
 [5]: #Merge-Multiple-Worksheets-into-One-Worksheet-using-Java
 [6]: #Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java
 [7]: https://docs.fileformat.com/spreadsheet/xlsx/
 [8]: https://products.aspose.com/cells/java/
 [9]: https://downloads.aspose.com/cells/java
 [10]: https://apireference.aspose.com/cells/java/com.aspose.cells/Workbook
 [11]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#combine(com.aspose.cells.Workbook)
 [12]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#save(java.lang.String)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Combine-Multiple-Excel-Files-using-Java.jpg
 [14]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheetcollection#add()
 [15]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#copy(com.aspose.cells.Workbook)
 [16]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheet#Name
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java.jpg
 [18]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#Worksheets
 [19]: https://apireference.aspose.com/cells/java/com.aspose.cells/Worksheet
 [20]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheet#copy(com.aspose.cells.Worksheet)
 [21]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(int,%20int,%20boolean)
 [22]: https://apireference.aspose.com/cells/java/com.aspose.cells/range#copy(com.aspose.cells.Range)
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Merge-Multiple-Worksheets-into-One-Worksheet-using-Java.jpg
 [24]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheet#Cells
 [25]: https://apireference.aspose.com/cells/java/com.aspose.cells/Cells
 [26]: https://apireference.aspose.com/cells/java/com.aspose.cells/Cell
 [27]: https://apireference.aspose.com/cells/java/com.aspose.cells/Row
 [28]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#MaxDisplayRange
 [29]: https://apireference.aspose.com/cells/java/com.aspose.cells/Range
 [30]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(int,%20int,%20int,%20int)
 [31]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(java.lang.String)
 [32]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(java.lang.String,%20java.lang.String)
 [33]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#copyColumn(com.aspose.cells.Cells,%20int,%20int)
 [34]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java.jpg
 [35]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#Columns
 [36]: https://apireference.aspose.com/cells/java/com.aspose.cells/ColumnCollection
 [37]: https://apireference.aspose.com/cells/java/com.aspose.cells/Column
 [38]: https://purchase.aspose.com/temporary-license
 [39]: https://docs.aspose.com/cells/java/
 [40]: https://forum.aspose.com/c/cells/9
 [41]: https://blog.conholdate.com/2021/08/27/export-data-to-excel-in-java/




