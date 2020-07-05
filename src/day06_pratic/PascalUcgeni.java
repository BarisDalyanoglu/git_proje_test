package day06_pratic;

import java.util.Scanner;

public class PascalUcgeni {

	public static void main(String[] args) {

		System.out.println("        1");
		System.out.println("      1   1");
		System.out.println("    1   2   1");
		System.out.println("  1   3   3   1");
		System.out.println("1   4    6   4   1");
		
		System.out.println("Sagliginiz icin \"Evde Kal\".");
		
		int t = '"';
		System.out.println(t);
		
		double num1 = 10.231;
		int num2 = (int) num1;
		System.out.println(num2);
	
		int a = 15;
		int b = 5;	
		double pi = 3.14;
		
		System.out.println(a*b);
		System.out.println(a*pi);
		System.out.println(b/a);
		System.out.println(a*b/pi);
		System.out.println(a+b);
		System.out.println(-pi/a);
		System.out.println((a+b)/pi);
		System.out.println((b/pi)*a);
	
		System.out.println("hi "+21);
		System.out.println("hi "+"Harun");
		System.out.println(2+0+3+"TechProEd"+2+0+3);
		System.out.println("TechProEd"+3+0+5);
		System.out.println(2+0+5+"TechProEd"+"305");
	
		/*
		a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3
		*/
		
		System.out.println(-5 + 8 * 6); // 43
		System.out.println((55+9) % 9); // 1
		System.out.println(20 + -3*5 / 8); // 19
		System.out.println(5 + 15 / 3 * 2 - 8 % 3); // 13
		
		int num=10;
		num+=100;
		System.out.println(num);
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.round(2.7));
		
		//Diktortgenin  alani ve cevresini bul
		
		Scanner scan = new Scanner(System.in);
		System.out.println("En giriniz= ");		
		double en = scan.nextDouble();
		System.out.println("Boy giriniz= ");	
		double boy = scan.nextDouble();
		
		System.out.println("Alan= " + (en*boy));
		System.out.println("Cevre= " + (2*(en+boy)));
		scan.close();
	}

}