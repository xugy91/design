package com.xugy.responsibility;

public class Test {
	/**���������ģʽ
	 * �������� AbstractClerk �����˳������  ���ݹ�����Ϣ����
	 * ���崦���� Leader Boss ���������Ϣ
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractClerk boss = new Boss();
		AbstractClerk leader = new Leader();
		leader.setSuper(boss);
		leader.borrow(6000);
	}
}
