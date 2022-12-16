package java8;

public class CalculatorImpl {

	//For lambda expression - First we need the parameter, then we need the expression and then we need the body
	
	public static void main(String[] args) {
		//commenting 9-13 for playing around with parameterized method from anonymous function
		/*Calculator calc = () -> {
			System.out.println("Switch On");
		};
		
		calc.switchOn();*/
		
		Calculator calculator = (i1, i2)->{
			if(i1 > i2) 
				throw new RuntimeException("i1 must be smaller than i2");
			else 
				return i2-i1;
			
		};
		
		System.out.println(calculator.substract(15, 10));
	}
	
}
