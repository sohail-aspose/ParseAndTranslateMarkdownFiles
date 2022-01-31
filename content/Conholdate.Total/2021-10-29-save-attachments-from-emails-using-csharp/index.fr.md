---
title: "Enregistrer les pièces jointes des e-mails à l'aide de C#"
author: Muzammil Khan
date: 2021-10-29T11:03:23+00:00
summary: "En tant que développeur C#, vous pouvez facilement extraire et enregistrer par programmation les pièces jointes des e-mails. Dans cet article, vous apprendrez <strong>à enregistrer les pièces jointes des e-mails à l'aide de C#</strong> ."
url: /2021/10/29/save-attachments-from-emails-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Enregistrer les pièces jointes à l'aide de CSharp"
  - "Enregistrer les pièces jointes aux e-mails dans CSharp"
  - "Afficher les pièces jointes à l'aide de CSharp"
  - "Afficher les pièces jointes aux e-mails au format PDF"

---


{{< figure align=center src="images/save-attachments-from-emails-using-csharp.jpg" alt="Enregistrer les pièces jointes des e-mails à l'aide de C#">}}
 

En tant que développeur C#, vous pouvez facilement extraire et enregistrer par programmation les pièces jointes des e-mails. Dans cet article, vous apprendrez **comment enregistrer les pièces jointes des e-mails à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C # pour enregistrer les pièces jointes aux e-mails][2]
  * [Extraire et enregistrer les pièces jointes des e-mails à l'aide de C #][3]
  * [Enregistrer les pièces jointes au format PDF à partir d'e-mails à l'aide de C #][4]

## API C # pour enregistrer les pièces jointes aux e-mails {#CSharp-API-to-Save-Email-Attachments}

Pour enregistrer les pièces jointes des fichiers [MSG][5], nous utiliserons [GroupDocs.Viewer for .NET API][6]. Il s'agit d'une puissante API de visionneuse de documents permettant de restituer et d'afficher des formats de fichiers largement utilisés sans installer de logiciel externe. Il vous permet également d'afficher rapidement les [formats de fichiers pris en charge][7] populaires de [Word][8], [Excel][9], [PowerPoint][10], [e-mails Outlook][11], [Project][ 12], [PDF][13], [HTML][14] et [XML][15].
Vous pouvez soit [télécharger][16] la DLL de l'API, soit l'installer à l'aide de [NuGet][17].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Viewer</code></pre>
## Extraire et enregistrer les pièces jointes des e-mails à l'aide de C# {#Extract-and-Save-Attachments-from-Emails-using-CSharp}

Vous pouvez extraire et enregistrer par programmation les pièces jointes des fichiers MSG des e-mails en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier MSG à l'aide de la classe [Viewer][18].
  * Ensuite, appelez la méthode [Viewer.GetAttachments()][19] pour obtenir toutes les pièces jointes du fichier MSG chargé. Obtenez les résultats sous la forme d'une collection de pièces jointes.
  * Pour chaque pièce jointe de la collection, enregistrez la pièce jointe en appelant la méthode [Viewer.SaveAttachment()][20]. Transmettez l'objet de la pièce jointe et le chemin du fichier pour l'enregistrer.

L'exemple de code suivant montre **comment extraire et enregistrer les pièces jointes contenues dans le fichier MSG de courrier électronique à l'aide de C#**.
```
string outputPath = @"C:\Files\Viewer\";

// Initialiser l'API et charger le fichier MSG
Viewer viewer = new Viewer(@"C:\Files\Viewer\with_attachments.msg");

// Obtenir des pièces jointes
IList<Attachment> attachments = viewer.GetAttachments();

foreach (Attachment attachment in attachments)
{
    // Save attachment
    string filePath = Path.Combine(outputPath, attachment.FileName);
    viewer.SaveAttachment(attachment, File.OpenWrite(filePath));
}
```

{{< figure align=center src="images/Extract-and-Save-Attachments-from-Emails-using-CSharp-1024x511.jpg" alt="Extraire et enregistrer les pièces jointes des e-mails à l'aide de C#" caption="Extrayez et enregistrez les pièces jointes des e-mails à l'aide de C#.">}}
 

## Enregistrer les pièces jointes au format PDF à partir d'e-mails à l'aide de C# {#Save-Attachments-as-PDF-from-Emails-using-CSharp}

Vous pouvez enregistrer les pièces jointes des e-mails au format PDF par programmation en suivant les étapes ci-dessous :
  * Créez une instance de la classe [Attachment][22] avec le nom et le chemin du fichier joint.
  * Initialisez une instance de la classe MemoryStream.
  * Chargez le fichier MSG à l'aide de la classe [Viewer][18].
  * Ensuite, appelez la méthode [Viewer.SaveAttachment()][20] et transmettez l'objet Attachment et MemoryStream comme paramètres d'entrée. Il extraira et enregistrera la pièce jointe spécifiée dans le flux de mémoire.
  * Maintenant, chargez l'objet MemoryStream à l'aide de la classe [Viewer][18].
  * Ensuite, créez une instance de la classe [PdfViewOptions][23] avec le chemin du fichier PDF de sortie.
  * Enfin, appelez la méthode [Viewer.View()][24] pour enregistrer et afficher la pièce jointe au format PDF.

L'exemple de code suivant montre **comment enregistrer et afficher la pièce jointe au format PDF à partir d'un fichier MSG d'e-mail à l'aide de C#**.
```
// Initialiser la pièce jointe
Attachment attachment = new Attachment("attachment-word.doc", "attachment-word.doc");
MemoryStream attachmentStream = new MemoryStream();

// Initialiser l'API et charger le fichier MSG
using (Viewer viewer = new Viewer(@"C:\Files\Viewer\with_attachments.msg"))
{
    // Save attachment in stream
    viewer.SaveAttachment(attachment, attachmentStream);
}

// Initialiser l'API et charger le flux de pièces jointes
using (Viewer viewer = new Viewer(attachmentStream))
{
    // Define PDF view options
    PdfViewOptions viewOptions = new PdfViewOptions("C:\\Files\\Viewer\\output.pdf");

    // View as PDF
    viewer.View(viewOptions);
}
```

{{< figure align=center src="images/Save-Attachments-as-PDF-from-Emails-using-CSharp-1024x561.jpg" alt="" légende="Save attachments as PDF from emails using C#.">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][26].
## Conclusion

Dans cet article, vous avez appris **comment **extraire et enregistrer les pièces jointes contenues dans le fichier MSG d'e-mail en utilisant** C#**. De plus, vous avez vu **comment enregistrer une pièce jointe spécifique au format PDF** par programmation. En outre, vous pouvez en savoir plus sur l'API GroupDocs.Viewer pour .NET à l'aide de la [documentation][27]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][28].
## See Also

  * [Rendu des archives ZIP à l'aide de C #][29]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/save-attachments-from-emails-using-csharp.jpg
 [2]: #CSharp-API-to-Save-Email-Attachments
 [3]: #Extract-and-Save-Attachments-from-Emails-using-CSharp
 [4]: #Save-Attachments-as-PDF-from-Emails-using-CSharp
 [5]: https://docs.fileformat.com/email/msg/
 [6]: https://products.groupdocs.com/viewer/net
 [7]: https://docs.groupdocs.com/viewer/net/supported-document-formats/
 [8]: https://docs.fileformat.com/word-processing/
 [9]: https://docs.fileformat.com/spreadsheet/
 [10]: https://docs.fileformat.com/presentation/
 [11]: https://docs.fileformat.com/email/
 [12]: https://docs.fileformat.com/project-management/
 [13]: https://docs.fileformat.com/pdf/
 [14]: https://docs.fileformat.com/web/html/
 [15]: https://docs.fileformat.com/web/xml/
 [16]: https://downloads.groupdocs.com/viewer/net
 [17]: https://www.nuget.org/packages/GroupDocs.Viewer
 [18]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/Viewer
 [19]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/getattachments
 [20]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/saveattachment
 [21]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Extract-and-Save-Attachments-from-Emails-using-CSharp.jpg
 [22]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.results/attachment
 [23]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer.options/pdfviewoptions
 [24]: https://apireference.groupdocs.com/viewer/net/groupdocs.viewer/viewer/methods/view
 [25]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/10/Save-Attachments-as-PDF-from-Emails-using-CSharp.jpg
 [26]: https://purchase.groupdocs.com/temporary-license
 [27]: https://docs.groupdocs.com/viewer/net/
 [28]: https://forum.groupdocs.com/c/viewer/
 [29]: https://blog.conholdate.com/2021/07/06/render-zip-archives-using-csharp/





