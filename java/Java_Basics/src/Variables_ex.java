
public class Variables_ex {
	boolean output=true;//global variable
	static int countrycode=91;
	int empid=1111;
	
	public static void main(String[] args) {
		byte age=22;
		int salary=9230902;
		float marks=234.8913675983f;
		double result=234.8913675983;//local variables
		System.out.println(age+" "+salary+" "+marks+" "+result+" " );
		System.out.println(Variables_ex.countrycode);
		Variables_ex obj=new Variables_ex();
		System.out.println(obj.empid);
		
		
	}

}
