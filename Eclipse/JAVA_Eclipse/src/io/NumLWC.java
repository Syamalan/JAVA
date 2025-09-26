package io;

import java.io.*;

public class NumLWC {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Users/Syamala Nuthalapati/Desktop/CDAC/Eclipse/JAVA_Eclipse/src/io/NumLWC.java");
		FileWriter fw = new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/result.txt");
		int x;
		int cc=0,lc=0,wc=0;
		while((x=fr.read())!=-1) {
			cc++;
			
			if(x==' ') {
				wc++;
			}
			if(x=='\n') {
				lc++;
			}
		}
		fw.write("No of characters:" +cc);
		fw.write("No of words : "+(wc+lc));
		fw.write("No of lines: "+lc);
		System.out.println("File read and write successful");
		fr.close();
		fw.close();
	}

}
