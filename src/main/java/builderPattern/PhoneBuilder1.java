package builderPattern;

public class PhoneBuilder1 {
	private String os;
	private int ram;
	private double screenSize;
	private String color;
	
	public PhoneBuilder1 setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder1 setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder1 setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder1 setColor(String color) {
		this.color = color;
		return this;
	}
	
	public Phone1 getPhone(){
		return new Phone1(os, ram, screenSize, color);
		
	}
}
