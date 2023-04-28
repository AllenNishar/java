package Java_excercise2;

public class Exc1 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i, count = 11;
		System.out.println(n1 + " " + n2);
		for (i = 0; i < count; i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;

		}
		// TODO Auto-generated method stub

	}

}
