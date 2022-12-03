package practice;

public class OverridingChild extends OverridingParent{
	
	@Override
	protected OverridingChild displayMessage(){
		return this;
	}

}
