package practice;

public class FuncInterfaceImpl {
		
	public void display(FuncInterface fi){
		System.out.println(fi.greet()+" I am inside display method of impl class");
	}
	
	public static void main(String[] args) {
		FuncInterfaceImpl obj = new FuncInterfaceImpl();
		obj.display(new FuncInterface() {
			
			@Override
			public String greet() {
				return "Hello, ";
			}
		});
	}

}
