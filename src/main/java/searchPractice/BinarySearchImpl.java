package searchPractice;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binSearch(int[] array, int val){
		int[] sortedArr = sortAlgorithm.sort(array);
		int low = 0;
		int high = sortedArr.length-1;
		int mid = 0;
		while(high >= low){
			mid = (low+high)/2;
			if(sortedArr[mid] > val){
				high = mid - 1;
			}else if(sortedArr[mid] == val){
				return 1;
			}else{
				low = mid + 1;
			}
		}
		return -1;
	}
}
