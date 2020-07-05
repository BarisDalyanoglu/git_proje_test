package day10_pratic;

import java.util.Scanner;

public class day02 {
	public static void main(String[] agrs) {
		// verilen iki sayının yerlerini değiştiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
	
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);

        //*** interview question***
	    // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
        int  x = 50; //=>10
        int  y  = 10; //=>50
        System.out.println("---Değişiklik öncesi---");
        System.out.println("x değeri= "+x);
        System.out.println("y değeri= "+y);
       
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("---Değişiklik sonrası---");
        System.out.println("x değeri= "+x);
        System.out.println("y değeri= "+y);
         
     // 0 ile 1000 arası sayı
     //int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 arası değerler
             //Random random= new Random();
             
         //  int randomSayi = random.nextInt(1000);
             int randomSayi= (int)(Math.random()*1000);
             System.out.println("Random sayı="+randomSayi);
         int birler = randomSayi%10; // birler basamağı
         
           randomSayi= randomSayi/10;
         
         int onlar = randomSayi%10; // onlar basamağı
         int yuzler= randomSayi/10; // yüzler basamağı
         
         System.out.println("Toplamları= "+(birler+onlar+yuzler));
         
         
         /* 
         scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
         1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
         2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
         3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                  Harun
                  Ekinci
         4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                  1983
                  2020        
         5.Adım Raporu aşağıdaki gibi yazdırınız      
                 "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
         6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
            //Şifre= 37HEi56        
         */
         
         Scanner scan = new Scanner(System.in);
         System.out.println("Adinizi girin:");
         String ad = scan.nextLine();
         System.out.println("Soy Adinizi girin:");
         String soyad = scan.nextLine();
         System.out.println("Dogum yilinizi girin:");
         int dy = scan.nextInt();
         System.out.println("Su anki yili girin:");
         int sy = scan.nextInt();
         int yas = (sy-dy);
         String rapor = "Adiniz: " + ad + ", Soyadiniz: " + soyad + ", Yasiniz: " + yas;
         System.out.println(rapor);
         String sifre = yas + ad.substring(0,1) + soyad.charAt(0) + soyad.charAt(soyad.length()-1) + ad.length() + soyad.length();
         System.out.println("Sifre: " + sifre);
         
         
         // Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
         // saat,dakika, saniye -->int
         // PM veya AM--> String
         // Örn: 11:25:33 PM
         
         System.out.println("Saati giriniz:");
         int saat = scan.nextInt();
         System.out.println("Dakikayi giriniz:");
         int dakika = scan.nextInt();
         System.out.println("saniye giriniz:");
         int saniye = scan.nextInt();
         System.out.println("Ogleden once ise AM ogleden sonrasa PM giriniz:");
         String ampm = scan.next();
         System.out.println(saat + (" : ") + dakika + (" : ") + saniye + (" ") + ampm); 
         
         scan.close();
	}
}