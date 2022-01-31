---
title: "Fusionner des documents Word à l'aide de C#"
author: Muzammil Khan
date: 2021-11-19T03:48:57+00:00
summary: "En tant que développeur C#, vous pouvez facilement fusionner deux ou plusieurs documents Word en un seul document par programmation. Dans cet article, vous apprendrez <strong>à fusionner des documents Word à l'aide de C#</strong> ."
url: /2021/11/19/merge-word-documents-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "Combiner des fichiers Word à l'aide de CSharp"
  - "Fusionner des fichiers DOCX à l'aide de CSharp"
  - "Fusionner des documents Word dans CSharp"
  - "Fusionner Word en PDF"

---


{{< figure align=center src="images/Merge-Word-Documents-using-CSharp-1.jpg" alt="Fusionner des documents Word à l'aide de C#">}}
 

Nous pouvons facilement fusionner deux ou plusieurs documents Word en un seul document à l'aide de C#. Nous le faisons parce que partager ou imprimer un seul fichier est plus facile que de traiter plusieurs fichiers. Dans cet article, nous allons apprendre **comment fusionner des documents Word à l'aide de C#**.
Les sujets suivants seront traités dans cet article :
  * [API C# pour fusionner des documents Word][2]
  * [Fusionner deux ou plusieurs documents Word à l'aide de C#][3]
  * [Combiner des pages spécifiques de documents Word à l'aide de C#][4]
  * [Fusionner des fichiers DOCX et sécuriser avec un mot de passe à l'aide de C#][5]
  * [Fusionner un document Word en PDF à l'aide de C #][6]

## API C# pour fusionner des documents Word {#CSharp-API-to-Merge-Word-Documents}

Pour fusionner des fichiers [DOC][7] ou [DOCX][8], nous utiliserons l'API [GroupDocs.Merger for .NET][9]. Veuillez soit [télécharger][10] la DLL de l'API ou l'installer à l'aide de [NuGet][11].
<pre class="wp-block-code"><code>Install-Package GroupDocs.Merger</code></pre>
## Fusionner deux ou plusieurs documents Word à l'aide de C# {#Merge-Two-or-More-Word-Documents-using-CSharp}

Nous pouvons facilement fusionner deux ou plusieurs documents Word par programmation en suivant les étapes ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe **_[Merger][12]_**.
  * Ensuite, appelez la méthode **_[Merger.Join()][13]_** avec le chemin du fichier DOCX cible à fusionner avec le fichier chargé.
  * Ensuite, répétez l'étape ci-dessus pour fusionner plus de fichiers.
  * Enfin, appelez la méthode **_[Merger.Save()][14]_** avec le chemin du fichier de sortie pour enregistrer le fichier fusionné.

L'exemple de code suivant montre comment fusionner deux ou plusieurs fichiers DOCX à l'aide de C#.
```
// Charger le fichier DOCX source
Merger merger = new Merger(@"C:\Files\sample.docx");

// Ajouter un fichier DOCX à fusionner avec le DOCX source
merger.Join(@"C:\Files\sample2.docx");

// Ajouter un autre fichier DOCX à fusionner avec le DOCX source
merger.Join(@"C:\Files\sample3.docx");

// Fusionner les fichiers DOCX et enregistrer le fichier fusionné
merger.Save(@"C:\Files\merged.docx");
```

{{< figure align=center src="images/Merge-Word-Documents-using-CSharp-1024x365.jpg" alt="Fusionner deux ou plusieurs documents Word à l'aide de C#" caption="Fusionnez deux ou plusieurs documents Word à l'aide de C#.">}}
 

## Combiner des pages spécifiques de documents Word à l'aide de C # {#Combine-Specific-Pages-of-Word-Documents-using-CSharp}

Nous pouvons combiner des pages spécifiques de documents Word par programme en suivant les étapes simples mentionnées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe **_[Merger][12]_**.
  * Ensuite, créez une instance de la classe **_[JoinOptions][16]_ ** avec la page de début et le numéro de page de fin. Vous pouvez également définir le mode plage pour joindre des pages paires ou impaires à partir de la plage de pages spécifiée.
  * Ensuite, appelez la méthode _**[Merger.Join()][13]**_ avec le chemin du fichier DOCX cible et l'objet _JoinOptions_ comme arguments. L'objet _JoinOptions_ fusionne des pages spécifiques du fichier cible avec le fichier source.
  * Enfin, appelez la méthode **_[Merger.Save()][14]_** avec le chemin du fichier de sortie pour enregistrer le fichier fusionné.

L'exemple de code suivant montre comment combiner des pages sélectionnées de documents Word à l'aide de C#.
```
// Charger le fichier DOCX source
Merger merger = new Merger(@"C:\Files\sample.docx");

// Définir les options de jointure
JoinOptions joinOptions = new JoinOptions(1, 4, RangeMode.OddPages);

// Ajouter un fichier DOCX à fusionner avec le DOCX source
merger.Join(@"C:\Files\sample2.docx", joinOptions);

// Fusionner les fichiers DOCX et enregistrer le fichier fusionné
merger.Save(@"C:\Files\merged.docx");
```

## Fusionner des fichiers DOCX et sécuriser avec un mot de passe à l'aide de C# {#Merge-and-Secure-with-Password-using-CSharp}

Nous pouvons fusionner deux fichiers DOCX ou plus, puis sécuriser le fichier fusionné avec un mot de passe par programme en suivant les étapes simples indiquées ci-dessous :
  * Tout d'abord, chargez le fichier DOCX à l'aide de la classe **_[Merger][12]_**.
  * Ensuite, appelez la méthode **_[Merger.Join()][13]_** avec le chemin du fichier DOCX cible à fusionner avec le fichier chargé.
  * Si vous le souhaitez, répétez l'étape ci-dessus pour fusionner d'autres fichiers.
  * Ensuite, définissez le mot de passe en utilisant **_[AddPasswordOptions][17]_**
  * Après cela, appelez la méthode **_[Merger.AddPassword()][18]_** avec _AddPasswordOptions_.
  * Enfin, appelez la méthode **_[Merger.Save()][14]_** pour enregistrer le fichier fusionné protégé par mot de passe.

L'exemple de code suivant montre comment fusionner plusieurs documents Word, puis **sécuriser le fichier fusionné avec un mot de passe à l'aide de C#**.
```
// Charger le fichier DOCX source
Merger merger = new Merger(@"C:\Files\sample.docx");

// Ajouter un fichier DOCX à fusionner avec le DOCX source
merger.Join(@"C:\Files\sample2.docx");

// Définir le mot de passe
AddPasswordOptions addOptions = new AddPasswordOptions("password");
merger.AddPassword(addOptions);

// Fusionner les fichiers DOCX et enregistrer le fichier fusionné
merger.Save(@"C:\Files\merged.docx");
```

## Fusionner des documents Word en PDF à l'aide de C# {#Merge-Word-Document-into-PDF-using-CSharp}

Nous pouvons fusionner des documents Word dans un document PDF par programmation en suivant les étapes simples indiquées ci-dessous :
  * Tout d'abord, chargez le fichier PDF à l'aide de la classe **_[Merger][12]_**.
  * Ensuite, appelez la méthode **_[Merger.Join()][13]_** avec le chemin du fichier DOCX cible à fusionner avec le fichier chargé.
  * Si vous le souhaitez, répétez l'étape ci-dessus pour fusionner d'autres fichiers.
  * Enfin, appelez la méthode **_[Merger.Save()][14]_** avec le chemin du fichier PDF de sortie pour enregistrer le fichier fusionné.

L'exemple de code suivant montre **comment fusionner des fichiers DOCX dans un fichier PDF à l'aide de C#**.
```
// Charger le fichier PDF source
Merger merger = new Merger(@"C:\Files\sample.pdf");

// Ajouter un fichier DOCX à fusionner avec le PDF source
merger.Join(@"C:\Files\sample.docx");

// Fusionnez les fichiers DOCX et enregistrez le PDF fusionné
merger.Save(@"C:\Files\merged.pdf");
```

## Get a Free License

Veuillez essayer l'API sans limitation d'évaluation en demandant [une licence temporaire gratuite][19].
## Conclusion

Dans cet article, nous avons appris **comment fusionner deux documents Word ou plus à l'aide de C#**. Nous avons également vu **comment combiner des pages spécifiques de documents Word** par programmation. Cet article a également expliqué comment fusionner des fichiers DOCX dans un fichier PDF à l'aide de C#. En outre, vous pouvez en savoir plus sur l'API GroupDocs.Merger pour .NET à l'aide de la [documentation][20]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][21].
## See Also

  * [Fusionner plusieurs types de fichiers en un seul fichier à l'aide de C #][22]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Merge-Word-Documents-using-CSharp-1.jpg
 [2]: #CSharp-API-to-Merge-Word-Documents
 [3]: #Merge-Two-or-More-Word-Documents-using-CSharp
 [4]: #Combine-Specific-Pages-of-Word-Documents-using-CSharp
 [5]: #Merge-and-Secure-with-Password-using-CSharp
 [6]: #Merge-Word-Document-into-PDF-using-CSharp
 [7]: https://docs.fileformat.com/word-processing/doc/
 [8]: https://docs.fileformat.com/word-processing/docx/
 [9]: https://products.groupdocs.com/merger/net
 [10]: https://downloads.groupdocs.com/merger/net
 [11]: https://www.nuget.org/packages/groupdocs.merger
 [12]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/Merger
 [13]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.merger/join/methods/2
 [14]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.merger/save/methods/1
 [15]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/11/Merge-Word-Documents-using-CSharp.jpg
 [16]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/JoinOptions
 [17]: https://apireference.groupdocs.com/merger/net/groupdocs.merger.domain.options/AddPasswordOptions
 [18]: https://apireference.groupdocs.com/merger/net/groupdocs.merger/merger/methods/addpassword
 [19]: https://purchase.groupdocs.com/temporary-license
 [20]: https://docs.groupdocs.com/merger/net/
 [21]: https://forum.groupdocs.com/c/merger/
 [22]: https://blog.groupdocs.com/2021/05/04/merge-multiple-file-types-using-csharp/





