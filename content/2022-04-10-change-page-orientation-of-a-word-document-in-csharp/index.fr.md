---
title: "Modifier l'orientation de la page d'un document Word en C #"
date: Sun, 10 Apr 2022 14:14:00 +0000
draft: false
url: /fr/2022/04/10/change-page-orientation-of-a-word-document-in-csharp/
author: 'Shoaib Khan'
summary: "Chaque page du document peut contenir des mises en page différentes. Cela dépend du contenu de la page ; celle dont l'orientation lui convient. En tant que développeur, nous pouvons changer l'orientation de chaque page pour celle qui lui convient. Dans cet article, nous allons apprendre à **modifier l'orientation d'une page dans un document Word à l'aide de C#**. Séparément, nous verrons comment changer la mise en page portrait en paysage puis comment changer l'orientation paysage en portrait avec les applications .NET."
tags: ['change orientation', 'change page orientation in CSharp', 'how to change the orientation of one page in word', 'how to make one page landscape in word', 'landscape to portrait', 'page orientation', 'portrait to landscape in CSharp']
categories: ['GroupDocs.Merger Product Family']
---

Chaque page du document peut contenir des mises en page différentes. Cela dépend du contenu de la page ; celle dont l'orientation lui convient. En tant que développeur, nous pouvons changer l'orientation de chaque page pour celle qui lui convient. Dans cet article, nous allons apprendre à **modifier l'orientation d'une page dans un document Word à l'aide de C#**. Séparément, nous verrons comment changer la mise en page portrait en paysage puis comment changer l'orientation paysage en portrait avec les applications .NET.

{{< figure align=center src="images/change-page-orientation-in-csharp.jpg" alt="Modifier l'orientation de la page de DOC/DOCX à l'aide de C#">}}

## API .NET pour modifier l'orientation de la page Word
**GroupDocs.Merger** présente l'API .NET qui permet de modifier l'orientation des pages de document Word. De plus, l'API permet de déplacer des pages, de supprimer des pages, de diviser des documents, d'extraire et de faire pivoter des pages de document dans les applications .NET. Nous utiliserons ce [GroupDocs.Merger pour .NET][1] pour modifier l'orientation de la page des fichiers DOC/DOCX à l'aide de C#. Pour les détails et autres fonctionnalités de l'API, vous pouvez consulter la [documentation][2].

Vous pouvez télécharger le programme d'installation **DLLs** ou **MSI** à partir de la [section téléchargements][3] ou installer l'API dans votre application .NET via [NuGet][4].

```
PM> Install-Package GroupDocs.Merger
```

## Changer l'orientation d'une page Word en paysage à l'aide de C#

Commençons par un moyen simple de créer par programme un paysage de page dans un document Word. Les étapes suivantes permettent de changer l'orientation de la page d'un document Word en paysage à l'aide de C# :

- Chargez le document Word à l'aide de [Fusionner][5].
- Préparez les [options d'orientation][6] et réglez le [mode][7] sur paysage.
- Modifiez l'orientation à l'aide de [ChangeOrientation()][8].
- Enregistrez le document mis à jour en utilisant [Save()][9] approprié.

Le code C# suivant modifie l'orientation portrait de certaines pages d'un document Word en paysage.

```
// Comment changer l'orientation de la page d'un document Word en paysage à l'aide de C # 
using (Merger merger = new Merger("path/document.docx"))
{
    OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Landscape, new int[] { 1, 2 });
    merger.ChangeOrientation(orientationOptions);
    merger.Save("path/orientation-landscape-document.docx");
}
```

## Changer l'orientation d'une page Word en portrait à l'aide de C#

De même, vous pouvez créer n'importe quel ensemble de pages du document Word en orientation portrait. Les étapes suivantes permettent de changer l'orientation d'une page de document Word en portrait à l'aide de C# :

- Chargez le document Word à l'aide de [Fusionner][5].
- Préparez les [options d'orientation][6] et réglez le [mode][7] sur portrait.
- Utilisez la méthode [ChangeOrientation()][8] pour changer l'orientation.
- Utilisez la méthode [Save()][9] appropriée pour enregistrer le document mis à jour.

Le code C# suivant change l'orientation portrait de certaines pages d'un document Word en portrait.

```
// Comment changer l'orientation de la page d'un document Word en Portrait à l'aide de C #  
using (Merger merger = new Merger("path/document.docx"))
{
    OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Portrait, new int[] { 3, 4 });   
    merger.ChangeOrientation(orientationOptions);
    merger.Save("path/orientation-portrait-document.docx");
}
```

## Obtenez une licence API gratuite
Vous pouvez [obtenir une licence temporaire gratuite][10] afin d'utiliser l'API sans les limitations d'évaluation.

## Conclusion
Pour conclure, nous avons appris à modifier l'orientation des pages des documents Word à l'aide de C# dans les applications .NET. Nous avons vu l'exemple de code source qui a changé l'orientation portrait des pages sélectionnées d'un fichier DOCX en paysage. De même, nous avons changé l'orientation paysage des pages sélectionnées en portrait en utilisant l'exemple C#. Vous pouvez essayer de créer votre propre application qui peut basculer l'orientation des pages Word en ligne.

Pour plus de détails sur l'API, consultez la documentation. Pour toute question, contactez-nous via le [forum][11].

## Voir également
- [Réorganiser les pages dans Word à l'aide de C #][12]
- [Ajouter et supprimer la protection par mot de passe des documents Word à l'aide de C#][13]
- [Comparer des documents Word][14]
- [Modifier des documents Word][15]
- [Ajouter ou supprimer des annotations ou des fichiers Word de balisage][16]

[1]: https://products.groupdocs.com/merger/net/
[2]: https://docs.groupdocs.com/merger/
[3]: https://downloads.groupdocs.com/merger
[4]: https://www.nuget.org/packages/groupdocs.merger
[5]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger
[6]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/orientationoptions
[7]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/orientationmode
[8]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/changeorientation
[9]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/save/index
[10]: https://purchase.groupdocs.com/temporary-license
[11]: https://forum.groupdocs.com/
[12]: https://blog.groupdocs.com/2022/02/05/move-word-pages-using-csharp/
[13]: https://blog.groupdocs.com/2021/11/27/password-protect-word-documents-using-csharp/
[14]: https://blog.groupdocs.com/2021/12/01/compare-word-documents-using-csharp/
[15]: https://blog.groupdocs.com/2021/03/26/edit-word-documents-in-csharp/
[16]: https://blog.groupdocs.com/2021/06/23/annotate-word-documents-using-csharp/
