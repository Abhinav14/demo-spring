package builderPattern;

public class PhoneShop1 {
	public static void main(String[] args) {
		Phone1 phone = new PhoneBuilder1().setOs("Android").setRam(8).setColor("Black").getPhone();
		System.out.println(phone);
	}
}
