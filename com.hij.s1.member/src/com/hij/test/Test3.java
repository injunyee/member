package com.hij.test;

class Test4
{
	public Test4() {}
	
	public Test4(int a)
	{
		System.out.printf("hellow world\n");
	}
	
	int b = 20;
	
	Test3 t3 = new Test3();
}

class Unit
{
	int a;
	int b;
	public void hi()
	{
		System.out.printf("hellow");
	}
}

public class Test3
{
	public static void main(String[] args)
	{
		int i = 10;
		Unit unit[] = new Unit[i];
		for(i=0; i<10; i++)
		{
			unit[i] = new Unit();
		}
		
		for(i=0; i<unit.length; i++)
		{
			System.out.print(unit[i] + "\n");
		}
	}
}







