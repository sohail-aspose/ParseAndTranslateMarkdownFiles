---
title: "Insérer ou supprimer des lignes et des colonnes dans Excel à l'aide de C #"
author: Muzammil Khan
date: 2021-10-06T10:01:28+00:00
summary: "En tant que développeur C#, vous pouvez facilement insérer ou supprimer les lignes et les colonnes dans les feuilles de calcul Excel par programmation. Dans cet article, vous apprendrez <strong>à insérer ou à supprimer des lignes et des colonnes dans une feuille Excel à l'aide de C#</strong> ."
url: /2021/10/06/insert-or-delete-rows-and-columns-in-excel-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Supprimer des colonnes d'Excel"
  - "Supprimer des lignes d'Excel"
  - "Insérer des colonnes dans Excel"
  - "Insérer des lignes dans Excel"

---


{{< figure align=center src="images/insert-or-delete-rows-and-columns-in-excel-using-csharp.jpg" alt="Insérer ou supprimer des lignes et des colonnes dans Excel à l'aide de C #">}}
 

En tant que développeur C#, vous pouvez facilement insérer ou supprimer les lignes et les colonnes dans les feuilles de calcul Excel par programmation. Dans cet article, vous apprendrez **comment insérer ou supprimer des lignes et des colonnes dans une feuille Excel à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour insérer ou supprimer des lignes et des colonnes][2]
  * [Insérer des lignes dans des feuilles de calcul Excel à l'aide de C #][3]
  * [Insérer des lignes avec mise en forme dans des feuilles de calcul Excel à l'aide de C#][4]
  * [Supprimer des lignes de feuilles de calcul Excel à l'aide de C#][5]
  * [Insérer des colonnes dans des feuilles de calcul Excel à l'aide de C #][6]
  * [Supprimer des colonnes de feuilles de calcul Excel à l'aide de C#][7]

## API C# pour insérer ou supprimer des lignes et des colonnes {#CSharp-API-to-Insert-or-Delete-Rows-and-Columns}

Pour insérer ou supprimer les lignes et les colonnes dans une feuille [Excel][8], j'utiliserai [Aspose.Cells pour .NET API][9]. Il s'agit d'une API de manipulation de feuille de calcul bien connue qui vous permet de créer et de traiter des fichiers Excel à partir de vos applications .NET. L'API vous permet d'insérer une ou plusieurs lignes et colonnes dans les fichiers Excel. Il vous permet également de supprimer les lignes et les colonnes par programmation.
Vous pouvez soit [télécharger][10] la DLL de l'API, soit l'installer à l'aide de [NuGet][11].
<pre class="wp-block-code"><code>Install-Package Aspose.Cells</code></pre>
## Insérer des lignes dans des feuilles de calcul Excel à l'aide de C# {#Insert-Rows-in-Excel-Worksheets-using-CSharp}

Vous pouvez insérer des lignes dans des feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][12] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][13].
  * Accédez à la feuille de calcul à partir de la collection [Worksheets][14] par son index.
  * Insérez des lignes en appelant la méthode [InsertRows()][15] et transmettez l'index de la ligne de départ et le nombre total de lignes à insérer.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment insérer plusieurs lignes dans une feuille Excel à l'aide de C#**.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Insertion de 10 lignes dans la feuille de calcul à partir de la 3ème ligne
worksheet.Cells.InsertRows(2, 10);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

{{< figure align=center src="images/Insert-Multiple-Rows-in-Excel-Worksheets-using-CSharp-1024x426.jpg" alt="Insérer des lignes dans des feuilles de calcul Excel à l'aide de C #" caption="Insérez plusieurs lignes dans des feuilles de calcul Excel à l'aide de C #.">}}
 

De même, vous pouvez insérer une seule ligne dans une feuille Excel à l'aide de l'exemple de code suivant.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Insertion d'une ligne dans la feuille de calcul en 3ème position
worksheet.Cells.InsertRow(2);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

{{< figure align=center src="images/Insert-Rows-in-Excel-Worksheets-using-CSharp-1024x342.jpg" alt="Insérer une seule ligne dans des feuilles de calcul Excel à l'aide de C #" caption="Insérer une seule ligne dans des feuilles de calcul Excel à l'aide de C #">}}
 

La classe [Workbook][12] de l'API représente un classeur Excel. Vous pouvez obtenir une collection de toutes les feuilles de calcul disponibles dans un classeur à l'aide de la propriété [Worksheets][14] de cette classe. Toute feuille de calcul unique d'un classeur Excel est accessible à partir de la collection Worksheets en utilisant son index. La classe [Worksheet][13] représente une seule feuille de calcul. Il expose plusieurs propriétés et méthodes pour effectuer diverses opérations sur la feuille de calcul. La propriété [Cells][19] de cette classe représente une collection de cellules disponibles dans la feuille de calcul. La classe [Cells][20] représente une cellule individuelle dans la feuille de calcul.
La méthode [InsertRow()][21] de la classe [Cells][20] permet d'insérer une seule ligne à l'index spécifié. La classe Cells fournit également la méthode [InsertRows()][15] pour insérer plusieurs lignes en même temps. Il prend un index de ligne à partir duquel commencer à insérer des lignes et le nombre total de nouvelles lignes à insérer en tant que paramètres d'entrée.
La méthode [Save()][16] de la classe Workbook enregistre le classeur dans le chemin de fichier spécifié comme paramètre d'entrée.
## Insérer des lignes avec mise en forme dans des feuilles de calcul Excel à l'aide de C # {#Insert-Rows-with-Formatting-in-Excel-Worksheets-using-CSharp}

Vous pouvez insérer des lignes avec mise en forme dans des feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][12] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][13].
  * Accédez à la feuille de calcul à partir de la collection [Worksheets][14] par son index.
  * Créez une instance de la classe [InsertOptions][22].
  * Définissez la propriété [CopyFormatType][23]
  * Appelez la méthode [InsertRows()][24] avec l'index de ligne, le nombre total de lignes à insérer et passez les _InsertOptions_.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment insérer des lignes avec mise en forme dans une feuille Excel à l'aide de C#**.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Définition des options de formatage
InsertOptions insertOptions = new InsertOptions();
insertOptions.CopyFormatType = CopyFormatType.SameAsAbove;

// Insertion d'une ligne dans la feuille de calcul en 3ème position
worksheet.Cells.InsertRows(2, 1, insertOptions);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

La classe [InsertOptions][22] de l'API représente les options lors de l'insertion des lignes ou des colonnes. La propriété [CopyFormatType][23] de cette classe représente le type de format de copie lors de l'insertion de lignes et prend en charge les types suivants :
  * SameAsAbove — permet de copier les mêmes formats que la ligne ci-dessus.
  * SameAsBelow — permet de copier les mêmes formats que la ligne ci-dessous.
  * Effacer — permet d'effacer le formatage.

## Supprimer des lignes de feuilles de calcul Excel à l'aide de C# {#Delete-Rows-from-Excel-Worksheets-using-CSharp}

Vous pouvez supprimer des lignes de feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][12] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][13].
  * Accédez à la feuille de calcul à partir de la collection [Worksheets][14] par son index.
  * Supprimez les lignes en appelant la méthode [DeleteRows()][25] et transmettez l'index de ligne et le nombre total de lignes à supprimer.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment supprimer des lignes d'une feuille Excel à l'aide de C#**.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Suppression de 10 lignes dans la feuille de calcul à partir de la 3ème ligne
worksheet.Cells.DeleteRows(2, 10);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

La méthode [DeleteRow()][26] de la classe [Cells][20] permet de supprimer une seule ligne à l'index spécifié. De même, la méthode [DeleteRows()][25] permet de supprimer plusieurs lignes. Il prend un index de ligne à partir duquel commencer à supprimer des lignes et le nombre total de lignes à supprimer en tant que paramètres d'entrée.
## Insérer des colonnes dans des feuilles de calcul Excel à l'aide de C # {#Insert-Columns-in-Excel-Worksheets-using-CSharp}

Vous pouvez insérer des colonnes dans des feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][12] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][13].
  * Accédez à la feuille de calcul à partir de la collection [Worksheets][14] par son index.
  * Insérez une colonne en appelant la méthode [InsertColumn()][27] et transmettez l'index de colonne où insérer une nouvelle colonne.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment insérer une colonne dans une feuille Excel à l'aide de C#**.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Insertion d'une colonne dans la feuille de calcul en 2ème position
worksheet.Cells.InsertColumn(1);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

{{< figure align=center src="images/Insert-Column-in-Excel-Worksheets-using-CSharp-1024x332.jpg" alt="Insérer une seule colonne dans des feuilles de calcul Excel à l'aide de C #" caption="Insérez une seule colonne dans les feuilles de calcul Excel à l'aide de C#.">}}
 

De même, vous pouvez insérer plusieurs colonnes dans une feuille Excel en utilisant l'exemple de code ci-dessous :
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Insertion de 5 colonnes dans la feuille de calcul à partir de la 2ème position
worksheet.Cells.InsertColumns(2, 5);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

{{< figure align=center src="images/Insert-Columns-in-Excel-Worksheets-using-CSharp-1024x430.jpg" alt="Insérer plusieurs colonnes dans des feuilles de calcul Excel à l'aide de C#." caption="Insérer plusieurs colonnes dans des feuilles de calcul Excel à l'aide de C#.">}}
 

Pour insérer des colonnes dans des feuilles de calcul Excel, la classe [Cells][20] fournit la méthode [InsertColumns()][30] pour insérer plusieurs colonnes dans une feuille de calcul. Il prend un index de colonne à partir duquel commencer à insérer des colonnes et le nombre total de nouvelles colonnes à insérer en tant que paramètres d'entrée. La classe Cells fournit également la méthode [InsertColumn()][27] pour insérer une seule colonne à l'index spécifié.
## Supprimer des colonnes de feuilles de calcul Excel à l'aide de C# {#Delete-Columns-from-Excel-Worksheets-using-CSharp}

Vous pouvez supprimer des colonnes de feuilles Excel par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de la classe [Workbook][12] avec le chemin du fichier d'entrée.
  * Créez une instance de la classe [Worksheet][13].
  * Accédez à la feuille de calcul à partir de la collection [Worksheets][14] par son index.
  * Supprimez une colonne en appelant la méthode [DeleteColumn()][31] et passez l'index de la colonne à supprimer.
  * Appelez la méthode _[Save()][16]_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment supprimer une colonne d'une feuille Excel à l'aide de C#**.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Supprimer une 3ème colonne de la feuille de calcul
worksheet.Cells.DeleteColumn(2);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

De même, vous pouvez supprimer plusieurs colonnes d'une feuille Excel à l'aide de l'exemple de code suivant.
```
// Instanciation d'un objet Workbook
// Ouverture du fichier Excel via le flux de fichiers
Workbook workbook = new Workbook(@"C:\Files\Book1.xlsx");

// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];

// Suppression de 5 colonnes de la feuille de calcul à partir de la 3ème colonne
worksheet.Cells.DeleteColumns(2, 5, false);

// Enregistrement du fichier Excel modifié
workbook.Save(@"C:\Files\output.xlsx");
```

La méthode [DeleteColumns()][32] permet de supprimer plusieurs colonnes à la fois. Il faut trois paramètres, un index de colonne à partir duquel commencer à supprimer les colonnes, le nombre total de colonnes à supprimer en tant que paramètres d'entrée et une valeur true ou false pour indiquer s'il faut mettre à jour les références dans d'autres feuilles de calcul. De même, la méthode [DeleteColumn()][31] de la classe [Cells][20] permet de supprimer une seule colonne à l'index spécifié.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][33].
## Conclusion

Dans cet article, vous avez appris **comment insérer des lignes ou des colonnes dans des fichiers Excel** à l'aide de C#. Vous avez également appris ** comment supprimer des lignes et des colonnes de fichiers Excel ** par programmation. De plus, vous avez appris **comment insérer plusieurs lignes ou colonnes dans une feuille Excel**. De plus, vous avez appris **comment supprimer plusieurs lignes ou colonnes de fichiers Excel à l'aide de C#**. Vous pouvez en savoir plus sur l'API Aspose.Cells pour .NET à l'aide de la [documentation][34]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][35].
## See Also

  * [Masquer et afficher des lignes ou des colonnes dans une feuille de calcul Excel à l'aide de C#][36]
  * [Supprimer les lignes et les colonnes vides dans Excel à l'aide de C#][37]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/insert-or-delete-rows-and-columns-in-excel-using-csharp.jpg
 [2]: #CSharp-API-to-Insert-or-Delete-Rows-and-Columns
 [3]: #Insert-Rows-in-Excel-Worksheets-using-CSharp
 [4]: #Insert-Rows-with-Formatting-in-Excel-Worksheets-using-CSharp
 [5]: #Delete-Rows-from-Excel-Worksheets-using-CSharp
 [6]: #Insert-Columns-in-Excel-Worksheets-using-CSharp
 [7]: #Delete-Columns-from-Excel-Worksheets-using-CSharp
 [8]: https://docs.fileformat.com/spreadsheet/xlsx/
 [9]: https://products.aspose.com/cells/net/
 [10]: https://downloads.aspose.com/cells/net
 [11]: https://www.nuget.org/packages/aspose.cells
 [12]: https://apireference.aspose.com/cells/net/aspose.cells/workbook
 [13]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet
 [14]: https://apireference.aspose.com/cells/net/aspose.cells/workbook/properties/worksheets
 [15]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertrows
 [16]: https://apireference.aspose.com/cells/net/aspose.cells.workbook/save/methods/2
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Multiple-Rows-in-Excel-Worksheets-using-CSharp.jpg
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Rows-in-Excel-Worksheets-using-CSharp.jpg
 [19]: https://apireference.aspose.com/cells/net/aspose.cells/worksheet/properties/cells
 [20]: https://apireference.aspose.com/cells/net/aspose.cells/cells
 [21]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertrow
 [22]: https://apireference.aspose.com/cells/net/aspose.cells/insertoptions
 [23]: https://apireference.aspose.com/cells/net/aspose.cells/insertoptions/properties/copyformattype
 [24]: https://apireference.aspose.com/cells/net/aspose.cells.cells/insertrows/methods/1
 [25]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleterows
 [26]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleterow
 [27]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertcolumn
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Column-in-Excel-Worksheets-using-CSharp.jpg
 [29]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Insert-Columns-in-Excel-Worksheets-using-CSharp.jpg
 [30]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/insertcolumns
 [31]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deletecolumn
 [32]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deletecolumns
 [33]: https://purchase.aspose.com/temporary-license
 [34]: https://docs.aspose.com/cells/net/
 [35]: https://forum.aspose.com/c/cells/9
 [36]: https://blog.conholdate.com/2021/09/28/hide-and-show-rows-or-columns-in-excel-using-csharp/
 [37]: https://blog.conholdate.com/2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/





