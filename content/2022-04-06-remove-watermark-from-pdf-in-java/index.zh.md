---
title: "用Java从PDF文档中删除水印"
date: Wed, 06 Apr 2022 14:14:00 +0000
draft: false
url: /zh/2022/04/06/remove-watermark-from-pdf-in-java/
author: 'Shoaib Khan'
summary: "水印主要用于作为草稿提及的文件，并避免任何非法使用机密文件。当草稿定稿或保密结束时，您可以从此类文档中删除水印。水印可以是文本或基于图像的。在本文中，我们将了解**如何使用 Java 去除 PDF 文档中的水印**。"
tags: ['delete watermark', 'how to remove watermark in java', 'remove watermark', 'remove watermark from pdf', 'Watermark Remover', 'watermark remover application']
categories: ['GroupDocs.Watermark Product Family']
---

水印主要用于作为草稿提及的文件，并避免任何非法使用机密文件。当草稿定稿或保密结束时，您可以从此类文档中删除水印。水印可以是文本或基于图像的。在本文中，我们将了解**如何使用 Java 去除 PDF 文档中的水印**。

{{< figure align=center src="images/removing-watermark-from-pdf.jpg" alt="以编程方式从 PDF 文件中删除水印。">}}

## 用于删除 PDF 水印的 Java API

[GroupDocs.Watermark][1] 提供 Java API 来处理不同[文件格式][2] 的文档和图像中的水印。如果您正在制作水印去除应用程序，它为您提供了一些有用的方法：

- 从 PDF 文档中删除所有水印
- 去除超链接水印
- 删除具有特定文本格式的水印

让我们了解 Java 开发人员如何使用 [GroupDocs.Watermark for Java][3] API 以不同方式从 PDF 中删除水印。首先，下载并使用您的应用程序配置 API。

### 下载或配置

您可以从 [downloads][4] 部分下载 JAR 文件，或者在您的 Java 应用程序中使用最新的存储库和依赖项 [Maven][5] 配置。

```
<repository>
	<id>GroupDocsJavaAPI</id>
	<name>GroupDocs Java API</name>
	<url>https://repository.groupdocs.com/repo/</url>
</repository>
<dependency>
        <groupId>com.groupdocs</groupId>
        <artifactId>groupdocs-watermark</artifactId>
        <version>21.3</version> 
</dependency>
```

## 用Java从PDF文件中删除所有水印

API 使您能够轻松找到并删除文档中的特定水印和所有水印。以下步骤展示了如何从 Java 中的 PDF 文档中删除所有水印。

- 使用 [Watermarker][6] 加载 PDF 文档。
- 使用搜索将所有 [可能的水印][7] 作为集合获取。
- 遍历整个集合并删除每个水印或符合标准的水印。
- 保存没有水印的更新PDF。

以下 Java 代码从 PDF 文档中删除所有水印。

```
// 从 Java 中的 PDF 和其他文档中删除水印
Watermarker watermarker = new Watermarker("filepath/document-with-watermarks.pdf");

PossibleWatermarkCollection possibleWatermarks = watermarker.search();
for (int i = 0 ; i < watermarks.getCount(); i++)
{
    // Remove every watermark by mentioning the index within the document.
    possibleWatermarks.removeAt(i);
}
watermarker.save("filepath/no-watermarks.pdf");
watermarker.close();
```

## 在 Java 中删除超链接水印

水印 API 允许从 PDF 文档中搜索和删除超链接。以下步骤允许从 Java 应用程序中的 PDF 文档中删除超链接水印。

- 使用 [Watermarker][6] 加载 PDF 文件。
- 使用搜索获取 [可能的水印][7] 作为集合。
- 遍历集合并删除符合标准的水印。
- 保存更新后的 PDF，上面不再有水印。

以下 Java 代码示例展示了如何从 PDF 文档中查找和删除具有特定 URL 的超链接水印。

```
// 用Java从PDF中删除超链接水印
Watermarker watermarker = new Watermarker("path/watermark-document.pdf");

PossibleWatermarkCollection watermarks = watermarker.search(new TextSearchCriteria(Pattern.compile("someurl.com")));
for (int i = 0 ; i < watermarks.getCount(); i++)
{
    if (HyperlinkPossibleWatermark.class.isInstance(watermarks.get_Item(i)))
    {
        System.out.println(watermarks.get_Item(i).getText());
        watermarks.removeAt(i);
    }
}
watermarker.save("path/no-hyperlink-watermarks.pdf");
```

## 使用 Java 中的特定文本格式从 PDF 中删除水印

也可以去除具有特定文本格式的水印。您可以提供字体名称、大小、颜色等作为搜索条件。 API 将找到具有匹配属性的水印。以下步骤演示了如何在 Java 中搜索和删除具有特定文本格式的 PDF 文件中的水印。

- 使用 [Watermarker][6] 加载 PDF 文件。
- 使用 [TextFormattingSearchCriteria][8] 设置搜索条件。
- 提供所有必需的格式属性。
- 通过提供定义的标准，搜索并获取所有 [可能的水印][7] 作为一个集合。
- 使用 **clear()** 方法删除所有搜索到的水印。
- 使用定义的属性保存没有水印的更新 PDF。

以下 Java 代码删除具有指定文本格式的 PDF 文档中的水印。

```
// 从 Java 中的 PDF 中删除具有特定文本格式的水印
Watermarker watermarker = new Watermarker("path/watermarks.pdf");

TextFormattingSearchCriteria criteria = new TextFormattingSearchCriteria();
criteria.setForegroundColorRange(new ColorRange());
criteria.getForegroundColorRange().setMinHue(-5);
criteria.getForegroundColorRange().setMaxHue(10);
criteria.getForegroundColorRange().setMinBrightness(0.01f);
criteria.getForegroundColorRange().setMaxBrightness(0.99f);
criteria.setBackgroundColorRange(new ColorRange());
criteria.getBackgroundColorRange().setEmpty(true);
criteria.setFontName("Arial");
criteria.setMinFontSize(19);
criteria.setMaxFontSize(42);
criteria.setFontBold(true);

PossibleWatermarkCollection watermarks = watermarker.search(criteria);
watermarks.clear();
watermarker.save("path/removed-watermarks.pdf");
watermarker.close();
```

## 结论
综上所述，我们学习了在 Java 中从 PDF 文档中删除不同水印的方法。我们专门删除了所有应用的水印，然后删除了超链接水印和具有特定文本格式的水印。尝试构建您自己的 Java 应用程序来查找和删除 PDF 文档中的水印。此外，您可以从其[文档][9] 中了解有关 [GroupDocs.Watermark for Java][3] 的更多信息。如有疑问，请通过 [论坛][10] 联系我们。

## 也可以看看

- [Java 中的水印密码保护文档][11]
- [Java 水印 Excel 表格][12]
- [用Java为PDF文件添加水印][13]
- [使用Java的水印演示幻灯片][14]
- [在Java文档中查找和删除水印][15]

[1]: https://products.groupdocs.com/watermark
[2]: https://docs.groupdocs.com/conversion/java/supported-document-formats/
[3]: https://products.groupdocs.com/watermark/java/
[4]: https://downloads.groupdocs.com/watermark
[5]: https://repository.groupdocs.com/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs
[6]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker
[7]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/PossibleWatermarkCollection
[8]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/TextFormattingSearchCriteria
[9]: https://docs.groupdocs.com/watermark/java/
[10]: https://forum.groupdocs.com/
[11]: https://blog.groupdocs.com/2021/11/26/watermark-password-protected-documents-in-java/
[12]: https://blog.groupdocs.com/2021/11/10/watermark-excel-sheets-in-java/
[13]: https://blog.groupdocs.com/2021/06/26/add-watermark-to-pdf-in-java/
[14]: https://blog.groupdocs.com/2021/06/09/watermark-presentation-slides-using-java/
[15]: https://blog.groupdocs.com/2020/11/30/find-and-remove-watermarks-from-documents-in-java/
