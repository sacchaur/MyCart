
public class Test1 {

	public static void main(String[] args) {
		int counter = 0;
		String str = "Hello Sachin, How are you";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					counter++;
				}
			}
			System.out.println(str.charAt(i) + " = " + counter);
			counter = 0;
		}
	}

}
