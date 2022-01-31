---
title: Delete Blank Rows and Columns in Excel using Java
author: Muzammil Khan
date: 2021-11-23T10:48:02+00:00
summary: "En tant que développeur Java, vous pouvez facilement supprimer les lignes et les colonnes vides des feuilles de calcul Excel. Dans cet article, vous apprendrez <strong>à supprimer des lignes et des colonnes vides dans Excel à l'aide de Java</strong> ."
url: /2021/11/23/delete-blank-rows-and-columns-in-excel-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Supprimer les colonnes vides dans Excel à l'aide de Java"
  - "Supprimer les lignes et les colonnes vides en Java"
  - "Supprimer les colonnes de lignes vides"
  - "Supprimer les lignes vides dans Excel à l'aide de Java"

---


{{< figure align=center src="images/delete-blank-rows-and-columns-in-excel-using-java.jpg" alt="Supprimer les lignes et les colonnes vides dans Excel à l'aide de Java">}}
 

Nous pouvons facilement supprimer par programmation les lignes et les colonnes vides des feuilles de calcul Excel. Dans cet article, nous allons apprendre **comment supprimer des lignes et des colonnes vides dans Excel à l'aide de Java**.
Les sujets suivants seront traités dans cet article :
  * [API Java pour supprimer des lignes et des colonnes vides dans Excel][2]
  * [Supprimer les lignes vides dans Excel à l'aide de Java][3]
  * [Supprimer les colonnes vides dans Excel à l'aide de Java][4]
  * [Mettre à jour automatiquement les références lors de la suppression de lignes et de colonnes vides][5]

## API Java pour supprimer des lignes et des colonnes vides dans Excel {#Java-API-to-Delete-Blank-Rows-and-Columns-in-Excel}

Pour supprimer les lignes et les colonnes vides des fichiers [XLSX][6], nous utiliserons l'API [Aspose.Cells for Java][7]. Veuillez soit [télécharger][8] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans une application Java basée sur Maven.
<pre class="wp-block-code"><code><repository><id>AsposeJavaAPI</id><name>API Java Aspose</name><url>https://repository.aspose.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.aspose</groupId><artifactId>aspose-cellules</artifactId><version>21.11</version></dépendance></pre>
## Supprimer les lignes vides dans Excel à l'aide de Java {#Delete-Blank-Rows-in-Excel-using-Java}

Nous pouvons supprimer par programme les lignes vides des feuilles de calcul Excel en suivant les étapes ci-dessous :
  * Tout d'abord, chargez un fichier Excel en utilisant la classe [Workbook][9].
  * Ensuite, appelez la méthode [Workbook.getWorksheets()][10] et récupérez les feuilles de calcul dans l'objet [WorksheetCollection][11].
  * Ensuite, accédez à la feuille de calcul contenant les lignes vides soit par son index (basé sur zéro), soit par son nom.
  * Après cela, appelez la méthode [Cells.deleteBlankRows()][12] pour supprimer les lignes vides de la feuille de calcul consultée.
  * Enfin, appelez la méthode [save()][13] avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment supprimer des lignes vides d'Excel à l'aide de Java**.
```
// Chargez un fichier Excel existant.
Workbook workbook = new Workbook("C:\\Files\\Cells\\sample_rows_cols.xlsx");

// Obtenez la collection de feuilles de calcul dans la feuille de calcul.
WorksheetCollection sheets = workbook.getWorksheets();

// Obtenez la première feuille de calcul de WorksheetCollection par index.
Worksheet sheet = sheets.get(0);
// Ou par nom.
// Feuille de calcul feuille = feuilles.get("Feuille1");

// Supprimez les lignes vides de la feuille de calcul.
sheet.getCells().deleteBlankRows();

// Enregistrez le fichier Excel mis à jour.
workbook.save("C:\\Files\\Cells\\output.xlsx");
```

{{< figure align=center src="images/Delete-Blank-Rows-in-Excel-using-Java-1024x457.jpg" alt="Supprimez les lignes vides dans Excel à l'aide de Java." caption="Supprimez les lignes vides dans Excel à l'aide de Java.">}}
 

De même, nous pouvons supprimer les lignes vides de toutes les feuilles de calcul d'un document Excel. Nous allons simplement parcourir WorksheetCollection et appeler la méthode [deleteBlankRows()][12] sur chaque feuille de calcul, comme indiqué dans l'exemple de code suivant :
```
// Ouvrez un fichier Excel existant.
Workbook workbook = new Workbook("C:\\Files\\Cells\\sample_rows_cols.xlsx");

// Obtenir la collection de feuilles de calcul
WorksheetCollection worksheets = workbook.getWorksheets();

// Itérer sur les feuilles de calcul.
for (int i=0; i<worksheets.getCount(); i++)
{
    // Access worksheets one by one
    Worksheet sheet = worksheets.get(i);
  
    // Delete the Blank Rows from the worksheet.
    sheet.getCells().deleteBlankRows();
}

// Enregistrez le fichier Excel mis à jour.
workbook.save("C:\\Files\\Cells\\output.xlsx");
```

## Supprimer les colonnes vides dans Excel à l'aide de Java {#Delete-Blank-Columns-in-Excel-using-Java}

Nous pouvons supprimer les colonnes vides des feuilles de calcul Excel par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, chargez un fichier Excel en utilisant la classe [Workbook][9].
  * Ensuite, appelez la méthode [Workbook.getWorksheets()][10] et récupérez les feuilles de calcul dans l'objet [WorksheetCollection][11].
  * Ensuite, accédez à la feuille de calcul qui contient les colonnes vides soit par son index (basé sur zéro), soit par son nom.
  * Après cela, appelez la méthode [Cells.deleteBlankColumns()][15] pour supprimer les colonnes vides de la feuille de calcul consultée.
  * Enfin, appelez la méthode [save()][13] avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment supprimer des colonnes vides d'Excel à l'aide de Java**.
```
// Ouvrez un fichier Excel existant.
Workbook workbook = new Workbook("C:\\Files\\Cells\\sample_rows_cols.xlsx");

// Obtenez la collection de feuilles de calcul dans la feuille de calcul.
WorksheetCollection sheets = workbook.getWorksheets();

// Obtenez la première feuille de calcul de WorksheetCollection par index.
Worksheet sheet = sheets.get(2);

// Supprimez les colonnes vides.
sheet.getCells().deleteBlankColumns(options);

// Enregistrez le fichier Excel mis à jour.
workbook.save("C:\\Files\\Cells\\output_DeleteBlankColumns.xlsx");	
```

{{< figure align=center src="images/Delete-Blank-Columns-in-Excel-using-Java-1024x457.jpg" alt="Supprimer les colonnes vides dans Excel à l'aide de Java." caption="Supprimer les colonnes vides dans Excel à l'aide de Java.">}}
 

## Mettre à jour automatiquement les références lors de la suppression de lignes et de colonnes vides {#Update-References-Automatically-while-Deleting-Blank-Rows-and-Columns}

La suppression de lignes ou de colonnes vides peut casser les références dans les formules, les graphiques et les tableaux. Par exemple, la cellule A1 dans Sheet2 a une formule **=Sheet1!C7** qui fait référence à la cellule C7 de la première feuille de calcul, comme illustré dans la figure suivante.
{{< figure align=center src="images/A-cell-A1-in-Sheet2-is-referring-to-a-value-of-cell-C7-in-Sheet1-1024x542.jpg" alt="Une cellule A1 dans Sheet2 fait référence à une valeur de la cellule C7 dans Sheet1." caption="Une cellule A1 dans Sheet2 fait référence à une valeur de la cellule C7 dans Sheet1.">}}
 

If we remove blank rows in Sheet1, the value of **C7 (650000)**&nbsp;will be moved to cell C6. Mais la formule (= Sheet1! C7) ne sera pas mise à jour et la cellule A1 affichera la valeur de C7 qui sera ** 550000 ** dans ce cas. Nous pouvons éviter ce problème en définissant [DeleteOptions.setUpdateReference][18] sur **true**. Il s'assurera que les références sont mises à jour lors de la suppression des lignes vides.

Nous pouvons mettre à jour automatiquement les références tout en supprimant par programme les lignes vides des feuilles de calcul Excel en suivant les étapes ci-dessous :
  * Tout d'abord, chargez un fichier Excel en utilisant la classe [Workbook][9].
  * Ensuite, appelez la méthode [Workbook.getWorksheets()][10] et récupérez les feuilles de calcul dans l'objet [WorksheetCollection][11].
  * Ensuite, accédez à la feuille de calcul soit par index (basé sur zéro), soit par nom contenant les lignes vides.
  * Ensuite, créez une instance de la classe [DeleteOptions][19]
  * Ensuite, appelez [setUpdateReferences()][18] à true. Il mettra à jour les références dans d'autres feuilles tout en supprimant les lignes vides.
  * Après cela, appelez la méthode [Cells.deleteBlankRows()][12] avec l'objet DeleteOptions comme argument pour supprimer les lignes vides de la feuille de calcul consultée.
  * Enfin, appelez la méthode [save()][13] avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment mettre à jour les références tout en supprimant les lignes vides dans Excel**.
```
// Ouvrez un fichier Excel existant.
Workbook workbook = new Workbook("C:\\Files\\Cells\\sample_rows_cols.xlsx");

// Obtenez la collection de feuilles de calcul dans la feuille de calcul.
WorksheetCollection sheets = workbook.getWorksheets();

// Obtenez la première feuille de calcul de WorksheetCollection par index.
Worksheet sheet = sheets.get(0);

// Cette option assurera les références (dans les formules, les graphiques)
// sont mis à jour lors de la suppression des lignes vides.
DeleteOptions options = new DeleteOptions();
options.setUpdateReference(true);

// Supprimez les lignes vides de la feuille de calcul.
sheet.getCells().deleteBlankRows(options);

// Enregistrez le fichier Excel mis à jour.
workbook.save("C:\\Files\\Cells\\output_UpdateReferencesAutomatically.xlsx");
```

De même, nous pouvons mettre à jour les références tout en supprimant les colonnes vides dans Excel. Cependant, nous avons juste besoin d'appeler la méthode [deleteBlankColumns()][20] avec DeleteOptions comme argument.
## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][21].
## Conclusion

Dans cet article, nous avons appris **comment supprimer des lignes et des colonnes dans Excel à l'aide de Java**. Nous avons également vu **comment mettre à jour les références tout en supprimant des lignes et des colonnes** par programmation. En outre, vous pouvez en savoir plus sur l'API Aspose.Cells for Java en utilisant la [documentation][22]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][23].
## See Also

  * [Exporter des données vers Excel en Java][24]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/delete-blank-rows-and-columns-in-excel-using-java.jpg
 [2]: #Java-API-to-Delete-Blank-Rows-and-Columns-in-Excel
 [3]: #Delete-Blank-Rows-in-Excel-using-Java
 [4]: #Delete-Blank-Columns-in-Excel-using-Java
 [5]: #Update-References-Automatically-while-Deleting-Blank-Rows-and-Columns
 [6]: https://docs.fileformat.com/spreadsheet/xlsx/
 [7]: https://products.aspose.com/cells/java/
 [8]: https://downloads.aspose.com/cells/java
 [9]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook
 [10]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#Worksheets
 [11]: https://apireference.aspose.com/cells/java/com.aspose.cells/WorksheetCollection
 [12]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#deleteBlankRows()
 [13]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#save(java.lang.String)
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Delete-Blank-Rows-in-Excel-using-Java.jpg
 [15]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#deleteBlankColumns()
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Delete-Blank-Columns-in-Excel-using-Java.jpg
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/A-cell-A1-in-Sheet2-is-referring-to-a-value-of-cell-C7-in-Sheet1.jpg
 [18]: https://apireference.aspose.com/cells/java/com.aspose.cells/deleteoptions#UpdateReference
 [19]: https://apireference.aspose.com/cells/java/com.aspose.cells/DeleteOptions
 [20]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#deleteBlankColumns(com.aspose.cells.DeleteOptions)
 [21]: https://purchase.conholdate.com/temporary-license
 [22]: https://docs.aspose.com/cells/java/
 [23]: https://forum.aspose.com/c/cells/9
 [24]: https://blog.conholdate.com/2021/08/27/export-data-to-excel-in-java/





