---
title: "Ajouter des filigranes de texte ou d'image dans des documents Word à l'aide de C#"
author: Muzammil Khan
date: 2021-10-22T10:35:19+00:00
summary: "En tant que développeur C#, vous pouvez facilement ajouter par programme des filigranes de texte ou d'image dans des documents Word. Dans cet article, vous apprendrez <strong>à ajouter des filigranes de texte ou d'image dans des documents Word à l'aide de C#.</strong>"
url: /2021/10/22/ajouter-texte-ou-image-filigranes-dans-word-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Ajouter un filigrane d'image à l'aide de CSharp"
  - "Ajouter un filigrane de texte à l'aide de CSharp"
  - "Ajouter un filigrane"
  - "Ajouter un filigrane" Image

---


{{< figure align=center src="images/add-text-or-image-watermarks-in-word-documents-using-csharp.jpg" alt="Ajouter des filigranes de texte ou d'image dans des documents Word à l'aide de C#">}}
 

En tant que développeur C#, vous pouvez facilement ajouter par programme des filigranes de texte ou d'image dans des documents Word. Un filigrane est une sorte de message sous forme de texte ou d'image, généralement utilisé pour identifier ou protéger les documents en affichant des informations sur le droit d'auteur, une clause de non-responsabilité, un logo, un tampon ou une signature. Dans cet article, vous apprendrez **comment ajouter des filigranes de texte ou d'image dans des documents Word à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C # pour ajouter un filigrane dans les documents Word][2]
  * [Ajouter un filigrane de texte dans des documents Word à l'aide de C #][3]
  * [Ajouter un filigrane d'image dans des documents Word à l'aide de C#][4]
  * [Filigraner les images d'un document Word à l'aide de C #][5]
  * [Ajouter un filigrane à des pages spécifiques dans des documents Word à l'aide de C #][6]
  * [Ajouter un filigrane à l'en-tête ou au pied de page de documents Word à l'aide de C#][7]

## API C # pour ajouter un filigrane dans les documents Word {#CSharp-API-to-Add-Watermark-in-Word-Documents}

Pour ajouter des filigranes de texte ou d'image dans les fichiers [DOC][8] ou [DOCX][9], nous utiliserons l'API [GroupDocs.Watermark for .NET][10]. Il vous permet d'ajouter, de modifier, de rechercher et de supprimer des filigranes d'image et de texte dans [formats de fichiers pris en charge] [11]. Il permet également d'obtenir les informations de base sur les documents source telles que le type de fichier, la taille, le nombre de pages, la hauteur et la largeur de la page, etc. La fonction d'aperçu du document de l'API permet de générer des représentations d'image des pages du document pour une meilleure compréhension du document.
Vous pouvez soit [télécharger][12] la DLL de l'API, soit l'installer à l'aide de [NuGet][13].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Watermark</code></pre>
## Ajouter un filigrane de texte dans des documents Word à l'aide de C # {#Add-Text-Watermark-in-Word-Documents-using-CSharp}

Vous pouvez ajouter un filigrane de texte aux documents Word en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Watermarker][14].
  * Initialisez la police à utiliser pour le texte du filigrane à l'aide de la classe [Font][15].
  * Créez une instance de la classe [TextWatermark][16] pour créer un filigrane de texte. Passez le texte à afficher en filigrane et l'objet de police défini en tant que paramètres d'entrée.
  * Maintenant, définissez diverses [propriétés du filigrane] [17] telles que la couleur de premier plan, la couleur d'arrière-plan, l'angle de rotation, la hauteur, la largeur, l'opacité, etc.
  * Ensuite, appelez la méthode [Watermarker.Add()][18] pour ajouter le filigrane de texte au document.
  * Enfin, appelez la méthode [Watermarker.Save()] [19] pour enregistrer le document Word en filigrane.

L'exemple de code suivant montre **comment ajouter un filigrane de texte dans un fichier DOCX à l'aide de C#**.
```
// Créateur de filigrane
Watermarker watermarker = new Watermarker(@"C:\Files\Watermark\sample.docx");

// Initialiser la police à utiliser pour le filigrane
Font font = new Font("Arial", 19, FontStyle.Bold | FontStyle.Italic);

// Créer l'objet filigrane
TextWatermark watermark = new TextWatermark("Simple Text Watermark", font);

// Définir les propriétés du filigrane
watermark.ForegroundColor = Color.Red;
watermark.BackgroundColor = Color.Blue;
watermark.TextAlignment = TextAlignment.Right;
watermark.HorizontalAlignment = HorizontalAlignment.Center;
watermark.VerticalAlignment = VerticalAlignment.Bottom;

// Définir la taille du filigrane
watermark.Width = 150;
watermark.Height = 40;

// Définir le niveau d'opacité
watermark.Opacity = 0.9;

// Ajouter un filigrane
watermarker.Add(watermark);

// Enregistrer le fichier de sortie
watermarker.Save(@"C:\Files\Watermark\addTextWatermark_output.docx");
```

{{< figure align=center src="images/Add-Text-Watermark-in-Word-Documents-using-CSharp-1024x620.jpg" alt="Ajoutez un filigrane de texte dans des documents Word à l'aide de C#." caption="Ajouter un filigrane de texte dans des documents Word à l'aide de C#">}}
 

## Ajouter un filigrane d'image dans des documents Word à l'aide de C# {#Add-Image-Watermark-in-Word-Documents-using-CSharp}

Vous pouvez ajouter une image en filigrane aux documents Word en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Watermarker][14].
  * Créez une instance de la classe [ImageWatermark][21] avec le chemin de l'image pour créer un filigrane d'image.
  * Maintenant, définissez diverses [propriétés du filigrane] [17] telles que l'alignement, la hauteur, la largeur, etc.
  * Ensuite, appelez la méthode [Watermarker.Add()][18] pour ajouter le filigrane d'image au document.
  * Enfin, appelez la méthode [Watermarker.Save()] [19] pour enregistrer le document Word en filigrane.

L'exemple de code suivant montre **comment ajouter un filigrane d'image dans un fichier DOCX à l'aide de C#**.
```
// Créer un filigrane
Watermarker watermarker = new Watermarker(@"C:\Files\Watermark\sample.docx");

// Créer l'objet filigrane
ImageWatermark watermark = new ImageWatermark(@"C:\Files\Watermark\logo.png");

// Définir l'alignement du filigrane
watermark.HorizontalAlignment = HorizontalAlignment.Center;
watermark.VerticalAlignment = VerticalAlignment.Bottom;

// Définir la taille du filigrane
watermark.Width = 100;
watermark.Height = 100;

// Ajouter un filigrane
watermarker.Add(watermark);

// Enregistrer le fichier de sortie
watermarker.Save(@"C:\Files\Watermark\AddImageWatermark_output.docx");
```

{{< figure align=center src="images/Add-Image-Watermark-in-Word-Documents-using-CSharp-1024x617.jpg" alt="Ajouter un filigrane d'image dans des documents Word à l'aide de C#." caption="Ajouter un filigrane d'image dans des documents Word à l'aide de C #">}}
 

## Filigraner les images d'un document Word à l'aide de C # {#Watermark-Images-in-Word-Documents-using-CSharp}

Vous pouvez ajouter un filigrane de texte aux images dans les documents Word en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Watermarker][14].
  * Créez une instance de la classe [TextWatermark][16] pour créer un filigrane de texte. Transmettez le texte à afficher en filigrane et la police à utiliser pour le texte du filigrane en utilisant la classe [Font][15] comme paramètres d'entrée.
  * Maintenant, définissez diverses [propriétés du filigrane] [17], par exemple la couleur de premier plan, l'alignement, l'angle de rotation, le facteur d'échelle, etc.
  * Ensuite, appelez la méthode [Watermarker.GetImages()][23] pour rechercher toutes les images du document et obtenir les résultats dans l'objet de classe [WatermarkableImageCollection][24].
  * Pour chaque image de WatermarkableImageCollection, ajoutez un filigrane en appelant la méthode [WatermarkableImage.Add()][25] avec l'objet TextWatermark.
  * Enfin, appelez la méthode [Watermarker.Save()] [19] pour enregistrer le document Word en filigrane.

L'exemple de code suivant montre **comment ajouter un filigrane textuel aux images d'un fichier DOCX à l'aide de C#**.
```
// Créer un filigrane
Watermarker watermarker = new Watermarker(@"C:\Files\Watermark\sample.docx");

// Filigrane de texte du créateur
TextWatermark watermark = new TextWatermark("Protected image", new Font("Arial", 8));

// Définir les propriétés du filigrane
watermark.ForegroundColor = Color.Black;
watermark.HorizontalAlignment = HorizontalAlignment.Center;
watermark.VerticalAlignment = VerticalAlignment.Center;
watermark.RotateAngle = 45;
watermark.SizingType = SizingType.ScaleToParentDimensions;
watermark.ScaleFactor = 1;

// Trouver toutes les images dans le contenu.
WatermarkableImageCollection images = watermarker.GetImages();

// Ajouter un filigrane.
foreach (WatermarkableImage watermarkableImage in images)
{
    watermarkableImage.Add(watermark);
}

// Enregistrer le fichier de sortie
watermarker.Save(@"C:\Files\Watermark\AddWatermarkToImages_output.docx");
```

{{< figure align=center src="images/Watermark-Images-in-Word-Documents-using-CSharp-1024x925.jpg" alt="Filigrane d'images dans des documents Word à l'aide de C#." caption="Filigrane d'images dans des documents Word à l'aide de C#.">}}
 

## Ajouter un filigrane à des pages spécifiques dans des documents Word à l'aide de C# {#Add-Watermark-to-Specific-Pages-in-Word-Documents-using-CSharp}

Vous pouvez ajouter un filigrane à une page spécifique du document Word en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Watermarker][14].
  * Initialisez la police à utiliser pour le texte du filigrane à l'aide de la classe [Font][15].
  * Créez une instance de la classe [TextWatermark][16] pour créer un filigrane de texte. Passez le texte à afficher en filigrane et l'objet de police défini en tant que paramètres d'entrée.
  * Maintenant, définissez diverses [propriétés du filigrane] [17] telles que la couleur de premier plan, la couleur d'arrière-plan, l'alignement, etc.
  * Créez une instance de la classe [WordProcessingWatermarkPagesOptions][27]
  * Maintenant, définissez les [PageNumbers] [28] pour ajouter le filigrane. Vous pouvez définir un seul numéro de page ou une liste de numéros de page séparés par des virgules. Nous l'avons défini sur [WordProcessingContent.PageCount][29] qui indique la dernière page du document ici.
  * Ensuite, appelez la méthode [Watermarker.Add()][18] pour ajouter le filigrane défini.
  * Enfin, appelez la méthode [Watermarker.Save()] [19] pour enregistrer le document Word en filigrane.

L'exemple de code suivant montre **comment ajouter un filigrane de texte à une page spécifique dans un fichier DOCX à l'aide de C#**.
```
// Créer un filigrane
Watermarker watermarker = new Watermarker(@"C:\Files\Watermark\sample.docx");

// Créer un filigrane de texte
TextWatermark watermark = new TextWatermark("This is simple watermark!", new Font("Arial", 26));

// Définir les propriétés du filigrane
watermark.ForegroundColor = Color.Red;
watermark.BackgroundColor = Color.Blue;
watermark.TextAlignment = TextAlignment.Right;

watermark.HorizontalAlignment = HorizontalAlignment.Left;
watermark.VerticalAlignment = VerticalAlignment.Top;

// Ajouter un filigrane à la dernière page
WordProcessingContent content = watermarker.GetContent<WordProcessingContent>();
WordProcessingWatermarkPagesOptions options = new WordProcessingWatermarkPagesOptions();
options.PageNumbers = new int[] { content.PageCount };

// Ajouter un filigrane
watermarker.Add(watermark, options);

// Enregistrer le fichier de sortie
watermarker.Save(@"C:\Files\Watermark\AddToSpecificPage_output.docx");
```

## Ajouter un filigrane à l'en-tête ou au pied de page de documents Word à l'aide de C # {#Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp}

Vous pouvez ajouter un filigrane aux sections d'en-tête ou de pied de page des documents Word en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe [Watermarker][14].
  * Créez une instance de la classe [ImageWatermark][21] avec le chemin de l'image pour créer un filigrane d'image.
  * Ensuite, définissez diverses [propriétés du filigrane] [17] telles que l'alignement, la hauteur, la largeur, etc.
  * Créez une instance de la classe [WordProcessingWatermarkSectionOptions][30].
  * Maintenant, définissez [WordProcessingWatermarkSectionOptions.SectionIndex][31] sur 0 pour ajouter un filigrane à la première section du document.
  * Ensuite, appelez la méthode [Watermarker.Add()][18] pour ajouter le filigrane de l'image à la première section.
  * Appelez la méthode [Watermarker.GetContent()][32] pour obtenir le contenu du document chargé et obtenir les résultats dans l'objet de classe [WordProcessingContent][33].
  * Parcourez toutes les sections et appelez la méthode [LinkToPrevious()][34] avec une vraie valeur booléenne comme paramètre d'entrée. Il reliera tous les en-têtes et pieds de page de toutes les sections à la première section.
  * Enfin, appelez la méthode [Watermarker.Save()] [19] pour enregistrer le document Word en filigrane.

L'exemple de code suivant montre **comment ajouter un filigrane à une section d'en-tête ou de pied de page dans un fichier DOCX à l'aide de C#**.
```
// Créer un filigrane
Watermarker watermarker = new Watermarker(@"C:\Files\Watermark\sample.docx");

// Créer un filigrane d'image
using (ImageWatermark watermark = new ImageWatermark(@"C:\Files\Watermark\logo.png"))
{
    // Set watermark properties
    watermark.Height = 100;
    watermark.Width = 100;
    watermark.HorizontalAlignment = HorizontalAlignment.Right;

    // Add watermark to all headers of the first section
    WordProcessingWatermarkSectionOptions options = new WordProcessingWatermarkSectionOptions();
    options.SectionIndex = 0;
    watermarker.Add(watermark, options);
}

// Liez tous les autres en-têtes et pieds de page aux en-têtes et pieds de page correspondants de la première section
WordProcessingContent content = watermarker.GetContent<WordProcessingContent>();
for (int i = 1; i < content.Sections.Count; i++)
{
    content.Sections[i].HeadersFooters.LinkToPrevious(true);
}

// Enregistrer le fichier de sortie
watermarker.Save(@"C:\Files\Watermark\AddWatermarkToHeadersFooters_output.docx");
```

{{< figure align=center src="images/Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp-1024x603.jpg" alt="Ajoutez un filigrane à l'en-tête ou au pied de page des documents Word à l'aide de C#." caption="Ajoutez un filigrane à l'en-tête ou au pied de page des documents Word à l'aide de C #.">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][36].
## Conclusion

Dans cet article, vous avez appris **comment ajouter un filigrane de texte ou d'image dans les documents Word à l'aide de C#**. De plus, vous avez vu **comment ajouter un filigrane à une page spécifique d'un document Word** par programmation. Cet article a également expliqué **comment ajouter un filigrane aux images dans le fichier DOCX** à l'aide de C#. En outre, vous pouvez en savoir plus sur l'API GroupDocs.Watermark pour .NET à l'aide de la [documentation][37]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][38].
## See Also

  * [Ajouter un filigrane au PDF à l'aide de C #][39]
  * [Ajouter un filigrane aux présentations en C #][40]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/add-text-or-image-watermarks-in-word-documents-using-csharp.jpg
 [2]: #CSharp-API-to-Add-Watermark-in-Word-Documents
 [3]: #Add-Text-Watermark-in-Word-Documents-using-CSharp
 [4]: #Add-Image-Watermark-in-Word-Documents-using-CSharp
 [5]: #Watermark-Images-in-Word-Documents-using-CSharp
 [6]: #Add-Watermark-to-Specific-Pages-in-Word-Documents-using-CSharp
 [7]: #Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp
 [8]: https://docs.fileformat.com/word-processing/doc
 [9]: https://docs.fileformat.com/word-processing/docx
 [10]: https://products.groupdocs.com/watermark/java
 [11]: https://docs.groupdocs.com/watermark/net/supported-document-formats/
 [12]: https://downloads.groupdocs.com/watermark/net
 [13]: https://www.nuget.org/packages/groupdocs.watermark
 [14]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/Watermarker
 [15]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/font
 [16]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/textwatermark
 [17]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/textwatermark/properties/index
 [18]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/watermarker/methods/add
 [19]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarker/save/methods/4
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Text-Watermark-in-Word-Documents-using-CSharp.jpg
 [21]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.watermarks/imagewatermark
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Image-Watermark-in-Word-Documents-using-CSharp.jpg
 [23]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/watermarker/methods/getimages
 [24]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.image/watermarkableimagecollection
 [25]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.image/watermarkableimage/methods/add
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Watermark-Images-in-Word-Documents-using-CSharp.jpg
 [27]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarkpagesoptions
 [28]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarkpagesoptions/properties/pagenumbers
 [29]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.wordprocessing/wordprocessingcontent/properties/pagecount
 [30]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarksectionoptions
 [31]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.options.wordprocessing/wordprocessingwatermarksectionoptions/properties/sectionindex
 [32]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark/watermarker/methods/getcontent/_1
 [33]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.wordprocessing/wordprocessingcontent
 [34]: https://apireference.groupdocs.com/watermark/net/groupdocs.watermark.contents.wordprocessing/wordprocessingheaderfootercollection/methods/linktoprevious
 [35]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Watermark-to-Header-or-Footer-of-Word-Documents-using-CSharp.jpg
 [36]: https://purchase.groupdocs.com/temporary-license
 [37]: https://docs.groupdocs.com/watermark/net/
 [38]: https://forum.groupdocs.com/c/watermark/
 [39]: https://blog.groupdocs.com/2021/07/27/watermark-pdf-files-using-csharp/
 [40]: https://blog.groupdocs.com/2021/05/01/add-watermark-to-presentations-using-csharp/





