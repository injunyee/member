package com.hij.s1.car;

public class Car
{
	static String company = "kia";
	String brand, color;
	int cc;
	
	Car()
	{
		brand = "k7";
		color = "block";
		cc = 5000;
	}
	
	public void carinfo()
	{
		System.out.printf("%s\n", company);
		System.out.printf("%s\n", brand);
		System.out.printf("%s\n", color);
		System.out.printf("%d\n", cc);
	}
}
