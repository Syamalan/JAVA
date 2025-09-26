package io;
import java.io.*;
import java.util.*;
public class UniqueDubliLists {

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/file.txt"));
			BufferedWriter bwu = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/uniquewordslist.txt"));
			BufferedWriter bwd = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/duplicatelist.txt"));
			List<String> allWords = new ArrayList<>();
	        List<String> UniqueWords = new ArrayList<>();
	        List<String> duplicateWords = new ArrayList<>();
			String line;
			while((line=br.readLine())!=null) {
				String[] words = (line.replaceAll("\\p{Punct}", "").toLowerCase()).split("\\s+");	
				for (String word : words) {
                    if (!word.trim().isEmpty()) {
                        allWords.add(word);
                    }
                }   
			}
			for (String word : allWords) {
	            // Check if the word is not in the list of already-seen duplicates
	            if (!duplicateWords.contains(word)) {
	                // Check if the word is the first time we've seen it (in trulyUniqueWords)
	                if (!UniqueWords.contains(word)) {
	                    UniqueWords.add(word);
	                }
	                else {
	                    // This is the second time we've seen this word
	                    UniqueWords.remove(word);
	                    duplicateWords.add(word);
	                }
	            }
	        }
			System.out.println(UniqueWords);
			System.out.println(duplicateWords);
			for(String word:UniqueWords)
				//System.out.println(word);
				bwu.write(word+"\n");
			for(String word:duplicateWords)
				bwd.write(word+"\n");
			br.close();
			bwu.close();
			bwd.close();
		}
		
}