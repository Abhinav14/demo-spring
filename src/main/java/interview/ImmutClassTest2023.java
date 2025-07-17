package interview;

public class ImmutClassTest2023 {

	public static void main(String[] args) {
		
		MutAge2023 age = new MutAge2023();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1984);
		
		ImmutClass2023 obj1 = new ImmutClass2023(1, "Abhinav", age);
		obj1.getAge2023().setYear(1982);
		System.out.println(obj1.getAge2023().getYear());
		
	}

}
