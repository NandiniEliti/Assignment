function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
      // Use split and reverse to reverse the characters in the word
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Example usage:
  const inputSentence = "Hello World";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence); 