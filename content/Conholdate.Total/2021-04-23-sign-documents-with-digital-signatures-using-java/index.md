---
title: Sign Documents with Digital Signatures using Java
author: Muzammil Khan
date: 2021-04-23T07:09:03+00:00
summary: 'Sign your PDF or Word documents with digital certificates programmatically in your Java application. This article will be focusing on <strong>how to electronically sign documents with digital signatures using Java</strong>. '
url: /2021/04/23/sign-documents-with-digital-signatures-using-java/
categories:
  - Conholdate.Total Product Family
tags:
  - Digitally Sign PDF using Java
  - Digitally Sign Word File using Java
  - Sign Documents using Java
  - Sign Documents with Digital Certificates
  - Sign PDF file

---


{{< figure align=center src="images/Digitally-sign-PDF-using-Java-1.jpg" alt="">}}
 

A digital signature is a mathematical technique to verify the document’s authenticity. For documents, the digital signature is represented by certificate with private and public keys. As a Java developer, you can easily sign your documents with digital certificates programmatically. This article will be focusing on&nbsp;**how to electronically sign documents with digital signatures using Java**.

The following topics are discussed/covered in this article:

  * [Java API for Signing Documents][2]
  * [Sign PDF Documents with Digital Signatures using Java][3]
  * [Sign Word Documents with Digital Signatures using Java][4]

## Java API for Signing Documents {#api-for-signing-documents}

I will be using&nbsp;[GroupDocs.Signature for Java][5] API for signing documents with the digital certificate. It helps you develop Java applications to electronically sign digital documents of [supported formats][6]. It also allows signing images and documents with Image, QR-Code, Barcode, Metadata, Text & Stamp Type electronic signatures.

### Download and Configure

You can&nbsp;[download][7]&nbsp;the JAR of the API or just add the following **_pom.xml_** configuration in your Maven-based Java applications to try the below-mentioned code examples.

<pre class="wp-block-code"><code>&lt;repository&gt;
	&lt;id&gt;GroupDocsJavaAPI&lt;/id&gt;
	&lt;name&gt;GroupDocs Java API&lt;/name&gt;
	&lt;url&gt;http://repository.groupdocs.com/repo/&lt;/url&gt;
&lt;/repository&gt;</code></pre>

<pre class="wp-block-code"><code>&lt;dependency&gt;
        &lt;groupId&gt;com.groupdocs&lt;/groupId&gt;
        &lt;artifactId&gt;groupdocs-signature&lt;/artifactId&gt;
        &lt;version&gt;20.9&lt;/version&gt; 
&lt;/dependency&gt;</code></pre>

## Sign PDF Documents with Digital Signatures using Java {#sign-pdf-documents}

You can electronically sign your PDF documents with digital signatures by following the simple steps mentioned below:

  * Create an instance of the _[Signature][8]&nbsp;_class
  * Provide path of the PDF document
  * Create an instance of the _[DigitalSignOptions][9]&nbsp;_class
  * Provide the certificate file path
  * Set the image file path
  * Set required sign options such as position (Top, Left etc.)
  * Then call the&nbsp;[_Sign_][10]&nbsp;method to sign the document

The following code sample shows how to sign the PDF documents with the certificate using Java.

{{< gist conholdate-gists 302a649c27e9a1517f7b9a9902e9843c "SignWithDigitalSignatures_Java_SignPDF.java" >}}

{{< figure align=center src="images/Signed-PDF-1024x630.jpg" alt="Sign PDF Document with Digital Certificate using Java" caption="Sign PDF Document with Digital Certificate using Java">}}
 

The [Signature][12] class is the main class that controls the document signing process. This class provides various methods to sign, verify, update and search signatures.

The [DigitalSignOptions][13] class provides various methods to set and get sign options to represent digital signatures. 

## Sign Word Documents with Digital Signatures using Java {#sign-word-documents}

You can electronically sign your Word documents with digital signatures by following the simple steps mentioned below:

  * Create an instance of the _[Signature][8]&nbsp;_class
  * Provide path of the Word file
  * Create an instance of the _[DigitalSignOptions][9]&nbsp;_class
  * Provide the certificate file path
  * Set the image file path
  * Set required sign options such as position (Top, Left etc.)
  * Then call the&nbsp;_[Sign][10]&nbsp;_method to sign the document

The following code sample shows how to sign the DOCX file with the certificate using Java.

{{< gist conholdate-gists 302a649c27e9a1517f7b9a9902e9843c "SignWithDigitalSignatures_Java_SignDOCX.java" >}}

{{< figure align=center src="images/Sign-DOCX-1024x582.jpg" alt="Sign Word documents with digital certificates using Java" caption="Sign Word documents with digital certificates using Java">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][15].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;**electronically**** **sign documents with digital signatures**&nbsp;using Java. You can learn more about GroupDocs.Signature for Java API using the&nbsp;[documentation][16]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][17].

## See Also

  * [Sign Documents with Digital Certificate using C#][18]
  * [Generate QR Codes in Java | Sign Documents and Images][19]
  * [Sign PDF Documents with QR Code using REST API in Python][20]

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




