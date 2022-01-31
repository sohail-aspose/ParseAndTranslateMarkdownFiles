---
title: "Combinez plusieurs fichiers Excel en un seul à l'aide de C #"
author: Muhammad Sohail
date: 2021-01-13T12:34:29+00:00
summary: "Dans cet article, vous allez apprendre <strong>à copier des feuilles de plusieurs classeurs Excel dans un seul classeur à l'aide de C#</strong> . Vous apprendrez également <strong>à copier des données de plusieurs feuilles de calcul dans une seule feuille <strong>.</strong></strong>"
url: /2021/01/13/combine-multiple-excel-files-into-one-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"

---
Dans cet article, vous allez apprendre **comment copier des feuilles de plusieurs classeurs Excel dans un seul classeur à l'aide de C#**. Vous apprendrez également **comment copier des données de plusieurs feuilles de calcul dans une seule feuille**. Commençons.
  * [Combinez plusieurs fichiers Excel en un seul à l'aide de C #][1]
  * [Combiner des feuilles de calcul spécifiques de fichiers Excel dans un seul classeur][2] 
  * [Fusionner plusieurs feuilles de calcul en une seule à l'aide de C #][3]

## C# API to Merge Multiple Excel files

[Aspose.Cells pour .NET][4] est une API de manipulation de feuille de calcul bien connue qui vous permet de créer et de traiter des fichiers Excel à partir de vos applications .NET. Vous pouvez soit [télécharger][5] les binaires de l'API, soit les installer à l'aide de [NuGet][6].
<pre class="wp-block-code"><code>PM> Install-Package Aspose.Cells</code></pre>
## Combinez plusieurs fichiers Excel en un seul à l'aide de C # {#Combine-Multiple-Excel-Files}

Parfois, vous devez fusionner plusieurs fichiers Excel en un seul fichier. Vous souhaitez copier des feuilles de calcul des classeurs source vers le classeur de destination, comme indiqué ci-dessous. Les documents Excel peuvent être de n'importe quelle version comme Excel 97, Excel 2010 ou Excel 2016.
{{< figure align=center src="images/Combine-Excel-Documents-1.jpg" alt="Combinez plusieurs fichiers Excel en un seul à l'aide de C#" caption="Figue 1: Combiner des fichiers Excel">}}
 

L'exemple de code suivant montre comment combiner plusieurs fichiers Excel en un seul à l'aide de C#.
```
// Ouvrez le premier fichier Excel.
Workbook SourceBook1 = new Workbook("Excel A.xlsx");

// Ouvrez le deuxième fichier Excel.
Workbook SourceBook2 = new Workbook("Excel B.xlsx");

// Ouvrez le troisième fichier Excel.
Workbook SourceBook3 = new Workbook("Excel C.xlsx");

// Copiez les feuilles de calcul du deuxième fichier Excel dans le premier classeur.
SourceBook1.Combine(SourceBook2);

// Copiez les feuilles de calcul du troisième fichier Excel dans le premier classeur.
SourceBook1.Combine(SourceBook3);

// Enregistrez le premier fichier Excel mis à jour en tant que nouveau fichier.
SourceBook1.Save("CombinedFile.xlsx");
```

## Combiner des feuilles de calcul spécifiques de fichiers Excel à l'aide de C# {#Combine-Specific-Worksheets-of-Excel-Files}

Le code ci-dessus copie toutes les feuilles de calcul des fichiers source dans le fichier de destination. Toutefois, vous souhaiterez peut-être copier des feuilles de calcul spécifiques des fichiers source vers le fichier de destination. Par exemple, vous avez deux fichiers Excel et chacun a trois feuilles de calcul nommées Ventes, Employés et Dépenses. Vous souhaitez uniquement copier la feuille de calcul Ventes des deux fichiers vers le fichier de destination, comme indiqué dans la figure suivante.
{{< figure align=center src="images/Selective-Merging.png" alt="Combiner des feuilles de calcul spécifiques de fichiers Excel à l'aide de C #" caption="Fig 2: Combinez des feuilles de calcul spécifiques de fichiers Excel">}}
 

L'exemple de code suivant montre comment combiner des feuilles de calcul spécifiques de fichiers source dans un fichier de destination à l'aide de C#.
```
// Ouvrez le fichier Excel A.
Workbook excelA = new Workbook("Excel A.xlsx");

// Ouvrez le fichier Excel B.
Workbook excelB = new Workbook("Excel B.xlsx");

// Créer un classeur de destination.
Workbook destWorkbook = new Workbook();
// La première feuille de calcul est ajoutée par défaut au classeur. Ajoutez la deuxième feuille de calcul.
destWorkbook.Worksheets.Add();

// Copiez la feuille de calcul Ventes du fichier Excel A dans le fichier de destination.
destWorkbook.Worksheets[0].Copy(excelA.Worksheets["Sales"]);

// Copiez la feuille de calcul Ventes du fichier Excel B dans le fichier de destination.
destWorkbook.Worksheets[1].Copy(excelB.Worksheets["Sales"]);

// Par défaut, les noms des feuilles de calcul sont respectivement "Feuille1" et "Feuille2".
// Donnons-leur des noms significatifs.
destWorkbook.Worksheets[0].Name = excelA.FileName + " - Sales";
destWorkbook.Worksheets[1].Name = excelB.FileName + " - Sales";

// Enregistrez le fichier de destination.
destWorkbook.Save("CombinedFile.xlsx");
```

## Fusionner plusieurs feuilles de calcul en une seule à l'aide de C# {#Merge-Multiple-Worksheets-into-One}

Parfois, vous devez copier des données de plusieurs feuilles de calcul dans une seule feuille de calcul. Par exemple, vous avez quelques feuilles de calcul dans un fichier Excel qui contiennent des informations sur différents produits, et vous souhaitez fusionner ces feuilles en une seule feuille de calcul récapitulative, comme ceci :
{{< figure align=center src="images/merge-sheets-excel.png" alt="Fusionner plusieurs feuilles de calcul en une seule à l'aide de C #" caption="Fig 3: fusionner plusieurs feuilles de calcul en une seule">}}
 

L'extrait de code suivant montre comment copier des données de plusieurs feuilles de calcul dans une seule feuille de calcul à l'aide de C#.
```
// Ouvrez un fichier Excel contenant les feuilles de calcul :
// Produits1, Produits2 et Produits3
Workbook workbook = new Workbook("Products.xlsx");

// Ajouter une feuille de calcul nommée Summary_sheet
Worksheet summarySheet = workbook.Worksheets.Add("Summary_sheet");

// Parcourez les feuilles de calcul source dont vous souhaitez copier les données dans
// feuille de calcul récapitulative
string[] nameOfSourceWorksheets = { "Products1", "Products2", "Products3" };
int totalRowCount = 0;

foreach (string sheetName in nameOfSourceWorksheets)
{
    Worksheet sourceSheet = workbook.Worksheets[sheetName];

    Range sourceRange;
    Range destRange;
    // In case of Products1 worksheet, include all rows and cols.
    if (sheetName.Equals("Products1"))
    {
        sourceRange = sourceSheet.Cells.MaxDisplayRange;
        
        destRange = summarySheet.Cells.CreateRange(
                sourceRange.FirstRow + totalRowCount,
                sourceRange.FirstColumn,
                sourceRange.RowCount,
                sourceRange.ColumnCount);
    }
    // In case of Products2 and Products3 worksheets,
    // exclude the first row (which contains headings).
    else
    {
        int mdatarow = sourceSheet.Cells.MaxDataRow; // Zero-based
        int mdatacol = sourceSheet.Cells.MaxDataColumn; // Zero-based
        sourceRange = sourceSheet.Cells.CreateRange(0 + 1, 0, mdatarow, mdatacol + 1);

        destRange = summarySheet.Cells.CreateRange(
                sourceRange.FirstRow + totalRowCount -1,
                sourceRange.FirstColumn,
                sourceRange.RowCount,
                sourceRange.ColumnCount);
    }

    // Copies data, formatting, drawing objects etc. from a
    // source range to destination range.
    destRange.Copy(sourceRange);
    totalRowCount = sourceRange.RowCount + totalRowCount;
}

// Enregistrer le classeur 
workbook.Save("Summarized.xlsx");
```

## Conclusion

Dans cet article, vous avez appris à combiner par programme plusieurs fichiers Excel en un seul. Vous pouvez soit copier toutes les feuilles de calcul d'un fichier source ou des feuilles spécifiques dans le fichier de destination. Vous avez également appris à combiner les données de plusieurs feuilles de calcul dans une seule feuille de calcul. Veuillez consulter la [documentation d'Aspose.Cells pour .NET][10] pour plus d'informations. Si vous avez des questions, n'hésitez pas à les poser sur notre [Forum d'assistance][11]. Nous y répondrons dans quelques heures.
## See Also

  * [Supprimer les lignes et les colonnes vides dans Excel à l'aide de C #][12]
  * [Convertir des fichiers Excel en images à l'aide de C#][13]
  * [Convertir des fichiers CSV en fichiers Excel ou Excel en CSV à l'aide de C# VB.NET][14]

 [1]: #Combine-Multiple-Excel-Files
 [2]: #Combine-Specific-Worksheets-of-Excel-Files
 [3]: #Merge-Multiple-Worksheets-into-One
 [4]: https://products.aspose.com/cells/net
 [5]: https://downloads.aspose.com/cells/net
 [6]: http://nuget.org/packages/Aspose.Cells
 [7]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/01/Combine-Excel-Documents-1.jpg
 [8]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/01/Selective-Merging.png
 [9]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/01/merge-sheets-excel.png
 [10]: https://docs.aspose.com/cells/net/
 [11]: https://forum.aspose.com/
 [12]: https://blog.conholdate.com/2020/12/25/delete-blank-rows-and-columns-in-excel-using-csharp/
 [13]: https://blog.aspose.com/2021/01/01/convert-excel-files-to-images-in-csharp/
 [14]: https://blog.aspose.com/2020/11/17/csv-excel-csharp-vb-net/





