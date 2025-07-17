package java8.stream;

import java.util.*;
public class Programmer {
	
	private String name;
	private List<String> skills;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Programmer(String name, List<String> skills) {
		super();
		this.name = name;
		this.skills = skills;
	}
	public Programmer() {
		super();
	}
	@Override
	public String toString() {
		return "Programmer [name=" + name + ", skills=" + skills + "]";
	}
	
	

}
