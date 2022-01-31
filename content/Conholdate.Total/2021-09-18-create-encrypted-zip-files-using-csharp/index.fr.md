---
title: "Créer des fichiers ZIP cryptés à l'aide de C#"
author: Muzammil Khan
date: 2021-09-18T17:42:25+00:00
summary: "En tant que développeur C#, vous pouvez facilement créer par programmation des archives ZIP cryptées ou protégées par mot de passe à l'aide de C# dans vos applications .NET. Dans cet article, vous apprendrez <strong>à créer des archives ZIP chiffrées à l'aide de C#</strong> ."
url: /2021/09/18/create-encrypted-zip-files-using-csharp/
categories:
  - "Conholdate.Total Famille de produits"
tags:
  - "API CSharp pour créer des archives ZIP"
  - "Créer des fichiers ZIP protégés par mot de passe"
  - "Créer des archives ZIP à l'aide de CSharp"
  - "Crypter les fichiers et dossiers en ZIP"
  - "Crypter les archives ZIP à l'aide de CSharp"

---


{{< figure align=center src="images/add-files-or-folders-to-zip-archives-using-csharp.jpg" alt="ajouter des fichiers ou des dossiers aux archives zip à l'aide de csharp">}}
 

Les fichiers ZIP sont les types de fichiers d'archive les plus courants utilisés pour conserver les fichiers et dossiers compressés dans un seul conteneur. En tant que développeur C#, vous pouvez facilement créer par programmation des archives ZIP cryptées ou protégées par mot de passe à l'aide de C# dans vos applications .NET. Dans cet article, vous apprendrez **comment créer des fichiers ZIP chiffrés à l'aide de C#**.
Les sujets suivants sont abordés/couverts dans cet article :
  * [API C# pour créer des fichiers ZIP chiffrés][2]
  * [Créer des fichiers ZIP protégés par mot de passe][3]
  * [Créer des fichiers ZIP cryptés avec le cryptage AES][4]
  * [Crypter les dossiers dans les fichiers ZIP][5]
  * [Crypter des fichiers spécifiques dans les archives ZIP][6]
  * [Créer des fichiers ZIP cryptés avec un cryptage mixte][7]

## API C# pour créer des fichiers ZIP chiffrés {#CSharp-API-to-Create-Encrypted-ZIP-Files}

Pour créer des archives chiffrées [ZIP][8], j'utiliserai [Aspose.ZIP pour .NET API][9]. Il vous permet de compresser des fichiers et des dossiers et de les ajouter aux archives ZIP. Il vous permet également de décompresser des archives de types pris en charge tels que ZIP, TAR, GZIP, BZ2, 7Zip, RAR, etc. L'API offre une protection via des mots de passe définis par l'utilisateur et des techniques de cryptage traditionnelles utilisant le cryptage AES tel que AES128, AES192 et AES256 .
Vous pouvez soit [télécharger][10] la DLL de l'API, soit l'installer à l'aide de [NuGet][11].
<pre class="wp-block-code"><code>Install-Package Aspose.ZIP</code></pre>
## Créer des fichiers ZIP protégés par mot de passe {#Create-Password-Protected-ZIP-Files}

Vous pouvez facilement créer par programmation des archives ZIP protégées par mot de passe en suivant les étapes ci-dessous :
  1. Créez une instance de la classe _** **_**_[Archive][12]_** avec l'objet _**[ArchiveEntrySettings][13]**_.
  2. Définissez le mot de passe à l'aide de l'objet [_**TraditionalEncryptionSettings**_][14].
  3. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée à ajouter à l'archive.
  4. Répétez l'étape ci-dessus pour ajouter plusieurs fichiers.
  5. Appelez la méthode _**[Save()][16]**_ avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment créer un fichier ZIP protégé par mot de passe à l'aide de C#**.
```
// créer une archive
Archive archive = new Archive(new ArchiveEntrySettings(encryptionSettings: new TraditionalEncryptionSettings("12345")));

// Ajouter des fichiers à l'archive
archive.CreateEntry("sample1.txt", "C:\\Files\\sample1.txt");
archive.CreateEntry("sample2.txt", "C:\\Files\\sample2.txt");

// sauvegarder l'archive
archive.Save("C:\\Files\\password_protcted.zip");
```

{{< figure align=center src="images/Create-Password-Protected-ZIP-Archives.jpg" alt="Créer des archives ZIP protégées par mot de passe" caption="Créer des archives ZIP protégées par mot de passe">}}
 

La classe **Archive** représente un fichier d'archive ZIP. Il fournit plusieurs méthodes pour créer, composer, extraire ou mettre à jour des archives ZIP. La méthode **CreatEntry()** de cette classe crée une entrée unique d'un fichier dans l'archive. Il prend le nom du fichier et le chemin d'accès complet au fichier comme paramètres d'entrée. Cette classe fournit également des méthodes _**[CreatEntry()][18]**_ surchargées pour ajouter des fichiers à partir du flux ou de _FileInfo_. La méthode **Save()** de cette classe enregistre l'archive ZIP dans le chemin de fichier spécifié.
La classe **ArchiveEntrySettings** fournit des paramètres pour compresser ou décompresser les entrées. La classe **TraditionalEncryptionSetings** fournit des paramètres pour l'algorithme traditionnel **ZipCrypto**. Il s'agit d'un algorithme de protection par mot de passe ZIP. La propriété **_Password_** de cette classe permet d'obtenir ou de définir un mot de passe pour le chiffrement ou le déchiffrement des fichiers et dossiers dans une archive ZIP.
## Créer des fichiers ZIP cryptés avec le cryptage AES {#Create-Encrypted-ZIP-Files-with-AES-Encryption}

Vous pouvez chiffrer vos archives ZIP avec le chiffrement AES par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la classe _** **_**_[Archive][12]_** avec l'objet _**[ArchiveEntrySettings][13]**_.
  2. Définissez le mot de passe à l'aide de la classe [_**AesEcryptionSettings**_][19]. Passez la chaîne de mot de passe et [**_EncryptionMethod_**][20] comme arguments au constructeur.
  3. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée à ajouter à l'archive.
  4. Répétez l'étape ci-dessus pour ajouter plusieurs fichiers.
  5. Appelez la méthode _**[Save()][16]**_ avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment créer un fichier ZIP chiffré avec le chiffrement AES à l'aide de C#**.
```
// créer une archive
Archive archive = new Archive(new ArchiveEntrySettings(null, new AesEcryptionSettings("p@s$", EncryptionMethod.AES128)));

// Ajouter des fichiers à l'archive
archive.CreateEntry("abc.txt", "C:\\Files\\sample1.txt");

// sauvegarder l'archive
archive.Save("C:\\Files\\aes.zip");
```

La classe **AesEncryptionSettings** fournit des paramètres pour l'algorithme de chiffrement ou de déchiffrement AES. L'Advanced Encryption Standard (AES) est un algorithme de chiffrement par bloc de chiffrement ou de déchiffrement symétrique.
Vous pouvez utiliser les types de méthodes de chiffrement suivants :
  * Traditionnel — Chiffrement PKWARE traditionnel
  * AES128 — Advanced Encryption Standard avec une longueur de clé de 128 bits
  * AES192 — Advanced Encryption Standard avec une longueur de clé de 192 bits
  * AES256 — Advanced Encryption Standard avec une longueur de clé de 256 bits

## Crypter les dossiers dans les fichiers ZIP {#Encrypt-Folders-in-ZIP-Files}

Vous pouvez ajouter des dossiers protégés par mot de passe aux fichiers ZIP par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la classe _** **_**_[Archive][12]_** avec l'objet _**[ArchiveEntrySettings][13]**_.
  2. Définissez le mot de passe à l'aide de l'objet [_**TraditionalEncryptionSettings**_][14].
  3. Appelez la méthode **_[CreatEntries()][21]_** avec le chemin du dossier à ajouter à l'archive.
  4. Répétez l'étape ci-dessus pour ajouter plusieurs dossiers.
  5. Appelez la méthode _**[Save()][16]**_ avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment ajouter un dossier **crypté** au fichier ZIP à l'aide de C#**.
```
// créer une archive
Archive archive = new Archive(new ArchiveEntrySettings(null, new TraditionalEncryptionSettings("123@45")));

// Ajouter un dossier à l'archive
archive.CreateEntries("C:\\Files\\MyFolder");

// sauvegarder l'archive
archive.Save("C:\\Files\\password_protcted_folder.zip");
```

## Crypter des fichiers spécifiques dans les archives ZIP {#Encrypt-Specific-Files-in-ZIP-Archives}

Vous pouvez chiffrer des fichiers spécifiques dans les archives ZIP par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la classe **_[Archive][12]_**.
  2. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée à ajouter à l'archive.
  3. Définissez le mot de passe du fichier à l'aide de _**ArchiveEntrySettings**_ avec _**_**TraditionalEncryptionSettings**_**_.
  4. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée pour ajouter un autre fichier à l'archive.
  5. Répétez les étapes ci-dessus pour ajouter d'autres fichiers.
  6. Appelez la méthode _**[Save()][16]**_ avec le chemin du fichier de sortie pour enregistrer le fichier de sortie.

L'exemple de code suivant montre **comment chiffrer des fichiers spécifiques dans l'archive ZIP à l'aide de C#**.
```
// créer une archive
Archive archive = new Archive();

// Ajouter des fichiers à l'archive
archive.CreateEntry("sample1.txt", "C:\\Files\\sample1.txt");
archive.CreateEntry("sample2.txt", "C:\\Files\\sample2.txt", false, new ArchiveEntrySettings(encryptionSettings: new TraditionalEncryptionSettings("123@abc")));

// sauvegarder l'archive
archive.Save("C:\\Files\\password_protcted.zip");
```

{{< figure align=center src="images/Encrypt-Specific-Files-in-ZIP-Archives.jpg" alt="Crypter des fichiers spécifiques dans les archives ZIP" caption="Crypter des fichiers spécifiques dans des archives ZIP">}}
 

## Créer des fichiers ZIP cryptés avec un cryptage mixte {#Create-Encrypted-ZIP-Files-with-Mixed-Encryption}

Vous pouvez créer des archives ZIP contenant des fichiers et des dossiers protégés par des techniques de cryptage mixtes variant pour chaque fichier et dossier par programmation en suivant les étapes ci-dessous :
  1. Créez une instance de la classe_** **_**_[Archive][12]_**.
  2. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée à ajouter à l'archive.
  3. Définissez le mot de passe du fichier à l'aide de _**ArchiveEntrySettings**_ avec _**AesEcryptionSettings**_.
  4. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée pour ajouter un autre fichier à l'archive.
  5. Définissez le mot de passe du fichier à l'aide de _**ArchiveEntrySettings**_ avec _**_**TraditionalEncryptionSettings**_**_.
  6. Appelez la méthode **_[CreatEntry()][15]_** avec le chemin du fichier d'entrée pour ajouter un autre fichier à l'archive.
  7. Appelez la méthode **_[CreateEntries()][21]_** avec le chemin du dossier à ajouter à l'archive.
  8. Enregistrez le fichier de sortie à l'aide de la méthode _**[Save()][16]**_ avec le chemin du fichier de sortie.

L'exemple de code suivant montre **comment créer un fichier ZIP avec des techniques de chiffrement mixtes à l'aide de C#**.
```
// créer une archive
Archive archive = new Archive();

// Ajouter un fichier avec cryptage AES à l'archive
archive.CreateEntry("sample1.txt", "C:\\Files\\sample1.txt", false, new ArchiveEntrySettings(null, new AesEcryptionSettings("p@s$", EncryptionMethod.AES128)));

// Ajouter un fichier avec cryptage traditionnel à l'archive
archive.CreateEntry("sample2.txt", "C:\\Files\\sample2.txt", false, new ArchiveEntrySettings(encryptionSettings: new TraditionalEncryptionSettings("321")));

// Ajouter un fichier sans chiffrement à l'archive
archive.CreateEntry("sample3.txt", "C:\\Files\\sample2.txt");

// Ajouter un dossier sans cryptage à l'archive
archive.CreateEntries("C:\\Files\\MyFolder");

// sauvegarder l'archive
archive.Save("C:\\Files\\Mixed.zip");
```

{{< figure align=center src="images/Create-Encrypted-ZIP-Archives-with-Mixed-Encryption.jpg" alt="Créer des archives ZIP cryptées avec un cryptage mixte" caption="Créer un fichier ZIP crypté avec un cryptage mixte">}}
 

## Get a Free License

Vous pouvez essayer l'API sans limites d'évaluation en demandant [une licence temporaire gratuite][24].
## Conclusion

Dans cet article, vous avez appris **** comment ** créer des fichiers ZIP cryptés ** à l'aide de C # ****. Vous avez également appris **comment **créer un fichier ZIP protégé par mot de passe** par programmation. De plus, vous avez appris **comment chiffrer des fichiers spécifiques dans les archives ZIP**. De plus, vous avez appris **comment ajouter des dossiers protégés par mot de passe aux fichiers ZIP**. Cet article explique également **comment créer un fichier ZIP** **chiffré avec des techniques de chiffrement mixtes** à l'aide de C#. Vous pouvez en savoir plus sur Aspose.ZIP pour l'API .NET en utilisant la [documentation][25]. En cas d'ambiguïté, n'hésitez pas à nous contacter sur le [forum][26].
## See Also

  * [Rendu des archives ZIP à l'aide de C #][27]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/add-files-or-folders-to-zip-archives-using-csharp.jpg
 [2]: #CSharp-API-to-Create-Encrypted-ZIP-Files
 [3]: #Create-Password-Protected-ZIP-Files
 [4]: #Create-Encrypted-ZIP-Files-with-AES-Encryption
 [5]: #Encrypt-Folders-in-ZIP-Files
 [6]: #Encrypt-Specific-Files-in-ZIP-Archives
 [7]: #Create-Encrypted-ZIP-Files-with-Mixed-Encryption
 [8]: https://docs.fileformat.com/compression/zip/
 [9]: https://products.aspose.com/zip/net
 [10]: https://downloads.aspose.com/zip/net
 [11]: https://www.nuget.org/packages/Aspose.Zip/
 [12]: https://apireference.aspose.com/zip/net/aspose.zip/archive
 [13]: https://apireference.aspose.com/zip/net/aspose.zip.saving/archiveentrysettings
 [14]: https://apireference.aspose.com/zip/net/aspose.zip.saving/traditionalencryptionsettings
 [15]: https://apireference.aspose.com/zip/net/aspose.zip.archive/createentry/methods/3
 [16]: https://apireference.aspose.com/zip/net/aspose.zip.archive/save/methods/1
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Create-Password-Protected-ZIP-Archives.jpg
 [18]: https://apireference.aspose.com/zip/net/aspose.zip/archive/methods/createentry/index
 [19]: https://apireference.aspose.com/zip/net/aspose.zip.saving/aesecryptionsettings
 [20]: https://apireference.aspose.com/zip/net/aspose.zip.saving/encryptionmethod
 [21]: https://apireference.aspose.com/zip/net/aspose.zip.archive/createentries/methods/1
 [22]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Encrypt-Specific-Files-in-ZIP-Archives.jpg
 [23]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/09/Create-Encrypted-ZIP-Archives-with-Mixed-Encryption.jpg
 [24]: https://purchase.aspose.com/temporary-license
 [25]: https://docs.aspose.com/zip/net/
 [26]: https://forum.aspose.com/c/zip/37
 [27]: https://blog.conholdate.com/2021/07/06/render-zip-archives-using-csharp/





