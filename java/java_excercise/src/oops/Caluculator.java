package oops;

//ctrl+shift+f,ctrtl+/,
//java.lang is the by default package for every java file
//java.lang is the super class fir every java class
class SuperParent {
	int age = 32;
	static int id = 100;

	public void mod(int a, int b) {
		System.out.println("mod of two numbers" + (a % b));
	}
}

class parent extends SuperParent {
	public void div(int a, int b) {
		System.out.println("division of two numbers" + (a / b));
	}

	public void mul(int a, int b) {
		System.out.println("multipication of two numbers" + (a * b));
	}
}

public class Caluculator extends parent {
	public void add(int a, int b) {
		System.out.println("add of two numbers" + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("subraction of two numbers" + (a - b));
	}

	public static void main(String[] args) {
		Caluculator obj = new Caluculator();
		obj.add(12, 13);
		obj.sub(22, 33);// TODO Auto-generated method stub
		obj.mul(13, 2);
		obj.mod(12, 2);
		System.out.println(SuperParent.id);

	}

}
