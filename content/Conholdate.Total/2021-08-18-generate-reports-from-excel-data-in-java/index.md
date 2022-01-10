---
title: Generate Reports from Excel Data in Java
author: Muzammil Khan
date: 2021-08-18T17:20:07+00:00
summary: 'As a Java developer, you can easily generate customized reports programmatically from Excel data. In this article, you will learn <strong>how to generate reports from Excel data using Java</strong>.'
url: /2021/08/18/generate-reports-from-excel-data-in-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Generate Reports
  - Generate Reports from Excel
  - GroupDocs.Assembly for Java
  - Word Report from Excel using Java

---


{{< figure align=center src="images/generate-reports-from-excel-data-in-java.jpg" alt="Generate Reports from Excel Data in Java">}}
 

You can present Microsoft Excel data in the form of customized reports to your users such as clients, stakeholders, etc. As a Java developer, you can generate such reports programmatically by using Excel spreadsheets as a table of data. In this article, you will learn **how to generate reports from Excel data using Java**.

The following topics are discussed/covered in this article:

  * [Java API for Generating Report][2]
  * [Generate Reports from Excel Data using Java][3]

## Java API for Generating Reports {#java-api-for-generating-reports}

For generating the reports from Excel data, I will be using [GroupDocs.Assembly for Java][4]&nbsp;API. It enables you to build powerful document automation and report generation applications. It fetches data from the data source as per the defined template document, assembles it, and generates reports in the specified output format.&nbsp;The API supports fetching data from various data sources such as XML, Excel, JSON, and CSV. You can easily generate reports in all commonly used file formats such as PDF, HTML, and Microsoft Word.

You can&nbsp;[download][5]&nbsp;the JAR of the API or just add the following&nbsp;**_pom.xml_**&nbsp;configuration in your Maven-based Java application to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-assembly&lt;/artifactId&gt;
        &lt;version&gt;21.7&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Generate Reports from Excel Data using Java {#generate-reports-from-excel-in-java}

You can easily generate reports in Word from your Excel data by following the simple steps mentioned below:

<ol id="block-7217a74c-2677-474d-aee2-df72121b5cd2">
  <li>
    Get&nbsp;<a href="#get-excel-data">Excel data&nbsp;source</a>
  </li>
  <li>
    Define&nbsp;a <a href="#template">template</a> according to Excel data
  </li>
  <li>
    <a href="#generate-excel-to-word-report">Convert Excel Data to Word Report in Java</a>
  </li>
</ol>

### Excel Data Source {#get-excel-data}

<p id="block-17f4a041-9fca-4b56-b0b9-a19227bff1fc">
  You can use the tabular data as a data source provided in the Excel spreadsheet to generate reports. I will be using the following sample Excel data for generating the report. This is the contracts data of clients with their respective managers and the agreed contract price.


{{< figure align=center src="images/Excel-Data-Source.jpg" alt="Excel Data Source" caption="Excel Data Source">}}
 

### Template {#template}

You can use a Linq-based template syntax to create a template. A template is composed of common document contents and tags describing the template’s structure and data bindings. You can define the following template in the DOCX or XLSX file. This template enables you to iterate the Contracts’ data and their respective managers with the contract price. Each group in the template has a unique key defined by the input selector and contains items of the source enumeration associated with this key. You can access the key of a group instance using the Key property. Once you have created the template, you can jump into code for generating the report. You can read more about [template syntax][7] in the documentation.

{{< figure align=center src="images/Report-Template.jpg" alt="Report-Template" caption="Report Template">}}
 

### Convert Excel Data to Word Report in Java {#generate-excel-to-word-report}

You can automate the conversion of Excel data to the DOCX report based on the template by following the steps mentioned below:

  * Define Excel data file, the template file, and DOCX output report file paths
  * Create an instance of the&nbsp;_**[DocumentTableOptions][9]**_ class
  * Set _**[setFirstRowContainsColumnNames][10]**_ to _true_
  * Create the&nbsp;_**[DocumentTable][11]**_&nbsp;with defined Excel data file and&nbsp;_DocumentTableOptions_
  * Create an instance of the&nbsp;**[DocumentAssembler][12]&nbsp;**class
  * Call the&nbsp;_**[assembleDocument()][13]**_&nbsp;method with the provided Excel data and defined template

The following code sample shows how to generate a report from an Excel data source according to the defined template using Java.

{{< gist conholdate-gists ae91a46ebfd7de45a6d9c05455cda8b7 "GenerateReports_Java_Generate.java" >}}

{{< figure align=center src="images/output_report.jpg" alt="Generated Report" caption="Generated Report">}}
 

The&nbsp;_**DocumentTableOptions**&nbsp;_class provides a set of options to control the extraction of data from a document table. I set the&nbsp;_FirstRowContainsColumnNames&nbsp;_property to&nbsp;_true_ so that the column headers should not become part of the report data.

The&nbsp;_**DocumentTable&nbsp;**_class provides access to the data of a single table (or a spreadsheet) located in an external document to be used while assembling a document.

The&nbsp;**_DocumentAssembler_**&nbsp;class provides various methods to generate reports using the defined template document with data. The&nbsp;_assembleDocument**()**_&nbsp;method of this class takes three input parameters, the defined template as source document, the output file path, and the data source. It populates the data from the data source based on the provided template document, and stores the resulting document to the target path. You can save the resulting document into various supported file formats such as Word, Excel, or HTML.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][15].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;generate reports&nbsp;from Excel data using Java**. You have also learned **how to create a report template to generate reports**. You can learn more about GroupDocs.Assembly for Java API using the&nbsp;[documentation][16]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][17].

## See Also

  * [PDF & Word Reports from CSV in Java][18]
  * [Generate Reports from XML Data in Java][19]
  * [Generate PDF Report from JSON Data in Java][20]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/generate-reports-from-excel-data-in-java.jpg
 [2]: #java-api-for-generating-reports
 [3]: #generate-reports-from-excel-in-java
 [4]: https://products.groupdocs.com/assembly/java
 [5]: https://downloads.groupdocs.com/assembly/java
 [6]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Excel-Data-Source.jpg
 [7]: https://docs.groupdocs.com/assembly/java/template-syntax-part-1-of-2/
 [8]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Report-Template.jpg
 [9]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentTableOptions
 [10]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentTableOptions#setFirstRowContainsColumnNames-boolean-
 [11]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentTable
 [12]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentAssembler
 [13]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentAssembler#assembleDocument-java.lang.String-java.lang.String-com.groupdocs.assembly.DataSourceInfo...-
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/output_report.jpg
 [15]: https://purchase.groupdocs.com/temporary-license
 [16]: https://docs.groupdocs.com/assembly/java/
 [17]: https://forum.groupdocs.com/c/assembly/
 [18]: https://blog.groupdocs.com/2021/07/07/generate-reports-from-csv-data-in-java/
 [19]: https://blog.groupdocs.com/2021/07/10/generate-reports-from-xml-data-in-java/
 [20]: https://blog.groupdocs.com/2021/02/10/generate-pdf-report-from-json-data-in-java/




