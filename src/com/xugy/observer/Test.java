package com.xugy.observer;

public class Test {
	/**
	 * 观察者 TaskList
	 * 被观察者 CodePerson1 CodePerson2
	 * @param args
	 */
	public static void main(String[] args) {
		CodePerson1 code = new CodePerson1();
		CodePerson2 code2 = new CodePerson2();
		TaskList task = new TaskList();
		task.addObserver(code);
		task.addObserver(code2);
		task.notity();
	}
}
