package interview;

public class StringToCharArray {

	public static void main(String[] args) {
		String str = "abhinav";
		/*char[] charArr = new char[str.length()];
		charArr = str.toCharArray();
		for(char ch : charArr){
			System.out.println(ch);
		}*/
		char[] chArr = str.toCharArray();
		for(char ch : chArr){
			System.out.println(ch);
		}
	}

}
