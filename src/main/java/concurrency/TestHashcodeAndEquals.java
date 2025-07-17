package concurrency;

public class TestHashcodeAndEquals {
	
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public TestHashcodeAndEquals(int i) {
		super();
		this.i = i;
	}

	public TestHashcodeAndEquals() {
		super();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestHashcodeAndEquals other = (TestHashcodeAndEquals) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		TestHashcodeAndEquals obj1 = new TestHashcodeAndEquals(1);
		TestHashcodeAndEquals obj2 = new TestHashcodeAndEquals(1);
		
		System.out.println(obj1.equals(obj2));
		System.out.println("obj1: "+obj1.hashCode());
		System.out.println("obj2: "+obj2.hashCode());
	}

}
