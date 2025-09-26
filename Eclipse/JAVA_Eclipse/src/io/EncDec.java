package io;
import java.io.*;
public class EncDec {

	public static void main(String[] args) throws Exception {
		FileWriter fwe = new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/enc_mssage.txt");
		FileWriter fwd = new FileWriter("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/dec_message.txt");
		FileReader fre = new FileReader("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/enc_message.txt");

		BufferedWriter bwe = new BufferedWriter(fwe);
		BufferedWriter bwd = new BufferedWriter(fwd);
		String str = "Abcd";
		
		int disp=3;
		System.out.println("Encryption code");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			ch = (char)((int)str.charAt(i)+disp);
			bwe.write(ch);
			System.out.println(ch);
		}
		System.out.println("Decrypted code");
		int x;
		while((x=fre.read())!=-1) {
			char ch = (char)(x-disp);
			bwd.write(ch);
			System.out.println(ch);

			
		}
		System.out.println("Encryption and Decryption successful");
		bwe.close();
		bwd.close();
	}
	

}
