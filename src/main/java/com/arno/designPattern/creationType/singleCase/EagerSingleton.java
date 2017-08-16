package com.arno.designPattern.creationType.singleCase;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	/*私有默认构造器*/
	private EagerSingleton(){
		
	}
	
	/*静态工厂方法*/
	public static EagerSingleton getInstance(){
		return instance;
	}
}
