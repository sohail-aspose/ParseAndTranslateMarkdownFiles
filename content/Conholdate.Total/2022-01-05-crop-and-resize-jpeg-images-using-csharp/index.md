---
title: 'Crop and Resize JPEG Images using C#'
author: Muzammil Khan
date: 2022-01-05T15:09:32+00:00
summary: 'As a C# developer, you can easily crop and resize JPEG/ JPG images programmatically. In this article, you will learn <strong>how to crop and resize JPEG Images using C#</strong>.'
url: /2022/01/05/crop-and-resize-jpeg-images-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Crop Images in CSharp'
  - Image Cropping
  - Rectangle Cropping
  - 'Resize Images in CSharp'
  - Shift Cropping
---

{{< figure align=center src="images/crop-and-resize-jpeg-image-using-csharp-1.jpg" alt="Crop and Resize JPEG Image using C#">}}

[JPEG or JPG][2] is one of the most commonly used image formats to store images and photos. In certain cases, we might need to crop or rotate images for various reasons. In this article, we will learn how to crop and resize JPEG images using C#.

The following topics shall be covered in this article:

  * [C# Image API to Crop and Resize JPEG][3]
  * [Crop JPEG Images using C#][4]
  * [Crop Images to a Specific Size][5]
  * [Resize JPEG Images in C#][6]
  * [Resize JPEG Images Proportionally][7]

## C# Imaging API to Crop and Resize JPEG {#CSharp-Imaging-API-to-Crop-and-Resize-JPEG}

For cropping and resizing images, we will be using[Aspose.Imaging for .NET][8]API. It enables us to create, load, manipulate, convert, and compress images or photos programmatically. Please either[download][9]the DLL of the API or install it using[NuGet][10].

```
PM> Install-Package Aspose.Imaging
```

## Crop JPEG Images using C# {#Crop-JPEG-Images-using-CSharp}

We can easily crop any JPEG/JPG image from all sides towards the center of the image. For this purpose, the _RasterImage_ classprovides the _Crop(Int32, Int32, Int32, Int32)_ method that crops the image with specified shift values. It takes left, right, top, and bottom shift values as arguments to crop the image boundaries. We can crop the images using the crop by shift approach by following the steps given below:

  1. Firstly, load the input JPG image using the **[RasterImage][11]** class.
  2. Next, cache the image using the **[CacheData][12]** method.
  3. After that, call the **[Crop()][13]** method with the shift values as arguments.
  4. Finally, call the **[Save()][14]** method with the output file path as an argument to save the cropped image file.

The following code sample shows **how to crop a JPEG image using C#**.

{{< gist conholdate-gists db16de7a770e0ad02ce9a418a6bee38e "CropResizeJPEG_CSharp_CropByShift.cs" >}}

{{< figure align=center src="images/Crop-JPEG-Images-using-CSharp-1024x467.jpg" alt="Crop JPEG Images using C#" caption="Crop JPEG Images using C#.">}}
 

## Crop Images to Specific Size using C# {#Crop-Images-to-Specific-Size-using-CSharp}

The _RasterImage_ class also provides an overloaded _Crop(Rectangle)_ method that crops a particular area of an image to a specified size. It takes an instance of the _[Rectangle][16]_ class as an argument. We can crop images to a specified size by following the steps given below:

1. Firstly, load the input JPG image using the [RasterImage](https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage) class.
2. Next, cache the image using the [CacheData](https://apireference.aspose.com/imaging/net/aspose.imaging/datastreamsupporter/methods/cachedata) method.
3. Then, initialize the Rectangle class object with specified location and size.
4. After that, call the [Crop()](https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage/methods/crop) method with the created Rectangle object as an argument.
5. Finally, call the [Save()](https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3) method with the output file path as an argument to savethe cropped image file.

The following code sample shows **how to crop a JPEG image to a specific size using C#**.

{{< gist conholdate-gists db16de7a770e0ad02ce9a418a6bee38e "CropResizeJPEG_CSharp_CropByRectangle.cs" >}}

{{< figure align=center src="images/Crop-Image-in-Specific-Size-using-CSharp-1024x431.jpg" alt="Crop Image in Specific Size using C#." caption="Crop Image to Specific Size using C#.">}}
 
  	
## Resize JPEG Images in C# {#Resize-JPEG-Images-in-CSharp}

The _[Image][18]_ class provides the _Resize()_ method to resize the images. We can resize JPEG images by following the steps given below:

1. Firstly, load the input JPG image using the [Image](https://apireference.aspose.com/imaging/net/aspose.imaging/image) class.
2. Next, call the [Resize(int32, int32)](https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resize) method with the required width and height as arguments.
3. Finally, call the [Save()](https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3) method with the output file path as an argument to save the resized image.

The following code sample shows **how to resize a JPEG image using C#**.

{{< gist conholdate-gists db16de7a770e0ad02ce9a418a6bee38e "CropResizeJPEG_CSharp_Resize.cs" >}}

{{< figure align=center src="images/Resize-JPEG-Images-in-CSharp-1024x460.jpg" alt="Resize JPEG Images in C#" caption="Resize JPEG Images in C#.">}}


## Resize JPEG Images Proportionally in C# {#Resize-JPEG-Images-Proportionally-in-CSharp}

We may get stretched images when we resize with fixed height and width. We can use proportional resizing to avoid stretched images. For this purpose, the _[Image][18]_ class provides [_ResizeWidthProportionally(Int32)_][20] and [_ResizeHeightProportionally(Int32)_][21] methods. Please follow the steps given below to resize an image proportionally to width and height.

1. Firstly, load the input JPG image using the [Image](https://apireference.aspose.com/imaging/net/aspose.imaging/image) class.
2. Next, call the [Image.ResizeWidthProportionally(Int32)](https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resizewidthproportionally) method with new width as arguments.
3. After that, call the [Image.ResizeHeightProportionally(Int32)](https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resizeheightproportionally) method with new height as arguments.
4. Finally, call the [Save()](https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3) method with the output file path as an argument to save the resized image.

The following code sample shows **how to resize a JPEG image proportionally using C#**.

{{< gist conholdate-gists db16de7a770e0ad02ce9a418a6bee38e "CropResizeJPEG_CSharp_ResizeProportionally.cs" >}}

## Get a Free License

Please try the API without evaluation limitations by requesting [a free temporary license][22].

## Conclusion

In this article, we have learned how to:

  * crop JPEG images in C#;
  * crop an image to a specific size;
  * resize JPEG images programmatically;
  * resize JPEG images proportionally.

Besides, you can learn more about Aspose.Imaging for .NET API using the [documentation][23]. In case of any ambiguity, please feel free to contact us on the [forum][24].

## See Also

  * [Resize Images using C# .NET][25]
  * [Compress Images using C#][26]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2022/01/crop-and-resize-jpeg-image-using-csharp-1.jpg
 [2]: https://docs.fileformat.com/image/jpeg/
 [3]: #CSharp-Imaging-API-to-Crop-and-Resize-JPEG
 [4]: #Crop-JPEG-Images-using-CSharp
 [5]: #Crop-Images-to-Specific-Size-using-CSharp
 [6]: #Resize-JPEG-Images-in-CSharp
 [7]: #Resize-JPEG-Images-Proportionally-in-CSharp
 [8]: https://products.aspose.com/imaging/net/
 [9]: https://downloads.aspose.com/imaging/net
 [10]: https://www.nuget.org/packages/aspose.imaging
 [11]: https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage
 [12]: https://apireference.aspose.com/imaging/net/aspose.imaging/datastreamsupporter/methods/cachedata
 [13]: https://apireference.aspose.com/imaging/net/aspose.imaging.rasterimage/crop/methods/1
 [14]: https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2022/01/Crop-JPEG-Images-using-CSharp.jpg
 [16]: https://apireference.aspose.com/imaging/net/aspose.imaging/rectangle
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2022/01/Crop-Image-in-Specific-Size-using-CSharp.jpg
 [18]: https://apireference.aspose.com/imaging/net/aspose.imaging/image
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2022/01/Resize-JPEG-Images-in-CSharp.jpg
 [20]: https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resizewidthproportionally
 [21]: https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resizeheightproportionally
 [22]: https://purchase.conholdate.com/temporary-license
 [23]: https://docs.aspose.com/imaging/net
 [24]: https://forum.aspose.com/c/imaging
 [25]: https://blog.aspose.com/2021/12/20/resize-images-in-csharp/
 [26]: https://blog.aspose.com/2020/11/27/compress-png-jpeg-and-tiff-images-using-csharp/
