package multithreading;
import java.io.*;
public class WordMain {

	public static void main(String[] args) throws Exception {
		WordCount wco = new WordCount();
		FileReader fr1= new FileReader("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/file.txt");
		FileReader fr2= new FileReader("C:/Users/Syamala Nuthalapati/Desktop/IO_Files/uniquewords.txt");

		Thread t1=new Thread() {
			public void run() {
				try {
					wco.wordCount(fr1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		t1.start();
		t1.join();
		
		Thread t2=new Thread() {
			public void run() {
				try {
					wco.wordCount(fr2);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		};
		t2.start();
		
	}

}
