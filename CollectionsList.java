package patel.SimpleJavaProject;
import java.util.*;
public class CollectionsList {
	public static void main(String[] args) {
		List<Integer> IntList = new ArrayList<>();
		IntList.add(20);
		IntList.add(40);
		IntList.add(5);
		IntList.add(50);
		//System.out.println(IntList.get(3));
		Collections.sort(IntList);
		System.out.println(IntList);
		Collections.sort(IntList, Collections.reverseOrder());
		System.out.println(IntList);
		
	
	List<String> IntList2 = new ArrayList<String>();
	IntList2.add("Bhavin");
	IntList2.add("Patel");
	IntList2.add("Simpli Learn");
	IntList2.add("Testing Course");
	System.out.println(IntList2.get(3));
	Collections.sort(IntList2);
	System.out.println(IntList2);
	Collections.sort(IntList2, Collections.reverseOrder());
	System.out.println(IntList2);
	}

}
