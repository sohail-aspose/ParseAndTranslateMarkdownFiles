---
title: "Rendu des archives ZIP à l'aide de C#"
author: Muzammil Khan
date: 2021-07-06T10:34:08+00:00
summary: "Vous pouvez facilement restituer vos archives ZIP par programmation dans des applications .NET. Dans cet article, vous apprendrez <strong>à rendre des archives ZIP à l'aide de C#</strong> ."
url: /2021/07/06/render-zip-archives-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API CSharp pour afficher les fichiers ZIP"
  - "GroupDocs.Viewer pour .NET"
  - "Rendu des archives ZIP en HTML"
  - "Rendre les archives ZIP en PDF"
  - "Rendu des archives ZIP au format JPG"

---


{{< figure align=center src="images/render-zip-archives-using-csharp.jpg" alt="Rendu des archives ZIP à l'aide de C#">}}
 

Les fichiers ZIP contiennent un ou plusieurs fichiers ou dossiers compressés pour agir comme un seul fichier. Ceux-ci sont largement utilisés pour économiser de l'espace de stockage et augmenter les performances de vos ordinateurs. Vous pouvez transférer efficacement vos fichiers et dossiers dans une archive ZIP d'un emplacement à un autre. En tant que développeur C#, vous pouvez facilement restituer des archives ZIP et afficher leur contenu par programmation. Cet article se concentrera sur **comment rendre les archives ZIP à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour afficher les fichiers ZIP][2]
  * [Rendu des archives ZIP en HTML][3]
  * [Rendre un dossier spécifique à partir d'archives ZIP en HTML][4]
  * [Afficher le contenu des archives ZIP au format PDF][5]
  * [Rendu des archives ZIP au format JPG][6]
  * [Obtenir une liste de dossiers à partir d'archives ZIP][7]
  * [Rendre et renommer les fichiers ZIP][8]

## API C# pour afficher les fichiers ZIP {#csharp-zip-viewer-api}

Pour le rendu des fichiers ZIP, j'utiliserai [GroupDocs.Viewer for .NET API][9]. Il s'agit d'une puissante API de visionneuse de documents qui prend en charge plus de 170 types de fichiers et de documents. L'API fournit la solution de visualisation de documents la plus flexible pour rendre et afficher des formats de fichiers largement utilisés n'importe où sans installer de logiciel externe. Il vous permet également de visualiser rapidement des fichiers PDF, HTML, XML, Microsoft Office Word, des feuilles de calcul Excel, des présentations PowerPoint, des e-mails Outlook, des diagrammes Visio, des projets, des métafichiers, des images et divers autres formats de fichiers avec facilité et avec moins de risques de programmation.
Vous pouvez soit [télécharger][10] la DLL de l'API, soit l'installer à l'aide de [NuGet][11].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Viewer</code></pre>
## Rendu des archives ZIP en HTML {#render-zip-to-html}

Vous pouvez afficher le fichier ZIP au format HTML en suivant les étapes simples ci-dessous :
  1. Créez une instance de la _**[Viewer][12]** _class
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de [_**HtmlViewOptions**_ ][13]classe
  4. Indiquez le chemin du fichier de sortie
  5. Appelez la méthode _**[View()][14]**_ et passez HtmlViewOptions

L'exemple de code suivant montre **comment rendre le fichier ZIP au format HTML à l'aide de C#**.
```
// initialiser la visionneuse
Viewer viewer = new Viewer("C:\\Files\\sample.zip");

// définir les options d'affichage HTML
HtmlViewOptions viewOptions = HtmlViewOptions.ForEmbeddedResources("C:\\Files\\output.html");
viewOptions.RenderToSinglePage = true;

// créer une vue
viewer.View(viewOptions);
```

{{< figure align=center src="images/render-zip-to-html-1024x499.jpg" alt="Rendu des archives ZIP en HTML" caption="Rendu des archives ZIP en HTML">}}
 

La classe **[Viewer][12]** est la classe principale qui fournit des fonctionnalités pour contrôler le processus de rendu du document. La méthode [View()][14] de cette classe crée la vue de toutes les pages du document.
La classe **[HtmlViewOptions ][13]** fournit des options pour le rendu des documents au format HTML. La méthode constructeur [ForEmbeddedResources][16] crée une nouvelle instance de la classe _HtmlViewOptions_ pour le rendu en HTML avec des ressources intégrées. Comme vous pouvez le voir, j'ai fourni le chemin du fichier de sortie dans l'exemple de code.
Vous pouvez trouver plus de détails sur "[Document HTML Viewer][17]" dans la documentation.
## Rendre un dossier spécifique à partir d'archives ZIP en HTML {#Render-Specific-Folder-from-ZIP-Archives}

Vous pouvez rendre un dossier spécifique disponible dans le fichier ZIP en HTML en suivant les étapes simples ci-dessous :
  1. Créez une instance de la _**[Viewer][12]** _class
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de [_**HtmlViewOptions**_ ][13]classe
  4. Indiquez le chemin du fichier de sortie
  5. Définissez le nom du dossier à rendre
  6. Appelez la méthode _**[View()][14]**_ et passez HtmlViewOptions

L'exemple de code suivant montre **comment rendre un dossier spécifique à partir du fichier ZIP en HTML à l'aide de C#**.
```
// initialiser la visionneuse
Viewer viewer = new Viewer("C:\\Files\\sample.zip");

// définir les options d'affichage HTML
HtmlViewOptions viewOptions = HtmlViewOptions.ForEmbeddedResources("C:\\Files\\output.html");
// définir le nom du dossier
viewOptions.ArchiveOptions.Folder = "ThirdFolderWithItems";

// créer une vue
viewer.View(viewOptions);
```

{{< figure align=center src="images/Render-Specific-Folder-from-ZIP-Archives-1024x457.jpg" alt="Rendre un dossier spécifique à partir d'archives ZIP en HTML" caption="Rendre un dossier spécifique à partir d'archives ZIP en HTML">}}
 

La classe **[ArchiveOptions][19]** fournit des options pour le rendu des fichiers d'archive. Il vous permet de rendre un dossier spécifique à partir d'archives ZIP en fournissant le nom du dossier disponible dans l'archive.
## Afficher le contenu des archives ZIP au format PDF {#render-zip-to-pdf}

Vous pouvez rendre le fichier ZIP dans un document PDF en suivant les étapes simples ci-dessous :
  1. Créez une instance de la _**[Viewer][12]** _class
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de [_**PdfViewOptions**_ ][20]classe
  4. Indiquez le chemin du fichier de sortie
  5. Appelez la méthode _**[View()][14]**_ et passez PdfViewOptions

L'exemple de code suivant montre **comment rendre le fichier ZIP au format PDF à l'aide de C#**.
```
// initialiser la visionneuse
Viewer viewer = new Viewer("C:\\Files\\sample.zip");

// définir les options d'affichage PDF
PdfViewOptions options = new PdfViewOptions("C:\\Files\\output.pdf");

// créer une vue
viewer.View(viewOptions);
```

{{< figure align=center src="images/render-zip-to-pdf-1024x539.jpg" alt="Afficher le contenu des archives ZIP au format PDF" caption="Afficher le contenu des archives ZIP au format PDF">}}
 

La classe **[PdfViewOptions][20] **fournit des options pour le rendu des documents au format PDF. Vous pouvez trouver plus de détails sur "[Document PDF Viewer][22]" dans la documentation.
## Rendu des archives ZIP au format JPG {#render-zip-to-jpg}

Vous pouvez rendre le fichier ZIP en image JPG en suivant les étapes simples ci-dessous :
  1. Créez une instance de la _**[Viewer][12]** _class
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de [_**JpgViewOptions**_ ][23]classe
  4. Indiquez le chemin du fichier de sortie
  5. Appelez la méthode _**[View()][14]**_ et passez JpgViewOptions

L'exemple de code suivant montre **comment rendre le fichier ZIP en image JPG à l'aide de C#**.
```
// initialiser la visionneuse
Viewer viewer = new Viewer("C:\\Files\\sample.zip");

// définir les options d'affichage JPG
JpgViewOptions options = new JpgViewOptions("C:\\Files\\output_page_{0}.jpg");

// créer une vue
viewer.View(viewOptions);
```

{{< figure align=center src="images/render-zip-to-jpg-1024x537.jpg" alt="Rendu des archives ZIP au format JPG" caption="Rendu des archives ZIP au format JPG">}}
 

Vous pouvez restituer des documents aux formats d'image JPG ou PNG. La classe **[JpgViewOptions][23] **fournit des options pour le rendu des documents au format JPG. De même, la classe **[PngViewOptions][25] **fournit des options pour rendre les documents au format PNG.
Vous pouvez trouver plus de détails sur "[Document Image Viewer][26]" dans la documentation.
## Obtenir une liste de dossiers à partir d'archives ZIP {#Get-a-List-of-Folders-from-ZIP-archives}

Vous pouvez obtenir une liste de tous les dossiers et sous-dossiers du fichier ZIP par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la _**[Viewer][12]** _class
  2. Indiquez le chemin du fichier d'entrée
  3. Créer **_[ViewInfoOptions][27]_**
  4. Créez une instance **_[ViewInfo][28]_** en appelant la méthode [_**GetViewInfo()**_][29]
  5. Obtenez **_[ArchiveViewInfo][30]_**
  6. Afficher les résultats

L'exemple de code suivant montre **comment obtenir une liste de dossiers à partir du fichier ZIP à l'aide de C#**.
```
// initialiser la visionneuse
Viewer viewer = new Viewer("C:\\Files\\sample.zip");

// créer des options d'informations d'affichage
ViewInfoOptions viewInfoOptions = ViewInfoOptions.ForHtmlView();
ViewInfo viewInfo = viewer.GetViewInfo(viewInfoOptions);

Console.WriteLine("File type: " + viewInfo.FileType);
Console.WriteLine("Pages count: " + viewInfo.Pages.Count);
Console.WriteLine("Folders: ");
Console.WriteLine(" - /");

string rootFolder = string.Empty;
viewInfoOptions.ArchiveOptions.Folder = rootFolder;

// obtenir des informations sur les vues
ArchiveViewInfo viewFolderInfo = viewer.GetViewInfo(viewInfoOptions) as ArchiveViewInfo;

foreach (string subFolder in viewFolderInfo.Folders)
{
    Console.WriteLine($" - {subFolder}");
    PrintFolders(viewer, subFolder);
}
```

{{< figure align=center src="images/Get-a-List-of-Folders-from-ZIP-archives-1024x598.jpg" alt="Obtenir une liste de dossiers à partir d'archives ZIP" caption="Obtenir une liste de dossiers à partir d'archives ZIP">}}
 

La classe **[ViewInfoOptions][27]** fournit des options utilisées pour récupérer les informations sur la vue. Il fournit diverses méthodes pour obtenir des informations sur la vue pour des formats spécifiques. J'ai utilisé la méthode [ForHtmlView()][32] qui initialise une nouvelle instance de la classe ViewInfoOptions pour récupérer des informations sur la vue lors du rendu en HTML.
La classe **[ViewInfo][28]** fournit des informations d'affichage pour les documents génériques. La méthode [GetViewInfo()][29] de la classe Viewer renvoie des informations sur la vue et des informations spécifiques au document.
La classe **[ArchiveViewInfo][30]** fournit des informations d'affichage pour le fichier d'archive.
## Rendre et renommer les fichiers ZIP {#Render-and-Rename-ZIP-Files}

Vous pouvez renommer les fichiers ZIP lors du rendu par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la _**[Viewer][12]** _class
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de [_**PdfViewOptions**_ ][20]classe
  4. Indiquez le chemin du fichier de sortie
  5. Définir le nouveau nom de fichier à afficher
  6. Appelez la méthode _**[View()][14]**_ et passez PdfViewOptions

L'exemple de code suivant montre **comment renommer le fichier ZIP lors du rendu à l'aide de C#**.
```
// initialiser la visionneuse
Viewer viewer = new Viewer("C:\\Files\\sample.zip");

// définir les options d'affichage PDF
PdfViewOptions viewOptions = new PdfViewOptions("C:\\Files\\output.pdf");
// définir un nouveau nom de fichier
viewOptions.ArchiveOptions.FileName = new FileName("MyFiles");

viewer.View(viewOptions);
```

{{< figure align=center src="images/Render-and-Rename-ZIP-Files-1024x538.jpg" alt="Rendre et renommer les fichiers ZIP" caption="Rendre et renommer les fichiers ZIP">}}
 

La classe **[ArchiveOptions][19]** fournit la propriété _FileName_ qui est utilisée pour afficher le nom du fichier dans l'en-tête. Vous pouvez définir un nouveau nom d'affichage comme indiqué dans l'exemple de code ci-dessus. Par défaut, il affiche le nom du fichier source.
## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][34].
## Conclusion

Dans cet article, vous avez appris **comment rendre des archives ZIP à l'aide de C#**. Vous avez également appris **comment convertir et afficher le contenu des fichiers ZIP** en images HTML, PDF et JPG. De plus, vous avez appris **comment obtenir une liste de dossiers et de sous-dossiers à partir de l'archive ZIP** par programmation en C#. Vous pouvez en savoir plus sur l'API GroupDocs.Viewer pour .NET à l'aide de la [documentation][35]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][36].
## See Also

  * [Afficher les fichiers CAO en C# à l'aide de l'API .NET][37]
  * [Lire et mettre en pause des images GIF et APNG animées à l'aide de C#][38]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-archives-using-csharp.jpg
 [2]: #csharp-zip-viewer-api
 [3]: #render-zip-to-html
 [4]: #Render-Specific-Folder-from-ZIP-Archives
 [5]: #render-zip-to-pdf
 [6]: #render-zip-to-jpg
 [7]: #Get-a-List-of-Folders-from-ZIP-archives
 [8]: #Render-and-Rename-ZIP-Files
 [9]: https://products.groupdocs.com/viewer/net
 [10]: https://downloads.groupdocs.com/viewer/net
 [11]: https://www.nuget.org/packages/GroupDocs.Viewer
 [12]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer
 [13]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/htmlviewoptions
 [14]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/view
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-to-html.jpg
 [16]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options.htmlviewoptions/forembeddedresources/methods/4
 [17]: https://docs.groupdocs.com/viewer/net/document-viewer-html-viewer/
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Render-Specific-Folder-from-ZIP-Archives.jpg
 [19]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/archiveoptions
 [20]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/pdfviewoptions
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-to-pdf.jpg
 [22]: https://docs.groupdocs.com/viewer/net/document-viewer-pdf-viewer/
 [23]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/jpgviewoptions
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/render-zip-to-jpg.jpg
 [25]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/pngviewoptions
 [26]: https://docs.groupdocs.com/viewer/net/document-viewer-image-viewer/
 [27]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/viewinfooptions
 [28]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.results/viewinfo
 [29]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/getviewinfo
 [30]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.results/archiveviewinfo
 [31]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Get-a-List-of-Folders-from-ZIP-archives.jpg
 [32]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/viewinfooptions/methods/forhtmlview
 [33]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/Render-and-Rename-ZIP-Files.jpg
 [34]: https://purchase.groupdocs.com/temporary-license
 [35]: https://docs.groupdocs.com/viewer/net/
 [36]: https://forum.groupdocs.com/c/viewer/
 [37]: https://blog.groupdocs.com/2021/04/27/view-cad-documents-using-charp/
 [38]: https://blog.groupdocs.com/2021/02/28/play-pause-animated-gif-and-apng-in-web-pages-using-csharp/





