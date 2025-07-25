package common;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Person(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Person p2) {
		if(this.getAge()< p2.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	

}
