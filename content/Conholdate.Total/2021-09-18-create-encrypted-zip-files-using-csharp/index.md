---
title: 'Create Encrypted ZIP Files using C#'
author: Muzammil Khan
date: 2021-09-18T17:42:25+00:00
summary: 'As a C# developer, you can easily create encrypted or password-protected ZIP archives programmatically using C# in your .NET applications. In this article, you will learn <strong>how to create encrypted ZIP archives using C#</strong>.'
url: /2021/09/18/create-encrypted-zip-files-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - 'C# API to Create ZIP Archives'
  - Create Password-Protected ZIP Files
  - 'Create ZIP Archives using C#'
  - Encrypt Files and Folders in ZIP
  - 'Encrypt ZIP Archives using C#'

---


{{< figure align=center src="images/add-files-or-folders-to-zip-archives-using-csharp.jpg" alt="add-files-or-folders-to-zip-archives-using-csharp">}}
 

ZIP files are the most common types of&nbsp;archive files that are used to keep compressed files and folders into a single container. As a C# developer, you can easily create encrypted or password-protected ZIP archives programmatically using C# in your .NET applications. In this article, you will learn **how to create encrypted ZIP files using C#**.

The following topics are discussed/covered in this article:

  * [C# API to Create Encrypted ZIP Files][2]
  * [Create Password-Protected ZIP Files][3]
  * [Create Encrypted ZIP Files with AES Encryption][4]
  * [Encrypt Folders in ZIP Files][5]
  * [Encrypt Specific Files in ZIP Archives][6]
  * [Create Encrypted ZIP Files with Mixed Encryption][7]

## C# API to Create Encrypted ZIP Files {#CSharp-API-to-Create-Encrypted-ZIP-Files}

For creating encrypted [ZIP][8]&nbsp;archives, I will be using&nbsp;[Aspose.ZIP for .NET API][9]. It enables you to compress files and folders and add them to ZIP archives. It also allows you to decompress archives of supported types such as ZIP, TAR, GZIP, BZ2, 7Zip, RAR, etc. The API provides protection via user-defined passwords and traditional encryption techniques using AES encryption such as AES128, AES192, and AES256.

You can either&nbsp;[download][10]&nbsp;the DLL of the API or install it using [NuGet][11].

<pre class="wp-block-code"><code>Install-Package Aspose.ZIP</code></pre>

## Create Password-Protected ZIP Files {#Create-Password-Protected-ZIP-Files}

You can easily create password-protected ZIP archives programmatically by following the steps given below:

  1. Create an instance of the_**&nbsp;**_**_[Archive][12]_** class with the _**[ArchiveEntrySettings][13]**_ object.
  2. Set password using the [_**TraditionalEncryptionSettings**_][14] object.
  3. Call the **_[CreatEntry()][15]_** method with the input file path to add to the archive.
  4. Repeat the above step to add multiple files.
  5. Call the&nbsp;_**[Save()][16]**_&nbsp;method with the output file path to save the output file.

The following&nbsp;code sample shows&nbsp;**how to create a password-protected ZIP file using C#**.

{{< gist conholdate-gists 5ce31cfc8674f57debca328ab120e6ca "CreateEncryptedZIP_CSharp_PasswordProtectedZIP.cs" >}}

{{< figure align=center src="images/Create-Password-Protected-ZIP-Archives.jpg" alt="Create Password-Protected ZIP Archives" caption="Create Password-Protected ZIP Archives">}}
 

The **Archive** class represents a ZIP archive file. It provides several methods to create, compose, extract, or update ZIP archives. The **CreatEntry()** method of this class creates a single entry of a file within the archive. It takes the name of the file and the fully qualified file path as input parameters. This class also provides overloaded _**[CreatEntry()][18]**_ methods to add files from stream or _FileInfo_. The **Save()** method of this class saves the ZIP archive at the specified file path.

The **ArchiveEntrySettings** class provides settings to compress or decompress the entries. The **TraditionalEncryptionSetings** class provides settings for the traditional **ZipCrypto** algorithm. It is a ZIP password-protection algorithm. The **_Password_** property of this class allows getting or setting a password for encryption or decryption of files and folders in a ZIP archive.

## Create Encrypted ZIP Files with AES Encryption {#Create-Encrypted-ZIP-Files-with-AES-Encryption}

You can encrypt your ZIP archives with AES encryption programmatically by following the steps given below:

  1. Create an instance of the_** **_**_[Archive][12]_** class with the _**[ArchiveEntrySettings][13]**_ object.
  2. Set password using the [_**AesEcryptionSettings**_][19] class. Pass the password string and the [**_EncryptionMethod_**][20] as arguments to the constructor.
  3. Call the **_[CreatEntry()][15]_** method with the input file path to add to the archive.
  4. Repeat the above step to add multiple files.
  5. Call the _**[Save()][16]**_ method with the output file path to save the output file.

The following&nbsp;code sample shows&nbsp;**how to create a ZIP file encrypted with AES encryption using C#**.

{{< gist conholdate-gists 5ce31cfc8674f57debca328ab120e6ca "CreateEncryptedZIP_CSharp_AESEncryptedZIP.cs" >}}

The **AesEncryptionSettings** class provides settings for AES encryption or decryption algorithm. The Advanced Encryption Standard (AES) is a symmetric encryption or decryption block cipher algorithm. 

You can use the following types of encryption methods:

  * Traditional — Traditional PKWARE encryption
  * AES128 — Advanced Encryption Standard with key length 128 bits
  * AES192 — Advanced Encryption Standard with key length 192 bits
  * AES256 — Advanced Encryption Standard with key length 256 bits

## Encrypt Folders in ZIP Files {#Encrypt-Folders-in-ZIP-Files}

You can add password-protected folders to ZIP files programmatically by following the steps given below:

  1. Create an instance of the_**&nbsp;**_**_[Archive][12]_** class with the _**[ArchiveEntrySettings][13]**_ object.
  2. Set password using the [_**TraditionalEncryptionSettings**_][14] object.
  3. Call the **_[CreatEntries()][21]_** method with the folder path to add to the archive.
  4. Repeat the above step to add multiple folders.
  5. Call the&nbsp;_**[Save()][16]**_&nbsp;method with the output file path to save the output file.

The following&nbsp;code sample shows&nbsp;**how to add an **encrypted** folder to the ZIP file using C#**.

{{< gist conholdate-gists 5ce31cfc8674f57debca328ab120e6ca "CreateEncryptedZIP_CSharp_PasswordProtectedFolders.cs" >}}

## Encrypt Specific Files in ZIP Archives {#Encrypt-Specific-Files-in-ZIP-Archives}

You can encrypt specific files in the ZIP archives programmatically by following the steps given below:

  1. Create an instance of the **_[Archive][12]_** class.
  2. Call the **_[CreatEntry()][15]_** method with the input file path to add to the archive.
  3. Set password for the file using the _**ArchiveEntrySettings**_ with the _**_**TraditionalEncryptionSettings**_**_.
  4. Call the **_[CreatEntry()][15]_** method with the input file path to add another file to the archive.
  5. Repeat above steps to add more files.
  6. Call the&nbsp;_**[Save()][16]**_&nbsp;method with the output file path to save the output file.

The following&nbsp;code sample shows&nbsp;**how to encrypt specific files in the ZIP archive using C#**.

{{< gist conholdate-gists 5ce31cfc8674f57debca328ab120e6ca "CreateEncryptedZIP_CSharp_EncryptSpecificFiles.cs" >}}

{{< figure align=center src="images/Encrypt-Specific-Files-in-ZIP-Archives.jpg" alt="Encrypt Specific Files in ZIP Archives" caption="Encrypt Specific Files in ZIP archives">}}
 

## Create Encrypted ZIP Files with Mixed Encryption {#Create-Encrypted-ZIP-Files-with-Mixed-Encryption}

You can create ZIP archives containing files and folders protected with mixed encryption techniques varying for each file and folder programmatically by following the steps given below:

  1. Create an instance of the_**&nbsp;**_**_[Archive][12]_** class.
  2. Call the **_[CreatEntry()][15]_** method with the input file path to add to the archive.
  3. Set password for the file using the _**ArchiveEntrySettings**_ with the _**AesEcryptionSettings**_.
  4. Call the **_[CreatEntry()][15]_** method with the input file path to add another file to the archive.
  5. Set password for the file using the _**ArchiveEntrySettings**_ with the _**_**TraditionalEncryptionSettings**_**_.
  6. Call the **_[CreatEntry()][15]_** method with the input file path to add another file to the archive.
  7. Call the **_[CreateEntries()][21]_** method with the folder path to add to the archive.
  8. Save the output file using the&nbsp;_**[Save()][16]**_&nbsp;method with the output file path.

The following&nbsp;code sample shows&nbsp;**how to create a ZIP file with mixed encryption techniques using C#**.

{{< gist conholdate-gists 5ce31cfc8674f57debca328ab120e6ca "CreateEncryptedZIP_CSharp_MixedEncryption.cs" >}}

{{< figure align=center src="images/Create-Encrypted-ZIP-Archives-with-Mixed-Encryption.jpg" alt="Create Encrypted ZIP Archives with Mixed Encryption" caption="Create Encrypted ZIP File with Mixed Encryption">}}
 

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][24].

## Conclusion

In this article, you have learned&nbsp;****how to **create encrypted ZIP**** files **using C#****. You have also learned&nbsp;**how to **create a password-protected ZIP** file** programmatically. Moreover, you have learned **how to encrypt specific files in the ZIP archives**. Furthermore, you have learned **how to add password-protected folders to ZIP files**. This article also explained&nbsp;**how to create a ZIP file** **encrypted with mixed encryption techniques**&nbsp;using C#. You can learn more about Aspose.ZIP for .NET API using the&nbsp;[documentation][25]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][26].

## See Also

  * [Render ZIP Archives using C#][27]

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




