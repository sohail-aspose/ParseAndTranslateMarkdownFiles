---
title: Add or Remove Custom XMP Metadata from GIF using Java
author: Muzammil Khan
date: 2021-10-21T04:53:36+00:00
summary: "En tant que développeur Java, vous pouvez facilement ajouter un package de métadonnées XMP personnalisé à vos images par programmation. Dans cet article, vous apprendrez <strong>à ajouter ou à supprimer des métadonnées XMP personnalisées de GIF à l'aide de Java</strong> ."
url: /2021/10/21/add-or-remove-custom-xmp-metadata-from-gif-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Ajouter des métadonnées XMP personnalisées"
  - "API de métadonnées pour Java"
  - "Lire les métadonnées XMP personnalisées"
  - "Supprimer les métadonnées XMP personnalisées"

---


{{< figure align=center src="images/add-or-remove-custom-xmp-metadata-from-gif-using-java.jpg" alt="Ajouter ou supprimer des métadonnées XMP personnalisées de GIF à l'aide de Java">}}
 

Le modèle de données XMP (Extensible Metadata Platform) peut être utilisé pour stocker n'importe quel ensemble de propriétés de métadonnées sous la forme d'une paire nom/valeur encodée sous forme de texte au format [XML][2]. En tant que développeur Java, vous pouvez facilement ajouter un package de métadonnées XMP personnalisé à vos images par programmation. Dans cet article, vous apprendrez **comment ajouter ou supprimer des métadonnées XMP personnalisées de GIF à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour ajouter ou supprimer des métadonnées XMP personnalisées][3]
  * [Ajouter un package de métadonnées XMP personnalisé au GIF à l'aide de Java][4]
  * [Lire les propriétés du package de métadonnées XMP personnalisées à l'aide de Java][5]
  * [Supprimer le package de métadonnées XMP personnalisé à l'aide de Java][6]

## API Java pour ajouter ou supprimer des métadonnées XMP personnalisées {#Java-API-to-Add-or-Remove-Custom-XMP-Metadata}

Pour ajouter ou supprimer le package de métadonnées personnalisé [XMP][7] des images [GIF][8], nous utiliserons l'API [GroupDocs.Metadata for Java][9]. Il vous permet d'ajouter, de modifier, de récupérer et de supprimer des propriétés de métadonnées des [formats de documents et de fichiers image pris en charge] [10]. L'API fonctionne avec les normes de métadonnées les plus notables telles que les propriétés de métadonnées intégrées, par exemple l'auteur, la date de création, les propriétés de métadonnées spécifiques au format, par exemple XMP, [EXIF][11], [IPTC][12], Image Resource Blocks, ID3 et propriétés de métadonnées personnalisées.
Vous pouvez [télécharger][13] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-metadata</artifactId><version>21.8</version></dépendance></pre>
## Ajouter un package de métadonnées XMP personnalisé au GIF à l'aide de Java {#Add-Custom-XMP-Metadata-Package-to-GIF-using-Java}

Vous pouvez créer et ajouter un package XMP entièrement personnalisé avec des propriétés définies par l'utilisateur en suivant les étapes simples ci-dessous :
  * Tout d'abord, chargez l'image GIF en utilisant la classe _[Metadata][14]_.
  * Ensuite, appelez le [Metadata.getRootPackage()][15] en tant que norme [IXmp][16] pour obtenir le package racine.
  * Créez une instance de la classe [XmpPackage][17] pour créer un nouveau package.
  * Maintenant, définissez diverses propriétés pour définir le package, telles que [Prefix][18] et [NamespaceUri][19].
  * Ensuite, appelez la méthode [Set()][20] pour définir les propriétés de métadonnées définies par l'utilisateur dans la paire Nom/Valeur.
  * Créez une instance de la classe [XmpPacketWrapper][21] qui contient le package XMP sérialisé.
  * Maintenant, appelez la méthode [XmpPacketWrapper.AddPackage()][22] pour ajouter le XmpPackage personnalisé créé.
  * Utilisez la méthode [IXmp.setXmpPackage()][23] pour définir le package de métadonnées XMP.
  * Enfin, enregistrez le fichier de sortie à l'aide de la méthode [Metadata.save()][24].

L'exemple de code suivant montre comment créer et ajouter un package de métadonnées XMP personnalisé à une image GIF à l'aide de Java.
```
// Cet exemple de code montre comment créer et ajouter un package de métadonnées XMP personnalisé à une image GIF.
// Créer une instance de la classe Metadata
Metadata metadata = new Metadata("C:\\Files\\xmp.gif");

// Obtenir des packages racine
IXmp root = (IXmp)metadata.getRootPackage();

// Créer un wrapper de paquets Xmp
XmpPacketWrapper packet = new XmpPacketWrapper();

// Définir un package personnalisé
XmpPackage custom = new XmpPackage("gd", "https://groupdocs.com");
custom.set("gd:Copyright", "Copyright (C) 2021 GroupDocs. All Rights Reserved.");
custom.set("gd:CreationDate", new Date().toString());
custom.set("gd:Company", XmpArray.from(new String[] { "Aspose", "GroupDocs" }, XmpArrayType.Ordered));

// Ajouter un package personnalisé à Xmp Packet Wrapper
packet.addPackage(custom);

// Mettre à jour XmpPackage
root.setXmpPackage(packet);

// Enregistrez le fichier
metadata.save("C:\\Files\\xmp_output.gif");
```

L'exemple de code ci-dessus doit ajouter le package de métadonnées XMP à l'image d'entrée. Veuillez trouver ci-dessous la sortie générée par [ExifTool][25].
{{< figure align=center src="images/Add-Custom-XMP-Metadata-Package-to-GIF-using-Java-1024x597.jpg" alt="Ajouter un package de métadonnées XMP personnalisé au GIF à l'aide de Java" caption="Ajouter un package de métadonnées XMP personnalisé au GIF à l'aide de Java">}}
 

## Lire les propriétés de métadonnées de package XMP personnalisées à l'aide de Java {#Read-Custom-XMP-Package-Metadata-Properties-using-Java}

Vous pouvez lire toutes les propriétés définies par l'utilisateur du package XMP personnalisé en suivant les étapes ci-dessous :
  * Tout d'abord, chargez l'image GIF en utilisant la classe _[Metadata][14]_.
  * Ensuite, appelez le [Metadata.getRootPackage()][15] en tant que norme [IXmp][16] pour obtenir le package racine. It provides access to all metadata properties extracted from the file.
  * Appelez la méthode [IXmp.getXmpPackage()][27] pour vérifier si [XmpPackage][17] existe.
  * Maintenant, obtenez le tableau de XmpPackage en appelant la méthode [IXmp.getXmpPackage().getPackages()][28]
  * Parcourez tous les packages et appelez les méthodes [XmpPackage.getNamespaceUri()][19] et [XmpPackage.getPrefix()][18] pour afficher l'URI de l'espace de noms du package et le préfixe de chaque package.
  * Parcourez toutes les clés renvoyées par la méthode [XmpPackage.getKeys()] [29] pour imprimer la valeur des métadonnées
  * Enfin, appelez la méthode [XmpPackage.findProperties()][30] pour chaque clé de package afin de rechercher et de trouver de manière récursive la propriété de métadonnées correspondant à la clé de package.

L'exemple de code suivant montre comment lire toutes les propriétés définies dans le package XMP personnalisé à l'aide de Java.
```
// Cet exemple de code montre comment lire toutes les propriétés définies dans le package XMP personnalisé
// Créer une instance de la classe Metadata
Metadata metadata = new Metadata("C:\\Files\\xmp_output.gif");

// Obtenir des packages racine
IXmp root = (IXmp)metadata.getRootPackage();
if (root.getXmpPackage() != null)
{
  // Get Xmp pakages
  XmpPackage[] packages = root.getXmpPackage().getPackages();
  
  // Show Package details
  for (XmpPackage pkg : packages )
  {
    System.out.println(pkg.getNamespaceUri());
    System.out.println(pkg.getPrefix());

    for(String keys : pkg.getKeys())
    {
      MetadataProperty property = pkg.findProperties(new WithNameSpecification(keys)).get_Item(0);
      System.out.println(property.getName() + " : " + property.getValue());
    }
  }
}
```

L'exemple de code ci-dessus doit produire la sortie suivante :
<pre class="wp-block-code"><code>https://groupdocs.comdieugd:Copyright : Copyright (C) 2021 GroupDocs. Tous les droits sont réservés.gd:CreationDate : Sam Oct 16 00:13:15 PKT 2021gd:Company : <rdf:Seq><rdf:li>Aspose</rdf:li><rdf:li>GroupDocs</rdf:li></rdf:Seq></pre>
## Supprimer le package XMP personnalisé à l'aide de Java {#Remove-Custom-XMP-Package-using-Java}

Vous pouvez supprimer le package XMP des images GIF en suivant les étapes ci-dessous :
  * Tout d'abord, chargez l'image GIF en utilisant la classe _[Metadata][14]_.
  * Ensuite, appelez le [Metadata.getRootPackage()][15] en tant que norme [IXmp][16] pour obtenir le package racine.
  * Maintenant, utilisez [IXmp.setXmpPackage()] [23] pour définir XmpPackege sur null
  * Enfin, enregistrez le fichier de sortie à l'aide de la méthode [Metadata.save()][24]

L'exemple de code suivant montre comment supprimer le package de métadonnées XMP d'une image GIF à l'aide de Java.
```
// Cet exemple de code montre comment supprimer le package de métadonnées XMP d'une image GIF.
// Créer une instance de la classe Metadata
Metadata metadata = new Metadata("C:\\Files\\xmp_output.gif");

// Obtenir des packages racine
IXmp root = (IXmp)metadata.getRootPackage();

// Définir le paquet sur null
root.setXmpPackage(null);

// Enregistrer l'image
metadata.save("C:\\Files\\xmp_output_Removed.gif");
```

L'exemple de code ci-dessus doit supprimer le package de métadonnées XMP de l'image d'entrée. L'ExifTool lit les métadonnées suivantes à partir de l'image GIF de sortie générée.
{{< figure align=center src="images/Remove-Custom-XMP-Package-using-Java-1024x595.jpg" alt="Supprimer le package XMP personnalisé à l'aide de Java." caption="Supprimer le package XMP personnalisé à l'aide de Java.">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][32].
## Conclusion

Dans cet article, vous avez appris ** comment ajouter des métadonnées de package XMP personnalisées aux images GIF à l'aide de Java **. De plus, vous avez vu **comment lire les propriétés d'un package XMP et les supprimer d'une image GIF** par programmation. Vous pouvez en savoir plus sur l'API GroupDocs.Metadata pour Java à l'aide de la [documentation][33]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][34].
## See Also

  * [Gérer les données XMP et EXIF des images HEIF HEIC en Java][35]
  * [Extraire les informations RIFF et les métadonnées des fichiers WAV en Java][36]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/add-or-remove-custom-xmp-metadata-from-gif-using-java.jpg
 [2]: https://docs.fileformat.com/web/xml/
 [3]: #Java-API-to-Add-or-Remove-Custom-XMP-Metadata
 [4]: #Add-Custom-XMP-Metadata-Package-to-GIF-using-Java
 [5]: #Read-Custom-XMP-Package-Metadata-Properties-using-Java
 [6]: #Remove-Custom-XMP-Package-using-Java
 [7]: https://en.wikipedia.org/wiki/Extensible_Metadata_Platform
 [8]: https://docs.fileformat.com/image/gif/
 [9]: https://products.groupdocs.com/metadata/java
 [10]: https://docs.groupdocs.com/metadata/java/supported-document-formats/
 [11]: https://docs.fileformat.com/image/exif/
 [12]: https://iptc.org/standards/photo-metadata/
 [13]: https://downloads.groupdocs.com/metadata/java
 [14]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata/Metadata
 [15]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata/Metadata#getRootPackage()
 [16]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/IXmp
 [17]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPackage
 [18]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPackage#getPrefix()
 [19]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPackage#getNamespaceUri()
 [20]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPackage#set(java.lang.String,%20java.lang.String)
 [21]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPacketWrapper
 [22]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPacketWrapper#addPackage(com.groupdocs.metadata.core.XmpPackage)
 [23]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/IXmp#setXmpPackage(com.groupdocs.metadata.core.XmpPacketWrapper)
 [24]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata/Metadata#save(java.lang.String)
 [25]: https://exiftool.org/
 [26]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Add-Custom-XMP-Metadata-Package-to-GIF-using-Java.jpg
 [27]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/IXmp#getXmpPackage()
 [28]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/XmpPacketWrapper#getPackages()
 [29]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata.core/MetadataPackage#getKeys()
 [30]: https://apireference.groupdocs.com/metadata/java/com.groupdocs.metadata/Metadata#findProperties(com.groupdocs.metadata.search.Specification)
 [31]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Remove-Custom-XMP-Package-using-Java.jpg
 [32]: https://purchase.groupdocs.com/temporary-license
 [33]: https://docs.groupdocs.com/metadata/java
 [34]: https://forum.groupdocs.com/c/metadata/
 [35]: https://blog.groupdocs.com/2021/05/10/xmp-and-exif-data-of-heif-heic-images-using-java/
 [36]: https://blog.groupdocs.com/2021/03/22/extract-riff-info-and-metadata-of-wav-files-in-java/





