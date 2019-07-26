package com.pradeep.geek;

public class TImeCalculator {
    static String  totaltime=null;
	public static  String calculateTime(String... time) {
		String [] time_ind=new String[2];
		int total_time_in_hour=0;
		int total_minute_time=0;
		
		for(String s:time) {
			time_ind=s.split(":");
			total_minute_time+=Integer.parseInt(time_ind[1]);
			if(total_minute_time>=60) {
				int temp=total_minute_time/60;
				total_minute_time=total_minute_time%60;
				total_time_in_hour+=temp;
			}
		   if(Integer.parseInt(time_ind[0])>9) {total_time_in_hour+=9;continue;}
			
		    total_time_in_hour+=Integer.parseInt(time_ind[0]);
			
		}
		
		return total_time_in_hour+":"+total_minute_time;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(calculateTime("7:35","1:15","7:46","7:54"));
	}

}
