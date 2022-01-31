---
title: "Annoter des images JPG avec C#"
author: Muzammil Khan
date: 2021-07-13T18:03:57+00:00
summary: ". Vous pouvez facilement annoter vos images JPG et ajouter un large éventail d'annotations graphiques, textuelles et filigranes dans vos applications .NET. Dans cet article, vous apprendrez <strong>à annoter des images JPG à l'aide de C#</strong> ."
url: /2021/07/13/annoter-les-images-jpg-avec-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Ajouter une annotation de zone à l'aide de CSharp"
  - "Ajouter une annotation TextFiled à l'aide de CSharp"
  - "Ajouter une annotation de filigrane à l'aide de CSharp"
  - "Annoter les images JPG"
  - "API CSharp pour annoter les images"

---


{{< figure align=center src="images/annotate-jpg-images-using-csharp.jpg" alt="annoter des images jpg en utilisant C#">}}
 

Vous pouvez annoter des images de formats d'image populaires tels que JPEG, PNG, TIFF par programme. Les annotations sur les images fournissent des informations supplémentaires sur une donnée existante. Vous pouvez ajouter un large éventail d'annotations graphiques, textuelles et filigranes aux images dans vos applications .NET. Dans cet article, vous apprendrez **comment annoter des images JPG à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour annoter les images][2]
  * [Annoter des images JPG avec C#][3]
  * [Ajouter une annotation de zone à JPG à l'aide de C #][4]
  * [Ajouter une annotation de champ de texte à JPG à l'aide de C #][5]
  * [Annoter des images JPG avec filigrane à l'aide de C#][6]

## API C# pour annoter les images {#CSharp-API-to-Annotate-Images}

Pour annoter les images [JPG][7], j'utiliserai l'API [GroupDocs.Annotation for .NET][8]. Il permet de créer par programmation des applications d'annotation de documents en C#, ASP.NET et d'autres technologies .NET associées. Vous pouvez ajouter des types d'annotations populaires tels que la zone, le point, le texte, l'ellipse, le lien, le soulignement, la polyligne, la flèche, la distance, le filigrane, l'image, etc. à vos documents de tous les formats populaires. L'API vous permet également d'exporter des documents après avoir ajouté des annotations, des commentaires ou des notes en surbrillance à leur format d'origine.
Vous pouvez soit [télécharger][9] la DLL de l'API, soit l'installer à l'aide de [NuGet][10].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Annotation</code></pre>
## Annoter des images JPG avec C# {#Annotate-JPG-Images}

Vous pouvez ajouter plusieurs annotations pour annoter vos images JPG en suivant les étapes ci-dessous :.
  * Créez une instance de la classe _**[Annotator][11]**_
  * Indiquez le chemin du fichier d'entrée
  * Créer une instance de la classe [_**ArrowAnnotation**_][12]
  * Définissez diverses propriétés pour _ArrowAnnotation_ telles que la couleur, l'opacité, le style, etc.
  * Ajouter _ArrowAnnotation_ à la liste des annotations
  * Créer une instance de la classe [_**DistanceAnnotation**_][13]
  * Définissez diverses propriétés pour _DistanceAnnotation_ telles que la couleur, l'opacité, le style, etc.
  * Ajouter _DistanceAnnotation_ à la liste des annotations
  * Créer une instance de la classe [_**EllipseAnnotation**_][14]
  * Définissez diverses propriétés pour _EllipseAnnotation_ telles que la couleur, l'opacité, le style, etc.
  * Ajouter _EllipseAnnotation_ à la liste des annotations
  * Créer une instance de la classe [_**PointAnnotation**_][15]
  * Définir diverses propriétés pour _PointAnnotation_ telles que la taille et l'emplacement de la boîte
  * Ajouter _PointAnnotation_ à la liste des annotations
  * Appelez la méthode [_Add()_][16] pour ajouter des annotations à l'Annotator
  * Appelez la méthode _[Save()][17]_ et enregistrez le fichier résultant

L'exemple de code suivant montre **comment annoter une image JPG à l'aide de C#**.
```
// initialiser l'annotateur
Annotator annotator = new Annotator("C:\\Files\\sample.jpg");

List<AnnotationBase> annotations = new List<AnnotationBase>();

// définir et ajouter une annotation de flèche
ArrowAnnotation arrow = new ArrowAnnotation
{
    Box = new Rectangle(100, 100, 100, 100),
    CreatedOn = DateTime.Now,
    Opacity = 0.7,
    PenColor = 16777215,
    PenStyle = PenStyle.DashDotDot,
    PenWidth = 5
};
annotations.Add(arrow);

// définir et ajouter une annotation de distance
DistanceAnnotation distance = new DistanceAnnotation
{
    Box = new Rectangle(75, 545, 315, 0),
    CreatedOn = DateTime.Now,
    Opacity = 0.7,
    PenColor = 65535,
    PenStyle = PenStyle.Solid,
    PenWidth = 9
};
annotations.Add(distance);

// définir et ajouter une annotation d'ellipse
EllipseAnnotation ellipse = new EllipseAnnotation
{
    BackgroundColor = 65535,
    Box = new Rectangle(150, 300, 100, 100),
    CreatedOn = DateTime.Now,
    Opacity = 0.3,
    PenColor = 65535,
    PenStyle = PenStyle.Dot,
    PenWidth = 3
};
annotations.Add(ellipse);

// définir et ajouter une annotation de point
PointAnnotation point = new PointAnnotation
{
    Box = new Rectangle(75, 605, 10, 10),
    CreatedOn = DateTime.Now,
};
annotations.Add(point);

// ajouter des annotations à l'annotateur
annotator.Add(annotations);

// enregistrer le fichier de sortie
annotator.Save("C:\\Files\\result.jpg");
```

{{< figure align=center src="images/Add-Multiple-Annotations-to-JPG-Images-1024x572.jpg" alt="Annoter des images JPG avec C#" caption="Annoter des images JPG avec C#">}}
 

La classe [Annotator][11] est la classe principale qui contrôle le processus d'annotation du document. Il fournit diverses méthodes pour ajouter, mettre à jour ou supprimer des annotations. La méthode [Save()][17] de cette classe enregistre le fichier annoté au chemin donné.
L'API fournit différentes classes spécifiques pour définir différents types d'annotations telles que :
  * La classe ArrowAnnotation fournit des propriétés pour définir l'annotation des flèches
  * Les installations de la classe DistanceAnnotation pour définir l'annotation de distance
  * La classe EllipseAnnotation peut être utilisée pour définir une annotation Ellipse
  * La classe PointAnnotation fournit des propriétés pour définir une annotation de point

## Ajouter une annotation de zone à JPG à l'aide de C # {#Add-Area-Annotation-to-JPG-using-CSharp}

Vous pouvez ajouter une annotation de zone à vos images JPG par programmation en suivant les étapes ci-dessous :.
  * Créez une instance de la classe _**[Annotator][11]**_
  * Indiquez le chemin du fichier d'entrée
  * Créer une instance de la classe [_**AreaAnnotation**_][19]
  * Définissez diverses propriétés pour _AreaAnnotation_ telles que la position, la couleur, le message, l'opacité, le style, etc.
  * Appelez la méthode [_Add()_][20] pour ajouter _AreaAnnotation_ à l'Annotator
  * Appelez la méthode _[Save()][17]_ et enregistrez le fichier résultant

L'exemple de code suivant montre **comment ajouter une annotation de zone à une image JPG à l'aide de C#**.
```
// initialiser l'annotateur
Annotator annotator = new Annotator("C:\\Files\\sample.jpg");

// définir une annotation de zone
AreaAnnotation area = new AreaAnnotation();
area.BackgroundColor = 65535;
area.Box = new Rectangle(80, 575, 310, 50);
area.CreatedOn = DateTime.Now;
area.Opacity = 0.7;
area.PageNumber = 0;
area.PenColor = 65535;
area.PenStyle = PenStyle.Dot;
area.PenWidth = 3;

// ajouter une annotation de zone
annotator.Add(area);

// enregistrer le fichier de sortie
annotator.Save("C:\\Files\\result.jpg");
```

{{< figure align=center src="images/Add-Area-Annotation-to-JPG-1024x653.jpg" alt="Ajouter une annotation de zone à JPG à l'aide de C#" caption="Ajouter une annotation de zone à JPG à l'aide de C #">}}
 

## Ajouter une annotation de champ de texte à JPG à l'aide de C # {#Add-Text-Field-Annotation-to-JPG-using-CSharp}

Vous pouvez ajouter une annotation de champ de texte à vos images JPG en suivant les étapes ci-dessous :.
  * Créez une instance de la classe _**[Annotator][11]**_
  * Indiquez le chemin du fichier d'entrée
  * Créez une instance de la classe [_**TextFieldAnnotation**_][22]
  * Définissez diverses propriétés pour _TextFieldAnnotation_ telles que le texte, la couleur, l'opacité, le style, la police, etc.
  * Appelez la méthode [_Add()_][20] pour ajouter _TextFieldAnnotation_ à l'Annotator
  * Appelez la méthode _[Save()][17]_ et enregistrez le fichier résultant

L'exemple de code suivant montre **comment ajouter une annotation de champ de texte à une image JPG à l'aide de C#**.
```
// initialiser l'annotateur
Annotator annotator = new Annotator("C:\\Files\\sample.jpg");

// définir l'annotation du champ de texte
TextFieldAnnotation textField = new TextFieldAnnotation();
textField.Box = new Rectangle(130, 120, 270, 30);
textField.CreatedOn = DateTime.Now;
textField.Text = "Document Automation APIs";
textField.FontColor = 16777215;
textField.FontSize = 12;
textField.Opacity = 1;
textField.PenStyle = PenStyle.Dot;
textField.PenWidth = 3;
textField.FontFamily = "Arial";
textField.TextHorizontalAlignment = HorizontalAlignment.Center;

// ajouter une annotation de champ de texte
annotator.Add(textField);

// enregistrer le fichier de sortie
annotator.Save("C:\\Files\\result.jpg");
```

{{< figure align=center src="images/Add-Text-Field-Annotation-to-JPG-1024x653.jpg" alt="Ajouter une annotation de champ de texte à JPG à l'aide de C#" caption="Ajouter une annotation de champ de texte à JPG à l'aide de C #">}}
 

## Annotation d'images JPG avec filigrane à l'aide de C# {#Annotation-JPG-Images-with-Watermark-using-CSharp}

Vous pouvez annoter vos images JPG avec du texte en filigrane en suivant les étapes ci-dessous :.
  * Créez une instance de la classe _**[Annotator][11]**_
  * Indiquez le chemin du fichier d'entrée
  * Créer une instance de la classe [_**WatermarkAnnotation**_][24]
  * Définissez diverses propriétés pour _WatermarkAnnotation_ telles que le texte, la couleur, la taille de la police, l'alignement, etc.
  * Appelez la méthode [_Add()_][20] pour ajouter WatermarkAnnotation à l'Annotator
  * Appelez la méthode _[Save()][17]_ et enregistrez le fichier résultant

L'exemple de code suivant montre **comment annoter une image JPG avec du texte en filigrane à l'aide de C#**.
```
// initialiser l'annotateur
Annotator annotator = new Annotator("C:\\Files\\sample.jpg");

// définir l'annotation du filigrane
WatermarkAnnotation watermark = new WatermarkAnnotation();
watermark.Text = "This is a sample Watermark";
watermark.FontColor = 16777215;
watermark.FontSize = 22;
watermark.Opacity = 0.7;
watermark.HorizontalAlignment = HorizontalAlignment.Center;
watermark.VerticalAlignment = VerticalAlignment.Center;

// ajouter une annotation en filigrane
annotator.Add(watermark);

// enregistrer le fichier de sortie
annotator.Save("C:\\Files\\result.jpg");
```

{{< figure align=center src="images/Annotation-JPG-Images-with-Watermark-1024x648.jpg" alt="Images d'annotation avec filigrane" caption="Annotation d'images JPG avec filigrane à l'aide de C#">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][26].
## Conclusion

Dans cet article, vous avez appris **comment annoter des images JPG à l'aide de C#**. Vous avez également appris **comment ajouter plusieurs annotations aux images JPG**. De plus, vous avez appris **comment ajouter des annotations de zone, de champ de texte et de filigrane aux images JPG** par programmation en C#. Vous pouvez en savoir plus sur GroupDocs.Annotation pour l'API .NET en utilisant la [documentation][27]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][28].
## See Also

  * [Ajouter ou supprimer des annotations ou des fichiers Word de balisage à l'aide de C #][29]

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





