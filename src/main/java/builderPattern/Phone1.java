package builderPattern;

public class Phone1 {
	private String os;
	private int ram;
	private double screenSize;
	private String color;
	
	public Phone1(String os, int ram, double screenSize, String color) {
		super();
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Phone1 [os=" + os + ", ram=" + ram + ", screenSize=" + screenSize + ", color=" + color + "]";
	}
	
	
	
}
