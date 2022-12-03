package builderPattern;

public class TestParentChild {
	public static void main(String[] args) {
		ParentClass parent = new ChildClass().build();
	}
}
