/**
 * 
 */
package com.dgz.main;

import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digital = 0;
		int character = 0;
		int other = 0;
		int blank = 0;
		char ch[] = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一串字符。。。");
		String string = scanner.nextLine();
		ch = string.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(ch[i] >= '0' && ch[i] <= '9'){
				digital++;
			}else if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A'&& ch[i] <= 'Z') {
				character++;
			}else if(ch[i] ==' '){
				blank++;
			}else {
				other++;
			}
		}
		System.out.println("数字个数：" + digital);
		System.out.println("字符个数：" + character);
		System.out.println("空格个数：" + blank);
		System.out.println("其他字符个数：" + other);

	}

}
