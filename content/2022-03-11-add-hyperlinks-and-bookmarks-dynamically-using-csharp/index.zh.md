---
title: "'使用 C# 动态添加超链接和书签'"
author: Muzammil Khan
date: 2022-03-11T06:43:17+00:00
summary: "超链接和书签方便用户快速浏览相关内容。在本文中，您将学习**如何使用 C# 为报表动态添加超链接和书签**。"
url: /zh/2022/03/11/add-hyperlinks-and-bookmarks-dynamically-using-csharp/

categories:
  - "Conholdate.Total 产品系列"
tags:
  - "C# API 动态添加超链接和书签"
  - "动态添加超链接 C#"
  - "动态添加书签 C#"
  - "将超链接插入报表 C#"
  - "将书签插入报表 C#"
---

{{< figure align=center src="images/add-hyperlinks-and-bookmarks-dynamically-using-csharp.jpg" alt="使用 C# 动态添加超链接和书签">}}
 
超链接和书签方便用户快速浏览相关内容。单击超链接时，它会在浏览器中打开 URL 或导航到文档中指定的书签位置。在本文中，我们将学习**如何使用 C# 为报表动态添加超链接和书签**。

本文将涵盖以下主题：

  * [C# API 动态添加超链接和书签][1]
  * [使用 C# 动态添加超链接][2]
  * [使用 C# 动态添加书签][3]
  * [使用 C# 将书签插入为超链接][4]

## C# API 动态添加超链接和书签 {#CSharp-API-to-Add-Hyperlinks-and-Bookmarks-Dynamically}

为了动态添加超链接和书签到报告中，我们将使用 [GroupDocs.Assembly for .NET][5] API。它允许构建强大的文档自动化和报告生成应用程序。它根据定义的模板文档从数据源中获取数据，组装它，并以指定的输出格式生成报告。请[下载][6] API 的 DLL 或使用 [NuGet][7] 安装它。

```
PM> Install-Package GroupDocs.Assembly
```

## 使用 C# 动态添加超链接 {#Add-Hyperlinks-Dynamically-using-CSharp}

我们可以使用链接标签动态地将超链接插入到报告中。模板文档中使用的链接标签的语法定义如下：

```
<<link [uri_expression][display_text_expression]>>
```

**uri_expression** 定义超链接的 URI，而 **display_text_expression** 定义要为超链接显示的文本。

我们可以按照以下步骤动态插入超链接到报告：

  1. 创建 _**[DocumentAssembler][8]**_ 类的实例。
  2. 调用 AssembleDocument() 方法来组装文档。它将源文档模板路径、目标文档路径和数据源作为参数。

以下代码示例展示了**如何使用 C# 动态添加超链接**。

```
// 此代码示例演示如何动态添加超链接。
// 设置源 
const string strDocumentTemplate = @"D:\Files\Assembly\Insertinghyperlink.docx";

// 设置目的地 
const string strDocumentReport = @"D:\Files\Assembly\Insertinghyperlink_out.docx";

// 设置 Uri 表达式
const string uriExpression = "https://www.groupdocs.com/";

// 设置显示文本表达式
const string displayTextExpression = "GroupDocs";

// 实例化 DocumentAssembler 类
DocumentAssembler assembler = new DocumentAssembler();

// 组装文件 
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
    new DataSourceInfo(uriExpression, "uriExpression"),
    new DataSourceInfo(displayTextExpression, "displayTextExpression"));
```

{{< figure align=center src="images/Add-Hyperlinks-Dynamically-using-CSharp.jpg" alt="使用 C# 动态添加超链接。" caption="使用 C# 动态添加超链接。">}}
 

## 使用 C# 动态添加书签 {#Add-Bookmarks-Dynamically-using-CSharp}

我们可以使用书签标签动态地将书签插入到报表中。模板文档中要使用的书签标签的语法定义如下：

```
<<bookmark [bookmark_expression]>>
bookmarked_content
<</bookmark>>
```

**bookmark_expression** 定义要插入的书签的名称。

我们可以按照以下步骤将书签动态插入到报告中：

  1. 创建 _**[DocumentAssembler][8]**_ 类的实例。
  2. 调用 AssembleDocument() 方法来组装文档。它将源文档模板路径、目标文档路径和数据源作为参数。

以下代码示例展示了**如何使用 C# 动态添加书签**。

```
// 此代码示例演示如何动态添加书签。
// 设置源 
const string strDocumentTemplate = @"D:\Files\Assembly\Insertingbookmark.xlsx";

// 设置目的地 
const string strDocumentReport = @"D:\Files\Assembly\Insertingbookmark_out.xlsx";

// 设置 Uri 表达式
const String bookmark_expression = "gd_bookmark";

// 设置显示文本表达式
const String displayTextExpression = "GroupDocs";

// 实例化 DocumentAssembler 类
DocumentAssembler assembler = new DocumentAssembler();

// 组装文件 
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
    new DataSourceInfo(bookmark_expression, "bookmark_expression"),
    new DataSourceInfo(displayTextExpression, "displayTextExpression"));
```


## 使用 C# 将书签插入为超链接 {#Insert-Bookmark-as-Hyperlink-using-CSharp}

我们还可以按照前面提到的步骤将书签链接到文档中的超链接。但是，我们只需为 uriExpression 和 bookmark_expression 设置相同的值，如下所示：

```
const string bookmark_expression = "gd_bookmark";
const String uriExpression = "gd_bookmark";
```

以下代码示例展示了**如何使用 C#** 将书签作为超链接插入。

```
// 此代码示例演示如何将书签添加为超链接。
// 设置源 
const string strDocumentTemplate = @"D:\Files\Assembly\input.docx";

// 设置目的地 
const string strDocumentReport = @"D:\Files\Assembly\output.docx";

// 设置 Uri 表达式
const string bookmark_expression = "gd_bookmark";

// 设置显示文本表达式
const string displayTextExpression = "GroupDocs";

// 设置 Uri 表达式
const String uriExpression = "gd_bookmark";

// 设置显示文本表达式
const String uriTextExpression = "GroupDocs";

// 实例化 DocumentAssembler 类
DocumentAssembler assembler = new DocumentAssembler();

// 组装文件 
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
                           new DataSourceInfo(uriExpression, "uriExpression"), 
                           new DataSourceInfo(uriTextExpression, "uriTextExpression"),
                           new DataSourceInfo(bookmark_expression, "bookmark_expression"),
                           new DataSourceInfo(displayTextExpression, "displayTextExpression"));
```

{{< figure align=center src="images/Insert-Bookmark-as-Hyperlink-using-CSharp.jpg" alt="使用 C# 将书签插入为超链接。" caption="使用 C# 将书签插入为超链接。">}}

## 获得免费许可证

请通过申请 [免费的临时许可证][9] 来尝试不受评估限制的 API。

## 结论

在本文中，我们学习了如何：
  * 使用 C# 动态插入超链接和书签到报表；
  * 动态添加到书签的超链接。

此外，您可以使用 [documentation][10] 了解更多关于 GroupDcos.Assembly for .NET API 的信息。如有任何歧义，请随时在 [论坛][11] 上与我们联系。

## 也可以看看

  * [在 C# 中从 Excel 数据生成报告][12]

  [1]: #CSharp-API-to-Add-Hyperlinks-and-Bookmarks-Dynamically
  [2]: #Add-Hyperlinks-Dynamically-using-CSharp
  [3]: #Add-Bookmarks-Dynamically-using-CSharp
  [4]: #Insert-Bookmark-as-Hyperlink-using-CSharp
  [5]: https://products.groupdocs.com/assembly/net/
  [6]: https://downloads.groupdocs.com/assembly/net
  [7]: https://www.nuget.org/packages/groupdocs.assembly
  [8]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly/documentassembler
  [9]: https://purchase.conholdate.com/temporary-license
  [10]: https://docs.groupdocs.com/assembly/net/
  [11]: https://forum.groupdocs.com/c/assembly/15
  [12]: https://blog.conholdate.com/2021/04/29/generate-reports-from-excel-data-in-csharp/
