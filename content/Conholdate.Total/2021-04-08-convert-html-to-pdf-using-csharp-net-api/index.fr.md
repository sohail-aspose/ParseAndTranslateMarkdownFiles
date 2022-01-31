---
title: "Convertir HTML en PDF à l'aide de l'API C# .NET"
author: Nayyer Shahbaz
date: 2021-04-08T17:54:18+00:00
url: /2021/04/08/convert-html-to-pdf-using-csharp-net-api/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API CSharp .NET pour PDF en HTML"
  - "API CSharp pour convertir HTML en PDF"
  - "Convertir HTML en PDF"
  - "Convertir un PDF en HTML avec CSharp"
  - "API de conversion HTML en PDF"

---


{{< figure align=center src="images/icon-1.png" alt="Conversion PDF en HTML">}}
 

Le [PDF][2] (_Portable Document Format_) est l'un des formats de document largement utilisés pour le partage de données et d'informations multiplateforme. L'une de ses fonctionnalités uniques inclut le fait que la fidélité d'un document reste intacte lors de la visualisation sur n'importe quelle plate-forme utilisant l'application conformément aux spécifications Adobe. En outre, le [HTML][3] (_HyperText Markup Language_) est également un format de fichier de premier plan pour le développement de pages Web et la plupart des navigateurs Web prennent en charge ce format. Cependant, le format PDF est largement accepté car il peut être facilement visualisé sur n'importe quel appareil sans perdre le formatage du document. Par conséquent, dans cet article, nous allons discuter des étapes à suivre pour convertir le fichier [HTML][3] au format [PDF][2] à l'aide de l'API .NET.
  * [API C# pour convertir HTML en PDF][4]
  * [Convertir HTML en PDF en C#][5]
  * [Incorporer des polices lors de la conversion][6]
  * [Convertir des pages Web en PDF][7]
  * [Rendu HTML complet sur une seule page][8]

## API C# pour convertir HTML en PDF {#C--API-to-Convert-HTML-to-PDF}

Afin d'effectuer l'opération de conversion, nous devons d'abord installer [Aspose.PDF pour .NET][9] sur le système. L'API est disponible sur la bibliothèque [NuGet][10]. Veuillez exécuter la commande suivante sur la console du gestionnaire de packages pour l'installer :
<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> Install-Package Aspose.Pdf</pre>
Une fois l'installation terminée, Aspose.PDF pour .NET apparaîtra sous le dossier Packages dans l'explorateur de solutions.
## Convertir HTML en PDF en C# {#Convert-HTML-to-PDF-in-C-}

Ci-dessous sont les étapes sur la façon dont vous pouvez convertir HTML en PDF en utilisant C#
<ol type="1"><li>Créez une instance de la <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/license">classe License</a> pour supprimer toutes les limitations lors du processus de génération de fichiers PDF.</li><li>Créez un objet de la <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions">classe HtmlLoadOptions</a> tout en passant l'URL de base HTML d'entrée comme argument au constructeur <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions">HtmlLoadOptions</a> (…)</li><li>Initialiser l'objet de la <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/document">classe Document</a> et passer l' <a href="https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions">objet HtmlLoadOptions</a> comme argument à son constructeur</li><li>Appelez la <a href="https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4">méthode Save</a> (…) de l'objet Document et rendez la sortie au format PDF</li></ol>
```
// créer un objet pour initier la licence
Aspose.Pdf.License license = new Aspose.Pdf.License();

// fournir le chemin du fichier de licence
license.SetLicense("/Downloads/Conholdate.Total.NET.lic");

// créer une instance de la classe HtmlLoadOptions
Aspose.Pdf.HtmlLoadOptions htmlLoadOptions = new Aspose.Pdf.HtmlLoadOptions("User/Documents/");

// créer un objet Document et fournir le chemin du fichier HTML d'entrée
Aspose.Pdf.Document document = new Aspose.Pdf.Document("/Documents/input.html", htmlLoadOptions);

// enregistrer le résultat HTML au format PDF
document.Save("/Documents/Converted.pdf");
```

## Incorporer des polices lors de la conversion {#Embed-fonts-during-conversion}

La plupart des pages HTML utilisent souvent des polices (par exemple, des polices de dossiers locaux, Google Fonts, etc.), et afin de préserver la mise en page des pages, les mêmes polices doivent être intégrées pendant le processus de rendu. Ainsi, afin de contrôler l'incorporation des polices dans le document résultant, nous devons utiliser la propriété [IsEmbedFonts][11].
```
// Incorporer des polices lors de la conversion
HtmlLoadOptions options = new HtmlLoadOptions {IsEmbedFonts = true};
```

L'unité de mesure dans Aspose.PDF est Points. Et, nous savons que A3 mesure 297 × 420 millimètres ou 11,69 × 16,54 pouces. Ainsi, les dimensions sont arrondies à 842 × 1190 points. Dans l'extrait de code suivant, nous ajustons la taille de la page du document résultant en A3 et l'orientation de la page en Paysage.
```
// Définissez la taille de la page sur A3 et l'orientation de la page sur Paysage
HtmlLoadOptions options = new HtmlLoadOptions(url)
{
  PageInfo = {Width = 842, Height = 1191, IsLandscape = true}
};
```

## Convertir une page Web en PDF {#Convert-Web-page-to-PDF}

Outre la conversion de fichiers HTML, nous pouvons également avoir besoin de convertir directement une page Web au format PDF. Donc, pour répondre à cette exigence, nous allons d'abord récupérer le contenu de la page Web distante à l'aide de l'instance HttpClient, créer un objet Stream, puis transmettre l'instance Stream à l'objet Document. La raison pour laquelle nous avons besoin du contenu dans Stream est que l'instance Document n'accepte que les fichiers ou les objets Steam.
La section suivante explique les étapes à suivre pour convertir une page Web en PDF à l'aide de C#
  1. Lire le contenu de la page à l'aide d'un objet [HttpClient][12]
  2. Instanciez l'objet [][13][HtmlLoadOptions][13] et définissez l'URL de base
  3. Initialiser un objet [Document][14] et passer l'objet stream et l'instance [HtmlLoadOptions][13] comme arguments
  4. Appelez la méthode [Save(String)][15] de la classe Document pour générer la sortie

```
public static void ConvertHTMLtoPDFAdvanced_WebPage()
{
    const string url = "https://en.wikipedia.org/wiki/Aspose_API";
    
    // Set page size A3 and Landscape orientation; 
    HtmlLoadOptions options = new HtmlLoadOptions(url)
    {
        // Set the page dimensions
        PageInfo = {Width = 842, Height = 1191, IsLandscape = true}
    };
    
    // Create an instance of Document object
    Document pdfDocument= new Document(GetContentFromUrlAsStream(url), options);
    
    // Save the resultant
    pdfDocument.Save(_dataDir + "html_test.PDF");
}

private static Stream GetContentFromUrlAsStream(string url, ICredentials credentials = null)
{
    
    using (var handler = new HttpClientHandler { Credentials = credentials })
    using (var httpClient = new HttpClient(handler))
    {
        // fetch and return results in stream instance
        return httpClient.GetStreamAsync(url).GetAwaiter().GetResult();
    }
}
```

## Rendu HTML complet sur une seule page {#Render-complete-HTML-on-a-single-page}

Lors de la conversion HTML en PDF, la longueur du fichier résultant est fonction de la longueur du contenu d'un document HTML d'entrée. Par conséquent, si le code HTML d'entrée est composé de plusieurs pages, le fichier résultant s'étendra également sur plusieurs pages. Cependant, nous pouvons limiter la sortie à une seule page PDF. Afin de répondre à cette exigence, la propriété [IsRenderToSinglePage][16] de la classe HtmlLoadOptions peut être utilisée.
Vous trouverez ci-dessous l'extrait de code permettant d'afficher le contenu HTML complet sur une seule page PDF à l'aide de C#.
```
// Pour des exemples complets et des fichiers de données, rendez-vous sur https://github.com/aspose-pdf/Aspose.PDF-for-.NET
// Initialiser l'objet HtmlLoadOptions
HtmlLoadOptions options = new HtmlLoadOptions();

// Définir le rendu sur une propriété de page unique
options.IsRenderToSinglePage = true;

// Charger le contenu HTML de la source du document
Document pdfDocument= new Document("/Documents/HTMLToPDF.html", options);

// Enregistrez le fichier PDF résultant
pdfDocument.Save("/Documents/MyRenderContentToSamePage.pdf");
```

## Get a Free License

Vous pouvez demander <a rel="noreferrer noopener" href="https://purchase.aspose.com/temporary-license" >une licence temporaire gratuite</a> pour essayer l'API sans aucune limitation d'évaluation.
## Conclusion {#Conclusion}

Dans cet article, nous avons découvert l'approche de conversion des fichiers HTML au format PDF à l'aide de l'API .NET. Si vous souhaitez en savoir plus sur les autres fonctionnalités intéressantes offertes par Aspose.PDF pour .NET, veuillez visiter la page [Fonctionnalités clés][17]. Un ensemble complet d'exemples peut être trouvé sur le [référentiel GitHub][18].
## Quick Tip

Nous avons également développé des applications en ligne gratuites pour vérifier rapidement les fonctionnalités offertes par nos API. Vous pouvez donc consulter [Aspose.PDF Conversion App][19] pour transformer le fichier HTML au format PDF. En outre, vous pouvez également utiliser divers autres formats de fichiers et répondre à vos besoins de conversion.
 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/icon-1.png
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://docs.fileformat.com/web/html/
 [4]: #C--API-to-Convert-HTML-to-PDF
 [5]: #Convert-HTML-to-PDF-in-C-
 [6]: #Embed-fonts-during-conversion
 [7]: #Convert-Web-page-to-PDF
 [8]: #Render-complete-HTML-on-a-single-page
 [9]: https://products.aspose.com/pdf/net
 [10]: https://www.nuget.org/packages/Aspose.PDF/
 [11]: https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions/properties/isembedfonts
 [12]: https://docs.microsoft.com/en-us/dotnet/api/system.net.http.httpclient?view=net-5.0
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions
 [14]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [15]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf/htmlloadoptions/properties/isrendertosinglepage
 [17]: https://docs.aspose.com/pdf/net/key-features/
 [18]: https://github.com/aspose-pdf/Aspose.Pdf-for-.NET
 [19]: https://products.aspose.app/pdf/conversion





