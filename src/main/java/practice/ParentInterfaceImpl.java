package practice;

public class ParentInterfaceImpl {
	
	private ParentInterface parentInterface;

	public ParentInterfaceImpl(ParentInterface parentInterface) {
		super();
		this.parentInterface = parentInterface;
	}
	
	public String display(){
		String str = parentInterface.displayName();
		return str;
	}
		
}
