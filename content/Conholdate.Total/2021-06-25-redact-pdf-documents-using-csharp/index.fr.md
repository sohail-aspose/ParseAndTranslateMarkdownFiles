---
title: "Rédaction de documents PDF à l'aide de C#"
author: Muzammil Khan
date: 2021-06-25T05:04:20+00:00
summary: "Vous pouvez facilement expurger vos documents PDF par programmation à l'aide de C# dans vos applications .NET. Cet article se concentrera sur la <strong>façon de rédiger des documents PDF à l'aide de C#</strong> ."
url: /2021/06/25/redact-pdf-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Caviardage multiple en PDF à l'aide de CSharp"
  - "Masquer les images en PDF"
  - "Caviarder les métadonnées en PDF"
  - "Masquer un PDF à l'aide de CSharp"
  - "Caviarder le texte en PDF"

---


{{< figure align=center src="images/Redact-PDF-Documents-using-CSharp.jpg" alt="Rédaction de documents PDF à l'aide de C#">}}
 

Vous pouvez expurger des documents PDF par programmation sans installer d'applications externes. En tant que développeur C#, vous pouvez facilement rédiger vos documents PDF dans vos applications .NET. Cet article se concentrera sur **comment rédiger des documents PDF à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour la rédaction de PDF][2]
  * [Rédaction de texte dans un PDF à l'aide de C#][3]
  * [Rédaction des métadonnées en PDF en utilisant C#][4]
  * [Masquer des images dans un PDF à l'aide de C#][5]
  * [Appliquer plusieurs expurgations dans un PDF à l'aide de C#][6]

## API C# pour la rédaction de PDF {#api-for-pdf-redaction}

Pour la rédaction dans les documents [PDF][7], j'utiliserai l'API [GroupDocs.Redaction for .NET][8]. Il vous permet de rédiger des fichiers PDF, Word, Excel, PowerPoint et image. Il vous permet également de supprimer les informations classifiées de plus de 30 types de formats pris en charge. Vous pouvez appliquer différents types de masquage, tels que le masquage de texte, le masquage de métadonnées, le masquage d'annotations et le masquage de documents tabulaires.
Vous pouvez soit [télécharger][9] la DLL de l'API, soit l'installer à l'aide de [NuGet][10].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Redaction</code></pre>
## Rédaction de texte dans un PDF à l'aide de C# {#Redact-Text-in-PDF}

Vous pouvez facilement appliquer la rédaction de texte dans des documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe _[**Redactor**][11]_ avec le chemin du fichier d'entrée
  * Créez l'instance de classe **_[ExactPhraseRedaction][12]_** avec _SearchPhrase_ et les _**[ReplacementOptions][13]**_
  * Appelez la méthode _[Redactor.Apply()][14]_
  * Obtenez les résultats dans l'objet de classe _**[RedactorChangeLog][15]**_
  * Appelez la méthode [Redactor.Save()][16]

L'exemple de code suivant montre **comment biffer du texte dans un document PDF à l'aide de C#**.
```
// créer un rédacteur
Redactor redactor = new Redactor("C:\\Files\\sample.pdf");

// créer une rédaction exacte de la phrase
ExactPhraseRedaction redaction = new ExactPhraseRedaction("John Doe", true, new ReplacementOptions("[personal]"));

// appliquer la rédaction
RedactorChangeLog result = redactor.Apply(redaction);
if (result.Status != RedactionStatus.Failed)
{
    redactor.Save();
};
```

{{< figure align=center src="images/Redact-Text-in-PDF-using-csharp-1024x457.jpg" alt="Rédaction de texte dans un PDF à l'aide de C#" caption="Rédaction de texte dans un PDF à l'aide de C#">}}
 

Le [Redactor] [11] est la classe principale qui fournit diverses méthodes pour effectuer le processus de rédaction du document. Il vous permet également d'ouvrir, de rédiger et d'enregistrer des documents. La méthode _Apply()_ de cette classe applique la rédaction définie au document. De plus, la méthode _Save()_ de cette classe enregistre le document dans un fichier.
Le [ExactPhraseRedaction] [12] fournit des méthodes pour effectuer une rédaction de texte pour remplacer une phrase exacte dans le document. Il permet également de rechercher des données sensibles à la casse en définissant _IsCaseSensitive_ sur true.
Les [ReplacementOptions][13] représentent les options de remplacement de texte correspondant.
La classe [RedactorChangeLog][15] représente les résultats d'une liste de caviardages, transmise à la méthode Apply() de la classe [Redactor][11].
## Rédaction des métadonnées en PDF en utilisant C# {#Redact-Metadata-in-PDF}

Vous pouvez appliquer la rédaction des métadonnées dans les documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe _[**Redactor**][11]_ avec le chemin du fichier d'entrée
  * Créez l'instance de classe **_[EraseMetadataRedaction][18]_** avec **_[MetadataFilter][19]_** à inclure
  * Appelez la méthode _[Redactor.Apply()][14]_
  * Appelez la méthode [Redactor.Save()][16]

L'exemple de code suivant montre **comment masquer les métadonnées dans un document PDF à l'aide de C#**.
```
// créer un rédacteur
Redactor redactor = new Redactor("C:\\Files\\sample.pdf");

// effacer l'auteur, le gérant et l'entreprise
EraseMetadataRedaction redaction = new EraseMetadataRedaction(MetadataFilters.Author | MetadataFilters.Manager | MetadataFilters.Company);

// appliquer la rédaction
redactor.Apply(redaction);
redactor.Save();
```

{{< figure align=center src="images/Redact-Metadata-in-PDF-using-csharp-1024x835.jpg" alt="Rédiger les métadonnées dans un PDF à l'aide de C#" caption="Rédiger les métadonnées dans un PDF à l'aide de C#">}}
 

La classe [EraseMetadataRedaction][21] fournit des méthodes pour effacer toutes les métadonnées. Il permet également d'effacer les métadonnées correspondant à des MetadataFilters spécifiques du document.
Les [MetadataFilters][19] sont une liste des types de métadonnées de document les plus courants tels que Auteur, Commentaires, Société.
## Masquer des images dans un PDF à l'aide de C# {#Redact-Images-in-PDF}

Vous pouvez appliquer la rédaction d'image dans les documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe _[**Redactor**][11]_ avec le chemin du fichier d'entrée
  * Définir les points et la taille du dessin
  * Créez l'instance de classe **_[ImageAreaRedaction][22]_** avec des points de dessin et **_[RegionReplacementOptions][23]_**
  * Appelez la méthode _[Redactor.Apply()][14]_
  * Appelez la méthode [Redactor.Save()][16]

L'exemple de code suivant montre **comment masquer des images dans un document PDF à l'aide de C#**.
```
// créer un rédacteur
Redactor redactor = new Redactor("C:\\Files\\sample_with_images.pdf");

// définir la taille et les points
System.Drawing.Point samplePoint = new System.Drawing.Point(0, 0);
System.Drawing.Size sampleSize = new System.Drawing.Size(300, 240);

// définir la rédaction de la zone d'image
ImageAreaRedaction redaction = new ImageAreaRedaction(samplePoint,
             new RegionReplacementOptions(System.Drawing.Color.Blue, sampleSize));

// appliquer la rédaction
RedactorChangeLog result = redactor.Apply(redaction);

if (result.Status != RedactionStatus.Failed)
{
    redactor.Save();
};
```

{{< figure align=center src="images/Redact-Images-in-PDF-using-csharp-1024x457.jpg" alt="Masquer des images dans un PDF à l'aide de C#" caption="Masquer des images dans un PDF à l'aide de C#">}}
 

La classe [ImageAreaRedaction][22] permet de placer un rectangle coloré dans une zone donnée d'un document image.
La classe [RegionReplacementOption][23] représente les paramètres de couleur et de zone pour une région à remplacer par une image.
## Appliquer plusieurs expurgations dans un PDF à l'aide de C# {#Apply-Multiple-Redactions-in-PDF}

Vous pouvez appliquer plusieurs caviardages dans des documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe _[**Redactor**][11]_ avec le chemin du fichier d'entrée
  * Créez **_[ExactPhraseRedaction][12]_**, **_[RegexRedaction][25]_** et **_[EraseMetadataRedaction][21]_**
  * Ajouter les rédactions créées à la liste de rédaction
  * Appelez la méthode _[Redactor.Apply()][26]_
  * Appelez la méthode [Redactor.Save()][16], show errors if failed

L'exemple de code suivant montre **comment appliquer plusieurs caviardages dans un document PDF à l'aide de C#**.
```
// créer un rédacteur
Redactor redactor = new Redactor("C:\\Files\\sample.pdf");

// définir plusieurs caviardages
var redactionList = new Redaction[]
{
    new ExactPhraseRedaction("John Doe", new ReplacementOptions("[Client]")),
    new RegexRedaction("Redaction", new ReplacementOptions("[Product]")),
    new RegexRedaction("\\d{2}\\s*\\d{2}[^\\d]*\\d{6}", new ReplacementOptions(System.Drawing.Color.Blue)),
    new EraseMetadataRedaction(MetadataFilters.All)
};

// appliquer les caviardages
RedactorChangeLog result = redactor.Apply(redactionList);

// enregistrer si appliqué sinon afficher les erreurs
if (result.Status == RedactionStatus.Applied)
{
    redactor.Save();
}
else if (result.Status == RedactionStatus.Failed)
{
    for (int i = 0; i < result.RedactionLog.Count; i++)
    {
        RedactorLogEntry logEntry = result.RedactionLog[i];
        if (logEntry.Result.Status != RedactionStatus.Applied)
        {
            Console.WriteLine("{0} status is {1}, details: {2}",
                logEntry.Redaction.GetType().Name,
                logEntry.Result.Status,
                logEntry.Result.ErrorMessage);
        }
    }
};
```

{{< figure align=center src="images/Apply-Multiple-Redactions-in-PDF-using-csharp-1-1024x536.jpg" alt="Appliquer plusieurs expurgations dans un PDF à l'aide de C#" caption="Appliquer plusieurs expurgations dans un PDF à l'aide de C#">}}
 

La classe [RegexRedaction][25] permet d'effectuer une rédaction de texte. Vous pouvez rechercher et remplacer n'importe quel texte dans le document en faisant correspondre un texte à l'aide d'une expression régulière.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][28].
## Conclusion

Dans cet article, vous avez appris **comment biffer des documents PDF à l'aide de C#**. Vous avez également appris à biffer du texte, des métadonnées et des images dans des documents PDF. De plus, vous avez appris à appliquer plusieurs caviardages dans un PDF à l'aide de C#. Vous pouvez en savoir plus sur GroupDocs.Redaction pour l'API .NET en utilisant la [documentation][29]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][30].
## See Also

  * [Rechercher et remplacer du texte dans des documents par programmation à l'aide de C#][31]
  * [Comment expurger dans des documents de traitement de texte à l'aide de C # ou Java][32]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-PDF-Documents-using-CSharp.jpg
 [2]: #api-for-pdf-redaction
 [3]: #Redact-Text-in-PDF
 [4]: #Redact-Metadata-in-PDF
 [5]: #Redact-Images-in-PDF
 [6]: #Apply-Multiple-Redactions-in-PDF
 [7]: https://docs.fileformat.com/pdf/
 [8]: https://products.groupdocs.com/redaction/net
 [9]: https://downloads.groupdocs.com/redaction/net
 [10]: https://www.nuget.org/packages/GroupDocs.Redaction
 [11]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactor
 [12]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/exactphraseredaction
 [13]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/replacementoptions
 [14]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactor/methods/apply
 [15]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactorchangelog
 [16]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction/redactor/methods/save
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-Text-in-PDF-using-csharp.jpg
 [18]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/metadatasearchredaction
 [19]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/metadatafilters
 [20]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-Metadata-in-PDF-using-csharp.jpg
 [21]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/erasemetadataredaction
 [22]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/imagearearedaction
 [23]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/regionreplacementoptions
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Redact-Images-in-PDF-using-csharp.jpg
 [25]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactions/regexredaction
 [26]: https://apireference.groupdocs.com/redaction/net/groupdocs.redaction.redactor/apply/methods/1
 [27]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Apply-Multiple-Redactions-in-PDF-using-csharp-1.jpg
 [28]: https://purchase.groupdocs.com/temporary-license
 [29]: https://docs.groupdocs.com/redaction/net/
 [30]: https://forum.groupdocs.com/c/redaction/
 [31]: https://blog.groupdocs.com/2019/09/20/find-and-replace-text-in-word-excel-powerpoint-pdf-documents-net-api/
 [32]: https://blog.groupdocs.com/2019/12/05/how-to-redact-in-word/





