package javabasics;

public class TestToString {
	
	int id;
	String name;
	
	
	
	@Override
	public String toString() {
		return "TestToString [id=" + id + ", name=" + name + "]";
	}



	public TestToString(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) {
		TestToString obj1 = new TestToString(1, "Abhinav");
		System.out.println(obj1);
	}
}
