package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
	/**
     * Encrypts a given text by rearranging characters based on their index.
     * 
     * @param text The text to be encrypted
     * @return The encrypted text
     */
    public static String encrypt(String text) {
        String evenIndexChars = "";
        String oddIndexChars = "";
        String temp = "";
        
        // Loop through characters
        
        for(int i=0;i<text.length(); i++) {
        	if(Character.isWhitespace(text.charAt(i))) {
        		continue;
        	}
        	temp+= text.charAt(i);
        }
        for (int i = 0; i < temp.length(); i++) {
            char currentChar = temp.charAt(i);
            // Ignore punctuation and whitespace
            if (Character.isLetterOrDigit(currentChar)) {
                // Append even-indexed characters
                if (i % 2 == 0) {
                    evenIndexChars+= currentChar;
                    continue;
                } 
                // Append odd-indexed characters
                else {
                    oddIndexChars+=currentChar;
                    continue;
                }
            }
        }
        
        // Combine even-indexed and odd-indexed characters
        String finalOutput = evenIndexChars + oddIndexChars;
        return finalOutput;
    }
	
	

}
