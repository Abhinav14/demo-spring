package builderPattern;

public class ChildClass {
	private ParentClass parentClass;
	public ChildClass(){
		this.parentClass = new ParentClass();
	}
	public ParentClass build(){
		return this.parentClass;
	}
}
