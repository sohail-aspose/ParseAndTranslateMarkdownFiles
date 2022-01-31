---
title: "Convertir JPG en PNG ou PDF en C#"
author: Nayyer Shahbaz
date: 2021-04-17T00:54:23+00:00
url: /2021/04/17/convertir-jpg-en-png-ou-pdf-en-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API CSharp pour la conversion JPEG en PNG"
  - "Convertir JPEG en PDF dans CSharp"
  - "convertir jpg en png"
  - "API de conversion JPEG2000 en PNG"
  - "jpg en png dans CSharp"

---


{{< figure align=center src="images/jpg-png.png" alt="convertir JPG en PNG">}}
 

[JPEG][2] et [PNG][3] font partie des formats d'image raster populaires et sont appréciés pour leurs méthodes de compression avec perte. Vous avez la possibilité d'ajuster le niveau de compression pour atteindre le niveau de qualité souhaité et en même temps réduire la taille de stockage. Cependant, parfois, votre système n'accepte qu'un format particulier, vous devez donc charger votre ensemble d'images existant et les enregistrer dans la sortie souhaitée. Au lieu d'utiliser des applications conventionnelles avec des fonctionnalités limitées et d'impliquer la fourniture manuelle de fichiers d'entrée, les API de programmation gardent une longueur d'avance en raison de leur flexibilité et de leurs capacités à effectuer toutes les opérations dans un format batch.
  * [API de traitement d'images][4]
  * [Convertir JPG en PNG en C#][5]
  * [Conversion JPG en PDF en C#][6]

## API de traitement d'images {#Image-processing-API}

<div class="wp-block-image">  

{{< figure align=center src="images/Screenshot-2021-04-16-at-4.09.29-PM.png" alt="">}}

</div>
Aspose.Imaging pour .NET est une API de programmation étonnante offrant les capacités de créer, manipuler et convertir [formats de fichiers pris en charge] [7]. Il fonctionne indépendamment des autres applications graphiques et ne nécessite l'installation d'aucun éditeur d'image sur la machine. Il peut être utilisé avec des applications Web ASP.NET ou des applications de bureau Windows. [Aspose.Imaging pour .NET][8] est intégré à la suite [Conholdate.Total pour .NET][9]. Donc, si vous avez acheté un abonnement pour [Conholdate.Total pour .NET][9], vous pouvez certainement effectuer toutes les opérations de traitement d'image à l'aide de l'API [Aspose.Imaging pour .NET][8].
Pour utiliser l'API, la première étape est son installation. Vous pouvez suivre l'une ou l'autre des étapes pour effectuer l'installation.
  * Téléchargez [fichiers DLL][10] et référencez-les manuellement dans votre projet
  * Ouvrez le gestionnaire de packages [NuGet][11], recherchez **Aspose.Imaging** et installez-le.
  * Exécutez la commande suivante à partir de la console NuGet Package Manager

<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> Install-Package Aspose.Imaging</pre>
## Convertir JPG en PNG en C# {#Convert-JPG-to-PNG-in-C-}

L'API est suffisamment robuste pour identifier le format de l'image d'entrée et il vous suffit de spécifier l'image source sous la forme d'une instance Stream ou en fournissant le chemin d'accès au fichier sur le système local. Dans les étapes suivantes, nous allons expliquer comment charger une image [JPEG][12] et enregistrer la sortie au format [PNG][13].
  1. Tout d'abord, nous devons créer une instance de l'objet [Aspose.Imaging.License][14]. Appelez [SetLicense(…)][15] et fournissez le chemin du fichier Conholdate.Total.NET.lic comme argument
  2. Deuxièmement, créez un objet de la classe [Image][16] qui est une classe de base de tous les types d'images, et transmettez le résultat de la méthode Aspose.Imaging.Image.Load(..) qui prend le chemin Steam ou la chaîne d'une image fichier à charger
  3. Créer une instance de la classe PngOptions
  4. Enfin, appelez la méthode [Save(String)][17] de la classe [Image][16] et transmettez l'emplacement où vous souhaitez enregistrer le fichier [PNG][13] résultant

```
// créer un objet pour initier la licence
Aspose.Imaging.License license = new Aspose.Imaging.License();

// fournir le chemin du fichier de licence
license.SetLicense("/Documents/Conholdate.Total.NET.lic");

// Charger une image existante (de type JPEG) dans une instance de la classe Image
using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load("/Documents/samsung_galaxy.jpg"))
{
  // create an object of PngOptions class
  Aspose.Imaging.ImageOptions.PngOptions options = new Aspose.Imaging.ImageOptions.PngOptions();
  
  // save resultant image and pass PngOptions as argument
  image.Save(dataDir + "_output.png", options);
}
```

The PngOptions class also provides various properties and in the example below, we have specified to generate the color type of resultant image as Grayscale. Also, the compression level for a resultant image is specified as 4. Veuillez noter que la propriété **CompressionLevel** accepte des valeurs comprises entre 0 et 9, où 9 est la compression maximale et 0 est la valeur par défaut.

```
// créer un objet PngOptions
Aspose.Imaging.ImageOptions.PngOptions options = new Aspose.Imaging.ImageOptions.PngOptions();

// définir le type de couleur de l'image résultante sur grayScale
options.ColorType = Aspose.Imaging.FileFormats.Png.PngColorType.Grayscale;

// définir le niveau de compression du fichier résultant sur 4
options.CompressionLevel = 4;
```

Le fichier source et l'image en niveaux de gris résultante peuvent être téléchargés à partir des liens suivants
  * [samsung_gaalxy.jpg][18]
  * [Niveaux de gris.png][19]

## Conversion JPG en PDF en C# {#JPG-to-PDF-conversion-in-Csharp}

Aspose.Imaging pour .NET est également capable de convertir des images JPG en [PDF][20] (Portable Document Format). Pendant la conversion, vous obtenez également la possibilité de définir DocumentInfo ainsi que les détails de conformité [PDF/A][21]. Les étapes suivantes expliquent le processus de chargement des images raster et leur conversion au format [PDF][20].
  1. La première étape consiste à créer une instance de la classe [License][14].
  2. Ensuite, appelez la méthode [SetLicense(…)][15] et fournissez le chemin du fichier Conholdate.Total.NET.lic. La licence est initialisée pour éliminer toutes les restrictions présentes dans la version d'évaluation
  3. Troisièmement, créez un objet de la classe [Image][16] qui est une classe de base de tous les types d'images, et transmettez la sortie de la méthode [Aspose.Imaging.Image.Load(..)][22]
  4. Créez maintenant une instance de la classe [PdfOptions][23]
  5. Afin de définir les informations du document PDF telles que l'auteur, le titre, le sujet, etc., créez un objet de la classe [PdfDocumentInfo][24] et transmettez sa valeur à l'objet [PdfDocumentInfo][25] de la classe [PdfOptions][23]
  6. Maintenant, pour enregistrer le fichier PDF avec les informations de conformité PDF/A, veuillez créer une instance de la classe [PdfCoreOptions][26] et l'associer à la propriété [PdfCoreOptions][27] de l'objet [PdfOptions][23]
  7. Enfin, appelez la méthode [Save(String)][17] de la classe [Image][16] pour générer le document PDF de sortie

```
// créer un objet pour initier la licence
Aspose.Imaging.License license = new Aspose.Imaging.License();

// fournir le chemin du fichier de licence
license.SetLicense("/Documents/Conholdate.Total.NET.lic");

// Charger une image existante (de type JPEG ) dans une instance de la classe Image
using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dataDir+"samsung_galaxy.jpg"))
{
  // create an instance of PdfOptions class
  Aspose.Imaging.ImageOptions.PdfOptions pdfOptions = new Aspose.Imaging.ImageOptions.PdfOptions();
  
  // create PdfDocumentInfo object and pass it to PdfOptions instance
  pdfOptions.PdfDocumentInfo = new Aspose.Imaging.FileFormats.Pdf.PdfDocumentInfo
  {
    // set author name for the resultant file
    Author = "Nayyer Shahbaz",
    Title = "JPEG converted to PDF",
    Subject = "Aspose.Imaging for .NET"
  };
  
  // set the PDF compliance as PDF/A-1a
  pdfOptions.PdfCoreOptions = new Aspose.Imaging.FileFormats.Pdf.PdfCoreOptions()
  {
    PdfCompliance = Aspose.Imaging.PdfComplianceVersion.PdfA1b
  };
  
  // save the resultant PDF document
  image.Save(dataDir + "_output.pdf", pdfOptions);
}
```

Les exemples de fichiers utilisés dans l'exemple ci-dessus peuvent être téléchargés à partir des liens suivants
  * [samsung_gaalxy.jpg][18]
  * [_sortie.pdf][28]

## Get a Free License

Vous pouvez demander <a rel="noreferrer noopener" href="https://purchase.aspose.com/temporary-license" >une licence temporaire gratuite</a> pour essayer l'API sans aucune limitation d'évaluation.
## Conclusion

Dans cet article, nous avons discuté des différentes capacités de [Aspose.Imaging pour .NET][8] spécifiquement pour convertir le format JPG au format PNG ainsi que leur rendu au format PDF. Veuillez noter que [Aspose.Imaging pour .NET][8] est bien plus puissant et offre une pléthore d'options, par rapport à ce qui a été discuté ci-dessus. Il permet à vos applications .NET de dessiner et d'effectuer un traitement de niveau basique à avancé des images raster et vectorielles.
De plus, [Aspose.Imaging pour .NET][8] offre une compression d'image robuste et une vitesse de traitement élevée grâce à un accès natif aux octets et à une gamme d'algorithmes efficaces. Non seulement il manipule, exporte et convertit des images, mais il vous permet également de dessiner dynamiquement des objets à l'aide de la manipulation de pixels et du chemin graphique. Pour plus d'informations, veuillez explorer la [documentation][29] du produit et si vous rencontrez un problème lors de l'utilisation de l'API, n'hésitez pas à nous contacter via le [forum d'assistance produit][30].
## See Also

  * [Convertir GIF en DICOM et JPEG en PNG à l'aide de l'API REST C# .NET][31]
  * [Reconnaissance d'objets via des images à l'aide de Java Cloud SDK][32]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/jpg-png.png
 [2]: https://wiki.fileformat.com/image/jpeg/
 [3]: https://wiki.fileformat.com/image/png/
 [4]: #Image-processing-API
 [5]: #Convert-JPG-to-PNG-in-C-
 [6]: #JPG-to-PDF-conversion-in-Csharp
 [7]: https://docs.aspose.com/imaging/net/supported-file-formats/
 [8]: https://products.aspose.com/imaging/net
 [9]: https://products.conholdate.com/total/net
 [10]: https://downloads.aspose.com/imaging/net
 [11]: https://www.nuget.org/packages/Aspose.Imaging/
 [12]: https://docs.fileformat.com/image/jpeg/
 [13]: https://docs.fileformat.com/image/png/
 [14]: https://apireference.aspose.com/imaging/net/aspose.imaging/license
 [15]: https://apireference.aspose.com/imaging/net/aspose.imaging.license/setlicense/methods/1
 [16]: https://apireference.aspose.com/imaging/net/aspose.imaging/image
 [17]: https://apireference.aspose.com/imaging/net/aspose.imaging.datastreamsupporter/save/methods/2
 [18]: https://www.dropbox.com/s/g2fobiwgjhvftfw/samsung_galaxy.jpg?dl=0
 [19]: https://www.dropbox.com/s/zrm1oxdetnpuogc/Grayscale.png?dl=0
 [20]: https://docs.fileformat.com/pdf/
 [21]: https://docs.fileformat.com/pdf/a/
 [22]: https://apireference.aspose.com/imaging/net/aspose.imaging.image/load/methods/2
 [23]: https://apireference.aspose.com/imaging/net/aspose.imaging.imageoptions/pdfoptions
 [24]: https://apireference.aspose.com/imaging/net/aspose.imaging.fileformats.pdf/pdfdocumentinfo
 [25]: https://apireference.aspose.com/imaging/net/aspose.imaging.imageoptions/pdfoptions/properties/pdfdocumentinfo
 [26]: https://apireference.aspose.com/imaging/net/aspose.imaging.fileformats.pdf/pdfcoreoptions
 [27]: https://apireference.aspose.com/imaging/net/aspose.imaging.imageoptions/pdfoptions/properties/pdfcoreoptions
 [28]: https://www.dropbox.com/s/pusa3gzj3umqjn6/_output.pdf?dl=0
 [29]: https://docs.aspose.com/imaging/net/
 [30]: https://forum.aspose.com/c/imaging/14
 [31]: https://blog.aspose.cloud/2021/04/04/convert-gif-to-dicom-and-jpeg-to-png-using-c-.net-rest-api/
 [32]: https://blog.aspose.cloud/2020/07/01/object-recognition-through-images-using-java-cloud-sdk/





