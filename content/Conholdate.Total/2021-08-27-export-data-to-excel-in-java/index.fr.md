---
title: Export Data to Excel in Java
author: Muzammil Khan
date: 2021-08-27T03:06:50+00:00
summary: "En tant que développeur Java, vous pouvez facilement exporter des données depuis des tableaux, une collection d'objets, JSON ou CSV vers Excel par programmation. Dans cet article, vous apprendrez <strong>à exporter des données vers Excel à l'aide de Java</strong> ."
url: /2021/08/27/export-data-to-excel-in-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Exporter un tableau vers Excel en Java"
  - "Exporter des données CSV vers Excel en Java"
  - "Exporter des données JSON vers Excel en Java"
  - "Exporter les données des lignes et des colonnes vers Excel"

---


{{< figure align=center src="images/export-data-to-excel-in-java.jpg" alt="Exporter des données vers Excel en Java">}}
 

Vous pouvez facilement exporter des données vers Microsoft Excel à partir de diverses sources disponibles telles que JSON et CSV. En tant que développeur Java, vous pouvez exporter par programmation des données depuis des tableaux, des listes d'objets, JSON et CSV vers des documents Excel. Dans cet article, vous apprendrez **comment exporter des données vers Excel à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour exporter des données][2]
  * [Exporter un tableau vers Excel en Java][3]
  * [Exporter un tableau à deux dimensions vers Excel][4]
  * [ArrayList vers Excel en Java][5]
  * [Exporter une collection d'objets personnalisés vers Excel en Java][6]
  * [Exporter des données vers Excel avec des cellules fusionnées en Java][7]
  * [Copier des lignes et des colonnes d'un fichier Excel à un autre en Java][8]
  * [Exporter des données JSON vers Excel en Java][9]
  * [Obtenir des données CSV dans Excel à l'aide de Java][10]

## API Java pour exporter des données {#Java-API-for-Exporting-Data}

Pour exporter des données vers Excel, j'utiliserai [Aspose.Cells for Java API][11]. Il s'agit d'une puissante API de manipulation de feuilles de calcul qui vous permet de créer, de modifier ou de convertir des fichiers Excel dans des applications Java. L'API vous permet d'exécuter des fonctionnalités d'automatisation Excel par programmation sans avoir besoin d'une application Microsoft Excel.
Vous pouvez [télécharger][12] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>AsposeJavaAPI</id><name>API Java Aspose</name><url>https://repository.aspose.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.aspose</groupId><artifactId>aspose-cellules</artifactId><version>21.8</version></dépendance></pre>
## Exporter un tableau vers Excel en Java {#Export-Array-to-Excel-in-Java}

Vous pouvez facilement exporter des données d'un tableau unidimensionnel ou d'un tableau bidimensionnel vers un document Excel. Le tableau peut être de type référence ou de type valeur. Vous pouvez exporter des données d'un tableau vers Excel en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la _[Workbook][13] _class
  * Obtenir la feuille de calcul dans une instance de la classe [_Worksheet_][14]
  * Créer un tableau contenant des valeurs de chaîne
  * Appelez la méthode [_importArray()_][15] avec le tableau
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][16]_ de la classe _Workbook_

L'exemple de code suivant montre **comment exporter un tableau de chaînes vers Excel à l'aide de Java**.
```
// Initialiser un objet Workbook
Workbook workbook = new Workbook();

// Obtenir la référence de la feuille de travail
Worksheet worksheet = workbook.getWorksheets().get(0);

// Création d'un tableau contenant des noms sous forme de valeurs de chaîne
String[] names = new String[] { "Laurence Chen", "Roman Korchagin", "Kyle Huang" };

// Exportation verticale du tableau de noms vers la première ligne et la première colonne
worksheet.getCells().importArray(names, 0, 0, true);

// Enregistrement du fichier Excel
workbook.save("C:\\Files\\output.xlsx");
```

{{< figure align=center src="images/Export-Array-to-Excel-in-Java.jpg" alt="Exporter un tableau vers Excel en Java" caption="Exporter un tableau vers Excel en Java">}}
 

La classe **[Workbook][13]** de l'API est la classe principale pour créer une feuille de calcul Excel. Il fournit des fonctionnalités pour ouvrir et enregistrer des fichiers Excel natifs. La méthode **[_save()_][16]** de cette classe est utilisée pour enregistrer le fichier de sortie dans le chemin de fichier spécifié.
La classe **[Worksheet][14]** représente une seule feuille de calcul et fournit des fonctionnalités permettant de travailler avec des cellules et des lignes.
La méthode [_importArray()_][15] de la classe Cells exporte un tableau de chaînes vers une feuille de calcul. Il prend les paramètres d'entrée suivants :
  * ***stringArray**_ : le tableau des valeurs de chaîne
  * _**firstRow**_ : le numéro de ligne de la première cellule vers laquelle exporter
  * _**firstColumn**_ : le numéro de colonne de la première cellule vers laquelle exporter
  * _**isVertical**_ : Il spécifie s'il faut exporter les données verticalement ou horizontalement

L'API fournit également les versions surchargées de la méthode _**importArray()**_ pour exporter un tableau d'entiers ou de doubles vers une feuille de calcul.
## Exporter un tableau à deux dimensions vers Excel {#Export-Two-Dimensional-Array-to-Excel}

De même, vous pouvez exporter un **tableau à deux dimensions vers un fichier Excel**. L'exemple de code suivant montre **comment exporter un tableau à deux dimensions vers un fichier Excel en Java**.
```
// Initialiser un objet Workbook
Workbook workbook = new Workbook();

// Obtenir la référence de la feuille de travail
Worksheet worksheet = workbook.getWorksheets().get(0);

// Création d'un tableau d'entiers à deux dimensions
int[][] array2D = { 
  { 1, 2 }, 
  { 3, 4 }, 
  { 5, 6 }, 
  { 7, 8 } 
};

// Exportation verticale du tableau de noms vers la première ligne et la première colonne
worksheet.getCells().importArray(array2D, 0, 0);

// Enregistrement du fichier Excel
workbook.save("C:\\Files\\output.xlsx");
```

{{< figure align=center src="images/Export-Two-Dimensional-Array-to-Excel.jpg" alt="Exporter un tableau à deux dimensions vers Excel" caption="Exporter un tableau à deux dimensions vers Excel">}}
 

La classe Cells fournit la méthode **[importArray()][19]** pour exporter un tableau à deux dimensions d'entiers vers une feuille de calcul. L'API fournit également les versions surchargées de cette méthode pour exporter un tableau bidimensionnel de chaînes ou double dans une feuille de calcul.
## Exporter ArrayList vers Excel en Java {#Export-ArrayList-to-Excel-in-Java}

Vous pouvez exporter des données d'une ArrayList vers Excel en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de la _[Workbook][13] _class
  * Obtenir la feuille de calcul dans une instance de la classe [_Worksheet_][14]
  * Créer une liste de tableaux contenant des valeurs de chaîne
  * Appelez la méthode [_importArrayList()_][20] avec la liste de tableaux
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][16]_ de la classe _Workbook_

L'exemple de code suivant montre **comment exporter une ArrayList vers Excel en** **Java**.
```
// Initialiser un objet Workbook
Workbook workbook = new Workbook();

// Obtenir la référence de la feuille de travail
Worksheet worksheet = workbook.getWorksheets().get(0);

// Instanciation d'un objet ArrayList
ArrayList<String> list = new ArrayList<String>();

// Ajouter quelques noms à la liste en tant que valeurs de chaîne
list.add("Laurence Chen");
list.add("Roman Korchagin");
list.add("Kyle Huang");
list.add("Tommy Wang");

// Exporter le contenu de ArrayList verticalement au niveau de la première ligne et de la première colonne de la feuille de calcul. 
worksheet.getCells().importArrayList(list, 0, 0, true);

// Enregistrement du fichier Excel
workbook.save("C:\\Files\\Output.xlsx");
```

{{< figure align=center src="images/Export-ArrayList-to-Excel-in-Java.jpg" alt="Exporter la liste des tableaux vers Excel en Java" caption="Exporter ArrayList vers Excel en Java">}}
 

La méthode [**_importArrayList()_**][20] de la classe Cells exporte une ArrayList de données vers une feuille de calcul. Il prend quatre paramètres dont la ArrayList de données. Les autres paramètres sont _firstRow_, _firstColumn_ et _isVertical_.
## Exporter une collection d'objets personnalisés vers Excel en Java {#Export-Collection-of-Custom-Objects-to-Excel-in-Java}

Vous pouvez exporter les données d'une collection d'objets personnalisés vers Excel en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de la _[Workbook][13] _class
  * Obtenir la feuille de calcul dans une instance de la classe [_Worksheet_][14]
  * Créer une liste de tableaux d'objets personnalisés
  * Appelez la méthode [_importCustomObjects()_][22] avec la liste de tableau
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][16]_ de la classe _Workbook_

L'exemple de code suivant montre **comment exporter une collection d'objets personnalisés vers Excel en Java**.
```
// Initialiser un nouveau classeur
Workbook book = new Workbook();

// Obtenir la référence de la feuille de travail
Worksheet sheet = book.getWorksheets().get(0);

// Définir une ArrayList de personnes
List<Person> list = new ArrayList<Person>();

list.add(new Person("Mike", 25, "Software Engineer"));
list.add(new Person("Steve", 30, "Doctor"));
list.add(new Person("Billy", 35, "Teacher"));

// Nous sélectionnons uniquement les colonnes Nom et Âge, pas toutes, à exporter vers la feuille de calcul         
sheet.getCells().importCustomObjects((Collection)list,
    new String[] { "Name", "Age" }, // propertyNames
    true, // isPropertyNameShown
    0, // firstRow
    0, // firstColumn
    list.size(), // Number of objects to be exported
    true, // insertRows
    null, // dateFormatString
    false); // convertStringToNumber

// Enregistrez le fichier Excel
book.save("C:\\Files\\Output.xlsx");
```

{{< figure align=center src="images/Export-Collection-of-Custom-Objects-to-Excel-in-Java.jpg" alt="Collection d'objets personnalisés vers Excel en Java" caption="Collection d'objets personnalisés vers Excel en Java">}}
 

La méthode [][22]**[_importCustomObjects_][22]()** de la classe Cells exporte une liste d'objets personnalisés et prend les paramètres suivants. L'API fournit également la version surchargée de cette méthode qui prend moins de paramètres.
  * ***list**_ : la collection d'objets personnalisés
  * **_propertName_** : spécifiez le nom d'une propriété spécifique à exporter. S'il est nul, il exportera toutes les propriétés de l'objet
  * **_isPropertyNameShown_** : indique si le nom de la propriété sera exporté vers la première ligne
  * **_firstRow_** : le numéro de ligne de la première cellule à exporter
  * **_firstColumn_** : le numéro de colonne de la première cellule à exporter
  * **_rowNumber_** : nombre de lignes à exporter
  * **_insertRows_** : indique si des lignes supplémentaires sont ajoutées pour ajuster les données
  * **_dataFormatString_** : chaîne de format de date pour les cellules
  * **_convertStringToNumber_** : indique si cette méthode tentera de convertir une chaîne en nombre.

## Exporter des données vers Excel avec des cellules fusionnées en Java {#Export-Data-to-Excel-with-Merged-Cells-in-Java}

Vous pouvez exporter des données d'une collection d'objets vers une feuille de calcul contenant des cellules fusionnées en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de la _[Workbook][13] _class with template file path
  * Obtenir la feuille de calcul dans une instance de la classe [_Worksheet_][14]
  * Créer une liste de tableaux d'objets
  * Créez une instance de la classe _[ImportTableOptions][24]_
  * Appelez la méthode [_importCustomObjects()_][22] avec la liste de tableau
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][16]_ de la classe _Workbook_

L'exemple de code suivant montre comment exporter une collection d'objets personnalisés vers une **feuille de calcul Excel avec des cellules fusionnées en Java**.
```
// Ouverture d'un classeur existant.
Workbook workbook = new Workbook("C:\\Files\\SampleMergedTemplate.xlsx");

// Obtenir la référence de la feuille de travail
Worksheet sheet = workbook.getWorksheets().get(0);

// Instanciation d'un objet ArrayList
List<Product> productList = new ArrayList<Product>();

// Création d'une collection de produits
for (int i = 0; i < 3; i++)
{
  Product product = new Product(i, "Product - " + i);
    productList.add(product);
}

// Définir les options d'importation de table
ImportTableOptions tableOptions = new ImportTableOptions();

// Définissez la propriété CheckMergedCells sur true
tableOptions.setCheckMergedCells(true);
tableOptions.setFieldNameShown(false);

// Exporter les données vers un modèle Excel (dans la deuxième ligne, première colonne)           
sheet.getCells().importCustomObjects((Collection)productList, 1, 0, tableOptions);

// Enregistrez le fichier Excel
workbook.save("C:\\Files\\Output.xlsx", SaveFormat.XLSX);
```

{{< figure align=center src="images/Export-Data-to-Excel-with-Merged-Cells-in-Java-1024x434.jpg" alt="Exporter des données vers Excel avec des cellules fusionnées en Java" caption="Exporter des données vers Excel avec des cellules fusionnées en Java">}}
 

La classe **[ImportTableOptions][24]** fournit plusieurs options pour exporter des données dans des cellules. Le **_setCheckMergedCells_** indique si la vérification des cellules fusionnées. La propriété **_setFieldNameShown_** indique si le nom du champ doit être exporté ou non.
## Copier des lignes et des colonnes d'un fichier Excel à un autre en Java {#Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java}

Vous pouvez facilement copier des lignes et des colonnes d'un fichier Excel vers un autre fichier par programme en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de la _[Workbook][13] _class with source workbook input file
  * Créer une instance de la _[Workbook][13] _class for destination workbook
  * Obtenir les feuilles de calcul source et de destination dans des instances distinctes de la classe [_Worksheet_][14]
  * Appelez la méthode _[copyRows()][26]_ de la feuille de calcul de destination avec les cellules de la feuille de calcul source
  * Enregistrez le fichier de sortie du classeur de destination en appelant la méthode _[save()][16]_ de la classe _Workbook_

L'exemple de code suivant montre **comment copier des lignes et des colonnes d'un fichier Excel à un autre à l'aide de Java**.
```
// Ouvrez le fichier Excel source.
Workbook srcWorkbook = new Workbook("C:\\Files\\Source_Workbook.xlsx");

// Instanciez le fichier Excel de destination.
Workbook destWorkbook = new Workbook();

// Obtenez la première feuille de calcul du classeur source.
Worksheet srcWorksheet = srcWorkbook.getWorksheets().get(0);

// Obtenez la première feuille de calcul du classeur de destination.
Worksheet desWorksheet = destWorkbook.getWorksheets().get(0);

// Copiez toutes les lignes de la première feuille de calcul du classeur source dans
// la première feuille de calcul du classeur de destination.
desWorksheet.getCells().copyRows(srcWorksheet.getCells(), 0, 0, srcWorksheet.getCells().getMaxDisplayRange().getRowCount());

// Enregistrez le fichier excel.
destWorkbook.save("C:\\Files\\Destination_Workbook.xlsx");	
```

{{< figure align=center src="images/Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java-1024x430.jpg" alt="Copier des lignes et des colonnes d'un fichier Excel à un autre en Java" caption="Copier des lignes et des colonnes d'un fichier Excel à un autre en Java">}}
 

Vous pouvez copier des lignes spécifiques d'un fichier Excel à un autre. L'exemple de code suivant montre **comment copier des lignes spécifiques d'un fichier Excel à un autre à l'aide de Java**.
```
// Ouvrez le fichier Excel source.
Workbook srcWorkbook = new Workbook("C:\\Files\\Source_Workbook.xlsx");

// Instanciez le fichier Excel de destination.
Workbook destWorkbook = new Workbook();

// Obtenez la première feuille de calcul du classeur source.
Worksheet srcWorksheet = srcWorkbook.getWorksheets().get(0);

// Obtenez la première feuille de calcul du classeur de destination.
Worksheet desWorksheet = destWorkbook.getWorksheets().get(0);

// Copiez la deuxième ligne du classeur source dans la première ligne du classeur de destination.
desWorksheet.getCells().copyRow(srcWorksheet.getCells(), 1, 0);

// Copiez la quatrième ligne du classeur source dans la deuxième ligne du classeur de destination.
desWorksheet.getCells().copyRow(srcWorksheet.getCells(), 3, 1);

// Enregistrez le fichier excel.
destWorkbook.save("C:\\Files\\Destination_Workbook.xlsx");
```

{{< figure align=center src="images/Copy-Specific-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java-1024x432.jpg" alt="Copier des lignes et des colonnes spécifiques d'un fichier Excel à un autre en Java" caption="Copier des lignes et des colonnes spécifiques d'un fichier Excel à un autre en Java">}}
 

La méthode **_[copyRows()][26]_** copie les données et les formats de lignes entières. Il prend les cellules de la feuille de calcul source à copier en tant que paramètres d'entrée avec l'index de ligne source, l'index de ligne de destination et le numéro de ligne copié. L'API fournit également les versions surchargées de cette méthode pour copier des lignes avec [CopyOptions][29] et [PasteOptions][30].
De même, vous pouvez copier les données des colonnes d'un document Microsoft Excel à un autre à l'aide des méthodes [copyColumn()][31] ou [copyColumns()][32].
## Exporter des données JSON vers Excel en Java {#Export-JSON-Data-to-Excel-in-Java}

Vous pouvez facilement exporter des données d'un fichier JSON vers Excel en suivant les étapes mentionnées ci-dessous :
  * Créer une instance de la _[Workbook][13] _class
  * Obtenir la feuille de calcul dans une instance de la classe [_Worksheet_][14]
  * Lire le fichier JSON
  * Créez une instance de la classe _[CellsFactory][33]_
  * Initiez le style en appelant la méthode _[createStyle()][34]_
  * Définissez diverses propriétés de style telles que l'alignement horizontal, la couleur de la police, etc.
  * Créer une instance de la classe [JsonLayoutOptions][35]
  * Définir le style du titre avec l'objet style
  * Définir le tableau en tant que propriété de table sur true
  * Appelez la méthode [_JsonUtility.importData()_][36] avec l'entrée JSON et _JsonLayoutOptions_
  * Enregistrez le fichier de sortie en appelant la méthode _[save()][16]_ de la classe _Workbook_

L'exemple de code suivant montre **comment exporter des données d'un fichier JSON vers Excel à l'aide de Java**.
```
// Instanciation d'un objet Workbook
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.getWorksheets().get(0);

// Lire le fichier JSON
File file = new File("C:\\Files\\sample.json");
BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    String jsonInput = "";
    String tempString;
    while ((tempString = bufferedReader.readLine()) != null) {
      jsonInput = jsonInput + tempString; 
}    bufferedReader.close();

// Définir des styles
CellsFactory factory = new CellsFactory();
Style style = factory.createStyle();
style.setHorizontalAlignment(TextAlignmentType.CENTER);
style.getFont().setColor(Color.getCyan());
style.getFont().setBold(true);

// Définir JsonLayoutOptions
JsonLayoutOptions options = new JsonLayoutOptions();
options.setTitleStyle(style);
options.setArrayAsTable(true);

// Exporter les données JSON
JsonUtility.importData(jsonInput, worksheet.getCells(), 0, 0, options);

// Enregistrer le fichier Excel
workbook.save("C:\\Files\\Output.xlsx");
```

<pre class="wp-block-code"><code>{"questionnaire": {"sport": {"q1": {"question": "Lequel est le bon nom d'équipe en NBA ?","réponse": "fusée Huston"}},"mathématiques": {"q1": {"question": "5 + 7 = ?","réponse": "12"  },"q2": {"question": "12 - 8 = ?","réponse": "4"}}}}</pre>
{{< figure align=center src="images/Export-JSON-Data-to-Excel-in-Java.jpg" alt="Exporter des données JSON vers Excel en Java" caption="Exporter des données JSON vers Excel en Java">}}
 

La classe **[CellsFactory][33]** instancie les classes du modèle Cells. La méthode _[**createStyle()**][34]_ de cette classe crée un nouvel objet de style de la classe **[Style][38]**. La classe **Style** permet de définir le style d'affichage du document Excel, tel que la police, la couleur, l'alignement, la bordure, etc.
La classe **[JsonLayoutOptions][35]** fournit les options du type de mise en page JSON. La méthode **_setTitleStyle_** de cette classe est utilisée pour définir le style défini du titre. La méthode **_setArrayAsTable_** permet de traiter Array comme une table.
L'API fournit la classe **[JsonUtility][39]** pour traiter le JSON. La méthode [_**importData()**_][36] de cette classe exporte la chaîne JSON et prend les paramètres suivants :
  * **_json_** : la chaîne JSON
  * **_cells_** : les cellules
  * **_row_** : l'index de la ligne
  * **_column_** : l'index de la colonne
  * **_option_** : les options pour exporter la chaîne JSON

## Obtenir des données CSV dans Excel à l'aide de Java {#Export-CSV-Data-to-Excel-in-Java}

Vous pouvez exporter des données d'un fichier CSV vers Excel en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe _[LoadOptions][40]_ avec _[LoadFormat][41]_
  * Créez une instance de la classe _[Workbook][13]_ avec le chemin du fichier CSV et l'objet _LoadOptions_
  * Appelez la méthode _[save()][16]_ de la classe _Workbook_ et enregistrez le fichier de sortie

L'exemple de code suivant montre **comment exporter des données d'un fichier CSV vers Excel à l'aide de Java**.
```
// Initialisez LoadOptions avec CSV LoadFormat.
LoadOptions loadOptions = new LoadOptions(LoadFormat.CSV);

// Ouvrir le fichier CSV en tant qu'objet Workbook
Workbook workbook = new Workbook("C:\\Files\\Sample.csv", loadOptions);

// Enregistrez le fichier en tant que document Excel
workbook.save("C:\\Files\\Output.xlsx");
```

<pre class="wp-block-code"><code>id,language,edition,author,streetAddress,city,state,postalCode01,Java,troisième,Herbert Schildt,126,San Jone,Californie,39422102,C++,deuxième,EAAAA,126,San Jone,CA,39422103,.Net,deuxième,E.Balagurusamy,126,San Jone,CA,394221</pre>
{{< figure align=center src="images/Export-CSV-Data-to-Excel-in-Java-1024x662.jpg" alt="Exporter des données CSV vers Excel en Java" caption="Exporter des données CSV vers Excel en Java">}}
 

La classe **[LoadOptions][40]** de l'API fournit des options pour charger le fichier. La classe **[LoadFormat][41]** contient des constantes représentant les formats de fichier de chargement.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][43].
## Conclusion

Dans cet article, vous avez appris **comment exporter des données vers Excel en Java**. Vous avez également appris **comment exporter des données depuis des fichiers Arrays, JSON ou CSV vers Excel** par programmation. De plus, vous avez appris **comment copier des lignes et des colonnes d'un fichier Excel vers un autre fichier à l'aide de Java**. Vous pouvez en savoir plus sur l'API Aspose.Cells for Java en utilisant la [documentation][44]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][45].
## See Also

  * [Copier des lignes et des colonnes dans Excel à l'aide de Java][46]

## Frequently Asked Questions

<div class="schema-faq wp-block-yoast-faq-block"><div class="schema-faq-section" id="faq-question-1629907907589"><strong class="schema-faq-question">Comment exporter des données vers un fichier XLSX en Java ?</strong>    
<p class="schema-faq-answer">Vous pouvez facilement exporter des données depuis Arrays, Collection of Objects, JSON et CSV vers un fichier XLSX à l'aide de l'API Aspose.Cells for Java facile à intégrer dans votre application Java.    
</div>  
<div class="schema-faq-section" id="faq-question-1629908207011"><strong class="schema-faq-question">Comment exporter des données de JSON vers Excel ?</strong>    
<p class="schema-faq-answer">L'API Aspose.Cells fournit JsonUtility pour exporter les données d'un fichier JSON vers Excel en Java. Vous pouvez trouver des étapes simples dans la section <a href="#Export-JSON-Data-to-Excel-in-Java">"Exporter des données JSON vers Excel en Java"</a> .    
</div>  
<div class="schema-faq-section" id="faq-question-1629908207011"><strong class="schema-faq-question">Comment exporter des données de CSV vers Excel en Java ?</strong>    
<p class="schema-faq-answer">Vous pouvez simplement charger un fichier CSV et l'enregistrer au format XLSX à l'aide de l'API Aspose.Cells. Vous pouvez trouver des étapes simples dans la section <a href="#Export-CSV-Data-to-Excel-in-Java">"Obtenir des données CSV dans Excel à l'aide de Java"</a> .    
</div></div>
 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/export-data-to-excel-in-java.jpg
 [2]: #Java-API-for-Exporting-Data
 [3]: #Export-Array-to-Excel-in-Java
 [4]: #Export-Two-Dimensional-Array-to-Excel
 [5]: #Export-ArrayList-to-Excel-in-Java
 [6]: #Export-Collection-of-Custom-Objects-to-Excel-in-Java
 [7]: #Export-Data-to-Excel-with-Merged-Cells-in-Java
 [8]: #Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java
 [9]: #Export-JSON-Data-to-Excel-in-Java
 [10]: #Export-CSV-Data-to-Excel-in-Java
 [11]: https://products.aspose.com/cells/java/
 [12]: https://downloads.aspose.com/cells/java
 [13]: https://apireference.aspose.com/cells/java/com.aspose.cells/Workbook
 [14]: https://apireference.aspose.com/cells/java/com.aspose.cells/Worksheet
 [15]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importArray(java.lang.String[],%20int,%20int,%20boolean)
 [16]: https://apireference.aspose.com/cells/java/com.aspose.cells/workbook#save(java.lang.String)
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Array-to-Excel-in-Java.jpg
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Two-Dimensional-Array-to-Excel.jpg
 [19]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importArray(int[][],%20int,%20int)
 [20]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importArrayList(java.util.ArrayList,%20int,%20int,%20boolean)
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-ArrayList-to-Excel-in-Java.jpg
 [22]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#importCustomObjects(java.util.Collection,%20java.lang.String[],%20boolean,%20int,%20int,%20int,%20boolean,%20java.lang.String,%20boolean)
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Collection-of-Custom-Objects-to-Excel-in-Java.jpg
 [24]: https://apireference.aspose.com/cells/java/com.aspose.cells/ImportTableOptions
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-Data-to-Excel-with-Merged-Cells-in-Java.jpg
 [26]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#copyRows(com.aspose.cells.Cells,%20int,%20int,%20int)
 [27]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Copy-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java.jpg
 [28]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Copy-Specific-Rows-and-Columns-from-one-Excel-file-to-Another-in-Java.jpg
 [29]: https://apireference.aspose.com/cells/java/com.aspose.cells/CopyOptions
 [30]: https://apireference.aspose.com/cells/java/com.aspose.cells/PasteOptions
 [31]: https://apireference.aspose.com/cells/java/com.aspose.cells/cells#copyColumn(com.aspose.cells.Cells,%20int,%20int)
 [32]: https://apireference.aspose.com/cells/net/aspose.cells/cells/methods/copycolumns
 [33]: https://apireference.aspose.com/cells/java/com.aspose.cells/CellsFactory
 [34]: https://apireference.aspose.com/cells/java/com.aspose.cells/cellsfactory#createStyle()
 [35]: https://apireference.aspose.com/cells/java/com.aspose.cells/JsonLayoutOptions
 [36]: https://apireference.aspose.com/cells/java/com.aspose.cells/jsonutility#importData(java.lang.String,%20com.aspose.cells.Cells,%20int,%20int,%20com.aspose.cells.JsonLayoutOptions)
 [37]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-JSON-Data-to-Excel-in-Java.jpg
 [38]: https://apireference.aspose.com/cells/java/com.aspose.cells/Style
 [39]: https://apireference.aspose.com/cells/java/com.aspose.cells/jsonutility
 [40]: https://apireference.aspose.com/cells/java/com.aspose.cells/LoadOptions
 [41]: https://apireference.aspose.com/cells/java/com.aspose.cells/LoadFormat
 [42]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Export-CSV-Data-to-Excel-in-Java.jpg
 [43]: https://purchase.aspose.com/temporary-license
 [44]: https://docs.aspose.com/cells/java/
 [45]: https://forum.aspose.com/c/cells/9
 [46]: https://blog.aspose.com/2021/06/15/copy-rows-and-columns-in-excel-using-java/





