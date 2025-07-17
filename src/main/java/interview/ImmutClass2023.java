package interview;

public final class ImmutClass2023 {

	private final int id;
	private final String name;
	private final MutAge2023 age2023;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public MutAge2023 getAge2023() {
		MutAge2023 cloneAge1 = new MutAge2023();
		cloneAge1.setDay(age2023.getDay());
		cloneAge1.setMonth(age2023.getMonth());
		cloneAge1.setYear(age2023.getYear());
		return cloneAge1;
	}

	/*public ImmutClass2023(int id, String name, MutAge2023 age2023) {
		super();
		this.id = id;
		this.name = name;
		this.age2023 = age2023;
	}*/
	
	public ImmutClass2023(int id, String name, MutAge2023 age) {
		super();
		MutAge2023 cloneAge = new MutAge2023();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		this.id = id;
		this.name = name;
		this.age2023 = cloneAge;
	}

	@Override
	public String toString() {
		return "ImmutClass2023 [id=" + id + ", name=" + name + ", age2023=" + age2023 + "]";
	}

}
