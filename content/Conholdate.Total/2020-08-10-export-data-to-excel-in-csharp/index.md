---
title: 'Export Data to Excel in C#'
author: Muhammad Sohail
date: 2020-08-10T08:43:31+00:00
url: /2020/08/10/export-data-to-excel-in-csharp/
featured_image: /wp-content/uploads/sites/27/2020/08/ExportDataToAnExcelDocument-350x198.png
categories:
  - Conholdate.Total Product Family
tags:
  - CSV to Excel
  - 'Export Array to Excel CSharp'
  - Export DataTable to Excel
  - Export rows and columns data to Excel
  - GridView to Excel
  - JSON to Excel

---


{{< figure align=center src="images/ExportDataToAnExcelDocument.png" alt="Export Data to excel">}}
 

In this article, I will show you how to export data to Excel in C# and VB.NET from various data sources such as an array, collection of custom objects, DataTable, DataView, DataGrid, GridView, HTML, JSON and CSV.

  * [Export Array to Excel in C#][1]
      * [Export ArrayList to Excel][2]
      * [Export Collection of Custom Objects to Excel][3]
  * [Copy Rows and Columns from one Excel file to Another][4]
  * [Export DataTable to Excel in C#][5]
      * [Export Data of Selective DataColumns to Excel][6]
      * [Export DataView to Excel][7]
  * [Export Data from DataGrid and GridView to Excel][8]
  * [Export HTML formatted Data to Excel][9]
      * [Export HTML File to Excel][10]
  * [Export JSON Data to Excel in C#][11]
  * [Export CSV Data to Excel in C#][12]

## Export Data to Excel in C# with Aspose.Cells API

[Aspose.Cells for .NET][13] is a powerful spreadsheet manipulation API that lets you create, edit, or convert Excel files within .NET applications. The API’s easy to use methods enable you to perform Excel automation features seamlessly in a few lines of code. **NuGet** is the easiest way to download and install [Aspose.Cells API for .NET][14]. Open **Manage NuGet Packages** window and type “Aspose.Cells” in the search text box to find the **Aspose.Cells** .NET package. Finally, click the&nbsp;**Install**&nbsp;button to install the latest version of the package.

## Export Array to Excel in C# {#Export-from-Array-to-Excel}

We can export an array (one-dimensional or two-dimensional) of a reference type or value type to an Excel document. We use the [ImportArray][15]&nbsp;method of the [Cells][16]&nbsp;collection to export data to a spreadsheet from an array. The overloaded versions of the [ImportArray][15]&nbsp;method are the following.<figure class="wp-block-table is-style-stripes">

<table class="">
  <tr>
    <td>
      <strong>Name</strong>
    </td>
    
    <td>
      <strong>Description</strong>
    </td>
  </tr>
  
  <tr>
    <td>
      <a href="https://apireference.aspose.com/cells/net/aspose.cells.cells/importarray/methods/1">ImportArray(Double[], Int32, Int32, Boolean)</a>
    </td>
    
    <td>
      Exports an array of double into a worksheet.
    </td>
  </tr>
  
  <tr>
    <td>
      <a href="https://apireference.aspose.com/cells/net/aspose.cells.cells/importarray/methods/3">ImportArray(Int32[], Int32, Int32, Boolean)</a>
    </td>
    
    <td>
      Exports an array of an integer into a worksheet.
    </td>
  </tr>
  
  <tr>
    <td>
      <a href="https://apireference.aspose.com/cells/net/aspose.cells.cells/importarray/methods/5">ImportArray(String[], Int32, Int32, Boolean)</a>
    </td>
    
    <td>
      Exports an array of string into a worksheet.
    </td>
  </tr>
  
  <tr>
    <td>
      <a href="https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/importarray">ImportArray(Double[,], Int32, Int32)</a>
    </td>
    
    <td>
      Exports a two-dimensional array of double into a worksheet.
    </td>
  </tr>
  
  <tr>
    <td>
      <a href="https://apireference.aspose.com/cells/net/aspose.cells.cells/importarray/methods/2">ImportArray(Int32[,], Int32, Int32)</a>
    </td>
    
    <td>
      Exports a two-dimensional array of an integer into a worksheet.
    </td>
  </tr>
  
  <tr>
    <td>
      <a href="https://apireference.aspose.com/cells/net/aspose.cells.cells/importarray/methods/4">ImportArray(String[,], Int32, Int32)</a>
    </td>
    
    <td>
      Exports a two-dimensional array of string into a worksheet.
    </td>
  </tr>
</table></figure> 

A typical overload takes the following parameters:

  * **Array**, the array object that you are exporting content from.
  * **Row number**, the row number of the first cell (zero-based) that the data will be exported to.
  * **Column number**, the column number of the first cell (zero-based) that the data will be exported to.
  * **Is vertical**, a Boolean value that specifies whether to export data vertically or horizontally.

The following are the steps to export an array to Excel file in C#.

  * Create a [Workbook][17] object. A [Workbook][17]&nbsp;class represents a Microsoft Excel file.
  * Get a reference to the desired worksheet. The&nbsp;[Workbook][17]&nbsp;class contains a&nbsp;[Worksheets][18]&nbsp;collection that allows access to each worksheet in an Excel file. 
  * Call [ImportArray][19] method of a [Cells][16] collection to export an array to the worksheet at the specified row and column. The [Worksheet][20]&nbsp;class provides a [Cells][16]&nbsp;collection.
  * Save the Excel file using [Workbook.Save(string)][21] method.

The following code sample shows how to export an array of String to an Excel file in C#.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiating a Workbook object
Workbook workbook = new Workbook();

// Obtaining the reference of the worksheet
Worksheet worksheet = workbook.Worksheets[0];

// Creating an array containing names as string values
string[] names = new string[] { "Laurence Chen", "Roman Korchagin", "Kyle Huang" };

// Exporting the array of names to first row and first column vertically
worksheet.Cells.ImportArray(names, 0, 0, true);

// Saving the Excel file
workbook.Save("StringsArray.xlsx");</pre>

{{< figure align=center src="images/Export-Array-to-Excel.jpg" alt="Export String Array to Excel" caption="Export an array of data to Excel">}}
 

Similarly, we can export a **two-dimensional array to an Excel file**. The following code sample shows how to export two-dimensional array to an Excel file in C#.

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Creating a two-dimensional array of integers
int[,] array2D = new int[4, 2] { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };

// Exporting a two-dimensional array at the first row and first column of the worksheet
worksheet.Cells.ImportArray(array2D, 0, 0);</pre>

### Export ArrayList to Excel in C# {#Export-from-ArrayList-to-Excel}

To export data from an ArrayList_&nbsp;_to worksheet, call the [Cells][16]&nbsp;collection&#8217;s [ImportArrayList][22]&nbsp;method. The [ImportArrayList][22] method takes the following parameters:

  * **Array list** represents the ArrayList&nbsp;object you are exporting.
  * **Row** **number** represents the row number of the first cell that the data will be exported to.
  * **Column number** represents the column number of the first cell that the data will be exported to.
  * **Is vertical** a Boolean value that specifies whether to export data vertically or horizontally.

The following code sample shows how to export an ArrayList to an Excel file in C#.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiating a Workbook object
Workbook workbook = new Workbook();

// Obtaining the reference of the worksheet
Worksheet worksheet = workbook.Worksheets[0];

// Instantiating an ArrayList object
ArrayList list = new ArrayList();

// Add few names to the list as string values
list.Add("Laurence Chen");
list.Add("Roman Korchagin");
list.Add("Kyle Huang");
list.Add("Tommy Wang");

// Exporting the contents of ArrayList vertically at the first row and first column of the worksheet. 
worksheet.Cells.ImportArrayList(list, 0, 0, true);

// Saving the Excel file
workbook.Save("ArrayListExport.xlsx");</pre>

### Export Collection of Custom Objects to Excel in C# {#Export-from-Collection-of-Custom-Objects}

To export data from a collection of custom objects to a worksheet, we use [ImportCustomObjects][23] method. There are two overloaded versions of this method.

  1. [ImportCustomObjects(ICollection list, String[] propertyNames, Boolean isPropertyNameShown, Int32 firstRow, Int32 firstColumn, Int32 rowNumber, Boolean insertions, String dateFormatString, Boolean convertStringToNumber)][24]
  2. [ImportCustomObjects(ICollection list, Int32 firstRow, Int32 firstColumn, ImportTableOptions options)][25]

We will explore each overloaded method one by one. The description of the parameters of the first overloaded method is given below:

  * **list** The collection of the custom objects.
  * **propertyNames** Names of properties of the object to export. If it is null, all properties will be exported. 
  * **isPropertyNameShown** Indicates whether the property names will be exported to the first row.
  * **firstRow** The row number of the first cell to export to.
  * **firstColumn** The column number of the first cell to export to.
  * **rowNumber** Number of objects to be exported.
  * **insertRows** Indicates whether extra rows are added to fit data.
  * **dateFormatString** Date format string for cells.
  * **convertStringToNumber** Indicates if this method will try to convert string to a number.

In the following example, we are exporting a list of _Person_ objects to an Excel document in C#. Please note that we are exporting only two properties (_Name_ and _Age_) of a _Person_ object.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiate a new Workbook
Workbook book = new Workbook();
// Obtaining the reference of the worksheet
Worksheet sheet = book.Worksheets[0];

// Define List
List&lt;Person&gt; list = new List&lt;Person&gt;();

list.Add(new Person("Mike", 25, "Software Engineer"));
list.Add(new Person("Steve", 30, "Doctor"));
list.Add(new Person("Billy", 35, "Teacher"));

// We pick only Name and Age columns, not all, to export to the worksheet         
sheet.Cells.ImportCustomObjects((System.Collections.ICollection)list,
    new string[] { "Name", "Age" }, // propertyNames
    true, // isPropertyNameShown
    0, // firstRow
    0, // firstColumn
    list.Count, // Number of objects to be exported
    true, // insertRows
    null, // dateFormatString
    false); // convertStringToNumber

// Save the Excel file
book.Save("ExportedCustomObjects.xlsx");
       
public class Person
{
    public string Name { get; set; }

    public int Age { get; set; }

    public string Occupation { get; set; }

    public Person(string name, int age, string occupation)
    {
        Age = age;
        Name = name;
        Occupation = occupation;
    }
}</pre>

{{< figure align=center src="images/Export-ArrayList-Object.jpg" alt="Export List of Objects to Excel" caption="Export a list of Person objects to Excel">}}
 

Now we explore the second overloaded method of [ImportCustomObjects][23]. The description of the parameters of the method is given below:

  * **list** The list of custom objects.
  * **firstRow** The row number of the first cell to export to.
  * **firstColumn** The column number of the first cell to export to.
  * **options** [ImportTableOptions][26] object.

The [ImportTableOptions][26] parameter provides several options for exporting data into cells. Some of them are given below:

  * **CheckMergedCells** Does an Excel document contain merged cells.
  * **ColumnIndexes** Integer array of column indexes (0-based) to export from the data source. _null_ means all columns should be exported.
  * **ConvertGridStyle** Indicates whether to apply the style of the grid view to cells.
  * **ConvertNumericData** A boolean value that indicates whether the string value should be converted to numeric or date value.
  * **DateFormat** Gets or sets date format string for cells with exported DateTime values.
  * **DefaultValues** Default value for the cell in the table is null.
  * **InsertRows** Indicates whether new rows should be added for exporting data records.
  * **IsFieldNameShown** Indicates whether the field names should be exported.
  * **IsFormulas** Indicates whether the data are formulas.
  * **IsHtmlString** Indicates whether the data contains HTML tags. If we set the value to true, HTML formatting will remain preserved while exporting data to an Excel document.
  * **NumberFormats** Gets or sets the number formats
  * **ShiftFirstRowDown** Indicates whether the first row should be shifted down when inserting rows.
  * **TotalColumns** Gets or sets total columns&#8217; count to export from a data source. -1 means all columns of the given data source.
  * **TotalRows** Gets or sets total rows&#8217; count to export from the data source. -1 means all rows of the given data source. 

In the following example, we are exporting data from a collection of objects to a worksheet containing merged cells. We are setting the value of [ImportTableOptions.CheckMergedCells][27]&nbsp;property to true as the Excel document contains merged cells.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Opening an existing Workbook.
Workbook workbook = new Workbook("SampleMergedTemplate.xlsx");
List&lt;Product&gt; productList = new List&lt;Product&gt;();

// Creating a collection of Products
for (int i = 0; i &lt; 3; i++)
{
    Product product = new Product
    {
        ProductId = i,
        ProductName = "Test Product - " + i
    };
    productList.Add(product);
}

ImportTableOptions tableOptions = new ImportTableOptions();
// Set CheckMergedCells property to true
tableOptions.CheckMergedCells = true;
tableOptions.IsFieldNameShown = false;

//Export data to excel template (in second row, first column)            workbook.Worksheets[0].Cells.ImportCustomObjects((ICollection)productList, 1, 0, tableOptions);
workbook.Save("SampleMergedTemplate_out.xlsx", SaveFormat.Xlsx);

public class Product
{
    public int ProductId { get; set; }

    public string ProductName { get; set; }
}</pre>

{{< figure align=center src="images/MergedCells.jpg" alt="Export data from a collection of objects to a worksheet containing merged cells" caption="Export Data to an Excel Document Containing Merged Cells">}}
 

## Copies Rows and Columns from one Excel file to Another in C# {#Copy-Rows-and-Columns}

We can programmatically copy rows and columns from one Excel document to another. When a row (or column) is copied, the data contained in it, including formulas &#8211; with updated references &#8211; and values, comments, formatting, hidden cells, images, and other drawing objects are also copied. We can also copy rows and columns within the same worksheet or across different worksheets in an Excel document. Aspose.Cells provides the following methods to copy rows and columns.

  * [CopyRow(Cells sourceCells, int sourceRowIndex, int destinationRowIndex)][28] Copies data of a single row.
  * [CopyRows(Cells sourceCells, int sourceRowIndex, int destinationRowIndex, int rowNumber)][29] Copies data of multiple rows.
  * [CopyColumn(Cells sourceCells, int sourceColumnIndex, int destinationColumnIndex)][30] Copies data of a single column.
  * [CopyColumns(Cells sourceCells, int sourceColumnIndex, int destinationColumnIndex, int columnNumber)][31] Copies data of multiple columns.

The following example code shows how to copy rows from one Excel document to another in C#.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Open the source excel file.
Workbook srcWorkbook = new Workbook("Source_Workbook.xlsx");

// Instantiate the destination excel file.
Workbook destWorkbook = new Workbook();

// Get the first worksheet of the source workbook.
Worksheet srcWorksheet = srcWorkbook.Worksheets[0];

// Get the first worksheet of the destination workbook.
Worksheet desWorksheet = destWorkbook.Worksheets[0];

// Copy all the rows of the first worksheet of source Workbook to
// the first worksheet of destination Workbook.
desWorksheet.Cells.CopyRows(srcWorksheet.Cells, 0, 0, srcWorksheet.Cells.MaxDisplayRange.RowCount);

// Save the excel file.
destWorkbook.Save("Destination_Workbook.xlsx");</pre>

The following example code shows how to copy specific rows of one Excel document to another.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Open the source excel file.
Workbook srcWorkbook = new Workbook("Source_Workbook.xlsx");

// Instantiate the destination excel file.
Workbook destWorkbook = new Workbook();

// Get the first worksheet of the source workbook.
Worksheet srcWorksheet = srcWorkbook.Worksheets[0];

// Get the first worksheet of the destination workbook.
Worksheet desWorksheet = destWorkbook.Worksheets[0];

// Copy the second row of the source Workbook to the first row of destination Workbook.
desWorksheet.Cells.CopyRow(srcWorksheet.Cells, 1, 0);

// Copy the fourth row of the source Workbook to the second row of destination Workbook.
desWorksheet.Cells.CopyRow(srcWorksheet.Cells, 3, 1);

// Save the excel file.
destWorkbook.Save("Destination_Workbook.xlsx");</pre>

{{< figure align=center src="images/CopyRowsData.jpg" alt="Copies Rows' Data from one Excel Document to another">}}
 

We can similarly copy columns&#8217; data from one Microsoft Excel document to another using [CopyColumn][30] or [CopyColumns][31] method.

## Export DataTable to Excel in C# {#Export-from-DataTable-to-Excel}

Data from ADO.NET objects such as [DataTable][32], [DataColumn][33], and [DataView][34] can be exported to Excel worksheets. To export data from a DataTable, we call the [ImportData][35] method of Cells collection. There are many overloaded versions of the [ImportData][36] method but we use the following:

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">public int ImportData(
	DataTable table,
	int firstRow,
	int firstColumn,
	ImportTableOptions options
)</pre>

The description of the parameters is given below:

  * **table** The <a rel="noreferrer noopener" aria-label=" (opens in a new tab)" href="https://docs.microsoft.com/en-us/dotnet/api/system.data.datatable?view=netcore-3.1" >DataTable</a> object to be exported.
  * **firstRow** The row number of the first cell to export to.
  * **firstColumn** The column number of the first cell to export to.
  * **optionsType** [ImportTableOptions][26] object.

In the following code sample, we are creating a DataTable object that has three columns and two rows. And exporting it to an Excel worksheet.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiating a Workbook object            
Workbook workbook = new Workbook();

// Obtaining the reference of the worksheet
Worksheet worksheet = workbook.Worksheets[0];

// Instantiating a "Products" DataTable object
DataTable dataTable = new DataTable("Products");

// Adding columns to the DataTable object
dataTable.Columns.Add("Product ID", typeof(int));
dataTable.Columns.Add("Product Name", typeof(string));
dataTable.Columns.Add("Units In Stock", typeof(int));

// Creating an empty row in the DataTable object
DataRow dr = dataTable.NewRow();

// Adding data to the row
dr[0] = 1;
dr[1] = "Aniseed Syrup";
dr[2] = 15;

// Adding filled row to the DataTable object
dataTable.Rows.Add(dr);

// Creating another empty row in the DataTable object
dr = dataTable.NewRow();

// Adding data to the row
dr[0] = 2;
dr[1] = "Boston Crab Meat";
dr[2] = 123;

// Adding filled row to the DataTable object
dataTable.Rows.Add(dr);

// Setting IsFieldNameShown property to true will add column names // of the DataTable to the worksheet as a header row
ImportTableOptions tableOptions = new ImportTableOptions();
tableOptions.IsFieldNameShown = true;

// Exporting the contents of DataTable at the first row and first column.
worksheet.Cells.ImportData(dataTable, 0, 0, tableOptions);

// Saving the Excel file
workbook.Save("DataTable_Eport.xlsx");</pre>

{{< figure align=center src="images/Export-DataTable.jpg" alt="Export DataTable to Excel" caption="Export DataTable to Excel">}}
 

### Export Data of Selective DataColumns to Excel in C# {#Export-Data-of-Selective-DataColumns}

We can export selective DataColumns of a DataTable or DataView to an Excel document. As discussed earlier, the&nbsp;[ImportData][35]&nbsp;method accepts an argument of type&nbsp;[ImportTableOptions][37]. The&nbsp;[ImportTableOptions][37]&nbsp;class has a [ColumnIndexes][38]&nbsp;property&nbsp;that accepts an array of columns indexes (zero-based) that we want to export. In the following code sample, we are exporting only two DataColumns of a DataTable to an Excel Worksheet.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiating a "Products" DataTable object
DataTable dataTable = new DataTable("Products");

// Adding columns to the DataTable object
dataTable.Columns.Add("Product ID", typeof(int));
dataTable.Columns.Add("Product Name", typeof(string));
dataTable.Columns.Add("Units In Stock", typeof(int));

// Creating an empty row in the DataTable object
DataRow dr = dataTable.NewRow();

// Adding data to the row
dr[0] = 1;
dr[1] = "Aniseed Syrup";
dr[2] = 15;

// Adding filled row to the DataTable object
dataTable.Rows.Add(dr);

// Creating another empty row in the DataTable object
dr = dataTable.NewRow();

// Adding data to the row
dr[0] = 2;
dr[1] = "Boston Crab Meat";
dr[2] = 123;

// Adding filled row to the DataTable object
dataTable.Rows.Add(dr);

// Instantiate a new Workbook
Workbook book = new Workbook();

Worksheet sheet = book.Worksheets[0];

// Create export options
ImportTableOptions importOptions = new ImportTableOptions();
// Sets the columns (0-based) to export from data source.
// null means all columns should be exported.
importOptions.ColumnIndexes = new int[] { 0, 1 };
importOptions.IsFieldNameShown = true;

// Exporting the values of 1st and 2nd columns of the data table
sheet.Cells.ImportData(dataTable, 0, 0, importOptions);

book.Save("DataColumsExport.xlsx");</pre>

{{< figure align=center src="images/DataColumn-Export.jpg" alt="Export Data of Selective DataColumns to Excel" caption="_The output of DataColumns to Excel_">}}
 

### Export Data from DataView to Excel in C# {#Export-Data-from-DataView-to-Excel}

A [DataView][39] is a view on a DataTable that can be customized to present a subset of data from the DataTable. We use the following overloaded version of the [ImportData][36]&nbsp;method to export data from DataView to an Excel document.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">public int ImportData(
	DataView dataView,
	int firstRow,
	int firstColumn,
	ImportTableOptions options
)</pre>

We know there are two ways to create a [DataView][40]. We can use the **DataView** constructor, or we can create a reference to the [DefaultView][41] property of the [DataTable][42]. In the following code sample, we are using the later way to create a DataView.

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">worksheet.Cells.ImportData(dataTable.DefaultView, 0, 0, options);</pre>

## Export Data from DataGrid and GridView to Excel in C# {#Export-Data-from-DataGrid-and-GridView}

[Aspose.Cells][43] library allows us to export data from Microsoft Grid controls such as DataGrid and GridView to an Excel worksheet. It provides [ImportDataGrid][44]&nbsp;method, to export data from a DataGrid and [ImportGridView][45] method to export data from a GridView. 

There are many overloaded versions of the [ImportDataGrid][44]&nbsp;method but a typical overload takes the following parameters:

  * **dataGrid**, the _DataGrid_&nbsp;object that we’re exporting content from.
  * **firstRow**, the row number of the first cell that the data will be exported to.
  * **firstColumn**, the column number of the first cell that the data will be exported to.
  * **insertRows**, a Boolean property that indicates whether extra rows should be added to the worksheet to fit data.
  * **importStyle**, a Boolean property that indicates whether cell style should be exported.

The following code example shows how to export data from DataGrid to an Excel file in C#.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Create a DataTable object and set it as the DataSource of the DataGrid.
DataTable dataTable = new DataTable("Products");
dataTable.Columns.Add("Product ID", typeof(int));
dataTable.Columns.Add("Product Name", typeof(string));
dataTable.Columns.Add("Units In Stock", typeof(int));

DataRow dr = dataTable.NewRow();
dr[0] = 1;
dr[1] = "Aniseed Syrup";
dr[2] = 15;
dataTable.Rows.Add(dr);

dr = dataTable.NewRow();
dr[0] = 2;
dr[1] = "Boston Crab Meat";
dr[2] = 123;
dataTable.Rows.Add(dr);

// Now take care of DataGrid
DataGrid dg = new DataGrid();
dg.DataSource = dataTable;
dg.DataBind();

// We have a DataGrid object with some data in it.
// Lets export it to an Excel worksheet.

// Creat a new workbook
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];

// Exporting the contents of the DataGrid to the worksheet
worksheet.Cells.ImportDataGrid(dg, 0, 0, false);

// Save it as Excel file
workbook.Save("ExportDataGrid.xlsx");</pre>

## Export HTML formatted Data to Excel in C# {#Export-HTML-formatted-Data-to-Excel}

[Aspose.Cells][46] lets you export HTML formatted data to an Excel worksheet. The API parses HTML formatted text while exporting data and convert the HTML into formatted cell values. In the following sample code, DataTable contains HTML formatted text and we are exporting it to an Excel Document using [ImportData][35] method.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Prepare a DataTable with some HTML formatted values
DataTable dataTable = new DataTable("Products");

dataTable.Columns.Add("Product ID", typeof(int));
dataTable.Columns.Add("Product Name", typeof(string));
dataTable.Columns.Add("Units In Stock", typeof(int));

DataRow dr = dataTable.NewRow();
dr[0] = 1;
// Make text italicize
dr[1] = "&lt;i&gt;Aniseed&lt;/i&gt; Syrup";
dr[2] = 15;
dataTable.Rows.Add(dr);

dr = dataTable.NewRow();
dr[0] = 2;
// Make text bold
dr[1] = "&lt;b&gt;Boston Crab Meat&lt;/b&gt;";
dr[2] = 123;
dataTable.Rows.Add(dr);

// Create export options
ImportTableOptions exportOptions = new ImportTableOptions();
exportOptions.IsFieldNameShown = true;
// Set IsHtmlString property to true as the data contains HTML tags. 
exportOptions.IsHtmlString = true;

// Create workbook
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];

worksheet.Cells.ImportData(dataTable, 0, 0, exportOptions);

workbook.Save("HTMLFormattedData_Out.xlsx");</pre>

{{< figure align=center src="images/Export-HTML-Formatted-Data.jpg" alt="HTML formatted Data to a Spreadsheet" caption="The output of HTML Exported Data to an Excel Document">}}
 

### Export HTML File to Excel in C# {#Export-HTML-File-to-Excel}

Aspose.Cells allows us to export an HTML file to Excel. The HTML file should be Microsoft Excel oriented, i.e., MS-Excel should be able to open it.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// An HTML file
string filePath = "Book1.html";

// Instantiate LoadOptions specified by the LoadFormat.
HtmlLoadOptions loadOptions = new HtmlLoadOptions(LoadFormat.Html);

// Create a Workbook object and open the HTML file.
Workbook wb = new Workbook(filePath, loadOptions);

// Save the file as Excel Document
wb.Save("Book1_out.xlsx");</pre>

## Export JSON Data to Excel in C# {#Export-JSON-Data-to-Excel}

Sometimes we have a need to export JSON Data to an Excel document. With [Aspose.Cells][46] we can easily do this with a few lines of code. Aspose.Cells provides a [JsonUtility][47] class that has an [ImportData][48] method for exporting JSON data to an Excel document. The&nbsp;[ImportData][48]&nbsp;method accepts&nbsp;[JsonLayoutOptions][49] object as a parameter. The [JsonLayoutOptions][49] class represents the options of JSON layout and has the following properties.

  * [ArrayAsTable][50]: Indicates whether the array should be processed as a table.
  * [ConvertNumericOrDate][51]:&nbsp;Gets or sets a value that indicates whether the string in JSON is to be converted to numeric or date.
  * [DateFormat][52]: Gets and sets the format of the date value.
  * [IgnoreArrayTitle][53]: Indicates whether to&nbsp;ignore the title if the property of the object is an array.
  * [IgnoreNull][54]: Indicates whether the null value should be ignored.
  * [IgnoreObjectTitle][55]: Indicates whether to&nbsp;ignore the title if the property of the&nbsp;object is an object.
  * [NumberFormat][56]: Gets and sets the format of the numeric value.
  * [TitleStyle][57]: Gets and sets the style of the title.

In the following example code, we are exporting JSON data to an Excel file in C#.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiating a Workbook object
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];

// Read JSON file
string jsonInput = File.ReadAllText("Sample.json");

// Set Styles
CellsFactory factory = new CellsFactory();
Style style = factory.CreateStyle();
style.HorizontalAlignment = TextAlignmentType.Center;
style.Font.Color = System.Drawing.Color.BlueViolet;
style.Font.IsBold = true;

// Set JsonLayoutOptions
JsonLayoutOptions options = new JsonLayoutOptions();
options.TitleStyle = style;
options.ArrayAsTable = true;

// Export JSON Data
JsonUtility.ImportData(jsonInput, worksheet.Cells, 0, 0, options);

// Save Excel file
workbook.Save("ExportingJsonData.xlsx");</pre>

<pre class="EnlighterJSRAW" data-enlighter-language="json" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">{
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
}</pre>

{{< figure align=center src="images/Exporting-JSON-To-Excel-1024x400.jpg" alt="JSON Data to an Excel Document" caption="Export JSON Data to Excel">}}
 

## Export CSV Data to Excel in C# {#Export-CSV-Data-to-Excel}

A comma-separated values (CSV) file is a delimited text file that uses a comma to separate values. A CSV file typically stores tabular data (numbers and text) in plain text, in which case each line will have the same number of fields. 

The following code sample shows how we can open a CSV file and save it as an Excel file using Aspose.Cells library.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group="">// Instantiate LoadOptions with CSV LoadFormat.
LoadOptions loadOptions = new LoadOptions(LoadFormat.CSV);

// Open CSV file as a Workbook object
Workbook wb = new Workbook("Business-Price.csv", loadOptions);

// Save the file as an Excel Documnt
wb.Save("CSVAsAnExcelDocument.xlsx");</pre>

{{< figure align=center src="images/CSV-to-Excel.jpg" alt="Open a CSV file in a Spreadsheet Document" caption="CSV to an Excel Document">}}
 

## Conclusion

In this post, you have seen how easily you can export data to Excel in C# from Array, DataTable, DataView, DataGrid and GridView. You have also seen how to export HTML, JSON, CSV Data to an Excel worksheet. Please check the [documentation][46] to learn more about these and several other features that Aspose.Cells API offers. If you have any questions, please feel free to contact us through our [Support Forum][58].

## See Also

  * [Create MS Excel Files Programmatically in C# without MS Office][59]
  * [Import Data from JSON to Excel Worksheet in C# .NET][60]

 [1]: #Export-from-Array-to-Excel
 [2]: #Export-from-ArrayList-to-Excel
 [3]: #Export-from-Collection-of-Custom-Objects
 [4]: #Copy-Rows-and-Columns
 [5]: #Export-from-DataTable-to-Excel
 [6]: #Export-Data-of-Selective-DataColumns
 [7]: #Export-Data-from-DataView-to-Excel
 [8]: #Export-Data-from-DataGrid-and-GridView
 [9]: #Export-HTML-formatted-Data-to-Excel
 [10]: #Export-HTML-File-to-Excel
 [11]: #Export-JSON-Data-to-Excel
 [12]: #Export-CSV-Data-to-Excel
 [13]: https://products.aspose.com/cells/net
 [14]: https://www.nuget.org/packages/Aspose.Cells/
 [15]: https://apireference.aspose.com/net/cells/aspose.cells/cells/methods/importarray/index
 [16]: https://apireference.aspose.com/net/cells/aspose.cells/worksheet/properties/cells
 [17]: https://apireference.aspose.com/net/cells/aspose.cells/workbook
 [18]: https://apireference.aspose.com/net/cells/aspose.cells/workbook/properties/worksheets
 [19]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/importarray/index
 [20]: https://apireference.aspose.com/net/cells/aspose.cells/worksheet
 [21]: https://apireference.aspose.com/net/cells/aspose.cells.workbook/save/methods/2
 [22]: https://apireference.aspose.com/net/cells/aspose.cells/cells/methods/importarraylist
 [23]: https://apireference.aspose.com/net/cells/aspose.cells/cells/methods/importcustomobjects/index
 [24]: https://apireference.aspose.com/cells/net/aspose.cells.cells/importcustomobjects/methods/1
 [25]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/importcustomobjects
 [26]: https://apireference.aspose.com/cells/net/aspose.cells/importtableoptions
 [27]: https://apireference.aspose.com/net/cells/aspose.cells/importtableoptions/properties/checkmergedcells
 [28]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/copyrow
 [29]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/copyrows
 [30]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/copycolumn
 [31]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/copycolumns
 [32]: https://docs.microsoft.com/en-us/dotnet/framework/data/adonet/dataset-datatable-dataview/datatables
 [33]: https://docs.microsoft.com/en-us/dotnet/api/system.data.datacolumn?view=netcore-3.1
 [34]: https://docs.microsoft.com/en-us/dotnet/framework/data/adonet/dataset-datatable-dataview/dataviews
 [35]: https://apireference.aspose.com/cells/net/aspose.cells.cells/importdata/methods/1
 [36]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/importdata/index
 [37]: https://apireference.aspose.com/net/cells/aspose.cells/importtableoptions
 [38]: https://apireference.aspose.com/net/cells/aspose.cells/importtableoptions/properties/columnindexes
 [39]: https://docs.microsoft.com/en-us/dotnet/api/system.data.dataview?view=netcore-3.1
 [40]: https://docs.microsoft.com/en-us/dotnet/api/system.data.dataview
 [41]: https://docs.microsoft.com/en-us/dotnet/api/system.data.datatable.defaultview
 [42]: https://docs.microsoft.com/en-us/dotnet/api/system.data.datatable
 [43]: https://products.aspose.com/cells
 [44]: https://apireference.aspose.com/net/cells/aspose.cells/cells/methods/importdatagrid/index
 [45]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/importgridview
 [46]: https://docs.aspose.com/cells/net/
 [47]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonutility
 [48]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonutility/methods/importdata
 [49]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions
 [50]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/arrayastable
 [51]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/convertnumericordate
 [52]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/dateformat
 [53]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/ignorearraytitle
 [54]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/ignorenull
 [55]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/ignoreobjecttitle
 [56]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/numberformat
 [57]: https://apireference.aspose.com/net/cells/aspose.cells.utility/jsonlayoutoptions/properties/titlestyle
 [58]: https://forum.aspose.com/
 [59]: https://blog.aspose.com/2020/01/21/create-excel-xls-xlsx-programmatically-in-csharp-net/
 [60]: https://blog.aspose.com/2020/04/03/import-data-from-json-to-excel-in-csharp-asp.net/




