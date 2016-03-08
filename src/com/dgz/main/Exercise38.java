/**
 * 
 */
package com.dgz.main;

import java.lang.reflect.Method;

/**题目：求0—7所能组成的奇数个数
 * @author DamonTung
 * @date 2016年3月8日
 * @description 
 */
public class Exercise38 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputUtils inputUtils = new InputUtils();
		System.out.println("请输入由0-7所组成的奇数的位数n(n>=3)：");
		int n = inputUtils.getInputInt();
		Method(n);
	}

	private static void Method(int n) {
		// TODO Auto-generated method stub
		long sum = 4;
		long total = sum;
		int j;
		System.out.println("组成1位数是 " + sum + " 个");
		if(n==1)return;
		sum = sum * 7;
		total += sum;
		System.out.println("组成2位数是 " + sum + " 个");
		if(n==2)return;
		for (j = 3; j <= n; j++) {
			sum = sum * 8;
			total += sum;
			System.out.println("组成" + j + "位数是 " + sum + " 个");
		}
		System.out.println("总个数为：" + total);
	}

}
