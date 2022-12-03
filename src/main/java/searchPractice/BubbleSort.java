package searchPractice;

public class BubbleSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				int temp = 0;
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
