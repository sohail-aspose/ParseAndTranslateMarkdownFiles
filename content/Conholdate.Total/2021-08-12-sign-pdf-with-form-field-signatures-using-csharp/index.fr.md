---
title: "Signer un PDF avec des signatures de champ de formulaire à l'aide de C#"
author: Muzammil Khan
date: 2021-08-12T06:03:00+00:00
summary: "En tant que développeur C#, vous pouvez facilement créer des documents PDF à remplir et à signer électroniquement par les utilisateurs. Dans cet article, vous apprendrez <strong>à signer électroniquement des documents PDF avec des signatures de champ de formulaire à l'aide de C#</strong> ."
url: /2021/08/12/sign-pdf-with-form-field-signatures-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "GroupDocs.Signature pour .NET"
  - "Signatures de champ de formulaire PDF"
  - "Signer le fichier PDF"
  - "Signer un PDF avec des signatures de champ de formulaire"

---


{{< figure align=center src="images/sign-pdf-with-form-field-signatures-using-csharp.jpg" alt="Signer un PDF avec des signatures de champ de formulaire à l'aide de C#">}}
 

Les champs de formulaire sont différents types de champs de données utilisés pour collecter des informations auprès des utilisateurs. En tant que développeur C#, vous pouvez facilement créer des documents PDF à remplir et à signer électroniquement par les utilisateurs. Cela peut être utile pour recueillir les commentaires des clients, le consentement des partenaires, etc. Dans cet article, vous apprendrez **comment signer électroniquement des documents PDF avec des signatures de champ de formulaire à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour la signature de documents PDF][2]
  * [Signer des documents PDF avec des signatures de champ de formulaire à l'aide de C#][3]
  * [Signer des documents PDF avec plusieurs signatures de champs de formulaire à l'aide de C#][4]

## API C# pour la signature de documents PDF {#api-for-signing-documents}

J'utiliserai l'API [GroupDocs.Signature pour .NET][5] pour signer les documents [PDF][6] activés avec les signatures de champ de formulaire. L'API vous permet d'ajouter des signatures numériques aux [formats de documents pris en charge] [7] et d'implémenter des types de signatures électroniques populaires dans vos applications .NET. Il vous permet également, avec des options de recherche simples et avancées, de localiser vos signatures requises sur un document.
## Signer des documents PDF avec des signatures de champ de formulaire à l'aide de C# {#Sign-PDF-Documents-with-Form-Field-Signatures-using-CSharp}

Vous pouvez signer électroniquement vos documents PDF à l'aide des types de signatures de champ de formulaire suivants par programmation :
  * [Signatures de champ de formulaire de texte][8]
  * [Signatures de champ de formulaire de bouton radio][9]
  * [Signatures de champ de formulaire Combobox][10]
  * [Case à cocher Champ de formulaire Signatures][11]
  * [Signatures de champ de formulaire numérique][12]

### Signer des documents PDF avec des signatures de champ de texte {#Sign-PDF-Documents-with-Text-Form-Field-Signatures}
Vous pouvez signer des documents PDF avec des signatures de champ de formulaire texte en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la _[Signature][13] _class
  * Indiquez le chemin du document PDF d'entrée
  * Créer une instance de la classe _TextFormFieldSignature_
  * Créez une instance de la classe _[FormFieldSignOptions][14]_ avec l'objet _TextFormFieldSignature_
  * Définissez les options de signe requises telles que la marge, la hauteur, la largeur, etc.
  * Appelez la méthode [_Sign()_][15] avec les _FormFieldSignOptions_ et le chemin du fichier de sortie

L'exemple de code suivant montre **comment signer électroniquement un document PDF avec des signatures de champs de formulaire de texte à l'aide de C#**.
```
// créer une instance de Signature
Signature signature = new Signature(@"C:\Files\sample.pdf");

// instancier la signature du champ de formulaire de texte
TextFormFieldSignature textSignature = new TextFormFieldSignature("textBoxData1", "Enter Your Name");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextFF = new FormFieldSignOptions(textSignature);
optionsTextFF.HorizontalAlignment = HorizontalAlignment.Center;
optionsTextFF.VerticalAlignment = VerticalAlignment.Top;
optionsTextFF.Margin = new Padding(20, 0, 170, 0);
optionsTextFF.Height = 50;
optionsTextFF.Width = 200;

// signer le document à classer
signature.Sign(@"C:\Files\TextFormFieldSignature.pdf", optionsTextFF);
```

La classe [Signature][13] est la classe principale qui contrôle le processus de signature du document. Il fournit diverses méthodes pour signer, rechercher, supprimer ou vérifier les signatures dans un document. La méthode [Sign()][15] de cette classe est utilisée pour signer le document avec les SignOptions définies.
La classe [TextFormFieldSignature][16] fournit des propriétés de signature de champ de formulaire de saisie de texte pour les documents PDF.
### Signer des documents PDF avec des signatures de champ de formulaire de bouton radio {#Sign-PDF-Documents-with-Radio-Button-Form-Field-Signatures}
Vous pouvez signer des documents PDF avec les signatures de champ de formulaire de bouton radio en suivant les étapes mentionnées précédemment. Cependant, vous devez créer une instance de la classe _RadioButtonFormFieldSignature_ au lieu de _TextFormFieldSignature_.
L'exemple de code suivant montre **comment signer électroniquement un document PDF avec des signatures de champ de formulaire de bouton radio à l'aide de C#**.
```
// créer une instance de Signature
Signature signature = new Signature(@"C:\Files\sample.pdf");

// instancier la signature de champ de formulaire de bouton radio
List<string> radioOptions = new List<string>() { "Male", "Female" };
RadioButtonFormFieldSignature rbSignature = new RadioButtonFormFieldSignature("radioData1", radioOptions, "Male");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextRB = new FormFieldSignOptions(rbSignature);
optionsTextRB.HorizontalAlignment = HorizontalAlignment.Center;
optionsTextRB.VerticalAlignment = VerticalAlignment.Top;
optionsTextRB.Margin = new Padding(20, 0, 170, 0);
optionsTextRB.Height = 50;
optionsTextRB.Width = 200;

// signer le document à classer
signature.Sign(@"C:\Files\RadioButtonFormFieldSignature.pdf", optionsTextRB);
```

La classe [RadioButtonFormFieldSignature] [17] fournit des propriétés de signature de champ de formulaire de saisie de bouton radio pour les documents PDF.
### Signer des documents PDF avec des signatures de champs de formulaire Combobox {#Sign-PDF-Documents-with-Combobox-Form-Field-Signatures}
Vous pouvez signer des documents PDF avec des signatures de champ de formulaire Combobox en suivant les étapes mentionnées précédemment. Cependant, vous devez créer une instance de _ComboboxFormFieldSignature_ au lieu de _TextFormFieldSignature_.
L'exemple de code suivant montre **comment signer électroniquement un document PDF avec des signatures de champ de formulaire Combobox à l'aide de C#**.
```
// créer une instance de Signature
Signature signature = new Signature(@"C:\Files\sample.pdf");

// instancier la signature de champ de formulaire de zone de liste déroulante
List<string> items = new List<string>() { "Australia", "United Kingdom", "United States" };
ComboboxFormFieldSignature cmbSignature = new ComboboxFormFieldSignature("combo1", items, "Australia");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextCMB = new FormFieldSignOptions(cmbSignature);
optionsTextCMB.HorizontalAlignment = HorizontalAlignment.Center;
optionsTextCMB.VerticalAlignment = VerticalAlignment.Top;
optionsTextCMB.Margin = new Padding(20, 0, 238, 0);
optionsTextCMB.Height = 20;
optionsTextCMB.Width = 200;

// signer le document à classer
signature.Sign(@"C:\Files\ComboboxFormFieldSignature.pdf", optionsTextCMB);
```

La classe [ComboboxFormFieldSignature][18] fournit des propriétés de signature de champ de formulaire de saisie de zone de liste déroulante pour les documents PDF.
### Signer des documents PDF avec des signatures de champ de formulaire à cocher {#Sign-PDF-Documents-with-Checkbox-Form-Field-Signatures}
Vous pouvez signer des documents PDF avec des signatures de champ de formulaire Checkbox en suivant les mêmes étapes mentionnées précédemment. Cependant, vous devez créer une instance de _CheckboxFormFieldSignature_ au lieu de _TextFormFieldSignature_.
L'exemple de code suivant montre **comment signer électroniquement un document PDF avec des signatures de champ de formulaire de case à cocher**.
```
// créer une instance de Signature
Signature signature = new Signature(@"C:\Files\sample.pdf");

List<SignOptions> listOptions = new List<SignOptions>();

// instancier la signature du champ de formulaire de texte
CheckboxFormFieldSignature chbSignature = new CheckboxFormFieldSignature("chbData1", true);
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextCHB = new FormFieldSignOptions(chbSignature);
optionsTextCHB.HorizontalAlignment = HorizontalAlignment.Center;
optionsTextCHB.VerticalAlignment = VerticalAlignment.Top;
optionsTextCHB.Margin = new Padding(20, 0, 270, 0);
optionsTextCHB.Height = 20;
optionsTextCHB.Width = 20;

// signer le document à classer
signature.Sign(@"C:\Files\CheckboxFormFieldSignature.pdf", optionsTextCHB);
```

La classe [CheckboxFormFieldSignature] [19] fournit des propriétés de signature de champ de formulaire de saisie de case à cocher pour les documents PDF.
### Signer des documents PDF avec des signatures de champ de formulaire numérique {#Sign-PDF-Documents-with-Digital-Form-Field-Signatures}
Vous pouvez signer des documents PDF avec des signatures de champ de formulaire numérique en suivant les mêmes étapes mentionnées précédemment. Cependant, vous devez créer une instance de _DigitalFormFieldSignature_ au lieu de _TextFormFieldSignature_.
L'exemple de code suivant montre **comment signer électroniquement un document PDF avec des signatures de champ de formulaire numérique**.
```
// créer une instance de Signature
Signature signature = new Signature(@"C:\Files\sample.pdf");

// instancier la signature du champ de formulaire de texte
DigitalFormFieldSignature digSignature = new DigitalFormFieldSignature("dgData1");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextDIG = new FormFieldSignOptions(digSignature);
optionsTextDIG.HorizontalAlignment = HorizontalAlignment.Center;
optionsTextDIG.VerticalAlignment = VerticalAlignment.Top;
optionsTextDIG.Margin = new Padding(20, 0, 300, 0);
optionsTextDIG.Height = 50;
optionsTextDIG.Width = 200;
optionsTextDIG.ForeColor = System.Drawing.Color.Yellow;

// signer le document à classer
signature.Sign(@"C:\Files\DigitalFormFieldSignature.pdf", optionsTextDIG);
```

La classe [DigitalFormFieldSignature][20] fournit des propriétés de champ de formulaire de saisie de signature numérique pour les documents PDF. L'utilisateur doit pouvoir signer des documents avec ses propres signatures numériques dans ce champ.
## Signer des documents PDF avec plusieurs signatures de champs de formulaire à l'aide de C# {#Sign-PDF-Documents-with-Multiple-Form-Field-Signatures-using-CSharp}

Vous pouvez signer électroniquement vos documents PDF avec plusieurs signatures de champs de formulaire par programmation en suivant les étapes simples mentionnées ci-dessous :
  * Créer une instance de la _[Signature][13] _class
  * Indiquez le chemin du document PDF d'entrée
  * Définissez une liste des _[SignOptions][21]_
  * Créer les _FormFieldSignature _objects
  * Créer des instances de _[FormFieldSignOptions][14] _pour les _FormFieldSignature _objects créés
  * Définissez les options de signe requises telles que la position (marge, hauteur, largeur, etc.) pour chaque objet
  * Ajouter _FormFieldSignOptions _objects à la _SignOptions _list
  * Appelez la méthode [_Sign()_][22] avec les _SignOptions _et le chemin du fichier de sortie

L'exemple de code suivant montre **comment signer électroniquement un document PDF avec plusieurs signatures de champ de formulaire à l'aide de C#**.
```
// créer une instance de Signature
Signature signature = new Signature(@"C:\Files\sample.pdf");

List<SignOptions> listOptions = new List<SignOptions>();

// instancier la signature du champ de formulaire de texte
TextFormFieldSignature textSignature = new TextFormFieldSignature("tbData1", "Enter Your Name");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextFF = new FormFieldSignOptions(textSignature)
{
    HorizontalAlignment = HorizontalAlignment.Center,
    VerticalAlignment = VerticalAlignment.Top,
    Margin = new Padding(20, 0, 138, 0),
    Height = 20,
    Width = 200
};

// instancier la signature de champ de formulaire de bouton radio
List<string> radioOptions = new List<string>() { "Male", "Female" };
RadioButtonFormFieldSignature rbSignature = new RadioButtonFormFieldSignature("radioData1", radioOptions, "Male");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextRB = new FormFieldSignOptions(rbSignature)
{
    HorizontalAlignment = HorizontalAlignment.Center,
    VerticalAlignment = VerticalAlignment.Top,
    Margin = new Padding(20, 0, 170, 0),
    Height = 50,
    Width = 200,
};

// instancier la signature de champ de formulaire de zone de liste déroulante
List<string> items = new List<string>() { "Australia", "United Kingdom", "United States" };
ComboboxFormFieldSignature cmbSignature = new ComboboxFormFieldSignature("combo1", items, "Australia");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextCMB = new FormFieldSignOptions(cmbSignature)
{
    HorizontalAlignment = HorizontalAlignment.Center,
    VerticalAlignment = VerticalAlignment.Top,
    Margin = new Padding(20, 0, 238, 0),
    Height = 20,
    Width = 200,
};

// instancier la signature du champ de formulaire de texte
CheckboxFormFieldSignature chbSignature = new CheckboxFormFieldSignature("chbData1", true);
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextCHB = new FormFieldSignOptions(chbSignature)
{
    HorizontalAlignment = HorizontalAlignment.Center,
    VerticalAlignment = VerticalAlignment.Top,
    Margin = new Padding(20, 0, 270, 0),
    Height = 20,
    Width = 20,
};


// instancier la signature de champ de formulaire numérique
DigitalFormFieldSignature digSignature = new DigitalFormFieldSignature("dgData1");
// options d'instanciation basées sur la signature du champ de formulaire de texte
FormFieldSignOptions optionsTextDIG = new FormFieldSignOptions(digSignature)
{
    HorizontalAlignment = HorizontalAlignment.Center,
    VerticalAlignment = VerticalAlignment.Top,
    Margin = new Padding(20, 0, 300, 0),
    Height = 50,
    Width = 200,
};

// ajouter des champs de formulaire à la liste des options de signature
listOptions.Add(optionsTextFF);
listOptions.Add(optionsTextCHB);
listOptions.Add(optionsTextRB);
listOptions.Add(optionsTextCMB);
listOptions.Add(optionsTextDIG);

// signer le document à classer
signature.Sign(@"C:\Files\Signature\sample_output.pdf", listOptions);
```

{{< figure align=center src="images/Sign-PDF-Documents-with-Form-Field-Signatures-using-CSharp-1024x987.jpg" alt="Signer des documents PDF avec plusieurs signatures de champs de formulaire à l'aide de C#" caption="Signer des documents PDF avec plusieurs signatures de champs de formulaire à l'aide de C#">}}
 

La méthode [Sign()][22] de la classe _**Signature**_ est utilisée pour signer le document avec une liste de SignOptions. La classe [SignOptions][21] permet de définir les options de signature telles que l'apparence, les types de signature, etc.
La classe [FormFieldSignOptions][14] fournit les options de signature de champ de formulaire pour les documents PDF. Vous pouvez définir les options de champ de formulaire telles que HorizontalAlignment, VerticalAlignment, Margin, Height et Width. Vous devez fournir l'objet défini de l'une des classes FormFieldSignature lors de la création de l'instance de la classe FormFieldSignOptions.
## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][24].
## Conclusion

Dans cet article, vous avez appris **comment créer un PDF avec des signatures de champ de formulaire à l'aide de C#**. Vous avez également appris **comment signer électroniquement des documents PDF avec différents types de signature de champ de formulaire** par programmation. Vous pouvez en savoir plus sur l'API GroupDocs.Signature pour .NET à l'aide de la [documentation][25]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][26].
## See Also

  * [Générer un code-barres en C#][27]
  * [Signer des documents avec un certificat numérique à l'aide de C#][28]
  * [Générer des codes QR en C#][29]

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





