package java_excercise;
import java.util.Scanner;

public class exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		if(num1>num2 & num1>num3) {
			System.out.println("greatest number is"+num1);
		}
		else if(num2>num1& num2>num3) {
			System.out.println("greatest number is"+num2);
			
		}
		else {
			System.out.println("greatest number is"+num3);
		}

	}

}
