---
title: "Ajouter ou supprimer des métadonnées XMP personnalisées de GIF à l'aide de C #"
author: Muzammil Khan
date: 2021-05-05T10:37:17+00:00
summary: "Vous pouvez ajouter un package de métadonnées XMP personnalisé à vos images par programmation. Dans cet article, vous apprendrez <strong>comment ajouter ou supprimer des métadonnées XMP personnalisées de GIF à l'aide de C#</strong> ."
url: /2021/05/05/add-or-remove-custom-xmp-metadata-from-gif-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Ajouter des métadonnées XMP personnalisées CSharp"
  - "Métadonnées XMP personnalisées en GIF"
  - "Lire les métadonnées XMP personnalisées CSharp"
  - "Supprimer les métadonnées XMP personnalisées CSharp"

---


{{< figure align=center src="images/GIF-SMP.png" alt="Ajouter ou supprimer des métadonnées XMP personnalisées de GIF à l'aide de C#">}}
 

Les métadonnées XMP (Extensible Metadata Platform) sont codées sous forme de texte au format XML. Le modèle de données XMP défini peut être utilisé pour stocker n'importe quel ensemble de propriétés de métadonnées sous la forme d'une paire nom/valeur. Vous pouvez ajouter un package de métadonnées XMP personnalisé à vos images par programmation. Dans cet article, vous apprendrez **comment ajouter ou supprimer des métadonnées XMP personnalisées de GIF à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour ajouter ou supprimer des métadonnées XMP][2]
  * [Ajouter un package de métadonnées XMP personnalisé au GIF à l'aide de C #][3]
  * [Lire les propriétés du package de métadonnées XMP personnalisées à l'aide de C#][4]
  * [Supprimer le package de métadonnées XMP personnalisé à l'aide de C #][5]

## API C# pour ajouter ou supprimer des métadonnées XMP {#api-for-XMP-metadata}

J'utiliserai l'API [GroupDocs.Metadata for .NET][6] pour ajouter ou supprimer un package de métadonnées XMP personnalisé. Il vous permet d'ajouter, de modifier, de récupérer et de supprimer des propriétés de métadonnées à partir de documents et de formats de fichiers image. L'API fonctionne avec les normes de métadonnées les plus notables telles que les propriétés de métadonnées intégrées, XMP, EXIF, IPTC, Image Resource Blocks, ID3 et personnalisées. Il peut être utilisé pour développer des applications dans n'importe quel environnement de développement qui cible la plate-forme .NET.
Vous pouvez soit [télécharger][7] la DLL de l'API, soit l'installer à l'aide de [NuGet][8].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Metadata</code></pre>## Ajouter un package de métadonnées XMP personnalisé au GIF à l'aide de C # {#Add-Custom-XMP-Package}

Vous pouvez facilement créer et ajouter un package XMP entièrement personnalisé contenant des propriétés définies par l'utilisateur en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe _[Metadata][9]_
  * Indiquez le chemin de l'image GIF
  * [GetRootPackage][10] as [IXmp][11] standard
  * Créer une instance de la classe [XmpPackage][12]
  * Fournissez le préfixe du package et l'URI de l'espace de nom
  * Définissez les propriétés dans la paire nom/valeur à l'aide de la méthode [Set][13]
  * Créer une instance de la classe [XmpPacketWrapper][14]
  * Appelez la méthode [AddPackage][15] et transmettez le XmpPackage créé
  * Attribuez XmpPacketWrapper créé à IXMp.[XmpPackage][16]
  * Enregistrez le fichier de sortie à l'aide de la méthode [Metadata.Save][17]

L'exemple de code suivant montre comment créer et ajouter un package de métadonnées XMP personnalisé à une image GIF à l'aide de C#.
```
using (Metadata metadata = new Metadata(@"C:\Files\xmp.gif")) {

  IXmp root = (IXmp)metadata.GetRootPackage();
  XmpPacketWrapper packet = new XmpPacketWrapper();

  XmpPackage custom = new XmpPackage("gd", "https://groupdocs.com");
  custom.Set("gd:Copyright", "Copyright (C) 2021 GroupDocs. All Rights Reserved.");
  custom.Set("gd:CreationDate", DateTime.Now.ToString());
  custom.Set("gd:Company", XmpArray.From(new String[] { "Aspose", "GroupDocs" }, XmpArrayType.Ordered));

  packet.AddPackage(custom);
  root.XmpPackage = packet;
  metadata.Save(@"C:\Files\xmp_output.gif");
}
```

L'exemple de code ci-dessus doit ajouter le package de métadonnées XMP à l'image d'entrée.<mark> L'ExifTool lit les métadonnées suivantes à partir de l'image GIF de sortie générée.</mark>
{{< figure align=center src="images/Add_XMP_Metadata_csharp-1024x594.jpg" alt="Ajouter le package de métadonnées XMP au GIF à l'aide de C#" caption="Ajouter le package de métadonnées XMP au GIF à l'aide de C #">}}
 

L'interface [IXMP][11] expose la propriété [XmpPackage][19]{.broken_link} pour obtenir ou définir le package de métadonnées XMP.
La classe Metadata fournit la méthode [GetRootPackage][10] pour obtenir le package racine qui donne accès à toutes les propriétés de métadonnées extraites du fichier.
La classe [XmpPackage][12] fournit diverses propriétés pour définir le package, telles que [Prefix][20], [NamespaceUri][21] et [Keys][22]. Cette classe fournit également des méthodes [Set][13] pour définir le nom/la valeur des propriétés de métadonnées définies par l'utilisateur.
La classe [XmpPacketWrapper][14] contient un package XMP sérialisé. La méthode [AddPackage][15] de cette classe permet d'ajouter le package personnalisé défini.
Vous pouvez trouver plus de détails sur "[Travailler avec les métadonnées XMP][23]" dans la documentation.
## Lire les propriétés de métadonnées de package XMP personnalisées à l'aide de C # {#Read-Custom-XMP-Package}

Vous pouvez facilement lire toutes les propriétés définies par l'utilisateur du package XMP personnalisé en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe _[Metadata][9]_
  * Indiquez le chemin de l'image GIF
  * [GetRootPackage][10] as [IXmp][11] standard
  * Obtenez tous les packages un par un depuis [IXmp.XmpPackage.Packages][24]
  * Obtenez NamespaceUri et Prefix pour chaque package
  * Appelez [FindProperties][25] pour chaque clé de package pour obtenir le nom et la valeur de la propriété

L'exemple de code suivant montre comment lire toutes les propriétés définies dans le package XMP personnalisé à l'aide de C#.
```
string file = @"C:\Files\xmp_output.gif";
using (Metadata metadata = new Metadata(file)) 
{
  IXmp root = (IXmp)metadata.GetRootPackage();

  if (root.XmpPackage != null)
  {
    foreach (var package in root.XmpPackage.Packages)
    {
      Console.WriteLine(package.NamespaceUri);
      Console.WriteLine(package.Prefix);

      foreach(var keys in package.Keys)
      {
        var property = package.FindProperties(p => p.Name == keys).FirstOrDefault();
        Console.WriteLine(property.Name + " : " + property.Value);
      }
    }
  }
}
```

L'exemple de code ci-dessus doit produire la sortie suivante :
<pre class="wp-block-code"><code>https://groupdocs.comdieugd:Copyright : Copyright (C) 2021 GroupDocs. Tous les droits sont réservés.gd:CreationDate : 04/05/2021 02:26:17gd:Company : <rdf:Seq><rdf:li>Aspose</rdf:li><rdf:li>GroupDocs</rdf:li></rdf:Seq></code></pre>
La méthode [FindProperties][25] de la classe [XmpPackage][12] recherche et trouve de manière récursive les propriétés de métadonnées satisfaisant le prédicat spécifié.
## Supprimer le package XMP personnalisé à l'aide de C# {#Remove-Custom-XMP-Package}

Vous pouvez supprimer le package XMP des images GIF en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la classe _[Metadata][9]_
  * Indiquez le chemin de l'image GIF
  * [GetRootPackage][10] as [IXmp][11] standard
  * Définissez IXMp.[XmpPackage][16] sur null
  * Enregistrez le fichier de sortie à l'aide de la méthode [Metadata.Save][17]

L'exemple de code suivant montre comment supprimer le package de métadonnées XMP d'une image GIF à l'aide de C#.
```
using (Metadata metadata = new Metadata(@"C:\Files\xmp_output.gif"))
{
  IXmp root = (IXmp)metadata.GetRootPackage();
  root.XmpPackage = null;
  metadata.Save(@"C:\Files\xmp_output_Removed.gif");
}
```

L'exemple de code ci-dessus doit supprimer le package de métadonnées XMP de l'image d'entrée. L'ExifTool lit les métadonnées suivantes à partir de l'image GIF de sortie générée.
{{< figure align=center src="images/Remove_XMP_Metadata_csharp-1024x488.jpg" alt="Supprimer le package de métadonnées XMP de GIF à l'aide de C#" caption="Supprimer le package de métadonnées XMP de GIF à l'aide de C #">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][27].
## Conclusion

Dans cet article, vous avez appris **comment ajouter** **ou supprimer des métadonnées de package XMP personnalisées à partir d'images GIF à l'aide de C#**. Vous avez également appris à lire les propriétés du package XMP à l'aide de C#. De plus, vous pouvez en savoir plus sur GroupDocs.Metadata pour l'API .NET à l'aide de la [documentation][28]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][29].
## See Also

  * [Extraire et manipuler les métadonnées des images à l'aide de C#][30]
  * [Gérer les données EXIF des images JPEG, PNG, TIFF et WebP en C#][31]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/GIF-SMP.png
 [2]: #api-for-XMP-metadata
 [3]: #Add-Custom-XMP-Package
 [4]: #Read-Custom-XMP-Package
 [5]: #Remove-Custom-XMP-Package
 [6]: https://products.groupdocs.com/metadata/net
 [7]: https://downloads.groupdocs.com/metadata/net
 [8]: https://www.nuget.org/packages/GroupDocs.Metadata
 [9]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata/metadata
 [10]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata/metadata/methods/getrootpackage
 [11]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/ixmp
 [12]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppackage
 [13]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp.xmppackage/set/methods/7
 [14]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppacketwrapper
 [15]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppacketwrapper/methods/addpackage
 [16]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/ixmp/properties/xmppackage
 [17]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.metadata/save/methods/2
 [18]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Add_XMP_Metadata_csharp.jpg
 [19]: http://XmpPackage
 [20]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppackage/properties/prefix
 [21]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppackage/properties/namespaceuri
 [22]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.common/metadatapackage/properties/keys
 [23]: https://docs.groupdocs.com/metadata/net/working-with-xmp-metadata/
 [24]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.standards.xmp/xmppacketwrapper/properties/packages
 [25]: https://apireference.groupdocs.com/metadata/net/groupdocs.metadata.common/metadatapackage/methods/findproperties
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/05/Remove_XMP_Metadata_csharp.jpg
 [27]: https://purchase.groupdocs.com/temporary-license
 [28]: https://docs.groupdocs.com/metadata/net/
 [29]: https://forum.groupdocs.com/c/metadata/
 [30]: https://blog.groupdocs.cloud/2021/04/20/extract-and-manipulate-metadata-of-images-using-csharp/
 [31]: https://blog.groupdocs.com/2020/05/13/manage-exif-data-in-csharp-net-for-jpeg-png-tiff-webp-images/





