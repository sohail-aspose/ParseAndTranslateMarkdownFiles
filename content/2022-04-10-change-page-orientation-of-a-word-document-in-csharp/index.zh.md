---
title: "在 C# 中更改 Word 文档的页面方向"
date: Sun, 10 Apr 2022 14:14:00 +0000
draft: false
url: /zh/2022/04/10/change-page-orientation-of-a-word-document-in-csharp/
author: 'Shoaib Khan'
summary: "文档的每一页都可能包含不同的布局。这取决于页面的内容；哪个方向适合它。作为开发人员，我们可以将每个页面的方向更改为适合的方向。在本文中，我们将学习**使用 C#** 更改 Word 文档中页面的方向。另外，我们将看到如何将纵向布局更改为横向，然后如何使用 .NET 应用程序将横向更改为纵向。"
tags: ['change orientation', 'change page orientation in CSharp', 'how to change the orientation of one page in word', 'how to make one page landscape in word', 'landscape to portrait', 'page orientation', 'portrait to landscape in CSharp']
categories: ['GroupDocs.Merger Product Family']
---

文档的每一页都可能包含不同的布局。这取决于页面的内容；哪个方向适合它。作为开发人员，我们可以将每个页面的方向更改为适合的方向。在本文中，我们将学习**使用 C#** 更改 Word 文档中页面的方向。另外，我们将看到如何将纵向布局更改为横向，然后如何使用 .NET 应用程序将横向更改为纵向。

{{< figure align=center src="images/change-page-orientation-in-csharp.jpg" alt="使用 C# 更改 DOC/DOCX 的页面方向">}}

## 用于更改 Word 页面方向的 .NET API
**GroupDocs.Merger** 展示了可更改 Word 文档页面方向的 .NET API。此外，API 允许在 .NET 应用程序中移动页面、删除页面、拆分文档、提取和旋转文档页面。我们将使用这个 [GroupDocs.Merger for .NET][1] 来使用 C# 更改 DOC/DOCX 文件的页面方向。有关 API 的详细信息和其他功能，您可以访问[文档][2]。

您可以从 [下载部分][3] 下载 **DLLs** 或 **MSI** 安装程序，或通过 [NuGet][4] 在您的 .NET 应用程序中安装 API。

```
PM> Install-Package GroupDocs.Merger
```

## 使用 C# 将 Word 页面的方向更改为横向

让我们从如何以编程方式在 Word 文档中创建页面横向的简单方法开始。以下步骤允许使用 C# 将 Word 文档的页面方向更改为横向：

- 使用 [Merger][5] 加载 Word 文档。
- 准备[方向选项][6]并将[模式][7]设置为横向。
- 使用 [ChangeOrientation()][8] 更改方向。
- 使用适当的 [Save()][9] 保存更新的文档。

以下 C# 代码将 Word 文档的某些页面的纵向更改为横向。

```
// 如何使用 C# 将 Word 文档的页面方向更改为横向 
using (Merger merger = new Merger("path/document.docx"))
{
    OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Landscape, new int[] { 1, 2 });
    merger.ChangeOrientation(orientationOptions);
    merger.Save("path/orientation-landscape-document.docx");
}
```

## 使用 C# 将 Word 页面的方向更改为纵向

同样，您可以将 Word 文档的任何页面设置为纵向。以下步骤允许使用 C# 将 Word 文档页面的方向更改为纵向：

- 使用 [Merger][5] 加载 Word 文档。
- 准备[方向选项][6]并将[模式][7]设置为纵向。
- 使用 [ChangeOrientation()][8] 方法改变方向。
- 使用适当的 [Save()][9] 方法来保存更新的文档。

以下 C# 代码将 Word 文档的某些页面的纵向方向更改为纵向。

```
// 如何使用 C# 将 Word 文档的页面方向更改为纵向  
using (Merger merger = new Merger("path/document.docx"))
{
    OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Portrait, new int[] { 3, 4 });   
    merger.ChangeOrientation(orientationOptions);
    merger.Save("path/orientation-portrait-document.docx");
}
```

## 获取免费 API 许可证
您可以 [获得免费的临时许可证][10] 以便在没有评估限制的情况下使用 API。

## 结论
最后，我们学习了如何在 .NET 应用程序中使用 C# 更改 Word 文档的页面方向。我们看到了将 DOCX 文件的选定页面的纵向方向更改为横向的源代码示例。同样，我们使用 C# 示例将所选页面的横向方向更改为纵向。您可以尝试构建自己的应用程序，该应用程序可以在线切换方向 Word 页面。

有关 API 的更多详细信息，请访问文档。如有疑问，请通过 [论坛][11] 联系我们。

## 也可以看看
- [在 Word 中使用 C# 重新排列页面][12]
- [使用C#添加和删除Word文档的密码保护][13]
- [比较Word文档][14]
- [编辑Word文档][15]
- [添加或删除注释或标记字文件][16]

[1]: https://products.groupdocs.com/merger/net/
[2]: https://docs.groupdocs.com/merger/
[3]: https://downloads.groupdocs.com/merger
[4]: https://www.nuget.org/packages/groupdocs.merger
[5]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger
[6]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/orientationoptions
[7]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/orientationmode
[8]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/changeorientation
[9]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/save/index
[10]: https://purchase.groupdocs.com/temporary-license
[11]: https://forum.groupdocs.com/
[12]: https://blog.groupdocs.com/2022/02/05/move-word-pages-using-csharp/
[13]: https://blog.groupdocs.com/2021/11/27/password-protect-word-documents-using-csharp/
[14]: https://blog.groupdocs.com/2021/12/01/compare-word-documents-using-csharp/
[15]: https://blog.groupdocs.com/2021/03/26/edit-word-documents-in-csharp/
[16]: https://blog.groupdocs.com/2021/06/23/annotate-word-documents-using-csharp/
