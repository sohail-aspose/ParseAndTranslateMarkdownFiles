---
title: 'Generate Reports from Excel Data in C#'
author: Muzammil Khan
date: 2021-04-29T06:18:58+00:00
summary: 'You can easily generate customized reports programmatically by using Excel spreadsheets as a table of data. This article will be focusing on <strong>how to generate reports from Excel data using C#</strong>. '
url: /2021/04/29/generate-reports-from-excel-data-in-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Convert Excel to Word in C#'
  - 'Excel Data to Word using C#'
  - Generate Reports
  - Generate Reports from Excel

---


{{< figure align=center src="images/Generate-Reports-from-Excel-Data.jpg" alt="Generate Reports from Excel Data in C#">}}
 

You can easily create customized reports from Microsoft Excel data tables. Such reports can be generated programmatically by using Excel spreadsheets as a table of data. This article will be focusing on&nbsp;**how to generate reports from Excel data using C#**.

The following topics are discussed/covered in this article:

  * [C# API for Generating Report][2]
  * [Generate Reports from Excel Data using C#][3]

## C# API for Generating Reports {#api-for-generating-reports}

I will be using&nbsp;[GroupDocs.Assembly for .NET][4]&nbsp;API for generating reports from Excel data. It empowers you to build powerful document automation and report generation applications. The API supports fetching data from various data sources such as XML, JSON, and CSV. You can easily generate reports in all commonly used file formats such as PDF, HTML, and Microsoft Word. It can be used to develop applications in any development environment that targets the .NET platform.

You can either&nbsp;[download][5]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][6].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Assembly</code></pre>

## Generate Reports from Excel Data using C# {#generate-reports-from-excel}

You can generate reports from Excel data by following the simple steps mentioned below:

<ol id="block-7217a74c-2677-474d-aee2-df72121b5cd2">
  <li>
    Get <a href="#get-excel-data">Excel data</a> source
  </li>
  <li>
    Define <a href="#template">template </a>according to Excel data
  </li>
  <li>
    Provide data source and template to <a href="#generate-excel-to-word-report">simple C# code for report generation</a>
  </li>
</ol>

### Excel Data {#get-excel-data}

<p id="block-17f4a041-9fca-4b56-b0b9-a19227bff1fc">
  The tabular data available in the Excel spreadsheet can be used as a data source to generate reports. I will be using the following sample Excel data for report generation. This is the contract data of clients with their respective managers and agreed contract price.


{{< figure align=center src="images/Excel_data_source.png" alt="Excel Data Source" caption="Excel Data Source">}}
 

### Template {#template}

Now, define the following template in the DOCX file. This allows iterating Contracts’ data and their respective managers with the contract price. After that, you can jump into code for report generation.

{{< figure align=center src="images/Template.jpg" alt="Report Template" caption="Report Template">}}
 

### Convert Excel to Word Report in C# {#generate-excel-to-word-report}

Please follow the steps mentioned below to automate the conversion of Excel data to the DOCX report based on the template.

  * Define Excel data file, the template file, and DOCX output report file paths
  * Define _**[DocumentTableOptions][9]**_
  * Create _**[DocumentTable][10]**_ with defined Excel data file and _DocumentTableOptions_
  * Call the&nbsp;_**[AssembleDocument][11]**_&nbsp;method of the&nbsp;**[DocumentAssembler][12]&nbsp;**class to generate the report from the provided Excel data and defined template

The following code sample shows how to generate a report from an Excel data source according to the defined template using C#.

{{< gist conholdate-gists 332145f637123e03307e8f213c9ca2f0 "GenerateReports_CSharp_Generate.cs" >}}

The above code sample will generate the following report.

{{< figure align=center src="images/output.jpg" alt="Generated Report" caption="Generated Report">}}
 

The _**DocumentTableOptions**_ class provides a set of options to control the extraction of data from a document table. Here, the _FirstRowContainsColumnNames_ property is set to _true_.

The _**DocumentTable**_ class provides access to the data of a single table (or spreadsheet) located in an external document to be used while assembling a document.

The **_DocumentAssembler_** class provides methods to generate reports based on the template document with data.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][14].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;generate reports **from Excel data using C#****. You can learn more about GroupDocs.Assembly for .NET API using the&nbsp;[documentation][15]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][16].

## See Also

  * [Generate PDF and Word Reports from JSON Data in C#][17]
  * [Generate Reports from CSV or XML Data using C#][18]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Generate-Reports-from-Excel-Data.jpg
 [2]: #api-for-generating-reports
 [3]: #generate-reports-from-excel
 [4]: https://products.groupdocs.com/assembly/net
 [5]: https://downloads.groupdocs.com/assembly/net
 [6]: https://www.nuget.org/packages/GroupDocs.Assembly
 [7]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Excel_data_source.png
 [8]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Template.jpg
 [9]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly.data/documenttableoptions
 [10]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly.data/documenttable
 [11]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly.documentassembler/assembledocument/methods/2
 [12]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly/documentassembler
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/output.jpg
 [14]: https://purchase.groupdocs.com/temporary-license
 [15]: https://docs.groupdocs.com/assembly/net/
 [16]: https://forum.groupdocs.com/c/assembly/
 [17]: https://blog.groupdocs.com/2021/03/20/generate-reports-from-json-data-in-csharp/
 [18]: https://blog.groupdocs.com/2019/10/21/generate-reports-from-csv-xml-in-csharp/




