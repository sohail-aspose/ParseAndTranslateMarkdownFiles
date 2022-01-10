---
title: Export Data to Excel in Java
author: Muzammil Khan
date: 2021-08-27T03:06:50+00:00
summary: 'As a Java developer, you can easily export data from Arrays, Collection of Objects, JSON, or CSV to Excel programmatically. In this article, you will learn<strong> how to export data to Excel using Java</strong>.'
url: /2021/08/27/export-data-to-excel-in-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Export Array to Excel in Java
  - Export CSV Data to Excel in Java
  - Export JSON Data to Excel in Java
  - Export rows and columns data to Excel

---


{{< figure align=center src="images/export-data-to-excel-in-java.jpg" alt="Export Data to Excel in Java">}}
 

You can easily export data to Microsoft Excel from various available sources such as JSON, and CSV. As a Java developer, you can export data from Arrays, List of objects, JSON, and CSV to Excel documents programmatically. In this article, you will learn&nbsp;**how to export data to Excel using Java**.

The following topics are discussed/covered in this article:

  * [Java API to Export Data][2]
  * [Export Array to Excel in Java][3]
  * [Export Two Dimensional Array to Excel][4]
  * [ArrayList to Excel in Java][5]
  * [Export Collection of Custom Objects to Excel in Java][6]
  * [Export Data to Excel with Merged Cells in Java][7]
  * [Copy Rows and Columns from one Excel file to Another in Java][8]
  * [Export JSON Data to Excel in Java][9]
  * [Get CSV Data in Excel using Java][10]

## Java API to Export Data {#Java-API-for-Exporting-Data}

For exporting data to Excel, I will be using&nbsp;[Aspose.Cells for Java API][11]. It&nbsp;is a powerful spreadsheet manipulation API that lets you create, edit, or convert Excel files within Java applications. The API enables you to perform Excel automation features programmatically without needing a Microsoft Excel application.

You can&nbsp;[download][12]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in your Maven-based Java application to try the below-mentioned code examples.

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

## Export Array to Excel in Java {#Export-Array-to-Excel-in-Java}

You can easily export data from a one-dimensional array or a two-dimensional array to an Excel document. The array can be of a reference type or a value type. You can export data from an array to Excel by following the simple steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class
  * Get worksheet in an instance of the [_Worksheet_][14] class
  * Create an array containing string values
  * Call the&nbsp;[_importArray()_][15]&nbsp;method with the&nbsp;array
  * Save the output file by calling the _[save()][16]_ method of the _Workbook_ class

The following code sample shows&nbsp;**how to export an array of strings to Excel using Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_ExportArrayToExcel.java" >}}

{{< figure align=center src="images/Export-Array-to-Excel-in-Java.jpg" alt="Export Array to Excel in Java" caption="Export Array to Excel in Java">}}
 

The **[Workbook][13]** class of the API is the main class to create an Excel spreadsheet. It provides functionality to open and save native excel files. The **[_save()_][16]** method of this class is used to save the output file at the specified file path.

The **[Worksheet][14]** class represents a single worksheet and provides functionality to work with cells and rows.

The [_importArray()_][15] method of the Cells class exports an array of strings to a worksheet. It takes the following input parameters:

  * _**stringArray**_: The array of String values
  * _**firstRow**_: The row number of the first cell to export to
  * _**firstColumn**_: The column number of the first cell to export to
  * _**isVertical**_: It specifies whether to export data vertically or horizontally

The API also provides the overloaded versions of the _**importArray()**_&nbsp;method to export an array of integer or double to a worksheet.

## Export Two Dimensional Array to Excel {#Export-Two-Dimensional-Array-to-Excel}

Similarly, you can export a&nbsp;**two-dimensional array to an Excel file**. The following code sample shows **how to export a two-dimensional array to an Excel file in Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_Export2DArrayToExcel.java" >}}

{{< figure align=center src="images/Export-Two-Dimensional-Array-to-Excel.jpg" alt="Export Two Dimensional Array to Excel" caption="Export Two Dimensional Array to Excel">}}
 

The Cells class provides **[importArray()][19]** method to export a two-dimension array of integers to a worksheet. The API also provides the overloaded versions of this&nbsp;method to export a two-dimensional array of strings or double into a worksheet.

## Export ArrayList to Excel in Java {#Export-ArrayList-to-Excel-in-Java}

You can export data from an ArrayList to Excel by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class
  * Get worksheet in an instance of the [_Worksheet_][14] class
  * Create an array list containing string values
  * Call the&nbsp;[_importArrayList()_][20]&nbsp;method with the&nbsp;array list
  * Save the output file by calling the _[save()][16]_ method of the _Workbook_ class

The following code sample shows&nbsp;**how to export an ArrayList to Excel in** **Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_ExportArrayListToExcel.java" >}}

{{< figure align=center src="images/Export-ArrayList-to-Excel-in-Java.jpg" alt="Export Array List to Excel in Java" caption="Export ArrayList to Excel in Java">}}
 

The [**_importArrayList()_**][20] method of the Cells class exports an ArrayList of data to a worksheet. It takes four parameters including the ArrayList of data. The other parameters are the _firstRow_, _firstColumn_, and _isVertical_.

## Export Collection of Custom Objects to Excel in Java {#Export-Collection-of-Custom-Objects-to-Excel-in-Java}

You can export data from a collection of custom objects to Excel by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class
  * Get worksheet in an instance of the [_Worksheet_][14] class
  * Create an array list of custom objects
  * Call the&nbsp;[_importCustomObjects()_][22]&nbsp;method with the&nbsp;array list
  * Save the output file by calling the _[save()][16]_ method of the _Workbook_ class

The following code sample shows&nbsp;**how to export a collection of custom objects to Excel in Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_ExportCollectionOfObjectsToExcel.java" >}}

{{< figure align=center src="images/Export-Collection-of-Custom-Objects-to-Excel-in-Java.jpg" alt="Collection of Custom Objects to Excel in Java" caption="Collection of Custom Objects to Excel in Java">}}
 

The [][22]**[_importCustomObjects_][22]()** method of the Cells class exports a list of custom objects and takes the following parameters. The API also provides the overloaded version of this&nbsp;method that takes fewer parameters.

  * _**list**_: The collection of custom objects
  * **_propertName_**: Specify name for a specific property to export. If it is null, it will export all properties of the object
  * **_isPropertyNameShown_**: Indicates whether the property name will be exported to the first row
  * **_firstRow_**: The row number of the first cell to export
  * **_firstColumn_**: The column number of the first cell to export
  * **_rowNumber_**: Number of rows to be exported
  * **_insertRows_**: Indicates whether extra rows are added to fit data
  * **_dataFormatString_**: Date format string for cells
  * **_convertStringToNumber_**: Indicates if this method will try to convert string to number.

## Export Data to Excel with Merged Cells in Java {#Export-Data-to-Excel-with-Merged-Cells-in-Java}

You can export data from a collection of objects to a worksheet containing merged cells by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class with template file path
  * Get worksheet in an instance of the [_Worksheet_][14] class
  * Create an array list of objects
  * Create an instance of the _[ImportTableOptions][24]_ class
  * Call the&nbsp;[_importCustomObjects()_][22]&nbsp;method with the&nbsp;array list
  * Save the output file by calling the _[save()][16]_ method of the _Workbook_ class

The following code sample shows&nbsp;how to export a collection of custom objects to an **Excel worksheet with merged cells in Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_ExportDataWithMergedCells.java" >}}

{{< figure align=center src="images/Export-Data-to-Excel-with-Merged-Cells-in-Java-1024x434.jpg" alt="Export Data to Excel with Merged Cells in Java" caption="Export Data to Excel with Merged Cells in Java">}}
 

The **[ImportTableOptions][24]** class provides several options for exporting data into cells. The **_setCheckMergedCells_** indicates whether checking merged cells. The **_setFieldNameShown_** property indicates whether the field name should be exported or not.

## Copy Rows and Columns from one Excel file to Another in Java {#Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java}

You can easily copy rows and columns from one Excel file to another file programmatically by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class with source workbook input file
  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class for destination workbook
  * Get source and destination worksheets in seperate instances of the [_Worksheet_][14] class
  * Call the&nbsp;_[copyRows()][26]_&nbsp;method of the destination worksheet with the source worksheet cells
  * Save the destination workbook output file by calling the _[save()][16]_ method of the _Workbook_ class

The following code sample shows&nbsp;**how to copy rows and columns from one Excel file to another using Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_CopyRowsAndColumns.java" >}}

{{< figure align=center src="images/Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java-1024x430.jpg" alt="Copy Rows and Columns from one Excel file to Another in Java" caption="Copy Rows and Columns from one Excel file to Another in Java">}}
 

You can copy specific rows from one Excel file to another. The following code sample shows&nbsp;**how to copy specific rows from one Excel file to another using Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_CopySpecificRows.java" >}}

{{< figure align=center src="images/Copy-Specific-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java-1024x432.jpg" alt="Copy Specific Rows and Columns from one Excel file to Another in Java" caption="Copy Specific Rows and Columns from one Excel file to Another in Java">}}
 

The **_[copyRows()][26]_** method copies data and formats of whole rows. It takes the source worksheet cells to copy as input parameters along with the source row index, destination row index, and the copied row number. The API also provides the overloaded versions of this&nbsp;method to copy rows with [CopyOptions][29] and [PasteOptions][30].

Similarly, You can copy columns data from one Microsoft Excel document to another using the [copyColumn()][31] or [copyColumns()][32] methods.

## Export JSON Data to Excel in Java {#Export-JSON-Data-to-Excel-in-Java}

You can easily export data from a JSON file to Excel by following the steps mentioned below:

  * Create an instance of the&nbsp;_[Workbook][13]&nbsp;_class
  * Get worksheet in an instance of the [_Worksheet_][14] class
  * Read the JSON file
  * Create an instance of the _[CellsFactory][33]_ class
  * Initiate style by calling the _[createStyle()][34]_ method
  * Set various style properties such as Horizontal Alignment, Font color, etc.
  * Create an instance of the [JsonLayoutOptions][35] class
  * Set title style with the style object
  * Set array as table property to true
  * Call the&nbsp;[_JsonUtility.importData()_][36]&nbsp;method with the&nbsp;JSON input and _JsonLayoutOptions_
  * Save the output file by calling the _[save()][16]_ method of the _Workbook_ class

The following code sample shows&nbsp;**how to export data from a JSON file to Excel using Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_ExportJsonDataToExcel.java" >}}

<pre class="wp-block-code"><code>{
  "quiz": {
    "sport": {
      "q1": {
        "question": "Which one is correct team name in NBA?",
        "answer": "Huston Rocket"
      }
    },
    "maths": {
      "q1": {
        "question": "5 + 7 = ?",
        "answer": "12"
      },
      "q2": {
        "question": "12 - 8 = ?",
        "answer": "4"
      }
    }
  }
}</code></pre>

{{< figure align=center src="images/Export-JSON-Data-to-Excel-in-Java.jpg" alt="Export JSON Data to Excel in Java" caption="Export JSON Data to Excel in Java">}}
 

The **[CellsFactory][33]** class&nbsp;instantiates classes of Cells model. The _[**createStyle()**][34]_ method of this class creates a new style object of the **[Style][38]** class. The **Style** class allows setting display style of Excel document, such as font, color, alignment, border, etc.

The **[JsonLayoutOptions][35]** class provides the options of JSON layout type. The **_setTitleStyle_** method of this class is used to set the defined style of the title. The **_setArrayAsTable_** method allows processing Array as a table.

The API provides **[JsonUtility][39]** class to process the JSON. The [_**importData()**_][36]&nbsp;method of this class exports the JSON string and takes the following parameters:

  * **_json_**: The JSON string
  * **_cells_**: The Cells
  * **_row_**: The row index
  * **_column_**: The column index
  * **_option_**: The options to export JSON string

## Get CSV Data in Excel using Java {#Export-CSV-Data-to-Excel-in-Java}

You can export data from a CSV file to Excel by following the simple steps mentioned below:

  * Create an instance of the _[LoadOptions][40]_ class wih _[LoadFormat][41]_
  * Create an instance of the _[Workbook][13]_ class with CSV file path and _LoadOptions_ object
  * Call the _[save()][16]_ method of the _Workbook_ class and save the output file

The following code sample shows&nbsp;**how to export data from a CSV file to Excel using Java**.

{{< gist conholdate-gists 335b0ec29e791a6df12fbe54ce4c93ff "ExportDataToExcel_Java_ExportCSVDataToExcel.java" >}}

<pre class="wp-block-code"><code>id,language,edition,author,streetAddress,city,state,postalCode
01,Java,third,Herbert Schildt,126,San Jone,CA,394221
02,C++,second,EAAAA,126,San Jone,CA,394221
03,.Net,second,E.Balagurusamy,126,San Jone,CA,394221</code></pre>

{{< figure align=center src="images/Export-CSV-Data-to-Excel-in-Java-1024x662.jpg" alt="Export CSV Data to Excel in Java" caption="Export CSV Data to Excel in Java">}}
 

The **[LoadOptions][40]** class of the API provides options for loading the file. The **[LoadFormat][41]** class contains constants representing the load file formats.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][43].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;export data to Excel in Java**. You have also learned&nbsp;**how to export data from Arrays, JSON, or CSV files to Excel** programmatically. Moreover, you have learned **how to copy rows and columns from one Excel file to another file using Java**. You can learn more about Aspose.Cells for Java API using the [documentation][44]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][45].

## See Also

  * [Copy Rows and Columns in Excel using Java][46]

## Frequently Asked Questions

<div class="schema-faq wp-block-yoast-faq-block">
  <div class="schema-faq-section" id="faq-question-1629907907589">
    <strong class="schema-faq-question">How to export data to an XLSX file in Java?</strong> 
    
    <p class="schema-faq-answer">
      You can easily export data from Arrays, Collection of Objects, JSON, and CSV to an XLSX file using easy-to-integrate Aspose.Cells for Java API in your Java application.
    
  </div>
  
  <div class="schema-faq-section" id="faq-question-1629908207011">
    <strong class="schema-faq-question">How do I export data from JSON to Excel?</strong> 
    
    <p class="schema-faq-answer">
      Aspose.Cells API provides JsonUtility to export data from a JSON file to Excel in Java. You can find simple steps under the <a href="#Export-JSON-Data-to-Excel-in-Java">&#8220;Export JSON Data to Excel in Java&#8221;</a> section.
    
  </div>
  
  <div class="schema-faq-section" id="faq-question-1629908207011">
    <strong class="schema-faq-question">How do I export data from CSV to Excel in Java?</strong> 
    
    <p class="schema-faq-answer">
      You can simply load a CSV file and save it as XLSX using Aspose.Cells API. You can find simple steps under the <a href="#Export-CSV-Data-to-Excel-in-Java">&#8220;Get CSV Data in Excel using Java&#8221;</a> section.
    
  </div>
</div>

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/export-data-to-excel-in-java.jpg
 [2]: #Java-API-for-Exporting-Data
 [3]: #Export-Array-to-Excel-in-Java
 [4]: #Export-Two-Dimensional-Array-to-Excel
 [5]: #Export-ArrayList-to-Excel-in-Java
 [6]: #Export-Collection-of-Custom-Objects-to-Excel-in-Java
 [7]: #Export-Data-to-Excel-with-Merged-Cells-in-Java
 [8]: #Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java
 [9]: #Export-JSON-Data-to-Excel-in-Java
 [10]: #Export-CSV-Data-to-Excel-in-Java
 [11]: https://products.aspose.com/cells/java/
 [12]: https://downloads.aspose.com/cells/java
 [13]: https://apireference.aspose.com/cells/java/com.aspose.cells/Workbook
 [14]: https://apireference.aspose.com/cells/java/com.aspose.cells/Worksheet
 [15]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importArray(java.lang.String[],%20int,%20int,%20boolean)
 [16]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#save(java.lang.String)
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Array-to-Excel-in-Java.jpg
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Two-Dimensional-Array-to-Excel.jpg
 [19]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importArray(int[][],%20int,%20int)
 [20]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importArrayList(java.util.ArrayList,%20int,%20int,%20boolean)
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-ArrayList-to-Excel-in-Java.jpg
 [22]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importCustomObjects(java.util.Collection,%20java.lang.String[],%20boolean,%20int,%20int,%20int,%20boolean,%20java.lang.String,%20boolean)
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Collection-of-Custom-Objects-to-Excel-in-Java.jpg
 [24]: https://apireference.aspose.com/cells/java/com.aspose.cells/ImportTableOptions
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Data-to-Excel-with-Merged-Cells-in-Java.jpg
 [26]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#copyRows(com.aspose.cells.Cells,%20int,%20int,%20int)
 [27]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java.jpg
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Copy-Specific-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java.jpg
 [29]: https://apireference.aspose.com/cells/java/com.aspose.cells/CopyOptions
 [30]: https://apireference.aspose.com/cells/java/com.aspose.cells/PasteOptions
 [31]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#copyColumn(com.aspose.cells.Cells,%20int,%20int)
 [32]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/copycolumns
 [33]: https://apireference.aspose.com/cells/java/com.aspose.cells/CellsFactory
 [34]: https://apireference.aspose.com/cells/java/com.aspose.cells/cellsfactory#createStyle()
 [35]: https://apireference.aspose.com/cells/java/com.aspose.cells/JsonLayoutOptions
 [36]: https://apireference.aspose.com/cells/java/com.aspose.cells/jsonutility#importData(java.lang.String,%20com.aspose.cells.Cells,%20int,%20int,%20com.aspose.cells.JsonLayoutOptions)
 [37]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-JSON-Data-to-Excel-in-Java.jpg
 [38]: https://apireference.aspose.com/cells/java/com.aspose.cells/Style
 [39]: https://apireference.aspose.com/cells/java/com.aspose.cells/jsonutility
 [40]: https://apireference.aspose.com/cells/java/com.aspose.cells/LoadOptions
 [41]: https://apireference.aspose.com/cells/java/com.aspose.cells/LoadFormat
 [42]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-CSV-Data-to-Excel-in-Java.jpg
 [43]: https://purchase.aspose.com/temporary-license
 [44]: https://docs.aspose.com/cells/java/
 [45]: https://forum.aspose.com/c/cells/9
 [46]: https://blog.aspose.com/2021/06/15/copy-rows-and-columns-in-excel-using-java/




