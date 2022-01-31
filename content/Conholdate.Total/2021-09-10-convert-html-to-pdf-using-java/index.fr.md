---
title: Convert HTML to PDF using Java
author: Muzammil Khan
date: 2021-09-10T13:37:34+00:00
summary: "En tant que développeur Java, vous pouvez facilement convertir des fichiers HTML ou des pages Web HTML à partir d'URL en direct en documents PDF. Dans cet article, vous apprendrez <strong>à convertir HTML en PDF en utilisant Java</strong> ."
url: /2021/09/10/convert-html-to-pdf-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Convertir HTML en PDF"
  - "Convertir HTML en PDF" in Java
  - "Convertir des pages Web HTML en PDF"
  - "API de conversion HTML en PDF"
  - "API Java de conversion HTML en PDF"

---


{{< figure align=center src="images/Convert-HTML-to-PDF.jpg" alt="Convertir HTML en PDF en utilisant Java">}}
 

En tant que développeur Java, vous pouvez facilement convertir des fichiers HTML ou des pages Web à partir d'URL Web en direct en documents PDF par programmation dans vos applications Java. Dans cet article, vous apprendrez **comment convertir HTML en PDF en utilisant Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java de conversion HTML en PDF][2]
  * [Convertir HTML en PDF en utilisant Java][3]
  * [Convertir HTML en PDF avec des options avancées][4]
  * [Conversion HTML en PDF à partir d'une URL][5]
  * [Convertir une plage de pages spécifique de HTML en PDF][6]
  * [Convertir HTML en PDF et ajouter un filigrane][7]

## API Java de conversion HTML en PDF {#HTML-to-PDF-Conversion-Java-API}

Pour convertir [HTML][8] en [PDF][9], j'utiliserai [GroupDocs.Conversion for Java API][10]. Il s'agit d'une solution de conversion de fichiers rapide, efficace et fiable pour vos applications Java sans installer de logiciel externe. Vous pouvez convertir parmi tous les formats de documents commerciaux courants tels que PDF, HTML, e-mail, Word, Excel, PowerPoint, Project, les formats de fichiers d'image raster et bien d'autres. Il vous permet également d'afficher l'intégralité du document ou de le rendre partiellement pour accélérer le processus. L'API est compatible avec toutes les versions de Java et prend en charge les systèmes d'exploitation courants (Windows, Linux, macOS) capables d'exécuter l'environnement d'exécution Java.
Vous pouvez [télécharger][11] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans votre application Java basée sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-conversion</artifactId><version>21.7</version></dépendance></pre>
## Convertir HTML en PDF en utilisant Java {#Convert-HTML-to-PDF-using-Java}

Vous pouvez facilement convertir des fichiers HTML en documents PDF en suivant les étapes simples ci-dessous :
  1. Créez une instance de la classe _**[Converter][12]**_ avec le chemin du fichier d'entrée
  2. Créez une instance de [**_PdfConvertOptions_**][13]
  3. Appelez la _**[convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir un document HTML en document PDF à l'aide de Java**.
```
// initialiser le convertirisseur
Converter convertirer = new Converter("C:\\Files\\sample.html");

// définir les options de conversion PDF
PdfConvertOptions options = new PdfConvertOptions();

// convertir
convertirer.convertir("C:\\Files\\HtmlToPdf.pdf", options);
```

{{< figure align=center src="images/Convert-HTML-to-PDF-using-Java-1024x510.jpg" alt="Convertir HTML en PDF en utilisant Java" caption="Convertir HTML en PDF en utilisant Java">}}
 

La classe [Converter][12] est la classe principale qui contrôle le processus de conversion du document. Il fournit diverses méthodes pour répondre aux demandes de conversion. La méthode [convert()][14] de cette classe convertit le document source dans le format cible spécifié et enregistre le document converti dans le chemin de fichier donné. Il fournit plusieurs méthodes _convert()_ surchargées pour convertir les formats de fichiers pris en charge.
## Convertir HTML en PDF avec des options avancées {#Convert-HTML-to-PDF-with-Advanced-Options-using-Java}

Vous pouvez utiliser certains paramètres avancés lors de la conversion des fichiers HTML en documents PDF en suivant les étapes ci-dessous :
  1. Créez une instance de la classe _**[Converter][12]**_ avec le chemin du fichier d'entrée
  2. Créez une instance de [**_PdfConvertOptions_**][13]
  3. Définissez diverses options telles que _Rotation_, _Dpi_, _Width_, _Height_, etc.
  4. Appelez la _**[convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir un fichier HTML en un document PDF avec des paramètres avancés.**
```
// initialiser le convertirisseur
Converter convertirer = new Converter("C:\\Files\\sample.html");

// définir PdfConvertOptions
PdfConvertOptions options = new PdfConvertOptions();
options.setPassword("12345");
options.setRotate(Rotation.On180);
options.setDpi(300);
options.setWidth(1024);
options.setHeight(768);

// convertir
convertirer.convertir("C:\\Files\\ConvertWithAdvancedOptions.pdf", options);
```

{{< figure align=center src="images/Convert-HTML-to-PDF-with-Advanced-Options-using-Java-1024x478.jpg" alt="Convertir HTML en PDF avec des options avancées à l'aide de Java" caption="Convertir HTML en PDF avec des options avancées à l'aide de Java">}}
 

La classe [PdfConvertOptions][13] fournit plusieurs options pour convertir les fichiers d'entrée spécifiés en documents PDF. J'ai utilisé les options suivantes :
  * [Largeur][17]&nbsp;— the setWidth() property sets the image width after conversion
  * [Hauteur][18]&nbsp;— the setHeight() property sets the desired image height after conversion
  * [ppp][19]&nbsp;— the setDpi() property sets the desired page DPI after conversion
  * [Mot de passe][20]&nbsp;— the setPassword() property protects the converted document with a password
  * [Tourner][21]&nbsp;— the setRotate() property allows page rotation with the following available options:&nbsp;_None, On90, On180, On270_

Vous pouvez trouver plus de détails sur "[Convertir en PDF avec les options avancées][22]" dans la documentation.
## Conversion HTML en PDF à partir d'une URL {#HTML-to-PDF-Conversion-from-a-URL}

Vous pouvez convertir les pages Web HTML des URL en direct en documents PDF en suivant les étapes ci-dessous :
  1. Fournir l'URL d'un objet de flux d'entrée et ouvrir le flux
  2. Créez une instance de la classe _**[Converter][12]**_ avec l'objet de flux d'entrée
  3. Créez une instance de [**_PdfConvertOptions_**][13]
  4. Appelez la _**[convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir le code HTML d'une URL Web en un document PDF à l'aide de Java**.
```
// flux d'entrée
InputStream stream = new URL("https://onlinebooks.library.upenn.edu/readers.html").openStream();

// initialiser le convertirisseur
Converter convertirer = new Converter(stream);

// définir les options de conversion PDF
PdfConvertOptions options = new PdfConvertOptions();

// convertir
convertirer.convertir("C:\\Files\\LoadDocumentFromUrl.pdf", options);
```

## Convertir une plage de pages spécifique de HTML en PDF {#Convert-Specific-Page-Range-of-HTML-to-PDF-using-Java}

Vous pouvez convertir des pages spécifiques de documents HTML multipages en documents PDF en suivant les étapes ci-dessous :
  1. Créez une instance de la classe _**[Converter][12]**_ avec le chemin du fichier d'entrée
  2. Créez une instance de [**_PdfConvertOptions_**][13]
  3. Définir le numéro de page à partir duquel commencer la conversion
  4. Définir le nombre de pages pour convertir le nombre total de pages
  5. Appelez la _**[convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir des pages spécifiques de HTML en un document PDF à l'aide de Java**.
```
// initialiser le convertirisseur
Converter convertirer = new Converter("C:\\Files\\Conversion\\sample_2.html");

// définir PdfConvertOptions
PdfConvertOptions options = new PdfConvertOptions();
options.setPageNumber(2);
options.setPagesCount(1);

// convertir
convertirer.convertir("C:\\Files\\ConvertNConsecutivePages.pdf", options);
```

## Convertir HTML en PDF et ajouter un filigrane {#Convert-HTML-to-PDF-and-Add-Watermark-using-Java}

Vous pouvez convertir des fichiers HTML en documents PDF avec filigrane en suivant les étapes ci-dessous :
  1. Créez une instance de la classe _**[Converter][12]**_
  2. Fournir le chemin du fichier d'entrée au constructeur
  3. Créez une instance de [**_PdfConvertOptions_**][13]
  4. Créez une instance de **_[WatermarkOptions][23]_**
  5. Définissez diverses options telles que _Text_, _Color_, _Width_, _Height_, _RotatationAngle_, etc.
  6. Appelez la _**[convert()][14]** _method avec le chemin du fichier de sortie et les options de conversion

L'exemple de code suivant montre **comment convertir un document HTML en document PDF avec filigrane à l'aide de Java**.
```
// initialiser le convertirisseur
Converter convertirer = new Converter("C:\\Files\\sample_2.html");

// définir les options de conversion PDF
PdfConvertOptions options = new PdfConvertOptions();

// définir les options de filigrane
WatermarkOptions watermark = new WatermarkOptions();
watermark.setText("THIS IS A SAMPLE TEXT WATERMARK");
watermark.setColor(Color.red);
watermark.setTop(400);
watermark.setLeft(150);
watermark.getWatermarkFont().setBold(true);
watermark.setRotationAngle(30);
watermark.setWidth(1000);
watermark.setHeight(1000);
watermark.setBackground(false);
options.setWatermark(watermark);

// convertir
convertirer.convertir("C:\\Files\\HtmlToPDFAddWatermark.pdf", options);
```

{{< figure align=center src="images/Convert-HTML-to-PDF-and-Add-Watermark-using-Java-1024x485.jpg" alt="Convertir HTML en PDF et ajouter un filigrane à l'aide de Java" caption="Convertir HTML en PDF et ajouter un filigrane à l'aide de Java">}}
 

La classe [WatermarkOptions][23] fournit plusieurs options pour ajouter un filigrane aux documents convertis. Il vous permet d'ajouter des filigranes de texte ou d'image aux documents convertis.
## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][25].
## Conclusion

Dans cet article, vous avez appris **comment convertir des documents HTML en PDF** à l'aide de Java. Vous avez également appris **comment ajouter des filigranes aux documents PDF convertis**. De plus, vous avez appris **comment convertir HTML à l'aide des options de conversion PDF avancées** par programmation. Cet article a également expliqué **comment convertir des pages Web HTML d'une URL en direct en un document PDF** à l'aide de Java. Vous pouvez en savoir plus sur l'API Java GroupDocs.Conversion à l'aide de la [documentation][26]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][27].
## See Also

  * [Convertir PDF en Word en utilisant Java][28]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-HTML-to-PDF.jpg
 [2]: #HTML-to-PDF-Conversion-Java-API
 [3]: #Convert-HTML-to-PDF-using-Java
 [4]: #Convert-HTML-to-PDF-with-Advanced-Options-using-Java
 [5]: #HTML-to-PDF-Conversion-from-a-URL
 [6]: #Convert-Specific-Page-Range-of-HTML-to-PDF-using-Java
 [7]: #Convert-HTML-to-PDF-and-Add-Watermark-using-Java
 [8]: https://docs.fileformat.com/web/html/
 [9]: https://docs.fileformat.com/pdf/
 [10]: https://products.groupdocs.com/conversion/java
 [11]: https://downloads.groupdocs.com/conversion/java
 [12]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion/Converter
 [13]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.convert/PdfConvertOptions
 [14]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion/Converter#convert(java.lang.String,%20com.groupdocs.conversion.options.convert.ConvertOptions)
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-HTML-to-PDF-using-Java.jpg
 [16]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-HTML-to-PDF-with-Advanced-Options-using-Java.jpg
 [17]: https://apireference.groupdocs.com/java/conversion/com.groupdocs.conversion.options.convert/PdfConvertOptions#setWidth(int)
 [18]: https://apireference.groupdocs.com/java/conversion/com.groupdocs.conversion.options.convert/PdfConvertOptions#setHeight(int)
 [19]: https://apireference.groupdocs.com/java/conversion/com.groupdocs.conversion.options.convert/PdfConvertOptions#setDpi(double)
 [20]: https://apireference.groupdocs.com/java/conversion/com.groupdocs.conversion.options.convert/PdfConvertOptions#setPassword(java.lang.String)
 [21]: https://apireference.groupdocs.com/java/conversion/com.groupdocs.conversion.options.convert/PdfConvertOptions#setRotate(com.groupdocs.conversion.options.convert.Rotation)
 [22]: https://docs.groupdocs.com/conversion/java/convert-to-pdf-with-advanced-options/
 [23]: https://apireference.groupdocs.com/conversion/java/com.groupdocs.conversion.options.convert/WatermarkOptions
 [24]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Convert-HTML-to-PDF-and-Add-Watermark-using-Java.jpg
 [25]: https://purchase.groupdocs.com/temporary-license
 [26]: https://docs.groupdocs.com/conversion/java/
 [27]: https://forum.groupdocs.com/c/conversion/11
 [28]: https://blog.conholdate.com/2021/07/26/convert-pdf-to-word-using-java/





