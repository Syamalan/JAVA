package io;
import java.io.*;
public class FileWithLNum {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/Syamala Nuthalapati/Desktop/CDAC/Eclipse/JAVA_Eclipse/src/io/FileWithLNum.java"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/outlinenum.txt"));
			int linenum=1;
			String line;
			while((line=br.readLine())!=null) {
				//System.out.println(linenum+" "+line);	
				bw.write(linenum+" "+line+"\n");
				linenum++;
			}
			System.out.println("file read and write Completed");
			br.close();
			bw.close();
			}
}
