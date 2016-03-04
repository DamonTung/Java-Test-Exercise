/**
 * 
 */
package com.dgz.main;

import java.util.Scanner;

/**题目：求s=a+aa+aaa+aaaa+aa...a的值，
 * 其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数值：");
		a = scanner.nextInt();
		System.out.println("请输入相加的项数：");
		b = scanner.nextInt();
		int i = 0;
		int sum = 0;
		while(i < b){
			sum += (b-i)*a*Math.pow(10, i);
			i++;
		}
		System.out.println("sum = " + sum);
		
	}

}

