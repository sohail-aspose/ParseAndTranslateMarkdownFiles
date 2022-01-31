---
title: Convert PDF to Word using Java
author: Muzammil Khan
date: 2021-07-26T15:22:27+00:00
summary: "En tant que développeur Java, vous pouvez facilement convertir vos documents PDF en documents Word (.docx ou .doc) par programmation. Cet article se concentrera sur la <strong>façon de convertir des documents PDF en document Word à l'aide de Java</strong> ."
url: /2021/07/26/convert-pdf-to-word-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Convertir PDF en DOCX"
  - "Convertir un PDF en Word"
  - "Convertir un PDF en utilisant Java"
  - "Convertir des pages spécifiques à l'aide de Java"
  - "GroupDocs.Conversion pour Java"

---


{{< figure align=center src="images/convert-pdf-to-word-using-java.jpg" alt="">}}
 

Vous pouvez facilement convertir vos documents PDF en documents Word (_.docx _ou_ .doc_) par programmation dans vos applications Java. Une telle conversion est utile lorsque vous avez besoin de modifier le texte de vos documents PDF ou d'appliquer la mise en forme du texte. Dans cet article, vous allez apprendre **comment convertir un PDF en Word en utilisant Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour convertir PDF en Word][2]
  * [Convertir PDF en Word en utilisant Java][3]
  * [Convertir des pages spécifiques de PDF en Word][4]
  * [Charger un PDF protégé par mot de passe et le convertir en Word][5]

## API Java pour convertir PDF en Word {#java-conversion-api}

J'utiliserai [GroupDocs.Conversion for Java API][6] pour la conversion de [PDF][7] en [DOCX][8]. Cette API fournit une solution de conversion de fichiers rapide, efficace et fiable en applications Java sans installer de logiciel externe. Il prend en charge les conversions parmi tous les formats de documents commerciaux courants tels que PDF, HTML, e-mail, Word, Excel, PowerPoint, Project, Photoshop, CorelDraw, AutoCAD, les formats de fichiers d'image raster et bien d'autres. Il vous permet également d'afficher l'intégralité du document ou de le rendre partiellement pour accélérer le processus. L'API est compatible avec toutes les versions de Java et prend en charge les systèmes d'exploitation courants (Windows, Linux, macOS) capables d'exécuter l'environnement d'exécution Java.
### Télécharger et configurer
Vous pouvez [télécharger][9] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-conversion</artifactId><version>21.7</version></dépendance></pre>
## Convertir PDF en Word en utilisant Java {#convert-pdf-to-docx}

Vous pouvez convertir des documents PDF en Word en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe _**[Converter][10]**_
  2. Indiquez le chemin du fichier d'entrée
  3. Créez une instance de [**_WordProcessingConvertOptions_**][11]
  4. Définir le numéro de la page de démarrage
  5. Fournir le nombre total de pages à convertir
  6. Définir le format du fichier de sortie
  7. Appelez la _**[Convert()][12]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir un fichier PDF en un document Word à l'aide de Java**.
```
// créer un convertirisseur
Converter convertirer = new Converter("C:\\Files\\sample.pdf");

// définir les options de conversion de Word
WordProcessingConvertOptions options = new WordProcessingConvertOptions();
options.setPageNumber(1);
options.setPagesCount(1);
options.setFormat(WordProcessingFileType.Docx);

// convertir
convertirer.convertir("C:\\Files\\output.docx", options);
```

{{< figure align=center src="images/convert-pdf-to-docx-1024x549.jpg" alt="Convertir PDF en Word en utilisant Java" caption="Convertir PDF en Word en utilisant Java">}}
 

La classe [Converter][10] est la classe principale qui contrôle le processus de conversion du document. Il fournit diverses méthodes pour convertir des documents de formats de fichiers pris en charge. La méthode [Convert()][12] de cette classe convertit les documents source et prend deux paramètres d'entrée, le chemin d'accès au document source et [ConvertOptions][14] pour convertir un document source spécifique en type de fichier cible souhaité.
La classe [WordProcessingConvertOptions][11] fournit des options pour la conversion vers le type de fichier WordProcessing. La méthode _setPageNumber()_ permet de définir le numéro de page de départ pour démarrer la conversion. Alors que la méthode _setPagesCount()_ définit le nombre total de pages à convertir à partir du numéro de page défini. La méthode setFormat() de cette classe vous permet de définir le format de sortie du document converti. Il prend le type d'énumération [WordProcessingFileType][15] comme entrée.
## Convertir des pages spécifiques de PDF en Word {#convert-specific-pages-of-pdf-to-docx}

Vous pouvez convertir des pages spécifiques d'un document PDF en Word en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe _**[Converter][10]**_
  2. Indiquez le chemin du fichier d'entrée
  3. Créez une instance de [**_WordProcessingConvertOptions_**][11]
  4. Définir la liste des numéros de page à convertir
  5. Appelez la _**[Convert()][12]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir des pages spécifiques d'un fichier PDF en un document Word à l'aide de Java**.
```
// créer un convertirisseur
Converter convertirer = new Converter("C:\\Files\\sample.pdf");

// définir les options de conversion de Word
WordProcessingConvertOptions options = new WordProcessingConvertOptions();
options.setPages(Arrays.asList(2, 3));

// convertir
convertirer.convertir("C:\\Files\\output.docx", options);
```

La classe [WordProcessingConvertOptions][11] fournit la méthode _setPages()_ pour convertir des numéros de page spécifiques définis dans une liste séparée par des virgules à partir d'un document source.
## Charger un PDF protégé par mot de passe et le convertir en Word {#convert-password-protected-pdf-to-docx}

Vous pouvez convertir des documents PDF protégés par mot de passe en Word en suivant les étapes simples ci-dessous :
  1. Créer **_[PdfLoadOptions][16]_**
  2. Définir le mot de passe
  3. Créez une instance de la classe _**[Converter][10]**_
  4. Indiquez le chemin du fichier d'entrée
  5. Créez une instance de [**_WordProcessingConvertOptions_**][11]
  6. Appelez la _**[Convert()][12]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre ****comment convertir un fichier PDF protégé par mot de passe en un document Word à l'aide de Java****.
```
// Options de chargement de PDF
PdfLoadOptions loadOptions = new PdfLoadOptions();
loadOptions.setPassword("password");

// créer un convertirisseur
Converter convertirer = new Converter("C:\\Files\\sample.pdf", loadOptions);

// définir les options de conversion de Word
WordProcessingConvertOptions options = new WordProcessingConvertOptions();

// convertir
convertirer.convertir("C:\\Files\\output.docx", options);
```

La classe [PdfLoadOptions][16] fournit diverses options pour charger des documents PDF. La méthode _setPassword()_ de cette classe permet de déprotéger le document protégé en fournissant son mot de passe.
Vous pouvez trouver plus de détails sur "[Charger un document PDF avec des options][17]" dans la documentation.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][18].
## Conclusion

Dans cet article, vous avez appris **comment convertir des documents PDF en Word** en utilisant Java. Vous avez également appris **comment convertir un fichier PDF protégé par mot de passe en un document Word**. De plus, vous avez appris **comment convertir des pages spécifiques d'un PDF en un document Word** par programmation. Vous pouvez en savoir plus sur l'API Java GroupDocs.Conversion en utilisant la [documentation][19]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][20].
## See Also

  * [][21][Convert Any Image to PDF in Java][22]
  * [Convertir des présentations en PDF en Java][23]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/convert-pdf-to-word-using-java.jpg
 [2]: #java-conversion-api
 [3]: #convert-pdf-to-docx
 [4]: #convert-specific-pages-of-pdf-to-docx
 [5]: #convert-password-protected-pdf-to-docx
 [6]: https://products.groupdocs.com/conversion/java
 [7]: https://docs.fileformat.com/pdf/
 [8]: https://docs.fileformat.com/word-processing/docx/
 [9]: https://downloads.groupdocs.com/conversion/java
 [10]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion/Converter
 [11]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.convert/WordProcessingConvertOptions
 [12]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion/Converter#convert(java.lang.String,%20com.groupdocs.conversion.options.convert.ConvertOptions)
 [13]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/07/convert-pdf-to-docx.jpg
 [14]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.convert/ConvertOptions
 [15]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.filetypes/WordProcessingFileType
 [16]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.load/PdfLoadOptions
 [17]: https://docs.groupdocs.com/conversion/java/load-pdf-document-with-options/
 [18]: https://purchase.groupdocs.com/temporary-license
 [19]: https://docs.groupdocs.com/conversion/java/
 [20]: https://forum.groupdocs.com/c/conversion/11
 [21]: https://blog.conholdate.com/2021/03/31/convert-pdf-to-excel-using-csharp/
 [22]: https://blog.groupdocs.com/2021/04/21/convert-images-to-pdf-in-java/
 [23]: https://blog.groupdocs.com/2021/02/15/convert-presentations-odp-pptx-ppt-to-pdf-in-java/





