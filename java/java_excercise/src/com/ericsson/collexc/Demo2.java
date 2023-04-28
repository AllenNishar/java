package com.ericsson.collexc;

import java.util.*;
import java.lang.*;

public class Demo2 {

	public static int getMaxNumber(List<Integer> l1) {
		int min = l1.get(1);
		for (int i = 0; i < l1.size(); i++) {

			if (min < l1.get(i)) {
				min = l1.get(i);
			}
		}
		return min;

	}

	public static List<Integer> getOrderedList(List<Integer> l1) {
		List<Integer> list2 = new ArrayList();
		Collections.sort(l1);
		return l1;
	}
	public static int getExactMidNumber(List<Integer>l1){
		if(l1.size()%2!=0) 
			return l1.get((l1.size()%2)+1);
		else 
			return Math.max(l1.get(l1.size()%2), l1.get((l1.size()%2)));
	}
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		list1.add(145);
		list1.add(202);
		list1.add(32);
		list1.add(48);
		list1.add(598);
		list1.add(121);
		System.out.println(getMaxNumber(list1));
		System.out.println(getOrderedList(list1));
		System.out.println(getExactMidNumber(list1));
	}

}
