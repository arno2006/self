package com.arno.my.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class 日期大小比较 {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(sdf.parse("2017/01/03").compareTo(sdf.parse("2017/01/02")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
