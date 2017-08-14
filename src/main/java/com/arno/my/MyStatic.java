/*
 * Unpublished work.
 * Copyright (c) 2016 by RDS Corporation. All rights reserved.
 * RDS CORPORATION CONFIDENTIAL AND TRADE SECRET
 */
package com.arno.my;

public class MyStatic {


  public static int sum = 0 ; // 静态变量
  
  static {  // 静态初始化块
    print();
    System.out.println(" this is static block ");
    
  }
  
  { // 实例初始化块
    System.out.println(" 实例初始化块 ： " + sum );
  }
  
  public MyStatic(){ //构造方法
    System.out.println(" this is MyStatic's constructor ~");
    sum++;
    System.out.println(" this is MyStatic's constructor ~ sum: " +sum);
  }
  
  public static void print(){
    System.out.println(" this is static method ~");
  }
  
  
  
  
  
  public static void staticMethod() {
    //this.
  }

  public  void method() {
    //this.
  }
  
  public static void main(String [] arg){
   
    System.out.println(" this is main method ~");
    MyStatic myStatic = new MyStatic();
  }
}
