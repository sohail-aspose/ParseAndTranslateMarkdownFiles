---
title: 'Annotate JPG Images using C#'
author: Muzammil Khan
date: 2021-07-13T18:03:57+00:00
summary: '. You can easily annotate your JPG images and add a wide range of graphic, text, and watermark annotations in your .NET applications. In this article, you will learn <strong>how to annotate JPG images using C#</strong>.'
url: /2021/07/13/annotate-jpg-images-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - Add Area Annotation using CSharp
  - Add TextFiled Annotation using CSharp
  - Add Watermark Annotation using CSharp
  - Annotate JPG Images
  - CSharp API to Annotate Images

---


{{< figure align=center src="images/annotate-jpg-images-using-csharp.jpg" alt="annotate jpg images using C#">}}
 

You can annotate images of popular image formats such as JPEG, PNG, TIFF programmatically. Annotations on the images provide additional information about an existing piece of data. You can add a wide range of graphic, text, and watermark annotations to images in your .NET applications. In this article, you will learn&nbsp;**how to annotate JPG images using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Annotate Images][2]
  * [Annotate JPG Images using C#][3]
  * [Add Area Annotation to JPG using C#][4]
  * [Add Text Field Annotation to JPG using C#][5]
  * [Annotate JPG Images with Watermark using C#][6]

## C# API to Annotate Images {#CSharp-API-to-Annotate-Images}

For annotating&nbsp;[JPG][7] images, I will be using [GroupDocs.Annotation for .NET][8] API. It allows to programmatically build document annotation applications in&nbsp;C#, ASP.NET, and other related .NET technologies. You can add popular annotation types such as area, point, text, ellipse, link, underline, polyline, arrow, distance, watermark, image,&nbsp;etc to your documents of all popular formats. The API also enables you to export documents after adding annotations, comments, or highlighted notes back to their original format.

You can either&nbsp;[download][9]&nbsp;the DLL of the API or install it using [NuGet][10].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Annotation</code></pre>

## Annotate JPG Images using C# {#Annotate-JPG-Images}

You can add multiple annotations to annotate your JPG images by following the steps given below:.

  * Create an instance of the&nbsp;_**[Annotator][11]**_ class
  * Provide the input file path
  * Create an instance of the&nbsp;[_**ArrowAnnotation**_][12] class
  * Set various properties for _ArrowAnnotation_ such as Color, Opacity, Style etc.
  * Add _ArrowAnnotation_ to Annotations List
  * Create an instance of the&nbsp;[_**DistanceAnnotation**_][13] class
  * Set various properties for _DistanceAnnotation_ such as Color, Opacity, Style etc.
  * Add _DistanceAnnotation_ to Annotations List
  * Create an instance of&nbsp;the [_**EllipseAnnotation**_][14] class
  * Set various properties for _EllipseAnnotation_ such as Color, Opacity, Style etc.
  * Add _EllipseAnnotation_ to Annotations List
  * Create an instance of&nbsp;the [_**PointAnnotation**_][15] class
  * Set various properties for _PointAnnotation_ such as box size and location
  * Add _PointAnnotation_ to Annotations List
  * Call the [_Add()_][16] method to add annotations to the Annotator
  * Call the&nbsp;_[Save()][17]_&nbsp;method and save the resultant file

The following&nbsp;code sample shows&nbsp;**how to annotate a JPG image using C#**.

{{< gist conholdate-gists 3f9f4ce84f48bc30ea9a386acd3db181 "AnnotateJPG_CSharp_AddMultiple.cs" >}}

{{< figure align=center src="images/Add-Multiple-Annotations-to-JPG-Images-1024x572.jpg" alt="Annotate JPG Images using C#" caption="Annotate JPG Images using C#">}}
 

The [Annotator][11] class is the main class that controls the document annotating process. It provides various methods to add, update or remove annotations. The [Save()][17] method of this class saves the annotated file at the given path.

The API provides various specific classes to define various types of annotations such as:

  * The ArrowAnnotation class provides properties to define arrow annotation
  * The DistanceAnnotation class facilities to define distance annotation
  * The EllipseAnnotation class can be used to define an Ellipse annotation
  * The PointAnnotation class provides properties to define a point annotation

## Add Area Annotation to JPG using C# {#Add-Area-Annotation-to-JPG-using-CSharp}

You can add area annotation to your JPG images programmatically by following the steps given below:.

  * Create an instance of the&nbsp;_**[Annotator][11]**_ class
  * Provide the input file path
  * Create an instance of the [_**AreaAnnotation**_][19] class
  * Set various properties for _AreaAnnotation_ such as Position, Color, Message, Opacity, Style etc.
  * Call the [_Add()_][20] method to add _AreaAnnotation_ to the Annotator
  * Call the&nbsp;_[Save()][17]_&nbsp;method and save the resultant file

The following&nbsp;code sample shows&nbsp;**how to add area annotation to a JPG image using C#**.

{{< gist conholdate-gists 3f9f4ce84f48bc30ea9a386acd3db181 "AnnotateJPG_CSharp_AddArea.cs" >}}

{{< figure align=center src="images/Add-Area-Annotation-to-JPG-1024x653.jpg" alt="Add Area Annotation to JPG using C#" caption="Add Area Annotation to JPG using C#">}}
 

## Add Text Field Annotation to JPG using C# {#Add-Text-Field-Annotation-to-JPG-using-CSharp}

You can add text field annotation to your JPG images by following the steps given below:.

  * Create an instance of the&nbsp;_**[Annotator][11]**_ class
  * Provide the input file path
  * Create an instance of the&nbsp;[_**TextFieldAnnotation**_][22] class
  * Set various properties for _TextFieldAnnotation_ such as Text, Color, Opacity, Style, Font, etc.
  * Call the [_Add()_][20] method to add _TextFieldAnnotation_ to the Annotator
  * Call the&nbsp;_[Save()][17]_&nbsp;method and save the resultant file

The following&nbsp;code sample shows&nbsp;**how to add text field annotation to a JPG image using C#**.

{{< gist conholdate-gists 3f9f4ce84f48bc30ea9a386acd3db181 "AnnotateJPG_CSharp_AddText.cs" >}}

{{< figure align=center src="images/Add-Text-Field-Annotation-to-JPG-1024x653.jpg" alt="Add Text Field Annotation to JPG using C#" caption="Add Text Field Annotation to JPG using C#">}}
 

## Annotation JPG Images with Watermark using C# {#Annotation-JPG-Images-with-Watermark-using-CSharp}

You can annotate your JPG images with watermark text by following the steps given below:.

  * Create an instance of the&nbsp;_**[Annotator][11]**_ class
  * Provide the input file path
  * Create an instance of&nbsp;[_**WatermarkAnnotation**_][24] class
  * Set various properties for _WatermarkAnnotation_ such as Text, Color, Font Size, Alignment, etc.
  * Call the [_Add()_][20] method to add WatermarkAnnotation to the Annotator
  * Call the&nbsp;_[Save()][17]_&nbsp;method and save the resultant file

The following&nbsp;code sample shows&nbsp;**how to annotate a JPG image with watermark text using C#**.

{{< gist conholdate-gists 3f9f4ce84f48bc30ea9a386acd3db181 "AnnotateJPG_CSharp_AddWatermark.cs" >}}

{{< figure align=center src="images/Annotation-JPG-Images-with-Watermark-1024x648.jpg" alt="Annotation Images with Watermark " caption="Annotation JPG Images with Watermark using C#">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][26].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;annotate JPG images using&nbsp;C#**. You have also learned&nbsp;**how to add multiple annotations to JPG images**. Moreover, you have learned&nbsp;**how to add area, text field, and watermark annotations to the JPG images**&nbsp;programmatically in C#. You can learn more about GroupDocs.Annotation for .NET API using the [documentation][27]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][28].

## See Also

  * [Add or Remove Annotations or Markup Word files using C#][29]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/annotate-jpg-images-using-csharp.jpg
 [2]: #CSharp-API-to-Annotate-Images
 [3]: #Annotate-JPG-Images
 [4]: #Add-Area-Annotation-to-JPG-using-CSharp
 [5]: #Add-Text-Field-Annotation-to-JPG-using-CSharp
 [6]: #Annotation-JPG-Images-with-Watermark-using-CSharp
 [7]: https://docs.fileformat.com/image/jpeg/
 [8]: https://products.groupdocs.com/annotation/net/
 [9]: https://downloads.groupdocs.com/annotation/net
 [10]: https://www.nuget.org/packages/GroupDocs.Annotation
 [11]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation/annotator
 [12]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/arrowannotation
 [13]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/distanceannotation
 [14]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/ellipseannotation
 [15]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/pointannotation
 [16]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.annotator/add/methods/1
 [17]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.annotator/save/methods/4
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Add-Multiple-Annotations-to-JPG-Images.jpg
 [19]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/areaannotation
 [20]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation/annotator/methods/add
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Add-Area-Annotation-to-JPG.jpg
 [22]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/textfieldannotation
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Add-Text-Field-Annotation-to-JPG.jpg
 [24]: https://apireference.groupdocs.com/annotation/net/groupdocs.annotation.models.annotationmodels/watermarkannotation
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Annotation-JPG-Images-with-Watermark.jpg
 [26]: https://purchase.groupdocs.com/temporary-license
 [27]: https://docs.groupdocs.com/annotation/net/
 [28]: https://forum.groupdocs.com/c/annotation/
 [29]: https://blog.groupdocs.com/2021/06/23/annotate-word-documents-using-csharp/




