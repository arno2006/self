/*
 * Unpublished work.
 * Copyright (c) 2016 by RDS Corporation. All rights reserved.
 * RDS CORPORATION CONFIDENTIAL AND TRADE SECRET
 */
package com.arno.my;

public abstract class MyAbstract {
  
/*  abstract 规则：
  1：抽象类可以没有抽象方法，但是有抽象方法的类必须定义为抽象类，如果一个子类继承一个抽象类，子类没有实现父类的所有抽象方法，那么子类也要定义为抽象类，否则的话编译会出错的。
  2：抽象类没有构造方法，也没有抽象静态方法。但是可以有非抽象的构造方法
  3：抽象类不能被实例化，但是可以创建一个引用变量，类型是一个抽象类，并让它引用非抽象类的子类的一个实例
  4：不能用final 修饰符修饰*/
  
  /*1：抽象类可以没有抽象方法，但是有抽象方法的类必须定义为抽象类*/
  public  void myNoAbstractMethod(){
    
  }
  
  public abstract void myAbstractMethod();

}
