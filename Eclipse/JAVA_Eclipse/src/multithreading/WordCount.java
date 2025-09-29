package multithreading;

import java.io.*;
import java.util.*;

public class WordCount {
	
	public void wordCount(FileReader path) throws IOException {
		BufferedReader br = new BufferedReader(path);
		int wc=0;
		String line;
		List<String> words = new ArrayList<>();
		while((line=br.readLine())!=null) {
            String[] lineWords = line.split("\\s+");
            words.addAll(Arrays.asList(lineWords));
			}
		System.out.println("Words"+words);

		System.out.println("Word count of file "+ words.size());
		
		
	}
	

}
