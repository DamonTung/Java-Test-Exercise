/**
 * 
 */
package com.dgz.main;

/**题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise22 {
	InputUtils inputUtils = new InputUtils();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise22 exercise22 = new Exercise22();
		exercise22.method1();
	}
	public void method1(){
		System.out.println("请输入一个5位以内的正整数：");
		long tt = inputUtils.getInputLong();
		String string = Long.toString(tt);
		char[] ss = string.toCharArray();
		int length = ss.length;
		System.out.println(string + " 是一个 " + length+"位数。");
		System.out.println("逆序输出：");
		for(int i = length - 1; i >= 0; i--){
			System.out.print(ss[i] + " ");
		}
	}

}
