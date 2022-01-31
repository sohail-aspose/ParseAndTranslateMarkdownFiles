---
title: Merge Word Documents using Java
author: Muzammil Khan
date: 2021-06-21T15:26:55+00:00
summary: "En tant que développeur Java, vous pouvez facilement fusionner deux ou plusieurs documents Word ou combiner des pages de différents fichiers Word dans vos applications Java. Dans cet article, vous apprendrez <strong>à fusionner des documents Word à l'aide de Java</strong> ."
url: /2021/06/21/merge-word-documents-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Combiner des fichiers Word à l'aide de Java"
  - "Fusionner des fichiers DOCX à l'aide de Java"
  - "Fusionner des documents Word à l'aide de Java"
  - "Fusionner Word en PDF"

---


{{< figure align=center src="images/Merge-Word-Documents-using-Java.jpg" alt="Fusionner des documents Word à l'aide de Java">}}
 

Vous pouvez fusionner par programme deux ou plusieurs documents Word en un seul document. En tant que développeur Java, vous pouvez facilement fusionner des documents Word dans vos applications Java. Dans cet article, vous apprendrez **comment fusionner des documents Word à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour fusionner des documents Word][2]
  * [Fusionner des documents Word à l'aide de Java][3]
  * [Combiner des pages spécifiques de documents Word à l'aide de Java][4]
  * [Fusionner et sécuriser avec un mot de passe en utilisant Java][5]
  * [Fusionner un document Word en PDF à l'aide de Java][6]

## API Java pour fusionner des documents Word {#API-for-Merging-Word-Documents}

Pour fusionner des fichiers [DOCX][7], j'utiliserai l'API [GroupDocs.Merger for Java][8]. Il vous permet de développer des applications hautes performances capables de combiner, d'extraire, de mélanger, de couper ou de supprimer des pages, des diapositives et des diagrammes lors de vos déplacements. d'autres manipulations facilement pour les formats de fichiers pris en charge tels que Word, Excel, PDF et PowerPoint.
Vous pouvez [télécharger][9] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans vos applications Java basées sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-merger</artifactId><version>20.11</version></dépendance></pre>
## Fusionner des documents Word à l'aide de Java {#Merge-Multiple-Word-Documents-using-Java}

Vous pouvez facilement fusionner deux ou plusieurs documents Word par programmation en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe **_[Merger][10]_**
  * Spécifiez le chemin d'accès au fichier DOCX d'entrée
  * Appelez la méthode **_[join()][11]_** et spécifiez le chemin d'accès au fichier DOCX cible
  * Répétez l'étape ci-dessus et ajoutez d'autres fichiers à fusionner
  * Appelez la méthode **_[save()][12]_** et enregistrez le fichier fusionné

L'exemple de code suivant montre comment fusionner plusieurs fichiers DOCX à l'aide de Java.
```
// Initialiser l'API
Merger merger = new Merger("C:\\Files\\sample.docx");

// Fusionner des fichiers
merger.join("C:\\Files\\sample2.docx");
merger.join("C:\\Files\\sample3.docx");

// Enregistrer le fichier fusionné
merger.save("C:\\Files\\output.docx");
```

{{< figure align=center src="images/Merge-Multiple-Word-Documents-using-Java-1024x457.jpg" alt="Fusionner plusieurs documents Word à l'aide de Java" caption="Fusionner plusieurs documents Word à l'aide de Java">}}
 

La classe **[Merger][10]** est la classe principale qui contrôle le processus de fusion de documents. Il fournit diverses méthodes pour joindre, extraire, supprimer et diviser des pages de document.
La méthode **[Join()][11]** de la classe **Merger** joint les deux documents ou plus en un seul document. Il prend un document du chemin du fichier ou du flux d'entrée comme paramètre d'entrée. Vous pouvez également fournir **JoinOptions**.
La méthode **[save()][12]** de la classe **Merger** enregistre le document résultant dans le chemin de fichier fourni. Vous pouvez également enregistrer le document dans OutputStream.
## Combiner des pages spécifiques de documents Word à l'aide de Java {#Combine-Specific-Pages-of-Word-Documents-using-Java}

Vous pouvez combiner des pages spécifiques de documents Word par programme en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe **_[Merger][10]_**
  * Spécifiez le chemin d'accès au fichier DOCX d'entrée
  * Définissez **_[JoinOptions][14]_** et définissez le numéro de page de début et de fin
  * Appelez la méthode **_[join()][11]_** et spécifiez le chemin d'accès au fichier DOCX cible
  * Appelez la méthode **_[save()][12]_** et enregistrez le fichier fusionné

L'exemple de code suivant montre comment combiner des pages sélectionnées de documents Word à l'aide de Java.
```
// Initialiser l'API
Fusionnerr merger = new Fusionnerr("C:\\Files\\merger\\sample.docx");

// Définir les options de jointure
JoinOptions joinOptions = new JoinOptions(1, 2);

// Fusionner
merger.join("C:\\Files\\merger\\sample2.docx", joinOptions);

// Enregistrer le fichier fusionné
merger.save("C:\\Files\\merger\\output.docx");
```

La classe **[JoinOptions][14]** fournit des options telles que le numéro de page de début, le numéro de page de fin et le mode de jonction des documents.
## Fusionner et sécuriser avec un mot de passe en utilisant Java {#Merge-and-Secure-with-Password-using-Java}

Vous pouvez fusionner deux ou plusieurs documents Word, puis les sécuriser avec un mot de passe par programmation en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe **_[Merger][10]_**
  * Spécifiez le chemin d'accès au fichier DOCX d'entrée
  * Appelez la méthode **_[join()][11]_** et spécifiez le chemin d'accès au fichier DOCX cible
  * Répétez l'étape ci-dessus et ajoutez d'autres fichiers à fusionner
  * Définissez le mot de passe à l'aide de **_[AddPasswordOptions][15]_**
  * Appelez la méthode **_[addPassword()][16]_** avec _AddPasswordOptions_
  * Appelez la méthode **_[save()][12]_** pour enregistrer le fichier fusionné protégé par mot de passe

L'exemple de code suivant montre comment fusionner plusieurs fichiers DOCX, puis sécuriser le fichier fusionné avec un mot de passe à l'aide de Java.
```
// Initialiser l'API
Merger merger = new Merger("C:\\Files\\sample.docx");

// Fusionner des fichiers
merger.join("C:\\Files\\sample2.docx");
merger.join("C:\\Files\\sample3.docx");

// Définir le mot de passe
AddPasswordOptions addOptions = new AddPasswordOptions("password");
merger.addPassword(addOptions);

// Enregistrer le fichier fusionné
merger.save("C:\\Files\\output.docx");
```

La classe **[AddPasswordOptions][15]** fournit des options pour définir un mot de passe pour la protection des documents.
La méthode **[addPassword()][16]** de la classe **Merger** obtient **AddPasswordOptions** comme paramètre d'entrée et protège le document avec un mot de passe.
## Fusionner un document Word en PDF à l'aide de Java {#Merge-Word-Document-into-PDF-using-Java}

Vous pouvez fusionner deux ou plusieurs documents Word dans un document PDF par programmation en suivant les étapes simples mentionnées ci-dessous :
  * Créez une instance de la classe **_[Merger][10]_**
  * Spécifiez le chemin d'accès au fichier PDF d'entrée
  * Appelez la méthode **_[join()][11]_** et spécifiez le chemin d'accès au fichier DOCX cible
  * Appelez la méthode **_[save()][12]_** et enregistrez le fichier PDF fusionné

L'exemple de code suivant montre comment fusionner des fichiers DOCX dans un fichier PDF à l'aide de Java.
```
// Initialiser l'API
Merger merger = new Merger("C:\\Files\\sample.pdf");

// Fusionner des fichiers
merger.join("C:\\Files\\sample.docx");

// Enregistrer le fichier fusionné
merger.save("C:\\Files\\output.pdf");
```

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][17].
## Conclusion

Dans cet article, vous avez appris **comment fusionner des documents Word à l'aide de Java**. Vous pouvez en savoir plus sur l'API GroupDocs.Merger pour Java en utilisant la [documentation][18]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][19].
## See Also

  * [Fusionner plusieurs types de fichiers en un seul fichier à l'aide de Java][20]
  * [Diviser ou fusionner PDF, PowerPoint, Excel, Word, Documents en Java][21]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Merge-Word-Documents-using-Java.jpg
 [2]: #API-for-Merging-Word-Documents
 [3]: #Merge-Multiple-Word-Documents-using-Java
 [4]: #Combine-Specific-Pages-of-Word-Documents-using-Java
 [5]: #Merge-and-Secure-with-Password-using-Java
 [6]: #Merge-Word-Document-into-PDF-using-Java
 [7]: https://docs.fileformat.com/word-processing/docx/
 [8]: https://products.groupdocs.com/merger/java
 [9]: https://downloads.groupdocs.com/merger/java
 [10]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger
 [11]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#join(java.lang.String)
 [12]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#save(java.lang.String)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Merge-Multiple-Word-Documents-using-Java.jpg
 [14]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/JoinOptions
 [15]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/AddPasswordOptions
 [16]: https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#addPassword(com.groupdocs.merger.domain.options.interfaces.IAddPasswordOptions)
 [17]: https://purchase.groupdocs.com/temporary-license
 [18]: https://docs.groupdocs.com/merger/java/
 [19]: https://forum.groupdocs.com/c/merger/
 [20]: https://blog.groupdocs.com/2021/06/13/merge-multiple-file-types-using-java/
 [21]: https://blog.groupdocs.com/2020/05/20/merge-pdf-word-excel-powerpoint-documents-in-java/





