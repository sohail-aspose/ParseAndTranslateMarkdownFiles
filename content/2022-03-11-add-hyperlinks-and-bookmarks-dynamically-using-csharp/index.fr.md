---
title: "'Ajouter dynamiquement des hyperliens et des signets à l'aide de C#'"
author: Muzammil Khan
date: 2022-03-11T06:43:17+00:00
summary: "Les hyperliens et les signets sont pratiques pour permettre aux utilisateurs de naviguer rapidement dans le contenu pertinent. Dans cet article, vous apprendrez **comment ajouter dynamiquement des liens hypertexte et des signets à vos rapports à l'aide de C#**."
url: /fr/2022/03/11/add-hyperlinks-and-bookmarks-dynamically-using-csharp/

categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API C # pour ajouter dynamiquement des hyperliens et des signets"
  - "Ajouter dynamiquement des hyperliens C#"
  - "Ajouter dynamiquement des signets C#"
  - "Insérer des liens hypertexte vers des rapports C#"
  - "Insérer des signets dans les rapports C#"
---

{{< figure align=center src="images/add-hyperlinks-and-bookmarks-dynamically-using-csharp.jpg" alt="Ajouter dynamiquement des hyperliens et des signets à l'aide de C #">}}
 
Les hyperliens et les signets sont pratiques pour permettre aux utilisateurs de naviguer rapidement dans le contenu pertinent. Lorsqu'un lien hypertexte est cliqué, il ouvre l'URL dans le navigateur ou navigue jusqu'à l'emplacement du signet spécifié dans le document. Dans cet article, nous allons apprendre **comment ajouter dynamiquement des liens hypertexte et des signets aux rapports à l'aide de C#**.

Les sujets suivants seront traités dans cet article :

  * [API C # pour ajouter dynamiquement des hyperliens et des signets][1]
  * [Ajouter dynamiquement des hyperliens à l'aide de C #][2]
  * [Ajouter des signets dynamiquement à l'aide de C #][3]
  * [Insérer un signet en tant que lien hypertexte à l'aide de C#][4]

## API C # pour ajouter dynamiquement des hyperliens et des signets {#CSharp-API-to-Add-Hyperlinks-and-Bookmarks-Dynamically}

Pour ajouter dynamiquement des hyperliens et des signets aux rapports, nous utiliserons l'API [GroupDocs.Assembly pour .NET][5]. Il permet de créer de puissantes applications d'automatisation de documents et de génération de rapports. Il récupère les données de la source de données conformément au modèle de document défini, les assemble et génère des rapports dans le format de sortie spécifié. Veuillez soit [télécharger][6] la DLL de l'API ou l'installer à l'aide de [NuGet][7].

```
PM> Install-Package GroupDocs.Assembly
```

## Ajouter dynamiquement des hyperliens à l'aide de C # {#Add-Hyperlinks-Dynamically-using-CSharp}

Nous pouvons insérer dynamiquement des hyperliens vers des rapports à l'aide des balises de lien. La syntaxe d'une balise de lien à utiliser dans le modèle de document est définie comme suit :

```
<<link [uri_expression][display_text_expression]>>
```

L'**uri_expression** définit l'URI d'un hyperlien, tandis que l'**display_text_expression** définit le texte à afficher pour l'hyperlien.

Nous pouvons insérer dynamiquement des hyperliens vers des rapports en suivant les étapes ci-dessous :

  1. Créez une instance de la classe _**[DocumentAssembler][8]**_.
  2. Appelez la méthode AssembleDocument() pour assembler le document. Il prend le chemin du modèle de document source, le chemin du document cible et la source de données comme arguments.

L'exemple de code suivant montre **comment ajouter dynamiquement des liens hypertexte à l'aide de C#**.

```
// Cet exemple de code montre comment ajouter dynamiquement des liens hypertexte.
// Configuration des sources 
const string strDocumentTemplate = @"D:\Files\Assembly\Insertinghyperlink.docx";

// Configuration de la destination 
const string strDocumentReport = @"D:\Files\Assembly\Insertinghyperlink_out.docx";

// Configuration de l'expression Uri
const string uriExpression = "https://www.groupdocs.com/";

// Configuration de l'expression de texte d'affichage
const string displayTextExpression = "GroupDocs";

// Instancier la classe DocumentAssembler
DocumentAssembler assembler = new DocumentAssembler();

// Assembler le document 
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
    new DataSourceInfo(uriExpression, "uriExpression"),
    new DataSourceInfo(displayTextExpression, "displayTextExpression"));
```

{{< figure align=center src="images/Add-Hyperlinks-Dynamically-using-CSharp.jpg" alt="Ajoutez dynamiquement des hyperliens à l'aide de C#." caption="Ajoutez dynamiquement des hyperliens à l'aide de C#.">}}
 

## Ajouter des signets dynamiquement à l'aide de C # {#Add-Bookmarks-Dynamically-using-CSharp}

Nous pouvons insérer des signets dans les rapports de manière dynamique à l'aide des balises de signet. La syntaxe d'une balise de signet à utiliser dans le modèle de document est définie comme suit :

```
<<bookmark [bookmark_expression]>>
bookmarked_content
<</bookmark>>
```

**bookmark_expression** définit le nom d'un signet à insérer.

Nous pouvons insérer dynamiquement des signets dans les rapports en suivant les étapes ci-dessous :

  1. Créez une instance de la classe _**[DocumentAssembler][8]**_.
  2. Appelez la méthode AssembleDocument() pour assembler le document. Il prend le chemin du modèle de document source, le chemin du document cible et la source de données comme arguments.

L'exemple de code suivant montre **comment ajouter des signets dynamiquement à l'aide de C#**.

```
// Cet exemple de code montre comment ajouter dynamiquement des signets.
// Configuration des sources 
const string strDocumentTemplate = @"D:\Files\Assembly\Insertingbookmark.xlsx";

// Configuration de la destination 
const string strDocumentReport = @"D:\Files\Assembly\Insertingbookmark_out.xlsx";

// Configuration de l'expression Uri
const String bookmark_expression = "gd_bookmark";

// Configuration de l'expression de texte d'affichage
const String displayTextExpression = "GroupDocs";

// Instancier la classe DocumentAssembler
DocumentAssembler assembler = new DocumentAssembler();

// Assembler le document 
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
    new DataSourceInfo(bookmark_expression, "bookmark_expression"),
    new DataSourceInfo(displayTextExpression, "displayTextExpression"));
```


## Insérer un signet en tant que lien hypertexte à l'aide de C # {#Insert-Bookmark-as-Hyperlink-using-CSharp}

Nous pouvons également lier des signets à des hyperliens dans un document en suivant les étapes mentionnées précédemment. Cependant, nous avons juste besoin de définir la même valeur pour uriExpression et bookmark_expression comme indiqué ci-dessous :

```
const string bookmark_expression = "gd_bookmark";
const String uriExpression = "gd_bookmark";
```

L'exemple de code suivant montre **comment insérer un signet en tant que lien hypertexte à l'aide de C#**.

```
// Cet exemple de code montre comment ajouter un signet en tant que lien hypertexte.
// Configuration des sources 
const string strDocumentTemplate = @"D:\Files\Assembly\input.docx";

// Configuration de la destination 
const string strDocumentReport = @"D:\Files\Assembly\output.docx";

// Configuration de l'expression Uri
const string bookmark_expression = "gd_bookmark";

// Configuration de l'expression de texte d'affichage
const string displayTextExpression = "GroupDocs";

// Configuration de l'expression Uri
const String uriExpression = "gd_bookmark";

// Configuration de l'expression de texte d'affichage
const String uriTextExpression = "GroupDocs";

// Instancier la classe DocumentAssembler
DocumentAssembler assembler = new DocumentAssembler();

// Assembler le document 
assembler.AssembleDocument(strDocumentTemplate, strDocumentReport,
                           new DataSourceInfo(uriExpression, "uriExpression"), 
                           new DataSourceInfo(uriTextExpression, "uriTextExpression"),
                           new DataSourceInfo(bookmark_expression, "bookmark_expression"),
                           new DataSourceInfo(displayTextExpression, "displayTextExpression"));
```

{{< figure align=center src="images/Insert-Bookmark-as-Hyperlink-using-CSharp.jpg" alt="Insérer un signet en tant que lien hypertexte à l'aide de C #." caption="Insérer un signet en tant que lien hypertexte à l'aide de C #.">}}

## Obtenez une licence gratuite

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][9].

## Conclusion

Dans cet article, nous avons appris à :
  * insérer dynamiquement des hyperliens et des signets dans des rapports à l'aide de C# ;
  * ajouter dynamiquement un lien hypertexte vers un signet.

En outre, vous pouvez en savoir plus sur l'API GroupDcos.Assembly pour .NET à l'aide de la [documentation][10]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][11].

## Voir également

  * [Générer des rapports à partir de données Excel en C#][12]

  [1]: #CSharp-API-to-Add-Hyperlinks-and-Bookmarks-Dynamically
  [2]: #Add-Hyperlinks-Dynamically-using-CSharp
  [3]: #Add-Bookmarks-Dynamically-using-CSharp
  [4]: #Insert-Bookmark-as-Hyperlink-using-CSharp
  [5]: https://products.groupdocs.com/assembly/net/
  [6]: https://downloads.groupdocs.com/assembly/net
  [7]: https://www.nuget.org/packages/groupdocs.assembly
  [8]: https://apireference.groupdocs.com/assembly/net/groupdocs.assembly/documentassembler
  [9]: https://purchase.conholdate.com/temporary-license
  [10]: https://docs.groupdocs.com/assembly/net/
  [11]: https://forum.groupdocs.com/c/assembly/15
  [12]: https://blog.conholdate.com/2021/04/29/generate-reports-from-excel-data-in-csharp/
