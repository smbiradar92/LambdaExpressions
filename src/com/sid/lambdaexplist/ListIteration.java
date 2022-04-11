package com.sid.lambdaexplist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIteration {

	List<Integer> myList = new LinkedList<>();

	public ListIteration() { // method
		myList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 90 + 10);
			myList.add(randomNum);

		}

	}

	public static void main(String[] args) {
		ListIteration li = new ListIteration();
		System.out.println(
				"-------------Printing list-------------");
		System.out.println(li.myList);

		Iterator<Integer> intItr = li.myList.iterator();
		System.out.println(
				"------------Printing elements with Iterator---------");

		while (intItr.hasNext()) {
			System.out.println(intItr.next());
		}
		
	}
}
