package com.xugy.observer;

import java.util.Observable;
import java.util.Observer;

public class CodePerson2 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�ĸ�bug��");
	}

}
