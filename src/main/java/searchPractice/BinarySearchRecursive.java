package searchPractice;

public class BinarySearchRecursive {
	
	public static int[] sort(int[] sortMe){
		for(int i = 0; i < sortMe.length; i++){
			for(int j = i+1; j < sortMe.length; j++){
				int temp = 0;
				while(sortMe[i] > sortMe[j]){
					temp = sortMe[i];
					sortMe[i] = sortMe[j];
					sortMe[j] = temp;
				}
			}
		}
		return sortMe;
	}
	
	public static int binarySearch(int[] searchMe, int low, int high, int val){
		if(high >= low){
			int mid = (low+high)/2;
			if(searchMe[mid] < val){
				return binarySearch(searchMe, mid+1, high, val);
			}else if(searchMe[mid] == val){
				return 1;
			}else{
				return binarySearch(searchMe, low, mid-1, val);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] sortedArray = BinarySearchRecursive.sort(new int[]{12, 8, 9, 2, 10, 11, 15, 3, 7});
		System.out.println(BinarySearchRecursive.binarySearch(sortedArray, 0, sortedArray.length-1, 7));
	}
}
