package javapracticeday4;

public class AsciiNumbers {

	public static void main(String[] args) {
			
		//ASCII Tableda yer alan kucuk harf buyuk harf ve rakamlarin degerini
		//ekrana yazdiriniz
		System.out.println("*---- Kucuk Harf ASCII Degerleri ----*");
		for (int i = 'a' ; i <= 'z' ; i++ ) {
			
			System.out.println((char)i + " => " + i);
			
		}
		System.out.println("*---- Buyu Harf ASCII Degerleri ----*");
		for (int i = 'A' ; i <= 'Z' ; i++ ) {
			
			System.out.println((char)i + " => " + i);
			
		}
		System.out.println("*---- Rakam ASCII Degerleri ----*");
		for (int i = '0' ; i <= '9' ; i++ ) {
			
			System.out.println((char)i + " => " + i);
			
		}
	}

}
