/**
 * 
 */
package com.dgz.main;

import java.util.Scanner;

/**题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
 *在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
 * 取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，
 * 最小公倍数为两数之积除以最大公约数。
 *

 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,m;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请键入一个整数：");
		a = scanner.nextInt();
		System.out.println("请键入另一个整数：");
		b = scanner.nextInt();
		m = new deff(a,b).deff1();
		System.out.println(a + " 和 " + b + "的最大公约数是： " + m);
		System.out.println(a + " 和 " + b + "的最小公倍数是： " + a*b/m);
		
	}

	

}
class deff{
	int x,y;
	public deff(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int deff1(){
		// TODO Auto-generated method stub
		int t;
		if( x < y){
			t = x;
			x = y;
			y = t;
		}
		while(y != 0){
			if (x == y) {
				return x;
			}else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
