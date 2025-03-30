Solution #2 - "with array, without split"

Find the sentence containing the largest number of words in some given text. 
The text is specified as a string S consisting of N characters: letters, spaces, dots, question marks and exclamation marks. 
The text can be divided into sentences by splitting it at dots, question marks and exclamation marks. A sentence can be divided into words by splitting it at spaces. A sentence without words is valid, but a valid word must contain at least one letter. 
For example, given S = “We are the best test coders. Give us a try? !“, there are three sentences: “We are the best test coders“, “ Give us a try” and “ “. 
The first sentence contains six words: “We“,“are”, “the”, “best”, “test” and “coders“. 
The second sentence contains four words: “Give“, “us“, “a” and “try“. 
The third sentence is space. 
Write a function that returns the maximum number of words in a sentence. 
For example, given S = “We are the best test coders. Give us a try? !“, the function should return 6, as explained above. 
Implement 2 solutions with array and split. 
