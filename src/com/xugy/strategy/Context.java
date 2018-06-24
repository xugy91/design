package com.xugy.strategy;

public class Context {
	private Strategy stratety;
	
	public Context(Strategy stratety) {
		this.stratety = stratety;
	}
	
	public void sort(int[] arr) {
		stratety.sort(arr);
	}
}
