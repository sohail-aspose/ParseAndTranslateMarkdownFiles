---
title: Generate Reports from Excel Data in Java
author: Muzammil Khan
date: 2021-08-18T17:20:07+00:00
summary: "En tant que développeur Java, vous pouvez facilement générer des rapports personnalisés par programmation à partir de données Excel. Dans cet article, vous apprendrez <strong>à générer des rapports à partir de données Excel à l'aide de Java</strong> ."
url: /2021/08/18/generate-reports-from-excel-data-in-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Générer des rapports"
  - "Générer des rapports" from Excel
  - "GroupDocs.Assembly pour Java"
  - "Rapport Word à partir d'Excel avec Java"

---


{{< figure align=center src="images/generate-reports-from-excel-data-in-java.jpg" alt="Générer des rapports à partir de données Excel en Java">}}
 

Vous pouvez présenter des données Microsoft Excel sous la forme de rapports personnalisés à vos utilisateurs tels que des clients, des parties prenantes, etc. En tant que développeur Java, vous pouvez générer de tels rapports par programme en utilisant des feuilles de calcul Excel comme tableau de données. Dans cet article, vous apprendrez **comment générer des rapports à partir de données Excel à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour la génération de rapport][2]
  * [Générer des rapports à partir de données Excel à l'aide de Java][3]

## API Java pour la génération de rapports {#java-api-for-generating-reports}

Pour générer les rapports à partir de données Excel, j'utiliserai l'API [GroupDocs.Assembly for Java][4]. Il vous permet de créer de puissantes applications d'automatisation de documents et de génération de rapports. Il récupère les données de la source de données conformément au modèle de document défini, les assemble et génère des rapports dans le format de sortie spécifié. L'API prend en charge la récupération de données à partir de diverses sources de données telles que XML, Excel, JSON et CSV. Vous pouvez facilement générer des rapports dans tous les formats de fichiers couramment utilisés tels que PDF, HTML et Microsoft Word.
Vous pouvez [télécharger][5] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-assembly</artifactId><version>21.7</version></dépendance></pre>
## Générer des rapports à partir de données Excel à l'aide de Java {#generate-reports-from-excel-in-java}

Vous pouvez facilement générer des rapports dans Word à partir de vos données Excel en suivant les étapes simples mentionnées ci-dessous :
<ol id="block-7217a74c-2677-474d-aee2-df72121b5cd2"><li>Obtenir <a href="#get-excel-data">la source de données Excel</a></li><li>Définir un <a href="#template">modèle en</a> fonction des données Excel</li><li><a href="#generate-excel-to-word-report">Convertir des données Excel en rapport Word en Java</a></li></ol>
### Source de données Excel {#get-excel-data}
<p id="block-17f4a041-9fca-4b56-b0b9-a19227bff1fc">Vous pouvez utiliser les données tabulaires comme source de données fournies dans la feuille de calcul Excel pour générer des rapports. J'utiliserai les exemples de données Excel suivants pour générer le rapport. Il s'agit des données contractuelles des clients avec leurs responsables respectifs et du prix contractuel convenu.

{{< figure align=center src="images/Excel-Data-Source.jpg" alt="Source de données Excel" caption="Source de données Excel">}}
 

### Modèle {#modèle}
Vous pouvez utiliser une syntaxe de modèle basée sur Linq pour créer un modèle. Un modèle est composé d'un contenu de document commun et de balises décrivant la structure du modèle et les liaisons de données. Vous pouvez définir le modèle suivant dans le fichier DOCX ou XLSX. Ce modèle vous permet d'itérer les données des contrats et leurs responsables respectifs avec le prix du contrat. Chaque groupe du modèle a une clé unique définie par le sélecteur d'entrée et contient des éléments de l'énumération source associée à cette clé. Vous pouvez accéder à la clé d'une instance de groupe à l'aide de la propriété Key. Une fois que vous avez créé le modèle, vous pouvez sauter dans le code pour générer le rapport. Vous pouvez en savoir plus sur la [syntaxe du modèle][7] dans la documentation.
{{< figure align=center src="images/Report-Template.jpg" alt="Modèle de rapport" caption="Modèle de rapport">}}
 

### Convertir des données Excel en rapport Word en Java {#generate-excel-to-word-report}
Vous pouvez automatiser la conversion des données Excel vers le rapport DOCX basé sur le modèle en suivant les étapes mentionnées ci-dessous :
  * Définir les chemins d'accès au fichier de données Excel, au fichier de modèle et au fichier de rapport de sortie DOCX
  * Créez une instance de la classe _**[DocumentTableOptions][9]**_
  * Définissez _**[setFirstRowContainsColumnNames][10]**_ sur _true_
  * Créez le _**[DocumentTable][11]**_ avec le fichier de données Excel défini et _DocumentTableOptions_
  * Créez une instance de la classe **[DocumentAssembler][12] **
  * Appelez la méthode _**[assembleDocument()][13]**_ avec les données Excel fournies et le modèle défini

L'exemple de code suivant montre comment générer un rapport à partir d'une source de données Excel selon le modèle défini à l'aide de Java.
```
String srcDocument = "C:\\Files\\template.docx";
String docReport = "C:\\Files\\Output.docx";
String dataFilePath = "C:\\Files\\Contracts_Data.xlsx";

// Définissez l'extraction des noms de colonne à partir de la première ligne.
DocumentTableOptions options = new DocumentTableOptions();
options.setFirstRowContainsColumnNames(true);

// Créer un tableau de documents
DocumentTable table = new DocumentTable(dataFilePath, 0, options);

// Créer un assembleur de documents
DocumentAssembler assembler = new DocumentAssembler();

// Assembler des données et générer un rapport
assembler.assembleDocument(srcDocument,docReport, 
  new DataSourceInfo(new DataStorage(), null),
  new DataSourceInfo(table,"ds"));
```

{{< figure align=center src="images/output_report.jpg" alt="Rapport généré" caption="Rapport généré">}}
 

La classe _**DocumentTableOptions** fournit un ensemble d'options pour contrôler l'extraction des données d'une table de documents. J'ai défini la propriété _FirstRowContainsColumnNames sur _true_ afin que les en-têtes de colonne ne fassent pas partie des données du rapport.
La classe _**DocumentTable **_ permet d'accéder aux données d'une seule table (ou d'une feuille de calcul) située dans un document externe à utiliser lors de l'assemblage d'un document.
La classe **_DocumentAssembler_** fournit diverses méthodes pour générer des rapports à l'aide du modèle de document défini avec des données. La méthode _assembleDocument**()**_ de cette classe prend trois paramètres d'entrée, le modèle défini comme document source, le chemin du fichier de sortie et la source de données. Il remplit les données de la source de données en fonction du modèle de document fourni et stocke le document résultant dans le chemin cible. Vous pouvez enregistrer le document résultant dans divers formats de fichiers pris en charge tels que Word, Excel ou HTML.
## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][15].
## Conclusion

Dans cet article, vous avez appris **comment générer des rapports à partir de données Excel à l'aide de Java**. Vous avez également appris **comment créer un modèle de rapport pour générer des rapports**. Vous pouvez en savoir plus sur l'API GroupDocs.Assembly pour Java à l'aide de la [documentation][16]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][17].
## See Also

  * [Rapports PDF et Word à partir de CSV en Java][18]
  * [Générer des rapports à partir de données XML en Java][19]
  * [Générer un rapport PDF à partir de données JSON en Java][20]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/generate-reports-from-excel-data-in-java.jpg
 [2]: #java-api-for-generating-reports
 [3]: #generate-reports-from-excel-in-java
 [4]: https://products.groupdocs.com/assembly/java
 [5]: https://downloads.groupdocs.com/assembly/java
 [6]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Excel-Data-Source.jpg
 [7]: https://docs.groupdocs.com/assembly/java/template-syntax-part-1-of-2/
 [8]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Report-Template.jpg
 [9]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentTableOptions
 [10]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentTableOptions#setFirstRowContainsColumnNames-boolean-
 [11]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentTable
 [12]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentAssembler
 [13]: https://apireference.groupdocs.com/assembly/java/com.groupdocs.assembly/DocumentAssembler#assembleDocument-java.lang.String-java.lang.String-com.groupdocs.assembly.DataSourceInfo...-
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/output_report.jpg
 [15]: https://purchase.groupdocs.com/temporary-license
 [16]: https://docs.groupdocs.com/assembly/java/
 [17]: https://forum.groupdocs.com/c/assembly/
 [18]: https://blog.groupdocs.com/2021/07/07/generate-reports-from-csv-data-in-java/
 [19]: https://blog.groupdocs.com/2021/07/10/generate-reports-from-xml-data-in-java/
 [20]: https://blog.groupdocs.com/2021/02/10/generate-pdf-report-from-json-data-in-java/





