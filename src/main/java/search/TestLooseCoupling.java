package search;

public class TestLooseCoupling {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSort());
		String result = binarySearchImpl.binSearch(new int[] {9, 8, 2, 25, 30, 87, 78, 36}, 78);
		System.out.println(result);
	}

}
