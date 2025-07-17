package comparableComparator;

public class Home {
	
	private int numOfRooms;
	private int numOfBathrooms;
	private int numOfLights;
	private int numOfFans;
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	public int getNumOfBathrooms() {
		return numOfBathrooms;
	}
	public void setNumOfBathrooms(int numOfBathrooms) {
		this.numOfBathrooms = numOfBathrooms;
	}
	public int getNumOfLights() {
		return numOfLights;
	}
	public void setNumOfLights(int numOfLights) {
		this.numOfLights = numOfLights;
	}
	public int getNumOfFans() {
		return numOfFans;
	}
	public void setNumOfFans(int numOfFans) {
		this.numOfFans = numOfFans;
	}
	public Home(int numOfRooms, int numOfBathrooms, int numOfLights, int numOfFans) {
		super();
		this.numOfRooms = numOfRooms;
		this.numOfBathrooms = numOfBathrooms;
		this.numOfLights = numOfLights;
		this.numOfFans = numOfFans;
	}
	@Override
	public String toString() {
		return "Home [numOfRooms=" + numOfRooms + ", numOfBathrooms=" + numOfBathrooms + ", numOfLights=" + numOfLights
				+ ", numOfFans=" + numOfFans + "]";
	}
	
	
	
}
