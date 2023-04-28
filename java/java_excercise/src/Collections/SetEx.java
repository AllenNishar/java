package Collections;
import java.util.*;

public class SetEx {

	public static void main(String[] args) {
	HashSet<String> hs =new HashSet<String>();//no order
	hs.add("Nishar");
	hs.add("Nishar");
	hs.add("Tushar");
	hs.add("Nishar");
	hs.add("Reddy");
	hs.add("Allen");
	System.out.println(hs);
	TreeSet<String> ts =new TreeSet<String>();//sorting order
	ts.add("Nishar");
	ts.add("Nishar");
	ts.add("Tushar");
	ts.add("Nishar");
	ts.add("Reddy");
	ts.add("Allen");
	System.out.println(ts);
	LinkedHashSet<String> lhs =new LinkedHashSet<String>();//input order
	lhs.add("Nishar");
	lhs.add("Nishar");
	lhs.add("Tushar");
	lhs.add("Nishar");
	lhs.add("Reddy");
	lhs.add("Allen");
	System.out.println(lhs);
	
		// TODO Auto-generated method stub

	}

}
