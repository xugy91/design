package com.xugy.factory;

public class Test {
	public static void main(String[] args) {
		/**
		 * 抽象工厂中有四个角色
		 * 工厂  Factory
		 * 具体工厂 BlueSeaFactory BrigstFactory
		 * 产品  Product
		 * 具体产品 BlueSeaButton BlueSeaTextField BrigstButton BrigstTextField
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
