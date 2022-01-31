---
title: "Supprimer les lignes et les colonnes vides dans Excel à l'aide de C #"
author: Muhammad Sohail
date: 2020-12-25T13:06:24+00:00
summary: "Dans cet article, je vais vous expliquer comment supprimer des lignes et des colonnes vides dans un fichier Excel à l'aide de C#. J'expliquerai également pourquoi les références (utilisées dans les formules, les graphiques et les tableaux) doivent être mises à jour automatiquement lors de la suppression des lignes et des colonnes vides."
url: /2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"

---
Dans cet article, je vais vous expliquer comment supprimer des lignes et des colonnes vides dans un fichier Excel à l'aide de C#. J'expliquerai également comment mettre à jour automatiquement les références (utilisées dans les formules, les graphiques et les tableaux) tout en supprimant les lignes et les colonnes vides.
  * [Supprimer les lignes vides dans Excel à l'aide de C#][1]
  * [Mettre à jour les références automatiquement lors de la suppression de lignes vides][2]{.broken_link}
  * [Supprimer les colonnes vides dans Excel à l'aide de C#][3]{.broken_link}

## C# API to Remove Blank Rows and Columns

[Aspose.Cells pour .NET][4] est une API de manipulation de feuille de calcul bien connue qui vous permet de créer et de traiter des fichiers Excel à partir de vos applications .NET. L'API vous permet de supprimer des lignes et des colonnes vides dans les fichiers Excel en quelques lignes de code. Vous pouvez soit [télécharger][5] les binaires de l'API, soit les installer à l'aide de [NuGet][6].
<pre class="EnlighterJSRAW" data-enlighter-language="generic" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> PM> Install-Package Aspose.Cells</pre>
## Supprimer les lignes vides dans Excel à l'aide de C# {#Delete-Blank-Rows-in-Excel}

Voici les étapes pour supprimer toutes les lignes vides dans Excel à l'aide de C#.
  * Ouvrez un fichier Excel à l'aide de l'objet [Workbook][7].
  * Accédez à la feuille de calcul contenant les lignes vides. La feuille de calcul est accessible soit par index (basé sur zéro), soit par nom.
  * Appelez la méthode [Cells.DeleteBlankRows()][8] pour supprimer toutes les lignes vides qui ne contiennent aucune donnée.

L'exemple de code suivant montre comment supprimer des lignes vides dans Excel à l'aide de C#.
```
using Aspose.Cells;

// Ouvrez un fichier Excel existant.
Workbook wb = new Workbook("SampleInput.xlsx");

// Obtenez la collection de feuilles de calcul dans la feuille de calcul.
WorksheetCollection sheets = wb.Worksheets;

// Obtenez la première feuille de calcul de WorksheetCollection par index.
Worksheet sheet = sheets[0];
// Ou par nom.
// Feuille de calcul = feuilles["Feuille1"] ;

// Supprimez les lignes vides de la feuille de calcul.
sheet.Cells.DeleteBlankRows();

// Enregistrez le fichier excel.
wb.Save("SampleOutput.xlsx");
```

{{< figure align=center src="images/Remove-Blank-Rows.jpg" alt="Supprimer les lignes vides" caption="Fig 1: Supprimer les lignes vides">}}
 

Veuillez noter que la méthode [Cells.DeleteBlankRows][8] supprime les lignes vides même si une sorte de formatage leur est appliquée. Il supprime également les lignes vides formatées sous vos données.
{{< figure align=center src="images/Formatted-Blank-Rows.jpg" alt="Supprimer les lignes vides formatées" caption="Fig 2: Supprimer les lignes vides formatées">}}
 

Si vous souhaitez supprimer des lignes vides de toutes les feuilles de calcul d'un document Excel, parcourez simplement [WorksheetCollection][11] et appelez la méthode [DeleteBlankRows][8] sur chaque feuille de calcul, comme indiqué dans le code suivant :
```
// Ouvrez un fichier Excel existant.
Workbook workbook = new Workbook("SampleInput.xlsx");

// Itérer sur les feuilles de calcul.
foreach (Worksheet sheet in workbook.Worksheets)
{
    // Delete the Blank Rows from the worksheet.
    sheet.Cells.DeleteBlankRows();
}

// Enregistrez le fichier excel.
workbook.Save("SampleOutput.xlsx");
```

## Mettre à jour les références automatiquement lors de la suppression de lignes vides {#Update-References-Automatically}

La suppression de lignes vides peut casser les références dans les formules, les graphiques et les tableaux. Par exemple, la cellule B2 de la deuxième feuille de calcul contient une formule **=Feuille1!C3** qui fait référence à la cellule C3 de la première feuille de calcul, comme illustré dans la figure suivante.
{{< figure align=center src="images/Worksheet-With-Formula-1024x640.jpg" alt="Une cellule de Sheet2 fait référence à une valeur de Sheet1." caption="Fig 3 : Une cellule de Sheet2 fait référence à une valeur de Sheet1.">}}
 

If we remove blank rows in Sheet1, the value **lima@gmail.com** will move to cell C1. Mais la formule (= Sheet1! C3) ne sera pas mise à jour et la cellule B2 contiendra une valeur non valide, comme indiqué ci-dessous.

{{< figure align=center src="images/Cell-with-Invalid-Value-1024x640.jpg" alt="Après avoir supprimé les lignes vides, la formule de la cellule B2 n'a pas été mise à jour." caption="Fig 4 : Après avoir supprimé les lignes vides, la formule dans la cellule B2 n'a pas été mise à jour.">}}
 

Nous pouvons éviter ce problème en utilisant la propriété [DeleteOptions.UpdateReference][14] et en la définissant sur **true**. Il s'assurera que les références sont mises à jour lors de la suppression des lignes vides. L'exemple de code suivant montre comment utiliser la propriété **DeleteOptions.UpdateReference**.
```
// Ouvrez un fichier Excel existant.
Workbook wb = new Workbook("SampleInput.xlsx");

// Obtenez la collection de feuilles de calcul dans la feuille de calcul.
WorksheetCollection sheets = wb.Worksheets;

// Obtenez la première feuille de calcul de WorksheetCollection par index.
Worksheet sheet = sheets[0];

// Cette option assurera les références (dans les formules, les graphiques)
// sont mis à jour lors de la suppression des lignes vides.
DeleteOptions options = new DeleteOptions();
options.UpdateReference = true;

// Supprimez les lignes vides de la feuille de calcul.
sheet.Cells.DeleteBlankRows(options);

// Enregistrez le fichier excel.
wb.Save("SampleOutput.xlsx");
```

Comme le montre l'image suivante, la formule a été mise à jour et la cellule B2 contient une valeur valide.
{{< figure align=center src="images/Cell-with-Valid-value-1024x640.jpg" alt="La formule a été mise à jour et la cellule contient une valeur valide." caption="Fig 5 : La formule a été mise à jour et la cellule contient une valeur valide.">}}
 

## Supprimer les colonnes vides dans Excel à l'aide de C# {#Delete-Blank-Columns-in-Excel}

Les étapes pour supprimer des colonnes vides sont les mêmes que pour supprimer des lignes vides. Nous utilisons la méthode [Cells.DeleteBlankColumns][16] pour supprimer toutes les colonnes vides qui ne contiennent aucune donnée. L'exemple de code suivant montre comment supprimer des lignes et des colonnes vides en C#.
```
// Ouvrez un fichier Excel existant.
Workbook wb = new Workbook("SampleInput.xlsx");

// Obtenez la collection de feuilles de calcul dans la feuille de calcul.
WorksheetCollection sheets = wb.Worksheets;

// Obtenez la première feuille de calcul de WorksheetCollection par index.
Worksheet sheet = sheets[0];

// Cette option assurera les références (dans les formules, les graphiques)
// sont mis à jour lors de la suppression des lignes et des colonnes vides.
DeleteOptions options = new DeleteOptions();
options.UpdateReference = true;

// Supprimez les lignes et les colonnes vides.
sheet.Cells.DeleteBlankRows(options);
sheet.Cells.DeleteBlankColumns(options);

// Calculer les formules du classeur
wb.CalculateFormula();

// Enregistrez le fichier excel.
wb.Save("SampleOutput.xlsx");
```

{{< figure align=center src="images/Delete-Blank-Rows-and-Columns-1024x640.jpg" alt="Supprimer les lignes et les colonnes vides" caption="Fig 6: Supprimer les lignes et colonnes vides">}}
 

## Conclusion

Dans cet article, vous avez appris à supprimer des lignes et des colonnes vides dans un fichier Excel à l'aide de C#. De plus, vous avez appris à mettre à jour automatiquement les références (utilisées dans les formules, les graphiques et les tableaux) tout en supprimant les lignes et les colonnes vides. Veuillez consulter la [documentation][18] de Aspose.Cells pour .NET pour plus d'informations. Si vous avez des questions, n'hésitez pas à les poster sur notre [Forum d'assistance][19]. Nous y répondrons dans quelques heures.
## See Also

  * [Créer des fichiers MS Excel par programmation en C # sans MS Office][20]
  * [Convertir des fichiers MS Excel XLSX en DOCX à l'aide de C#][21]

 [1]: #Delete-Blank-Rows-in-Excel
 [2]: http://Update-References-Automatically
 [3]: http://Delete-Blank-Columns-in-Excel
 [4]: https://products.aspose.com/cells/net
 [5]: https://downloads.aspose.com/cells/net
 [6]: http://nuget.org/packages/Aspose.Cells
 [7]: https://apireference.aspose.com/cells/net/aspose.cells/workbook
 [8]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleteblankrows
 [9]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Remove-Blank-Rows.jpg
 [10]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Formatted-Blank-Rows.jpg
 [11]: https://apireference.aspose.com/cells/net/aspose.cells/worksheetcollection
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Worksheet-With-Formula.jpg
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Cell-with-Invalid-Value.jpg
 [14]: https://apireference.aspose.com/cells/net/aspose.cells/deleteoptions/properties/updatereference
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Cell-with-Valid-value.jpg
 [16]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/deleteblankcolumns
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2020/12/Delete-Blank-Rows-and-Columns.jpg
 [18]: https://docs.aspose.com/cells/net/
 [19]: https://forum.aspose.com/
 [20]: https://blog.aspose.com/2020/01/21/create-excel-xls-xlsx-programmatically-in-csharp-net/
 [21]: https://blog.aspose.com/2020/10/15/convert-excel-xlsx-to-docx-using-csharp/





