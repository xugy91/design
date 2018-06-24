package com.xugy.factory;

public class BlueSeaFactory implements Factory {

	@Override
	public Product createTextFied() {
		return new BlueSeaTextField();
	}

	@Override
	public Product createButton() {
		return new BlueSeaTextButton();
	}
}
