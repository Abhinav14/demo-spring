package java8.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierJava8 {
	
	public static void main(String[] args) {
		
		Supplier<String> supplier = ()-> "This is Abhinav Anant";
		
		//System.out.println(supplier.get());
		
		//Checking with stream api
		List<String> tempList = Arrays.asList();
		
		System.out.println(tempList.stream().findAny().orElseGet(supplier));
	}

}
