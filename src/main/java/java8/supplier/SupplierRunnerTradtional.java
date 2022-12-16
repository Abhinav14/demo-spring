package java8.supplier;

import java.util.function.Supplier;

public class SupplierRunnerTradtional {
	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierImplTraditional();
		System.out.println(supplier.get());
	}
}
