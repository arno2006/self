package com.arno.设计模式.创建型.singleCase;

public class LazySingleton {

	private static LazySingleton instance  = null ;
	
	/*私有构造器*/
	private LazySingleton(){
		
	}
	
	/*静态工厂方法*/
	public static synchronized LazySingleton getInstance(){
		
		if(instance == null ){
			instance = new LazySingleton();
		}
		return instance;
	}
}
