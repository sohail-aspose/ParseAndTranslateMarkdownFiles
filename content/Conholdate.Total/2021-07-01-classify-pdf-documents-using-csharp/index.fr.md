---
title: "Classer les documents PDF à l'aide de C#"
author: Muzammil Khan
date: 2021-07-01T05:17:59+00:00
summary: "Vous pouvez facilement classer vos documents PDF par programmation dans les applications .NET. Cet article se concentrera sur la <strong>façon de classer les documents PDF à l'aide de C#</strong> ."
url: /2021/07/01/classify-pdf-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Classer les documents pour la taxonomie"
  - "Classer les documents PDF"
  - "Classifier un PDF à l'aide de CSharp"
  - "classement des documents"

---


{{< figure align=center src="images/classify-pdf-documents-using-csharp.jpg" alt="Classer les documents PDF à l'aide de C#">}}
 

Vous pouvez classer des documents à l'aide de balises ou de catégories prédéfinies dans les taxonomies IAB-2, Documents et Sentiment par programmation. La classification des documents facilite la recherche de l'information pertinente au bon moment. Il aide également à gérer et à trier les documents pour rechercher et récupérer les informations importantes. Dans cet article, vous apprendrez **comment classer des documents PDF à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour la classification PDF][2]
  * [Classer les documents PDF avec la taxonomie IAB-2 à l'aide de C#][3]
  * [Classification PDF avec taxonomie de documents à l'aide de C #][4]
  * [Classification de documents PDF à partir d'un flux à l'aide de C#][5]
  * [Classer les fichiers PDF protégés par mot de passe à l'aide de C#][6]

## API C# pour la classification PDF {#api-for-pdf-classification}

J'utiliserai l'API [GroupDocs.Classification for .NET][7] pour la classification des fichiers [PDF][8]. Il offre une classification avancée des documents et des textes dans des catégories prédéfinies. L'API prend en charge différents types de taxonomies telles que la taxonomie IAB-2, Documents et Sentiment. Il analyse le texte et affiche les informations de classification, y compris la meilleure classe avec son score de probabilité. Vous pouvez classer une variété de formats de documents standard tels que PDF, Word, OpenDocument, RTF et TXT. L'API propose également une analyse des sentiments avec détection automatique de la langue et prend en charge les langues anglaise, chinoise, espagnole et allemande. Il peut être utilisé pour développer des applications dans n'importe quel environnement de développement qui cible la plate-forme .NET.
Vous pouvez soit [télécharger][9] la DLL de l'API, soit l'installer à l'aide de [NuGet][10].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Classification</code></pre>
## Classer les documents PDF avec la taxonomie IAB-2 à l'aide de C# {#Classify-PDF-Documents-with-IAB-2-Taxonomy}

Vous pouvez facilement classer des documents PDF avec la taxonomie IAB-2 par programmation en suivant les étapes simples indiquées ci-dessous :
  * Créez une instance de la classe _[**Classifier**][11]_
  * Appelez la méthode _[**Classifier.Classify()**][12]_ avec le chemin du fichier
  * Définissez _bestClassesCount_ et _Taxonomy_ comme entrée
  * Obtenir des résultats dans l'objet de classe _**[ClassificationResponse][13]**_

L'exemple de code suivant montre **comment classer un PDF avec la taxonomie IAB-2 à l'aide de C#**.
```
// créer un classificateur
var classifier = new Classifier();

// classer le document avec IAB-2
var response = classifier.Classify("sample.pdf", @"C:\Files\", 3, Taxonomy.Iab2);

// afficher les informations de classification
foreach (var r in response.BestResults)
{
    Console.WriteLine("ClassName: " + r.Name);
    Console.WriteLine("ClassProbability: " + r.Probability);
    Console.WriteLine("--------------------------------");
}
```

{{< figure align=center src="images/Classify-PDF-Documents-with-IAB-2-Taxonomy-1024x698.jpg" alt="Classer les documents PDF avec la taxonomie IAB-2 à l'aide de C#" caption="Classer les documents PDF avec la taxonomie IAB-2 à l'aide de C#">}}
 

La classe **[Classifier][11]** est la classe principale qui fournit diverses [méthodes][15] pour classer les documents. La méthode _Classify()_ de cette classe classe les documents par nom de fichier et nom de répertoire. Le paramètre _bestClassesCount_ définit le nombre de meilleures classes correspondantes à renvoyer. Dans l'exemple de code ci-dessus, j'ai utilisé la taxonomie [Taxonomy.IAB2][16] pour la classification.
La classe _**[ClassificationResponse][13]**_ fournit des propriétés et des méthodes pour afficher les informations de classification récupérées.
## Classification PDF avec taxonomie de documents à l'aide de C # {#PDF-Classification-with-Documents-Taxonomy}

Vous pouvez classer les documents PDF avec la taxonomie des documents par programme en suivant les étapes simples indiquées ci-dessous :
  * Créez une instance de la classe _[**Classifier**][11]_
  * Appelez la méthode _[**Classifier.Classify()**][12]_ avec le chemin du fichier
  * Définissez bestClassesCount, Taxonomy et _PrecisionRecallBalance_ comme entrée
  * Obtenir des résultats dans l'objet de classe _**[ClassificationResponse][13]**_

L'exemple de code suivant montre **comment classer un PDF avec la taxonomie Documents à l'aide de C#**.
```
// créer un classificateur
var classifier = new Classifier();

// classer le document avec la taxonomie des documents
var response = classifier.Classify("sample.pdf", @"C:\Files\", 4, Taxonomy.Documents, PrecisionRecallBalance.Precision);
                
// afficher les informations de classification
foreach (var r in response.BestResults)
{
    Console.WriteLine("ClassName: " + r.Name);
    Console.WriteLine("ClassProbability: " + r.Probability);
    Console.WriteLine("--------------------------------");
}
```

{{< figure align=center src="images/Classify-PDF-Documents-with-Document-Taxonomy-1024x683.jpg" alt="Classifier un PDF avec la taxonomie des documents à l'aide de C#" caption="Classifier un PDF avec la taxonomie des documents à l'aide de C#">}}
 

## Classification de documents PDF à partir d'un flux à l'aide de C# {#PDF-Document-Classification-from-Stream}

Vous pouvez classer les documents PDF à partir du flux de fichiers par programme en suivant les quelques étapes ci-dessous :
  * Lire un fichier dans l'instance FileStream
  * Créez une instance de la classe _[**Classifier**][11]_
  * Appelez la méthode _[**Classifier.Classify()**][18]_ avec l'instance FileStream
  * Définissez _bestClassesCount_ et _Taxonomy_ comme entrée
  * Obtenir des résultats dans l'objet de classe _**[ClassificationResponse][13]**_

L'exemple de code suivant montre **comment classer un PDF à partir d'un flux de documents à l'aide de C#**.
```
using (var fs = File.OpenRead(Path.Combine(@"C:\Files\", "sample.pdf")))
{
    // create classifier
    var classifier = new Classifier();
    
    // classify document
    var response = classifier.Classify(fs, "sample.pdf", 2, Taxonomy.Documents);
    
    // show classification information
    Console.WriteLine($"{"sample.pdf"}: {response.BestClassName}, {response.BestClassProbability}");
}
```

## Classer les fichiers PDF protégés par mot de passe à l'aide de C# {#Classify-Password-Protected-PDF-using-CSharp}

Vous pouvez facilement classer par programmation des documents PDF protégés par mot de passe en suivant les étapes simples ci-dessous :
  * Créez une instance de la classe _[**Classifier**][11]_
  * Appelez la méthode _[**Classifier.Classify()**][12]_ avec le chemin du fichier
  * Définissez le _bestClassesCount_ et le _Password_ du fichier comme entrée
  * Obtenir des résultats dans l'objet de classe _**[ClassificationResponse][13]**_

L'exemple de code suivant montre **comment classer un fichier PDF protégé par mot de passe à l'aide de C#**.
```
// créer un classificateur
var classifier = new Classifier();

// classer un document protégé par mot de passe
var response = classifier.Classify("password-protected.pdf", @"C:\Files\", password: "password");

// afficher les informations de classification
Console.WriteLine(response.BestClassName, response.BestClassProbability);
```

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][19].
## Conclusion

Dans cet article, vous avez appris **comment classer des documents PDF à l'aide de C#**. Vous avez également appris à classer des documents avec la taxonomie IAB-2 et la taxonomie Documents. De plus, vous avez appris à classer les documents lors de leur chargement en utilisant le flux de fichiers au lieu du chemin de fichier en C#. Vous pouvez en savoir plus sur l'API GroupDocs.Classification pour .NET à l'aide de la [documentation][20]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][21].
## See Also

  * [Analyse des sentiments des commentaires des clients en C#][22]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/classify-pdf-documents-using-csharp.jpg
 [2]: #api-for-pdf-classification
 [3]: #Classify-PDF-Documents-with-IAB-2-Taxonomy
 [4]: #PDF-Classification-with-Documents-Taxonomy
 [5]: #PDF-Document-Classification-from-Stream
 [6]: #Classify-Password-Protected-PDF-using-CSharp
 [7]: https://products.groupdocs.com/classification/net
 [8]: https://docs.fileformat.com/pdf
 [9]: https://downloads.groupdocs.com/classification/net
 [10]: https://www.nuget.org/packages/GroupDocs.Classification
 [11]: https://apireference.groupdocs.com/classification/net/groupdocs.classification/classifier
 [12]: https://apireference.groupdocs.com/classification/net/groupdocs.classification.classifier/classify/methods/2
 [13]: https://apireference.groupdocs.com/classification/net/groupdocs.classification.dto/classificationresponse
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Classify-PDF-Documents-with-IAB-2-Taxonomy.jpg
 [15]: https://apireference.groupdocs.com/classification/net/groupdocs.classification/classifier/methods/index
 [16]: https://docs.groupdocs.com/classification/net/taxonomies/#iab-2-taxonomy
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Classify-PDF-Documents-with-Document-Taxonomy.jpg
 [18]: https://apireference.groupdocs.com/classification/net/groupdocs.classification/classifier/methods/classify
 [19]: https://purchase.groupdocs.com/temporary-license
 [20]: https://docs.groupdocs.com/classification/net/
 [21]: https://forum.groupdocs.com/c/classification/
 [22]: https://blog.groupdocs.com/2020/06/17/classify-customers-feedback-using-sentiment-analysis-in-csharp/





