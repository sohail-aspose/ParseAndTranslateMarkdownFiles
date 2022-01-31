---
title: Render Visio Diagrams in HTML, PDF, and Image using Java
author: Muzammil Khan
date: 2021-04-07T08:54:39+00:00
summary: "Affichez par programmation des fichiers de diagrammes Visio (.vsdx, .vssx, .vstx) au format HTML, PDF et autres formats d'image populaires. Dans cet article, vous apprendrez <strong>à rendre des diagrammes Visio au format HTML, PDF et Image à l'aide de Java</strong> ."
url: /2021/04/07/render-visio-diagrams-in-html-pdf-and-image-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "rendre au format PDF"
  - "Rendre le fichier Visio au format HTML"
  - "Rendre le fichier Visio en tant qu'image"
  - "Rendu des fichiers Visio"
  - "Rendre VSDX au format PDF"

---


{{< figure align=center src="images/View-Visio-Files-using-Java-1024x576.jpg" alt="Rendu des fichiers Visio à l'aide de Java">}}
 

Microsoft Visio est un outil graphique vectoriel populaire qui vous aide à visualiser les flux de processus métier connectés aux données. Il peut être utilisé pour dessiner une variété de diagrammes tels que des organigrammes, des organigrammes, des plans de construction, des plans d'étage, des diagrammes de flux de données, des diagrammes de flux de processus, la modélisation de processus métier, des diagrammes à couloirs, des cartes 3D, etc. En tant que développeur Java, vous pouvez facilement restituer des diagrammes Visio au format HTML, PDF et d'autres formats d'image populaires par programmation. Dans cet article, vous apprendrez ** comment afficher des diagrammes Visio en HTML, PDF et Image à l'aide de Java **.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour afficher les fichiers Visio][2]
  * [Rendre Visio VSSX en HTML][3]
  * [Rendre Visio VSTX en PDF][4]
  * [Afficher Visio VSDX en tant qu'image][5]

## API Java pour afficher les fichiers Visio {#java-viewer-api}

J'utiliserai [GroupDocs.Viewer for Java API][6] pour le rendu des fichiers Visio. Il fournit une solution de visualisation de documents des plus flexibles pour restituer et afficher des formats de fichiers largement utilisés n'importe où. Grâce à cette API, vous pouvez créer de puissantes applications de rendu de documents et d'images en Java sans installer de logiciel externe. Il vous permet de visualiser rapidement des fichiers PDF, HTML, XML, Microsoft Office Word, des feuilles de calcul Excel, des présentations PowerPoint, des e-mails Outlook, des diagrammes Visio, des projets, des métafichiers, des images et divers autres formats de fichiers avec facilité et moins de risques de programmation.
### Télécharger et configurer
[Obtenez la bibliothèque][7] à partir des téléchargements ou ajoutez simplement la configuration **_pom.xml_** suivante dans vos applications Java basées sur Maven pour essayer les exemples mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsArtifactRepository</id><name>Référentiel d'artefacts GroupDocs</name><url>https://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-viewer</artifactId><version>21.2</version></dépendance></pre>
## Rendre Visio VSSX en HTML {#render-vssx-to-html}

Vous pouvez rendre le fichier Visio VSSX en HTML en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe **[Viewer][8]**
  2. Indiquez le chemin du fichier d'entrée
  3. Créez une instance de la classe [_**HtmlViewOptions**_][9]
  4. Indiquez le chemin du fichier de sortie
  5. Appelez la méthode _**[View][10]**_ et passez HtmlViewOptions

L'exemple de code suivant montre **comment rendre le fichier VSSX au format HTML à l'aide de Java**.
```
try (Viewer viewer = new Viewer("C:\\Files\\sample.vssx")) {
    HtmlViewOptions options = HtmlViewOptions.forEmbeddedResources("C:\\Files\\Output\\output.html");
    viewer.view(options);
}
```

{{< figure align=center src="images/Render-VSSX-in-HTML-1024x457.jpg" alt="Rendre VSSX en HTML" caption="Rendre VSSX en HTML">}}
 

La classe **_HtmlViewOptions_ **fournit des options pour rendre les documents au format HTML. Le constructeur [ForEmbeddedResources][12] crée une nouvelle instance de la classe _HtmlViewOptions_ pour le rendu en HTML avec des ressources intégrées. Il fournit certaines options pour divers formats de fichiers tels que VisioRenderingOptions pour les fichiers Visio, les options de filigrane pour définir un filigrane de texte, les options de sécurité, les options de rendu pour afficher les pages masquées, les notes et les commentaires, etc.
Vous pouvez trouver plus de détails sur "[Document HTML Viewer][13]" dans la documentation.
## Rendre Visio VSTX en PDF {#render-vstx-to-pdf}

Vous pouvez rendre le fichier Visio VSTX au format PDF en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe **[Viewer][8]**
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de la classe [_**PdfViewOptions**_][14]
  4. Indiquez le chemin du fichier de sortie
  5. Appelez la méthode _**[View][10]**_ et passez PdfViewOptions

L'exemple de code suivant montre **comment rendre le fichier VSTX au format PDF à l'aide de Java**.
```
try (Viewer viewer = new Viewer("C:\\Files\\sample_organization.vstx")){
    PdfViewOptions options = new PdfViewOptions("C:\\Files\\Output\\output.pdf");
    viewer.view(options);
}
```

{{< figure align=center src="images/Render-VSTX-in-PDF-1024x457.jpg" alt="Rendre VSTX en PDF" caption="Rendre VSTX en PDF">}}
 

La classe **_PdfViewOptions_ **fournit des options pour rendre les documents au format PDF. Il permet également de définir des options distinctes pour différents formats de fichiers, notamment le filigrane de texte, les options de sécurité et le rendu des pages masquées, des notes et des commentaires, etc.
Vous pouvez trouver plus de détails sur "[Document PDF Viewer][16]" dans la documentation.
## Rendre Visio VSDX en tant qu'image {#render-vsdx-to-image}

Vous pouvez rendre le fichier Visio VSDX au format JPG ou PNG en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe **[Viewer][8]**
  2. Indiquez le chemin du fichier d'entrée
  3. Créer une instance de la classe [_**PngViewOptions**_][17]
  4. Indiquez le chemin du fichier de sortie
  5. Appelez la méthode _**[View][10]**_ et passez PngViewOptions

L'exemple de code suivant montre **comment rendre le fichier VSDX au format PNG à l'aide de Java**.
```
try (Viewer viewer = new Viewer("C:\\Files\\sample_block.vsdx")){
    PngViewOptions options = new PngViewOptions("C:\\Files\\Output\\output.png");
    viewer.view(options);
}
```

{{< figure align=center src="images/Render-VSDX-in-PNG-1024x457.jpg" alt="Rendre VSDX au format PNG" caption="Rendre VSDX au format PNG">}}
 

Vous pouvez également rendre les fichiers Visio au format JPG à l'aide de Java, comme indiqué ci-dessous :
```
try (Viewer viewer = new Viewer("C:\\Files\\sample_network.vsdx")) {
    JpgViewOptions jpgOptions = new JpgViewOptions("C:\\Files\\Output\\output.jpg");
    viewer.view(jpgOptions);
}
```

{{< figure align=center src="images/Render-VSDX-in-JPG-1024x457.jpg" alt="Rendre VSDX en JPG" caption="Rendre VSDX en JPG">}}
 

La classe **_PngViewOptions_ **fournit des options pour rendre les documents au format PNG. De même, la classe **_JpgViewOptions_ **fournit des options pour rendre les documents au format JPG. Les deux classes fournissent également des options de configuration pour d'autres formats ainsi qu'un filigrane de texte, des options de sécurité et le rendu des pages masquées, des notes et des commentaires, etc.
Vous pouvez trouver plus de détails sur "[Document Image Viewer][20]" dans la documentation.
## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][21].
## Conclusion

Dans cet article, vous avez appris ** comment afficher des fichiers Visio (.vsdx, .vstx, .vssx) au format HTML, PDF, PNG et Jpg ** à l'aide de Java. Vous pouvez en savoir plus sur l'API Java GroupDocs.Viewer en utilisant la [documentation][22]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][23].
## See Also

  * [[Afficher les messages des dossiers souhaités dans les fichiers de données Outlook (OST/PST)][24]][25]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/View-Visio-Files-using-Java.jpg
 [2]: #java-viewer-api
 [3]: #render-vssx-to-html
 [4]: #render-vstx-to-pdf
 [5]: #render-vsdx-to-image
 [6]: https://products.groupdocs.com/viewer/java
 [7]: https://downloads.groupdocs.com/viewer/java
 [8]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer/Viewer
 [9]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/HtmlViewOptions
 [10]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer/Viewer#view(com.groupdocs.viewer.options.ViewOptions)
 [11]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSSX-in-HTML.jpg
 [12]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/HtmlViewOptions#forEmbeddedResources(java.lang.String)
 [13]: https://docs.groupdocs.com/viewer/java/document-viewer-html-viewer/
 [14]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/PdfViewOptions
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSTX-in-PDF.jpg
 [16]: https://docs.groupdocs.com/viewer/java/document-viewer-pdf-viewer/
 [17]: https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer.options/PngViewOptions
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSDX-in-PNG.jpg
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Render-VSDX-in-JPG.jpg
 [20]: https://docs.groupdocs.com/viewer/java/document-viewer-image-viewer/
 [21]: https://purchase.groupdocs.com/temporary-license
 [22]: https://docs.groupdocs.com/viewer/java/
 [23]: https://forum.groupdocs.com/c/viewer/
 [24]: https://blog.groupdocs.com/2019/08/24/view-messages-from-desired-folders-in-outlook-data-files-ostpst/
 [25]: https://blog.conholdate.com/2020/08/10/export-data-to-excel-in-csharp/





