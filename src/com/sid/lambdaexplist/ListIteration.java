package com.sid.lambdaexplist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListIteration {

	List<Integer> myList = new LinkedList<>();

	public ListIteration() { // Constructor for iteration
		myList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 90 + 10);
			myList.add(randomNum);

		}

	}

	public static void main(String[] args) {
		ListIteration li = new ListIteration(); // obj to access mylist in main
		System.out.println(
				"-------------Printing mylist object-------------");
		System.out.println(li.myList);

		Iterator<Integer> intItr = li.myList.iterator();
		System.out.println(
				"------------Printing list elements with Iterator---------");

		while (intItr.hasNext()) {
			System.out.println(intItr.next());
		}
		System.out.println(
				"------------Print elements with consumer class----------");
		Consumer<Integer> myConsumer = new ConsumerImpl<>();
		li.myList.forEach(myConsumer);

		System.out.println(
				"--------------print list element with consumer with implements---------");
		li.myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
	}

}