---
title: "Convertir un PDF en Excel à l'aide de C#"
author: Muzammil Khan
date: 2021-03-31T03:23:05+00:00
summary: "Exportez facilement des données tabulaires à partir de fichiers PDF vers des feuilles Excel (.xlsx ou .xls) par programmation dans votre application .NET. Dans cet article, vous allez apprendre <strong>à convertir un PDF en Excel à l'aide de C#</strong> ."
url: /2021/03/31/convert-pdf-to-excel-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Convertir PDF en Excel"
  - "Convertir PDF en XLSX"
  - "Exporter des données de PDF vers Excel"
  - "Exporter le tableau de données vers Excel"

---


{{< figure align=center src="images/Convert-PDF-to-Excel.jpg" alt="Convertir PDF en Excel">}}
 

Vous pouvez facilement exporter des données tabulaires à partir de fichiers PDF vers des feuilles Excel (_.xlsx_ ou _.xls_) par programmation dans votre application .NET. Une telle conversion est utile lorsque vous devez modifier des données ou appliquer divers calculs disponibles dans Excel. Dans cet article, vous allez apprendre **comment convertir un PDF en Excel en utilisant C#**.
Les sujets suivants seront traités dans cet article :
  * [API C# pour convertir un PDF en Excel][2]
  * [Convertir PDF en Excel][3]

## API C# pour convertir un PDF en Excel {#net-conversion-api}

J'utiliserai [GroupDocs.Conversion pour l'API .NET][4] pour la conversion de [PDF][5] en [XLSX][6]. Cette API fournit une solution de conversion de fichiers rapide, efficace et fiable en applications .NET sans installer de logiciel externe. Il vous permet également de créer de puissantes applications de conversion de documents en C#, ASP.NET et d'autres technologies liées à .NET.
Vous pouvez soit [télécharger][7] la DLL de l'API, soit l'installer à l'aide de [NuGet][8].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Conversion</code></pre>
## Convertir un PDF en Excel à l'aide de C# {#convert-pdf-to-xlsx}

Vous pouvez convertir des documents PDF en Excel en suivant les étapes simples ci-dessous :
  1. Définissez _**[PdfLoadOptions][9]**_ le cas échéant.
  2. Définissez les options de conversion à l'aide de _**[SpreadsheetConvertOptions][10]**_
  3. Créez une instance de la classe _**[Converter][11]**_
  4. Indiquez le chemin du fichier et les options de chargement
  5. Appelez la méthode _**[Convert][12]**_ avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment exporter des données tabulaires d'un fichier PDF vers une feuille Excel à l'aide de C#**.
```
// Options de chargement PDF
GroupDocs.Conversion.Contracts.Func<LoadOptions> getLoadOptions = () => new PdfLoadOptions
{
    FlattenAllFields = true,    // all fields in the source document will be flatten during conversion
    Password = "123"            // provide password if document is password protected
};

// Options de conversion Excel
SpreadsheetConvertOptions options = new SpreadsheetConvertOptions
{
    PageNumber = 1,                     // Starting page number
    PagesCount = 1,                     // Total pages to convert
    Format = SpreadsheetFileType.Xlsx,  // Conversion format
    Password = "password",              // Set password for converted file
    Zoom = 110                          // Zoom level
};

// Convertir PDF en XLSX
Converter converter = new Converter("C:\\Files\\sample.pdf", getLoadOptions);
converter.Convert("C:\\Files\\converted.xlsx", options);
```

{{< figure align=center src="images/ConvertPDFtoXLSX-1024x484.jpg" alt="Convertir PDF en XLSX" caption="Convertir PDF en XLSX">}}
 

La classe **_PdfLoadOptions_** fournit diverses options pour charger des documents PDF. Ces [propriétés][14] incluent **FlattenAllFields, HidePdfAnnotations, Password** et **RemoveEmbeddedFiles**. Vous pouvez trouver plus de détails dans la [documentation][15].
La classe **SpreadsheetConvertOptions** fournit certaines [propriétés][16] pour convertir des fichiers d'autres formats en type de fichier Feuille de calcul.
  * La propriété **_PageNumber_** définit le numéro de page de départ du document source à convertir.
  * La propriété **_PagesCount_** définit le nombre total de pages à convertir à partir de **_PageNumber_**.
  * Vous pouvez convertir des pages spécifiques en fournissant une liste d'index de page à la propriété **_Pages_**.
  * Vous pouvez définir un mot de passe pour le fichier converti à l'aide de la propriété **_Password_**.
  * La propriété **_Zoom_** peut être utilisée pour définir le niveau de zoom en pourcentage pour le fichier converti.
  * La propriété **_Format_** définit le format de sortie du fichier converti.

Vous pouvez trouver plus de détails sur "[convertir en une feuille de calcul avec des options avancées][17]" dans la documentation.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][18].
## Conclusion

Dans cet article, vous avez appris **comment exporter des données de tableau de** **documents PDF vers des feuilles Excel** à l'aide de C#. Vous pouvez en savoir plus sur l'API GroupDocs.Conversion .NET en utilisant la [documentation][19]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][20].
## See Also

  * [Exporter des données vers Excel en C#][21]
  * [Convertir des dessins CAO en PDF en C# .NET][22]
  * [C# Convertir des images WebP en JPG, PNG, TIFF et PDF][23]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/03/Convert-PDF-to-Excel.jpg
 [2]: #net-conversion-api
 [3]: #convert-pdf-to-xlsx
 [4]: https://products.groupdocs.com/conversion/net
 [5]: https://docs.fileformat.com/pdf/
 [6]: https://docs.fileformat.com/spreadsheet/xlsx/
 [7]: https://downloads.groupdocs.com/conversion/net
 [8]: https://www.nuget.org/packages/GroupDocs.Conversion
 [9]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.load/pdfloadoptions
 [10]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/spreadsheetconvertoptions
 [11]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion/converter
 [12]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.converter/convert/methods/16
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/03/ConvertPDFtoXLSX.jpg
 [14]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.load/pdfloadoptions/properties/index
 [15]: https://docs.groupdocs.com/conversion/net/load-pdf-document-with-options/
 [16]: https://apireference.groupdocs.com/conversion/net/groupdocs.conversion.options.convert/spreadsheetconvertoptions/properties/index
 [17]: https://docs.groupdocs.com/conversion/net/convert-to-spreadsheet-with-advanced-options/
 [18]: https://purchase.groupdocs.com/temporary-license
 [19]: https://docs.groupdocs.com/conversion/net/
 [20]: https://forum.groupdocs.com/c/conversion/11
 [21]: https://blog.conholdate.com/2020/08/10/export-data-to-excel-in-csharp/
 [22]: https://blog.groupdocs.com/2020/11/08/convert-cad-drawings-to-pdf-in-csharp/
 [23]: https://blog.groupdocs.com/2020/06/30/convert-webp-to-jpg-png-tiff-and-pdf-in-csharp/





