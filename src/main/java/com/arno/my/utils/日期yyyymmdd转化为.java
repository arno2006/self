package com.arno.my.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 日期yyyymmdd转化为 {

	public static void main(String[] args) throws Exception {
		   SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	       formatter.setLenient(false);
	       Date newDate= formatter.parse("20151027");
	       formatter = new SimpleDateFormat("yyyy/MM/dd");
	       System.out.println(formatter.format(newDate));
	}

}
