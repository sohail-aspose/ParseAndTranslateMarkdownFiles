---
title: "Convertir HTML en document Word à l'aide de C#"
author: Muzammil Khan
date: 2021-12-21T10:40:33+00:00
summary: "En tant que développeur C#, vous pouvez facilement générer des documents Word à partir de fichiers HTML ou d'URL en direct. Dans cet article, vous apprendrez <strong>à convertir des documents HTML en documents Word à l'aide de C#</strong> ."
url: /2021/12/21/convert-html-to-word-document-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Convertir HTML en DOCX"
  - "Convertir HTML en DOCX dans CSharp"
  - "HTML vers Word"
  - "HTML vers Word dans CSharp"

---


{{< figure align=center src="images/Convert-HTML-to-Word-in-CSharp-1.jpg" alt="Convertir HTML en document Word à l'aide de C#">}}
 

[HTML][2] (_HyperText Markup Language_) est le principal format de fichier pour les pages Web pris en charge par tous les navigateurs. Dans divers cas, nous pouvons avoir besoin de convertir des fichiers HTML ou du contenu de pages Web actives en documents Word (_[DOC][3], [DOCX,][4] [DOT][5], [DOTM][6], [ DOCM][7]_). Il aide à modifier le texte des pages Web HTML ou à appliquer la mise en forme du texte. Dans cet article, nous allons apprendre **comment convertir HTML en un document Word à l'aide de C#.**
Les sujets suivants seront traités dans cet article :
  * [API C# pour convertir HTML en DOCX — Téléchargement gratuit][8]
  * [Convertir HTML en Word en C#][9]
  * [Convertir une page Web en Word à partir d'une URL en C#][10]
  * [Conversion de chaîne HTML en mot à l'aide de C #][11]

## API C# pour convertir HTML en DOCX — Téléchargement gratuit {#CSharp-API-to-Convert-HTML-to-DOCX-Free-Download}

Pour convertir des fichiers HTML ou des pages Web en formats de fichiers de traitement de texte, nous utiliserons l'API [Aspose.Words pour .NET][12]. C'est une solution complète pour créer, éditer, convertir ou analyser des documents Word par programmation. Veuillez soit [télécharger][13] la DLL de l'API ou l'installer à l'aide de [NuGet][14].
<pre class="wp-block-code"><code>Install-Package Aspose.Words</code></pre>
## Convertir HTML en Word en C# {#Convert-HTML-to-Word-in-CSharp}

Nous pouvons facilement convertir des fichiers HTML en documents Word par programmation en suivant les étapes ci-dessous :
  1. Chargez un fichier HTML à l'aide de la classe _**[Document][15]**_.
  2. Appelez la méthode [**_Document.Save(string, SaveFormat)_**][16] pour enregistrer le fichier HTML sous « output.docx ».

L'énumération _**[SaveFormat][17]**_ dans la méthode _Document.Save()_ spécifie le format dans lequel vous souhaitez convertir le fichier HTML. L'exemple de code suivant montre **comment convertir un fichier HTML en DOCX à l'aide de C#**.
```
// Cet exemple de code montre comment convertir un fichier HTML en un document Word à l'aide de C#.
// Charger le fichier HTML à l'aide de la classe Document
Document document = new Document(@"C:\Files\sample.html");

// Convertir le fichier HTML au format Word DOCX
document.Save(@"C:\Files\output.docx", SaveFormat.Docx);
```

{{< figure align=center src="images/Convert-HTML-to-Word-in-CSharp-1024x512.jpg" alt="" légende="Convert HTML to Word in C#.">}}
 

## Convertir une page Web en Word à partir d'une URL en C# {#Convert-a-Web-Page-to-Word-from-URL-in-CSharp}

Nous pouvons également convertir une page Web HTML directement d'une URL en direct vers un document Word en suivant les étapes ci-dessous :
  1. Tout d'abord, téléchargez le contenu de la page Web en tant que tableau _System.Byte_ à partir de l'URL spécifiée.
  2. Ensuite, lancez l'objet _MemoryStream_ avec un objet tableau comme argument.
  3. Créez ensuite une instance de la classe **_[HtmlLoadOptions][19]{.broken_link} _**.
  4. Après cela, créez une instance de la classe **_[Document][20] _** et initialisez-la avec les objets _MemoryStream_ et _HtmlLoadOptions_.
  5. Enfin, appelez la méthode [**_Document.Save(string, SaveFormat)_**][16] pour enregistrer le fichier HTML sous « output.docx ».

L'exemple de code suivant montre **comment convertir une page Web HTML en DOCX à l'aide de C#**.
```
// Cet exemple de code montre comment enregistrer une page Web HTML directement à partir d'une URL en direct dans un document Word à l'aide de C#.
// L'URL
string Url = "https://en.wikipedia.org/wiki/Aspose.Words";

// Définir les options de chargement HTML 
HtmlLoadOptions options = new HtmlLoadOptions();

byte[] imageData = null;

// Télécharger le contenu de l'URL en tant que tableau d'octets
using (var wc = new System.Net.WebClient())
    imageData = wc.DownloadData(Url);

// Convertir le tableau d'octets en flux
var urlStream =  new MemoryStream(imageData);

// Créer une instance de l'objet Document
Document document = new Document(urlStream, options);

// Enregistrer au format DOCX
document.Save(@"C:\Files\output_url.docx", SaveFormat.Docx);
```

## Convertir une chaîne HTML en Word à l'aide de C# {#Convert-an-HTML-String-to-Word-using-CSharp}

Nous pouvons générer dynamiquement un document Word à partir d'une chaîne HTML en suivant les étapes ci-dessous :
  1. Tout d'abord, créez une instance de la classe **_[Document][20]_**.
  2. Ensuite, créez une instance de la classe **_[DocumentBuilder][21]_** avec l'objet _Document_.
  3. Ensuite, insérez du code HTML dans le document à l'aide de la méthode [_**DocumentBuilder.InsertHtml(string)**_][22].
  4. Enfin, enregistrez le document Word à l'aide de la méthode [**_Document.Save(string, SaveFormat)_**][16].

L'exemple de code suivant montre **comment convertir une chaîne HTML en DOCX à l'aide de C#**.
```
// Cet exemple de code montre comment générer un document Word à partir d'une chaîne HTML à l'aide de C#.
// Créer un nouveau document
Document document = new Document();

// Créer un générateur de documents
DocumentBuilder builder = new DocumentBuilder(document);

// Insérer HTML
builder.InsertHtml("<ul>\r\n" +
    "<li>Item1</li>\r\n" +
    "<li>Item2</li>\r\n" +
    "</ul>");

// Enregistrer au format DOCX
document.Save(@"C:\Files\html-string-as-word.docx", SaveFormat.Docx);
```

## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][23].
## Conclusion

Dans cet article, nous avons appris **comment convertir HTML en un document Word à l'aide de C#**. Nous avons également vu **comment convertir des pages Web en direct d'une URL en fichiers Word** par programmation. En outre, vous pouvez en savoir plus sur l'API Aspose.Words pour .NET en utilisant la [documentation][24]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][25].
## See Also

  * [Créer des graphiques dans des documents Word à l'aide de C#][26]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Convert-HTML-to-Word-in-CSharp-1.jpg
 [2]: https://docs.fileformat.com/web/html/
 [3]: https://docs.fileformat.com/word-processing/doc/
 [4]: https://docs.fileformat.com/word-processing/docx/
 [5]: https://docs.fileformat.com/word-processing/dot/
 [6]: https://docs.fileformat.com/word-processing/dotm/
 [7]: https://docs.fileformat.com/word-processing/docm/
 [8]: #CSharp-API-to-Convert-HTML-to-DOCX-Free-Download
 [9]: #Convert-HTML-to-Word-in-CSharp
 [10]: #Convert-a-Web-Page-to-Word-from-URL-in-CSharp
 [11]: #Convert-an-HTML-String-to-Word-using-CSharp
 [12]: https://products.aspose.com/words/net/
 [13]: https://downloads.aspose.com/words/net
 [14]: https://www.nuget.org/packages/aspose.words
 [15]: https://apireference.aspose.com/words/net/aspose.words/document
 [16]: https://apireference.aspose.com/words/net/aspose.words.document/save/methods/3
 [17]: https://apireference.aspose.com/words/net/aspose.words/SaveFormat
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Convert-HTML-to-Word-in-CSharp.jpg
 [19]: https://apireference.aspose.com/words/net/aspose.words/HtmlLoadOptions
 [20]: https://apireference.aspose.com/words/net/aspose.words/Document
 [21]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder
 [22]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder/methods/inserthtml
 [23]: https://purchase.conholdate.com/temporary-license
 [24]: https://docs.aspose.com/words/net/
 [25]: https://forum.aspose.com/c/words/8
 [26]: https://blog.conholdate.com/2021/10/31/create-charts-in-word-documents-using-csharp/





