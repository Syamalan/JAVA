package io;
import java.io.*;

public class LongWord {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/CDAC/Eclipse/JAVA_Eclipse/src/io/LongWord.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/longword.txt"));
		//BufferedReader br = new //BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/CDAC/Eclipse/JAVA_Eclipse/src/io/LongWord.java"));
		//BufferedReader br = new BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/file.txt"));
		String line;
		String[] words = null;
		int max=0;
		String longword=null;
		while((line=br.readLine())!=null) {
			words = line.split("\\s+");
			for(String word:words) {
				if(word.length()>max) {
					max = word.length();
					longword=word;
				}
			}	
		}
		//System.out.println(max);
		System.out.println("The longest word in the file is:"+longword);
		bw.write("The longest word in the file is:"+longword);
		System.out.println("file read and write Completed");
		br.close();
		bw.close();
		}
	}

