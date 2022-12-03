package builderPatternUser;

import java.util.List;

public class User {
	private final String userName;
	private final String password;
	private final Name name;
	private final Profile profiles;
	private final Team teams;
	private final Entitlement entitlements;
	
	private User(Builder builder){
		this.userName = builder.userName;
		this.password = builder.password;
		this.name = builder.name;
		this.profiles = builder.profiles;
		this.teams = builder.teams;
		this.entitlements = builder.entitlements;
	}
	
	public static class Builder{
		private String userName;
		private String password;
		private Name name;
		private Profile profiles;
		private Team teams;
		private Entitlement entitlements;
		
		public Builder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}
		public Builder setName(Name name) {
			this.name = name;
			return this;
		}
		public Builder setProfiles(Profile profiles) {
			this.profiles = profiles;
			return this;
		}
		public Builder setTeams(Team teams) {
			this.teams = teams;
			return this;
		}
		public Builder setEntitlements(Entitlement entitlements) {
			this.entitlements = entitlements;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
	}
}
