---
title: 'Fill and Read XFA Forms using C#'
author: Muzammil Khan
date: 2022-03-04T06:43:17+00:00
summary: 'As a C# developer, you can fill and read PDF XFA forms programmatically in .NET applications. In this article, you will learn **how to fill and read XFA forms using C#**.'
url: /2022/03/04/fill-and-read-xfa-forms-using-csharp/

categories:
  - Conholdate.Total Product Family
tags:
  - 'C# API to Fill and Read XFA'
  - 'Fill XFA Forms using C#'
  - XFA Forms
  - GroupDocs.PDF for .NET
  - 'Read XFA Forms using C#'
---


{{< figure align=center src="images/Fill-and-Read-XFA-Forms-using-CSharp.jpg" alt="Fill and Read XFA Forms using C#">}}
 

Adobe introduced an interactive and dynamic Forms called XFA forms. XFA stands for XML Forms Architecture. XFA form is similar to an HTML file. It contains fillable fields and determines the layout or appearance as a form embedded inside PDF documents. In this article, we will learn **how to fill and read XFA forms using C#**.

The following topics shall be covered in this article:

  * [C# API to Read and Fill XFA Forms][1]
  * [Fill XFA Forms using C#][2]
  * [Read XFA Forms using C#][3]

## C# API to Read and Fill XFA Forms {#CSharp-API-to-Read-and-Fill-XFA-Forms}

For working with XFA [PDF][4] forms, we will be using [Aspose.PDF for .NET][5] API. It allows us to generate, modify, convert, render, secure and print [supported documents][6] without using Adobe Acrobat. Please either [download][7] the DLL of the API or install it using [NuGet][8].

```
PM> Install-Package Aspose.Pdf
```

## Fill XFA Forms using C# {#Fill-XFA-Forms-using-CSharp}

We can fill XFA forms programmatically by following the steps given below:

  1. Firstly, load an XFA form file using the _**[Document][9]**_ class.
  2. Get names of the loaded _**[XFA][10]**_ form fields.
  3. Set field values.
  4. Finally, call the _**[Save()][11]**_ method. It takes the path of the output file as an argument.

The following code sample shows **how to fill an XFA form using C#**.

{{< gist conholdate-gists a35d2cb5a3075094598eedc5b330a0fc "FillAndReadXFAForms_CSharp_FillXFA.cs" >}}

{{< figure align=center src="images/Fill-XFA-Forms-using-CSharp.jpg" alt="Fill XFA Forms using C#." caption="Fill XFA Forms using C#.">}}
 

## Read XFA Forms using C# {#Read-XFA-Forms-using-CSharp}

We can read the filled XFA form by following the steps given below:

  1. Firstly, load an Excel file using the _**[Document][9]**_ class.
  2. Get names of the loaded _**[XFA][12]**_ form fields.
  3. In a loop, get field details using the _**[GetFieldTemplate()][13]**_ method.
  4. Finally, show field attributes.

The following code sample shows **how to read the filled XFA form using C#**.

{{< gist conholdate-gists a35d2cb5a3075094598eedc5b330a0fc "FillAndReadXFAForms_CSharp_ReadXFA.cs" >}}

{{< figure align=center src="images/Read-XFA-Forms-using-CSharp.jpg" alt="Read the filled XFA form using C#." caption="Read the filled XFA form using C#.">}}
 
## Get a Free License

Please try the API without evaluation limitations by requesting [a free temporary license][14].

## Conclusion

In this article, we have learned **how to fill the XFA forms** without using Adobe writer. We have also seen **how to read the filled XFA form** programmatically. Besides, you can learn more about Aspose.PDF for .NET API using the [documentation][15]. In case of any ambiguity, please feel free to contact us on the [forum][16].

## See Also

  * [Edit Metadata of PDF Files using C#][17]
  * [Add Headers and Footers in PDF using C#][18]

  [1]: #CSharp-API-to-Read-and-Fill-XFA-Forms
  [2]: #Fill-XFA-Forms-using-CSharp
  [3]: #Read-XFA-Forms-using-CSharp
  [4]: https://docs.fileformat.com/pdf/
  [5]: https://products.aspose.com/pdf/net/
  [6]: https://docs.aspose.com/pdf/net/supported-file-formats/
  [7]: https://downloads.aspose.com/pdf/net/
  [8]: https://www.nuget.org/packages/aspose.pdf
  [9]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
  [10]: https://apireference.aspose.com/pdf/net/aspose.pdf.forms/xfa
  [11]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
  [12]: https://apireference.aspose.com/pdf/net/aspose.pdf.forms/form/properties/xfa
  [13]: https://apireference.aspose.com/pdf/net/aspose.pdf.forms/xfa/methods/getfieldtemplate
  [14]: https://purchase.conholdate.com/temporary-license
  [15]: https://docs.aspose.com/pdf/net/
  [16]: https://forum.aspose.com/c/pdf/10
  [17]: https://blog.conholdate.com/2022/02/10/edit-metadata-of-pdf-files-using-csharp/
  [18]: https://blog.conholdate.com/2021/12/15/add-headers-and-footers-in-pdf-using-csharp/