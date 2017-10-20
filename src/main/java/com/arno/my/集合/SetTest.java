package com.arno.my.集合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set  set=new HashSet();
		   set.add("abc");
		   set.add("cde");
		   set.add("efg");
		   set.add("fgh");    
		   set.add("abc"); //重复的abc,set会自动将其去掉   
		   System.out.println("size="+ set.size() );
		   System.out.println("contains="+ set.contains("abc1") );
		    List list = new ArrayList();
		    list.add("abc");
		    list.add("aaa");
		    list.add("fff");
		    set.addAll(list); //将list中的值加入set,并去掉重复的abc
		         System.out.println("size="+ set.size() );
		        for( Iterator   it = set.iterator();  it.hasNext(); )
		        {             
		            System.out.println("value="+it.next().toString());            
		        } 
	}

}
