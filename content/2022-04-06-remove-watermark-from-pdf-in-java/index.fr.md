---
title: "Supprimer les filigranes des documents PDF en Java"
date: Wed, 06 Apr 2022 14:14:00 +0000
draft: false
url: /fr/2022/04/06/remove-watermark-from-pdf-in-java/
author: 'Shoaib Khan'
summary: "Les filigranes sont principalement utilisés pour mentionner des documents en tant que brouillons et pour éviter toute utilisation illégale de documents confidentiels. Lorsque le brouillon est finalisé ou que la confidentialité est terminée, vous pouvez supprimer les filigranes de ces documents. Les filigranes peuvent être basés sur du texte ou sur des images. Dans cet article, nous verrons **comment supprimer les filigranes des documents PDF en Java**."
tags: ['delete watermark', 'how to remove watermark in java', 'remove watermark', 'remove watermark from pdf', 'Watermark Remover', 'watermark remover application']
categories: ['GroupDocs.Watermark Product Family']
---

Les filigranes sont principalement utilisés pour mentionner des documents en tant que brouillons et pour éviter toute utilisation illégale de documents confidentiels. Lorsque le brouillon est finalisé ou que la confidentialité est terminée, vous pouvez supprimer les filigranes de ces documents. Les filigranes peuvent être basés sur du texte ou sur des images. Dans cet article, nous verrons **comment supprimer les filigranes des documents PDF en Java**.

{{< figure align=center src="images/removing-watermark-from-pdf.jpg" alt="Supprimer par programme les filigranes des fichiers PDF.">}}

## API Java pour supprimer les filigranes PDF

[GroupDocs.Watermark][1] fournit une API Java pour gérer les filigranes dans les documents et les images de différents [formats de fichier][2]. Si vous créez une application de suppression de filigrane, elle vous fournit des moyens utiles pour :

- Supprimez tous les filigranes du document PDF
- Supprimer les filigranes de lien hypertexte
- Supprimer les filigranes avec un formatage de texte particulier

Découvrons comment un développeur Java peut supprimer les filigranes d'un PDF à l'aide de l'API [GroupDocs.Watermark for Java][3] de différentes manières. Tout d'abord, téléchargez et configurez l'API avec votre application.

### Télécharger ou configurer

Vous pouvez télécharger le fichier JAR à partir de la section [downloads][4] ou utiliser les dernières configurations de référentiel et de dépendance [Maven][5] dans vos applications Java.

```
<repository>
	<id>GroupDocsJavaAPI</id>
	<name>GroupDocs Java API</name>
	<url>https://repository.groupdocs.com/repo/</url>
</repository>
<dependency>
        <groupId>com.groupdocs</groupId>
        <artifactId>groupdocs-watermark</artifactId>
        <version>21.3</version> 
</dependency>
```

## Supprimer tous les filigranes des fichiers PDF en Java

L'API vous donne le pouvoir de trouver facilement puis de supprimer un filigrane particulier et tous les filigranes du document. Les étapes suivantes montrent comment supprimer tous les filigranes d'un document PDF en Java.

- Chargez le document PDF à l'aide de [Filigrane][6].
- Récupérez tous les [filigranes possibles][7] en tant que collection à l'aide de la recherche.
- Parcourez toute la collection et supprimez chaque filigrane ou celui qui répond au critère.
- Enregistrez le PDF mis à jour sans filigrane.

Le code Java suivant supprime tous les filigranes d'un document PDF.

```
// Supprimer les filigranes des PDF et autres documents en Java
Watermarker watermarker = new Watermarker("filepath/document-with-watermarks.pdf");

PossibleWatermarkCollection possibleWatermarks = watermarker.search();
for (int i = 0 ; i < watermarks.getCount(); i++)
{
    // Remove every watermark by mentioning the index within the document.
    possibleWatermarks.removeAt(i);
}
watermarker.save("filepath/no-watermarks.pdf");
watermarker.close();
```

## Supprimer le filigrane de lien hypertexte en Java

L'API de filigrane permet de rechercher et de supprimer des hyperliens du document PDF. Les étapes suivantes permettent de supprimer les filigranes de lien hypertexte d'un document PDF dans l'application Java.

- Chargez le fichier PDF à l'aide de [Filigrane][6].
- Récupérez les [filigranes possibles][7] en tant que collection à l'aide de la recherche.
- Parcourez la collection et supprimez le(s) filigrane(s) répondant au critère.
- Enregistrez le PDF mis à jour sans plus de filigranes dessus.

L'exemple de code Java suivant montre comment rechercher et supprimer des filigranes de lien hypertexte avec une URL particulière à partir d'un document PDF.

```
// Supprimer les filigranes de lien hypertexte du PDF en Java
Watermarker watermarker = new Watermarker("path/watermark-document.pdf");

PossibleWatermarkCollection watermarks = watermarker.search(new TextSearchCriteria(Pattern.compile("someurl.com")));
for (int i = 0 ; i < watermarks.getCount(); i++)
{
    if (HyperlinkPossibleWatermark.class.isInstance(watermarks.get_Item(i)))
    {
        System.out.println(watermarks.get_Item(i).getText());
        watermarks.removeAt(i);
    }
}
watermarker.save("path/no-hyperlink-watermarks.pdf");
```

## Supprimer le filigrane du PDF avec un formatage de texte particulier en Java

Le filigrane ayant le formatage de texte spécifique peut également être supprimé. Vous pouvez fournir le nom de la police, sa taille, sa couleur, etc. comme critère de recherche. L'API trouvera les filigranes ayant des propriétés correspondantes. Les étapes suivantes montrent comment rechercher et supprimer des filigranes dans un fichier PDF ayant un formatage de texte spécifique en Java.

- Chargez le fichier PDF à l'aide de [Filigrane][6].
- Définissez le critère de recherche à l'aide de [TextFormattingSearchCriteria][8].
- Fournissez toutes les propriétés de formatage requises.
- Rechercher et obtenir tous les [filigranes possibles][7] en tant que collection en fournissant les critères définis.
- Supprimez tous les filigranes recherchés à l'aide de la méthode **clear()**.
- Enregistrez le PDF mis à jour sans filigrane avec les propriétés définies.

Le code Java suivant supprime les filigranes dans un document PDF ayant le formatage de texte spécifié.

```
// Supprimer les filigranes avec un formatage de texte spécifique d'un PDF en Java
Watermarker watermarker = new Watermarker("path/watermarks.pdf");

TextFormattingSearchCriteria criteria = new TextFormattingSearchCriteria();
criteria.setForegroundColorRange(new ColorRange());
criteria.getForegroundColorRange().setMinHue(-5);
criteria.getForegroundColorRange().setMaxHue(10);
criteria.getForegroundColorRange().setMinBrightness(0.01f);
criteria.getForegroundColorRange().setMaxBrightness(0.99f);
criteria.setBackgroundColorRange(new ColorRange());
criteria.getBackgroundColorRange().setEmpty(true);
criteria.setFontName("Arial");
criteria.setMinFontSize(19);
criteria.setMaxFontSize(42);
criteria.setFontBold(true);

PossibleWatermarkCollection watermarks = watermarker.search(criteria);
watermarks.clear();
watermarker.save("path/removed-watermarks.pdf");
watermarker.close();
```

## Conclusion
Pour résumer, nous avons appris comment supprimer différents filigranes des documents PDF en Java. Nous avons spécifiquement supprimé tous les filigranes appliqués, puis supprimé les filigranes de liens hypertexte et les filigranes avec un formatage de texte spécifique. Essayez de créer votre propre application Java pour rechercher et supprimer les filigranes des documents PDF. En outre, vous pouvez en savoir plus sur [GroupDocs.Watermark pour Java][3] à partir de sa [documentation][9]. Pour toute question, contactez-nous via le [forum][10].

## Voir également

- [Documents protégés par mot de passe en filigrane en Java][11]
- [Feuilles Excel en filigrane en Java][12]
- [Ajouter un filigrane aux fichiers PDF en Java][13]
- [Diapositives de présentation en filigrane utilisant Java][14]
- [Rechercher et supprimer des filigranes de documents en Java][15]

[1]: https://products.groupdocs.com/watermark
[2]: https://docs.groupdocs.com/conversion/java/supported-document-formats/
[3]: https://products.groupdocs.com/watermark/java/
[4]: https://downloads.groupdocs.com/watermark
[5]: https://repository.groupdocs.com/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs
[6]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker
[7]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/PossibleWatermarkCollection
[8]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/TextFormattingSearchCriteria
[9]: https://docs.groupdocs.com/watermark/java/
[10]: https://forum.groupdocs.com/
[11]: https://blog.groupdocs.com/2021/11/26/watermark-password-protected-documents-in-java/
[12]: https://blog.groupdocs.com/2021/11/10/watermark-excel-sheets-in-java/
[13]: https://blog.groupdocs.com/2021/06/26/add-watermark-to-pdf-in-java/
[14]: https://blog.groupdocs.com/2021/06/09/watermark-presentation-slides-using-java/
[15]: https://blog.groupdocs.com/2020/11/30/find-and-remove-watermarks-from-documents-in-java/
