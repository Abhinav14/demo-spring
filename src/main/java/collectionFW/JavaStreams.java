package collectionFW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class JavaStreams {
	private class Pair{
        int key;
        int val;

        public Pair(int key, int val){
            this.key = key;
            this.val = val;
        }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }
}
	public static void main(String[] args) {
		JavaStreams obj1 = new JavaStreams();
		Pair pair1 = obj1.new Pair(5, 4);
		Pair pair2 = obj1.new Pair(4, 6);
		Pair pair3 = obj1.new Pair(2, 8);
		
		List<Pair> pairList = Arrays.asList(pair1, pair2, pair3);
		List result = pairList.stream().sorted((x, y) -> Integer.compare(x.key, y.key)).collect(Collectors.toList());
		System.out.println(result);
		
		//[Pair{key=5, val=4}, Pair{key=4, val=6}, Pair{key=2, val=8}]
	}
}
