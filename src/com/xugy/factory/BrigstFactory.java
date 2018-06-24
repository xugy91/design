package com.xugy.factory;

public class BrigstFactory implements Factory {

	@Override
	public Product createTextFied() {
		return new BrigstTextField();
	}

	@Override
	public Product createButton() {
		return new BrigstButton();
	}
}
