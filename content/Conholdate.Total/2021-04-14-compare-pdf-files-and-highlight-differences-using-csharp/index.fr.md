---
title: "Comparez des fichiers PDF et mettez en évidence les différences à l'aide de C#"
author: Muzammil Khan
date: 2021-04-14T07:04:18+00:00
summary: "Comparez deux ou plusieurs fichiers PDF et mettez en évidence les différences dans un fichier PDF séparé par programmation. Comparez les fichiers protégés par mot de passe à l'aide de C# dans votre application .NET. Dans cet article, vous allez apprendre <strong>à comparer deux documents PDF ou plus et à mettre en évidence les différences à l'aide de C#</strong> ."
url: /2021/04/14/compare-pdf-files-and-highlight-differences-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Comparer plusieurs fichiers PDF"
  - "Comparer les fichiers PDF"
  - "Comparer des fichiers PDF avec CSharp"

---


{{< figure align=center src="images/Compare-PDF-Files.jpg" alt="">}}
 

Dans certains cas, vous devrez peut-être comparer deux ou plusieurs documents PDF dans votre application .NET. Vous pouvez facilement comparer et mettre en évidence les différences par programmation. Dans cet article, vous apprendrez **comment comparer deux fichiers PDF ou plus et mettre en évidence les différences à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour comparer des documents PDF][2]
  * [Comparer deux fichiers PDF à l'aide de C#][3]
  * [Comparer des fichiers PDF protégés par mot de passe à l'aide de C#][4]

## API C# pour comparer des documents PDF {#csharp-comparison-api}

Pour comparer des documents [PDF][5], j'utiliserai [GroupDocs.Comparison for .NET API][6]. Il compare pour détecter les changements de contenu pour les mots, les paragraphes et les caractères tout en fournissant un document de comparaison qui répertorie un résumé des différences. La bibliothèque de comparaison .NET prend en charge la vérification des différences dans le contenu ainsi que le style de texte des formats d'image et de document populaires tels que PDF, HTML, e-mail Outlook, documents Microsoft Office Word, feuilles de calcul Excel, présentations PowerPoint, OneNote, diagrammes Visio, texte , et images. Il peut être utilisé pour développer des applications dans n'importe quel environnement de développement qui cible la plate-forme .NET.
Vous pouvez soit [télécharger][7] la DLL de l'API, soit l'installer à l'aide de [NuGet][8].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Comparison</code></pre>
## Comparer deux fichiers PDF à l'aide de C# {#Compare-Two-PDF-Files-using-Csharp}

Vous pouvez comparer deux documents PDF en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe _**[Comparer][9]**_
  2. Fournir le chemin du fichier PDF source au constructeur
  3. [Ajouter][10] le fichier PDF cible à la comparaison
  4. Appelez la méthode _**[Compare][11]**_ avec le chemin du fichier de sortie

L'exemple de code suivant montre **comment comparer deux documents PDF et mettre en évidence les différences à l'aide de C#**.
```
using (Comparer comparer = new Comparer("C:\\Files\\source.pdf"))
{
    comparer.Add("C:\\Files\\target.pdf");
    comparer.Compare("C:\\Files\\result.pdf");
}
```

{{< figure align=center src="images/ComparePDFFilesUsingC-1024x644.png" alt="Comparer deux fichiers PDF à l'aide de C #" caption="Comparer deux fichiers PDF à l'aide de C #">}}
 

Le document résultant comprend une page de résumé à la fin du document montrant le résumé des modifications comme indiqué ci-dessous :
{{< figure align=center src="images/image.png" alt="Sommaire des modifications" caption="Sommaire des modifications">}}
 

Si vous souhaitez comparer plusieurs fichiers PDF, il vous suffit d'ajouter plusieurs fichiers PDF cibles à la comparaison, comme indiqué ci-dessous :
<pre class="wp-block-code"><code>comparer.Add("target2.docx");comparer.Add("target3.docx");</pre>
## Comparer des fichiers PDF protégés par mot de passe à l'aide de C# {#Compare-Password-Protected-PDF-Files-using-Csharp}

Vous pouvez comparer des documents PDF protégés par mot de passe en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe _**[Comparer][9]**_
  2. Fournir le chemin du fichier PDF source au constructeur
  3. Fournissez un mot de passe pour le fichier source à l'aide de _LoadOptions_
  4. Ajouter le fichier PDF cible à la comparaison
  5. Fournissez un mot de passe pour le fichier cible à l'aide de _LoadOptions_
  6. Appelez la méthode _**[Compare][11]**_ avec le chemin du fichier de sortie

L'exemple de code suivant montre **comment comparer des documents PDF protégés par mot de passe à l'aide de C#**.
```
using (Comparer comparer = new Comparer("C:\\Files\\source.pdf", new LoadOptions() { Password = "1234" }))
{
    comparer.Add("C:\\Files\\target.pdf", new LoadOptions() { Password = "5678" });
    comparer.Compare("C:\\Files\\result.pdf");
}
```

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][14].
## Conclusion

Dans cet article, vous avez appris **comment **comparer deux documents PDF ou plus et mettre en évidence les différences**** à l'aide de C#. Vous pouvez en savoir plus sur l'API GroupDocs.Comparison .NET en utilisant la [documentation][15]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][16].
## See Also

  * [Rendre des diagrammes Visio au format HTML, PDF et image à l'aide de Java][17]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Compare-PDF-Files.jpg
 [2]: #csharp-comparison-api
 [3]: #Compare-Two-PDF-Files-using-Csharp
 [4]: #Compare-Password-Protected-PDF-Files-using-Csharp
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://products.groupdocs.com/comparison/net
 [7]: https://downloads.groupdocs.com/comparison/net
 [8]: https://www.nuget.org/packages/GroupDocs.Comparison
 [9]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison/comparer
 [10]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/add/methods/2
 [11]: https://apireference.groupdocs.com/comparison/net/groupdocs.comparison.comparer/compare/methods/7
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/ComparePDFFilesUsingC.png
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/image.png
 [14]: https://purchase.groupdocs.com/temporary-license
 [15]: https://docs.groupdocs.com/comparison/net/
 [16]: https://forum.groupdocs.com/c/comparison/
 [17]: https://blog.conholdate.com/2021/04/07/render-visio-diagrams-in-html-pdf-and-image-using-java/





