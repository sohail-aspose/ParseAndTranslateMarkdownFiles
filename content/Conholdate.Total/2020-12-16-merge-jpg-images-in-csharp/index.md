---
title: 'Merge JPG Images in C# – .NET Imaging API'
author: Muhammad Sohail
date: 2020-12-16T08:15:30+00:00
summary: 'Sometimes we have a need to create an image by combining several JPG images together. This article explains how to do this in C#.'
url: /2020/12/16/merge-jpg-images-in-csharp/
categories:
  - Conholdate.Total Product Family

---
Sometimes we have a need to create an image by combining several JPG images together. This article explains how to do this in C#.

  * [C# Imaging API – Free Download][1]
  * [Combine JPG Images Horizontally in C#][2]
  * [Combine JPG Images Vertically in C#][3]
  * [Combine JPG Images into PDF in C#][4]
  * [Combine JPG Images into PNG in C#][5]

## C# Imaging API – Free Download {#CSharp-Imaging-API}

[Aspose.Imaging for .NET][6] provides a number of flexible routines for creating and manipulating images within .NET applications. It lets you combine JPG files in a few lines of code. You can either get it installed within your .NET application using [NuGet][7] or [download][8] API’s DLL.

<pre class="wp-block-code"><code>Install-Package Aspose.Imaging</code></pre>

## Merge JPG Images Horizontally in C# {#Merge-JPG-Images-Horizontally}

The following are the steps to merge JPEG images horizontally in C#.

  * Create an array of JPEG images you want to merge.
  * Compute the width of the resulting image by adding the width of all images in the array and height by finding the maximum height of an image in the array. 
  * Create a new image using [JpegImage][9] class and set its width and height to the one computed in the last step.
  * Iterate over the array of images (you want to merge) and perform the following tasks on each image:
      * Load pixels of an image using [LoadArgb32Pixels][10] method and save them in the resulting image using [SaveArgb32Pixels][11] method. This method also takes a [Rectangle][12] object as an argument that defines the position of an image in the resulting image.
  * Save the resulting image as a JPEG image.

The following code sample shows how to join JPEG images horizontally in C#.

{{< gist sohail-aspose 9d8e34cf5e2d55b74d6ecbb6b4c6fac5 "mergeJPEGImagesHorizontally.cs" >}}

**Input Images**

{{< figure align=center src="images/Image1.jpeg" alt="" caption="First Image">}}
 

{{< figure align=center src="images/Image2.jpg" alt="" caption="Second Image">}}
 

**Output Image**

{{< figure align=center src="images/MergeImages_Horizontally-1024x470.jpg" alt="" caption="Horizontally Merged Image">}}
 

## Merge JPG Images Vertically in C# {#Merge-JPG-Images-Vertically}

The steps to merge JPEG images vertically are same as above. A little difference is that we compute the height of the resulting image by adding the height of all images in the array and width by finding the maximum width of an image in the array. The following code sample shows how to join JPEG images vertically in C#.

{{< gist sohail-aspose 2d46d079a283dc028ed2eae270ac6e75 "mergeJPEGImagesVertically.cs" >}}

{{< figure align=center src="images/MergeImages_Vertically-709x1024.jpg" alt="" caption="Vertically Merged Image">}}
 

## Merge JPG Images into PDF in C# {#Merge-JPG-Images-into-PDF}

You may have a need to combine the JPEG images into PDF. You can do this by just making a minor change in the [Image.Save][17] method (use **.pdf** extension instead of **.jpg**).

{{< gist sohail-aspose 16bb7c779d008a782a2d905b9d48d969 "mergeJPEGImagesAndSaveAsPDF.cs" >}}

## Merge JPG Images into PNG in C# {#Merge-JPG-Images-into-PNG}

Similarly, you may want to combine the JPEG images into PNG. As shown above, you just need to use **.png** extension instead of **.jpg** in the [Image.Save][17] method.

{{< gist sohail-aspose b076d3dc992b261c228f2f02a758f638 "mergeJPEGImagesAndSaveAsPNG.cs" >}}

## Conclusion

In this article, you learnt how to join JPEG images in C#. You can either combine them horizontally or vertically. You also learnt how to save the merged image as PDF or PNG. For more information, please check the [documentation][18] of Aspose.Imaging for .NET. If you have any question, please feel free to contact us at [our Support Forum][19].

## See Also

  * [Compress PNG, JPEG, and TIFF Images using C#][20]
  * [Convert PNG, JPG to TGA or Manipulate TGA using C#][21]

 [1]: #CSharp-Imaging-API
 [2]: #Merge-JPG-Images-Horizontally
 [3]: #Merge-JPG-Images-Vertically
 [4]: #Merge-JPG-Images-into-PDF
 [5]: #Merge-JPG-Images-into-PNG
 [6]: https://products.aspose.com/imaging/net
 [7]: https://www.nuget.org/packages/Aspose.Imaging/
 [8]: https://downloads.aspose.com/imaging/net
 [9]: https://apireference.aspose.com/imaging/net/aspose.imaging.fileformats.jpeg/jpegimage
 [10]: https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage/methods/loadargb32pixels
 [11]: https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage/methods/saveargb32pixels
 [12]: https://apireference.aspose.com/imaging/net/aspose.imaging/rectangle
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Image1.jpeg
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Image2.jpg
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/MergeImages_Horizontally.jpg
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/MergeImages_Vertically.jpg
 [17]: https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3
 [18]: https://docs.aspose.com/imaging/net/
 [19]: https://forum.aspose.com/
 [20]: https://blog.aspose.com/2020/11/27/compress-png-jpeg-and-tiff-images-using-csharp/
 [21]: https://blog.aspose.com/2020/10/11/convert-png-jpg-to-tga-manipulaute-csharp/




