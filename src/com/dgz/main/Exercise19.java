/**
 * 
 */
package com.dgz.main;

/**题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 1;
		int t;
		double sum = 0;
		for(int i = 0; i < 20; i++){
			sum += (double)x/y;
			System.out.print("("+x+"/"+ y+")");
			if( i < 19)System.out.print( "+");
			if((i+1) % 6 == 0)System.out.println();
			t = y;
			y = x;
			x = y +t;
		}
		System.out.println(" = " + sum);
	}

}
