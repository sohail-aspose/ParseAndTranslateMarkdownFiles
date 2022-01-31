---
title: "Recadrer et redimensionner les images JPEG à l'aide de C #"
author: Muzammil Khan
date: 2022-01-05T15:09:32+00:00
summary: "En tant que développeur C#, vous pouvez facilement recadrer et redimensionner les images JPEG/JPG par programmation. Dans cet article, vous apprendrez <strong>à recadrer et redimensionner des images JPEG à l'aide de C#</strong> ."
url: /2022/01/05/recadrer-et-redimensionner-les-images-jpeg-en-utilisant-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Recadrer des images dans CSharp"
  - "Recadrage d'image"
  - "Rectangle Recadrage"
  - "Redimensionner les images dans CSharp"
  - "Déplacer le recadrage"
---

{{< figure align=center src="images/crop-and-resize-jpeg-image-using-csharp-1.jpg" alt="Recadrer et redimensionner l'image JPEG à l'aide de C #">}}

[JPEG ou JPG][2] est l'un des formats d'image les plus couramment utilisés pour stocker des images et des photos. Dans certains cas, nous pourrions avoir besoin de recadrer ou de faire pivoter des images pour diverses raisons. Dans cet article, nous allons apprendre à recadrer et redimensionner des images JPEG à l'aide de C#.
Les sujets suivants seront traités dans cet article :
  * [API d'image C # pour recadrer et redimensionner JPEG][3]
  * [Recadrer des images JPEG à l'aide de C #][4]
  * [Recadrer les images à une taille spécifique][5]
  * [Redimensionner les images JPEG en C#][6]
  * [Redimensionner les images JPEG proportionnellement][7]

## API d'imagerie C # pour recadrer et redimensionner JPEG {#CSharp-Imaging-API-to-Crop-and-Resize-JPEG}

Pour recadrer et redimensionner les images, nous utiliserons [Aspose.Imaging for .NET][8]API. Il nous permet de créer, charger, manipuler, convertir et compresser des images ou des photos par programmation. Veuillez soit[télécharger][9]la DLL de l'API ou l'installer à l'aide de[NuGet][10].
```
PM> Install-Package Aspose.Imaging
```

## Recadrer des images JPEG à l'aide de C# {#Crop-JPEG-Images-using-CSharp}

Nous pouvons facilement recadrer n'importe quelle image JPEG/JPG de tous les côtés vers le centre de l'image. À cette fin, la classe _RasterImage_ fournit la méthode _Crop(Int32, Int32, Int32, Int32)_ qui recadre l'image avec des valeurs de décalage spécifiées. Il prend les valeurs de décalage gauche, droite, haut et bas comme arguments pour recadrer les limites de l'image. Nous pouvons recadrer les images en utilisant l'approche de recadrage par décalage en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez l'image JPG d'entrée à l'aide de la classe **[RasterImage][11]**.
  2. Ensuite, mettez l'image en cache à l'aide de la méthode **[CacheData][12]**.
  3. Après cela, appelez la méthode **[Crop()][13]** avec les valeurs de décalage comme arguments.
  4. Enfin, appelez la méthode **[Save()][14]** avec le chemin du fichier de sortie comme argument pour enregistrer le fichier image recadrée.

L'exemple de code suivant montre **comment recadrer une image JPEG à l'aide de C#**.
```
// Cet exemple de code montre comment recadrer une image JPG à l'aide de l'approche de recadrage par décalage.
// Charger une image existante dans une instance de la classe RasterImage
RasterImage rasterImage = (RasterImage)Image.Load(@"C:\Files\images\aspose_logo.jpg");

// Avant le recadrage, l'image doit être mise en cache pour de meilleures performances
if (!rasterImage.IsCached)
{
    rasterImage.CacheData();
}

// Définir les valeurs de décalage pour les quatre côtés
int leftShift = 30;
int rightShift = 30;
int topShift = 30;
int bottomShift = 30;

// En fonction des valeurs de décalage, appliquez le recadrage sur l'image 
// La méthode de recadrage déplacera les limites de l'image vers le centre de l'image
rasterImage.Crop(leftShift, rightShift, topShift, bottomShift);

// Enregistrer l'image recadrée
rasterImage.Save(@"C:\Files\images\cropped_out.jpg");
```

{{< figure align=center src="images/Crop-JPEG-Images-using-CSharp-1024x467.jpg" alt="Recadrer des images JPEG à l'aide de C #" caption="Recadrez les images JPEG à l'aide de C#.">}}
 

## Recadrer les images à une taille spécifique à l'aide de C# {#Crop-Images-to-Specific-Size-using-CSharp}

La classe _RasterImage_ fournit également une méthode _Crop(Rectangle)_ surchargée qui recadre une zone particulière d'une image à une taille spécifiée. Il prend une instance de la classe _[Rectangle][16]_ comme argument. Nous pouvons recadrer les images à une taille spécifiée en suivant les étapes ci-dessous :
1. Tout d'abord, chargez l'image JPG d'entrée à l'aide de la classe [RasterImage](https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage).
2. Ensuite, mettez l'image en cache à l'aide de la méthode [CacheData](https://apireference.aspose.com/imaging/net/aspose.imaging/datastreamsupporter/methods/cachedata).
3. Ensuite, initialisez l'objet de classe Rectangle avec l'emplacement et la taille spécifiés.
4. Après cela, appelez la méthode [Crop()](https://apireference.aspose.com/imaging/net/aspose.imaging/rasterimage/methods/crop) avec l'objet Rectangle créé comme argument.
5. Enfin, appelez la méthode [Save()](https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3) avec le chemin du fichier de sortie comme argument pour enregistrer le fichier image recadrée .

L'exemple de code suivant montre **comment recadrer une image JPEG à une taille spécifique à l'aide de C#**.
```
// Cet exemple de code montre comment recadrer une image JPG à l'aide de l'approche de recadrage par rectangle.
// Charger une image existante dans une instance de la classe RasterImage
RasterImage rasterImage = (RasterImage)Image.Load(@"C:\Files\images\aspose_logo.jpg");

// Avant le recadrage, l'image doit être mise en cache pour de meilleures performances
if (!rasterImage.IsCached)
{
    rasterImage.CacheData();
}

// Créez une instance de la classe Rectangle avec la taille souhaitée
Rectangle rectangle = new Rectangle(35, 35, 580, 240);

// Effectuer l'opération de recadrage sur l'objet de la classe Rectangle
rasterImage.Crop(rectangle);

// Enregistrer l'image recadrée
rasterImage.Save(@"C:\Files\images\CroppingByRectangle_out.jpg");
```

{{< figure align=center src="images/Crop-Image-in-Specific-Size-using-CSharp-1024x431.jpg" alt="Recadrer l'image dans une taille spécifique à l'aide de C #." caption="Recadrer l'image à une taille spécifique à l'aide de C#.">}}
 
  	
## Redimensionner les images JPEG en C# {#Resize-JPEG-Images-in-CSharp}

La classe _[Image][18]_ fournit la méthode _Resize()_ pour redimensionner les images. Nous pouvons redimensionner les images JPEG en suivant les étapes ci-dessous :
1. Tout d'abord, chargez l'image JPG d'entrée à l'aide de la classe [Image](https://apireference.aspose.com/imaging/net/aspose.imaging/image).
2. Ensuite, appelez la méthode [Resize(int32, int32)](https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resize) avec la largeur et la hauteur requises comme arguments.
3. Enfin, appelez la méthode [Save()](https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3) avec le chemin du fichier de sortie comme argument pour enregistrer l'image redimensionnée .

L'exemple de code suivant montre **comment redimensionner une image JPEG à l'aide de C#**.
```
// Cet exemple de code montre comment recadrer une image JPG à l'aide de l'approche de recadrage par rectangle.
// Charger une image existante
Image image = Image.Load(@"C:\Files\images\aspose_logo.jpg");

// Nouvelle largeur et hauteur
image.Resize(300, 100);

// Enregistrer l'image redimensionnée
image.Save(@"C:\Files\images\SimpleResizing_out.jpg");
```

{{< figure align=center src="images/Resize-JPEG-Images-in-CSharp-1024x460.jpg" alt="Redimensionner les images JPEG en C#" caption="Redimensionnez les images JPEG en C#.">}}


## Redimensionner les images JPEG proportionnellement en C# {#Resize-JPEG-Images-Proportionally-in-CSharp}

Nous pouvons obtenir des images étirées lorsque nous redimensionnons avec une hauteur et une largeur fixes. Nous pouvons utiliser le redimensionnement proportionnel pour éviter les images étirées. À cette fin, la classe _[Image][18]_ fournit les méthodes [_ResizeWidthProportionally(Int32)_][20] et [_ResizeHeightProportionally(Int32)_][21]. Veuillez suivre les étapes ci-dessous pour redimensionner une image proportionnellement à la largeur et à la hauteur.
1. Tout d'abord, chargez l'image JPG d'entrée à l'aide de la classe [Image](https://apireference.aspose.com/imaging/net/aspose.imaging/image).
2. Ensuite, appelez la méthode [Image.ResizeWidthProportionally(Int32)](https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resizewidthproportionally) avec la nouvelle largeur comme arguments.
3. Après cela, appelez la méthode [Image.ResizeHeightProportionally(Int32)](https://apireference.aspose.com/imaging/net/aspose.imaging/image/methods/resizeheightproportionally) avec la nouvelle hauteur comme arguments.
4. Enfin, appelez la méthode [Save()](https://apireference.aspose.com/imaging/net/aspose.imaging.image/save/methods/3) avec le chemin du fichier de sortie comme argument pour enregistrer l'image redimensionnée .

L'exemple de code suivant montre **comment redimensionner une image JPEG proportionnellement à l'aide de C#**.
```
// Cet exemple de code montre comment recadrer une image JPG à l'aide de l'approche de recadrage par rectangle.
// Charger une image existante
Image image = Image.Load(@"C:\Files\images\sample.jpg");

// Largeur
int newLargeur = image.Largeur / 2;
image.ResizeLargeurProportionally(newLargeur);

// Hauteur
int newHauteur = image.Hauteur / 2;
image.ResizeHauteurProportionally(newHauteur);

// Définir les options de sauvegarde
JpegOptions saveOptions = new JpegOptions();
saveOptions.Quality = 100;

// Enregistrer l'image
image.Save(@"C:\Files\images\sample_out.jpg", saveOptions);
```

## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][22].
## Conclusion

Dans cet article, nous avons appris à :
  * recadrer les images JPEG en C# ;
  * recadrer une image à une taille spécifique ;
  * redimensionner les images JPEG par programmation ;
  * redimensionner les images JPEG proportionnellement.

En outre, vous pouvez en savoir plus sur l'API Aspose.Imaging pour .NET en utilisant la [documentation][23]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][24].
## See Also

  * [Redimensionner les images à l'aide de C# .NET][25]
  * [Compresser des images à l'aide de C #][26]

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

