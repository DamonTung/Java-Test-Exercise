/**
 * 
 */
package com.dgz.main;

/**题目：求1+2!+3!+...+20!的和  
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		long fac = 1;
		for(int i = 1; i <= 20; i++){
			fac = fac * i;
			sum += fac;
		}
		System.out.println("1+2!+3!+...+20! = " +sum);
	}

}
