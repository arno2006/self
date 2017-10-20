package com.arno.my.java字符串截取;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="MTB_XW_001_2";
		
		 str=str.substring(0,str.lastIndexOf("_")); // or  str=str.Remove(i,str.Length-i); 
		 System.out.println(str);

	}

}
