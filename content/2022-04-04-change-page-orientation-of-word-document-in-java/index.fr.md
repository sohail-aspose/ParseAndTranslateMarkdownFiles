---
title: "Modifier l'orientation de la page d'un document Word en Java"
date: Mon, 04 Apr 2022 14:14:00 +0000
draft: false
url: /fr/2022/04/04/change-page-orientation-of-word-document-in-java/
author: 'Shoaib Khan'
summary: "L'orientation de la page dépend de la disposition du contenu de la page. En tant que développeur, nous pouvons modifier par programme l'orientation de chaque page en celle qui lui convient. Dans cet article, nous allons apprendre à **changer l'orientation d'une page dans un document Word en Java**. Séparément, nous verrons comment changer l'orientation paysage en portrait puis comment changer l'orientation portrait en paysage avec les applications Java."
tags: ['change orientation', 'change page orientation in Java', 'how to change the orientation of one page in word', 'how to make one page landscape in word', 'landscape to portrait', 'portrait to landscape in java']
categories: ['GroupDocs.Merger Product Family']
---

L'orientation de la page dépend de la disposition du contenu de la page. En tant que développeur, nous pouvons modifier par programme l'orientation de chaque page en celle qui lui convient. Dans cet article, nous allons apprendre à **changer l'orientation d'une page dans un document Word en Java**. Séparément, nous verrons comment changer l'orientation paysage en portrait puis comment changer l'orientation portrait en paysage avec les applications Java.

{{< figure align=center src="images/change-page-orientation-in-java.jpg" alt="Changer l'orientation de la page de DOC/DOCX en Java">}}

## API Java pour changer l'orientation de la page Word

[GroupDocs.Merger pour Java][1] est l'API permettant de gérer les pages de document dans les applications Java. Il permet de changer l'orientation des pages de document Word et de nombreux autres formats de document pris en charge. Nous l'utiliserons pour changer l'orientation des pages des fichiers DOC/DOCX. Pour les détails et autres fonctionnalités de l'API, vous pouvez consulter la documentation.

### Télécharger et configurer

Obtenez la bibliothèque à partir de la section des téléchargements. Pour votre application Java basée sur Maven, ajoutez simplement la configuration pom.xml suivante. Après cela, vous pouvez essayer les exemples de cet article ainsi que les nombreux autres exemples disponibles sur GitHub. Pour plus de détails, vous pouvez visiter la référence API.

```
<repository>
	<id>GroupDocsJavaAPI</id>
	<name>GroupDocs Java API</name>
	<url>http://repository.groupdocs.com/repo/</url>
</repository>
<dependency>
        <groupId>com.groupdocs</groupId>
        <artifactId>groupdocs-merger</artifactId>
        <version>22.2</version> 
</dependency>
```
## Changer l'orientation d'une page Word en paysage en Java

Commencez par créer par programmation un paysage de page dans un document Word. Les étapes suivantes permettent de changer l'orientation de la page d'un document Word DOC/DOCX en paysage en Java :

- Préparez l'[option d'orientation][8] et réglez-la en mode paysage.
- Chargez le document Word à l'aide de [Fusionner][7].
- Modifiez l'orientation à l'aide de la méthode **changeOrientation()**.
- Enregistrez le document mis à jour en utilisant la méthode **save()** appropriée.

Le code Java suivant change l'orientation portrait de certaines pages d'un document Word en paysage.

```
// Comment changer l'orientation de la page d'un document Word en Paysage en Java
OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Landscape, new int[] { 1, 2 });
Merger merger = new Merger("path/document.docx");
merger.changeOrientation(orientationOptions);
merger.save("path/orientation-landscape-document.docx");
```

## Changer l'orientation d'une page Word en portrait en Java
De même, vous pouvez définir n'importe quel ensemble de pages du document Word en orientation portrait. Les étapes suivantes permettent de changer l'orientation d'une page de document Word en portrait en Java :

- Chargez le document Word à l'aide de [Fusionner][7].
- Préparez l'[option d'orientation][8] et réglez le mode sur portrait.
- Utilisez la méthode **changeOrientation()** pour modifier l'orientation.
- Utilisez la méthode **appropriate save()** pour enregistrer le document mis à jour.

Le code Java suivant change l'orientation portrait de certaines pages d'un document Word en portrait.

```
// Comment changer l'orientation de la page d'un document Word en Portrait en Java
OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Prtrait, new int[] { 3, 4 });
Merger merger = new Merger("path/document.docx");
merger.changeOrientation(orientationOptions);
merger.save("path/orientation-landscape-document.docx");
```

## Obtenez une licence API gratuite
Vous pouvez [obtenir une licence temporaire gratuite][9] afin d'utiliser l'API sans les limitations d'évaluation.

## Conclusion
Pour conclure, nous avons appris à modifier l'orientation des pages des documents Word dans les applications Java. Nous avons discuté de l'extrait de code qui a changé l'orientation paysage des pages sélectionnées d'un fichier DOCX en portrait. De même, nous avons changé l'orientation portrait des pages sélectionnées en paysage en utilisant l'exemple de code Java. Commencez à créer votre propre application qui peut basculer l'orientation des pages Word.

Pour plus de détails sur l'API, consultez la [documentation][3a]. Pour toute question, contactez-nous via le [forum][10].

## Voir également
- [Annoter des fichiers Word en Java][11]
- [Modifier des documents Word en Java][12]
- [Réorganiser les pages dans Word à l'aide de Java][13]
- [Rendre les documents Word en HTML minifié en Java][14]

[1]: https://products.groupdocs.com/merger/java/
[2]: https://downloads.groupdocs.com/merger
[3]: https://docs.groupdocs.com/merger/
[3a] : https://docs.groupdocs.com/merger/java/
[4]: https://docs.groupdocs.com/merger/java/supported-document-formats/
[5]: https://github.com/groupdocs-merger
[6]: https://apireference.groupdocs.com/merger/java
[7]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger
[8]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/OrientationOptions
[9]: https://purchase.groupdocs.com/temporary-license
[10]: https://forum.groupdocs.com/
[11]: https://blog.groupdocs.com/2022/03/19/annotate-word-documents-in-java/
[12]: https://blog.groupdocs.com/2022/03/30/edit-word-documents-in-java/
[13]: https://blog.groupdocs.com/2022/03/01/move-word-pages-using-java/
[14]: https://blog.groupdocs.com/2022/03/04/render-word-documents-as-minified-html-in-java/
