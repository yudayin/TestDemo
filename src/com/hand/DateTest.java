package com.hand;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {
		
		
//		Calendar c = Calendar.getInstance();
//		Date date = new Date();
//		c.setTime(date);
//		
//		System.out.println(c);
//		System.out.println("===: "+c.getTime());
//		
//		System.out.println(Calendar.DATE);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
		String str="201608131340";
		Date parse = sdf.parse(str);
		System.out.println("==date==:"+parse);
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:sss");
//		String start = "2016-5-4 21:28:57.539"; 
//		String end = "2016-5-4 21:37:55.345"; 
//		Date startDate = sdf.parse(start);
//		Date endDate = sdf.parse(end);
//		
//		System.out.println(": "+(endDate.getTime()-startDate.getTime()));
		
		

	}

}
