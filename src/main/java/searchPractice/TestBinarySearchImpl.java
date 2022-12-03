package searchPractice;

public class TestBinarySearchImpl {
	public static void main(String[] args) {
		BinarySearchImpl binSearch = new BinarySearchImpl(new BubbleSort());
		System.out.println(binSearch.binSearch(new int[]{8, 17, 12, 32, 5, 9}, 6));
	}
}
