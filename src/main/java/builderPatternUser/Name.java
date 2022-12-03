package builderPatternUser;

public class Name {
	private final String firstName;
	private final String lastName;
	
	Name(Builder builder){
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}
	
	public static class Builder{
		private String firstName;
		private String lastName;
		
		public Builder setFirstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder setLastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Name build(){
			return new Name(this);
		}
	}
}
