---
title: "Conversion d'image en PDF à l'aide de l'API C# .NET"
author: Nayyer Shahbaz
date: 2021-04-01T17:42:08+00:00
url: /2021/04/01/image-to-pdf-conversion-using-csharp-net-apis/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API .NET pour JPEG en PDF"
  - "Convertir une image en PDF"
  - "Conversion d'images en PDF"
  - "API de conversion JPEG en PDF"
  - "API de conversion PNG en PDF"

---


{{< figure align=center src="images/JPEG-PDF.jpg" alt="Conversion d'images en PDF">}}
 

"**Une image vaut mieux que mille mots**". Les idées peuvent être véhiculées par une seule **image** fixe dans un mécanisme plus efficace qu'une simple description verbale. Par conséquent, les images sont largement utilisées dans la vie quotidienne. Une grande variété de formats d'image, y compris [JPEG][2], [PNG][3], [BMP][4], [GIF][5], [TIFF][6], etc. sont utilisés pour le partage d'informations. Cependant, si nous tombons sur l'obligation de partager un grand nombre d'images, nous devons soit les archiver dans un seul lot, soit créer un livret dans un format qui peut être facilement visualisé à la réception. Ainsi, notre choix est Portable Document Format ([PDF] [7]) car il maintient la fidélité du document indépendamment du logiciel d'application, du matériel ainsi que du système d'exploitation utilisé pour visualiser le fichier. Par conséquent, dans cet article, nous allons parler de la fonctionnalité de conversion d'image en PDF à l'aide des API [Conholdate.Total pour .NET][8].
<blockquote class="wp-block-quote">  
Cependant, avant d'aller plus loin, discutons de certains points mettant en évidence une différence entre Conholdate.Total pour .NET et Aspose.Total pour .NET.  
</blockquote>
[Aspose.Total pour .NET][9] est une collection d'API de programmation spécifiquement développées pour créer, manipuler et transformer les principaux formats de fichiers. Il comprend Word, Excel, PDF, PowerPoint, Outlook, Diagram, MS Project, HTML et plus de 100 autres formats de fichiers, tous dans les applications standard de bureau, console, ASP.NET et VB.NET.
Cependant, [Conholdate.Total pour .NET][8] inclut également Aspose.Total pour .NET. Mais, il inclut également [GroupDocs.Total pour .NET][10]. Il offre des fonctionnalités supplémentaires pour afficher, convertir, annoter, comparer, signer, assembler, modifier, rechercher et analyser les formats de document les plus couramment utilisés. Ainsi, dans ce package unique, vous obtenez les capacités de charger des fichiers, de les afficher, de les manipuler et de rendre la sortie dans d'autres formats pris en charge, c'est-à-dire [Charger le fichier MS Word et enregistrer au format JPEG] [11].
Ainsi, dans cet article, nous allons discuter de la fonctionnalité permettant de charger le [fichier image raster][12] et d'enregistrer la sortie au format [PDF][7] à l'aide de C# .NET.
  * [Convertir une image en PDF en C#][13]
  * [Obtenez une licence gratuite][14]

## Convertir une image en PDF en C# {#Convert-Image-to-PDF-in-Csharp}

L'API est une solution de programmation leader offrant les capacités de traiter MS Word ([DOC][15], [DOCX][16], [RTF][17], [DOT][18], [DOTX][19] , [DOTM][20], [DOCM][21]), **OpenOffice :** [ODT][22], [OTT][23]. L'API permet aux développeurs de modifier, générer, rendre, convertir et imprimer des documents sans utiliser Microsoft Word. Il prend en charge la fonction de rendu de la sortie en [DOC][15], [RTF][17], [HTML][24], [OpenDocument][22], [PDF][7], [XPS][25] , [EPUB][26], et bien d'autres. Nous pouvons donc utiliser cette API pour la conversion d'image en PDF.
Pour utiliser l'API, vous pouvez soit [télécharger][27] le fichier .dll ou ouvrir le gestionnaire de packages [NuGet][28], rechercher **Aspose.Words** et installer. Veuillez exécuter la commande suivante sur la console du gestionnaire de packages pour l'installer.
<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> Install-Package Aspose.Words -Version 21.3.0</pre>
Veuillez suivre les étapes ci-dessous pour effectuer l'opération de conversion
**C#.NET**
  * Créez une instance de la classe [Document][29].
  * Créez une instance de [DocumentBuilder][30] et transmettez l'objet Document en tant qu'argument.
  * Appelez la méthode [InsertImage(…)][31] de la classe DocumentBuilder et passez le chemin de l'image source comme argument.
  * Appelez la méthode [Save][32](..) et fournissez le nom du fichier résultant comme argument.

```
// Pour des exemples complets et des fichiers de données, rendez-vous sur https://github.com/aspose-words/Aspose.Words-for-.NET
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertImage(dataDir + "Watermark.png");
dataDir = dataDir + "DocumentBuilderInsertInlineImage_out.doc";
doc.Save(dataDir);
```

## Obtenez une licence gratuite {#Get-a-Free-License}

Afin d'utiliser l'API sans aucune limitation, veuillez envisager de demander une [licence temporaire gratuite][33].
## Conclusion

Dans cet article, nous avons découvert les capacités du package [Conholdate.Total for .NET][8] pour la conversion d'images raster au format PDF.
## **Related articles**

Vous pouvez envisager de visiter les liens suivants pour plus de détails sur
  * [Convertir des fichiers PDF en SVG à l'aide de C#][34]
  * [Convertir des pages PDF en images PNG à l'aide de C#][35]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/03/JPEG-PDF.jpg
 [2]: https://docs.fileformat.com/image/jpeg/
 [3]: https://docs.fileformat.com/image/png/
 [4]: https://docs.fileformat.com/image/bmp/
 [5]: https://docs.fileformat.com/image/gif/
 [6]: https://docs.fileformat.com/image/tiff/
 [7]: https://docs.fileformat.com/pdf/
 [8]: https://products.conholdate.com/total/net
 [9]: https://products.aspose.com/total/net
 [10]: https://products.groupdocs.com/total/net
 [11]: https://docs.aspose.com/words/net/converting-to-fixed-page-format/
 [12]: https://docs.fileformat.com/image/
 [13]: #Convert-Image-to-PDF-in-Csharp
 [14]: #Get-a-Free-License
 [15]: https://docs.fileformat.com/word-processing/doc/
 [16]: https://docs.fileformat.com/word-processing/docx/
 [17]: https://docs.fileformat.com/word-processing/rtf/
 [18]: https://docs.fileformat.com/word-processing/dot/
 [19]: https://docs.fileformat.com/word-processing/dotx/
 [20]: https://docs.fileformat.com/word-processing/dotm/
 [21]: https://docs.fileformat.com/word-processing/docm/
 [22]: https://docs.fileformat.com/word-processing/odt/
 [23]: https://docs.fileformat.com/word-processing/ott/
 [24]: https://docs.fileformat.com/web/html/
 [25]: https://docs.fileformat.com/page-description-language/xps/
 [26]: https://docs.fileformat.com/ebook/epub/
 [27]: https://downloads.aspose.com/words/net
 [28]: https://www.nuget.org/packages/Aspose.Words/
 [29]: https://apireference.aspose.com/words/net/aspose.words/document
 [30]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder
 [31]: https://apireference.aspose.com/words/net/aspose.words.documentbuilder/insertimage/methods/9
 [32]: https://apireference.aspose.com/words/net/aspose.words.document/save/methods/2
 [33]: https://purchase.aspose.com/temporary-license
 [34]: https://blog.aspose.com/2021/02/04/convert-pdf-files-to-svg-using-csharp/
 [35]: https://blog.aspose.com/2020/11/25/pdf-to-png-using-csharp/





