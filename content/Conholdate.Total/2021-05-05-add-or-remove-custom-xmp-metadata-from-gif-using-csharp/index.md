---
title: 'Add or Remove Custom XMP Metadata from GIF using C#'
author: Muzammil Khan
date: 2021-05-05T10:37:17+00:00
summary: 'You can add a custom XMP metadata package to your images programmatically. In this article, you will learn <strong>how to add or remove custom XMP metadata from GIF using C#</strong>. '
url: /2021/05/05/add-or-remove-custom-xmp-metadata-from-gif-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'Add Custom XMP Metadata CSharp'
  - Custom XMP Metadata to GIF
  - 'Read Custom XMP Metadata CSharp'
  - 'Remove Custom XMP Metadata CSharp'

---


{{< figure align=center src="images/GIF-SMP.png" alt="Add or Remove Custom XMP Metadata from GIF using C#">}}
 

The Extensible Metadata Platform (XMP) metadata is encoded as XML-formatted text. The defined XMP data model can be used to store any set of metadata properties in the form of name/value pair. You can add a custom XMP metadata package to your images programmatically. In this article, you will learn **how to add or remove custom XMP metadata from GIF using C#**.

The following topics are discussed/covered in this article:

  * [C# API for Adding or Removing XMP Metadata][2]
  * [Add Custom XMP Metadata Package to GIF using C#][3]
  * [Read Custom XMP Metadata Package Properties using C#][4]
  * [Remove Custom XMP Metadata Package using C#][5]

## C# API for Adding or Removing XMP Metadata {#api-for-XMP-metadata}

I will be using&nbsp;[GroupDocs.Metadata for .NET][6]&nbsp;API for adding or removing custom XMP metadata package. It allows you to add, edit, retrieve, and remove metadata properties from documents and image file formats. The API works with the most notable metadata standards such as built-in, XMP, EXIF, IPTC, Image Resource Blocks, ID3, and custom metadata properties.&nbsp;It can be used to develop applications in any development environment that targets the .NET platform.

You can either&nbsp;[download][7]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][8].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Metadata</code></pre>

## Add Custom XMP Metadata Package to GIF using C# {#Add-Custom-XMP-Package}

You can easily create and add a fully custom XMP package containing user-defined properties by following the simple steps mentioned below:

  * Create an instance of the&nbsp;_[Metadata][9]_ class
  * Provide path of the GIF image
  * [GetRootPackage][10] as [IXmp][11] standard
  * Create an instance of [XmpPackage][12] class
  * Provide package Prefix and NamespaceUri
  * Set properties in Name/ Value pair using [Set][13] method
  * Create an instance of [XmpPacketWrapper][14] class
  * Call the [AddPackage][15] method and pass created XmpPackage
  * Assign created XmpPacketWrapper to IXMp.[XmpPackage][16]
  * Save the output file using the [Metadata.Save][17] method

The following code sample shows how to create and add a custom XMP metadata package to GIF image using C#.

{{< gist conholdate-gists 6bd852947d2f5216d6a1311d2aef876e "CustomXMPMetadata_csharp_Add.cs" >}}

The above code sample shall add the XMP metadata package to input image. <mark>The ExifTool read the following metadata from the generated output GIF image.</mark>

{{< figure align=center src="images/Add_XMP_Metadata_csharp-1024x594.jpg" alt="Add XMP Metadata Package to GIF using C#" caption="Add XMP Metadata Package to GIF using C#">}}
 

The [IXMP][11] interface exposes [XmpPackage][19]{.broken_link} property to gets or set the XMP metadata package.

The Metadata class provides [GetRootPackage][10] method to get the root package that provides access to all metadata properties extracted from the file.

The [XmpPackage][12] class provides various properties to define the package such as [Prefix][20], [NamespaceUri][21], and [Keys][22]. This class also provides [Set][13] methods to set name/ value for user defined metadata properties.

The&nbsp;[XmpPacketWrapper][14]&nbsp;class contains serialized XMP package. The [AddPackage][15]&nbsp;method of this class allows to add the defined custom package.

You can find more details about “[Working with XMP Metadata][23]” in the documentation.

## Read Custom XMP Package Metadata Properties using C# {#Read-Custom-XMP-Package}

You can easily read all the custom XMP package user-defined properties by following the simple steps mentioned below:

  * Create an instance of the&nbsp;_[Metadata][9]_ class
  * Provide the path of the GIF image
  * [GetRootPackage][10] as [IXmp][11] standard
  * Get all packages one by one from [IXmp.XmpPackage.Packages][24]
  * Get NamespaceUri and Prefix for each package
  * Call [FindProperties][25] for each package Key to get property name and value

The following code sample shows how to read all the properties defined in the custom XMP package using C#.

{{< gist conholdate-gists 6bd852947d2f5216d6a1311d2aef876e "CustomXMPMetadata_csharp_Read.cs" >}}

The above code sample shall produce the following output:

<pre class="wp-block-code"><code>https:&#047;&#047;groupdocs.com
gd
gd:Copyright : Copyright (C) 2021 GroupDocs. All Rights Reserved.
gd:CreationDate : 04/05/2021 2:26:17 am
gd:Company : &lt;rdf:Seq&gt;&lt;rdf:li&gt;Aspose&lt;/rdf:li&gt;&lt;rdf:li&gt;GroupDocs&lt;/rdf:li&gt;&lt;/rdf:Seq&gt;
</code></pre>

The [FindProperties][25] method of the [XmpPackage][12] class recursively searches and finds the metadata properties satisfying the specified predicate.

## Remove Custom XMP Package using C# {#Remove-Custom-XMP-Package}

You can remove XMP package from GIF images by following the simple steps mentioned below:

  * Create an instance of the&nbsp;_[Metadata][9]_ class
  * Provide the path of the GIF image
  * [GetRootPackage][10] as [IXmp][11] standard
  * Set IXMp.[XmpPackage][16] to null
  * Save the output file using the [Metadata.Save][17] method

The following code sample shows how to remove XMP metadata package from GIF image using C#.

{{< gist conholdate-gists 6bd852947d2f5216d6a1311d2aef876e "CustomXMPMetadata_csharp_Remove.cs" >}}

The above code sample shall remove the XMP metadata package from input image. The ExifTool read the following metadata from the generated output GIF image.

{{< figure align=center src="images/Remove_XMP_Metadata_csharp-1024x488.jpg" alt="Remove XMP Metadata Package from GIF using C#" caption="Remove XMP Metadata Package from GIF using C#">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][27].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;add** **or remove custom XMP package metadata from GIF images using C#**. You also learned how to read XMP package properties using C#. Moreover, you can learn about GroupDocs.Metadata for .NET API using the&nbsp;[documentation][28]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][29].

## See Also

  * [Extract and Manipulate Metadata of Images using C#][30]
  * [Manage EXIF Data of JPEG, PNG, TIFF & WebP Images in C#][31]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/GIF-SMP.png
 [2]: #api-for-XMP-metadata
 [3]: #Add-Custom-XMP-Package
 [4]: #Read-Custom-XMP-Package
 [5]: #Remove-Custom-XMP-Package
 [6]: https://products.groupdocs.com/metadata/net
 [7]: https://downloads.groupdocs.com/metadata/net
 [8]: https://www.nuget.org/packages/GroupDocs.Metadata
 [9]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata/metadata
 [10]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata/metadata/methods/getrootpackage
 [11]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/ixmp
 [12]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppackage
 [13]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp.xmppackage/set/methods/7
 [14]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppacketwrapper
 [15]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppacketwrapper/methods/addpackage
 [16]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/ixmp/properties/xmppackage
 [17]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.metadata/save/methods/2
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Add_XMP_Metadata_csharp.jpg
 [19]: http://XmpPackage
 [20]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppackage/properties/prefix
 [21]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppackage/properties/namespaceuri
 [22]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.common/metadatapackage/properties/keys
 [23]: https://docs.groupdocs.com/metadata/net/working-with-xmp-metadata/
 [24]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppacketwrapper/properties/packages
 [25]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.common/metadatapackage/methods/findproperties
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove_XMP_Metadata_csharp.jpg
 [27]: https://purchase.groupdocs.com/temporary-license
 [28]: https://docs.groupdocs.com/metadata/net/
 [29]: https://forum.groupdocs.com/c/metadata/
 [30]: https://blog.groupdocs.cloud/2021/04/20/extract-and-manipulate-metadata-of-images-using-csharp/
 [31]: https://blog.groupdocs.com/2020/05/13/manage-exif-data-in-csharp-net-for-jpeg-png-tiff-webp-images/




