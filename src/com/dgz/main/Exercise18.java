/**
 * 
 */
package com.dgz.main;

/**
 * 题目：打印出如下图案（菱形）   
		     *   
		    ***   
		   *****   
		  *******   
		   *****   
		    ***   
		     *   

 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H = 7, W = 7;// 高和宽必须是相等的奇数
		for (int i = 0; i < (H + 1) / 2; i++) {
			for (int j = 0; j < W / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i + 1) * 2; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i <= H / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= W - 2 * i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}

