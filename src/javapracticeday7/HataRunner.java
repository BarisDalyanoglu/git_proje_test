package javapracticeday7;

public class HataRunner {

	public static void main(String[] args) {
		
		Hasta hasta1 = new Hasta();
		
		Case durum = new Case();
		durum.setActualCase("Romatizma");
		durum.setEmergency("normal");
		
		hasta1.setIsim("Ucan");
		hasta1.setSoyisim("Kacan");
		hasta1.setSuankiDurum(durum);
		
		
		System.out.println("Hasta ismi: "+hasta1.getIsim());
		System.out.println("Hastanin soyismi: "+hasta1.getSoyisim());
		System.out.println("Hastanin aktuel durumu: "+hasta1.getSuankiDurum().getActualCase());
		System.out.println("Hastanin aciliyet durumu: en rahat scanner scan "+hasta1.getSuankiDurum().getEmergency());
	}

}
