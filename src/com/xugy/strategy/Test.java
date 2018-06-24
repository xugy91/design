package com.xugy.strategy;

public class Test {
	/**
	 * 策略模式有三个角色
	 * 抽象策略 Strategy
	 * 具体策略 ChooseStrategy BubbleStrategy
	 * 上下文 Context
	 * @param args
	 */
	public static void main(String[] args) {
		int []a = {1,2};
		Strategy strategy = new ChooseStrategy();
		Context context = new Context(strategy);
		context.sort(a);
		strategy = new BubbleStrategy();
		context = new Context(strategy);
		context.sort(a);
	}
}
