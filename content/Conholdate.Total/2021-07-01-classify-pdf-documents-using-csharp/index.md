---
title: 'Classify PDF Documents using C#'
author: Muzammil Khan
date: 2021-07-01T05:17:59+00:00
summary: 'You can easily classify your PDF documents programmatically in .NET applications. This article will be focusing on <strong>how to classify PDF documents using C#</strong>.'
url: /2021/07/01/classify-pdf-documents-using-csharp/
categories:
  - Conholdate.Total Product Family
tags:
  - Classify Documents for Taxonomy
  - Classify PDF Documents
  - 'Classify PDF using CSharp'
  - document classification

---


{{< figure align=center src="images/classify-pdf-documents-using-csharp.jpg" alt="Classify PDF Documents using C#">}}
 

You can classify documents using pre-defined tags or categories within IAB-2, Documents, and Sentiment taxonomies programmatically. The classification of documents makes it easier to find the relevant information at the right time. It also helps to manage and sort the documents for searching and retrieving the information that matters. In this article, you will learn&nbsp;**how to classify PDF documents using C#**.

The following topics are discussed/covered in this article:

  * [C# API for PDF Classification][2]
  * [Classify PDF Documents with IAB-2 Taxonomy using C#][3]
  * [PDF Classification with Documents Taxonomy using C#][4]
  * [PDF Document Classification from Stream using C#][5]
  * [Classify Password Protected PDF Files using C#][6]

## C# API for PDF Classification {#api-for-pdf-classification}

I will be using&nbsp;[GroupDocs.Classification for .NET][7]&nbsp;API for the classification of the [PDF][8] files. It offers an advanced document and text classification ‎in predefined categories. The API supports different types of taxonomies such as IAB-2, Documents, and Sentiment taxonomy. It analyzes the text and shows classification information including the best class with its probability score. You can classify a variety of industry-standard document formats such as PDF, Word, OpenDocument, RTF, and TXT. The API also offers Sentiment analysis with auto-detection of language and supports English, Chinese, Spanish, and German languages. It can be used to develop applications in any development environment that targets the .NET platform.

You can either&nbsp;[download][9]&nbsp;the DLL of the API or install it using the&nbsp;[NuGet][10].

<pre class="wp-block-code"><code>Install-Package GroupDocs.Classification</code></pre>

## Classify PDF Documents with IAB-2 Taxonomy using C# {#Classify-PDF-Documents-with-IAB-2-Taxonomy}

You can easily classify PDF documents with IAB-2 taxonomy programmatically by following the simple steps given below:

  * Create an instance of&nbsp;the&nbsp;_[**Classifier**][11]_ class
  * Call the&nbsp;_[**Classifier.Classify()**][12]_&nbsp;method with the file path
  * Set the _bestClassesCount_ and _Taxonomy_ as input
  * Get results in the&nbsp;_**[ClassificationResponse][13]**_ class object

The following code sample shows&nbsp;**how to classify PDF with IAB-2 taxonomy using C#**.

{{< gist conholdate-gists f1699fc0dd9d47653ace12440f857337 "ClassifyPDF_CSharp_ClassifyWithIAB2.cs" >}}

{{< figure align=center src="images/Classify-PDF-Documents-with-IAB-2-Taxonomy-1024x698.jpg" alt="Classify PDF Documents with IAB-2 Taxonomy using C#" caption="Classify PDF Documents with IAB-2 Taxonomy using C#">}}
 

The **[Classifier][11]** class is the main class that provides various [methods][15] to classify the documents. The&nbsp;_Classify()_&nbsp;method of this class classifies documents by file name and directory name. The _bestClassesCount_ parameter defines the count of the best matching classes to return. In the above code example, I used [Taxonomy.IAB2][16] taxonomy for classification. 

The _**[ClassificationResponse][13]**_ class provides properties and methods to show the retrieved classification information.

## PDF Classification with Documents Taxonomy using C# {#PDF-Classification-with-Documents-Taxonomy}

You can classify PDF documents with Documents taxonomy programmatically by following the easy steps given below:

  * Create an instance of&nbsp;the&nbsp;_[**Classifier**][11]_ class
  * Call the&nbsp;_[**Classifier.Classify()**][12]_&nbsp;method with the file path
  * Set the bestClassesCount, Taxonomy, and _PrecisionRecallBalance_ as input
  * Get results in the&nbsp;_**[ClassificationResponse][13]**_ class object

The following code sample shows&nbsp;**how to classify PDF with Documents taxonomy using C#**.

{{< gist conholdate-gists f1699fc0dd9d47653ace12440f857337 "ClassifyPDF_CSharp_ClassifyWithDocument.cs" >}}

{{< figure align=center src="images/Classify-PDF-Documents-with-Document-Taxonomy-1024x683.jpg" alt="Classify PDF with Documents Taxonomy using C#" caption="Classify PDF with Documents Taxonomy using C#">}}
 

## PDF Document Classification from Stream using C# {#PDF-Document-Classification-from-Stream}

You can classify PDF documents from file stream programmatically by following the few steps given below:

  * Read a file in the FileStream instance
  * Create an instance of&nbsp;the&nbsp;_[**Classifier**][11]_ class
  * Call the&nbsp;_[**Classifier.Classify()**][18]_&nbsp;method with FileStream instance
  * Set _bestClassesCount_ and _Taxonomy_ as input
  * Get results in the&nbsp;_**[ClassificationResponse][13]**_ class object

The following code sample shows&nbsp;**how to classify PDF from document stream using C#**.

{{< gist conholdate-gists f1699fc0dd9d47653ace12440f857337 "ClassifyPDF_CSharp_ClassifyWithStream.cs" >}}

## Classify Password Protected PDF Files using C# {#Classify-Password-Protected-PDF-using-CSharp}

You can easily classify password-protected PDF documents programmatically by following the simple steps given below:

  * Create an instance of&nbsp;the&nbsp;_[**Classifier**][11]_ class
  * Call the&nbsp;_[**Classifier.Classify()**][12]_&nbsp;method with the file path
  * Set the _bestClassesCount_ and _Password_ of the file as input
  * Get results in the&nbsp;_**[ClassificationResponse][13]**_ class object

The following code sample shows&nbsp;**how to classify password protected PDF file using C#**.

{{< gist conholdate-gists f1699fc0dd9d47653ace12440f857337 "ClassifyPDF_CSharp_ClassifyPasswordProtected.cs" >}}

## Get a Free License

You can try the API without evaluation limitations by requesting&nbsp;[a free temporary license][19].

## Conclusion

In this article, you have learned&nbsp;**how to&nbsp;classify PDF documents using&nbsp;C#**. You have also learned how to classify documents with IAB-2 taxonomy and Documents taxonomy. Moreover, you have learned how to classify documents while loading them using file stream instead of the file path in C#. You can learn more about GroupDocs.Classification for .NET API using the&nbsp;[documentation][20]. In case of any ambiguity, please feel free to contact us on the&nbsp;[forum][21].

## See Also

  * [Customer Feedback Sentiment Analysis in C#][22]

 [1]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/classify-pdf-documents-using-csharp.jpg
 [2]: #api-for-pdf-classification
 [3]: #Classify-PDF-Documents-with-IAB-2-Taxonomy
 [4]: #PDF-Classification-with-Documents-Taxonomy
 [5]: #PDF-Document-Classification-from-Stream
 [6]: #Classify-Password-Protected-PDF-using-CSharp
 [7]: https://products.groupdocs.com/classification/net
 [8]: https://docs.fileformat.com/pdf
 [9]: https://downloads.groupdocs.com/classification/net
 [10]: https://www.nuget.org/packages/GroupDocs.Classification
 [11]: https://apireference.groupdocs.com/classification/net/groupdocs.classification/classifier
 [12]: https://apireference.groupdocs.com/classification/net/groupdocs.classification.classifier/classify/methods/2
 [13]: https://apireference.groupdocs.com/classification/net/groupdocs.classification.dto/classificationresponse
 [14]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Classify-PDF-Documents-with-IAB-2-Taxonomy.jpg
 [15]: https://apireference.groupdocs.com/classification/net/groupdocs.classification/classifier/methods/index
 [16]: https://docs.groupdocs.com/classification/net/taxonomies/#iab-2-taxonomy
 [17]: https://blog.conholdate.com/wp-content/uploads/sites/27/2021/06/Classify-PDF-Documents-with-Document-Taxonomy.jpg
 [18]: https://apireference.groupdocs.com/classification/net/groupdocs.classification/classifier/methods/classify
 [19]: https://purchase.groupdocs.com/temporary-license
 [20]: https://docs.groupdocs.com/classification/net/
 [21]: https://forum.groupdocs.com/c/classification/
 [22]: https://blog.groupdocs.com/2020/06/17/classify-customers-feedback-using-sentiment-analysis-in-csharp/




