package builderPatternUser;

import java.util.ArrayList;
import java.util.List;

public class TestUserBuilder {
	public static void main(String[] args) {
		List<String> profilesList = new ArrayList<>();
		List<String> teamList = new ArrayList();
		List<String> entitlementList = new ArrayList();
		profilesList.add("developer");
		profilesList.add("admin");
		teamList.add("dev-team");
		teamList.add("admin-team");
		entitlementList.add("dev-entitlement-1");
		entitlementList.add("admin-entitlement-1");
		Name name = new Name.Builder().setFirstName("Abhinav").setLastName("Anant").build();
		Profile profile = new Profile.Builder().setProfiles(profilesList).build();
		Team team = new Team.Builder().setTeams(teamList).build();
		Entitlement entitlement = new Entitlement.Builder().setEntitlements(entitlementList).build();
	}

}
