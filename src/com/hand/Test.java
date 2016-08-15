package com.hand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
//		String str="1234";
//		String regex=".*[a-zA-Z]+.*";
//		Matcher m=Pattern.compile(regex).matcher(str);
//		System.out.println(m.matches());//true
		File file = new File("D:\\app.txt");
		  StringBuffer sb=new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(file);
			 byte[] buf = new byte[1024];
	       
	         while((fis.read(buf))!=-1){
	             sb.append(new String(buf));    
	             buf=new byte[1024];//重新生成，避免和上次读取的数据重复
	             
	         }
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(sb.toString());
		StringBuilder logMessage = new StringBuilder();
		logMessage.append("{ \"storeCode\": \"100068\", \"telephone\": \"18516591754\", \"startTime\": \"2015-04-28 12:11:38\", \"endTime\": \"2016-04-28 20:11:38\", \"pageNum\": \"0\", \"pageQuantity\":\"10\", \"status\": \"READY\", \"consignmentSync\": \"N\",\"acceptFlag\": \"N\" }");

		logMessage.append("\n"+sb.toString());
		System.out.println("====="+logMessage);
		int lastIndexOf = logMessage.lastIndexOf("\"wsConsignmentDatas");
		System.out.println(lastIndexOf);
		int lastIndexOf2 = logMessage.lastIndexOf("]");
		System.out.println(lastIndexOf2);
		String substring = logMessage.substring(0, lastIndexOf);
		System.out.println(substring+"}");
	}

}
