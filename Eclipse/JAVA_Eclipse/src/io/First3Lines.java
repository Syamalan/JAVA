package io;

import java.io.*;
public class First3Lines {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/CDAC/Eclipse/JAVA_Eclipse/src/io/First3Lines.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/f3lines.txt"));
		int linenum=1;
		String line;
		while(linenum<=3) {
			line = br.readLine();
			bw.write(linenum+" "+line+"\n");
			linenum++;
		}
		System.out.println("first three lines writen successfully");
		br.close();
		bw.close();
	}

}
