package com.javalec.base;

public abstract class LaunchMenu {
	
	// field
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;
	
	
	//constructor
	public LaunchMenu() {
		// TODO Auto-generated constructor stub
	}


	public LaunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	
	//method
	
	public abstract int calc();
	

}
