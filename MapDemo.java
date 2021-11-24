package patel.SimpleJavaProject;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> myMap1 = mapMethod();
		System.out.println(myMap1.get("Age"));
		
	}
public static Map<String, String> mapMethod(){
	Map<String, String> myMap = new HashMap<>();
	myMap.put("Name","Bhavin Patel");
	myMap.put("Age","30");
	return myMap;
	
}
}
