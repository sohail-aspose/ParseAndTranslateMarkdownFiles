---
title: Compare Word Documents and Highlight Differences using Java
author: Muzammil Khan
date: 2021-08-03T17:17:27+00:00
summary: "En tant que développeur Java, vous pouvez facilement comparer vos deux documents Word ou plus par programmation. Dans cet article, vous apprendrez <strong>à comparer deux documents Word ou plus et à mettre en évidence les différences à l'aide de Java</strong> ."
url: /2021/08/03/compare-word-documents-and-highlight-differences-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Comparer plusieurs fichiers DOCX"
  - "Comparer des documents Word"
  - "Comparer des fichiers Word à l'aide de Java"
  - "API Java pour comparer des documents"

---


{{< figure align=center src="images/compare-word-documents-and-highlight-differences-using-java.jpg" alt="Comparer des documents Word et mettre en évidence les différences à l'aide de Java">}}
 

Vous pouvez facilement comparer deux documents Word ou plus et mettre en évidence les différences par programme. Vous devrez peut-être comparer plusieurs versions du même fichier Word ou des fichiers différents pour les différences et les similitudes dans votre application Java. Dans cet article, vous apprendrez **comment comparer deux documents Word ou plus et mettre en évidence les différences à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour comparer des documents Word][2]
  * [Comparer des documents Word à l'aide de Java][3]
  * [Obtenir le texte des modifications à l'aide de Java][4]
  * [Comparer les signets dans les documents Word][5]

## API Java pour comparer des documents Word {#java-comparison-api}

J'utiliserai [GroupDocs.Comparison for Java API][6] pour comparer les documents [DOCX][7]. Il compare pour détecter les changements de contenu pour les mots, les paragraphes et les caractères tout en fournissant un document de comparaison qui répertorie un résumé des différences. Il vous permet également de détecter les changements et les différences de style de texte entre des formats de documents similaires. L'API prend en charge la comparaison de tous les formats de documents standard de l'industrie tels que PDF, HTML, Word, Excel, PowerPoint, les e-mails Outlook, les diagrammes Visio, OpenDocument, AutoCAD et les images.
Vous pouvez [télécharger][8] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-comparison</artifactId><version>21.6</version></dépendance></pre>
## Comparer des documents Word à l'aide de Java {#Compare-Word-Documents-using-Java}

Vous pouvez comparer deux ou plusieurs documents Word en suivant les étapes simples ci-dessous :
  1. Créez une instance de _**[Comparer][9] **_class
  2. Fournissez le chemin du fichier DOCX source au constructeur
  3. **_[Ajouter][10]_** fichier DOCX cible à la comparaison
  4. Appelez la méthode _**[Compare()][11]**_ avec le chemin du fichier de sortie

L'exemple de code suivant montre **comment comparer des documents Word et met en évidence les différences à l'aide de Java**.
```
// initialiser le comparateur
Comparer comparer = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible
comparer.add("C:\\Files\\target.docx");

// comparer et enregistrer comparer les résultats
comparer.compare("C:\\Files\\result.docx");
```

{{< figure align=center src="images/source-and-target-word-documents-1024x671.jpg" alt="Documents Word source et cible" caption="Documents source et cible">}}
 

{{< figure align=center src="images/result-1024x679.jpg" alt="Comparer deux documents Word à l'aide de Java" caption="Comparer deux documents Word à l'aide de Java">}}
 

Le document résultant comprend également une page de synthèse à la fin du document. Il affiche le résumé de toutes les modifications.
La classe **[Comparer][9]** est la classe principale qui contrôle le processus de comparaison des documents. La méthode [Compare()][11] de cette classe compare les documents source et cible. Cette méthode enregistre les résultats dans le chemin d'accès au fichier fourni en tant que paramètre d'entrée. La méthode [Add()][10] de cette classe ajoute un fichier au processus de comparaison. Vous pouvez facilement ajouter plusieurs fichiers à la comparaison en utilisant la méthode Add() comme indiqué ci-dessous :
<pre class="wp-block-code"><code>comparer.Add("target2.docx");comparer.Add("target3.docx");</pre>
## Obtenir le texte des modifications à l'aide de Java {#Get-Changes-Text-using-Java}

Vous pouvez obtenir le texte des modifications par programme en suivant les étapes simples ci-dessous :
  1. Créez une instance de _**[Comparer][9] **_class
  2. Fournissez le chemin du fichier DOCX source au constructeur
  3. _**[Ajouter][10]**_ fichier DOCX cible à la comparaison
  4. Appelez la méthode _**[Compare()][11] **_
  5. Appelez la méthode **_[getChanges()][14]_** et obtenez les détails des modifications
  6. Afficher les modifications

L'exemple de code suivant montre **comment obtenir le texte des modifications à l'aide de Java**.
```
// initialiser le comparateur
Comparer comparerr = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible
comparerr.add("C:\\Files\\target.docx");

// comparer
final Path resultPath = comparerr.comparer();

// obtenir des modifications
ChangeInfo[] changes = comparerr.getChanges();
System.out.println("Count of changes: " + changes.length);

for (ChangeInfo change : changes) {
    System.out.printf("Change Type: %d, Text: %s%n", change.getType(), change.getText());
}
```

<pre class="wp-block-code"><code>Count of changes: 10Type de changement : 2, texte :Modifier le type : 2, Texte : Société HYPERLINK "http://www.aspose.com/" Aspose Pty Ltd Division GroupDocsType de changement : 2, texte :Type de changement : 2, texte : coolType de modification : 3, texte : testType de changement : 2, texte :Type de changement : 2, texte : signaturesModifier le type : 2, texte : notreModifier le type : 2, texte : char[Modifier le type : 2, Texte : 255]</pre>
Vous pouvez obtenir une liste des modifications entre les fichiers source et cible en appelant la méthode **[getChanges()][14]** de la classe _Comparer_. Il renvoie une liste d'objets [ChangeInfo][15]. La classe _ChangeInfo_ fournit des méthodes pour obtenir des détails sur les modifications telles que [_getText()_][16] pour obtenir le texte d'une modification spécifique.
## Comparer les signets dans les documents Word {#Compare-Bookmarks-in-Word-Documents-using-Java}

Vous pouvez comparer par programme les signets présents dans les documents Word en suivant les étapes simples ci-dessous :
  1. Créez une instance de _**[Comparer][9] **_class
  2. Fournissez le chemin du fichier DOCX source au constructeur
  3. **_[Ajouter][10]_** fichier DOCX cible à la comparaison
  4. Créez une instance de **_[CompareOptions][17]_**
  5. Définissez _**[CompareBookmarks][18]**_ sur vrai
  6. Appelez la méthode [**_Compare()_**][19] avec le chemin du fichier de sortie et l'objet _CompareOptions_

L'exemple de code suivant montre **comment comparer des signets dans des documents Word à l'aide de Java**.
```
// initialiser le comparateur
Comparer comparer = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible
comparer.add("C:\\Files\\target.docx");

// définir les options de comparaison
CompareOptions compareOptions = new CompareOptions();
compareOptions.setCompareBookmarks(true);

// comparer et enregistrer comparer les résultats
comparer.compare("C:\\Files\\result.docx", compareOptions);
```

{{< figure align=center src="images/Compare-Bookmarks-in-Word-Documents-using-Java-1024x333.jpg" alt="Comparer les signets dans les documents Word à l'aide de Java" caption="Comparer les signets dans les documents Word à l'aide de Java">}}
 

Vous pouvez améliorer votre processus de comparaison en appliquant diverses options de comparaison. À cette fin, la classe [**CompareOptions**][17] vous permet de définir différentes options de comparaison en fournissant diverses méthodes. La méthode _setCompareBookmarks()_ vous permet de comparer les signets disponibles dans les documents source et cible.
## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][21].
## Conclusion

Dans cet article, vous avez appris **comment comparer deux documents Word ou plus et mettre en évidence** les **différences** à l'aide de Java. Vous avez également appris **comment obtenir le texte des modifications en surbrillance.** De plus, vous avez appris **comment comparer des signets dans des documents Word** par programmation. Vous pouvez en savoir plus sur l'API GroupDocs.Comparison pour Java en utilisant la [documentation][22]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][23].
## See Also

  * [Comparer des images en Java pour mettre en évidence les différences][24]
  * [Comparez des fichiers texte, Word et PDF à l'aide de la bibliothèque de comparaison Java][25]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/compare-word-documents-and-highlight-differences-using-java.jpg
 [2]: #java-comparison-api
 [3]: #Compare-Word-Documents-using-Java
 [4]: #Get-Changes-Text-using-Java
 [5]: #Compare-Bookmarks-in-Word-Documents-using-Java
 [6]: https://products.groupdocs.com/comparison/java
 [7]: https://docs.fileformat.com/word-processing/docx/
 [8]: https://downloads.groupdocs.com/comparison/java
 [9]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer
 [10]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#add(java.nio.file.Path)
 [11]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#Comparer(java.lang.String)
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/source-and-target-word-documents.jpg
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/result.jpg
 [14]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#getChanges()
 [15]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.result/ChangeInfo
 [16]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.result/ChangeInfo#getText()
 [17]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.options/CompareOptions
 [18]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison.options/CompareOptions#setCompareBookmarks(boolean)
 [19]: https://apireference.groupdocs.com/comparison/java/com.groupdocs.comparison/Comparer#compare(java.lang.String,%20com.groupdocs.comparison.options.CompareOptions)
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Compare-Bookmarks-in-Word-Documents-using-Java.jpg
 [21]: https://purchase.groupdocs.com/temporary-license
 [22]: https://docs.groupdocs.com/comparison/java/
 [23]: https://forum.groupdocs.com/c/comparison/
 [24]: https://blog.groupdocs.com/2021/06/16/compare-images-in-java/
 [25]: https://blog.groupdocs.com/2020/07/15/compare-text-word-pdf-files-with-java-difference-library/





