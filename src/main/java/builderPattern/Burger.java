package builderPattern;

public class Burger {
	private String bread;
	private String patty;
	private String veggies;
	private String sauces;
	private Boolean withExtraCheeze = Boolean.FALSE;
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	public void setPatty(String patty) {
		this.patty = patty;
	}
	
	public void setVeggies(String veggies) {
		this.veggies = veggies;
	}
	
	public void setSauces(String sauces) {
		this.sauces = sauces;
	}
	
	public void setWithExtraCheeze(Boolean withExtraCheeze) {
		this.withExtraCheeze = withExtraCheeze;
	}
	@Override
	public String toString() {
		return "Burger [bread=" + bread + ", patty=" + patty + ", veggies=" + veggies + ", sauces=" + sauces
				+ ", withExtraCheeze=" + withExtraCheeze + "]";
	}
	
	
}
