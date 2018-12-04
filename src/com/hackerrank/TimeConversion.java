package com.hackerrank;

public class TimeConversion {

	static String timeConversion(String s) {
		
		String time=s.substring(0,8);
		String zone=s.substring(8);
		String[] t =time.split(":");
		
		int hr=Integer.parseInt(t[0]);
		String min=t[1],sec=t[2];
		
		if(zone.equalsIgnoreCase("PM"))
			return (hr+12)+":"+min+":"+sec;
		else if(zone.equalsIgnoreCase("AM")&& hr==12) 
			return "00"+":"+min+":"+sec;
		else 
			return time;

    }
	
	public static void main(String[] args) {
		
		System.out.println(timeConversion("12:05:45AM"));

	}

}
