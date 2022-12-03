package interview;

public final class ImmutableExample {
	final String pancardNumber;
	
	public ImmutableExample(String pancardNumber){
		this.pancardNumber = pancardNumber;
	}
	
	public String getPanCardNumber(){
		return pancardNumber;
	}

}
