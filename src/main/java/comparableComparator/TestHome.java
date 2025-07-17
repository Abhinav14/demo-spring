package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestHome {

	public static void main(String[] args) {
		
		List<Home> homeList = new ArrayList<>();
		homeList.add(new Home(4, 3, 10, 5));
		homeList.add(new Home(2, 2, 10, 10));
		homeList.add(new Home(3, 3, 6, 6));
		
		//HomeRoomComp c = new HomeRoomComp();
		
		Collections.sort(homeList, new HomeRoomComp());
		
		homeList.stream().forEach(x->System.out.println(x));
	}

}
