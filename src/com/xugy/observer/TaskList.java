package com.xugy.observer;

import java.util.Observable;

public class TaskList extends Observable {
	public void notity(){
		this.setChanged();
		this.notifyObservers();
		this.clearChanged();
	}
}
