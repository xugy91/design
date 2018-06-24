package com.xugy.strategy;

public class Test {
	/**
	 * ����ģʽ��������ɫ
	 * ������� Strategy
	 * ������� ChooseStrategy BubbleStrategy
	 * ������ Context
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
