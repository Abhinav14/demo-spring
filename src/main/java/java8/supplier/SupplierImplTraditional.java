package java8.supplier;

import java.util.function.Supplier;

public class SupplierImplTraditional implements Supplier<String>{

	@Override
	public String get() {
		return "This is Abhinav Anant";
	}

}
