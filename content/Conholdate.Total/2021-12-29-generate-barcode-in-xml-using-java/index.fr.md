---
title: Generate Barcode in XML using Java
author: Muzammil Khan
date: 2021-12-29T10:45:20+00:00
summary: "En tant que développeur Java, vous pouvez facilement générer des codes-barres de différents types par programmation et les enregistrer au format XML. Dans cet article, vous apprendrez <strong>à générer des codes-barres en XML à l'aide de Java</strong> ."
url: /2021/12/29/generate-barcode-in-xml-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Exporter le code-barres vers XML en Java"
  - "Générer un code-barres à partir de XML en Java"
  - "Générer un code-barres en Java"
  - "Générer un code QR en Java"

---


{{< figure align=center src="images/Generate-Barcode-in-XML-using-Java.jpg" alt="Générer un code-barres en XML à l'aide de Java">}}
 

Le code-barres est une représentation visuelle des données dans un code lisible par machine. Les codes-barres contiennent des informations codées sur un produit ou une entreprise sous la forme de chiffres et/ou d'un motif de lignes parallèles. Les scanners de codes-barres traduisent le motif des barres et extraient les informations codées sous la forme d'un simple texte. Nous pouvons générer différents types de codes-barres par programmation. Dans cet article, nous allons apprendre **comment générer des codes-barres en XML à l'aide de Java**.
Les sujets suivants seront traités dans cet article :
  * [API de générateur de code-barres Java][2]
  * [Comment générer un code-barres en XML][3]
  * [Exporter les propriétés du code-barres en XML][4]
  * [Comment exporter un code QR vers XML][5]
  * [Comment importer un code-barres à partir de XML][6]

## API de générateur de code-barres Java - Téléchargement gratuit {#Java-Barcode-Generator-API-Free-Download}

Pour générer des codes-barres en XML, nous utiliserons l'API [Aspose.BarCode for Java][7]. Il facilite la génération et la lecture d'un [large éventail de types de codes à barres][8]. Veuillez soit [télécharger][9] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans une application Java basée sur Maven.
<pre class="wp-block-code"><code><repository><id>AsposeJavaAPI</id><name>API Java Aspose</name><url>http://repository.aspose.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.aspose</groupId><artifactId>aspose-barcode</artifactId><version>21.12</version></dépendance></pre>
## Comment générer un code-barres en XML à l'aide de Java {#How-to-Generate-a-Barcode-in-XML-using-Java}

La classe [BarcodeGenerator][10] de l'API permet la génération de codes-barres. Nous pouvons facilement générer un code-barres et l'enregistrer dans un fichier XML en suivant les étapes ci-dessous :
  1. Tout d'abord, créez une instance de la classe _**[BarcodeGenerator][10]**_ et spécifiez le type et le texte du code-barres comme argument.
  2. Enfin, générez un code-barres en XML à l'aide de la méthode [_**BarcodeGenerator.exportToXml(String)**_][11]. Il prend le chemin du fichier de sortie comme argument.

L'exemple de code suivant montre **comment générer un code-barres et l'enregistrer au format XML à l'aide de Java**.
```
// Instantialisez l'instance du générateur de codes-barres avec CodeText & Barcode Symbology
BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417,
    "this is some test code text. \n Second line \n third line.");

// Enregistrer en XML
generator.exportToXml("C:\\Files\\barcode\\barcode_xml_out.xml");
```

{{< figure align=center src="images/How-to-Generate-a-Barcode-in-XML-using-Java.jpg" alt="Comment générer un code-barres en XML à l'aide de Java." caption="Comment générer un code-barres en XML à l'aide de Java.">}}
 

## Exporter les propriétés de code-barres au format XML à l'aide de Java {#Export-Barcode-Properties-in-XML-using-Java}

Nous pouvons générer un code-barres personnalisé et enregistrer toutes les propriétés en XML en suivant les étapes suivantes :
  1. Tout d'abord, créez une instance de la classe _**[BarcodeGenerator][10]**_ et spécifiez le type et le texte du code-barres comme argument.
  2. Définissez diverses propriétés de code-barres telles que le texte, l'alignement, la légende ci-dessous et la légende au-dessus des paramètres, etc.
  3. Enfin, enregistrez le code-barres au format XML à l'aide de la méthode **_[BarcodeGenerator.exportToXml(String)][11]_**. Il prend le chemin du fichier de sortie comme argument.

L'exemple de code suivant montre **comment exporter des propriétés de code-barres au format XML à l'aide de Java**.
```
// Initialiser l'objet BarcodeGenerator
// Passez le texte du code-barres et la symbologie du code-barres en tant que paramètres.
BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "abcdefghijklmnopqrstuvwxyzabcdef");

// Définissez différentes propriétés/variables du code-barres.
generator.getParameters().getBorder().setVisible(true);
generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.ABOVE);

// Spécifiez la légende ci-dessus les paramètres.
generator.getParameters().getCaptionAbove().setText("Caption ABOVE");
generator.getParameters().getCaptionAbove().setAlignment(TextAlignment.CENTER);
generator.getParameters().getCaptionAbove().setVisible(true);
generator.getParameters().getCaptionAbove().setTextColor(Color.GREEN);

// Spécifiez la légende sous les paramètres.
generator.getParameters().getCaptionBelow().setText("Caption BELOW");
generator.getParameters().getCaptionBelow().setAlignment(TextAlignment.CENTER);
generator.getParameters().getCaptionBelow().setVisible(true);
generator.getParameters().getCaptionBelow().setTextColor(Color.YELLOW);

// Spécifiez les paramètres de police du texte.
generator.getParameters().getBarcode().getCodeTextParameters().getFont().setFamilyName("Courier New");
generator.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPoint(24);
generator.getParameters().getBarcode().getCodeTextParameters().getFont().setStyle(FontStyle.BOLD);

// Appelez la méthode d'exportation vers XML pour exporter les propriétés vers un fichier XML.
generator.exportToXml("C:\\Files\\barcode\\DataMatrix_out.xml");
```

## Comment exporter un code QR vers XML en utilisant Java {#How-to-Export-a-QR-Code-to-XML-using-Java}

Nous pouvons également générer un code QR et l'enregistrer dans un fichier XML en suivant les étapes ci-dessous :
  1. Tout d'abord, créez une instance de la classe **_[BarcodeGenerator][10]_** et spécifiez le type de code-barres comme QR et le texte comme argument.
  2. En option, définissez les fonctionnalités du code-barres telles que la hauteur, la largeur et la résolution, etc.
  3. Enfin, générez un code QR en XML à l'aide de la méthode **_[BarcodeGenerator.exportToXml(String)][11]_**. Il prend le chemin du fichier de sortie comme argument.

L'exemple de code suivant montre **comment générer un code QR et l'enregistrer au format XML à l'aide de Java**.
```
// Initialiser l'objet BarcodeGenerator
// Passez la symbologie du code-barres en tant que code QR et le texte du code-barres en tant que paramètres.
BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, "Aspose.BarCode");

// Définir la résolution
generator.getParameters().setResolution(400);

// Enregistrer le code QR en XML
generator.exportToXml("C:\\Files\\barcode\\QR_out.xml");
```

## Comment importer un code-barres à partir de XML à l'aide de Java {#How-to-Import-a-Barcode-from-XML-using-Java}

Nous pouvons lire les propriétés du code-barres à partir d'un fichier XML et enregistrer l'image du code-barres en suivant les étapes ci-dessous :
  1. Appelez la méthode **_[BarcodeGenerator.importFromXml()][13]_** avec le chemin du fichier XML d'entrée comme argument. Il renvoie l'objet de classe **_[BarcodeGenerator][10]_**.
  2. Enfin, enregistrez l'image du code-barres à l'aide de la méthode **_[BarcodeGenerator.save(String)][14]_**. Il prend le chemin du fichier de sortie comme argument.

L'exemple de code suivant montre **comment lire un code-barres à partir d'un fichier XML et l'enregistrer en tant qu'image à l'aide de Java**.
```
// Lire le code-barres à partir de XML et instancier l'objet BarcodeGenerator
BarcodeGenerator generator = BarcodeGenerator.importFromXml("C:\\Files\\barcode\\barcode_xml_out.xml");

// Enregistrer le code-barres au format JPEG
generator.save("C:\\Files\\barcode\\barcode_xml_out.jpg", BarCodeImageFormat.JPEG);
```

{{< figure align=center src="images/barcode_xml_out.jpg" alt="Comment générer un code-barres à partir de XML en utilisant Java" caption="Comment générer un code-barres à partir de XML en utilisant Java">}}
 

## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][16].
## Conclusion

Dans cet article, nous avons appris **comment générer un code-barres et l'exporter en XML en utilisant Java**. Nous avons également vu **comment générer un code QR en XML** et **importer un code-barres à partir d'un fichier XML** par programmation. En outre, vous pouvez en savoir plus sur l'API Aspose.BarCode for Java en utilisant la [documentation][17]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][18].
## See Also

  * [Générer des codes-barres à l'aide de Java][19]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Generate-Barcode-in-XML-using-Java.jpg
 [2]: #Java-Barcode-Generator-API-Free-Download
 [3]: #How-to-Generate-a-Barcode-in-XML-using-Java
 [4]: #Export-Barcode-Properties-in-XML-using-Java
 [5]: #How-to-Export-a-QR-Code-to-XML-using-Java
 [6]: #How-to-Import-a-Barcode-from-XML-using-Java
 [7]: https://products.aspose.com/barcode/java
 [8]: https://docs.aspose.com/barcode/java/barcode-supported-symbologies/
 [9]: https://downloads.aspose.com/barcode/java
 [10]: https://apireference.aspose.com/barcode/java/com.aspose.barcode.generation/barcodegenerator
 [11]: https://apireference.aspose.com/barcode/java/com.aspose.barcode.generation/BarcodeGenerator#exportToXml-java.lang.String-
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/How-to-Generate-a-Barcode-in-XML-using-Java.jpg
 [13]: https://apireference.aspose.com/barcode/java/com.aspose.barcode.generation/BarcodeGenerator#importFromXml-java.lang.String-
 [14]: https://apireference.aspose.com/barcode/java/com.aspose.barcode.generation/BarcodeGenerator#save-java.lang.String-
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/barcode_xml_out.jpg
 [16]: https://purchase.conholdate.com/temporary-license
 [17]: https://docs.aspose.com/barcode/java
 [18]: https://forum.aspose.com/c/barcode
 [19]: https://blog.aspose.com/2020/04/07/generate-or-scan-barcodes-qr-codes-in-java-using-java-barcode-library/





