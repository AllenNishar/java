package oops;

public class MethodOverloading {
	public void add(int a,int b) {
		System.out.println("Add of two int is  "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Add of two int is  "+(a+b+c));
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.add(12,13);
		obj.add(12,12,12);
	}

}
