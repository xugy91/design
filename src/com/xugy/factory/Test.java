package com.xugy.factory;

public class Test {
	public static void main(String[] args) {
		/**
		 * ���󹤳������ĸ���ɫ
		 * ����  Factory
		 * ���幤�� BlueSeaFactory BrigstFactory
		 * ��Ʒ  Product
		 * �����Ʒ BlueSeaButton BlueSeaTextField BrigstButton BrigstTextField
		 */
		Factory fac = new BlueSeaFactory();
		Product createButton = fac.createButton();
		Product createTextFied = fac.createTextFied();
		createTextFied.display();
		createButton.display();
		
		fac = new BrigstFactory();
		createButton = fac.createButton();
		createTextFied = fac.createTextFied();
		createTextFied.display();
		createButton.display();
	}
}
