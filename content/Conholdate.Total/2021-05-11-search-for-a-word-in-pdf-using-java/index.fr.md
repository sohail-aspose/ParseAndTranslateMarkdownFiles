---
title: Search for a Word in PDF using Java
author: Muzammil Khan
date: 2021-05-11T12:32:49+00:00
summary: "Recherchez un mot ou n'importe quel texte dans des documents PDF par programmation dans vos applications Java. Dans cet article, vous apprendrez <strong>à rechercher un mot dans des documents PDF à l'aide de Java</strong> ."
url: /2021/05/11/rechercher-un-mot-dans-pdf-en-utilisant-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Rechercher un mot dans un PDF"
  - "Rechercher dans les documents"
  - "Rechercher dans un PDF avec Java"
  - "Rechercher du texte dans le PDF"
  - "Rechercher du texte dans le PDF" using Java

---


{{< figure align=center src="images/Search-in-PDF-1.jpg" alt="Rechercher un mot dans un PDF avec Java">}}
 

Vous devrez peut-être rechercher un texte spécifique dans des documents Word ou PDF. En tant que développeur Java, vous pouvez rechercher n'importe quel texte à partir de documents PDF par programmation. Dans cet article, vous apprendrez **comment rechercher un mot dans des documents PDF en utilisant Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour la recherche de texte][2]
  * [Rechercher du texte dans un PDF à l'aide de Java][3]

## API Java pour la recherche de texte {#api-for-searching-text}

J'utiliserai l'API [GroupDocs.Search for Java][4] pour effectuer des recherches dans les documents [PDF][5]. Il vous permet d'effectuer des opérations de recherche de texte dans tous les formats de documents courants tels que PDF, Word, Excel, PowerPoint et bien d'autres. Vous pouvez facilement récupérer les informations requises à partir de fichiers, de documents, d'e-mails et d'archives à l'aide de cette API. Il vous permet également de créer et de fusionner plusieurs index. Vous pouvez utiliser des requêtes simples, booléennes, d'expression régulière (Regex), floues et d'autres types de requêtes pour rechercher rapidement et intelligemment dans les index.
### Télécharger et configurer
Vous pouvez [télécharger][6] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans vos applications Java basées sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-recherche</artifactId><version>20.11</version></dépendance></pre>
## Rechercher du texte dans un PDF à l'aide de Java {#search-text-from-pdf}

Vous pouvez facilement rechercher n'importe quel texte ou un mot spécifique dans vos documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créer un [Index][7]
  * Spécifiez le chemin d'accès au dossier d'index
  * Abonnez-vous à [indexer les événements][8]
  * Ajouter des fichiers à Index en appelant la méthode [add][9]
  * Effectuer une recherche en utilisant la méthode [search][10]
  * Utilisez [SearchResult][11] et imprimez le résumé
  * Mettez en surbrillance les résultats recherchés dans la sortie à l'aide de la méthode [highlight][12]

L'exemple de code suivant montre comment rechercher un mot dans un document PDF à l'aide de Java.
```
String indexFolder = "C:\\Index\\"; // Specify the path to the index folder
String documentsFolder = "C:\\Files\\"; // Specify the path to a folder containing documents to search

// Créer un nouvel index ou
// Ouvrir un index existant
Index index = new Index(indexFolder);

// Abonnez-vous aux événements de l'index
index.getEvents().ErrorOccurred.add(new EventHandler<IndexErrorEventArgs>() {
    public void invoke(Object sender, IndexErrorEventArgs args) {
        System.out.println(args.getMessage()); // Writing error messages to the console
    }
});

// Ajouter des fichiers de manière synchrone
index.add(documentsFolder); // Synchronous indexing documents from the specified folder

// Effectuer une recherche
String query = "elementum"; // Specify a search query
SearchResult result = index.search(query); // Searching in the index

// Utiliser les résultats de recherche
// Impression du résultat
System.out.println("Documents found: " + result.getDocumentCount());
System.out.println("Total occurrences found: " + result.getOccurrenceCount());
for (int i = 0; i < result.getDocumentCount(); i++) {
    FoundDocument document = result.getFoundDocument(i);
    System.out.println("\tDocument: " + document.getDocumentInfo().getFilePath());
    System.out.println("\tOccurrences: " + document.getOccurrenceCount());
}

// Surligner les occurrences dans le texte
if (result.getDocumentCount() > 0) {
    FoundDocument document = result.getFoundDocument(0); // Getting the first found document
    String path = "C:\\Output\\Highlighted.html";
    OutputAdapter outputAdapter = new FileOutputAdapter(path); // Creating the output adapter to a file
    HtmlHighlighter highlighter = new HtmlHighlighter(outputAdapter); // Creating the HtmlHighlighter object
    index.highlight(document, highlighter); // Generating output HTML formatted document with highlighted search results

    System.out.println();
    System.out.println("Generated HTML file can be opened with Internet browser.");
    System.out.println("The file can be found by the following path:");
    System.out.println(Paths.get(path).toAbsolutePath().toString());
}
```

L'exemple de code ci-dessus doit générer la sortie suivante :
<pre class="wp-block-code"><code>Documents found: 1Nombre total d'occurrences trouvées : 6Document : C:\Files\Lorem ipsum.pdfOccurrences : 6
Le fichier HTML généré peut être ouvert avec un navigateur Internet.Le fichier peut être trouvé par le chemin suivant :C:\Sortie\Mise en surbrillance.html</pre>
{{< figure align=center src="images/Search-word-in-PDF-1-1024x531.jpg" alt="Rechercher un mot dans un document PDF à l'aide de Java" caption="Rechercher un mot dans un document PDF à l'aide de Java">}}
 

### L'événement Index et Index
La classe [Index][7] est la classe principale pour l'indexation des documents et la recherche parmi eux. Un index peut être créé en mémoire ou sur disque en appelant le constructeur de cette classe. Je l'ai créé sur disque afin qu'il puisse être réutilisé.
Pour recevoir des informations sur les erreurs d'indexation, je me suis abonné à l'événement [ErrorOccurred][8]. Il affichera les erreurs, le cas échéant, lors de l'indexation des fichiers.
### Ajouter des fichiers à l'index
La méthode [add][9] de la classe Index ajoute un fichier ou tous les fichiers d'un dossier ou de sous-dossiers par un chemin absolu ou relatif. Tous les documents sur le chemin donné seront indexés.
### Effectuer une opération de recherche
La classe Index fournit diverses méthodes [search][10] pour effectuer l'opération de recherche. Vous pouvez effectuer une recherche par simple mot-clé ou en définissant une [SearchQuery][14].
La classe [SearchResult][11] fournit des détails sur un résultat de recherche correspondant à une requête de recherche. Certaines des méthodes sont décrites ici :
  * La méthode [getOccurrenceCount][15]() renvoie le nombre total d'occurrences trouvées
  * La méthode getDocumentCount() fournit le nombre de documents trouvés dans l'Index
  * La méthode [getFoundDocument(int)][16] renvoie le [FoundDocument][17]
  * La méthode [FoundDocument.getOccurrenceCount()][18] renvoie le nombre d'occurrences trouvées dans le document

### Mettez en surbrillance les résultats de la recherche
La classe [HtmlHighlighter][19] facilite la mise en évidence des résultats de la recherche dans un texte de document entier formaté en HTML.
La méthode [highlight][12] de la classe Index génère une sortie HTML mettant en évidence les occurrences des termes trouvés. Vous pouvez trouver plus de détails sur "[Mise en évidence des résultats de recherche][20]" dans la documentation.
## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][21].
## Conclusion

Dans cet article, vous avez appris **comment rechercher un mot dans un document PDF en utilisant Java**. Vous pouvez en savoir plus sur GroupDocs.Search pour l'API Java en utilisant la [documentation][22]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][23].
## See Also

  * [Rechercher du texte dans les formats de documents Word, Excel, PDF et ZIP à l'aide de C# .NET][24]
  * [Créez votre solution de recherche de texte intégral par programmation en C#][25]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Search-in-PDF-1.jpg
 [2]: #api-for-searching-text
 [3]: #search-text-from-pdf
 [4]: https://products.groupdocs.com/search/java
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://downloads.groupdocs.com/search/java
 [7]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index
 [8]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.events/EventHub#ErrorOccurred
 [9]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index#add(java.lang.String)
 [10]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index#search(java.lang.String)
 [11]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/SearchResult
 [12]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/Index#highlight(com.groupdocs.search.results.FoundDocument,%20com.groupdocs.search.highlighters.Highlighter)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Search-word-in-PDF-1.jpg
 [14]: https://apireference.groupdocs.com/search/java/com.groupdocs.search/SearchQuery
 [15]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/SearchResult#getOccurrenceCount()
 [16]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/SearchResult#getFoundDocument(int)
 [17]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/FoundDocument
 [18]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.results/FoundDocument#getOccurrenceCount()
 [19]: https://apireference.groupdocs.com/search/java/com.groupdocs.search.highlighters/HtmlHighlighter
 [20]: https://docs.groupdocs.com/search/java/highlighting-search-results/
 [21]: https://purchase.groupdocs.com/temporary-license
 [22]: https://docs.groupdocs.com/search/java/
 [23]: https://forum.groupdocs.com/c/search/
 [24]: https://blog.groupdocs.com/2020/05/29/search-text-in-word-excel-pdf-zip-document-formats-using-csharp-net/
 [25]: https://blog.groupdocs.com/2019/11/22/build-your-full-text-search-solution-in-csharp/





