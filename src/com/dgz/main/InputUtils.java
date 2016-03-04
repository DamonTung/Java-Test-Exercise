/**
 * 
 */
package com.dgz.main;

import java.util.Scanner;

/**
 * 获取控制台输入
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class InputUtils {
	int value;
	String string;
	long valuelong;
	char ch;
	
	
	Scanner scanner = new Scanner(System.in);
	public int getInputInt(){
		value = scanner.nextInt();
		return value;
	}
	public long getInputLong(){
		valuelong = scanner.nextLong();
		return valuelong;
	}
	public String getInputString(){
		string = scanner.nextLine();
		return string;
	}
	public char getInputChar(){
		String string = scanner.nextLine();
		ch = string.charAt(0);
		/*if(ch < 'a' || ch > 'z' || ch <'A' || ch > 'Z'){
			System.out.println("输入数据有误，请重新输入！");
			ch = getInputChar();
		}*/
		return ch;
	}
}
