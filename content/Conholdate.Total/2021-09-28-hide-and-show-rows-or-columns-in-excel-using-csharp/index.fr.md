---
title: "Masquer et afficher des lignes ou des colonnes dans Excel à l'aide de C#"
author: Muzammil Khan
date: 2021-09-28T05:53:10+00:00
summary: "En tant que développeur C #, vous pouvez facilement masquer et afficher les lignes ou les colonnes dans les feuilles de calcul Excel par programmation. Dans cet article, vous apprendrez <strong>à masquer et à afficher des lignes ou des colonnes d'une feuille Excel à l'aide de C#</strong> ."
url: /2021/09/28/masquer-et-afficher-les-lignes-ou-les-colonnes-dans-excel-en-utilisant-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Masquer les colonnes dans Excel"
  - "Masquer les lignes et les colonnes"
  - "Masquer les lignes dans Excel"
  - "masquer/afficher les lignes et les colonnes"

---


{{< figure align=center src="images/hide-or-show-rows-and-columns-in-excel-using-csharp.jpg" alt="Masquer ou afficher des lignes et des colonnes dans Excel à l'aide de C #">}}
 

En tant que développeur C #, vous pouvez facilement masquer et afficher les lignes ou les colonnes dans les feuilles de calcul Excel par programmation. Dans cet article, vous apprendrez **comment masquer et afficher des lignes ou des colonnes d'une feuille Excel à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour masquer et afficher des lignes ou des colonnes][2]
  * [Masquer les lignes et les colonnes à l'aide de C #][3]
  * [Afficher les lignes et les colonnes masquées à l'aide de C#][4]
  * [Masquer plusieurs lignes et colonnes à l'aide de C#][5]
  * [Afficher toutes les lignes et colonnes masquées à l'aide de C#][6]

## API C# pour masquer et afficher des lignes ou des colonnes {#CSharp-API-to-Hide-and-Show-Rows-or-Columns}

Pour masquer et afficher les lignes et les colonnes dans une feuille [Excel][7], j'utiliserai [Aspose.Cells pour .NET API][8]. Il s'agit d'une API de manipulation de feuille de calcul bien connue qui vous permet de créer et de traiter des fichiers Excel à partir de vos applications .NET. L'API vous permet de masquer toutes les lignes et colonnes des fichiers Excel ou d'afficher les lignes et colonnes masquées par programmation.
Vous pouvez soit [télécharger][9] la DLL de l'API, soit l'installer à l'aide de [NuGet][10].
<pre class="wp-block-code"><code>Install-Package Aspose.Cells</code></pre>
## Masquer les lignes et les colonnes à l'aide de C # {#Hide-Rows-and-Columns-using-CSharp}

Vous pouvez masquer des lignes et des colonnes dans des feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][11] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][12].
  * Accédez à la feuille de calcul de la collection [Worksheets][13] par son index.
  * Masquez la ligne en appelant la méthode [HideRow()][14] et passez l'index de la ligne à masquer.
  * Masquez la colonne en appelant la méthode [HideColumn()][15] et passez l'index de la colonne à masquer.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment masquer les lignes et les colonnes d'une feuille Excel à l'aide de C#**.
```
// Instancier un classeur
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Masquer la 3ème ligne de la feuille de calcul
worksheet.Cells.HideRow(2);

// Masquer la 2e colonne de la feuille de calcul
worksheet.Cells.HideColumn(1);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\HideRowsColumns.xlsX");
```

{{< figure align=center src="images/Hide-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Masquer les lignes et les colonnes à l'aide de C #" caption="Masquez les lignes et les colonnes à l'aide de C#.">}}
 

La classe [Workbook][11] représente un classeur Excel et fournit plusieurs propriétés et méthodes pour travailler avec le classeur. La propriété [Worksheets][13] de cette classe représente la collection de feuilles de calcul disponibles. La classe [Worksheet][12] représente une seule feuille de calcul d'un classeur Excel. Il expose plusieurs propriétés et méthodes pour effectuer diverses opérations sur la feuille de calcul. La propriété [Cells][18] de cette classe représente une collection de cellules disponibles dans la feuille de calcul.
La méthode [HideRow()][14] de la classe [Cells][19] masque une ligne spécifique. Il prend un index de ligne comme paramètre d'entrée pour masquer cette ligne. La classe Cells fournit également la méthode [HideColumn()][15] pour masquer une colonne spécifique en fonction de l'index de colonne fourni comme paramètre d'entrée.
La méthode [Save()][16] de la classe Workbook enregistre le classeur dans le chemin de fichier spécifié fourni comme paramètre d'entrée.
## Afficher les lignes et les colonnes masquées à l'aide de C # {#Show-Hidden-Rows-and-Columns-using-CSharp}

Vous pouvez afficher par programme les lignes et colonnes masquées spécifiques dans les feuilles Excel en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][11] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][12].
  * Accédez à la feuille de calcul de la collection [Worksheets][13] par son index.
  * Afficher la ligne masquée en appelant la méthode [UnhideRow()][20]
  * Passez l'index de ligne de la ligne masquée et la hauteur de ligne à définir.
  * Afficher la colonne masquée en appelant la méthode [UnhideColumn()][21]
  * Passez l'index de colonne de la colonne masquée et la largeur de colonne à définir.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment afficher les **lignes et colonnes masquées spécifiques** dans une feuille Excel à l'aide de C#**.
```
// Instancier un classeur
Workbook workbook = new Workbook(@"C:\Files\HideRowsColumns.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Afficher la 3e rangée et régler sa hauteur sur 13,5
worksheet.Cells.UnhideRow(2, 13.5);

// Afficher la 2e colonne et définir sa largeur sur 8,5
worksheet.Cells.UnhideColumn(1, 20.5);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\ShowRowsColumns.xlsx");
```

{{< figure align=center src="images/Show-Hidden-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Afficher les lignes et les colonnes masquées à l'aide de C #" caption="Afficher les lignes et les colonnes masquées à l'aide de C #">}}
 

La méthode [UnhideRow()][20] de la classe [Cells][19] affiche une ligne masquée spécifique dans la feuille de calcul. Il prend un index de ligne d'une ligne masquée comme paramètre d'entrée pour le rendre visible. La classe Cells fournit également la méthode [unhideColumn()][21] pour afficher une colonne masquée en fonction de l'index de colonne fourni comme paramètre d'entrée.
## Masquer plusieurs lignes et colonnes à l'aide de C # {#Hide-Multiple-Rows-and-Columns-using-CSharp}

Vous pouvez masquer plusieurs lignes et colonnes dans des feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][11] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][12].
  * Accédez à la feuille de calcul de la collection [Worksheets][13] par son index.
  * Appelez la méthode [HideRows()][23], passez l'index de la ligne de départ et le nombre total de lignes à masquer.
  * Appelez la méthode [HideColumns()][24], passez l'index de la colonne de départ et le nombre total de colonnes à masquer.
  * Enregistrez en appelant la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment masquer plusieurs lignes et colonnes dans une feuille Excel à l'aide de C#**.
```
// Instancier un classeur
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Masquer 3, 4 et 5 lignes dans la feuille de calcul
worksheet.Cells.HideRows(2, 3);

// Masquer 2 et 3 colonnes dans la feuille de calcul
worksheet.Cells.HideColumns(1, 2);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\HideMultiple.xlsx");
```

{{< figure align=center src="images/Hide-Multiple-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Masquer plusieurs lignes et colonnes à l'aide de C#" caption="Masquez plusieurs lignes et colonnes à l'aide de C #.">}}
 

La classe Cells fournit la méthode [HideRows()][23] pour masquer plusieurs lignes. Vous devez spécifier l'index de la ligne de départ et le nombre total de lignes à masquer en tant que paramètres d'entrée. De même, pour masquer plusieurs colonnes, la classe Cells fournit la méthode [HideColumns()][24] qui prend l'index de la colonne et le nombre total de colonnes à masquer comme paramètres d'entrée.
## Afficher toutes les lignes et colonnes masquées à l'aide de C # {#Show-All-Hidden-Rows-and-Columns-using-CSharp}

Vous pouvez afficher toutes les lignes et colonnes masquées dans les feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][11] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][12].
  * Accédez à la feuille de calcul de la collection [Worksheets][13] par son index.
  * Vérifiez la propriété [IsHidden] [26] pour toutes les lignes une par une, si vrai alors
      * Appelez la méthode [UnhideRow()][20] avec l'index de ligne et la hauteur de ligne à définir.
  * Vérifiez la propriété [IsHidden][27] pour toutes les colonnes une par une, si vraie alors
      * Appelez la méthode [UnhideColumn()][21] avec l'index de colonne et la largeur de colonne à définir.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment afficher toutes les lignes et colonnes masquées dans une feuille Excel à l'aide de C#**.
```
// Instancier un classeur
Workbook workbook = new Workbook(@"C:\Files\HideMultiple.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Afficher toutes les lignes
var AllRows = worksheet.Cells.Rows;
foreach (Row row in AllRows)
{
    if (row.IsHidden)
    {
        worksheet.Cells.UnhideRow(row.Index, 20.5);
    }
}

// Afficher toutes les colonnes
var AllColumns = worksheet.Cells.Columns;
foreach (var column in AllColumns)
{
    if (column.IsHidden)
    {
        worksheet.Cells.UnhideColumn(column.Index, 20.5);
    }
}

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\ShowAllRowsColumns.xlsx");
```

{{< figure align=center src="images/Show-All-Rows-and-Columns-using-CSharp-1024x457.jpg" alt="Afficher toutes les lignes et colonnes masquées à l'aide de C #" caption="Afficher toutes les lignes et colonnes masquées à l'aide de C #.">}}
 

La propriété [IsHidden][26] de la classe [Row][29] indique si la ligne est masquée. De même, la propriété [IsHidden][27] de la classe [Column][30] indique si la colonne est masquée.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][31].
## Conclusion

Dans cet article, vous avez appris **comment masquer des colonnes et des lignes dans des fichiers Excel** à l'aide de C#. Vous avez également appris **comment afficher les colonnes et les lignes masquées dans les fichiers Excel** par programmation. De plus, vous avez appris **comment masquer plusieurs lignes et colonnes dans une feuille Excel**. Cet article a également expliqué **comment afficher toutes les lignes et colonnes masquées dans Excel à l'aide de C#**. Vous pouvez en savoir plus sur l'API Aspose.Cells pour .NET en utilisant la [documentation][32]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][33].
## See Also

  * [Supprimer les lignes et les colonnes vides dans Excel à l'aide de C #][34]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/hide-or-show-rows-and-columns-in-excel-using-csharp.jpg
 [2]: #CSharp-API-to-Hide-and-Show-Rows-or-Columns
 [3]: #Hide-Rows-and-Columns-using-CSharp
 [4]: #Show-Hidden-Rows-and-Columns-using-CSharp
 [5]: #Hide-Multiple-Rows-and-Columns-using-CSharp
 [6]: #Show-All-Hidden-Rows-and-Columns-using-CSharp
 [7]: https://docs.fileformat.com/spreadsheet/xlsx/
 [8]: https://products.aspose.com/cells/net/
 [9]: https://downloads.aspose.com/cells/net
 [10]: https://www.nuget.org/packages/aspose.cells
 [11]: https://apireference.aspose.com/cells/net/aspose.cells/workbook
 [12]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet
 [13]: https://apireference.aspose.com/cells/net/aspose.cells/workbook/properties/worksheets
 [14]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hiderow
 [15]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hidecolumn
 [16]: https://apireference.aspose.com/cells/net/aspose.cells.workbook/save/methods/2
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Hide-Rows-and-Columns-using-CSharp.jpg
 [18]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet/properties/cells
 [19]: https://apireference.aspose.com/cells/net/aspose.cells/cells
 [20]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/unhiderow
 [21]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/unhidecolumn
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Show-Hidden-Rows-and-Columns-using-CSharp.jpg
 [23]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hiderows
 [24]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/hidecolumns
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Hide-Multiple-Rows-and-Columns-using-CSharp.jpg
 [26]: https://apireference.aspose.com/cells/net/aspose.cells/row/properties/ishidden
 [27]: https://apireference.aspose.com/cells/net/aspose.cells/column/properties/ishidden
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Show-All-Rows-and-Columns-using-CSharp.jpg
 [29]: https://apireference.aspose.com/cells/net/aspose.cells/row
 [30]: https://apireference.aspose.com/cells/net/aspose.cells/column
 [31]: https://purchase.aspose.com/temporary-license
 [32]: https://docs.aspose.com/cells/net/
 [33]: https://forum.aspose.com/c/cells/9
 [34]: https://blog.conholdate.com/2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/





