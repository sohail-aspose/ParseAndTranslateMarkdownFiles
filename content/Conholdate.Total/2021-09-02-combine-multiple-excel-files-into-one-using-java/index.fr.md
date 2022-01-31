---
title: Combine Multiple Excel Files into One using Java
author: Muzammil Khan
date: 2021-09-02T05:12:15+00:00
summary: "En tant que développeur Java, vous pouvez facilement fusionner plusieurs fichiers Excel en un seul fichier par programme. Dans cet article, vous apprendrez <strong>à combiner plusieurs fichiers Excel en un seul à l'aide de Java.</strong>"
url: /2021/09/02/combine-multiple-excel-files-into-one-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Combiner des fichiers Excel à l'aide de Java"
  - "Combiner plusieurs classeurs en un seul"
  - "Combiner plusieurs feuilles de calcul en une seule"
  - "Fusionner les colonnes en une seule feuille de calcul"
  - "Fusionner des feuilles de calcul spécifiques en une seule"

---


{{< figure align=center src="images/combine-multiple-excel-files-into-one-using-java.jpg" alt="combiner plusieurs fichiers Excel en un seul à l'aide de Java">}}
 

Vous avez plusieurs classeurs Excel et vous souhaitez les combiner dans un seul fichier pour créer des rapports ou pour conserver les données au même endroit. En tant que développeur Java, vous pouvez facilement fusionner plusieurs fichiers Excel en un seul fichier par programme. Dans cet article, vous apprendrez **comment combiner plusieurs fichiers Excel en un seul à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour fusionner des fichiers Excel][2]
  * [Combiner plusieurs fichiers Excel en un seul à l'aide de Java][3]
  * [Combiner des feuilles de calcul spécifiques de plusieurs fichiers Excel en un seul à l'aide de Java][4]
  * [Fusionner plusieurs feuilles de calcul en une seule feuille de calcul à l'aide de Java][5]
  * [Consolider les colonnes de plusieurs feuilles de calcul en une seule à l'aide de Java][6]

## API Java pour fusionner des fichiers Excel {#Java-API-to-Merge-Excel-Files}

Pour fusionner plusieurs fichiers [Excel][7], j'utiliserai [Aspose.Cells for Java API][8]. Cette API vous permet de créer, manipuler, convertir, protéger ou imprimer des feuilles de calcul sans dépendre de Microsoft Excel. Il vous permet d'exécuter des fonctionnalités d'automatisation Excel par programmation dans vos applications Java.
Vous pouvez [télécharger][9] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>AsposeJavaAPI</id><name>API Java Aspose</name><url>https://repository.aspose.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.aspose</groupId><artifactId>aspose-cellules</artifactId><version>21.8</version></dépendance></pre>
## Combiner plusieurs fichiers Excel en un seul à l'aide de Java {#Combine-Multiple-Excel-Files-using-Java}

Vous pouvez facilement combiner plusieurs fichiers Excel en un seul fichier par programmation en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de _[Workbook][10] _class avec le premier fichier source
  * Créez une instance de _[Workbook][10] _class avec un second fichier source
  * Répétez l'étape ci-dessus pour combiner plus de deux fichiers
  * Appelez la méthode [_combine()_][11] avec la deuxième instance de fichier source
  * Répétez l'étape ci-dessus pour tous les fichiers source un par un
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][12]_ de la classe _Workbook_

L'exemple de code suivant montre **comment combiner plusieurs fichiers Excel en un seul fichier à l'aide de Java**.
```
// Ouvrez le premier fichier Excel.
Workbook SourceBook1 = new Workbook("C:\\Files\\Quarter_1.xlsx");

// Ouvrez le deuxième fichier Excel.
Workbook SourceBook2 = new Workbook("C:\\Files\\Quarter_2.xlsx");

// Ouvrez le troisième fichier Excel.
Workbook SourceBook3 = new Workbook("C:\\Files\\Quarter_3.xlsx");

// Copiez les feuilles de calcul du deuxième fichier Excel dans le premier classeur.
SourceBook1.combine(SourceBook2);

// Copiez les feuilles de calcul du troisième fichier Excel dans le premier classeur.
SourceBook1.combine(SourceBook3);

// Enregistrez le premier fichier Excel mis à jour en tant que nouveau fichier.
SourceBook1.save("C:\\Files\\CombinedFile.xlsx");
```

{{< figure align=center src="images/Combine-Multiple-Excel-Files-using-Java-1024x727.jpg" alt="Combiner plusieurs fichiers Excel en un seul à l'aide de Java" caption="Combiner plusieurs fichiers Excel en un seul à l'aide de Java">}}
 

La classe **[Workbook][10]** de l'API est la classe principale utilisée pour créer une feuille de calcul Excel. Il vous permet d'ouvrir et d'enregistrer les fichiers Excel natifs. Il fournit également plusieurs propriétés et méthodes pour travailler avec Excel Spreadsheet. La méthode **_[combine()][11]_** de cette classe combine le classeur actuel avec un autre objet Workbook. La méthode **[_save()_][12]** de la classe _Workbook_ enregistre le fichier de sortie dans le chemin de fichier spécifié.
## Combiner des feuilles de calcul spécifiques de plusieurs fichiers Excel en un seul à l'aide de Java {#Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java}

Vous pouvez facilement combiner des feuilles de calcul spécifiques à partir de plusieurs fichiers Excel dans un seul fichier par programme en suivant les étapes mentionnées ci-dessous :
  * Créez une instance de _[Workbook][10] _class pour le fichier source 1
  * Créez une instance de _[Workbook][10] _class pour le fichier source 2
  * Répétez l'étape ci-dessus pour combiner des feuilles de calcul de plus de deux fichiers
  * Créez une instance de _[Workbook][10] _class pour le fichier de destination
  * Ajouter des feuilles de calcul à l'aide de la méthode _[add()][14]_ de la classe _WorksheetCollection_
  * Appelez la méthode _[copy()][15]_ pour copier la feuille de calcul spécifiée du fichier source 1 vers le fichier de destination
  * Appelez la méthode _copy()_ pour copier la feuille de calcul spécifiée du fichier source 2 vers le fichier de destination
  * Renommer les feuilles de calcul dans le fichier de destination en utilisant la méthode _[setName()][16]_
  * Enregistrez le fichier de destination en appelant la méthode _[save()][12]_ de la classe _Workbook_

L'exemple de code suivant montre **comment combiner des feuilles de calcul spécifiques à partir de plusieurs fichiers Excel dans un seul fichier à l'aide de Java**.
```
String sourceFile1 = "Quarter_1.xlsx";
String sourceFile2 = "Quarter_2.xlsx";

// Ouvrez le premier fichier Excel.
Workbook excelA = new Workbook("C:\\Files\\" + sourceFile1);

// Ouvrez le deuxième fichier Excel.
Workbook excelB = new Workbook("C:\\Files\\" + sourceFile2);

// Créer un classeur de destination.
Workbook destWorkbook = new Workbook();

// La première feuille de calcul est ajoutée par défaut au classeur. Ajoutez la deuxième feuille de calcul.
destWorkbook.getWorksheets().add();

// Copiez la feuille de calcul Jan du premier fichier Excel dans le fichier de destination.
destWorkbook.getWorksheets().get(0).copy(excelA.getWorksheets().get("Jan"));

// Copiez la feuille de calcul Jul du deuxième fichier Excel dans le fichier de destination.
destWorkbook.getWorksheets().get(1).copy(excelB.getWorksheets().get("Jul"));

// Par défaut, les noms des feuilles de calcul sont respectivement "Feuille1" et "Feuille2".
// Donnons-leur des noms significatifs.
destWorkbook.getWorksheets().get(0).setName(sourceFile1 + " - Jan");
destWorkbook.getWorksheets().get(1).setName(sourceFile2 + " - Jul");

// Enregistrez le fichier de destination.
destWorkbook.save("C:\\Files\\CombinedSpecificSheetsInFile.xlsx");
```

{{< figure align=center src="images/Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java-1024x561.jpg" alt="Combiner des feuilles de calcul spécifiques de plusieurs fichiers Excel en un seul à l'aide de Java" caption="Combiner des feuilles de calcul spécifiques de plusieurs fichiers Excel en un seul à l'aide de Java">}}
 

La méthode de propriété **[getWorksheets()][18]** de la classe Workbook renvoie une collection de toutes les feuilles de calcul d'un Workbook. Vous pouvez ajouter une feuille de calcul à la collection de feuilles de calcul à l'aide de la méthode **[add()][14]**.
La classe [**Worksheet**][19] de cette API représente une seule feuille de calcul. Il fournit plusieurs propriétés et méthodes pour travailler avec une feuille de calcul. La méthode **[copy()][20]** de cette classe copie le contenu et les formats d'une autre feuille de calcul. La classe Worksheet fournit également des méthodes **get()** pour obtenir une feuille de calcul spécifique par son index ou par son nom. La méthode de propriété **[setName()][16]** définit le nom de la feuille de calcul.
## Fusionner plusieurs feuilles de calcul en une seule feuille de calcul à l'aide de Java {#Merge-Multiple-Worksheets-into-One-Worksheet-using-Java}

Vous pouvez facilement fusionner plusieurs feuilles de calcul d'un fichier Excel en une seule feuille de calcul par programme en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de _[Workbook][10] _class pour le fichier source
  * Ajouter une nouvelle feuille de calcul à l'aide de la méthode _add()_
  * Parcourez les feuilles de calcul source et procédez comme suit :
      * créer une plage de cellules et de colonnes pour une feuille de calcul à l'aide de la méthode _[createRange()][21]_
      * Copiez les données d'une plage source vers la plage de destination à l'aide de la méthode _[copy()][22]_
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][12]_ de la classe _Workbook_

L'exemple de code suivant montre **comment fusionner plusieurs feuilles de calcul en une seule feuille de calcul à l'aide de Java**.
```
// Ouvrez un fichier Excel contenant les feuilles de calcul :
// janvier, février, mars et avril
Workbook workbook = new Workbook("C:\\Files\\Quarter_1.xlsx");

// Ajouter une feuille de calcul nommée Summary_sheet
Worksheet summarySheet = workbook.getWorksheets().add("Summary_sheet");

// Itérer sur les feuilles de calcul source pour copier les données dans
// feuille de calcul récapitulative
String[] nameOfSourceWorksheets = { "Jan", "Feb", "Mar", "Apr" };
int totalRowCount = 0;

for (String sheetName : nameOfSourceWorksheets)
{
  // Get worksheet
    Worksheet sourceSheet = workbook.getWorksheets().get(sheetName);

    Range sourceRange = null;
    Range destRange = null;

    // In case of Jan worksheet, include all rows and columns.
    if (sheetName.equals("Jan"))
    {
        sourceRange = sourceSheet.getCells().getMaxDisplayRange();

        destRange = summarySheet.getCells().createRange(
                sourceRange.getFirstRow() + totalRowCount,
                sourceRange.getFirstColumn(),
                sourceRange.getRowCount(),
                sourceRange.getColumnCount());
    }
    // In case of other worksheets,
    // exclude the first row (which contains headings).
    else
    {
        int mdatarow = sourceSheet.getCells().getMaxDataRow(); // Zero-based
        int mdatacol = sourceSheet.getCells().getMaxDataColumn(); // Zero-based
        sourceRange = sourceSheet.getCells().createRange(0 + 1, 0, mdatarow, mdatacol + 1);

        destRange = summarySheet.getCells().createRange(
                sourceRange.getFirstRow() + totalRowCount -1,
                sourceRange.getFirstColumn(),
                sourceRange.getRowCount(),
                sourceRange.getColumnCount());
    }

    // Copies data, formatting, drawing objects etc. from a
    // source range to destination range.
    destRange.copy(sourceRange);
    totalRowCount = sourceRange.getRowCount() + totalRowCount;
}

// Enregistrer le classeur 
workbook.save("C:\\Files\\Summarized.xlsx");
```

{{< figure align=center src="images/Merge-Multiple-Worksheets-into-One-Worksheet-using-Java-1024x623.jpg" alt="Fusionner plusieurs feuilles de calcul en une seule feuille de calcul à l'aide de Java" caption="Fusionner plusieurs feuilles de calcul en une seule feuille de calcul à l'aide de Java">}}
 

La méthode de propriété **[getCells()][24]** de la classe Worksheet fournit la collection des cellules disponibles dans la feuille de calcul. La classe **[Cells][25]** de l'API représente une collection d'objets pertinents pour une cellule, comme une [Cell][26], [Row][27], etc. La classe **[getMaxDisplayRange( )][28]** La méthode de propriété de la classe Cells fournit la plage maximale qui inclut les données, les cellules fusionnées et les formes. La classe **[Range][29]** représente une plage de cellules dans une feuille de calcul.
La classe Cells fournit les méthodes suivantes pour créer une plage de cellules :
  * Méthode **[createRange][21]**(int firstIndex, int number, boolean isVertical) pour créer un objet Range à partir de lignes de cellules ou de colonnes de cellules.
  * **[createRange][30]**(int firstRow, int firstColumn, int totalRows, int totalColumns) pour créer un objet Range à partir d'une plage de cellules.
  * La méthode **[createRange][31]**(java.lang.String address) crée un objet Range à partir d'une adresse de la plage.
  * La méthode **[createRange][32]**(java.lang.String upperLeftCell, java.lang.String lowerRightCell) crée un objet Range à partir d'une plage de cellules.

La méthode **[copy()][22]** de la classe Range copie toutes sortes de données (y compris les formules), les mises en forme, les objets de dessin, etc. d'une plage source vers la plage de destination.
## Consolider les colonnes de plusieurs feuilles de calcul en une seule à l'aide de Java {#Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java}

Vous pouvez facilement fusionner des colonnes de plusieurs feuilles de calcul en une seule feuille de calcul par programme en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de _[Workbook][10] _class pour le fichier source
  * Ajouter une nouvelle feuille de calcul à l'aide de la méthode _add()_
  * Parcourez les feuilles de calcul source et procédez comme suit :
      * Copiez toutes les colonnes une par une à l'aide de la méthode _[copyColumn()][33]_ avec les cellules des feuilles de calcul source et l'index de colonne
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][12]_ de la classe _Workbook_

L'exemple de code suivant montre **comment consolider les colonnes de plusieurs feuilles de calcul dans une seule feuille de calcul à l'aide de Java**.
```
// Ouvrez un classeur.
Workbook workbook = new Workbook("C:\\Files\\sample.xlsx");

// Ajouter une feuille de calcul nommée Summary_sheet
Worksheet summarySheet = workbook.getWorksheets().add("Summary_sheet");

// Itérer sur les feuilles de calcul pour copier les colonnes dans le
// feuille de calcul récapitulative
String[] nameOfSourceWorksheets = { "Products", "Sales", "Customers" };
int totalCol = 0; 

for (String sheetName : nameOfSourceWorksheets) {
  Worksheet sourceSheet = workbook.getWorksheets().get(sheetName);

  if (sheetName.equals("Products")) {
    // Get worksheet columns collection
    ColumnCollection columns = sourceSheet.getCells().getColumns();

    // copy column to summaySheet
    for (Column column : (Iterable<Column>) columns)
    {
      summarySheet.getCells().copyColumn(sourceSheet.getCells(), column.getIndex(), totalCol);
      totalCol = totalCol + 1;
    }
    }
  else {
    // Get worksheet columns collection
    ColumnCollection columns = sourceSheet.getCells().getColumns();

    // copy column to summaySheet
    for (Column column : (Iterable<Column>) columns)
    {
      summarySheet.getCells().copyColumn(sourceSheet.getCells(), column.getIndex(), totalCol);
      totalCol = totalCol + 1;
    }
  }
}

// Enregistrez le fichier excel.
workbook.save("C:\\Files\\CopyingColumns_out.xlsx");
```

{{< figure align=center src="images/Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java-1024x527.jpg" alt="Consolider les colonnes de plusieurs feuilles de calcul en une seule à l'aide de Java" caption="Consolider les colonnes de plusieurs feuilles de calcul en une seule à l'aide de Java">}}
 

La méthode de propriété **[getColumns()][35]** de la classe Cells fournit la collection des colonnes disponibles dans la feuille de calcul. La classe **[ColumnCollection][36]** représente la collection des colonnes individuelles dans une feuille de calcul, tandis que la classe **[Column][37]** représente une seule colonne dans une feuille de calcul.
La méthode **[copyColumn()][33]** de la classe Cells copie les données et les formats d'une colonne entière. La classe Cells fournit également des méthodes copyColumn() surchargées pour copier des données avec les PasteOptions, le numéro de colonne, les colonnes totales source et destination, etc.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][38].
## Conclusion

Dans cet article, vous avez appris **comment combiner plusieurs fichiers Excel en un seul fichier**. Vous avez également appris **comment combiner des feuilles de calcul spécifiques de plusieurs fichiers Excel à l'aide de Java**. De plus, vous avez appris ** comment fusionner plusieurs feuilles de calcul en une seule ** par programmation. Cet article a également expliqué **comment consolider les colonnes de plusieurs feuilles de calcul en une seule à l'aide de Java**. Vous pouvez en savoir plus sur l'API Aspose.Cells for Java en utilisant la [documentation][39]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][40].
## See Also

  * [Exporter des données vers Excel en Java][41]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/combine-multiple-excel-files-into-one-using-java.jpg
 [2]: #Java-API-to-Merge-Excel-Files
 [3]: #Combine-Multiple-Excel-Files-using-Java
 [4]: #Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java
 [5]: #Merge-Multiple-Worksheets-into-One-Worksheet-using-Java
 [6]: #Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java
 [7]: https://docs.fileformat.com/spreadsheet/xlsx/
 [8]: https://products.aspose.com/cells/java/
 [9]: https://downloads.aspose.com/cells/java
 [10]: https://apireference.aspose.com/cells/java/com.aspose.cells/Workbook
 [11]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#combine(com.aspose.cells.Workbook)
 [12]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#save(java.lang.String)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Combine-Multiple-Excel-Files-using-Java.jpg
 [14]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheetcollection#add()
 [15]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#copy(com.aspose.cells.Workbook)
 [16]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheet#Name
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Combine-Specific-Worksheets-of-Multiple-Excel-Files-into-One-using-Java.jpg
 [18]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#Worksheets
 [19]: https://apireference.aspose.com/cells/java/com.aspose.cells/Worksheet
 [20]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheet#copy(com.aspose.cells.Worksheet)
 [21]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(int,%20int,%20boolean)
 [22]: https://apireference.aspose.com/cells/java/com.aspose.cells/range#copy(com.aspose.cells.Range)
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Merge-Multiple-Worksheets-into-One-Worksheet-using-Java.jpg
 [24]: https://apireference.aspose.com/cells/java/com.aspose.cells/worksheet#Cells
 [25]: https://apireference.aspose.com/cells/java/com.aspose.cells/Cells
 [26]: https://apireference.aspose.com/cells/java/com.aspose.cells/Cell
 [27]: https://apireference.aspose.com/cells/java/com.aspose.cells/Row
 [28]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#MaxDisplayRange
 [29]: https://apireference.aspose.com/cells/java/com.aspose.cells/Range
 [30]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(int,%20int,%20int,%20int)
 [31]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(java.lang.String)
 [32]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#createRange(java.lang.String,%20java.lang.String)
 [33]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#copyColumn(com.aspose.cells.Cells,%20int,%20int)
 [34]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Consolidate-Columns-of-Multiple-Worksheets-into-One-using-Java.jpg
 [35]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#Columns
 [36]: https://apireference.aspose.com/cells/java/com.aspose.cells/ColumnCollection
 [37]: https://apireference.aspose.com/cells/java/com.aspose.cells/Column
 [38]: https://purchase.aspose.com/temporary-license
 [39]: https://docs.aspose.com/cells/java/
 [40]: https://forum.aspose.com/c/cells/9
 [41]: https://blog.conholdate.com/2021/08/27/export-data-to-excel-in-java/





