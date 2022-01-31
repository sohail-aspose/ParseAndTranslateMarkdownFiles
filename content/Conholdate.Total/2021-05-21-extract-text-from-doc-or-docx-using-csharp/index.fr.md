---
title: "Extraire du texte de DOC ou DOCX à l'aide de C #"
author: Muzammil Khan
date: 2021-05-21T17:01:28+00:00
summary: "Extrayez facilement du texte de documents Word ou PDF par programmation. Dans cet article, vous apprendrez <strong>à extraire du texte des documents DOC ou DOCX à l'aide de C#</strong> ."
url: /2021/05/21/extract-text-from-doc-or-docx-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Extraire du texte formaté à l'aide de CSharp"
  - "Extraire le texte"
  - "Extraire le texte" from DOCX
  - "Extraire le texte de la page à l'aide de CSharp"
  - "Extraire le texte" from Word

---


{{< figure align=center src="images/Extract-Text-from-DOCX.jpg" alt="Extraire le texte du DOCX">}}
 

La plupart des données sont représentées sous forme de texte visuel dans des documents, des images et sur le Web, de sorte que l'extraction de données textuelles est parfois la chose la plus nécessaire. Vous devrez peut-être extraire du texte ou des images à partir de documents Word ou PDF. En tant que développeur C#, vous pouvez facilement extraire du texte de documents par programmation. Dans cet article, vous apprendrez **comment extraire du texte de documents DOC ou DOCX à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour l'extraction de texte][2]
  * [Extraire le texte de DOCX à l'aide de C #][3]
  * [Obtenir du texte formaté à partir de DOCX à l'aide de C #][4]
  * [Extraire le texte formaté des pages à l'aide de C #][5]

## API C# pour l'extraction de texte {#api-for-extracting-text}

J'utiliserai l'API [GroupDocs.Parser for .NET][6] pour extraire un texte de documents [DOCX][7]. Il permet d'extraire du texte, des métadonnées et des images à partir de documents au format de fichier pris en charge tels que Word, PDF, Excel et Powerpoint. Il prend également en charge l'extraction de texte brut, formaté et structuré ainsi que les métadonnées des fichiers de formats pris en charge.
Vous pouvez soit [télécharger][8] la DLL de l'API, soit l'installer à l'aide de [NuGet][9].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Parser</code></pre>
## Extraire le texte de DOCX à l'aide de C # {#Extract-Text-from-DOCX-using-CSharp}

Vous pouvez facilement analyser n'importe quel document et extraire du texte en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe _[Parser][10]_
  * Spécifiez le chemin du fichier
  * Appelez la méthode _[GetText][11]_ de la classe Parser pour extraire le texte
  * Obtenir des résultats dans l'objet de classe _TextReader_
  * Afficher les résultats en appelant la méthode _ReadToEnd_ de la classe TextReader

L'exemple de code suivant montre comment extraire du texte d'un fichier DOCX à l'aide de C#.
```

```

{{< figure align=center src="images/Extract-Text-from-DOCX-using-CSharp-1024x528.jpg" alt="Extraire le texte de DOCX à l'aide de C#" caption="Extraire le texte de DOCX à l'aide de C #">}}
 

La classe [Parser][10] est la classe principale qui fournit des fonctionnalités d'analyse et d'extraction de texte et d'images. J'ai spécifié le chemin du fichier d'entrée dans le [constructeur] [13] de cette classe.
La méthode [GetText()][14] de la classe Parser extrait un texte du document spécifié.
## Obtenir du texte formaté à partir de DOCX à l'aide de C # {#Get-Formatted-Text-from-DOCX-using-CSharp}

Vous pouvez facilement analyser un document Word et extraire du texte sans perdre la mise en forme du style en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe _[Parser][10]_
  * Spécifiez le chemin du fichier
  * Définir _[FormattedTextOptions][15]_
  * Définissez _[FormattedTextMode][16]_ sur HTML
  * Appelez la méthode [GetFormattedText][17] de la classe Parser pour extraire le texte
  * Obtenir des résultats dans l'objet de classe TextReader
  * Afficher les résultats en appelant la méthode ReadToEnd de la classe TextReader

L'exemple de code suivant montre comment extraire du texte formaté d'un fichier DOCX à l'aide de C#.
```
// Créer une instance de la classe Parser
Parser parser = new Parser(@"C:\Files\sample.docx");

// Extraire un texte formaté dans le lecteur
using (TextReader reader = parser.GetFormattedText(new FormattedTextOptions(FormattedTextMode.Html)))
{
    // Print a formatted text from the document
    // If formatted text extraction isn't supported, a reader is null
    Console.WriteLine(reader == null ? "Formatted text extraction isn't suppported" : reader.ReadToEnd());
}
```

{{< figure align=center src="images/image-1-1024x335.png" alt="Extraire le texte formaté de DOCX à l'aide de C#" caption="Extraire le texte formaté de DOCX à l'aide de C #">}}
 

La classe [FormattedTextOptions][15] fournit les options qui sont utilisées pour l'extraction de texte formaté comme l'extraction _[Mode][16]_. J'ai défini le mode d'extraction sur le HTML qui extrait le texte d'un document au <a rel="noreferrer noopener"  href="https://docs.groupdocs.com/display/parsernet/HTML">format HTML</a> .
La méthode [GetFormattedText()][19] de la classe Parser extrait un texte formaté du document spécifié.
## Extraire le texte formaté des pages à l'aide de C # {#Extract-Formatted-Text-from-Pages-using-CSharp}

Vous pouvez facilement analyser un document Word et extraire du texte formaté d'une page spécifique du document en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe _[Parser][10]_
  * Spécifiez le chemin du fichier
  * Vérifiez si le _[FormattedText][20]_ est vrai
  * Appelez _[GetDocumentInfo][21]_ pour obtenir le nombre de pages
  * Vérifiez si le _[PageCount][22]_ n'est pas zéro
  * Définir _[FormattedTextOptions][15]_
  * Définissez _[FormattedTextMode][16]_ sur HTML
  * Appelez la méthode [GetFormattedText][17] pour chaque index de page pour extraire le texte
  * Obtenir des résultats dans l'objet de classe TextReader
  * Afficher les résultats en appelant la méthode ReadToEnd de la classe TextReader

L'exemple de code suivant montre comment extraire un par un le texte mis en forme des pages à l'aide de C#.
```
// Créer une instance de la classe Parser
using (Parser parser = new Parser(@"C:\Files\sample.docx"))
{
    // Check if the document supports formatted text extraction
    if (!parser.Features.FormattedText)
    {
        Console.WriteLine("Document isn't supports formatted text extraction.");
        return;
    }

    // Get the document info
    IDocumentInfo documentInfo = parser.GetDocumentInfo();
    // Check if the document has pages
    if (documentInfo.PageCount == 0)
    {
        Console.WriteLine("Document hasn't pages.");
        return;
    }

    // Iterate over pages
    for (int p = 0; p < documentInfo.PageCount; p++)
    {
        // Print a page number 
        Console.WriteLine(string.Format("Page {0}/{1}", p + 1, documentInfo.PageCount));
        // Extract a formatted text into the reader
        using (TextReader reader = parser.GetFormattedText(p, new FormattedTextOptions(FormattedTextMode.Html)))
        {
            // Print a formatted text from the document
            // We ignore null-checking as we have checked formatted text extraction feature support earlier
            Console.WriteLine(reader.ReadToEnd());
        }
    }
}
```

{{< figure align=center src="images/image-1024x363.png" alt="Extraire le texte formaté des pages à l'aide de C #" caption="Extraire le texte formaté des pages à l'aide de C #">}}
 

La classe Parser fournit la propriété [Features][24] représentant la classe [Features][25]. Il peut être utilisé pour vérifier si une fonctionnalité est prise en charge pour le document. Vous pouvez en savoir plus sur les fonctionnalités prises en charge dans la section "[Obtenir les fonctionnalités prises en charge][26]".
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][27].
## Conclusion

Dans cet article, vous avez appris **comment extraire du texte de documents Word en utilisant** C#. Vous pouvez en savoir plus sur GroupDocs.Parser pour l'API .NET en utilisant la [documentation][28]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][29].
## See Also

  * [Extraire des images de documents PDF, Excel, PPT, Word en C#][30]
  * [Extraire des données spécifiques d'un PDF à l'aide de Python][31]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Extract-Text-from-DOCX.jpg
 [2]: #api-for-extracting-text
 [3]: #Extract-Text-from-DOCX-using-CSharp
 [4]: #Get-Formatted-Text-from-DOCX-using-CSharp
 [5]: #Extract-Formatted-Text-from-Pages-using-CSharp
 [6]: https://products.groupdocs.com/parser/net
 [7]: https://docs.fileformat.com/word-processing/docx/
 [8]: https://downloads.groupdocs.com/parser/net
 [9]: https://www.nuget.org/packages/GroupDocs.Parser
 [10]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser
 [11]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/gettext/index
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Extract-Text-from-DOCX-using-CSharp.jpg
 [13]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/constructors/7
 [14]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/gettext
 [15]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/formattedtextoptions
 [16]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/formattedtextoptions/properties/mode
 [17]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/getformattedtext/index
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/image-1.png
 [19]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/getformattedtext
 [20]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/features/properties/formattedtext
 [21]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/methods/getdocumentinfo
 [22]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/idocumentinfo/properties/pagecount
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/image.png
 [24]: https://apireference.groupdocs.com/parser/net/groupdocs.parser/parser/properties/features
 [25]: https://apireference.groupdocs.com/parser/net/groupdocs.parser.options/features
 [26]: https://docs.groupdocs.com/parser/net/get-supported-features/
 [27]: https://purchase.groupdocs.com/temporary-license
 [28]: https://docs.groupdocs.com/parser/net/
 [29]: https://forum.groupdocs.com/c/parser/
 [30]: https://blog.groupdocs.com/2020/10/28/extract-images-from-pdf-word-excel-ppt-using-csharp/
 [31]: https://blog.groupdocs.cloud/2021/04/28/extract-specific-data-from-pdf-using-python/





