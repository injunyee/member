package com.hij.s3.member;

public class Member
{
	private String name, email;
	private double hight, weight;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}// name i/o
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}// email i/o
	
	public double getHight()
	{
		return hight;
	}
	public void setHight(double hight)
	{
		this.hight = hight;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
}//class Member