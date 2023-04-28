package com.ericsson.exceptions;

import java.util.Scanner;

class invalid extends Throwable {
	private String username;
	private String pass;
	
	public  invalid(String username,String pass) {
		this.username=username;
		this.pass=pass;
	}
	public String toString() {
		return "Credentials invalid"+ username+ pass;
	}

}

public class Task {
	static void cred(String username,String pass)throws invalid {
		if(username.equals("ericsson") && pass.equals("ericsson123")) 
			System.out.println("Login Sucess");
		
		else
			throw new invalid(username,pass);
			
		
	}
	
	

	public static void main(String[] args)throws invalid {
		String username;
		String pass;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the username");
		username=scan.nextLine();
		System.out.println("Enter password");
		pass=scan.nextLine();
		Task.cred(username, pass);
		System.out.println("Rest of the code");
		
		// TODO Auto-generated method stub

	}

}
