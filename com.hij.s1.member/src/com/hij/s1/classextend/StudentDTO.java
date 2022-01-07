package com.hij.s1.classextend;

public class StudentDTO
{
	String name;
	int num, kor, eng, math;
}//1학년 공통과목

class StudentDTO2 extends StudentDTO
{
	int history;
}//2학년 역사과목추가

class StudentDTO3 extends StudentDTO2
{
	int physics;
}//3학년 물리과목추가
class StudentDTO4 extends StudentDTO3
{
	int music;
	
	
}//4학년 음악 과목추가