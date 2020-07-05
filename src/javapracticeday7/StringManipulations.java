package javapracticeday7;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adiniizi giriniz");
		String a = sc.nextLine();
		System.out.println("Soyadinizi giriniz");
		String b = sc.nextLine();
		
		System.out.println(a.toUpperCase().charAt(0));
	}

}
