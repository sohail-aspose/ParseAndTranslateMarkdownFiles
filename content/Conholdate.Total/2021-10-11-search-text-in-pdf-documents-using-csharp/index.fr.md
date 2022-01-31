---
title: "Rechercher du texte dans des documents PDF à l'aide de C#"
author: Muzammil Khan
date: 2021-10-11T06:51:13+00:00
summary: "En tant que développeur C#, vous pouvez facilement rechercher n'importe quel texte à partir de documents PDF par programmation dans vos applications .NET. Dans cet article, vous apprendrez <strong>à rechercher un mot dans des documents PDF à l'aide de C#</strong> ."
url: /2021/10/11/search-text-in-pdf-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API pour la recherche de texte"
  - "Recherche sensible à la casse"
  - "Rechercher un mot dans un PDF"
  - "Rechercher dans les documents"
  - "Rechercher du texte dans le PDF"

---


{{< figure align=center src="images/search-for-a-word-in-pdf-using-csharp.jpg" alt="Rechercher un mot dans un PDF à l'aide de C#">}}
 

Vous devrez peut-être rechercher une information particulière, une phrase textuelle ou un mot dans vos documents. En tant que développeur C#, vous pouvez facilement rechercher n'importe quel texte à partir de documents PDF par programmation dans vos applications .NET. Dans cet article, vous apprendrez **comment rechercher du texte dans des documents PDF à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour la recherche de texte][2]
  * [Rechercher du texte dans des documents PDF à l'aide de C#][3]
  * [Recherche de texte sensible à la casse dans un PDF avec C#][4]

## API C# pour la recherche de texte {#api-for-searching-text}

Pour rechercher du texte dans des documents [PDF][5], j'utiliserai l'API [GroupDocs.Search for .NET][6]. Il vous permet d'effectuer des opérations de recherche de texte dans tous les [formats de documents populaires] [7] tels que PDF, Word, Excel, PowerPoint et bien d'autres. Il vous permet également de récupérer les informations requises à partir de fichiers, documents, e-mails et archives. Vous pouvez créer et fusionner plusieurs index pour les parcourir rapidement et intelligemment à l'aide de requêtes simples, booléennes, d'expressions régulières (Regex), floues et d'autres types de requêtes.
Vous pouvez soit [télécharger][8] la DLL de l'API, soit l'installer à l'aide de [NuGet][9].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Search</code></pre>
## Rechercher du texte dans des documents PDF à l'aide de C# {#Search-Text-in-PDF-Documents-using-CSharp}

Vous pouvez rechercher n'importe quel texte ou un mot spécifique dans vos documents PDF par programme en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe [Index][10]
  * Spécifiez le chemin d'accès au dossier d'index
  * Abonnez-vous aux [index événements][11]
  * Ajoutez des fichiers PDF à l'index en appelant la méthode [Add()][12]
  * Définir une requête de recherche
  * Effectuer une recherche à l'aide de la méthode [Search()][13] avec requête de recherche
  * Utilisez le [SearchResult] [14] et imprimez le résumé
  * Mettez en surbrillance les résultats recherchés dans la sortie à l'aide de la méthode [Highlight()][15]

L'exemple de code suivant montre **comment rechercher du texte dans des documents PDF à l'aide de C#**.
```
// Spécifiez le chemin d'accès au dossier d'index
string indexFolder = @"C:\Files\Index\";

// Spécifiez le chemin d'accès à un dossier contenant des documents PDF à rechercher
string documentsFolder = @"C:\Files\Files\"; 

// créer ou charger un index
Index index = new Index(indexFolder);

// Abonnez-vous aux événements de l'index
index.Events.ErrorOccurred += (sender, args) =>
{
    // Writing error messages to the console
    Console.WriteLine(args.Message);
};

// Ajouter des fichiers de manière synchrone
// Documents d'indexation synchrone à partir du dossier spécifié
index.Add(documentsFolder); 

// Effectuer une recherche
string query = "Vestibulum"; // Specify a search query
SearchResult result = index.Search(query); // Searching in the index

// Utiliser les résultats de recherche
// Impression du résultat
Console.WriteLine("Documents found: " + result.DocumentCount);
Console.WriteLine("Total occurrences found: " + result.OccurrenceCount);

for (int i = 0; i < result.DocumentCount; i++)
{
    FoundDocument document = result.GetFoundDocument(i);
    Console.WriteLine("\tDocument: " + document.DocumentInfo.FilePath);
    Console.WriteLine("\tOccurrences: " + document.OccurrenceCount);
}

// Surligner les occurrences dans le texte
if (result.DocumentCount > 0)
{
    // Getting the first found document
    FoundDocument document = result.GetFoundDocument(0);

    string path = documentsFolder + "Highlighted.html";

    // Creating the output adapter to a file
    OutputAdapter outputAdapter = new FileOutputAdapter(path);

    // Creating the highlighter object
    HtmlHighlighter highlighter = new HtmlHighlighter(outputAdapter);

    // Generating output HTML formatted document with highlighted search results
    index.Highlight(document, highlighter); 

    Console.WriteLine();
    Console.WriteLine("Generated HTML file can be opened with Internet browser.");
    Console.WriteLine("The file can be found by the following path:");
    Console.WriteLine(path);
}
```

L'exemple de code ci-dessus générera la sortie suivante :
<pre class="wp-block-code"><code>Documents found: 1Nombre total d'occurrences trouvées : 4Document : C:\Fichiers\Fichiers\exemple.pdfOccurrences : 4
Le fichier HTML généré peut être ouvert avec un navigateur Internet.Le fichier peut être trouvé par le chemin suivant :C:\Files\Files\Highlighted.html</pre>
{{< figure align=center src="images/Search-Text-or-Word-in-PDF-using-CSharp.jpg" alt="Recherche-texte-ou-mot-dans-PDF-à l'aide de CSharp" caption="Mise en surbrillance du texte recherché dans les documents PDF à l'aide de C #">}}
 

### L'événement Index et Index
La classe [Index][10] est la classe principale qui fournit des fonctionnalités pour indexer les documents et les parcourir. Un index peut être créé en mémoire ou sur disque en appelant le constructeur de cette classe. Dans l'exemple de code ci-dessus, j'ai créé l'index sur le disque afin qu'il puisse être réutilisé.
L'événement [ErrorOccurred][11] affiche les erreurs éventuelles lors de l'indexation des fichiers. Vous devez donc vous y abonner afin de recevoir des informations sur les erreurs d'indexation.
### Ajouter des fichiers à l'index
La méthode [Add()][12] de la classe Index ajoute un fichier ou tous les fichiers d'un dossier ou de sous-dossiers spécifiés par un chemin absolu ou relatif. Tous les documents sur le chemin donné seront indexés.
### Effectuer une opération de recherche
La classe Index fournit diverses méthodes [Search][13] pour effectuer l'opération de recherche. Vous pouvez effectuer une recherche en fournissant un simple mot-clé ou en définissant une [SearchQuery][17].
La classe [SearchResult][14] fournit des détails sur un résultat de recherche correspondant à une requête de recherche. Les méthodes et propriétés suivantes de cette classe facilitent l'obtention de détails sur les résultats de la recherche :
  * La propriété [OccurrenceCount][18] indique le nombre total d'occurrences trouvées.
  * La propriété [DocumentCount][19] fournit le nombre de documents trouvés dans l'index.
  * La méthode [GetFoundDocument(int)][20] renvoie le [FoundDocument][21] par son index.
  * La propriété [FoundDocument.OccurrenceCount][22] renvoie le nombre d'occurrences trouvées dans le document.

### Mettez en surbrillance les résultats de la recherche
La classe [HtmlHighlighter][23] met en évidence les résultats de la recherche dans un texte entier du document formaté en HTML.
La méthode [Highlight()][15] de la classe Index génère une sortie HTML mettant en évidence les occurrences des termes trouvés. Vous pouvez trouver plus de détails sur "[Mise en évidence des résultats de recherche][24]" dans la documentation.
## Recherche de texte sensible à la casse dans un PDF avec C# {#Case-Sensitive-Text-Search-in-Files-using-CSharp}

Vous pouvez rechercher n'importe quelle phrase de texte spécifique ou un mot en tenant compte des lettres majuscules et minuscules dans vos documents PDF par programme en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe [Index][10]
  * Spécifiez le chemin d'accès au dossier d'index
  * Ajoutez des fichiers PDF à l'index en appelant la méthode [Add()][12]
  * Créez une instance de [SearchOptions][25]
  * Définissez la propriété [UseCaseSensitiveSearch][26] sur true
  * Définir une requête de recherche
  * Effectuer une recherche à l'aide de la méthode [Search()][13] avec requête de recherche and the SearchOptions
  * Utilisez le [SearchResult] [14] et imprimez le résumé

L'exemple de code suivant montre **comment effectuer une **recherche de texte sensible à la casse**** **dans un document PDF à l'aide de C#**.
```
// Spécifiez le chemin d'accès au dossier d'index
string indexFolder = @"C:\Files\Index\";

// Spécifiez le chemin d'accès à un dossier contenant des documents PDF à rechercher
string documentsFolder = @"C:\Files\Files\";

// Création d'un index dans le dossier spécifié
Index index = new Index(indexFolder);

// Indexation de documents à partir du dossier spécifié
index.Add(documentsFolder); 

// Définir les options de recherche
SearchOptions options = new SearchOptions();
options.UseCaseSensitiveSearch = true; // Enabling case sensitive search

// mot de recherche
string query = "Vestibulum";

// Effectuer la recherche
SearchResult result = index.Search(query, options);

// Impression du résultat
Console.WriteLine("Documents found: " + result.DocumentCount);
Console.WriteLine("Total occurrences found: " + result.OccurrenceCount);

for (int i = 0; i < result.DocumentCount; i++)
{
    FoundDocument document = result.GetFoundDocument(i);
    Console.WriteLine("\tDocument: " + document.DocumentInfo.FilePath);
    Console.WriteLine("\tOccurrences: " + document.OccurrenceCount);
}
```

<pre class="wp-block-code"><code>Documents found: 1Nombre total d'occurrences trouvées : 2Document : C:\Fichiers\Fichiers\exemple.pdfOccurrences : 2</pre>
La classe [SearchOptions][25] fournit des options pour effectuer les opérations de recherche. La propriété [UseCaseSensitiveSearch][26] de cette classe vous permet d'effectuer une recherche sensible à la casse pour un mot ou un texte.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][27].
## Conclusion

Dans cet article, vous avez appris **comment rechercher du texte dans un document PDF à l'aide de C#**. Vous avez également appris **comment effectuer une** **recherche de texte sensible à la casse dans un document PDF à l'aide de C#**. Vous pouvez en savoir plus sur GroupDocs.Search pour l'API .NET en utilisant la [documentation][28]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][29].
## See Also

  * [Rechercher du texte dans les formats de documents Word, Excel, PDF et ZIP à l'aide de C# .NET][30]
  * [Créez votre solution de recherche de texte intégral par programmation en C#][31]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/search-for-a-word-in-pdf-using-csharp.jpg
 [2]: #api-for-searching-text
 [3]: #Search-Text-in-PDF-Documents-using-CSharp
 [4]: #Case-Sensitive-Text-Search-in-Files-using-CSharp
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://products.groupdocs.com/search/net
 [7]: https://docs.groupdocs.com/search/net/supported-document-formats/
 [8]: https://downloads.groupdocs.com/search/net
 [9]: https://www.nuget.org/packages/groupdocs.search
 [10]: https://apireference.groupdocs.com/search/net/groupdocs.search/index
 [11]: https://apireference.groupdocs.com/search/net/groupdocs.search.events/eventhub/events/erroroccurred
 [12]: https://apireference.groupdocs.com/search/net/groupdocs.search.index/add/methods/1
 [13]: https://apireference.groupdocs.com/search/net/groupdocs.search.index/search/methods/2
 [14]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult
 [15]: https://apireference.groupdocs.com/search/net/groupdocs.search/index/methods/highlight
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Search-Text-or-Word-in-PDF-using-CSharp.jpg
 [17]: https://apireference.groupdocs.com/search/net/groupdocs.search/SearchQuery
 [18]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult/properties/occurrencecount
 [19]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult/properties/documentcount
 [20]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/searchresult/methods/getfounddocument
 [21]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/FoundDocument
 [22]: https://apireference.groupdocs.com/search/net/groupdocs.search.results/founddocument/properties/occurrencecount
 [23]: https://apireference.groupdocs.com/search/net/groupdocs.search.highlighters/HtmlHighlighter
 [24]: https://docs.groupdocs.com/search/net/highlighting-search-results/
 [25]: https://apireference.groupdocs.com/search/net/groupdocs.search.options/searchoptions
 [26]: https://apireference.groupdocs.com/search/net/groupdocs.search.options/searchoptions/properties/usecasesensitivesearch
 [27]: https://purchase.groupdocs.com/temporary-license
 [28]: https://docs.groupdocs.com/search/net/
 [29]: https://forum.groupdocs.com/c/search/
 [30]: https://blog.groupdocs.com/2020/05/29/search-text-in-word-excel-pdf-zip-document-formats-using-csharp-net/
 [31]: https://blog.groupdocs.com/2019/11/22/build-your-full-text-search-solution-in-csharp/





