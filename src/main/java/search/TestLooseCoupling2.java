package search;

public class TestLooseCoupling2 {
	public static void main(String[] args) {
		BinarySearchImpl2 binSearch = new BinarySearchImpl2(new BubbleSort2());
		System.out.println(binSearch.binSearch(new int[] {8, 2, 3, 9, 4, 5, 7}, 10));
	}
}
