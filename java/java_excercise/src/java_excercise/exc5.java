package java_excercise;
import java.util.Scanner;
public class exc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		e=scan.nextInt();
		System.out.println("Sum of all the numbers is"+(a+b+c+d+e));
		System.out.println("avg of all the numbers is"+(a+b+c+d+e)/5);

	}

}
