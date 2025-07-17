package comparableComparator;

public class Mobile implements Comparable<Mobile>{
	
	private String brand;
	private int memory;
	private int ram;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Mobile(String brand, int memory, int ram) {
		super();
		this.brand = brand;
		this.memory = memory;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", memory=" + memory + ", ram=" + ram + "]";
	}
	@Override
	public int compareTo(Mobile o) {
		return Integer.compare(this.memory, o.memory);
	}
	
	

}
