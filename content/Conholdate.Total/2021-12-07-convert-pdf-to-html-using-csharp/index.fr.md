---
title: "Convertir PDF en HTML en utilisant C#"
author: Muzammil Khan
date: 2021-12-07T13:24:11+00:00
summary: "En tant que développeur C#, vous pouvez facilement convertir vos documents PDF en pages Web HTML. Dans cet article, vous apprendrez <strong>à convertir des documents PDF en pages Web HTML à l'aide de C#</strong> ."
url: /2021/12/07/convert-pdf-to-html-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API CSharp .NET pour PDF en HTML"
  - "Convertir PDF en HTML"
  - "Convertir un PDF en HTML avec CSharp"
  - "PDF vers HTML"

---


{{< figure align=center src="images/convert-pdf-to-html-using-csharp.jpg" alt="Convertir PDF en HTML en utilisant C#">}}
 

[PDF][2] est le format le plus répandu pour partager et imprimer des documents. Dans certains cas, nous pouvons être amenés à convertir des documents PDF en pages Web [HTML][3]. Une telle conversion permet de partager le contenu des documents PDF afin que les parties prenantes concernées puissent les visualiser facilement dans n'importe quel navigateur. Dans cet article, nous allons apprendre **comment convertir des documents PDF en pages Web HTML à l'aide de C#**.
Les sujets suivants seront traités dans cet article :
  * [API C# pour convertir PDF en HTML — Téléchargement gratuit][4]
  * [Conversion PDF en HTML avec C#][5]
  * [Convertir une plage de pages de PDF en HTML][6]
  * [Convertir des pages spécifiques de PDF en HTML][7]
  * [Conversion PDF en HTML avec filigrane en C#][8]

## API C# pour convertir PDF en HTML — Téléchargement gratuit {#CSharp-API-to-Convert-PDF-to-HTML-Free-Download}

Nous utiliserons l'API [GroupDocs.Conversion pour .NET][9] pour convertir le PDF en HTML. Il fournit des solutions de conversion de fichiers rapides, efficaces et fiables aux utilisateurs finaux. Veuillez soit [télécharger][10] la DLL de l'API ou l'installer à l'aide de [NuGet][11].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Conversion</code></pre>
## Conversion PDF en HTML avec C# {#PDF-to-HTML-Conversion-using-CSharp}

Nous pouvons facilement convertir des documents PDF en pages Web HTML par programmation en suivant les étapes simples indiquées ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe **_[Converter][12]_** avec le chemin du fichier d'entrée comme argument. C'est la classe principale qui contrôle le processus de conversion des documents.
  2. Ensuite, créez une instance de la classe [**_MarkupConvertOptions_**][13]. Il fournit diverses options de conversion en types de fichiers de balisage.
  3. Ensuite, définissez éventuellement diverses options de conversion telles que _FixedLayout_, _FixedLayoutShowBorders_, etc.
  4. Enfin, appelez la _**[Converter.Convert()][14]** _method pour enregistrer le fichier HTML converti. Cette méthode prend le chemin du fichier de sortie et convertit les options en argument.

L'exemple de code suivant montre **comment convertir **un document PDF** en une page Web HTML à l'aide de C#**.
```
// Charger le fichier PDF source
Converter converter = new Converter(@"C:\Files\Conversion\sample.pdf");

// Définir les options de conversion pour le format HTML
var options = new MarkupConvertOptions();
options.FixedLayout = true;
options.FixedLayoutShowBorders = false;

// Convertir au format HTML
converter.Convert(@"C:\Files\Conversion\converted.html", options);
```

{{< figure align=center src="images/Convert-PDF-to-HTML-in-CSharp-1024x512.jpg" alt="Convertir PDF en HTML en C#." caption="Convertir PDF en HTML en C#.">}}
 

## Convertir une plage de pages de PDF en HTML {#Convert-Range-of-Pages-from-PDF-to-HTML-in-CSharp}

Nous pouvons convertir une plage de pages d'un document PDF en HTML par programmation en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe **_[Converter][12]_** avec le chemin du fichier d'entrée comme argument.
  2. Ensuite, créez une instance de la classe [**_MarkupConvertOptions_**][13].
  3. Ensuite, définissez le numéro de page pour commencer la conversion à partir de
  4. Après cela, définissez le nombre de pages pour convertir le nombre total de pages
  5. Enfin, appelez la _**[Converter.Convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion pour enregistrer le fichier HTML converti.

L'exemple de code suivant montre **comment convertir **une plage de pages d'un document PDF** en un fichier HTML en C#.**
```
// Charger le fichier PDF source
Converter converter = new Converter(@"C:\Files\Conversion\sample.pdf");

// Définir les options de conversion pour le format HTML
MarkupConvertOptions options = new MarkupConvertOptions();
options.PageNumber = 2; // Start page number
options.PagesCount = 3; // Total pages to convert

// Convertir au format HTML
converter.Convert(@"C:\Files\Conversion\converted_pages_range.pdf", options);
```

## Convertir des pages spécifiques de PDF en HTML {#Convert-Specific-Pages-of-PDF-to-HTML-in-CSharp}

Nous pouvons convertir des pages spécifiques d'un document PDF en HTML en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe **_[Converter][12]_** avec le chemin du fichier d'entrée comme argument.
  2. Ensuite, créez une instance de la classe [**_MarkupConvertOptions_**][13].
  3. Ensuite, fournissez des numéros de page spécifiques dans une liste séparée par des virgules à convertir.
  4. Enfin, appelez la _**[Converter.Convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion pour enregistrer le fichier HTML converti.

L'exemple de code suivant montre **comment convertir **des pages spécifiques d'un document PDF** en un fichier HTML en C#.**
```
// Charger le fichier PDF source
Converter converter = new Converter(@"C:\Files\Conversion\sample.pdf");

// Définir les options de conversion pour le format HTML
MarkupConvertOptions options = new MarkupConvertOptions();
options.Pages = new List<int> { 1, 3 }; // List of page numbers to convert

// Convertir au format HTML
converter.Convert(@"C:\Files\Conversion\converted_specific_pages.pdf", options);
```

## Conversion PDF en HTML avec filigrane en C# {#PDF-to-HTML-Conversion-with-Watermark-in-CSharp}

Nous pouvons convertir des documents PDF en pages Web HTML et ajouter des filigranes aux fichiers HTML convertis par programmation en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe **_[Converter][12]_** avec le chemin du fichier d'entrée comme argument.
  2. Ensuite, créez une instance de la classe _**[WatermarkOptions][16]**_.
  3. Ensuite, définissez diverses options telles que _Text_, _Color_, _Width_, _Height_, _Font_, etc.
  4. Ensuite, créez une instance de la classe [**_MarkupConvertOptions_**][13].
  5. Après cela, attribuez _**WatermarkOptions**_ à **_MarkupConvertOptions_**.
  6. Enfin, appelez la _**[Converter.Convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion pour enregistrer le fichier HTML converti.

L'exemple de code suivant montre **comment convertir un document PDF en un document HTML avec un filigrane**.
```
// Charger le fichier PDF source
Converter converter = new Converter(@"C:\Files\Conversion\sample.pdf");

// Définir le filigrane de texte
WatermarkOptions watermark = new WatermarkTextOptions("This is a sample watermark!")
{
    Color = Color.Red,
    Width = 500,
    Height = 100,
    Top = 0,
    Left = 300,
    Background = true
};

// Définir les options de conversion pour le format HTML
MarkupConvertOptions options = new MarkupConvertOptions();
options.Watermark = watermark;

// Convertir au format HTML
converter.Convert(@"C:\Files\Conversion\converted_with_watermark.html", options);
```

{{< figure align=center src="images/PDF-to-HTML-Conversion-with-Watermark-in-CSharp-1024x880.jpg" alt="Conversion PDF en HTML avec filigrane en C#." caption="Conversion PDF en HTML avec filigrane en C#.">}}
 

## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][18].
## Conclusion

Dans cet article, nous avons appris **comment convertir des documents PDF en pages Web HTML en C#**. Nous avons également vu **comment convertir des pages spécifiques d'un PDF en HTML et ajouter un filigrane au fichier converti** par programmation. En outre, vous pouvez en savoir plus sur l'API GroupDocs.Conversion pour .NET à l'aide de la [documentation][19]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][20].
## See Also

  * [Convertir des PDF en images à l'aide de C#][21]
  * [Convertir un PDF en Excel à l'aide de C#][22]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/convert-pdf-to-html-using-csharp.jpg
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://docs.fileformat.com/web/html/
 [4]: #CSharp-API-to-Convert-PDF-to-HTML-Free-Download
 [5]: #PDF-to-HTML-Conversion-using-CSharp
 [6]: #Convert-Range-of-Pages-from-PDF-to-HTML-in-CSharp
 [7]: #Convert-Specific-Pages-of-PDF-to-HTML-in-CSharp
 [8]: #PDF-to-HTML-Conversion-with-Watermark-in-CSharp
 [9]: https://products.groupdocs.com/conversion/net
 [10]: https://downloads.groupdocs.com/conversion/net
 [11]: https://www.nuget.org/packages/groupdocs.conversion
 [12]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion/Converter
 [13]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/markupconvertoptions
 [14]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.converter/convert/methods/16
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Convert-PDF-to-HTML-in-CSharp.jpg
 [16]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/WatermarkOptions
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/PDF-to-HTML-Conversion-with-Watermark-in-CSharp.jpg
 [18]: https://purchase.conholdate.com/temporary-license
 [19]: https://docs.groupdocs.com/conversion/net/
 [20]: https://forum.groupdocs.com/c/conversion/11
 [21]: https://blog.conholdate.com/2021/09/23/convert-pdf-to-images-using-csharp/
 [22]: https://blog.conholdate.com/2021/03/31/convert-pdf-to-excel-using-csharp/





