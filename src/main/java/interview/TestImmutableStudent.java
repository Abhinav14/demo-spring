package interview;

public class TestImmutableStudent {
	public static void main(String[] args) {
		
		MutableAge age = new MutableAge();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1982);
		
		ImmutableStudent student = new ImmutableStudent(1, "Abhinav", age);
		
		System.out.println("Abhinav's age before modification : "+student.getAge().getYear());
		age.setYear(1984);
		System.out.println("Abhinav's age after modification : "+student.getAge().getYear());
	}
}
