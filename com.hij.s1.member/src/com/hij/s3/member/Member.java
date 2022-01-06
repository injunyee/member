package com.hij.s3.member;

public class Member
{
	private String name, email;
	private double hight, weight;
	private int age;
	
	public void setage(int age)
	{
		this.age = 20;
		if((age>0) && (age<150))
		{
			this.age = age;
		}
	}
	public int getage()
	{
		return age;
	}
	
	public void setHight(int hight)
	{
		this.hight = 160;
		if((hight>=160) && (hight<=250))
		{
			
		}
	}
}//Member
