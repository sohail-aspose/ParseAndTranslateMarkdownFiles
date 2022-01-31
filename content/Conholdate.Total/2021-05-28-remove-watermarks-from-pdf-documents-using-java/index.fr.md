---
title: Remove Watermarks from PDF Documents using Java
author: Muzammil Khan
date: 2021-05-28T09:39:06+00:00
summary: "Vous pouvez facilement supprimer les filigranes des documents par programmation. Dans cet article, vous apprendrez <strong>à supprimer les filigranes des documents PDF à l'aide de Java</strong> ."
url: /2021/05/28/remove-watermarks-from-pdf-documents-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Supprimer les filigranes de texte à l'aide de Java"
  - "supprimer filigrane"
  - "Supprimer les filigranes du PDF"
  - "Supprimer les filigranes à l'aide de Java"

---


{{< figure align=center src="images/Remove-Watermarks-from-PDF-Documents-using-Java.jpg" alt="Supprimer les filigranes des documents PDF à l'aide de Java">}}
 

L'image ou le texte du filigrane est utilisé pour identifier l'auteur du document ou les informations de copyright. Vous pouvez détecter tous les filigranes disponibles dans un document, puis les supprimer. En tant que développeur Java, vous pouvez facilement supprimer les filigranes des documents par programmation. Dans cet article, vous apprendrez **comment supprimer les filigranes des documents PDF à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour la suppression des filigranes][2]
  * [Supprimer tous les filigranes du PDF à l'aide de Java][3]
  * [Suppression des filigranes de texte uniquement à partir de PDF à l'aide de Java][4]
  * [Supprimer les filigranes avec un formatage de texte particulier][5]
  * [Suppression des filigranes d'image uniquement à partir de PDF à l'aide de Java][6]

## API Java pour la suppression des filigranes {#api-for-extracting-text}

J'utiliserai l'API [GroupDocs.Watermark for Java][7] pour supprimer les filigranes des documents [PDF][8]. Il permet d'effectuer des opérations de tatouage d'image et de texte. Il vous permet également d'appliquer de nouveaux filigranes, de rechercher et de supprimer des filigranes existants dans des fichiers de formats pris en charge tels que Word, Excel, Powerpoint et PDF.
Vous pouvez [télécharger][9] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans vos applications Java basées sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-filigrane</artifactId><version>20.5</version></dépendance></pre>
## Supprimer tous les filigranes du PDF à l'aide de Java {#Remove-All-Watermarks-from-PDF-using-Java}

Vous pouvez facilement supprimer tous les filigranes de vos documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de _[Watermarker][10]_ classe
  * Spécifiez le chemin d'accès au fichier PDF d'entrée
  * Remplir _[PossibleWatermarkCollection][11]_ en appelant la _[search()][12] _method
  * Appelez la méthode [clear()][13] pour supprimer tous les filigranes
  * Enregistrer le fichier mis à jour

L'exemple de code suivant montre comment supprimer tous les filigranes disponibles dans un document PDF à l'aide de Java.
```
// Créer une instance
Watermarker watermarker = new Watermarker("C:\\Files\\sample.pdf");

// Rechercher tous les filigranes possibles
PossibleWatermarkCollection possibleWatermarks = watermarker.search();

// Supprimer tous les filigranes trouvés
possibleWatermarks.clear();

// Enregistrer le fichier mis à jour
watermarker.save("C:\\Files\\output.pdf");

watermarker.close();
```

{{< figure align=center src="images/Remove-All-Watermarks-from-PDF-using-Java-1024x602.jpg" alt="Supprimer tous les filigranes du PDF à l'aide de Java" caption="Supprimer tous les filigranes du PDF à l'aide de Java">}}
 

La classe [Watermarker][10] facilite l'ajout, la suppression et la recherche de filigranes dans un document.
La classe _[PossibleWatermarkCollection][11]_ représente une collection de filigranes possibles trouvés dans un contenu.
La méthode [search()][12] de la classe Watermarker recherche tous les filigranes possibles dans le document. Il renvoie le jeu de résultats en tant que PossibleWatermarkCollection.
## Suppression des filigranes de texte uniquement à partir de PDF à l'aide de Java {#Text-Only-Watermarks-Removal-from-PDF-using-Java}

Vous pouvez facilement supprimer tous les filigranes textuels de vos documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de _[Watermarker][10]_ classe
  * Spécifiez le chemin d'accès au fichier PDF d'entrée
  * Remplir _[PossibleWatermarkCollection][11]_ en appelant la _[search()][12] _method
  * Vérifiez si getText() n'est pas nul ou vide pour tous les PossibleWatermarks
  * Passez ensuite l'index à la méthode [_removeAt()_][15] pour le supprimer
  * Enregistrer le fichier mis à jour

L'exemple de code suivant montre comment supprimer uniquement les filigranes de texte disponibles dans un document PDF à l'aide de Java.
```
// Créer une instance
Watermarker watermarker = new Watermarker("C:\\Files\\sample.pdf");

// Rechercher tous les filigranes possibles
PossibleWatermarkCollection possibleWatermarks = watermarker.search();

// Supprimer tous les filigranes trouvés
for (int i = possibleWatermarks.getCount() - 1; i >= 0; i--)
{
  if(possibleWatermarks.get_Item(i).getText() != null && possibleWatermarks.get_Item(i).getText() != "")
  {
    possibleWatermarks.removeAt(i);
  }
}

// Enregistrer le document mis à jour
watermarker.save("C:\\Files\\output.pdf");

watermarker.close();
```

{{< figure align=center src="images/Text-Only-Watermarks-Removal-from-PDF-using-Java-1024x591.jpg" alt="Suppression des filigranes de texte uniquement à partir de PDF à l'aide de Java" caption="Suppression des filigranes de texte uniquement à partir de PDF à l'aide de Java">}}
 

La méthode [_removeAt()_][15] supprime l'élément à l'index spécifié de PossibleWatermarksCollection.
## Supprimer les filigranes avec un formatage de texte particulier {#Remove-Watermark-with-Particular-Text-Formatting}

Vous pouvez supprimer les filigranes de texte disponibles avec une mise en forme particulière de vos documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de _[Watermarker][10]_ classe
  * Spécifiez le chemin d'accès au fichier PDF d'entrée
  * Définissez les _[TextFormattingSearchCriteria][17]_
  * Remplir _[PossibleWatermarkCollection][11]_ en appelant la _[search()][12] _method
  * Appelez la méthode [clear()][13] pour supprimer tous les filigranes trouvés
  * Enregistrer le fichier mis à jour

L'exemple de code suivant montre comment supprimer les filigranes de texte avec une mise en forme de texte particulière d'un document PDF à l'aide de Java.
```
// Créer une instance
Watermarker watermarker = new Watermarker("C:\\Files\\sample.pdf");

// Définir les critères de recherche de mise en forme du texte
TextFormattingSearchCriteria criteria = new TextFormattingSearchCriteria();
criteria.setFontName("Arial");
criteria.setMinFontSize(19);
criteria.setMaxFontSize(42);
criteria.setFontBold(false);

// Rechercher des filigranes possibles
PossibleWatermarkCollection watermarks = watermarker.search(criteria);
watermarks.clear();

// Enregistrer le document mis à jour
watermarker.save("C:\\Files\\output.pdf");

watermarker.close();
```

{{< figure align=center src="images/Remove-Watermarks-with-Particular-Text-Formatting-1024x599.jpg" alt="Supprimer les filigranes avec un formatage de texte particulier" caption="Supprimer les filigranes avec un formatage de texte particulier">}}
 

## Suppression des filigranes d'image uniquement à partir de PDF à l'aide de Java {#Image-Only-Watermarks-Removal-from-PDF-using-Java}

Vous pouvez facilement supprimer tous les filigranes d'image uniquement de vos documents PDF en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de _[Watermarker][10]_ classe
  * Spécifiez le chemin d'accès au fichier PDF d'entrée
  * Remplir _[PossibleWatermarkCollection][11]_ en appelant la _[search()][12] _method
  * Vérifiez si getImageData() n'est pas nul pour tous les PossibleWatermarks
  * Passez ensuite l'index à la méthode [_removeAt(_)][15] pour le supprimer
  * Enregistrer le fichier mis à jour

L'exemple de code suivant montre comment supprimer uniquement les filigranes d'image disponibles dans un document PDF à l'aide de Java.
```
// Créer une instance
Watermarker watermarker = new Watermarker("C:\\Files\\sample.pdf");

// Rechercher tous les filigranes possibles
PossibleWatermarkCollection possibleWatermarks = watermarker.search();

// Supprimer tous les filigranes d'image
for (int i = possibleWatermarks.getCount() - 1; i >= 0; i--)
{
  if(possibleWatermarks.get_Item(i).getImageData() != null)
  {
    possibleWatermarks.removeAt(i);
  }
}

// Enregistrer le document mis à jour
watermarker.save("C:\\Files\\output.pdf");

watermarker.close();
```

{{< figure align=center src="images/Image-Only-Watermarks-Removal-from-PDF-using-Java-1024x599.jpg" alt="Suppression des filigranes d'image uniquement à partir de PDF à l'aide de Java" caption="Suppression des filigranes d'image uniquement à partir de PDF à l'aide de Java">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][20].
## Conclusion

Dans cet article, vous avez appris **comment supprimer les filigranes de texte ou d'image d'un document PDF à l'aide de Java**. De plus, vous avez appris à supprimer les filigranes de texte ou d'image uniquement des documents. Vous pouvez en savoir plus sur l'API GroupDocs.Watermark pour Java en utilisant la [documentation][21]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][22].
## See Also

  * [Rechercher et supprimer des filigranes de documents en Java][23]
  * [Rechercher et remplacer des filigranes dans des documents à l'aide de l'API REST][24]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove-Watermarks-from-PDF-Documents-using-Java.jpg
 [2]: https://blog.conholdate.com/2021/05/21/extract-text-from-doc-or-docx-using-csharp/#api-for-extracting-text
 [3]: #Remove-All-Watermarks-from-PDF-using-Java
 [4]: #Text-Only-Watermarks-Removal-from-PDF-using-Java
 [5]: #Remove-Watermark-with-Particular-Text-Formatting
 [6]: #Image-Only-Watermarks-Removal-from-PDF-using-Java
 [7]: https://products.groupdocs.com/watermark/java
 [8]: https://docs.fileformat.com/pdf/
 [9]: https://downloads.groupdocs.com/watermark/java
 [10]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker
 [11]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/PossibleWatermarkCollection
 [12]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark/Watermarker#search()
 [13]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.common/RemoveOnlyListBase#clear()
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove-All-Watermarks-from-PDF-using-Java.jpg
 [15]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.common/RemoveOnlyListBase#removeAt(int)
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Text-Only-Watermarks-Removal-from-PDF-using-Java.jpg
 [17]: https://apireference.groupdocs.com/watermark/java/com.groupdocs.watermark.search/TextFormattingSearchCriteria
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove-Watermarks-with-Particular-Text-Formatting.jpg
 [19]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Image-Only-Watermarks-Removal-from-PDF-using-Java.jpg
 [20]: https://purchase.groupdocs.com/temporary-license
 [21]: https://docs.groupdocs.com/watermark/java/
 [22]: https://forum.groupdocs.com/c/watermark/
 [23]: https://blog.groupdocs.com/2020/11/30/find-and-remove-watermarks-from-documents-in-java/
 [24]: https://blog.groupdocs.cloud/2021/02/09/find-and-replace-watermark-using-rest-api/





