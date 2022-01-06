package com.hij.s3.member;
import java.util.*;

public class MemberMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member();
		member.setage(40);
		
		System.out.printf("%d", member.getage());
	}
}