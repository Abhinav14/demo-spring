package search;

public class BinarySearchImpl {
	
	SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public String binSearch(int[] arr, int val){
		int[] sortedArray = sortAlgorithm.sort(arr);
		int low = 0;
		int high = sortedArray.length - 1;
		while(high >= low){
			int mid = (low+high)/2;
			if(val < sortedArray[mid]){
				high = mid - 1;
			}else if(val == sortedArray[mid]){
				return "Found!";
			}else{
				low = mid + 1;
			}
		}
		return "Not Found!";
	}
	
}
