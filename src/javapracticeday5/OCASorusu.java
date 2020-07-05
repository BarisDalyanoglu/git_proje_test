package javapracticeday5;

public class OCASorusu {

	public static void main(String[] args) {

		String str = "M ";
		str = str.concat("E ");
		String add = "S ";
		str = str.concat(add);
		str.replace("S", "T");
		str = str.concat(add);
		System.out.println(str);
		int num1 = 23;
		num1 = num1+12;
		num1+=5;
		System.out.println(num1);
		System.out.println(++num1);
		
		
	}

}
