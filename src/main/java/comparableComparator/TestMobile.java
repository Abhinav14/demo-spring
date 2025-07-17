package comparableComparator;

import java.util.*;

public class TestMobile {

	public static void main(String[] args) {
		
		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile("Samsung", 512, 8));
		mobiles.add(new Mobile("Nokia", 128, 6));
		mobiles.add(new Mobile("Apple", 64, 8));
		
		Collections.sort(mobiles);
		
		mobiles.stream().forEach(x->System.out.println(x));
	}

}
