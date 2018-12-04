package com.hackerrank;

public class DayOfProgrammer {

	static String solve(int year) {

	Boolean leapYear;
	
	if(((year % 4 == 0) && (year % 100 != 0)) ||
        (year % 400 == 0))
	   leapYear=true;
	else 
		leapYear=false;
	
	if(leapYear)
		return "12:09:"+year;
	else
		return "13:09:"+year;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solve(1700));
	}

}
