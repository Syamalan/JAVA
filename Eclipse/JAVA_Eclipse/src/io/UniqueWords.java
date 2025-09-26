package io;

import java.io.*;

public class UniqueWords {

	public static void main(String[] args) throws Exception {
				BufferedReader br = new BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/file.txt"));
				BufferedWriter bwu = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/uniquewords.txt"));
				BufferedWriter bwc = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/duplicate.txt"));

				String line;
				String[] words = null;
				int count;
				while((line=br.readLine())!=null) {
					//works only for single line file
					words = (line.replaceAll("\\p{Punct}", "").toLowerCase()).split("\\s+");	
					for(String word:words)
						System.out.println(word);
				}
				System.out.println(words.length);
				for(int i=0;i<words.length;i++) {
					count=1;
					for(int j=i+1;j<words.length;j++) {
						if(words[i].equalsIgnoreCase(words[j])){
							count++;
							words[j]="";
						}
					}
					
					if(count==1&&words[i]!="")
						bwu.write(words[i]+"\n");
					else
						bwc.write(words[i]+"\n");
				}
				System.out.println("file read and write Completed");
				br.close();
				bwu.close();
				bwc.close();

}
}
