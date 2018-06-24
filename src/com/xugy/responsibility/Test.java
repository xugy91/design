package com.xugy.responsibility;

public class Test {
	/**责任链设计模式
	 * 抽象处理类 AbstractClerk 定义了抽象规则  根据规则信息处理
	 * 具体处理类 Leader Boss 具体规则信息
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractClerk boss = new Boss();
		AbstractClerk leader = new Leader();
		leader.setSuper(boss);
		leader.borrow(6000);
	}
}
