package java_excercise;
import java.util.Scanner;

public class exc3 {
	public static void main(String[] args) {
		int num;
		String[] week={"monday","tuesday","wedneday","thursday","friday","saturday","sunday"};
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if(num<0|num>7) {
			System.out.println("Invalid input");
		}
		else {
			System.out.println(week[num-1]);
		}
		
	}
	

}
