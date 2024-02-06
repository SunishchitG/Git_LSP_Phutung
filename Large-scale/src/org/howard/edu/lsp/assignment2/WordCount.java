package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		File file = new File("/Users/sunishchitghimire/eclipse-workspace/Large-scale/src/org/howard/edu/lsp/assignment2/word.txt");
		Map<String, Integer> wordCounts = new HashMap<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] words = line.split("\\s+|(?=[.,!?;'])|(?<=[.,!?;'])");
				
				for (String word : words) {
					word = word.toLowerCase();
					if (word.length() > 3 && !isNumeric(word)) {
						wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        		}
        	}
        }
        // Print word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}
        
	private static boolean isNumeric(String str) {
	    // Check if the string contains at least one non-digit character
	    for (char c : str.toCharArray()) {
	        if (!Character.isDigit(c)) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
