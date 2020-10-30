package labAssignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class WordFequency {
public static void main(String[] args) {
	
		// Declare the HashMap
		HashMap<String, Integer> wordCount = new HashMap<>();

		File file = new File("data.txt"); 
		try {
		  FileReader reader = new FileReader(file);
		  BufferedReader br = new BufferedReader(reader);
		  // The BufferedReader reads the lines

		  String line = br.readLine();


		  // Split the line into a String array to loop through
		  String[] words = line.split(" ");
		  int freq = 0;

		  // for loop goes through every word
		  for (int i = 0; i < words.length; i++) {
		    // Case if the HashMap already contains the key.
		    // If so, just increments the value

		    if (wordCount.containsKey(words[i])) {         
		      wordCount.put(words[i], freq++);
		    }
		    // Otherwise, puts the word into the HashMap
		    else {
		      wordCount.put(words[i], freq++);
		    }
		  }
		  // Catching the file not found error
		  // and any other errors
		}
		catch (FileNotFoundException fnfe) {
		  System.err.println("File not found.");
		}
		catch (Exception e) {
		  System.err.print(e);
		   }
		 
		System.out.println(wordCount);
		}
}

