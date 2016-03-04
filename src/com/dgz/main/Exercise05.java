/**
 * 
 */
package com.dgz.main;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		int x;
		System.out.println("请输入成绩：");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		grade = x >= 90? 'A': x >= 60? 'B':'C';
		System.out.println(x + " 分的成绩属于： " + grade);
	}

}
