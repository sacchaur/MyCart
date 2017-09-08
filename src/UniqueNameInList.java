import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueNameInList {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Sachin");
		name.add("Hira");
		name.add("Ram");
		name.add("Hira");
		name.add("JK");
		name.add("JK");
		name.add("JK");
		name.add("Hira");
		name.add("Hira");
		//Set<String> uniqueName = new HashSet<String>(name);
		System.out.println("Unique names are: " + new HashSet<String>(name));
	}
}
