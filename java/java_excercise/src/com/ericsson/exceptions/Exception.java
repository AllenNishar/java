package com.ericsson.exceptions;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for division");
		int num = scan.nextInt();
		System.out.println("Enter the second number");
		int num1 = scan.nextInt();
			try {
		int result = num / num1;
			
			
		System.out.println("Division of two numbers is " + result);
			}catch(ArithmeticException exception) {
				System.out.println("Can't divide by zero");
			}
			System.out.println("Remaining 10000 lines of code");
			
		// TODO Auto-generated method stub

	}

}
