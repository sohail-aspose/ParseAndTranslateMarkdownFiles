---
title: "Fusionner des images JPG en C# – API d'imagerie .NET"
author: Muhammad Sohail
date: 2020-12-16T08:15:30+00:00
summary: "Parfois, nous avons besoin de créer une image en combinant plusieurs images JPG ensemble. Cet article explique comment procéder en C#."
url: /2020/12/16/merge-jpg-images-in-csharp/
categories:
  - "Conholdate.Total Famille de produits"

---
Parfois, nous avons besoin de créer une image en combinant plusieurs images JPG ensemble. Cet article explique comment procéder en C#.
  * [API d'imagerie C# - Téléchargement gratuit][1]
  * [Combiner des images JPG horizontalement en C #][2]
  * [Combiner des images JPG verticalement en C#][3]
  * [Combiner des images JPG en PDF en C#][4]
  * [Combiner des images JPG en PNG en C#][5]

## API d'imagerie C# - Téléchargement gratuit {#CSharp-Imaging-API}

[Aspose.Imaging pour .NET][6] fournit un certain nombre de routines flexibles pour créer et manipuler des images dans les applications .NET. Il vous permet de combiner des fichiers JPG en quelques lignes de code. Vous pouvez soit l'installer dans votre application .NET à l'aide de la DLL de l'API [NuGet][7] ou [download][8].
<pre class="wp-block-code"><code>Install-Package Aspose.Imaging</code></pre>
## Fusionner des images JPG horizontalement en C# {#Merge-JPG-Images-Horizontally}

Voici les étapes pour fusionner horizontalement des images JPEG en C#.
  * Créez un tableau d'images JPEG que vous souhaitez fusionner.
  * Calculez la largeur de l'image résultante en ajoutant la largeur de toutes les images du tableau et la hauteur en trouvant la hauteur maximale d'une image dans le tableau.
  * Créez une nouvelle image en utilisant la classe [JpegImage][9] et définissez sa largeur et sa hauteur sur celles calculées à la dernière étape.
  * Parcourez le tableau d'images (que vous souhaitez fusionner) et effectuez les tâches suivantes sur chaque image :
      * Chargez les pixels d'une image à l'aide de la méthode [LoadArgb32Pixels][10] et enregistrez-les dans l'image résultante à l'aide de la méthode [SaveArgb32Pixels][11]. Cette méthode prend également un objet [Rectangle][12] comme argument qui définit la position d'une image dans l'image résultante.
  * Enregistrez l'image résultante en tant qu'image JPEG.

L'exemple de code suivant montre comment joindre des images JPEG horizontalement en C#.
```
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using Aspose.Imaging;
using Aspose.Imaging.FileFormats.Jpeg;
using Aspose.Imaging.ImageOptions;
using Aspose.Imaging.Sources;

// Tableau d'images que vous souhaitez fusionner.
string[] imagePaths = { "Image1.jpeg", "Image2.jpg" };

// Nom du fichier de sortie/résultant.
string outputPath = "MergeImages_Horizontally.jpg";

// Obtenir la taille de l'image résultante.
List<Size> imageSizes = new List<Size>();
foreach (string imagePath in imagePaths)
{
    using (RasterImage image = (RasterImage)Image.Load(imagePath))
    {
        imageSizes.Add(image.Size);
    }
}

// Largeur et hauteur de l'image résultante
int newWidth = imageSizes.Sum(size => size.Width);
int newHeight = imageSizes.Max(size => size.Height);

// Fusionner des images en une seule.
Source tempFileSource = new FileCreateSource("temp.jpg", isTemporal: true);
JpegOptions options = new JpegOptions() { Source = tempFileSource, Quality = 100 };
using (JpegImage newImage = (JpegImage)Image.Create(options, newWidth, newHeight))
{
    int stitchedWidth = 0;
    foreach (string imagePath in imagePaths)
    {
        using (RasterImage image = (RasterImage)Image.Load(imagePath))
        {
            Rectangle bounds = new Rectangle(stitchedWidth, 0, image.Width, image.Height);
            newImage.SaveArgb32Pixels(bounds, image.LoadArgb32Pixels(image.Bounds));
            stitchedWidth += image.Width;
        }
    }

    newImage.Save(outputPath);
}
```

**Images d'entrée**
{{< figure align=center src="images/Image1.jpeg" alt="" légende="First Image">}}
 

{{< figure align=center src="images/Image2.jpg" alt="" légende="Second Image">}}
 

**Image de sortie**
{{< figure align=center src="images/MergeImages_Horizontally-1024x470.jpg" alt="" légende="Horizontally Merged Image">}}
 

## Fusionner des images JPG verticalement en C# {#Merge-JPG-Images-Vertically}

Les étapes pour fusionner verticalement des images JPEG sont les mêmes que ci-dessus. Une petite différence est que nous calculons la hauteur de l'image résultante en ajoutant la hauteur de toutes les images du tableau et la largeur en trouvant la largeur maximale d'une image dans le tableau. L'exemple de code suivant montre comment joindre verticalement des images JPEG en C#.
```
// Un tableau d'images que vous souhaitez fusionner
string[] imagePaths = { "Image1.jpeg", "Image2.jpg" };

string outputPath = "MergeImages_Vertically.jpg";

// Obtenir la taille de l'image résultante.
List<Size> imageSizes = new List<Size>();
foreach (string imagePath in imagePaths)
{
    using (RasterImage image = (RasterImage)Image.Load(imagePath))
    {
        imageSizes.Add(image.Size);
    }
}

// Largeur et hauteur de l'image résultante
int newWidth = imageSizes.Max(size => size.Width);
int newHeight = imageSizes.Sum(size => size.Height);

// Fusionner des images en une seule.
using (MemoryStream memoryStream = new MemoryStream())
{
    StreamSource outputStreamSource = new StreamSource(memoryStream);
    JpegOptions options = new JpegOptions() { Source = outputStreamSource, Quality = 100 };
    using (JpegImage newImage = (JpegImage)Image.Create(options, newWidth, newHeight))
    {
        int stitchedHeight = 0;
        foreach (string imagePath in imagePaths)
        {
            using (RasterImage image = (RasterImage)Image.Load(imagePath))
            {
                Rectangle bounds = new Rectangle(0, stitchedHeight, image.Width, image.Height);
                newImage.SaveArgb32Pixels(bounds, image.LoadArgb32Pixels(image.Bounds));
                stitchedHeight += image.Height;
            }
        }

        newImage.Save(outputPath);
    }
}
```

{{< figure align=center src="images/MergeImages_Vertically-709x1024.jpg" alt="" légende="Vertically Merged Image">}}
 

## Fusionner des images JPG en PDF en C# {#Merge-JPG-Images-into-PDF}

Vous devrez peut-être combiner les images JPEG en PDF. Vous pouvez le faire en apportant simplement une modification mineure à la méthode [Image.Save][17] (utilisez l'extension **.pdf** au lieu de **.jpg**).
```
// Un tableau d'images que vous souhaitez fusionner.
string[] imagePaths = { "Image1.jpeg", "Image2.jpg" };

string outputPath = "MergeHorizontalAsPDF";
string tempFilePath = "temp.jpg";

// Obtenir la taille de l'image résultante.
List<Size> imageSizes = new List<Size>();
foreach (string imagePath in imagePaths)
{
    using (RasterImage image = (RasterImage)Image.Load(imagePath))
    {
        imageSizes.Add(image.Size);
    }
}

// Largeur et hauteur de l'image résultante.
int newWidth = imageSizes.Sum(size => size.Width);
int newHeight = imageSizes.Max(size => size.Height);

// Fusionner des images en une seule.
Source tempFileSource = new FileCreateSource(tempFilePath, isTemporal: true);
JpegOptions options = new JpegOptions() { Source = tempFileSource, Quality = 100 };
using (JpegImage newImage = (JpegImage)Image.Create(options, newWidth, newHeight))
{
    int stitchedWidth = 0;
    foreach (string imagePath in imagePaths)
    {
        using (RasterImage image = (RasterImage)Image.Load(imagePath))
        {
            Rectangle bounds = new Rectangle(stitchedWidth, 0, image.Width, image.Height);
            newImage.SaveArgb32Pixels(bounds, image.LoadArgb32Pixels(image.Bounds));
            stitchedWidth += image.Width;
        }
    }

    newImage.Save(outputPath + ".pdf", new PdfOptions());
}
```

## Fusionner des images JPG en PNG en C# {#Merge-JPG-Images-into-PNG}

De même, vous pouvez combiner les images JPEG en PNG. Comme indiqué ci-dessus, il vous suffit d'utiliser l'extension **.png** au lieu de **.jpg** dans la méthode [Image.Save][17].
```
// Un tableau d'images que vous souhaitez fusionner.
string[] imagePaths = { "Image1.jpeg", "Image2.jpg" };

string outputPath = "MergeHorizontalAsPNG";

// Obtenir la taille de l'image résultante.
List<Size> imageSizes = new List<Size>();
foreach (string imagePath in imagePaths)
{
    using (RasterImage image = (RasterImage)Image.Load(imagePath))
    {
        imageSizes.Add(image.Size);
    }
}

// Largeur et hauteur de l'image résultante.
int newWidth = imageSizes.Sum(size => size.Width);
int newHeight = imageSizes.Max(size => size.Height);

// Fusionner des images en une seule et enregistrer au format PNG
using (MemoryStream memoryStream = new MemoryStream())
{
    StreamSource outputStreamSource = new StreamSource(memoryStream);
    JpegOptions options = new JpegOptions() { Source = outputStreamSource, Quality = 100 };
    using (JpegImage newImage = (JpegImage)Image.Create(options, newWidth, newHeight))
    {
        int stitchedWidth = 0;
        foreach (string imagePath in imagePaths)
        {
            using (RasterImage image = (RasterImage)Image.Load(imagePath))
            {
                Rectangle bounds = new Rectangle(stitchedWidth, 0, image.Width, image.Height);
                newImage.SaveArgb32Pixels(bounds, image.LoadArgb32Pixels(image.Bounds));
                stitchedWidth += image.Width;
            }
        }

        newImage.Save(outputPath + ".png", new PngOptions());
    }
}
```

## Conclusion

Dans cet article, vous avez appris à joindre des images JPEG en C#. Vous pouvez les combiner horizontalement ou verticalement. Vous avez également appris à enregistrer l'image fusionnée au format PDF ou PNG. Pour plus d'informations, veuillez consulter la [documentation] [18] de Aspose.Imaging pour .NET. Si vous avez des questions, n'hésitez pas à nous contacter sur [notre forum d'assistance][19].
## See Also

  * [Compresser les images PNG, JPEG et TIFF à l'aide de C#][20]
  * [Convertir PNG, JPG en TGA ou manipuler TGA à l'aide de C#][21]

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





