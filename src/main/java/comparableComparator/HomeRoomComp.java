package comparableComparator;

import java.util.Comparator;

public class HomeRoomComp implements Comparator<Home>{

	@Override
	public int compare(Home o1, Home o2) {
		if(o1.getNumOfRooms() > o2.getNumOfRooms()) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
