package collectionFW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(4, "Pinku"), new Student(1, "Abhinav"), new Student(3, "Minku"), new Student(2, "Dinku"), new Student(5, "Tinku"));

	}
}
