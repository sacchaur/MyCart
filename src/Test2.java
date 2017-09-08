import java.util.HashMap;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		String str = "Hello Sachin, How are you?";
		
		Map<Character, Integer> map = new HashMap<>();
	
		
		for (char char1 : str.toCharArray()) {
			if (map.containsKey(char1)) {
				map.put(char1, map.get(char1)+1);
			} else {
				map.put(char1, 1);
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			System.out.println( entry.getKey() + " : " + entry.getValue());
			
		}
			}
}