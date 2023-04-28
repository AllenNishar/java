
public class Methods_ex { 
	int a=90;
	int b=2;
	public static int addOfTwo(int a, int b) {
		return a+b;
	}
	public  int mulOfTwo() {
		return a*b;
	}
	public void divOfTwo() {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Methods_ex.addOfTwo(90,5));
		Methods_ex obj=new Methods_ex();
		System.out.println(obj.mulOfTwo());
		obj.divOfTwo();
	}

}
