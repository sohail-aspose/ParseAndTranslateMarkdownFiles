---
title: "Générer des rapports à partir de données Excel en C#"
author: Muzammil Khan
date: 2021-04-29T06:18:58+00:00
summary: "Vous pouvez facilement générer des rapports personnalisés par programmation en utilisant des feuilles de calcul Excel comme tableau de données. Cet article se concentrera sur la <strong>façon de générer des rapports à partir de données Excel à l'aide de C#</strong> ."
url: /2021/04/29/générer-des-rapports-à-partir-de-données-excel-dans-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Convertir Excel en Word dans CSharp"
  - "Données Excel vers Word à l'aide de CSharp"
  - "Générer des rapports"
  - "Générer des rapports" from Excel

---


{{< figure align=center src="images/Generate-Reports-from-Excel-Data.jpg" alt="Générer des rapports à partir de données Excel en C#">}}
 

Vous pouvez facilement créer des rapports personnalisés à partir de tableaux de données Microsoft Excel. Ces rapports peuvent être générés par programme en utilisant des feuilles de calcul Excel comme tableau de données. Cet article se concentrera sur **comment générer des rapports à partir de données Excel à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour générer un rapport][2]
  * [Générer des rapports à partir de données Excel à l'aide de C#][3]

## API C# pour la génération de rapports {#api-for-generating-reports}

J'utiliserai l'API [GroupDocs.Assembly pour .NET][4] pour générer des rapports à partir de données Excel. Il vous permet de créer de puissantes applications d'automatisation de documents et de génération de rapports. L'API prend en charge la récupération de données à partir de diverses sources de données telles que XML, JSON et CSV. Vous pouvez facilement générer des rapports dans tous les formats de fichiers couramment utilisés tels que PDF, HTML et Microsoft Word. Il peut être utilisé pour développer des applications dans n'importe quel environnement de développement qui cible la plate-forme .NET.
Vous pouvez soit [télécharger][5] la DLL de l'API, soit l'installer à l'aide de [NuGet][6].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Assembly</code></pre>
## Générer des rapports à partir de données Excel à l'aide de C# {#generate-reports-from-excel}

Vous pouvez générer des rapports à partir de données Excel en suivant les étapes simples mentionnées ci-dessous :
<ol id="block-7217a74c-2677-474d-aee2-df72121b5cd2"><li>Obtenir la source de <a href="#get-excel-data">données Excel</a></li><li>Définir le <a href="#template">modèle en</a> fonction des données Excel</li><li>Fournir une source de données et un modèle au <a href="#generate-excel-to-word-report">code C # simple pour la génération de rapports</a></li></ol>
### Données Excel {#get-excel-data}
<p id="block-17f4a041-9fca-4b56-b0b9-a19227bff1fc">Les données tabulaires disponibles dans la feuille de calcul Excel peuvent être utilisées comme source de données pour générer des rapports. J'utiliserai les exemples de données Excel suivants pour la génération de rapports. Il s'agit des données contractuelles des clients avec leurs responsables respectifs et du prix contractuel convenu.

{{< figure align=center src="images/Excel_data_source.png" alt="Source de données Excel" caption="Source de données Excel">}}
 

### Modèle {#modèle}
Maintenant, définissez le modèle suivant dans le fichier DOCX. Cela permet d'itérer les données des contrats et leurs gestionnaires respectifs avec le prix du contrat. Après cela, vous pouvez sauter dans le code pour la génération de rapports.
{{< figure align=center src="images/Template.jpg" alt="Modèle de rapport" caption="Modèle de rapport">}}
 

### Convertir Excel en rapport Word en C# {#generate-excel-to-word-report}
Veuillez suivre les étapes mentionnées ci-dessous pour automatiser la conversion des données Excel en rapport DOCX basé sur le modèle.
  * Définir les chemins d'accès au fichier de données Excel, au fichier de modèle et au fichier de rapport de sortie DOCX
  * Définir _**[DocumentTableOptions][9]**_
  * Créez _**[DocumentTable][10]**_ avec un fichier de données Excel défini et _DocumentTableOptions_
  * Appelez la méthode _**[AssembleDocument][11]**_ de la classe **[DocumentAssembler][12] ** pour générer le rapport à partir des données Excel fournies et du modèle défini

L'exemple de code suivant montre comment générer un rapport à partir d'une source de données Excel selon le modèle défini à l'aide de C#.
```
string ExcelDataFile = "Contracts_Data.xlsx";
string strDocumentTemplate = "Template.docx";
string strDocumentReport = "Output.docx";

// Définir un tableau de données à partir d'un fichier Excel
DocumentTableOptions options = new DocumentTableOptions 
{ 
    FirstRowContainsColumnNames = true 
};
DocumentTable table = new DocumentTable(ExcelDataFile, 0, options);

// Assemblez un document en utilisant la table de documents externe comme source de données.
DocumentAssembler assembler = new DocumentAssembler();
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
    new DataSourceInfo(table, "contracts"));
```

L'exemple de code ci-dessus générera le rapport suivant.
{{< figure align=center src="images/output.jpg" alt="Rapport généré" caption="Rapport généré">}}
 

La classe _**DocumentTableOptions**_ fournit un ensemble d'options pour contrôler l'extraction des données d'une table de documents. Ici, la propriété _FirstRowContainsColumnNames_ est définie sur _true_.
La classe _**DocumentTable**_ donne accès aux données d'une seule table (ou feuille de calcul) située dans un document externe à utiliser lors de l'assemblage d'un document.
La classe **_DocumentAssembler_** fournit des méthodes pour générer des rapports basés sur le modèle de document avec des données.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][14].
## Conclusion

Dans cet article, vous avez appris **comment générer des rapports **à partir de données Excel à l'aide de C#****. Vous pouvez en savoir plus sur l'API GroupDocs.Assembly pour .NET à l'aide de la [documentation][15]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][16].
## See Also

  * [Générer des rapports PDF et Word à partir de données JSON en C#][17]
  * [Générer des rapports à partir de données CSV ou XML à l'aide de C#][18]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Generate-Reports-from-Excel-Data.jpg
 [2]: #api-for-generating-reports
 [3]: #generate-reports-from-excel
 [4]: https://products.groupdocs.com/assembly/net
 [5]: https://downloads.groupdocs.com/assembly/net
 [6]: https://www.nuget.org/packages/GroupDocs.Assembly
 [7]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Excel_data_source.png
 [8]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Template.jpg
 [9]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly.data/documenttableoptions
 [10]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly.data/documenttable
 [11]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly.documentassembler/assembledocument/methods/2
 [12]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly/documentassembler
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/output.jpg
 [14]: https://purchase.groupdocs.com/temporary-license
 [15]: https://docs.groupdocs.com/assembly/net/
 [16]: https://forum.groupdocs.com/c/assembly/
 [17]: https://blog.groupdocs.com/2021/03/20/generate-reports-from-json-data-in-csharp/
 [18]: https://blog.groupdocs.com/2019/10/21/generate-reports-from-csv-xml-in-csharp/





