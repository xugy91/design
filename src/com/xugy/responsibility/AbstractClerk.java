package com.xugy.responsibility;

public abstract class AbstractClerk {
	private AbstractClerk abstractClerk = null;
	protected String type;
	protected int limit;
	
	
	public String getType() {
		return type;
	}

	public int getLimit() {
		return limit;
	}

	public void setSuper(AbstractClerk abstractClerk){
		this.abstractClerk = abstractClerk;
	}
	
	public void borrow(int limit) {
		if(this.limit>=limit) {
			System.out.println(getType()+"同意了您借款"+limit);
		} else {
			if(abstractClerk==null) {
				System.out.println("不借");
			} else {
				abstractClerk.borrow(limit);
			}
		}
	};
}
