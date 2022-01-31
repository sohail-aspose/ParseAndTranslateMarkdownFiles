---
title: "Convertir des PDF en images à l'aide de C#"
author: Muzammil Khan
date: 2021-09-23T06:07:49+00:00
summary: "En tant que développeur C#, vous pouvez facilement convertir toutes les pages d'un fichier PDF en images PNG, JPG, TIFF ou BMP par programmation dans vos applications .NET. Dans cet article, vous apprendrez <strong>à convertir des PDF en images à l'aide de C#</strong> ."
url: /2021/09/23/convert-pdf-to-images-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API CSharp pour convertir des PDF en images"
  - "extraire l'image du PDF"
  - "PDF vers BMP"
  - "PDF à image"
  - "PDF à image" conversion
  - "PDF à JPG"
  - "PDF à PNG"
  - "PDF à TIFF"

---


{{< figure align=center src="images/convert-pdf-to-images-using-csharp.jpg" alt="Convertir des PDF en images à l'aide de C#">}}
 

Vous devrez peut-être partager les pages de documents PDF sous forme de fichiers image avec d'autres. En tant que développeur C#, vous pouvez facilement convertir des fichiers PDF en PNG, JPG, TIFF ou BMP par programmation dans vos applications .NET. Dans cet article, vous apprendrez **comment convertir un PDF en images à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# de conversion de PDF en image][2]
  * [Convertir des PDF en images PNG à l'aide de C#][3]
  * [Convertir des images PDF en images JPG à l'aide de C#][4]
  * [Conversion PDF en BMP en C#][5]
  * [Conversion PDF en TIFF en C#][6]
  * [Extraire des images de documents PDF à l'aide de C#][7]

## API C# de conversion de PDF en image {#PDF-to-Image-Conversion-CSharp-API}

Pour convertir [PDF][8] en images, j'utiliserai [Aspose.PDF pour .NET API][9]. Il s'agit d'une puissante API de gestion de fichiers PDF qui vous permet de manipuler des documents PDF à partir de vos applications .NET. Il vous permet de créer, modifier, convertir, rendre, sécuriser et imprimer des documents sans utiliser Adobe Acrobat.
Vous pouvez soit [télécharger][10] la DLL de l'API, soit l'installer à l'aide de [NuGet][11].
<pre class="wp-block-code"><code>Install-Package Aspose.Pdf</code></pre>
## Convertir des PDF en images PNG à l'aide de C# {#Convert-PDF-to-PNG-Images-using-CSharp}

Vous pouvez convertir des fichiers PDF en images PNG par programmation en suivant les étapes ci-dessous :
  * Créez une instance de la classe **_[Document][12]_** avec le chemin du fichier PDF d'entrée.
  * Parcourez toutes les pages du PDF à l'aide de la collection [**_Document.Pages_**][13] et procédez comme suit :
      * Créez une instance de la classe **_[Resolution][14]_** et définissez sa valeur.
      * Créez une instance de la classe [**_PngDevice_**][15] et transmettez les objets Width, Height et Resolution.
      * Appelez la méthode [**_Process(Page, String)_**][16] avec le numéro de page et le chemin de l'image PNG de sortie pour convertir la page en PNG.

L'exemple de code suivant montre comment convertir des pages PDF en images PNG à l'aide de C#.
```
// Ouvrir le document
Document pdfDocument = new Document("C:\\Files\\sample.pdf");

foreach (var page in pdfDocument.Pages)
{
    // Define Resolution
    Resolution resolution = new Resolution(300);

    // Create Png device with specified attributes
    // Width, Height, Resolution
    PngDevice PngDevice = new PngDevice(500, 700, resolution);

    // Convert a particular page and save the image to stream
    PngDevice.Process(pdfDocument.Pages[page.Number], "C:\\Files\\image" + page.Number + "_out" + ".Png");
}
```

{{< figure align=center src="images/Convert-PDF-to-PNG-Images-using-CSharp-1024x604.jpg" alt="Convertir des PDF en images PNG à l'aide de C#" caption="Convertir des PDF en images PNG à l'aide de C#">}}
 

La classe [Document][12] représente le document PDF. Il fournit plusieurs propriétés et méthodes pour exécuter diverses fonctionnalités. La collection [Document.Pages][13] est une collection de pages de document et la numérotation des pages commence à partir de 1 dans la collection. La classe [Resolution][14] définit la résolution de l'image. La classe [PngDevice][15] permet d'enregistrer des pages du document PDF dans des images PNG. Cette classe fournit les méthodes suivantes pour enregistrer des pages dans des images PNG :
  * [Traiter (page, chaîne)][16] — Performs some operation on the given page and saves results into the file at given path.
  * [Traiter (page, flux)][18] — Converts the page into PNG and saves it in the output stream.

## Convertir des images PDF en images JPG à l'aide de C# {#Convert-PDF-to-JPG-Images-using-CSharp}

Vous pouvez convertir des fichiers PDF en images JPG par programmation en suivant les étapes ci-dessous :
  * Créez une instance de la classe **_[Document][12]_** avec le chemin du fichier d'entrée.
  * Parcourez toutes les pages du PDF à l'aide de la collection [**_Document.Pages_**][13] et procédez comme suit :
      * Créez une instance de la classe **_[Resolution][14]_** et définissez sa valeur.
      * Créez une instance de la classe [**_JpegDevice_**][19] et transmettez les objets Width, Height et Resolution.
      * Appelez la méthode [**_Process(Page, String)_**][16] avec le numéro de page et le chemin de l'image JPG de sortie pour convertir la page en JPG.

L'exemple de code suivant montre comment convertir des pages PDF en images JPG à l'aide de C#.
```
// Ouvrir le document
Document pdfDocument = new Document("C:\\Files\\sample.pdf");

foreach (var page in pdfDocument.Pages)
{
    // Define Resolution
    Resolution resolution = new Resolution(300);
    
    // Create Jpeg device with specified attributes
    // Width, Height, Resolution
    JpegDevice JpegDevice = new JpegDevice(500, 700, resolution);

    // Convert a particular page and save the image to stream
    JpegDevice.Process(pdfDocument.Pages[page.Number], "C:\\Files\\image" + page.Number + "_out" + ".Jpg");
}
```

{{< figure align=center src="images/Convert-PDF-to-JPG-Images-using-CSharp-1024x605.jpg" alt="Convertir des images PDF en images JPG à l'aide de C#" caption="Convertir des images PDF en images JPG à l'aide de C#">}}
 

## Conversion PDF en BMP avec C# {#PDF-to-BMP-Conversion-using-CSharp}

Vous pouvez convertir des fichiers PDF en images BMP par programmation en suivant les étapes ci-dessous :
  * Créez une instance de la classe **_[Document][12]_** avec le chemin du fichier d'entrée.
  * Parcourez toutes les pages du PDF à l'aide de la collection [**_Document.Pages_**][13] et procédez comme suit :
      * Créez une instance de la classe _**[Resolution][14]**_ et définissez sa valeur.
      * Créez une instance de la classe [**_BmpDevice_**][21] et transmettez les objets Width, Height et Resolution.
      * Appelez la méthode [**_Process(Page, String)_**][16] avec le numéro de page et le chemin de l'image BMP de sortie pour convertir la page en BMP.

L'exemple de code suivant montre comment convertir des pages PDF en images BMP à l'aide de C#.
```
// Ouvrir le document
Document pdfDocument = new Document("C:\\Files\\sample.pdf");

foreach (var page in pdfDocument.Pages)
{
    // Define Resolution
    Resolution resolution = new Resolution(300);
    
    // Create PNG device with specified attributes
    // Width, Height, Resolution
    BmpDevice BmpDevice = new BmpDevice(500, 700, resolution);

    // Convert a particular page and save the image to stream
    BmpDevice.Process(pdfDocument.Pages[page.Number], "C:\\Files\\image" + page.Number + "_out" + ".bmp");
}
```

{{< figure align=center src="images/Convert-PDF-to-BMP-Images-using-CSharp-1024x603.jpg" alt="Conversion PDF en BMP avec C#" caption="Conversion PDF en BMP avec C#">}}
 

## Conversion PDF en TIFF avec C# {#PDF-to-TIFF-Conversion-using-CSharp}

Vous pouvez convertir des fichiers PDF en TIFF par programmation en suivant les étapes ci-dessous :
  * Créez une instance de la classe **_[Document][12]_** avec le chemin du fichier d'entrée.
  * Initialisez une instance de la classe **_[Resolution][14]_** et définissez sa valeur.
  * Créez une instance de la classe **_[TiffSettings][23]_**.
  * Définissez diverses propriétés telles que _Compression_, _Depth_, _Shape_ et _SkipBlankPages_, etc.
  * Créez une instance de la classe [**_TiffDevice_**][24] avec les objets **_Resolution_** et **_TiffSettings_**.
  * Appelez la méthode [**_Process(Document, String)_**][25] avec l'objet Document et le chemin du fichier TIFF de sortie pour convertir le document en TIFF.

L'exemple de code suivant montre comment convertir un fichier PDF en TIFF à l'aide de C#.
```
// Ouvrir le document
Document pdfDocument = new Document("C:\\Files\\sample.pdf");

// Définir la résolution
Resolution resolution = new Resolution(300);

// Créer un objet TiffSettings
TiffSettings tiffSettings = new TiffSettings
{
    Compression = CompressionType.None,
    Depth = ColorDepth.Default,
    Shape = ShapeType.Portrait,
    SkipBlankPages = false
};

// Créer un périphérique TIFF
TiffDevice tiffDevice = new TiffDevice(resolution, tiffSettings);

// Convertir une page particulière et enregistrer l'image à diffuser
tiffDevice.Process(pdfDocument, "C:\\Files\\AllPagesToTIFF_out.tif");
```

{{< figure align=center src="images/Convert-PDF-to-TIFF-Images-using-CSharp-1024x603.jpg" alt="Conversion PDF en TIFF avec C#" caption="Conversion PDF en TIFF avec C#">}}
 

La classe [TiffSettings][23] fournit plusieurs paramètres pour convertir un PDF en TIFF. Vous pouvez définir la luminosité, la compression, le type de coordonnées, la profondeur, les marges, la forme et les pages vides lors de la conversion de PDF en TIFF.
## Extraire des images de documents PDF à l'aide de C # {#Extract-Images-from-PDF-Documents-using-CSharp}

Vous pouvez extraire toutes les images de n'importe quel fichier PDF par programmation en suivant les étapes ci-dessous :
  * Créez une instance de la classe **_[Document][12]_** avec le chemin du fichier d'entrée.
  * Pour chaque page, créez une instance [XImage][27] pour chaque image de la collection [Page.Resources.Images][28].
  * Créez une instance de la classe [FileStream][29] avec le chemin du fichier image de sortie.
  * Appelez la méthode **_[Save()][30]_** avec l'objet FileStream pour enregistrer l'image
  * Enfin, fermez le _FileStream_ en utilisant la méthode Close().

L'exemple de code suivant montre comment extraire des images d'un document PDF à l'aide de C#.
```
// Ouvrir le document
Document pdfDocument = new Document("C:\\Files\\sample.pdf");

// Parcourir les pages en boucle
foreach (var page in pdfDocument.Pages)
{
    int imageCounter = 1;
    // Loop through all images
    foreach (XImage image in page.Resources.Images)
    {
        // Create file stream for image
        FileStream outputImage = new FileStream(String.Format("C:\\Files\\Page{0}_Image{1}.jpg", page.Number, imageCounter), FileMode.Create);

        // Save output image
        image.Save(outputImage);

        // Close stream
        outputImage.Close();

        imageCounter++;
    }
}
```

{{< figure align=center src="images/Extract-Images-from-PDF-Documents-using-CSharp-1024x604.jpg" alt="Extraire des images de documents PDF à l'aide de C #" caption="Extraire des images de documents PDF à l'aide de C#">}}
 

La classe [XImage][32] représente l'image X-Object. Il fournit plusieurs propriétés et méthodes pour travailler avec des images. La classe XImage fournit les méthodes suivantes pour enregistrer l'objet image :
  * [Enregistrer (flux)][30] — Saves image data into stream as JPEG image.
  * [Enregistrer (flux, format d'image)][33] — Saves image into stream with requested format.
  * La méthode [Save(Stream, Int32)][34] — Enregistre les données d'image dans le flux en tant qu'image JPEG avec la résolution spécifiée.
  * La méthode [Save(Stream, ImageFormat, Int32)][35] — Enregistre l'image dans le flux avec le format demandé et la résolution spécifiée.

La collection [Page.Resources.Images][28] représente la collection d'images pour la page spécifique.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][36].
## Conclusion

Dans cet article, vous avez appris **comment **convertir des pages de fichiers PDF en images** à l'aide de C#**. Vous avez également appris **comment convertir PDF en PNG, PDF en JPG, PDF en BMP et PDF en TIFF** par programmation. De plus, vous avez appris **comment extraire des images d'un fichier PDF à l'aide de C#**. L'API offre également des options de compression, la création et la manipulation de tableaux, des fonctions de graphique et d'image, une fonctionnalité étendue d'hyperliens, des tâches de tampon et de filigrane, des contrôles de sécurité étendus et une gestion personnalisée des polices. Vous pouvez en savoir plus sur Aspose.PDF pour l'API .NET en utilisant la [documentation][37]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][38].
## See Also

  * [Classer les documents PDF à l'aide de C#][39]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/convert-pdf-to-images-using-csharp.jpg
 [2]: #PDF-to-Image-Conversion-CSharp-API
 [3]: #Convert-PDF-to-PNG-Images-using-CSharp
 [4]: #Convert-PDF-to-JPG-Images-using-CSharp
 [5]: #PDF-to-BMP-Conversion-using-CSharp
 [6]: #PDF-to-TIFF-Conversion-using-CSharp
 [7]: #Extract-Images-from-PDF-Documents-using-CSharp
 [8]: https://docs.fileformat.com/pdf/
 [9]: https://products.aspose.com/pdf
 [10]: https://downloads.aspose.com/pdf/net
 [11]: https://www.nuget.org/packages/Aspose.PDF/
 [12]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf/document/properties/pages
 [14]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/resolution
 [15]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/pngdevice
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices.pagedevice/process/methods/1
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-PNG-Images-using-CSharp.jpg
 [18]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/pngdevice/methods/process
 [19]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/jpegdevice
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-JPG-Images-using-CSharp.jpg
 [21]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/bmpdevice
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-BMP-Images-using-CSharp.jpg
 [23]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/tiffsettings
 [24]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices/tiffdevice
 [25]: https://apireference.aspose.com/pdf/net/aspose.pdf.devices.documentdevice/process/methods/3
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-PDF-to-TIFF-Images-using-CSharp.jpg
 [27]: https://apireference.aspose.com/net/pdf/aspose.pdf/ximage
 [28]: https://apireference.aspose.com/pdf/net/aspose.pdf/resources/properties/images
 [29]: https://docs.microsoft.com/en-us/dotnet/api/system.io.filestream
 [30]: https://apireference.aspose.com/pdf/net/aspose.pdf/ximage/methods/save
 [31]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Extract-Images-from-PDF-Documents-using-CSharp.jpg
 [32]: https://apireference.aspose.com/pdf/net/aspose.pdf/ximage
 [33]: https://apireference.aspose.com/pdf/net/aspose.pdf.ximage/save/methods/1
 [34]: https://apireference.aspose.com/pdf/net/aspose.pdf.ximage/save/methods/3
 [35]: https://apireference.aspose.com/pdf/net/aspose.pdf.ximage/save/methods/2
 [36]: https://purchase.aspose.com/temporary-license
 [37]: https://docs.aspose.com/pdf/net/
 [38]: https://forum.aspose.com/c/pdf/10
 [39]: https://blog.conholdate.com/2021/07/01/classify-pdf-documents-using-csharp/





