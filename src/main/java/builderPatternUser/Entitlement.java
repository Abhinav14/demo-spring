package builderPatternUser;

import java.util.List;

public class Entitlement {
	private final List<String> entitlements;
	
	public Entitlement(Builder builder) {
		this.entitlements = builder.entitlements;
	}
	
	public static class Builder{
		private List<String> entitlements;

		public Builder setEntitlements(final List<String> entitlements) {
			this.entitlements = entitlements;
			return this;
		}
		public Entitlement build(){
			return new Entitlement(this);
		}
	}
}
