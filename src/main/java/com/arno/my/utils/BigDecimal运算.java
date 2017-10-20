package com.arno.my.utils;

import java.math.BigDecimal;

public class BigDecimal运算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*减法*/
		
		BigDecimal b1 = new BigDecimal(600000.000000);;
		BigDecimal b2 = new BigDecimal(600000.000000);
		System.out.println(b1.subtract(b2));
		System.out.println(b1.add(b2));
		
		System.out.println(b2.compareTo(b1)>0);
		
		
		BigDecimal a1 = new BigDecimal(15);
		BigDecimal a2 = new BigDecimal(40);
		System.out.println(a1.divide(a2, 2, BigDecimal.ROUND_HALF_UP).doubleValue()*100);
	}

}
