---
title: 'Create Charts in Word Documents using C#'
author: Muzammil Khan
date: 2021-10-31T11:50:18+00:00
summary: 'As a C# developer, you can insert various types of charts in Word documents programmatically. In this article, you will learn <strong>how to create charts in Word documents using C#</strong>.'
url: /2021/10/31/create-charts-in-word-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Charts in Word using CSharp'
  - 'Create Area Charts in CSharp'
  - 'Create Charts in CSharp'
  - 'Create Columns Charts CSharp'
  - 'Create Scatter Charts in CSharp'

---


{{< figure align=center src="images/create-charts-in-word-documents-using-csharp.jpg" alt="create-charts-in-word-documents-using-csharp">}}
 

As a C# developer, you can insert various types of charts in Word documents programmatically. It helps to graphically present your data and information. In this article, you will learn&nbsp;**how to create charts in Word documents using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Insert Charts in Word Documents][2]
  * [Create Columns Charts in Word Documents][3]
  * [Create Scatter Charts in Word Documents using C#][4]
  * [Insert Area Charts in Word Documents using C#][5]
  * [Insert Bubble Charts in Word Documents using C#][6]

## C# API to Insert Charts in Word Documents {#CSharp-API-to-Insert-Charts-in-Word-Documents}

For inserting charts in DOCX files, we will be using&nbsp;[Aspose.Words for .NET API][7]. It allows you to generate, modify, convert, render and print files without utilizing Microsoft Word directly within cross-platform applications. The API enables you to insert various [supported chart types][8] in Word documents programmatically. 

You can either&nbsp;[download][9]&nbsp;the DLL of the API or install it using&nbsp;[NuGet][10].

<pre class="wp-block-code"><code>Install-Package Aspose.Words</code></pre>

## Create Columns Charts in Word Documents {#Create-Columns-Charts-in-Word-Documents-using-CSharp}

You can create columns charts in Word documents programmatically by following the steps given below:

  * Firstly, create a new document using the&nbsp;[Document][11] class.
  * Now, create an instance of the [DocumentBuilder][12] class with the _Document_ class object.
  * Then, call the [DocumentBuilder.InsertChart()][13] method. Pass [ChartType][8] as _Column_, with _height_ and _width_ as input parameters.
  * Get results in the&nbsp;[Shape][14] class object.
  * Now, create an instance of the [Chart][15] class and assign [Shape.Chart][16] object to it. It provides access to the chart properties if this shape has a Chart.
  * Then, get chart series collection in [ChartSeriesCollection][17] object.
  * Create category names array.
  * Now, call the [ChartSeriesCollection.Add()][18] method to add chart series. Pass name, category array and values as input parameters. Repeat this step to add more series.
  * Finally, call the [Document.Save()][19] method with output file path to save the file.

The following&nbsp;code sample shows&nbsp;**how to create a columns chart in a Word document using C#**.

{{< gist conholdate-gists 090675aecde4edf12b5d0ca1a0e7c34a "CreateChartsInWord_CSharp_InsertColumnsChart.cs" >}}

{{< figure align=center src="images/Create-Columns-Charts-in-Word-Documents-using-CSharp-1024x1002.jpg" alt="Create Columns Charts in Word Documents using C#." caption="Create Columns Charts in Word Documents using C#">}}
 

## Create Scatter Charts in Word Documents using C# {#Create-Scatter-Charts-in-Word-Documents-using-CSharp}

You can insert scatter charts in your Word documents programmatically by following the steps mentioned earlier. However, you need to set ChartType.Scatter in [DocumentBuilder.InsertChart()][21] method.

The following&nbsp;code sample shows&nbsp;**how to create a scatter chart in a Word document using C#**.

{{< gist conholdate-gists 090675aecde4edf12b5d0ca1a0e7c34a "CreateChartsInWord_CSharp_InsertScatterChart.cs" >}}

{{< figure align=center src="images/Create-Scatter-Charts-in-Word-Documents-using-CSharp-1024x1000.jpg" alt="Create Scatter Charts in Word Documents using C#." caption="Create Scatter Charts in Word Documents using C#">}}
 

## Insert Area Charts in Word Documents using C# {#Insert-Area-Charts-in-Word-Documents-using-CSharp}

You can insert area charts in Word documents programmatically by following the steps mentioned earlier. However, you need to set ChartType.Area in [DocumentBuilder.InsertChart()][21] method.

The following&nbsp;code sample shows&nbsp;**how to create an area chart in a Word document using C#**.

{{< gist conholdate-gists 090675aecde4edf12b5d0ca1a0e7c34a "CreateChartsInWord_CSharp_InsertAreaChart.cs" >}}

{{< figure align=center src="images/Insert-Area-Charts-in-Word-Documents-using-CSharp-1024x998.jpg" alt="Insert Area Charts in Word Documents using C#." caption="Insert Area Charts in Word Documents using C#">}}
 

## Insert Bubble Charts in Word Documents using C# {#Insert-Bubble-Charts-in-Word-Documents-using-CSharp}

You can insert bubble charts in Word documents programmatically by following the steps mentioned earlier. However, you need to set ChartType.Bubble in [DocumentBuilder.InsertChart()][21] method.

The following&nbsp;code sample shows&nbsp;**how to create a bubble chart in a Word document using C#**.

{{< gist conholdate-gists 090675aecde4edf12b5d0ca1a0e7c34a "CreateChartsInWord_CSharp_InsertBubbleChart.cs" >}}

{{< figure align=center src="images/Insert-Bubble-Charts-in-Word-Documents-using-CSharp-1024x997.jpg" alt="Insert Bubble Charts in Word Documents using C#." caption="Insert Bubble Charts in Word Documents using C#">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][25].

## Conclusion

In this article, you have learned **how to create charts in Word documents using C#**. Particularly, you have learned how to create column, area, bubble, and scatter charts in Word documents programmatically. Similarly, you can create other types of charts. You can learn more about Aspose.Words for .NET API using the [documentation][26]. In case of any ambiguity, please feel free to contact us on the [forum][27].

## See Also

  * [Work with Table of Contents in Word Document C#][28]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/create-charts-in-word-documents-using-csharp.jpg
 [2]: #CSharp-API-to-Insert-Charts-in-Word-Documents
 [3]: #Create-Columns-Charts-in-Word-Documents-using-CSharp
 [4]: #Create-Scatter-Charts-in-Word-Documents-using-CSharp
 [5]: #Insert-Area-Charts-in-Word-Documents-using-CSharp
 [6]: #Insert-Bubble-Charts-in-Word-Documents-using-CSharp
 [7]: https://products.aspose.com/words/net/
 [8]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts/charttype
 [9]: https://downloads.aspose.com/words/net
 [10]: https://www.nuget.org/packages/aspose.words
 [11]: https://apireference.aspose.com/words/net/aspose.words/document
 [12]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder
 [13]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder/methods/insertchart
 [14]: https://apireference.aspose.com/words/net/aspose.words.drawing/shape
 [15]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts/chart
 [16]: https://apireference.aspose.com/words/net/aspose.words.drawing/shape/properties/chart
 [17]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts/chartseriescollection
 [18]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts.chartseriescollection/add/methods/3
 [19]: https://apireference.aspose.com/words/net/aspose.words.document/save/methods/2
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Create-Columns-Charts-in-Word-Documents-using-CSharp.jpg
 [21]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder/methods/write
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Create-Scatter-Charts-in-Word-Documents-using-CSharp.jpg
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Area-Charts-in-Word-Documents-using-CSharp.jpg
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Bubble-Charts-in-Word-Documents-using-CSharp.jpg
 [25]: https://purchase.groupdocs.com/temporary-license
 [26]: https://docs.aspose.com/words/net/
 [27]: https://forum.aspose.com/c/words/8
 [28]: https://blog.aspose.com/2021/03/02/work-with-table-of-contents-in-word-csharp/




