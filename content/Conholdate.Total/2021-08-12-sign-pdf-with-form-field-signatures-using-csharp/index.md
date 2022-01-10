---
title: 'Sign PDF with Form Field Signatures using C#'
author: Muzammil Khan
date: 2021-08-12T06:03:00+00:00
summary: 'As a C# developer, you can easily create PDF documents to be filled and signed by users electronically. In this article, you will learn <strong>how to electronically sign PDF documents with Form Field signatures using C#</strong>.'
url: /2021/08/12/sign-pdf-with-form-field-signatures-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - GroupDocs.Signature for .NET
  - PDF Form Field Signatures
  - Sign PDF file
  - Sign PDF with Form Field Signatures

---


{{< figure align=center src="images/sign-pdf-with-form-field-signatures-using-csharp.jpg" alt="Sign PDF with Form Field Signatures using C#">}}
 

Form Fields are&nbsp;various types of data fields that are used to collect information from the users. As a C# developer, you can easily create PDF documents to be filled and signed by users electronically. This can be helpful in collecting customer feedback, partners&#8217; consent, etc. In this article, you will learn&nbsp;**how to electronically sign PDF documents with Form Field signatures using C#**.

The following topics are discussed/covered in this article:

  * [C# API for Signing PDF Documents][2]
  * [Sign PDF Documents with Form Field Signatures using C#][3]
  * [Sign PDF Documents with Multiple Form Field Signatures using C#][4]

## C# API for Signing PDF Documents {#api-for-signing-documents}

I will be using&nbsp;[GroupDocs.Signature for .NET][5] API for signing the [PDF][6] documents enabled with form field signatures. The API allows you to add digital signatures to the [supported document formats][7] and implement popular electronic signature types in your .NET Applications. It also enables you with simple and advanced search options to locate your required signatures on a document.

## Sign PDF Documents with Form Field Signatures using C# {#Sign-PDF-Documents-with-Form-Field-Signatures-using-CSharp}

You can electronically sign your PDF documents using the following types of form field signatures programmatically:

  * [Text Form Field Signatures][8]
  * [Radio Button Form Field Signatures][9]
  * [Combobox Form Field Signatures][10]
  * [Checkbox Form Field Signatures][11]
  * [Digital Form Field Signatures][12]

### Sign PDF Documents with Text Form Field Signatures {#Sign-PDF-Documents-with-Text-Form-Field-Signatures}

You can sign PDF documents with Text form field signatures by following the simple steps mentioned below:

  * Create an instance of the&nbsp;_[Signature][13]&nbsp;_class
  * Provide path of the input PDF document
  * Create an instance of the _TextFormFieldSignature_ class
  * Create an instances of the _[FormFieldSignOptions][14]_ class with _TextFormFieldSignature_ object
  * Set required sign options such as Margin, Height, Width, etc.
  * Call the&nbsp;[_Sign()_][15]&nbsp;method with the _FormFieldSignOptions_ and output file path

The following code sample shows **how to electronically sign a PDF document with text form field signatures using C#**.

{{< gist conholdate-gists f2414bdfc9df3a0335ba4d8e8b2db917 "ElectronicallySignPDF_CSharp_TextFormFieldSignature.cs" >}}

The [Signature][13] class is the main class that controls the document signing process. It provides various methods to sign, search, delete or verify signatures in a document. The [Sign()][15] method of this class is used to sign the document with defined SignOptions.

The [TextFormFieldSignature][16] class provides text input form field signature properties for the PDF Documents.

### Sign PDF Documents with Radio Button Form Field Signatures {#Sign-PDF-Documents-with-Radio-Button-Form-Field-Signatures}

You can sign PDF documents with the radio button form field signatures by following the steps mentioned earlier. However, you need to create an instance of _RadioButtonFormFieldSignature_ class instead of _TextFormFieldSignature_.

The following code sample shows **how to electronically sign a PDF document with radio button form field signatures using C#**. 

{{< gist conholdate-gists f2414bdfc9df3a0335ba4d8e8b2db917 "ElectronicallySignPDF_CSharp_RadioButtonFormFieldSignature.cs" >}}

The [RadioButtonFormFieldSignature][17] class provides radio-button input form field signature properties for the PDF Documents.

### Sign PDF Documents with Combobox Form Field Signatures {#Sign-PDF-Documents-with-Combobox-Form-Field-Signatures}

You can sign PDF documents with Combobox form field signatures by following the steps mentioned earlier. However, you need to create an instance of _ComboboxFormFieldSignature_ instead of _TextFormFieldSignature_.

The following code sample shows **how to electronically sign a PDF document with Combobox form field signatures using C#**.

{{< gist conholdate-gists f2414bdfc9df3a0335ba4d8e8b2db917 "ElectronicallySignPDF_CSharp_ComboboxFormFieldSignature.cs" >}}

The [ComboboxFormFieldSignature][18] class provides combo-box input form field signature properties for the PDF Documents.

### Sign PDF Documents with Checkbox Form Field Signatures {#Sign-PDF-Documents-with-Checkbox-Form-Field-Signatures}

You can sign PDF documents with Checkbox form field signatures by following the same steps mentioned earlier. However, you need to create an instance of _CheckboxFormFieldSignature_ instead of _TextFormFieldSignature_.

The following code sample shows **how to electronically sign a PDF document with checkbox form field signatures**.

{{< gist conholdate-gists f2414bdfc9df3a0335ba4d8e8b2db917 "ElectronicallySignPDF_CSharp_CheckboxFormFieldSignature.cs" >}}

The [CheckboxFormFieldSignature][19] class provides check-box input form field signature properties for the PDF Documents.

### Sign PDF Documents with Digital Form Field Signatures {#Sign-PDF-Documents-with-Digital-Form-Field-Signatures}

You can sign PDF documents with digital form field signatures by following the same steps mentioned earlier. However, you need to create an instance of _DigitalFormFieldSignature_ instead of _TextFormFieldSignature_.

The following code sample shows **how to electronically sign a PDF document with digital form field signatures**.

{{< gist conholdate-gists f2414bdfc9df3a0335ba4d8e8b2db917 "ElectronicallySignPDF_CSharp_DigitalFormFieldSignature.cs" >}}

The [DigitalFormFieldSignature][20] class provides&nbsp;digital signature input form field properties for the PDF Documents. The user shall be able to sign documents with his own digital signatures in this field.

## Sign PDF Documents with Multiple Form Field Signatures using C# {#Sign-PDF-Documents-with-Multiple-Form-Field-Signatures-using-CSharp}

You can electronically sign your PDF documents with multiple form field signatures programmatically by following the simple steps mentioned below:

  * Create an instance of the&nbsp;_[Signature][13]&nbsp;_class
  * Provide path of the input PDF document
  * Define a list of the&nbsp;_[SignOptions][21]_
  * Create the&nbsp;_FormFieldSignature&nbsp;_objects
  * Create instances of the&nbsp;_[FormFieldSignOptions][14]&nbsp;_for the created&nbsp;_FormFieldSignature&nbsp;_objects
  * Set required sign options such as position (Margin, Height, Width, etc.) for each object
  * Add&nbsp;_FormFieldSignOptions&nbsp;_objects to the&nbsp;_SignOptions&nbsp;_list
  * Call the&nbsp;[_Sign()_][22]&nbsp;method with the&nbsp;_SignOptions&nbsp;_and output file path

The following code sample shows&nbsp;**how to electronically sign a PDF document with multiple form field signatures using C#**.

{{< gist conholdate-gists f2414bdfc9df3a0335ba4d8e8b2db917 "ElectronicallySignPDF_CSharp_FormFieldSignatures.cs" >}}

{{< figure align=center src="images/Sign-PDF-Documents-with-Form-Field-Signatures-using-CSharp-1024x987.jpg" alt="Sign PDF Documents with Multiple Form Field Signatures using C#" caption="Sign PDF Documents with Multiple Form Field Signatures using C#">}}
 

The [Sign()][22] method of the _**Signature**_ class is used to sign the document with a list of SignOptions. The [SignOptions][21] class allows setting the signature options such as appearance, signature types, etc.

The [FormFieldSignOptions][14] class provides the Form Field signature options for the PDF documents. You can define the form field options such as HorizontalAlignment, VerticalAlignment, Margin, Height, and Width. You need to provide the defined object of one of the FormFieldSignature classes while creating the instance of the FormFieldSignOptions class.

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][24].

## Conclusion

In this article, you have learned **how to create a PDF with Form Field Signatures using C#**. You have also learned **how to electronically sign PDF documents with various Form Field Signature types** programmatically. You can learn more about GroupDocs.Signature for .NET API using the [documentation][25]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][26].

## See Also

  * [Generate Barcode in C#][27]
  * [Sign Documents with Digital Certificate using C#][28]
  * [Generate QR Codes in C#][29]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/sign-pdf-with-form-field-signatures-using-csharp.jpg
 [2]: #api-for-signing-documents
 [3]: #Sign-PDF-Documents-with-Form-Field-Signatures-using-CSharp
 [4]: #Sign-PDF-Documents-with-Multiple-Form-Field-Signatures-using-CSharp
 [5]: https://products.groupdocs.com/signature/net
 [6]: https://docs.fileformat.com/pdf/
 [7]: https://docs.groupdocs.com/signature/net/supported-document-formats/
 [8]: #Sign-PDF-Documents-with-Text-Form-Field-Signatures
 [9]: #Sign-PDF-Documents-with-Radio-Button-Form-Field-Signatures
 [10]: #Sign-PDF-Documents-with-Combobox-Form-Field-Signatures
 [11]: #Sign-PDF-Documents-with-Checkbox-Form-Field-Signatures
 [12]: #Sign-PDF-Documents-with-Digital-Form-Field-Signatures
 [13]: https://apireference.groupdocs.com/signature/net/groupdocs.signature/signature
 [14]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.options/formfieldsignoptions
 [15]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.signature/sign/methods/4
 [16]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.domain/textformfieldsignature
 [17]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.domain/radiobuttonformfieldsignature
 [18]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.domain/comboboxformfieldsignature
 [19]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.domain/checkboxformfieldsignature
 [20]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.domain/digitalformfieldsignature
 [21]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.options/signoptions
 [22]: https://apireference.groupdocs.com/signature/net/groupdocs.signature.signature/sign/methods/6
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/08/Sign-PDF-Documents-with-Form-Field-Signatures-using-CSharp.jpg
 [24]: https://purchase.groupdocs.com/temporary-license
 [25]: https://docs.groupdocs.com/signature/net/
 [26]: https://forum.groupdocs.com/c/signature/
 [27]: https://blog.groupdocs.com/2021/07/14/generate-barcode-in-csharp-to-sign-documents-and-images/
 [28]: https://blog.groupdocs.com/2021/03/11/sign-documents-with-digital-certificate-using-csharp/
 [29]: https://blog.groupdocs.com/2021/01/27/generate-qr-codes-in-csharp-to-sign-documents-and-images/




