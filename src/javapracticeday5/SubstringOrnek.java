package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 isim girin");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		int kalan = name1.length()%2;
		int mid = name1.length()/2;
		if(kalan == 0){
			System.out.println((name1.substring(0, mid) + name2 + name1.substring(mid)));
			
		}else {
			System.out.println("tekrar deneyin");
		}
	}

}







