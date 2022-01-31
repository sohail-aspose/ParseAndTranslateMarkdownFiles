---
title: "Comparez deux ou plusieurs documents Word à l'aide de C #"
author: Muzammil Khan
date: 2021-10-01T10:14:16+00:00
summary: "En tant que développeur C#, vous pouvez facilement comparer deux ou plusieurs documents Word ou comparer plusieurs versions du même fichier Word pour les différences et les similitudes par programmation dans vos applications .NET. Dans cet article, vous apprendrez <strong>à comparer deux documents Word ou plus et à mettre en évidence les différences à l'aide de C#</strong> ."
url: /2021/10/01/comparer-deux-ou-plus-mot-documents-en-utilisant-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API pour comparer des fichiers Word"
  - "Comparer plusieurs fichiers DOCX"
  - "Comparer deux ou plusieurs documents"
  - "Comparer des documents Word"

---


{{< figure align=center src="images/compare-two-or-more-word-documents-using-csharp.jpg" alt="Comparez deux ou plusieurs documents Word à l'aide de C #" caption="Comparez deux ou plusieurs documents Word à l'aide de C #">}}
 

Vous pouvez facilement comparer deux ou plusieurs documents Word ou comparer plusieurs versions du même fichier Word pour les différences et les similitudes par programmation dans vos applications .NET. Dans cet article, vous apprendrez **comment comparer deux documents Word ou plus et mettre en évidence les différences à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour comparer les fichiers DOCX][2]
  * [Comparez deux ou plusieurs documents Word à l'aide de C #][3]
  * [Comparer des documents Word à l'aide de Stream en C#][4]
  * [Obtenir le texte des modifications à l'aide de C #][5]
  * [Comparaison des propriétés des documents à l'aide de C#][6]
  * [Comparer des documents Word protégés par mot de passe à l'aide de C#][7]
  * [Comparer les signets dans les documents Word à l'aide de C#][8]

## API C# pour comparer les fichiers DOCX {#CSharp-API-to-Compare-DOCX-Files}

Pour comparer deux ou plusieurs fichiers [DOCX][9], j'utiliserai [GroupDocs.Comparison for .NET API][10]. Il compare deux documents ou plus et découvre les changements dans le contenu des documents pour les mots, les paragraphes et les caractères. En conséquence, il produit un document de comparaison qui met en évidence les différences et répertorie un résumé des différences. Il vous permet également de détecter les changements et les différences de style de texte entre des formats de documents similaires. L'API prend en charge la comparaison de tous les formats de documents standard de l'industrie tels que PDF, HTML, Word, Excel, PowerPoint, les e-mails Outlook, les diagrammes Visio, OpenDocument, AutoCAD et les images.
Vous pouvez soit [télécharger][11] la DLL de l'API, soit l'installer à l'aide de [NuGet][12].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Comparison</code></pre>
## Comparez deux ou plusieurs documents Word à l'aide de C # {#Compare-Word-Documents-using-CSharp}

Vous pouvez comparer deux ou plusieurs documents Word par programme en suivant les étapes simples ci-dessous :
  1. Créez une instance de _**[Comparer][13] **_class avec le chemin du fichier DOCX source
  2. Appelez la méthode **_[Add()][14]_** avec le fichier DOCX cible à ajouter à la comparaison
  3. Répétez l'étape ci-dessus pour ajouter plus de fichiers en comparaison
  4. Appelez la méthode _**[Compare()][15]**_ avec le chemin du fichier de sortie

L'exemple de code suivant montre **comment comparer deux documents Word ou plus et met en évidence les différences à l'aide de C#**.
```
// initialiser le comparateur
Comparer comparer = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible à comparer
comparer.Add("C:\\Files\\target.docx");

// comparer et enregistrer les différences
comparer.Compare("C:\\Files\\result.docx");
```

{{< figure align=center src="images/source_and_target_docx_files-1024x657.jpg" alt="Fichiers DOCX source et cible" caption="Fichiers DOCX source et cible">}}
 

{{< figure align=center src="images/Compare-Word-Documents-using-CSharp-1024x794.jpg" alt="Comparez deux ou plusieurs documents Word à l'aide de C #" caption="Comparez deux ou plusieurs documents Word à l'aide de C #">}}
 

Le document résultant comprend également une page de résumé à la fin du document qui montre le résumé de tous les changements trouvés dans la comparaison.
La classe [Comparer][13]_** **_class est la classe principale qui vous permet de contrôler et d'exécuter le processus de comparaison. Il fournit plusieurs méthodes pour comparer deux ou plusieurs documents. La méthode [Add()][14] de cette classe ajoute un fichier au processus de comparaison. Vous pouvez facilement ajouter plusieurs fichiers à la comparaison en utilisant la méthode Add() comme indiqué ci-dessous :
<pre class="wp-block-code"><code>comparer.Add("target1.docx");comparer.Add("target2.docx");comparer.Add("target3.docx");</pre>
La méthode [Compare()][15] de la classe [Comparer][13] compare les documents source et cible. Cette méthode met en évidence les différences et enregistre les résultats dans le chemin d'accès au fichier fourni en tant que paramètre d'entrée.
## Comparer des documents Word à l'aide de Stream en C# {#Compare-Word-Documents-using-Stream-in-CSharp}

Vous pouvez comparer deux ou plusieurs documents Word à l'aide de FileStream en suivant les étapes ci-dessous :
  1. Lire le fichier source dans un objet Stream
  2. Lire le fichier cible dans un autre objet Stream
  3. Créez une instance de _**[Comparer][13] **_class avec l'objet Stream source
  4. Appelez la méthode **_[Add()][14]_** avec l'objet Stream cible à ajouter à la comparaison
  5. Appelez la méthode _**[Compare()][15]**_ avec le chemin du fichier de sortie

L'exemple de code suivant montre **comment comparer des documents Word à l'aide de FileStream en C#**.
```
// lire les fichiers source et cible
using (Stream sourceStream = File.OpenRead("C:\\Files\\source.docx"))
using (Stream targetStream = File.OpenRead("C:\\Files\\target.docx"))
{
    // initialize comparer
    using (Comparer comparer = new Comparer(sourceStream))
    {
        // add target filestream to compare
        comparer.Add(targetStream);

        // compare and save differences
        comparer.Compare(File.Create("C:\\Files\\result.docx"));
    }
}
```

## Obtenir le texte des modifications à l'aide de C# {#Get-Text-of-the-Changes-using-CSharp}

Vous pouvez obtenir le texte des modifications trouvées dans la comparaison des documents Word par programme en suivant les étapes simples indiquées ci-dessous :
  1. Créez une instance de _**[Comparer][13] **_class avec le chemin du fichier DOCX source
  2. Appelez la méthode **_[Add()][14]_** avec le fichier DOCX cible à ajouter à la comparaison
  3. Répétez l'étape ci-dessus pour ajouter plus de fichiers en comparaison
  4. Appelez la méthode _**[Compare()][15]**_
  5. Appelez la méthode **_[GetChanges()][18]_** pour obtenir les détails des modifications
  6. Afficher les changements

L'exemple de code suivant montre **comment obtenir le texte des modifications à l'aide de C#**.
```
// initialiser le comparateur
Comparer comparerr = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible à comparerr
comparerr.Add("C:\\Files\\target.docx");

// comparer
comparerr.Compare();

// obtenir des modifications
ChangeInfo[] changes = comparerr.GetChanges();

Console.WriteLine("Count of changes: " + changes.Length);

// afficher les modifications
foreach (ChangeInfo change in changes)
{
    Console.WriteLine("Change Type: " + change.Type + ", Text: " + change.Text);
}
```

<pre class="wp-block-code"><code>Count of changes: 10Modifier le type : inséré, texte :Modifier le type : inséré, texte : société ‼ HYPERLINK "http://www.aspose.com/" ¶Aspose Pty Ltd§ Division GroupDocsModifier le type : inséré, texte :Modifier le type : inséré, texte : coolType de modification : supprimé, texte : testModifier le type : inséré, texte :Modifier le type : inséré, texte : signaturesModifier le type : inséré, texte :Type de modification : supprimé, texte : clientsModifier le type : supprimé, texte : GroupDocs est utilisé par des entreprises de toutes tailles à travers le monde, des grandes multinationales aux petites entreprises indépendantes. Ils s'adressent à nous parce qu'ils ont besoin d'une solution de gestion de documents simple et à guichet unique.</pre>
Vous pouvez obtenir une liste des modifications entre les fichiers source et cible en appelant la méthode [GetChanges()][18] de la classe [Comparer][13]. Elle renvoie une liste d'objets [ChangeInfo][19]. La [ChangeInfo][19]_ _class représente des informations sur les modifications et fournit diverses propriétés pour obtenir des détails sur les modifications telles que [Text][20], [Type][21], etc.
## Comparaison des propriétés des documents à l'aide de C# {#Documents-Properties-Comparison-using-CSharp}

Vous pouvez comparer les propriétés intégrées, personnalisées et les propriétés variables des documents Word par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de _**[Comparer][13] **_class avec le chemin du fichier DOCX source
  2. Appelez la méthode **_[Add()][14]_** avec le fichier DOCX cible à ajouter à la comparaison
  3. Répétez l'étape ci-dessus pour ajouter plus de fichiers en comparaison
  4. Créez une instance de **_[CompareOptions][22]_**
  5. Définissez [CompareVariableProperty][23] sur true
  6. Définissez [CompareDocumentProperty][24] sur true
  7. Appelez la méthode _**[Compare()][25]**_ avec le chemin du fichier de sortie et **_CompareOptions_**

L'exemple de code suivant montre **comment comparer les propriétés des documents à l'aide de C#**.
```
// initialiser le comparateur
Comparer comparerr = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible à comparerr
comparerr.Add("C:\\Files\\target.docx");

// définir les options de comparaison
CompareOptions options = new CompareOptions();
options.CompareVariableProperty = true; // activate the comparison of variable properties
options.CompareDocumentProperty = true; // activate the comparison of built and custom properties

// comparer
comparerr.Compare("C:\\Files\\result.docx", options);
```

{{< figure align=center src="images/Documents-Properties-Comparison-using-CSharp-957x1024.jpg" alt="Comparaison des propriétés des documents à l'aide de C#" caption="Comparaison des propriétés des documents à l'aide de C#">}}
 

Vous pouvez améliorer votre processus de comparaison en appliquant diverses options de comparaison. À cette fin, la classe [**CompareOptions**][22] permet de définir diverses options de comparaison pour obtenir des résultats spécifiques. Le [CompareDocumentProperty][24] de cette classe vous permet d'activer la comparaison des propriétés intégrées et personnalisées au format Word. La [CompareVariableProperty][23] permet d'activer la comparaison des propriétés des variables au format Word.
## Comparer des documents Word protégés par mot de passe à l'aide de C# {#Compare-Password-Protected-Word-Documents-using-CSharp}

Vous pouvez comparer deux ou plusieurs documents Word protégés par mot de passe par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la classe [_**LoadOptions**_][27]
  2. Indiquez le mot de passe du fichier source
  3. Créez une instance de _**[Comparer][13] **_class avec le chemin du fichier DOCX source et **_LoadOptions_**
  4. Appelez la méthode **_[Add()][14]_** avec le chemin du fichier DOCX cible et l'instance **_LoadOptions_** avec le mot de passe
  5. Répétez l'étape ci-dessus pour ajouter plus de fichiers en comparaison
  6. Appelez la méthode _**[Compare()][15]**_ avec le chemin du fichier de sortie

L'exemple de code suivant montre **comment comparer des documents Word protégés par mot de passe à l'aide de C#**.
```
// définir les options de chargement pour le fichier source
LoadOptions sourceLoadOptions = new LoadOptions() { Password = "1234" };

// initialiser le comparateur
Comparer comparerr = new Comparer("C:\\Files\\source.docx", sourceLoadOptions);

// ajouter un fichier cible à comparerr
comparerr.Add("C:\\Files\\target.docx", new LoadOptions() { Password = "5678" });

// comparer
comparerr.Compare("C:\\Files\\result.docx");
```

La classe [**LoadOptions**][27] vous permet de spécifier des options supplémentaires lors du chargement d'un document. Il fournit les propriétés suivantes à spécifier :
  * FontDirectories — Liste des répertoires de polices à charger.
  * LoadText — Indique que les chaînes transmises sont du texte de comparaison, et non des chemins de fichiers (pour la comparaison de texte uniquement).
  * Mot de passe — Mot de passe du document.

## Comparer les signets dans les documents Word à l'aide de C # {#Compare-Bookmarks-in-Word-Documents-using-CSharp}

Vous pouvez comparer par programme les signets disponibles dans les documents Word en suivant les étapes ci-dessous :
  1. Créez une instance de _**[Comparer][13] **_class avec le chemin du fichier DOCX source
  2. Appelez la méthode **_[Add()][14]_** avec le fichier DOCX cible à ajouter à la comparaison
  3. Répétez l'étape ci-dessus pour ajouter plus de fichiers en comparaison
  4. Créez une instance de **_[CompareOptions][22]_**
  5. Définissez [CompareBookmarks] [28] sur vrai
  6. Appelez la méthode _**[Compare()][25]**_ avec le chemin du fichier de sortie et **_CompareOptions_**

L'exemple de code suivant montre **comment comparer des signets dans des documents Word à l'aide de C#**.
```
// initialiser le comparateur
Comparer comparerr = new Comparer("C:\\Files\\source.docx");

// ajouter un fichier cible à comparerr
comparerr.Add("C:\\Files\\target.docx");

// définir les options de comparaison
CompareOptions comparerOptions = new CompareOptions();
comparerOptions.CompareBookmarks = true; // comparer bookmarks

// comparer
comparerr.Compare("C:\\Files\\result.docx", comparerOptions);
```

{{< figure align=center src="images/Compare-Bookmarks-in-Word-Documents-using-CSharp-1.jpg" alt="Comparer les signets dans les documents Word à l'aide de C#" caption="Comparer les signets dans les documents Word à l'aide de C#">}}
 

La propriété [CompareBookmarks][28] vous permet de comparer les signets disponibles dans les documents source et cible.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][30].
## Conclusion

Dans cet article, vous avez appris **comment comparer deux documents Word ou plus et mettre en évidence** les **différences** à l'aide de C#. Vous avez également appris **comment obtenir la liste des modifications en surbrillance.** De plus, vous avez appris **comment comparer des signets dans des documents Word** par programmation. De plus, vous avez appris **comment comparer des documents Word protégés par mot de passe à l'aide de C#**. Vous pouvez en savoir plus sur l'API GroupDocs.Comparison pour .NET à l'aide de la [documentation][31]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][32].
## See Also

  * [Comparer des fichiers PDF à l'aide de C # et mettre en évidence les différences][33]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/compare-two-or-more-word-documents-using-csharp.jpg
 [2]: #CSharp-API-to-Compare-DOCX-Files
 [3]: #Compare-Word-Documents-using-CSharp
 [4]: #Compare-Word-Documents-using-Stream-in-CSharp
 [5]: #Get-Text-of-the-Changes-using-CSharp
 [6]: #Documents-Properties-Comparison-using-CSharp
 [7]: #Compare-Password-Protected-Word-Documents-using-CSharp
 [8]: #Compare-Bookmarks-in-Word-Documents-using-CSharp
 [9]: https://docs.fileformat.com/word-processing/docx/
 [10]: https://products.groupdocs.com/comparison/net
 [11]: https://downloads.groupdocs.com/comparison/net
 [12]: https://www.nuget.org/packages/groupdocs.comparison
 [13]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison/comparer
 [14]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/add/methods/2
 [15]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/compare/methods/7
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/source_and_target_docx_files.jpg
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Compare-Word-Documents-using-CSharp.jpg
 [18]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison/comparer/methods/getchanges
 [19]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.result/changeinfo
 [20]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.result/changeinfo/properties/text
 [21]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.result/changeinfo/properties/type
 [22]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions
 [23]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions/properties/comparevariableproperty
 [24]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions/properties/comparedocumentproperty
 [25]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/compare/methods/8
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Documents-Properties-Comparison-using-CSharp.jpg
 [27]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/loadoptions
 [28]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.options/compareoptions/properties/comparebookmarks
 [29]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Compare-Bookmarks-in-Word-Documents-using-CSharp-1.jpg
 [30]: https://purchase.groupdocs.com/temporary-license
 [31]: https://docs.groupdocs.com/comparison/net/
 [32]: https://forum.groupdocs.com/c/comparison/
 [33]: https://blog.conholdate.com/2021/04/14/compare-pdf-files-and-highlight-differences-using-csharp/





