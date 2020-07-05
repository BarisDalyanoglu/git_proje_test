package arabaprojesiday6;

public class Toyota extends Car {
	/*
    Bir class olusturunuz adi Honda olsun
    icerisinde 3 instance variable olsun 
    protected String make = "Toyata";
    protected String model = "Corolla";
    protected int year = 2009;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz 
    */
	
	protected String make = "Toyata";
	protected String model = "Corolla";
	protected int year = 2009;
	
	public Toyota() {
		
	}
	public Toyota(String model, int year) {
		this.model=model;
		this.year=year;
	}
	
	
	public static void main(String[] args) {
		
		Toyota newToyata = new Toyota();
		System.out.println("Arabanin markasi: "+newToyata.make);
		System.out.println("Arabanin modeli: "+newToyata.model);
		System.out.println("Arabanin yili: "+newToyata.year);
		
		Toyota toyata2 = new Toyota("x", 2014);
		System.out.println("Arabanin markasi: "+toyata2.arabaMarkasi());
		System.out.println("Arabanin modeli: "+toyata2.arabaModeli());
		System.out.println("Arabanin yili: "+toyata2.arabaYili() );
	}
	
	
	
	
	@Override
	public String arabaMarkasi() {
		return make;
		
	}
	@Override
	public String arabaModeli() {
		return model;
		
	}
	@Override
	public int arabaYili() {
		return year;
	}
		

}
