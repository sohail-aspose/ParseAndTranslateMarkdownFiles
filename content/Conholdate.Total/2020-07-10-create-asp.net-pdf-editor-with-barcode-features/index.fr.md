---
title: Create ASP.NET PDF Editor with Barcode Features
author: Muhammad Sohail
date: 2020-07-10T23:31:48+00:00
url: /2020/07/10/create-asp.net-pdf-editor-with-barcode-features/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "asp.net éditeur pdf"
  - "asp.net éditeur pdf" with barcode
  - "créer un pdf avec un code à barres dans asp.net"
  - "générer des factures pdf avec code barre"

---
Le [PDF][1] (Portable Document Format) est devenu l'un des formats les plus utilisés dans le monde des documents numériques. Diverses industries utilisent le format PDF pour générer leurs rapports, factures, factures et autres types de documents commerciaux. Le code-barres, en revanche, est devenu un élément essentiel de l'entreprise qui contient des informations sous une forme lisible par machine. De nos jours, vous pouvez même trouver un code-barres sur vos factures et factures. Dans cet article, je vais présenter un cas d'utilisation où vous devez créer un fichier PDF et y intégrer un code-barres, par exemple lors de la génération d'une facture. Pour la démonstration, je vais créer un éditeur PDF ASP.NET à l'aide duquel vous pourrez générer les fichiers PDF et les codes-barres à l'aide de C # dans l'application Web ASP.NET Core.
Cette application Web ASP.NET aura les fonctionnalités suivantes :
  * Un éditeur WYSIWYG pour écrire le contenu du document PDF.
  * Option pour générer un code-barres basé sur le texte fourni.
  * Option pour définir la symbologie souhaitée du code à barres.

## Prerequisites for Generating PDFs having Barcode in ASP.NET

Voici les outils et les API dont vous auriez besoin pour créer l'éditeur PDF ASP.NET doté de fonctionnalités de code-barres.
  * Visual Studio 2017 ou version ultérieure.
  * [Aspose.PDF pour .NET][2] &#8211; A .NET PDF API.
  * [Aspose.BarCode pour .NET][3] &#8211; .NET Barcode Generator and Scanner API.

## Create ASP.NET PDF Editor with Barcode Features

Commençons notre voyage et voyons comment créer notre éditeur PDF ASP.NET qui permettra de générer des PDF et d'intégrer des codes-barres en un seul clic.
  * Créez une nouvelle **application Web ASP.NET Core** dans Visual Studio.

{{< figure align=center src="images/ASP.NET-Core-MVC-Web-Application.jpg" alt="Créer une application Web ASP.NET Core">}} 

  * Sélectionnez **Application Web (Modèle-Vue-Contrôleur)** dans les modèles.

{{< figure align=center src="images/MVC-Project-Template.jpg" alt="ASP.NET MVC">}} 

  * Installez les packages de **Aspose.PDF**, **Aspose.BarCode** et **CKEditor**.

{{< figure align=center src="images/NPM-.jpg" alt="Ajouter les API PDF et code-barres Aspose .NET">}} 

  * Téléchargez le [package][4] de CKEditor, extrayez-le et copiez/collez le dossier dans le répertoire **wwwroot**. Vous pouvez également intégrer n'importe lequel de vos éditeurs HTML WYSIWYG préférés en fonction de vos besoins.

  * Ajoutez le script suivant dans la vue **Views/Home/index.cshtml**.

<pre class="EnlighterJSRAW" data-enlighter-language="html" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> @{ViewData["Titre"] = "Créateur PDF" ;}<script src="~/ckeditor/ckeditor.js"></script><br /><form method="post"><div class="ligne"><div class="col-md-12"><textarea name="editor1" id="editor1" rows="80" cols="80">Commencez à créer votre document PDF.</textarea>            <br /><script>// Remplace le <textarea id="editor1"> par un CKEditor// instance, en utilisant la configuration par défaut.CKEDITOR.replace('editor1');</script></div><hr /></div><div class="ligne"><div class="col-md-12"><h3>Créer un code-barres</h3></div></div><hr /><div class="ligne"><div class="col-md-9 form-horizontal" align="center"><div class="form-group"><label class="control-label col-sm-2" for="CodeText">Texte du code</label><div class="col-sm-10"><input class="form-control" type="text" name="codeText" id="codeText" placeholder="Code text" />        </div>    </div><div class="form-group"><label class="control-label col-sm-2" for="barcodeType">Symbologie</label><div class="col-sm-10"><select name="barcodeType" class="form-control"><option value="Code128">Code128</option><option value="Code11">Code11</option><option value="QR">QR</option><option value="Pdf417">Pdf417</option><option value="Datamatrix">Datamatrix</option></select>        </div>    </div></div></div><hr /><div class="ligne"><div class="col-md-12" align="center"><input type="submit" class="btn btn-lg btn-success" value="Générer un PDF" /></div></div></form></pre>
  * Ajoutez les méthodes suivantes dans **Controllers/HomeController.cs**.

<pre class="EnlighterJSRAW" data-enlighter-language="csharp" data-enlighter-theme="" data-enlighter-highlight="" data-enlighter-linenumbers="" data-enlighter-lineoffset="" data-enlighter-title="" data-enlighter-group=""> [HttpPost]public FileResult Index(string editor1, string codeText, string barcodeType){// génère un code barrestring barcodeImagePath = Path.Combine("wwwroot/barcodes/", Guid.NewGuid() + ".png");SymbologyEncodeType type = GetBarcodeSymbology(barcodeType);BarcodeGenerator generator = new BarcodeGenerator(type, codeText);generator.Parameters.BackColor = System.Drawing.Color.Transparent ;// définit la résolution de l'image du code-barresgénérateur.Paramètres.Résolution = 200 ;// génère un code barregénérateur.Save(barcodeImagePath, BarCodeImageFormat.Png);
// crée un nom de fichier unique pour le PDFchaîne fileName = Guid.NewGuid() + ".pdf" ;// convertit le texte HTML en fluxbyte[] byteArray = Encoding.UTF8.GetBytes(editor1);// génère un PDF à partir du HTMLflux MemoryStream = new MemoryStream(byteArray);Options HtmlLoadOptions = new HtmlLoadOptions();Document pdfDocument = nouveau Document(flux, options);
// ajoute l'image du code-barres au PDF générépdfDocument = InsertImage(pdfDocument, barcodeImagePath);
// crée un flux mémoire pour le fichier PDFFlux de sortieStream = new MemoryStream();// enregistre le PDF dans le flux de sortiepdfDocument. Enregistrer (flux de sortie);
// renvoie le fichier PDF généréreturn File(outputStream, System.Net.Mime.MediaTypeNames.Application.Pdf, fileName);}Privé SymbologyEncodeType GetBarcodeSymbology (symbologie de chaîne){if (symbology.ToLower() == "qr")renvoie EncodeTypes.QR ;sinon si (symbology.ToLower() == "code128")retourner EncodeTypes.Code128 ;sinon si (symbology.ToLower() == "code11")retourner EncodeTypes.Code11 ;sinon si (symbology.ToLower() == "pdf417")retourner EncodeTypes.Pdf417 ;sinon si (symbology.ToLower() == "datamatrix")retourner EncodeTypes.DataMatrix ;autreretourner EncodeTypes.Code128 ; // type de code-barres par défaut}Document privé InsertImage(Document document, string barcodeImagePath){// récupère la page de la collection Pages du fichier PDFAspose.Pdf.Page page = document.Pages[1];// crée une instance d'imageAspose.Pdf.Image img = new Aspose.Pdf.Image();img.IsInLineParagraph = true;// définit la largeur et la hauteur de l'image en pointsimg.FixWidth = 100 ;img.FixHeight = 100;img.HorizontalAlignment = HorizontalAlignment.Right ;img.VerticalAlignment = VerticalAlignment.Top ;// définit le type d'image comme SVGimg.FileType = Aspose.Pdf.ImageFileType.Unknown ;// chemin du fichier image du code-barres sourceimg.File = barcodeImagePath;page.Paragraphes.Add(img);// renvoie le document PDF mis à jourdocument de retour ;}</pre>
  * Créez l'application et exécutez-la dans votre navigateur préféré.

{{< figure align=center src="images/Generate-PDF-with-Barcode-in-ASP.NET_.jpg" alt="Éditeur PDF ASP.NET avec fonctionnalités de code-barres">}} 

## Generating a PDF with ASP.NET PDF Editor

Voici les étapes ainsi que la démonstration de la façon de générer un fichier PDF et d'intégrer un code-barres en un seul clic.
  * Écrivez ou copiez/collez le contenu du document PDF dans la zone de l'éditeur.
  * Définissez le texte du code pour générer le code-barres.
  * Sélectionnez la symbologie de code-barres souhaitée (voir toutes les [symbologies de code-barres prises en charge][5]).
  * Cliquez sur le bouton **Générer un PDF** pour créer le PDF contenant un code-barres. <figure class="wp-block-embed-youtube wp-block-embed is-type-video is-provider-youtube wp-embed-aspect-4-3 wp-has-aspect-ratio">

<div class="wp-block-embed__wrapper"></div></figure>
## Download Source Code

Vous pouvez télécharger le code source complet de cet éditeur PDF ASP.NET depuis [ici][6].
## Try Aspose APIs for Free

Obtenez votre [licence temporaire][7] et essayez nos API gratuitement pendant un mois.
## See Also

  * [Créez votre propre application de type Google Docs dans ASP.NET][8]

 [1]: https://docs.fileformat.com/pdf/
 [2]: https://products.aspose.com/pdf/net
 [3]: https://products.aspose.com/barcode/net
 [4]: https://ckeditor.com/ckeditor-4/download/
 [5]: https://docs.aspose.com/display/barcodenet/Barcode+Supported+Symbologies
 [6]: https://github.com/usman-aziz/ASP.NET-PDF-Editor-with-Barcode
 [7]: https://purchase.conholdate.com/temporary-license
 [8]: https://blog.conholdate.com/2020/06/22/build-your-own-google-docs-like-app/





