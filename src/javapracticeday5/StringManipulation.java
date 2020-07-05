package javapracticeday5;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String email = scan.nextLine();
		if (email.contains("@hotmail")) {
			System.out.println(email.replace("@hotmail", "@gmail"));
		}else {
			System.out.println("basarili giris yapildi");
		}
		
	}

}
