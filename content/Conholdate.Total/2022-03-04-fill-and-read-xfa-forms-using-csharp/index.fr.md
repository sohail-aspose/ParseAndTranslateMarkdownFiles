---
title: "'Remplir et lire les formulaires XFA à l'aide de C#'"
author: Muzammil Khan
date: 2022-03-04T06:43:17+00:00
summary: "En tant que développeur C#, vous pouvez remplir et lire des formulaires PDF XFA par programmation dans des applications .NET. Dans cet article, vous apprendrez **comment remplir et lire des formulaires XFA à l'aide de C#**."
url: /fr/2022/03/04/fill-and-read-xfa-forms-using-csharp/

categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API C# pour remplir et lire XFA"
  - "Remplir des formulaires XFA avec C#"
  - "Formulaires XFA"
  - "GroupDocs.PDF pour .NET"
  - "Lire des formulaires XFA à l'aide de C#"
---


{{< figure align=center src="images/Fill-and-Read-XFA-Forms-using-CSharp.jpg" alt="Remplir et lire des formulaires XFA à l'aide de C #">}}
 

Adobe a introduit des formulaires interactifs et dynamiques appelés formulaires XFA. XFA signifie XML Forms Architecture. Le formulaire XFA est similaire à un fichier HTML. Il contient des champs à remplir et détermine la mise en page ou l'apparence sous forme de formulaire intégré dans les documents PDF. Dans cet article, nous allons apprendre **comment remplir et lire des formulaires XFA à l'aide de C#**.

Les sujets suivants seront traités dans cet article :

  * [API C# pour lire et remplir des formulaires XFA][1]
  * [Remplir des formulaires XFA avec C#][2]
  * [Lire des formulaires XFA à l'aide de C#][3]

## API C# pour lire et remplir des formulaires XFA {#CSharp-API-to-Read-and-Fill-XFA-Forms}

Pour travailler avec les formulaires XFA [PDF][4], nous utiliserons l'API [Aspose.PDF for .NET][5]. Il nous permet de générer, modifier, convertir, restituer, sécuriser et imprimer [documents pris en charge][6] sans utiliser Adobe Acrobat. Veuillez soit [télécharger][7] la DLL de l'API ou l'installer à l'aide de [NuGet][8].

```
PM> Install-Package Aspose.Pdf
```

## Remplir des formulaires XFA avec C# {#Fill-XFA-Forms-using-CSharp}

Nous pouvons remplir les formulaires XFA par programmation en suivant les étapes ci-dessous :

  1. Tout d'abord, chargez un fichier de formulaire XFA à l'aide de la classe _**[Document][9]**_.
  2. Obtenez les noms des champs de formulaire _**[XFA][10]**_ chargés.
  3. Définissez les valeurs des champs.
  4. Enfin, appelez la méthode _**[Save()][11]**_. Il prend le chemin du fichier de sortie comme argument.

L'exemple de code suivant montre **comment remplir un formulaire XFA à l'aide de C#**.

```
// Cet exemple de code montre comment remplir un formulaire XFA.
// Charger le formulaire XFA
Document doc = new Document(@"C:\Files\PDF\FillXFAFields.pdf");

// Obtenir les noms des champs de formulaire XFA
string[] names = doc.Form.XFA.FieldNames;

// Définir des valeurs de champ
doc.Form.XFA[names[0]] = "12345";
doc.Form.XFA[names[1]] = "24/02/2022";
doc.Form.XFA[names[2]] = "Company Name";
doc.Form.XFA[names[3]] = "Company Address";
doc.Form.XFA[names[4]] = "Company City";
doc.Form.XFA[names[5]] = "Canada";
doc.Form.XFA[names[6]] = "Alberta";
doc.Form.XFA[names[7]] = "T9S";
doc.Form.XFA[names[8]] = "+112345567";
doc.Form.XFA[names[10]] = "Mr. John Smith";
doc.Form.XFA[names[11]] = "Delivered to Company Name";
doc.Form.XFA[names[12]] = "Delivery Company Address";
doc.Form.XFA[names[13]] = "Delivery City";
doc.Form.XFA[names[17]] = "+123456789";
doc.Form.XFA[names[19]] = "Mr. Will Smith";
doc.Form.XFA[names[22]] = "57251";

// Enregistrer le formulaire
doc.Save(@"C:\Files\PDF\Filled_XFA_out.pdf");
```

{{< figure align=center src="images/Fill-XFA-Forms-using-CSharp.jpg" alt="Remplissez les formulaires XFA à l'aide de C #." caption="Remplissez les formulaires XFA à l'aide de C #.">}}
 

## Lire des formulaires XFA à l'aide de C# {#Read-XFA-Forms-using-CSharp}

Nous pouvons lire le formulaire XFA rempli en suivant les étapes ci-dessous :

  1. Tout d'abord, chargez un fichier Excel en utilisant la classe _**[Document][9]**_.
  2. Obtenez les noms des champs de formulaire _**[XFA][12]**_ chargés.
  3. Dans une boucle, obtenez les détails du champ à l'aide de la méthode _**[GetFieldTemplate()][13]**_.
  4. Enfin, affichez les attributs de champ.

L'exemple de code suivant montre **comment lire le formulaire XFA rempli à l'aide de C#**.

```
// Cet exemple de code montre comment lire un formulaire XFA rempli.
// Charger le formulaire XFA
Document doc = new Document(@"C:\Files\PDF\Filled_XFA_out.pdf");

// Obtenir les noms des champs de formulaire XFA
string[] names = doc.Form.XFA.FieldNames;

for (int count=0; count<names.Length; count++)
{
    // Get field details
    var field = doc.Form.XFA.GetFieldTemplate(names[count]);
    string fieldName = doc.Form.XFA.GetFieldTemplate(names[count]).InnerText;
    string fieldValue = doc.Form.XFA[names[count]];

    if (!string.IsNullOrEmpty(fieldValue) && fieldValue != "0")
    {
        Console.WriteLine("Field Name : " + field.Attributes["name"].Value);
        Console.WriteLine("Field Description : " + fieldName);
        Console.WriteLine("Field Value : " + fieldValue);
        Console.WriteLine();
    }
}
```

{{< figure align=center src="images/Read-XFA-Forms-using-CSharp.jpg" alt="Lisez le formulaire XFA rempli à l'aide de C#." caption="Lisez le formulaire XFA rempli à l'aide de C#.">}}
 
## Obtenez une licence gratuite

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][14].

## Conclusion

Dans cet article, nous avons appris ** comment remplir les formulaires XFA ** sans utiliser Adobe Writer. Nous avons également vu **comment lire le formulaire XFA rempli** par programmation. En outre, vous pouvez en savoir plus sur Aspose.PDF pour l'API .NET en utilisant la [documentation][15]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][16].

## Voir également

  * [Modifier les métadonnées des fichiers PDF à l'aide de C#][17]
  * [Ajouter des en-têtes et des pieds de page dans un PDF à l'aide de C #][18]

  [1]: #CSharp-API-to-Read-and-Fill-XFA-Forms
  [2]: #Fill-XFA-Forms-using-CSharp
  [3]: #Read-XFA-Forms-using-CSharp
  [4]: https://docs.fileformat.com/pdf/
  [5]: https://products.aspose.com/pdf/net/
  [6]: https://docs.aspose.com/pdf/net/supported-file-formats/
  [7]: https://downloads.aspose.com/pdf/net/
  [8]: https://www.nuget.org/packages/aspose.pdf
  [9]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
  [10]: https://apireference.aspose.com/pdf/net/aspose.pdf.forms/xfa
  [11]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
  [12]: https://apireference.aspose.com/pdf/net/aspose.pdf.forms/form/properties/xfa
  [13]: https://apireference.aspose.com/pdf/net/aspose.pdf.forms/xfa/methods/getfieldtemplate
  [14]: https://purchase.conholdate.com/temporary-license
  [15]: https://docs.aspose.com/pdf/net/
  [16]: https://forum.aspose.com/c/pdf/10
  [17]: https://blog.conholdate.com/2022/02/10/edit-metadata-of-pdf-files-using-csharp/
  [18]: https://blog.conholdate.com/2021/12/15/add-headers-and-footers-in-pdf-using-csharp/
