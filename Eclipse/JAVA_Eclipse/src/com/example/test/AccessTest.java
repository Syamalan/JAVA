package com.example.test;
import com.example.access.PublicClass;

public class AccessTest {

	public static void main(String[] args) {
		PublicClass msg = new PublicClass();
		msg.showPublicMessage();
		/*PackagePrivateClass pmsg = new PackagePrivateClass();
		pmsg.showPackagePrivateMessage();*/
		//Here we are unable to access showPackagePrivateMessage because PackagePrivateClass is outside the com.example.access package 
		

}
}
