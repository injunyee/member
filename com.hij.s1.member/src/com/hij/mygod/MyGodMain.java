package com.hij.mygod;

public class MyGodMain
{
	public static void main(String args[])
	{
		MyGod god1 = MyGod.make();
		System.out.print(god1);
		
		MyGod god2 = MyGod.make();
		System.out.print("\n"+ god2);
	}//main end
}
