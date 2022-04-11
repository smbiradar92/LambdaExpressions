package com.sid.lambdaexplist;

import java.util.function.Consumer;

public class ConsumerImpl<T> implements Consumer<T> {

	public void accept(Integer t) {
		System.out.println(t);
	}

	@Override
	public void accept(T t) {
		System.out.println(t);
	}

}
