---
title: "Ajouter des en-têtes et des pieds de page dans un PDF à l'aide de C #"
author: Muzammil Khan
date: 2021-12-15T04:38:40+00:00
summary: "En tant que développeur C#, vous pouvez ajouter du texte ou une image dans les en-têtes et pieds de page des documents PDF. Dans cet article, vous apprendrez <strong>à ajouter des en-têtes et des pieds de page dans des documents PDF à l'aide de C#</strong> ."
url: /2021/12/15/add-headers-and-footers-in-pdf-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Ajouter des en-têtes et des pieds de page dans CSharp"
  - "Ajouter une image dans les pieds de page à l'aide de CSharp"
  - "Ajouter une image dans les en-têtes à l'aide de CSharp"
  - "Ajouter des numéros de page dans le pied de page à l'aide de CSharp"
  - "Ajouter du texte dans les pieds de page à l'aide de CSharp"
  - "Ajouter du texte dans les en-têtes à l'aide de CSharp"

---


{{< figure align=center src="images/add-headers-and-footers-in-pdf-using-csharp.jpg" alt="Ajouter des en-têtes et des pieds de page dans un PDF à l'aide de C #">}}
 

Les sections d'en-tête et de pied de page d'un document affichent des informations sur le document, telles que le titre du document, le logo, le titre du chapitre, les numéros de page, etc. Nous pouvons ajouter n'importe quel texte ou image dans les en-têtes/pieds de page du document PDF par programmation. Dans cet article, nous allons apprendre **comment ajouter des en-têtes et des pieds de page dans des documents PDF à l'aide de C#**.
Les sujets suivants seront traités dans cet article :
<ul id="CSharp-API-to-Add-Graphs-in-PDF-Documents"><li><a href="#CSharp-API-to-Add-Headers-and-Footers-in-PDF-Documents">API C# pour ajouter des en-têtes et des pieds de page dans les documents PDF</a></li><li><a href="#Add-Text-in-Header-of-PDF-using-CSharp">Ajouter du texte dans l'en-tête du PDF à l'aide de C #</a></li><li><a href="#Add-Text-in-Footer-of-PDF-using-CSharp">Ajouter du texte dans le pied de page du PDF à l'aide de C#</a></li><li><a href="#Insert-Image-in-Header-of-PDF-using-CSharp">Insérer une image dans l'en-tête du PDF à l'aide de C #</a></li><li><a href="#Insert-Image-in-Footer-of-PDF-using-CSharp">Insérer une image dans le pied de page du PDF à l'aide de C#</a></li><li><a href="#Add-Different-Headers-and-Footers-on-Different-Pages">Ajouter différents en-têtes et pieds de page sur différentes pages</a></li><li><a href="#Add-Page-Numbers-in-Footer-of-PDF-using-CSharp">Ajouter des numéros de page dans le pied de page du PDF à l'aide de C#</a></li></ul>
## API C# pour ajouter des en-têtes et des pieds de page dans les documents PDF {#CSharp-API-to-Add-Headers-and-Footers-in-PDF-Documents}

Pour ajouter des en-têtes et des pieds de page dans les fichiers [PDF][2], nous utiliserons [Aspose.PDF pour .NET API][3]. Il nous permet de générer, modifier, convertir, restituer, sécuriser et imprimer [documents pris en charge][4] sans utiliser Adobe Acrobat. Veuillez soit [télécharger][5] la DLL de l'API ou l'installer à l'aide de [NuGet][6].
<pre class="wp-block-code"><code>Install-Package Aspose.PDF</code></pre>
## Ajouter du texte dans l'en-tête du PDF à l'aide de C # {#Add-Text-in-Header-of-PDF-using-CSharp}

Nous pouvons ajouter du texte dans l'en-tête d'un document PDF existant en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe [**_Document_**][7] avec le chemin du fichier d'entrée comme argument. C'est la classe principale qui représente un document PDF et permet d'effectuer diverses fonctionnalités.
  2. Ensuite, créez une instance de la classe _**[TextStamp][8]**_ avec un texte à afficher dans l'en-tête du document.
  3. Ensuite, définissez diverses propriétés telles que _TopMargin_, _HorizontalAlignment_ et _VerticalAlignment_ comme Top, etc.
  4. Facultativement, définissez les niveaux _ForegroundColor_, _Font_, _FontStyle_, _FontSize_, _BackgroundColor_, _RotateAngle_ et _Zoom_ pour le texte.
  5. Après cela, parcourez toutes les pages et ajoutez un en-tête à l'aide de la méthode **_[Page.AddStamp()][9]_** avec l'objet _TextStamp_.
  6. Enfin, appelez la méthode **_[Document.Save()][10]_** avec le chemin du fichier de sortie comme argument pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment ajouter du texte dans l'en-tête d'un document PDF à l'aide de C#**.
```
// Cet exemple de code montre comment ajouter du texte dans l'en-tête d'un document PDF existant.
// Charger le document PDF
Document pdfDocument = new Document(@"C:\Files\sample.pdf");

// Créer un en-tête
TextStamp textStamp = new TextStamp("Header Text");

// Définir les propriétés du tampon
textStamp.TopMargin = 10;
textStamp.HorizontalAlignment = HorizontalAlignment.Center;
textStamp.VerticalAlignment = VerticalAlignment.Top;

// Spécifiez le style de police
textStamp.TextState.FontStyle = FontStyles.Bold;
textStamp.TextState.ForegroundColor = Color.Red;
textStamp.TextState.FontSize = 14;
textStamp.TextState.BackgroundColor = Color.Pink;
textStamp.TextState.Font = FontRepository.FindFont("Verdana");

// Ajouter un en-tête sur toutes les pages
foreach (Page page in pdfDocument.Pages)
{
    page.AddStamp(textStamp);
}

// Enregistrer le document mis à jour
pdfDocument.Save(@"C:\Files\output.pdf");
```

{{< figure align=center src="images/Add-Text-In-Header-of-PDF-using-CSharp.jpg" alt="Ajouter du texte dans l'en-tête du PDF à l'aide de C #." caption="Ajouter du texte dans l'en-tête du PDF à l'aide de C #.">}}
 

## Ajouter du texte dans le pied de page du PDF à l'aide de C # {#Add-Text-in-Footer-of-PDF-using-CSharp}

Nous pouvons ajouter du texte dans le pied de page des documents PDF par programmation en suivant les étapes mentionnées précédemment. Cependant, nous devons définir _BottomMargin_ et _VerticalAlignment_ comme Bas pour afficher le texte dans le pied de page.
L'exemple de code suivant montre ****comment ajouter du texte dans le pied de page d'un document PDF à l'aide de C#**.**
```
// Cet exemple de code montre comment ajouter du texte dans le pied de page d'un document PDF existant.
// Charger le document PDF
Document pdfDocument = new Document(@"C:\Files\sample.pdf");

// Créer un pied de page
TextStamp textStamp = new TextStamp("Footer Text");

// Définir les propriétés du tampon
textStamp.BottomMargin = 10;
textStamp.HorizontalAlignment = HorizontalAlignment.Center;
textStamp.VerticalAlignment = VerticalAlignment.Bottom;

// Ajouter un pied de page sur toutes les pages
foreach (Page page in pdfDocument.Pages)
{
    page.AddStamp(textStamp);
}

// Enregistrer le document mis à jour
pdfDocument.Save(@"C:\Files\output.pdf");
```

{{< figure align=center src="images/Add-Text-In-Footer-of-PDF-using-CSharp-1024x396.jpg" alt="Ajouter du texte dans le pied de page du PDF à l'aide de C #." caption="Ajouter du texte dans le pied de page du PDF à l'aide de C #.">}}
 

## Insérer une image dans l'en-tête du PDF à l'aide de C# {#Insert-Image-in-Header-of-PDF-using-CSharp}

Nous pouvons également ajouter une image dans l'en-tête d'un document PDF existant en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe [**_Document_**][7] avec le chemin du fichier d'entrée comme argument.
  2. Ensuite, créez une instance de la classe _**[ImageStamp][13]**_ avec le chemin du fichier image comme argument.
  3. Ensuite, définissez diverses propriétés telles que _TopMargin_, _HorizontalAlignment_ et _VerticalAlignment_ comme Top, etc.
  4. Après cela, parcourez toutes les pages et ajoutez un en-tête à l'aide de la méthode **_[Page.AddStamp()][9]_** avec l'objet _ImageStamp_.
  5. Enfin, appelez la méthode **_[Document.Save()][10]_** avec le chemin du fichier de sortie comme argument pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment ajouter une image dans l'en-tête d'un document PDF à l'aide de C#**.
```
// Cet exemple de code montre comment ajouter une image dans l'en-tête d'un document PDF existant.
// Charger le document PDF
Document pdfDocument = new Document(@"C:\Files\sample.pdf");

// Créer un en-tête
ImageStamp imageStamp = new ImageStamp(@"C:\Files\conholdate-logo.jpg");

// Définir les propriétés du tampon
imageStamp.TopMargin = 10;
imageStamp.HorizontalAlignment = HorizontalAlignment.Center;
imageStamp.VerticalAlignment = VerticalAlignment.Top;

// Ajouter un en-tête sur toutes les pages
foreach (Page page in pdfDocument.Pages)
{
    page.AddStamp(imageStamp);
}

// Enregistrer le document mis à jour
pdfDocument.Save(@"C:\Files\output.pdf");
```

{{< figure align=center src="images/Add-Image-In-Header-of-PDF-using-CSharp-1024x498.jpg" alt="Insérer une image dans l'en-tête du PDF à l'aide de C #." caption="Insérer une image dans l'en-tête du PDF à l'aide de C #.">}}
 

## Insérer une image dans le pied de page du PDF à l'aide de C # {#Insert-Image-in-Footer-of-PDF-using-CSharp}

Nous pouvons ajouter des images dans le pied de page des documents PDF par programme en suivant les étapes mentionnées précédemment. Cependant, nous devons définir _BottomMargin_ et _VerticalAlignment_ comme Bottom pour afficher l'image dans le pied de page.
L'exemple de code suivant montre ****comment ajouter une image dans le pied de page d'un document PDF à l'aide de C#**.**
```
// Cet exemple de code montre comment ajouter une image dans le pied de page d'un document PDF existant.
// Charger le document PDF
Document pdfDocument = new Document(@"C:\Files\sample.pdf");

// Créer un pied de page
ImageStamp imageStamp = new ImageStamp(@"C:\Files\conholdate-logo.jpg");

// Définir les propriétés du tampon
imageStamp.BottomMargin = 10;
imageStamp.HorizontalAlignment = HorizontalAlignment.Center;
imageStamp.VerticalAlignment = VerticalAlignment.Bottom;

// Ajouter un pied de page sur toutes les pages
foreach (Page page in pdfDocument.Pages)
{
    page.AddStamp(imageStamp);
}

// Enregistrer le document mis à jour
pdfDocument.Save(@"C:\Files\output.pdf");
```

{{< figure align=center src="images/Add-Image-In-Footer-of-PDF-using-CSharp-1024x498.jpg" alt="Insérer une image dans le pied de page du PDF à l'aide de C #." caption="Insérer une image dans le pied de page du PDF à l'aide de C #.">}}
 

## Ajouter différents en-têtes et pieds de page sur différentes pages {#Add-Different-Headers-and-Footers-on-Different-Pages}

Nous pouvons ajouter différents en-têtes/pieds de page pour différentes pages dans un seul document PDF en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe [**_Document_**][7] avec le chemin du fichier d'entrée comme argument. 
  2. Ensuite, créez plusieurs instances de la classe _**[ImageStamp][13]**_ avec le chemin du fichier image et/ou de la classe _**[TextStamp][8]**_ avec un texte à afficher.
  3. Ensuite, définissez diverses propriétés telles que _TopMargin_, _HorizontalAlignment_ et _VerticalAlignment_ comme Top pour l'en-tête et _BottomMargin_ et _VerticalAlignment_ comme Bottom pour le pied de page.
  4. Après cela, ajoutez un en-tête ou un pied de page à l'aide de la méthode **_[Page.AddStamp()][9]_** avec l'objet _ImageStamp_ ou _TextStamp_ pour une page.
  5. Enfin, appelez la méthode **_[Document.Save()][10]_** avec le chemin du fichier de sortie comme argument pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment ajouter plusieurs en-têtes et pieds de page dans un seul document PDF à l'aide de C#**.
```
// Cet exemple de code montre comment ajouter différents en-têtes pour différentes pages dans un seul document PDF.
// Charger le document PDF
Document pdfDocument = new Document(@"C:\Files\sample.pdf");

// Créer trois tampons
ImageStamp stamp1 = new ImageStamp(@"C:\Files\PDF\conholdate-logo.jpg");
TextStamp stamp2 = new TextStamp("Header Stamp 2");
TextStamp stamp3 = new TextStamp("Header Stamp 3");

// Définir l'alignement du tampon pour stamp1
stamp1.VerticalAlignment = VerticalAlignment.Top;
stamp1.HorizontalAlignment = HorizontalAlignment.Center;

// Définir l'alignement du tampon pour stamp2
stamp2.VerticalAlignment = VerticalAlignment.Top;
// Définissez les informations d'alignement horizontal pour le tampon sur Aligné au centre
stamp2.HorizontalAlignment = HorizontalAlignment.Center;
// Définir le facteur de zoom pour l'objet tampon
stamp2.Zoom = 10;

// Définir l'alignement du tampon pour le tampon3
stamp3.VerticalAlignment = VerticalAlignment.Top;
// Définissez les informations d'alignement horizontal pour l'objet de tampon sur Aligné au centre
stamp3.HorizontalAlignment = HorizontalAlignment.Center;
// Définir l'angle de rotation de l'objet tampon
stamp3.RotateAngle = 35;


// Ajouter le premier tampon sur la première page ;
pdfDocument.Pages[1].AddStamp(stamp1);

// Ajouter un deuxième tampon sur la deuxième page ;
pdfDocument.Pages[2].AddStamp(stamp2);

// Ajouter un troisième tampon sur la troisième page.
pdfDocument.Pages[3].AddStamp(stamp3);

// Enregistrer le document mis à jour
pdfDocument.Save(@"C:\Files\output.pdf");
```

## Ajouter des numéros de page dans le pied de page du PDF à l'aide de C # {#Add-Page-Numbers-in-Footer-of-PDF-using-CSharp}

Nous pouvons ajouter des numéros de page dans la section pied de page des documents PDF en suivant les étapes ci-dessous :
  1. Tout d'abord, chargez un document PDF en utilisant la classe [**_Document_**][7] avec le chemin du fichier d'entrée comme argument.
  2. Procédez ensuite comme suit pour chaque page de la collection **_[Document.Pages][16]_**.
      * Créez une instance de la classe _**[TextStamp][8]**_ avec un texte concaténé avec le numéro de page actuel.
      * Ensuite, définissez diverses propriétés telles que _BottomMargin_, _HorizontalAlignment_ et _VerticalAlignment_ comme Bottom, etc.
      * Après cela, appelez la méthode **_[Page.AddStamp()][9]_** avec l'objet _TextStamp_ pour ajouter le numéro de page dans le pied de page.
  3. Enfin, appelez la méthode **_[Document.Save()][10]_** avec le chemin du fichier de sortie comme argument pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment ajouter un numéro de page pour chaque page dans le pied de page d'un document PDF à l'aide de C#**.
```
// Cet exemple de code montre comment ajouter un numéro de page dans le pied de page de chaque page d'un document PDF. 
// Charger le document PDF
Document pdfDocument = new Document(@"C:\Files\sample.pdf");

// Ajouter un pied de page sur toutes les pages
foreach (Page page in pdfDocument.Pages)
{
    // Create footer
    TextStamp textStamp = new TextStamp("Page " + page.Number + " of " + pdfDocument.Pages.Count + " pages.");
    
    // Set properties of the stamp
    textStamp.BottomMargin = 10;
    textStamp.HorizontalAlignment = HorizontalAlignment.Center;
    textStamp.VerticalAlignment = VerticalAlignment.Bottom;

    // Add stamp
    page.AddStamp(textStamp);
}

// Enregistrer le document mis à jour
pdfDocument.Save(@"C:\Files\PDF\output.pdf");
```

{{< figure align=center src="images/Add-Page-No-In-Footer-of-PDF-using-CSharp-1024x501.jpg" alt="Ajoutez des numéros de page dans le pied de page." caption="Ajouter des numéros de page dans le pied de page du PDF à l'aide de C #.">}}
 

## Obtenez une licence API gratuite {#Get-a-Free-License}

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][18].
## Conclusion

Dans cet article, nous avons appris **comment ajouter un texte ou une image dans les en-têtes/pieds de page de fichiers PDF existants en utilisant C#**. Nous avons également vu **comment ajouter différents en-têtes sur différentes pages d'un document PDF** et **comment ajouter un numéro de page dans le pied de page d'un document**. En outre, vous pouvez en savoir plus sur Aspose.PDF pour l'API .NET en utilisant la [documentation][19]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][20].
## See Also

  * [Ajouter des formes dans des documents PDF à l'aide de C#][21]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/add-headers-and-footers-in-pdf-using-csharp.jpg
 [2]: https://docs.fileformat.com/pdf/
 [3]: https://products.aspose.com/pdf/net/
 [4]: https://docs.aspose.com/pdf/net/supported-file-formats/
 [5]: https://downloads.aspose.com/pdf/net
 [6]: https://www.nuget.org/packages/aspose.pdf
 [7]: https://apireference.aspose.com/pdf/net/aspose.pdf/document
 [8]: https://apireference.aspose.com/pdf/net/aspose.pdf/textstamp
 [9]: https://apireference.aspose.com/pdf/net/aspose.pdf/page/methods/addstamp
 [10]: https://apireference.aspose.com/pdf/net/aspose.pdf.document/save/methods/4
 [11]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Text-In-Header-of-PDF-using-CSharp.jpg
 [12]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Text-In-Footer-of-PDF-using-CSharp.jpg
 [13]: https://apireference.aspose.com/pdf/net/aspose.pdf/imagestamp
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Image-In-Header-of-PDF-using-CSharp.jpg
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Image-In-Footer-of-PDF-using-CSharp.jpg
 [16]: https://apireference.aspose.com/pdf/net/aspose.pdf/document/properties/pages
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/12/Add-Page-No-In-Footer-of-PDF-using-CSharp.jpg
 [18]: https://purchase.conholdate.com/temporary-license
 [19]: https://docs.aspose.com/pdf/net/
 [20]: https://forum.aspose.com/
 [21]: https://blog.conholdate.com/2021/11/11/add-shapes-in-pdf-documents-using-csharp/





