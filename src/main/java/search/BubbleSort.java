package search;

public class BubbleSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] sortMe) {
		for(int i = 0; i < sortMe.length; i++){
			for(int j = i + 1; j < sortMe.length; j++){
				int temp = 0;
				if(sortMe[i] > sortMe[j]){
					temp = sortMe[i];
					sortMe[i] = sortMe[j];
					sortMe[j] = temp;
				}
			}
		}
		return sortMe;
	}
	
}
