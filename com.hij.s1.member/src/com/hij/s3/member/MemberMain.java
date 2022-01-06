package com.hij.s3.member;

public class MemberMain
{
	public static void main(String args[])
	{
		Member member = new Member();
		member.setAge(40);
		member.setHight(180);
		member.setEmail("ghkd6947@naver.com");
		
		System.out.printf("%d\n", member.getAge());
		System.out.printf("%f\n", member.getHight());
		System.out.printf("%s\n", member.getEmail());
	}
}