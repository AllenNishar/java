package com.ericsson.stringex;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ericsson";
		name.concat("india");
		System.out.println(name);
		String name1="ericsson";
		System.out.println((name.equals(name1)));
		System.out.println(name.compareTo(name1));
		System.out.println(name==name1);
	}

}
