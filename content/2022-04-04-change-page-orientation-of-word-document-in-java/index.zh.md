---
title: "在 Java 中更改 Word 文档的页面方向"
date: Mon, 04 Apr 2022 14:14:00 +0000
draft: false
url: /zh/2022/04/04/change-page-orientation-of-word-document-in-java/
author: 'Shoaib Khan'
summary: "页面方向取决于页面的内容布局。作为开发人员，我们可以通过编程将每个页面的方向更改为适合的方向。在本文中，我们将学习**在 Java 中更改 Word 文档中页面的方向**。另外，我们将了解如何使用 Java 应用程序将横向更改为纵向，然后将纵向更改为横向。"
tags: ['change orientation', 'change page orientation in Java', 'how to change the orientation of one page in word', 'how to make one page landscape in word', 'landscape to portrait', 'portrait to landscape in java']
categories: ['GroupDocs.Merger Product Family']
---

页面方向取决于页面的内容布局。作为开发人员，我们可以通过编程将每个页面的方向更改为适合的方向。在本文中，我们将学习**在 Java 中更改 Word 文档中页面的方向**。另外，我们将了解如何使用 Java 应用程序将横向更改为纵向，然后将纵向更改为横向。

{{< figure align=center src="images/change-page-orientation-in-java.jpg" alt="在 Java 中更改 DOC/DOCX 的页面方向">}}

## 用于更改 Word 页面方向的 Java API

[GroupDocs.Merger for Java][1] 是在 Java 应用程序中处理文档页面的 API。它允许更改 Word 文档页面和许多其他支持文档格式的方向。我们将使用它来更改 DOC/DOCX 文件的页面方向。有关 API 的详细信息和其他功能，您可以访问文档。

### 下载并配置

从下载部分获取库。对于基于 Maven 的 Java 应用程序，只需添加以下 pom.xml 配置。在此之后，您可以尝试本文的示例以及 GitHub 上提供的更多示例。有关详细信息，您可以访问 API 参考。

```
<repository>
	<id>GroupDocsJavaAPI</id>
	<name>GroupDocs Java API</name>
	<url>http://repository.groupdocs.com/repo/</url>
</repository>
<dependency>
        <groupId>com.groupdocs</groupId>
        <artifactId>groupdocs-merger</artifactId>
        <version>22.2</version> 
</dependency>
```
## 在 Java 中将 Word 页面的方向更改为横向

从如何以编程方式在 Word 文档中创建页面横向开始。以下步骤允许在 Java 中将 Word DOC/DOCX 文档的页面方向更改为横向：

- 准备[方向选项][8]并将其设置为横向模式。
- 使用 [Merger][7] 加载 Word 文档。
- 使用 **changeOrientation()** 方法更改方向。
- 使用适当的 **save()** 方法保存更新的文档。

以下 Java 代码将 Word 文档的某些页面的纵向方向更改为横向。

```
// 如何在 Java 中将 Word 文档的页面方向更改为横向
OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Landscape, new int[] { 1, 2 });
Merger merger = new Merger("path/document.docx");
merger.changeOrientation(orientationOptions);
merger.save("path/orientation-landscape-document.docx");
```

## 在 Java 中将 Word 页面的方向更改为纵向
同样，您可以将 Word 文档的任何页面设置为纵向。以下步骤允许在 Java 中将 Word 文档页面的方向更改为纵向：

- 使用 [Merger][7] 加载 Word 文档。
- 准备[方向选项][8]并将模式设置为纵向。
- 使用 **changeOrientation()** 方法更改方向。
- 使用**适当的 save()** 方法保存更新的文档。

以下 Java 代码将 Word 文档的某些页面的纵向方向更改为纵向。

```
// 如何在 Java 中将 Word 文档的页面方向更改为纵向
OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Prtrait, new int[] { 3, 4 });
Merger merger = new Merger("path/document.docx");
merger.changeOrientation(orientationOptions);
merger.save("path/orientation-landscape-document.docx");
```

## 获取免费 API 许可证
您可以 [获得免费的临时许可证][9] 以便在没有评估限制的情况下使用 API。

## 结论
最后，我们学习了如何在 Java 应用程序中更改 Word 文档的页面方向。我们讨论了将 DOCX 文件的选定页面的横向方向更改为纵向的代码片段。同样，我们使用 Java 代码示例将所选页面的纵向方向更改为横向。开始构建您自己的可以切换 Word 页面方向的应用程序。

有关 API 的更多详细信息，请访问 [文档][3a]。如有疑问，请通过 [论坛][10] 联系我们。

## 也可以看看
- [用Java注释Word文件][11]
- [用Java编辑Word文档][12]
- [在 Word 中使用 Java 重新排列页面][13]
- [在 Java 中将 Word 文档渲染为缩小的 HTML][14]

[1]: https://products.groupdocs.com/merger/java/
[2]: https://downloads.groupdocs.com/merger
[3]: https://docs.groupdocs.com/merger/
[3a]：https://docs.groupdocs.com/merger/java/
[4]: https://docs.groupdocs.com/merger/java/supported-document-formats/
[5]: https://github.com/groupdocs-merger
[6]: https://apireference.groupdocs.com/merger/java
[7]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger
[8]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/OrientationOptions
[9]: https://purchase.groupdocs.com/temporary-license
[10]: https://forum.groupdocs.com/
[11]: https://blog.groupdocs.com/2022/03/19/annotate-word-documents-in-java/
[12]: https://blog.groupdocs.com/2022/03/30/edit-word-documents-in-java/
[13]: https://blog.groupdocs.com/2022/03/01/move-word-pages-using-java/
[14]: https://blog.groupdocs.com/2022/03/04/render-word-documents-as-minified-html-in-java/
