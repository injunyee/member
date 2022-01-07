package com.hij.test;
import java.util.*;
import java.text.*;

public class Test2
{
	public static void main(String args[])
	{
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.printf("program start\n");
		
		System.out.print(date.format(today));
		System.out.printf("%s", date.format(today));
		System.out.printf("오늘 날짜는 %s\n", date.format(today));
		System.out.printf("오늘 시간은 %s\n", time.format(today));
	}
}