package interview;

public final class ImmutableStudent {
	private final int id;
	private final String name;
	private final MutableAge age;
	
	public ImmutableStudent(int id, String name, MutableAge age){
		MutableAge cloneAge = new MutableAge();
		this.id = id;
		this.name = name;
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		this.age = cloneAge;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public MutableAge getAge() {
		return age;
	}
}
