---
title: "'使用 C# 填写和读取 XFA 表单'"
author: Muzammil Khan
date: 2022-03-04T06:43:17+00:00
summary: "作为 C# 开发人员，您可以在 .NET 应用程序中以编程方式填写和阅读 PDF XFA 表单。在本文中，您将学习**如何使用 C# 填写和阅读 XFA 表单**。"
url: /zh/2022/03/04/fill-and-read-xfa-forms-using-csharp/

categories:
  - "Conholdate.Total 产品系列"
tags:
  - "用于填充和读取 XFA 的 C# API"
  - "使用 C# 填写 XFA 表单"
  - "XFA 表格"
  - "GroupDocs.PDF .NET"
  - "使用 C# 读取 XFA 表单"
---


{{< figure align=center src="images/Fill-and-Read-XFA-Forms-using-CSharp.jpg" alt="使用 C# 填写和读取 XFA 表单">}}
 

Adobe 引入了一种称为 XFA 表单的交互式动态表单。 XFA 代表 XML 表单架构。 XFA 表单类似于 HTML 文件。它包含可填写的字段，并将布局或外观确定为嵌入在 PDF 文档中的表单。在本文中，我们将学习**如何使用 C# 填写和读取 XFA 表单**。

本文将涵盖以下主题：

  * [用于读取和填写 XFA 表单的 C# API][1]
  * [使用 C# 填写 XFA 表单][2]
  * [使用 C# 读取 XFA 表单][3]

## 用于读取和填写 XFA 表单的 C# API {#CSharp-API-to-Read-and-Fill-XFA-Forms}

为了使用 XFA [PDF][4] 表单，我们将使用 [Aspose.PDF for .NET][5] API。它允许我们在不使用 Adobe Acrobat 的情况下生成、修改、转换、渲染、保护和打印 [支持的文档][6]。请[下载][7] API 的 DLL 或使用 [NuGet][8] 安装它。

```
PM> Install-Package Aspose.Pdf
```

## 使用 C# 填写 XFA 表单 {#Fill-XFA-Forms-using-CSharp}

我们可以按照以下步骤以编程方式填写 XFA 表格：

  1. 首先，使用 _**[Document][9]**_ 类加载一个 XFA 表单文件。
  2. 获取已加载的 _**[XFA][10]**_ 表单字段的名称。
  3. 设置字段值。
  4. 最后，调用 _**[Save()][11]**_ 方法。它将输出文件的路径作为参数。

以下代码示例展示了**如何使用 C# 填写 XFA 表单**。

```
// 此代码示例演示如何填写 XFA 表单。
// 加载 XFA 表格
Document doc = new Document(@"C:\Files\PDF\FillXFAFields.pdf");

// 获取 XFA 表单字段的名称
string[] names = doc.Form.XFA.FieldNames;

// 设置字段值
doc.Form.XFA[names[0]] = "12345";
doc.Form.XFA[names[1]] = "24/02/2022";
doc.Form.XFA[names[2]] = "Company Name";
doc.Form.XFA[names[3]] = "Company Address";
doc.Form.XFA[names[4]] = "Company City";
doc.Form.XFA[names[5]] = "Canada";
doc.Form.XFA[names[6]] = "Alberta";
doc.Form.XFA[names[7]] = "T9S";
doc.Form.XFA[names[8]] = "+112345567";
doc.Form.XFA[names[10]] = "Mr. John Smith";
doc.Form.XFA[names[11]] = "Delivered to Company Name";
doc.Form.XFA[names[12]] = "Delivery Company Address";
doc.Form.XFA[names[13]] = "Delivery City";
doc.Form.XFA[names[17]] = "+123456789";
doc.Form.XFA[names[19]] = "Mr. Will Smith";
doc.Form.XFA[names[22]] = "57251";

// 保存表格
doc.Save(@"C:\Files\PDF\Filled_XFA_out.pdf");
```

{{< figure align=center src="images/Fill-XFA-Forms-using-CSharp.jpg" alt="使用 C# 填写 XFA 表单。" caption="使用 C# 填写 XFA 表单。">}}
 

## 使用 C# 读取 XFA 表单 {#Read-XFA-Forms-using-CSharp}

我们可以按照以下步骤阅读填写好的 XFA 表格：

  1. 首先，使用 _**[Document][9]**_ 类加载一个 Excel 文件。
  2. 获取已加载的 _**[XFA][12]**_ 表单字段的名称。
  3. 在循环中，使用 _**[GetFieldTemplate()][13]**_ 方法获取字段详细信息。
  4. 最后，显示字段属性。

以下代码示例显示了**如何使用 C# 读取填充的 XFA 表单**。

```
// 此代码示例演示如何读取已填写的 XFA 表单。
// 加载 XFA 表格
Document doc = new Document(@"C:\Files\PDF\Filled_XFA_out.pdf");

// 获取 XFA 表单字段的名称
string[] names = doc.Form.XFA.FieldNames;

for (int count=0; count<names.Length; count++)
{
    // Get field details
    var field = doc.Form.XFA.GetFieldTemplate(names[count]);
    string fieldName = doc.Form.XFA.GetFieldTemplate(names[count]).InnerText;
    string fieldValue = doc.Form.XFA[names[count]];

    if (!string.IsNullOrEmpty(fieldValue) && fieldValue != "0")
    {
        Console.WriteLine("Field Name : " + field.Attributes["name"].Value);
        Console.WriteLine("Field Description : " + fieldName);
        Console.WriteLine("Field Value : " + fieldValue);
        Console.WriteLine();
    }
}
```

{{< figure align=center src="images/Read-XFA-Forms-using-CSharp.jpg" alt="使用 C# 阅读已填写的 XFA 表单。" caption="使用 C# 阅读已填写的 XFA 表单。">}}
 
## 获得免费许可证

请通过申请 [免费的临时许可证][14] 来尝试不受评估限制的 API。

## 结论

在本文中，我们学习了**如何在不使用 Adobe writer 的情况下填写 XFA 表单**。我们还看到了**如何以编程方式阅读填写的 XFA 表格**。此外，您可以使用 [文档][15] 了解更多关于 Aspose.PDF for .NET API 的信息。如有任何歧义，请随时在 [论坛][16] 上与我们联系。

## 也可以看看

  * [使用 C# 编辑 PDF 文件的元数据][17]
  * [使用 C# 在 PDF 中添加页眉和页脚][18]

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
