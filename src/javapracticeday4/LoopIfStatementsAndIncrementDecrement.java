package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatementsAndIncrementDecrement {

	public static void main(String[] args) {

		/*
         * bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle
         * olmalidir; 1_ uzunlugu => en az 8 karakter (chars) olmalidir 2_ icinde sadece
         * alfabetik karakterler bulunmalidir
         */
        // 01234
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanici adinizi giriniz: ");
		String userName = scan.nextLine().toLowerCase();
		
        if (userName.length() >= 8) {
            for (int i = 0; i < userName.length(); i++) {
                char temp = userName.charAt(i);
                if (!(temp >= 'a' && temp <= 'z')) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Olusturdugunuz user name basarili bir sekilde isleme gecmistir");
            } else {
                System.out.println("User name basarili bir sekilde olusturulamamistir");
                System.out.println("Lutfen tekrar deneyiniz");
            }
        } else {
            System.out.println("username length i yetersizdir!");
            System.out.println("Lutfen tekrar deneyiniz");
        }
		
        /*-------------
 		bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
 		1_uzunlugu => en az 10 karakter(chars) olmalidir
 		2_en az 1 sembol bulundurmali
 		3_en az 1 numara bulundurmali
 		4_en az buyuk harf olmalidir
 		5_en az bir kucuk harf olmalidir
 		----------------*/
        System.out.println("");
		System.out.println("Sifrenizii giriniz: ");
		String pasword = scan.nextLine();
		String sembol = "!@#$%^&*()_+";
		String rakam = "1234567890";
		int numOfSembol = 0;
		int numOfDigit = 0;
		int numOfBuyukHarf = 0;
		int numOfKucukHarf = 0;
		
		if(pasword.length() >= 10) {
			
			
			for (int i = 0; i < pasword.length(); i++) {
				if(sembol.contains(pasword.substring(i,i+1))) {
					numOfSembol++;
				}
				
				if(rakam.contains(pasword.substring(i,i+1))) {
					numOfDigit++;
				}
				
				if(pasword.charAt(i) >= 'a' && pasword.charAt(i) <= 'z') {
					numOfKucukHarf++;
				}
				
				if(pasword.charAt(i) >= 'A' && pasword.charAt(i) <= 'Z') {
					numOfBuyukHarf++;
				}
			}
			
			if(numOfSembol > 0 ) {
				
				if(numOfDigit > 0) {
					
					if(numOfBuyukHarf > 0) {
						if(numOfKucukHarf > 0){
							System.out.println("Tebrikler Passwordunuz basarili bir sekilde olusturulmustur");
						}else {
							System.out.println("Kucuk harf kullanmaniz gerekmektedir");
						}
					}else {
						System.out.println("Buyuk harf kullanmaniz gerekmektedir");
					}
				}else {
					System.out.println("Bir numara kullanmaniz gerekiyor!");
				}
			}else {
				System.out.println("Maalesef sembol kullanmadiginiz icin password olusturulamadi");
			}			
		}else {
			System.out.println("pasword lengthiniz yetersizdir!");
			System.out.println("Lutfen daha guclu hale getiriniz!");
		}
        scan.close();
	}

}
