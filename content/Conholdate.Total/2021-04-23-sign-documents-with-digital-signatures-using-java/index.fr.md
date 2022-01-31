---
title: Sign Documents with Digital Signatures using Java
author: Muzammil Khan
date: 2021-04-23T07:09:03+00:00
summary: "Signez vos documents PDF ou Word avec des certificats numériques par programmation dans votre application Java. Cet article se concentrera sur la <strong>manière de signer électroniquement des documents avec des signatures numériques à l'aide de Java</strong> ."
url: /2021/04/23/sign-documents-with-digital-signatures-using-java/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Signer numériquement un PDF à l'aide de Java"
  - "Signer numériquement un fichier Word à l'aide de Java"
  - "Signer des documents à l'aide de Java"
  - "Signer des documents avec des certificats numériques"
  - "Signer le fichier PDF"

---


{{< figure align=center src="images/Digitally-sign-PDF-using-Java-1.jpg" alt="">}}
 

Une signature numérique est une technique mathématique pour vérifier l'authenticité du document. Pour les documents, la signature numérique est représentée par un certificat avec des clés privées et publiques. En tant que développeur Java, vous pouvez facilement signer vos documents avec des certificats numériques par programmation. Cet article se concentrera sur **comment signer électroniquement des documents avec des signatures numériques à l'aide de Java**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API Java pour la signature de documents][2]
  * [Signer des documents PDF avec des signatures numériques à l'aide de Java][3]
  * [Signer des documents Word avec des signatures numériques à l'aide de Java][4]

## API Java pour la signature de documents {#api-for-signing-documents}

J'utiliserai l'API [GroupDocs.Signature for Java][5] pour signer des documents avec le certificat numérique. Il vous aide à développer des applications Java pour signer électroniquement des documents numériques de [formats pris en charge] [6]. Il permet également de signer des images et des documents avec des signatures électroniques de type image, code QR, code à barres, métadonnées, texte et tampon.
### Télécharger et configurer
Vous pouvez [télécharger][7] le JAR de l'API ou simplement ajouter la configuration **_pom.xml_** suivante dans vos applications Java basées sur Maven pour essayer les exemples de code mentionnés ci-dessous.
<pre class="wp-block-code"><code><repository><id>GroupDocsJavaAPI</id><name>API Java GroupDocs</name><url>http://repository.groupdocs.com/repo/</url></repository></pre>
<pre class="wp-block-code"><code><dependency><groupId>com.groupdocs</groupId><artifactId>groupdocs-signature</artifactId><version>20.9</version></dépendance></pre>
## Signer des documents PDF avec des signatures numériques à l'aide de Java {#sign-pdf-documents}

Vous pouvez signer électroniquement vos documents PDF avec des signatures numériques en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la _[Signature][8] _class
  * Indiquez le chemin du document PDF
  * Créez une instance de la _[DigitalSignOptions][9] _class
  * Indiquez le chemin du fichier de certificat
  * Définir le chemin du fichier image
  * Définissez les options de signe requises telles que la position (Haut, Gauche, etc.)
  * Appelez ensuite la méthode [_Sign_][10] pour signer le document

L'exemple de code suivant montre comment signer les documents PDF avec le certificat à l'aide de Java.
```
Signature signature = new Signature("sample.pdf");

// Définir les options de signalisation numérique  
DigitalSignOptions options = new DigitalSignOptions("Signature.pfx");
options.setImageFilePath("signature.jpg");
options.setLeft(100);
options.setTop(200);
options.setPageNumber(1);

// Signer le document à classer
signature.sign("output.pdf", options);
```

{{< figure align=center src="images/Signed-PDF-1024x630.jpg" alt="Signer un document PDF avec un certificat numérique à l'aide de Java" caption="Signer un document PDF avec un certificat numérique à l'aide de Java">}}
 

La classe [Signature][12] est la classe principale qui contrôle le processus de signature du document. Cette classe fournit diverses méthodes pour signer, vérifier, mettre à jour et rechercher des signatures.
La classe [DigitalSignOptions][13] fournit diverses méthodes pour définir et obtenir des options de signe pour représenter les signatures numériques.
## Signer des documents Word avec des signatures numériques à l'aide de Java {#sign-word-documents}

Vous pouvez signer électroniquement vos documents Word avec des signatures numériques en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la _[Signature][8] _class
  * Indiquez le chemin du fichier Word
  * Créez une instance de la _[DigitalSignOptions][9] _class
  * Indiquez le chemin du fichier de certificat
  * Définir le chemin du fichier image
  * Définissez les options de signe requises telles que la position (Haut, Gauche, etc.)
  * Appelez ensuite la méthode _[Sign][10] _ pour signer le document

L'exemple de code suivant montre comment signer le fichier DOCX avec le certificat à l'aide de Java.
```
Signature signature = new Signature("sample.docx");

// Définir les options de signalisation numérique  
DigitalSignOptions options = new DigitalSignOptions("Signature.pfx");
options.setImageFilePath("signature.jpg");
options.setPassword("1234567890");
options.setReason("Approved");
options.setContact("John Smith");
options.setLocation("New York");
options.setAllPages(true);
options.setWidth(160);
options.setHeight(80);
options.setTop(400);
options.setLeft(100);

// Signer le document à classer
signature.sign("output.docx", options);
```

{{< figure align=center src="images/Sign-DOCX-1024x582.jpg" alt="Signez des documents Word avec des certificats numériques à l'aide de Java" caption="Signez des documents Word avec des certificats numériques à l'aide de Java">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][15].
## Conclusion

Dans cet article, vous avez appris ** comment ** signer électroniquement ** des documents avec des signatures numériques ** à l'aide de Java. Vous pouvez en savoir plus sur l'API GroupDocs.Signature pour Java en utilisant la [documentation][16]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][17].
## See Also

  * [Signer des documents avec un certificat numérique à l'aide de C#][18]
  * [Générer des codes QR en Java | Signer des documents et des images][19]
  * [Signez des documents PDF avec un code QR à l'aide de l'API REST en Python][20]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Digitally-sign-PDF-using-Java-1.jpg
 [2]: #api-for-signing-documents
 [3]: #sign-pdf-documents
 [4]: #sign-word-documents
 [5]: https://products.groupdocs.com/signature/java
 [6]: https://docs.groupdocs.com/signature/java/supported-document-formats/
 [7]: https://downloads.groupdocs.com/signature/java
 [8]: https://apireference.groupdocs.com/signature/java/com.groupdocs.signature/Signature#Signature(java.lang.String)
 [9]: https://apireference.groupdocs.com/signature/java/com.groupdocs.signature.options.sign/DigitalSignOptions#DigitalSignOptions(java.lang.String)
 [10]: https://apireference.groupdocs.com/signature/java/com.groupdocs.signature/Signature#sign(java.lang.String,%20com.groupdocs.signature.options.sign.SignOptions)
 [11]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Signed-PDF.jpg
 [12]: https://apireference.groupdocs.com/signature/java/com.groupdocs.signature/Signature
 [13]: https://apireference.groupdocs.com/signature/java/com.groupdocs.signature.options.sign/DigitalSignOptions
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/04/Sign-DOCX.jpg
 [15]: https://purchase.groupdocs.com/temporary-license
 [16]: https://docs.groupdocs.com/signature/java/
 [17]: https://forum.groupdocs.com/c/signature/
 [18]: https://blog.groupdocs.com/2021/03/11/sign-documents-with-digital-certificate-using-csharp/
 [19]: https://blog.groupdocs.com/2021/02/19/generate-qr-codes-in-java-to-sign-documents-and-images/
 [20]: https://blog.groupdocs.cloud/2021/03/06/sign-pdf-documents-with-qr-code-using-python/





