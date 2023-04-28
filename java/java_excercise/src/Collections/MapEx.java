package Collections;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(111, "mahesh");
		students.put(121, "Allen");
		students.put(131, "Nishar");
		students.put(141, "Reddy");
		students.put(151, "Akki");//combination of key value pair is called one entry.
		System.out.println(students);
			Set<Integer> Keys=students.keySet();
			Iterator<Integer> mapKeys=Keys.iterator();
			while(mapKeys.hasNext()) {
				int key =mapKeys.next();
				System.out.println(key+" "+students.get(key));
			}
	}

}
