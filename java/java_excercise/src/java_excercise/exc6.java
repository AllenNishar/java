package java_excercise;
import java.util.Scanner;

public class exc6 {

	public static void main(String[] args) {
		long empid;
		String empname;
		double empsal;
		String empadd;
		long empcont;
		String gender;
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee name");
		empname=scan.nextLine();
		System.out.println("Enter employee address");
		empadd=scan.nextLine();
		System.out.println("Enter Gender");
		gender=scan.nextLine();
		System.out.println("Enter Empid");
		empid=scan.nextLong();
		System.out.println("Enter emp contact");
		empcont=scan.nextLong();
		System.out.println("Enter empsal");
		empsal=scan.nextDouble();
		System.out.println(empname+" "+empid+" "+empcont+" "+empadd+" "+empsal+" "+gender);
		

	}

}
