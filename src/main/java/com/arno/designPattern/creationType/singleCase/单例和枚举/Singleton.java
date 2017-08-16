package com.arno.designPattern.creationType.singleCase.单例和枚举;

public enum Singleton {

    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
	uniqueInstance;
    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }
    public String[] buildString(){  
        final String[] strs = new String[2];  
  
        strs[0] = "0";  
        strs[1] = "0";  
        return strs;  
    }
    
    public static void main(String[] agr){
    	 String[] strs = Singleton.uniqueInstance.buildString();
    }
}
