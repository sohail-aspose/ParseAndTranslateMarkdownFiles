---
title: 'Combine Multiple Excel Files into One using C#'
author: Muhammad Sohail
date: 2021-01-13T12:34:29+00:00
summary: 'In this article, you are going to learn <strong>how to copy sheets from multiple Excel workbooks into one workbook using C#</strong>. You will also learn <strong>how to copy data from several worksheets into one sheet<strong>.'
url: /2021/01/13/combine-multiple-excel-files-into-one-using-csharp/
categories:
  - Conholdate.Total Product Family

---
In this article, you are going to learn **how to copy sheets from multiple Excel workbooks into one workbook using C#**. You will also learn **how to copy data from several worksheets into one sheet**. Let&#8217;s start.

  * [Combine Multiple Excel Files into One using C#][1]
  * [Combine Specific Worksheets of Excel Files into one Workbook][2] 
  * [Merge Multiple Worksheets into One using C#][3]

## C# API to Merge Multiple Excel files

[Aspose.Cells for .NET][4] is a well-known spreadsheet manipulation API that lets you create and process Excel files from within your .NET applications. You can either [download][5] the binaries of the API or get it installed using [NuGet][6].

<pre class="wp-block-code"><code>PM&gt; Install-Package Aspose.Cells</code></pre>

## Combine Multiple Excel Files into One using C# {#Combine-Multiple-Excel-Files}

Sometimes, you need to merge multiple Excel files into one file. You want to copy worksheets from the source workbooks to the destination workbook as shown below. Excel documents can be of any version such as Excel 97, Excel 2010 or Excel 2016.

{{< figure align=center src="images/Combine-Excel-Documents-1.jpg" alt="Combine Multiple Excel Files into One using C#" caption="Fig 1: Combine Excel Files">}}
 

The following sample code shows how to combine multiple Excel files into one using C#. 

{{< gist conholdate-gists 93009b8b055b086b90ee581d40ad5b73 "CombineExcelFiles.cs" >}}

## Combine Specific Worksheets of Excel Files using C# {#Combine-Specific-Worksheets-of-Excel-Files}

The above code copies all worksheets in the source files to the destination file. However, you may want to copy specific worksheets from the source files to the destination file. For example, you have two Excel files and each has three worksheets named Sales, Employees and Expenses. You only want to copy Sales worksheet from both files to the destination file as shown in the following figure.

{{< figure align=center src="images/Selective-Merging.png" alt="Combine Specific Worksheets of Excel Files using C#" caption="Fig 2: Combine Specific Worksheets of Excel Files">}}
 

The following sample code shows how to combine specific worksheets of source files into destination file using C#.

{{< gist conholdate-gists b7d9bcd7a6fbef33a103cfb1c1619f3c "combineSpecificWorksheetsOfExcelFiles.cs" >}}

## Merge Multiple Worksheets into One using C# {#Merge-Multiple-Worksheets-into-One}

Sometimes, you need to copy data from several worksheets into one worksheet. For example, you have a few worksheets in an Excel file that contain information about different products, and you want to merge these sheets into one summary worksheet, like this:

{{< figure align=center src="images/merge-sheets-excel.png" alt="Merge Multiple Worksheets into One using C#" caption="Fig 3: Merge Multiple Worksheets into One">}}
 

The following code snippet shows how to copy data from several worksheets into one worksheet using C#.

{{< gist conholdate-gists 1e17dff0bc63859b4db1f697e5381192 "MergeMultipleWorksheetsIntoOne.cs" >}}

## Conclusion

In this article, you have learnt how to programmatically combine multiple Excel files into one. You can either copy all worksheets of a source file or specific ones to the destination file. You have also learnt how to combine data of multiple worksheets into one worksheet. Please check the [documentation of Aspose.Cells for .NET][10] for more information. If you have any questions, please feel free to ask at our [Support Forum][11]. We will answer them in a few hours.

## See Also

  * [Delete Blank Rows and Columns in Excel using C#][12]
  * [Convert Excel Files to Images using C#][13]
  * [Convert CSV to Excel Files or Excel to CSV using C# VB.NET][14]

 [1]: #Combine-Multiple-Excel-Files
 [2]: #Combine-Specific-Worksheets-of-Excel-Files
 [3]: #Merge-Multiple-Worksheets-into-One
 [4]: https://products.aspose.com/cells/net
 [5]: https://downloads.aspose.com/cells/net
 [6]: http://nuget.org/packages/Aspose.Cells
 [7]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/01/Combine-Excel-Documents-1.jpg
 [8]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/01/Selective-Merging.png
 [9]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/01/merge-sheets-excel.png
 [10]: https://docs.aspose.com/cells/net/
 [11]: https://forum.aspose.com/
 [12]: https://blog.conholdate.com/2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/
 [13]: https://blog.aspose.com/2021/01/01/convert-excel-files-to-images-in-csharp/
 [14]: https://blog.aspose.com/2020/11/17/csv-excel-csharp-vb-net/




