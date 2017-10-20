package com.arno.my.utils;
import java.math.BigDecimal;

class MyMath {
	public static double round(double num ,int scale) {
		BigDecimal big  = new BigDecimal(num);
		BigDecimal result = big.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP);
		return result.doubleValue();
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("带小数的四舍五入测试" + MyMath.round(99.4567, 3)); //994.457
		
		String ss ="=(N1";
		System.out.println(ss+")/N35*100");
		for (int i = 2; i < 35; i++) {
			ss=ss+"+N"+i;
			System.out.println(ss+")/N35*100");
			
		}
	}
}