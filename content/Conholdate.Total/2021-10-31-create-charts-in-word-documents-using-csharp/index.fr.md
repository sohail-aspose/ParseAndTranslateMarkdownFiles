---
title: "Créer des graphiques dans des documents Word à l'aide de C#"
author: Muzammil Khan
date: 2021-10-31T11:50:18+00:00
summary: "En tant que développeur C#, vous pouvez insérer par programme divers types de graphiques dans des documents Word. Dans cet article, vous apprendrez <strong>à créer des graphiques dans des documents Word à l'aide de C#</strong> ."
url: /2021/10/31/create-charts-in-word-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Graphiques dans Word utilisant CSharp"
  - "Créer des graphiques en aires dans CSharp"
  - "Créer des graphiques dans CSharp"
  - "Créer des graphiques à colonnes CSharp"
  - "Créer des graphiques en nuage de points dans CSharp"

---


{{< figure align=center src="images/create-charts-in-word-documents-using-csharp.jpg" alt="créer des graphiques dans des documents Word à l'aide de csharp">}}
 

En tant que développeur C#, vous pouvez insérer par programme divers types de graphiques dans des documents Word. Il aide à présenter graphiquement vos données et informations. Dans cet article, vous apprendrez **comment créer des graphiques dans des documents Word à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour insérer des graphiques dans des documents Word][2]
  * [Créer des graphiques à colonnes dans des documents Word][3]
  * [Créer des diagrammes de dispersion dans des documents Word à l'aide de C #][4]
  * [Insérer des graphiques en aires dans des documents Word à l'aide de C #][5]
  * [Insérer des graphiques à bulles dans des documents Word à l'aide de C #][6]

## API C# pour insérer des graphiques dans des documents Word {#CSharp-API-to-Insert-Charts-in-Word-Documents}

Pour insérer des graphiques dans des fichiers DOCX, nous utiliserons [Aspose.Words pour .NET API][7]. Il vous permet de générer, modifier, convertir, rendre et imprimer des fichiers sans utiliser Microsoft Word directement dans des applications multiplateformes. L'API vous permet d'insérer divers [types de graphiques pris en charge] [8] dans des documents Word par programmation.
Vous pouvez soit [télécharger][9] la DLL de l'API, soit l'installer à l'aide de [NuGet][10].
<pre class="wp-block-code"><code>Install-Package Aspose.Words</code></pre>
## Créer des graphiques à colonnes dans des documents Word {#Create-Columns-Charts-in-Word-Documents-using-CSharp}

Vous pouvez créer des graphiques à colonnes dans des documents Word par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, créez un nouveau document en utilisant la classe [Document][11].
  * Maintenant, créez une instance de la classe [DocumentBuilder][12] avec l'objet de classe _Document_.
  * Appelez ensuite la méthode [DocumentBuilder.InsertChart()][13]. Transmettez [ChartType][8] comme _Column_, avec _height_ et _width_ comme paramètres d'entrée.
  * Obtenez des résultats dans l'objet de classe [Shape][14].
  * Maintenant, créez une instance de la classe [Chart][15] et affectez-lui l'objet [Shape.Chart][16]. Il permet d'accéder aux propriétés du graphique si cette forme a un graphique.
  * Ensuite, obtenez la collection de séries de graphiques dans l'objet [ChartSeriesCollection][17].
  * Créer un tableau de noms de catégories.
  * Maintenant, appelez la méthode [ChartSeriesCollection.Add()][18] pour ajouter des séries de graphiques. Passez le nom, le tableau de catégories et les valeurs en tant que paramètres d'entrée. Répétez cette étape pour ajouter d'autres séries.
  * Enfin, appelez la méthode [Document.Save()][19] avec le chemin du fichier de sortie pour enregistrer le fichier.

L'exemple de code suivant montre **comment créer un graphique à colonnes dans un document Word à l'aide de C#**.
```
// Créer un document
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Ajouter un graphique avec des données par défaut. Vous pouvez spécifier différents types et tailles de graphique.
Shape shape = builder.InsertChart(ChartType.Column, 432, 252);

// La propriété Chart de Shape contient toutes les options liées au graphique.
Chart chart = shape.Chart;

// Obtenez la collection de séries de graphiques.
ChartSeriesCollection seriesColl = chart.Series;
// Vérifiez le nombre de séries.
Console.WriteLine(seriesColl.Count);

// Supprimer la série générée par défaut.
seriesColl.Clear();

// Créez un tableau de noms de catégories, dans cet exemple, nous avons deux catégories.
string[] categories = new string[] { "AW Category 1", "AW Category 2" };

// Ajout de nouvelles séries. Veuillez noter que les tableaux de données ne doivent pas être vides et que les tableaux doivent avoir la même taille.
seriesColl.Add("AW Series 1", categories, new double[] { 1, 2 });
seriesColl.Add("AW Series 2", categories, new double[] { 3, 4 });
seriesColl.Add("AW Series 3", categories, new double[] { 5, 6 });
seriesColl.Add("AW Series 4", categories, new double[] { 7, 8 });
seriesColl.Add("AW Series 5", categories, new double[] { 9, 10 });

// Enregistrer le document
doc.Save(@"C:\Files\Words\ColumnsChart.docx");
```

{{< figure align=center src="images/Create-Columns-Charts-in-Word-Documents-using-CSharp-1024x1002.jpg" alt="Créez des graphiques à colonnes dans des documents Word à l'aide de C#." caption="Créer des graphiques de colonnes dans des documents Word à l'aide de C#">}}
 

## Créer des diagrammes de dispersion dans des documents Word à l'aide de C# {#Create-Scatter-Charts-in-Word-Documents-using-CSharp}

Vous pouvez insérer des graphiques en nuage de points dans vos documents Word par programmation en suivant les étapes mentionnées précédemment. Cependant, vous devez définir ChartType.Scatter dans la méthode [DocumentBuilder.InsertChart()][21].
L'exemple de code suivant montre **comment créer un graphique en nuage de points dans un document Word à l'aide de C#**.
```
// Créer un nouveau document
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insérer un graphique en nuage de points.
Shape shape = builder.InsertChart(ChartType.Scatter, 432, 252);
Chart chart = shape.Chart;

// Utilisez cette surcharge pour ajouter des séries à tout type de graphiques en nuage de points.
chart.Series.Add("AW Series 1", new double[] { 0.7, 1.8, 2.6 }, new double[] { 2.7, 3.2, 0.8 });

// Enregistrer le document
doc.Save(@"C:\Files\Words\ScatterChart.docx");
```

{{< figure align=center src="images/Create-Scatter-Charts-in-Word-Documents-using-CSharp-1024x1000.jpg" alt="Créez des diagrammes de dispersion dans des documents Word à l'aide de C#." caption="Créer des diagrammes de dispersion dans des documents Word à l'aide de C#">}}
 

## Insérer des graphiques en aires dans des documents Word à l'aide de C # {#Insert-Area-Charts-in-Word-Documents-using-CSharp}

Vous pouvez insérer des graphiques en aires dans des documents Word par programme en suivant les étapes mentionnées précédemment. Cependant, vous devez définir ChartType.Area dans la méthode [DocumentBuilder.InsertChart()][21].
L'exemple de code suivant montre **comment créer un graphique en aires dans un document Word à l'aide de C#**.
```
// Créer un nouveau document
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insérer un graphique en aires.
Shape shape = builder.InsertChart(ChartType.Area, 432, 252);
Chart chart = shape.Chart;

// Utilisez cette surcharge pour ajouter des séries à tout type de graphiques en aires, en radar et boursiers.
chart.Series.Add("AW Series 1", new DateTime[] {
    new DateTime(2002, 05, 01),
    new DateTime(2002, 06, 01),
    new DateTime(2002, 07, 01),
    new DateTime(2002, 08, 01),
    new DateTime(2002, 09, 01)},
    new double[] { 32, 32, 28, 12, 15 });

// Enregistrer le document
doc.Save(@"C:\Files\Words\AreaChart.docx");
```

{{< figure align=center src="images/Insert-Area-Charts-in-Word-Documents-using-CSharp-1024x998.jpg" alt="Insérez des graphiques en aires dans des documents Word à l'aide de C#." caption="Insérer des graphiques en aires dans des documents Word à l'aide de C #">}}
 

## Insérer des graphiques à bulles dans des documents Word à l'aide de C# {#Insert-Bubble-Charts-in-Word-Documents-using-CSharp}

Vous pouvez insérer des graphiques à bulles dans des documents Word par programmation en suivant les étapes mentionnées précédemment. Cependant, vous devez définir ChartType.Bubble dans la méthode [DocumentBuilder.InsertChart()][21].
L'exemple de code suivant montre **comment créer un graphique à bulles dans un document Word à l'aide de C#**.
```
// Créer un nouveau document
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insérer un graphique à bulles.
Shape shape = builder.InsertChart(ChartType.Bubble, 432, 252);
Chart chart = shape.Chart;

// Utilisez cette surcharge pour ajouter des séries à tout type de graphiques à bulles.
chart.Series.Add("AW Series 1", new double[] { 0.7, 1.8, 2.6 }, new double[] { 2.7, 3.2, 0.8 }, new double[] { 10, 4, 8 });

// Enregistrer le document
doc.Save(@"C:\Files\Words\BubbleChart.docx");
```

{{< figure align=center src="images/Insert-Bubble-Charts-in-Word-Documents-using-CSharp-1024x997.jpg" alt="Insérez des graphiques à bulles dans des documents Word à l'aide de C#." caption="Insérer des graphiques à bulles dans des documents Word à l'aide de C#">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][25].
## Conclusion

Dans cet article, vous avez appris **comment créer des graphiques dans des documents Word à l'aide de C#**. En particulier, vous avez appris à créer par programme des graphiques à colonnes, à aires, à bulles et à nuage de points dans des documents Word. De même, vous pouvez créer d'autres types de graphiques. Vous pouvez en savoir plus sur l'API Aspose.Words pour .NET en utilisant la [documentation][26]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][27].
## See Also

  * [Travailler avec la table des matières dans le document Word C#][28]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/create-charts-in-word-documents-using-csharp.jpg
 [2]: #CSharp-API-to-Insert-Charts-in-Word-Documents
 [3]: #Create-Columns-Charts-in-Word-Documents-using-CSharp
 [4]: #Create-Scatter-Charts-in-Word-Documents-using-CSharp
 [5]: #Insert-Area-Charts-in-Word-Documents-using-CSharp
 [6]: #Insert-Bubble-Charts-in-Word-Documents-using-CSharp
 [7]: https://products.aspose.com/words/net/
 [8]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts/charttype
 [9]: https://downloads.aspose.com/words/net
 [10]: https://www.nuget.org/packages/aspose.words
 [11]: https://apireference.aspose.com/words/net/aspose.words/document
 [12]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder
 [13]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder/methods/insertchart
 [14]: https://apireference.aspose.com/words/net/aspose.words.drawing/shape
 [15]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts/chart
 [16]: https://apireference.aspose.com/words/net/aspose.words.drawing/shape/properties/chart
 [17]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts/chartseriescollection
 [18]: https://apireference.aspose.com/words/net/aspose.words.drawing.charts.chartseriescollection/add/methods/3
 [19]: https://apireference.aspose.com/words/net/aspose.words.document/save/methods/2
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Create-Columns-Charts-in-Word-Documents-using-CSharp.jpg
 [21]: https://apireference.aspose.com/words/net/aspose.words/documentbuilder/methods/write
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Create-Scatter-Charts-in-Word-Documents-using-CSharp.jpg
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Area-Charts-in-Word-Documents-using-CSharp.jpg
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Bubble-Charts-in-Word-Documents-using-CSharp.jpg
 [25]: https://purchase.groupdocs.com/temporary-license
 [26]: https://docs.aspose.com/words/net/
 [27]: https://forum.aspose.com/c/words/8
 [28]: https://blog.aspose.com/2021/03/02/work-with-table-of-contents-in-word-csharp/





