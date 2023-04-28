package Collections;
import java.util.*;

public class Exapmple1 {

	public static void main(String[] args) {
//		ArrayList<String> al =new ArrayList<String>();//10...16	(cc*3/2)+1
//				al.add("Nishar");
//				al.add("Nishar");
//				al.add("Tushar");
//				al.add("Nishar");
//				al.add("Reddy");
//				al.add("Allen");
//				System.out.println(al);
		ArrayList al =new ArrayList();//10...16	(cc*3/2)+1
		ArrayList<String> al1 =new ArrayList<String>();
		al.add("allen");
		al.add(123);
		al.add("Nishar");
		al.add(455);
		al.add("Tushar");
		al.add(1234567899);
		Iterator<String> itr=al.iterator();
		
		
		
		System.out.println(al);	
		al1.add("sandeep");
		al1.add("Ramesh");
		al1.addAll(al);
		System.out.println(al1);
		
	}

}
