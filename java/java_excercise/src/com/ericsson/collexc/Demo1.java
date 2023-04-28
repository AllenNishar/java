package com.ericsson.collexc;
import java.util.*;

public class Demo1 {
	public static List<Integer> getZigZag(List<Integer>l1,List<Integer>l2){
		List<Integer> res=new ArrayList<>();
		for(int i=0;i<l1.size();i++) {
			if(i%2==0) {
				res.add(i, l1.get(i));
			}
			else {
				res.add(i, l2.get(i));
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		List<Integer> list2=new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		System.out.println(getZigZag(list1,list2));
		
	}

}
