package builderPatternUser;

import java.util.List;

public class Team {
	private final List<String> teams;
	
	Team(Builder builder){
		this.teams = builder.teams;
	}
	
	public static class Builder{
		private List<String> teams;

		public Builder setTeams(final List<String> teams) {
			this.teams = teams;
			return this;
		}
		public Team build(){
			return new Team(this);
		}
	}
}
