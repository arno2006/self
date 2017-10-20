package com.arno.my.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Map获取值 {
	public static void main(String[] args) {
		
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>> ();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		map.put("1", list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("b1");
		list2.add("b2");
		list2.add("b3");
		map.put("2", list2);
		
		map.get("1").add("4");
		
		System.out.println();
		
		
	}
	
	

}
