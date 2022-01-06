package com.hij.mygod;

public class MyGod
{
	private MyGod() {}
	
	static MyGod make()
	{
		MyGod god = new MyGod();
		return god;
	}
}
