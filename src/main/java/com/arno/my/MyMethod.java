/*
 * Unpublished work.
 * Copyright (c) 2016 by RDS Corporation. All rights reserved.
 * RDS CORPORATION CONFIDENTIAL AND TRADE SECRET
 */
package com.arno.my;

public class MyMethod {

  
  public String name;
  
  public MyMethod(String input){
    name = input;
  }
  
  public MyMethod(){
    this("arno");
  }

  
  public static void main(String[] arg){
    MyMethod myMethod = new MyMethod(" Demo Name ");
    MyMethod myMethod2 = new MyMethod();
    System.out.println(myMethod.name + "----" + myMethod2.name);
  }
    
    
}
