---
title: "Ajouter des formes dans des documents PDF à l'aide de C#"
author: Muzammil Khan
date: 2021-11-11T05:04:14+00:00
summary: "En tant que développeur C#, vous pouvez ajouter des formes de dessin dans des documents PDF par programmation. Dans cet article, vous apprendrez <strong>à ajouter des formes dans des documents PDF à l'aide de C#</strong> ."
url: /2021/11/11/add-shapes-in-pdf-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Ajouter un cercle dans un PDF à l'aide de CSharp"
  - "Ajouter un rectangle dans un PDF à l'aide de CSharp"
  - "Ajouter des formes au format PDF à l'aide de CSharp"
  - "Dessiner des formes en PDF"
  - "Dessiner des formes"

---


{{< figure align=center src="images/add-shapes-in-pdf-documents-using-csharp.jpg" alt="Ajouter des formes dans des documents PDF à l'aide de C#">}}
 

Vous devrez peut-être ajouter divers types de graphiques ou de formes à vos fichiers PDF pour présenter des données ou des informations de manière interactive. En tant que développeur C#, vous pouvez ajouter des formes de dessin dans des documents PDF par programmation. Dans cet article, vous apprendrez **comment ajouter des formes dans des documents PDF à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
<ul id="C--API-to-Add-Graphs-in-PDF-Documents"><li><a href="#CSharp-API-to-Draw-Shapes-in-PDF-Documents">API C# pour dessiner des formes dans des documents PDF</a></li><li><a href="#Create-Filled-Rectangle-in-PDF-Documents-using-CSharp">Créer un rectangle rempli dans des documents PDF à l'aide de C #</a></li><li><a href="#Add-Circle-in-PDF-Documents-using-CSharp">Ajouter un cercle dans les documents PDF à l'aide de C#</a></li><li><a href="#Draw-Lines-Across-the-Page-in-PDF-Documents-using-CSharp">Tracez des lignes sur la page dans les documents PDF à l'aide de C #</a></li><li><a href="#Add-Ellipse-in-PDF-Documents-using-CSharp">Ajouter Ellipse dans les documents PDF à l'aide de C#</a></li></ul>
## API C# pour dessiner des formes dans des documents PDF {#CSharp-API-to-Draw-Shapes-in-PDF-Documents}

Pour ajouter des formes dans des fichiers [PDF][2], nous utiliserons [Aspose.PDF pour .NET API][3]. Il vous permet de générer, modifier, convertir, restituer, sécuriser et imprimer [documents pris en charge][4] sans utiliser Adobe Acrobat. Il fournit également des options de compression, la création et la manipulation de tableaux, des fonctions de graphique et d'image, des tâches de tampon et de filigrane, des contrôles de sécurité étendus et une gestion personnalisée des polices.
Vous pouvez soit [télécharger][5] la DLL de l'API, soit l'installer à l'aide de [NuGet][6].
<pre class="wp-block-code"><code>Install-Package Aspose.PDF</code></pre>
## Créer un rectangle rempli dans des documents PDF à l'aide de C # {#Create-Filled-Rectangle-in-PDF-Documents-using-CSharp}

Vous pouvez créer un rectangle plein dans des documents PDF par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, créez un nouveau document en utilisant la classe [Document][7].
  * Maintenant, appelez la méthode [Document.Pages.Add()][8] pour ajouter une page vide à la collection de pages du fichier PDF.
  * Créez une instance de la classe [Graph][9] avec une hauteur et une largeur pour le graphique.
  * Ensuite, appelez la méthode [Page.Paragraphs.Add()][10] pour ajouter un objet graphique à la collection de paragraphes de l'instance de page.
  * Maintenant, créez une instance de la classe [Rectangle][11] et définissez sa position à gauche et en bas, ainsi que sa largeur et sa hauteur.
  * Si vous le souhaitez, spécifiez la couleur de remplissage pour [l'objet Graph][12].
  * Ensuite, ajoutez l'objet rectangle à [la collection de formes] [13] de l'objet Graph.
  * Enfin, appelez la méthode [Document.Save()][14] avec le chemin du fichier de sortie pour enregistrer le fichier.

L'exemple de code suivant montre **comment créer un rectangle plein dans des documents PDF à l'aide de C#**.
```
// Créer une instance de document
Document doc = new Document();

// Ajouter une page à la collection de pages du fichier PDF
Page page = doc.Pages.Add();

// Créer une instance de graphique
Graph graph = new Graph(100, 400);

// Ajouter un objet graphique à la collection de paragraphes de l'instance de page
page.Paragraphs.Add(graph);

// Créer une instance Rectangle
Aspose.Pdf.Drawing.Rectangle rect = new Aspose.Pdf.Drawing.Rectangle(100, 100, 200, 120);

// Spécifier la couleur de remplissage pour l'objet graphique
rect.GraphInfo.FillColor = Color.Gray;

// Ajouter un objet rectangle à la collection de formes de l'objet Graph
graph.Shapes.Add(rect);

// Enregistrer le fichier PDF
doc.Save(@"C:\Files\PDF\FilledRectangle_out.pdf");
```

{{< figure align=center src="images/Create-Filled-Rectangle-in-PDF-Documents-using-CSharp.jpg" alt="Créer un rectangle rempli dans des documents PDF à l'aide de C#." caption="Créer un rectangle rempli dans des documents PDF à l'aide de C#.">}}
 

## Ajouter un cercle dans les documents PDF à l'aide de C# {#Add-Circle-in-PDF-Documents-using-CSharp}

Vous pouvez ajouter un cercle dans des documents PDF par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, créez un nouveau document en utilisant la classe [Document][7].
  * Maintenant, appelez la méthode [Document.Pages.Add()][8] pour ajouter une page vide à la collection de pages du fichier PDF.
  * Créez une instance de la classe [Graph][9] avec une hauteur et une largeur pour le graphique.
  * Ensuite, appelez la méthode [Page.Paragraphs.Add()][10] pour ajouter un objet graphique à la collection de paragraphes de l'instance de page.
  * Maintenant, créez une instance de la classe [Circle][16] et définissez sa position X et Y, ainsi que son rayon.
  * Ensuite, définissez la couleur et la couleur de remplissage du cercle.
  * Ajoutez l'objet cercle à [la collection de formes][13] de l'objet Graph.
  * Enfin, appelez la méthode [Document.Save()][14] avec le chemin du fichier de sortie pour enregistrer le fichier.

L'exemple de code suivant montre **comment ajouter un cercle dans des documents PDF à l'aide de C#**.
```
// Créer une instance de document
Document doc = new Document();

// Ajouter une page à la collection de pages du fichier PDF
Page page = doc.Pages.Add();

// Créer un objet de dessin avec certaines dimensions
Graph graph = new Graph(400, 200);

// créer un cercle
Circle circle = new Circle(100, 100, 40);
circle.GraphInfo.Color = Color.Green;
circle.GraphInfo.FillColor = Color.GreenYellow;

graph.Shapes.Add(circle);

// Ajouter un objet Graph à la collection de paragraphes de la page
page.Paragraphs.Add(graph);

// Enregistrer le fichier PDF
doc.Save(@"C:\Files\PDF\FilledCircle_out.pdf");
```

{{< figure align=center src="images/Add-Circle-in-PDF-Documents-using-CSharp.jpg" alt="Ajouter un cercle dans les documents PDF à l'aide de C #." caption="Ajouter un cercle dans les documents PDF à l'aide de C #.">}}
 

## Tracez des lignes sur la page dans les documents PDF à l'aide de C # {#Draw-Lines-Across-the-Page-in-PDF-Documents-using-CSharp}

Vous pouvez tracer des lignes sur la page dans les documents PDF par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, créez un nouveau document en utilisant la classe [Document][7].
  * Maintenant, appelez la méthode [Document.Pages.Add()][8] pour ajouter une page vide à la collection de pages du fichier PDF.
  * Ensuite, définissez les marges de page de tous les côtés sur 0.
  * Créez une instance de la classe [Graph][9] avec une largeur et une hauteur de page.
  * Maintenant, créez une instance de la classe [Line][18] avec un tableau de position de ligne pour créer une ligne commençant du coin inférieur gauche au coin supérieur droit de la page.
  * Ensuite, ajoutez l'objet ligne à [la collection de formes] [13] de l'objet Graph.
  * Maintenant, créez une autre instance de la classe [Line][18] avec un tableau de position de ligne pour tracer une ligne du coin supérieur gauche de la page au coin inférieur droit de la page.
  * Ensuite, ajoutez la deuxième instance de l'objet ligne à [la collection de formes] [13] de l'objet Graph.
  * Appelez la méthode [Page.Paragraphs.Add()][10] pour ajouter un objet graphique à la collection de paragraphes de l'instance de page.
  * Enfin, appelez la méthode [Document.Save()][14] avec le chemin du fichier de sortie pour enregistrer le fichier.

L'exemple de code suivant montre **comment tracer des lignes sur la page dans des documents PDF à l'aide de C#**.
```
// Créer une instance de document
Document doc = new Document();

// Ajouter une page à la collection de pages du fichier PDF
Page page = doc.Pages.Add();

// Définir la marge de la page sur tous les côtés à 0
page.PageInfo.Margin.Left = 0;
page.PageInfo.Margin.Right = 0;
page.PageInfo.Margin.Bottom = 0;
page.PageInfo.Margin.Top = 0;

// Créer un objet graphique avec une largeur et une hauteur égales aux dimensions de la page
Graph graph = new Graph((float)page.PageInfo.Width, (float)page.PageInfo.Height);

// Créer un objet de première ligne en partant du coin inférieur gauche vers le coin supérieur droit de la page
Line line = new Line(new float[] { (float) page.Rect.LLX, 0, (float) page.PageInfo.Width,
    (float) page.Rect.URY });

// Ajouter une ligne à la collection de formes de l'objet Graph
graph.Shapes.Add(line);

// Tracez une ligne du coin supérieur gauche de la page au coin inférieur droit de la page
Line line2 = new Line(new float[] { 0, (float) page.Rect.URY, (float) page.PageInfo.Width,
    (float) page.Rect.LLX });

// Ajouter une ligne à la collection de formes de l'objet Graph
graph.Shapes.Add(line2);

// Ajouter un objet Graph à la collection de paragraphes de la page
page.Paragraphs.Add(graph);

// Enregistrer le fichier PDF
doc.Save(@"C:\Files\PDF\DrawLineAcrossPage_out.pdf");
```

{{< figure align=center src="images/Draw-Line-Across-the-Page-in-PDF-Documents-using-CSharp.png" alt="Tracez une ligne sur la page dans les documents PDF à l'aide de C#." caption="Tracez une ligne sur la page dans les documents PDF à l'aide de C#.">}}
 

## Ajouter Ellipse dans les documents PDF à l'aide de C# {#Add-Ellipse-in-PDF-Documents-using-CSharp}

Vous pouvez ajouter par programmation une ellipse contenant du texte dans des documents PDF en suivant les étapes ci-dessous :
  * Tout d'abord, créez un nouveau document en utilisant la classe [Document][7].
  * Maintenant, appelez la méthode [Document.Pages.Add()][8] pour ajouter une page vide à la collection de pages du fichier PDF.
  * Créez une instance de la classe [Graph][9] avec une hauteur et une largeur pour le graphique.
  * Créez une instance de la classe [TextFragment][20] avec la valeur de texte à afficher dans l'objet graphique.
  * Ensuite, définissez la police et la taille du texte.
  * Maintenant, créez une instance de la classe [Ellipse][21] et définissez sa position à gauche et en bas, ainsi que sa largeur et sa hauteur.
  * Ensuite, définissez la couleur, la couleur de remplissage et affectez l'objet TextFragment à sa propriété text.
  * Maintenant, ajoutez l'objet ellipse à [la collection de formes] [13] de l'objet Graph.
  * Ensuite, appelez la méthode [Page.Paragraphs.Add()][10] pour ajouter un objet graphique à la collection de paragraphes de l'instance de page.
  * Enfin, appelez la méthode [Document.Save()][14] avec le chemin du fichier de sortie pour enregistrer le fichier.

L'exemple de code suivant montre **comment créer une ellipse avec du texte dans des documents PDF à l'aide de C#**.
```
// Créer une instance de document
Document doc = new Document();

// Ajouter une page à la collection de pages du fichier PDF
Page page = doc.Pages.Add();

// Créer un objet de dessin avec certaines dimensions
Graph graph = new Graph(400, 400);

// Définir le texte
TextFragment textFragment = new TextFragment("Ellipse");
textFragment.TextState.Font = FontRepository.FindFont("Helvetica");
textFragment.TextState.FontSize = 24;

// Dessiner une ellipse
Ellipse ellipse = new Ellipse(100, 100, 120, 180);
ellipse.GraphInfo.FillColor = Color.GreenYellow;
ellipse.GraphInfo.Color = Color.Red;
ellipse.Text = textFragment;

// Ajouter une ellipse à la collection de formes de l'objet Graph
graph.Shapes.Add(ellipse);

// Ajouter un objet Graph à la collection de paragraphes de la page
page.Paragraphs.Add(graph);

// Enregistrer le fichier PDF
doc.Save(@"C:\Files\PDF\EclipseWithText_out.pdf");
```

{{< figure align=center src="images/Add-Ellipse-in-PDF-Documents-using-CSharp.jpg" alt="Ajoutez Ellipse dans les documents PDF à l'aide de C#." caption="Ajoutez Ellipse dans les documents PDF à l'aide de C#.">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][23].
## Conclusion

Dans cet article, vous avez appris **comment ajouter des formes dans des documents PDF à l'aide de C#**. En particulier, vous avez vu comment ajouter par programmation un rectangle, un cercle, une ligne et une ellipse remplis dans des documents PDF. De même, vous pouvez créer un arc et une courbe dans des fichiers PDF. Vous pouvez en savoir plus sur Aspose.PDF pour l'API .NET en utilisant la [documentation][24]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][25].
## See Also

  * [Convertir des PDF en images à l'aide de C#][26]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/add-shapes-in-pdf-documents-using-csharp.jpg
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://products.aspose.com/pdf/net/
 [4]: https://docs.aspose.com/pdf/net/supported-file-formats/
 [5]: https://downloads.aspose.com/pdf/net
 [6]: https://www.nuget.org/packages/aspose.pdf
 [7]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [8]: https://apireference.aspose.com/pdf/net/aspose.pdf/pagecollection/methods/add
 [9]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/graph
 [10]: https://apireference.aspose.com/pdf/net/aspose.pdf/paragraphs/methods/add
 [11]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/rectangle
 [12]: https://apireference.aspose.com/pdf/net/aspose.pdf/graphinfo
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/graph/properties/shapes
 [14]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Create-Filled-Rectangle-in-PDF-Documents-using-CSharp.jpg
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/circle
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Add-Circle-in-PDF-Documents-using-CSharp.jpg
 [18]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/line
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Draw-Line-Across-the-Page-in-PDF-Documents-using-CSharp.png
 [20]: https://apireference.aspose.com/pdf/net/aspose.pdf.text/textfragment
 [21]: https://apireference.aspose.com/pdf/net/aspose.pdf.drawing/ellipse
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Add-Ellipse-in-PDF-Documents-using-CSharp.jpg
 [23]: https://purchase.groupdocs.com/temporary-license
 [24]: https://docs.aspose.com/pdf/net/
 [25]: https://forum.aspose.com/c/pdf
 [26]: https://blog.conholdate.com/2021/09/23/convert-pdf-to-images-using-csharp/





