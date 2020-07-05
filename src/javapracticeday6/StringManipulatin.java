package javapracticeday6;

import java.util.Scanner;

import javapracticeday5.SubstringOrnek;

public class StringManipulatin {
	/*
	 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
	 * e.g: I love java ==> java love I 
	 * String reverse = ""; 
	 * 
	 * substring method ile yapiniz veya array ile yapiniz
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz:");
		String cumle = scan.nextLine();
		
		int ilkBosluk = cumle.indexOf(" ");
		System.out.println(ilkBosluk);
		
		int sonuncuBosluk = cumle.lastIndexOf(" ");
		System.out.println(sonuncuBosluk);
		
		System.out.println(cumle.substring(sonuncuBosluk+1) + cumle.substring(ilkBosluk, sonuncuBosluk+1) + cumle.substring(0, ilkBosluk));
	}

}
