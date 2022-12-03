package builderPatternUser;

import java.util.List;

public class Profile {
	private final List<String> profiles;
	
	private Profile(Builder builder){
		this.profiles = builder.profiles;
	}
	
	public static class Builder{
		private List<String> profiles;

		public Builder setProfiles(final List<String> profiles) {
			this.profiles = profiles;
			return this;
		}
		
		public Profile build(){
			return new Profile(this);
		}
	}
}
