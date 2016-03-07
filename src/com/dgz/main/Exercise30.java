/**
 * 
 */
package com.dgz.main;

/**题目：取一个整数a从右端开始的4～7位。
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise30 {
	InputUtils inputUtils = new InputUtils();
	long number;//7位以上的长整数；
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise30 exercise30 = new Exercise30();
		exercise30.initNumber();
		exercise30.method1();
		exercise30.method2();
	}
	public void initNumber(){
		boolean isValid = false;
		do {
			System.out.println("请输入一个7位以上的长整数");
			number = inputUtils.getInputLong();
			if(Math.abs(number) < Math.pow(10, 7)){
				System.out.println("数据输入有误，请重新输入！");
				isValid = false;
			}
			
			else {
				isValid = true;
			}
		} while (!isValid);
	}
	public void method1(){
		System.out.println("长整数：" + number + " 从右端开始的4~7位为：");
		System.out.println((int)Math.floor((number % Math.pow(10, 7))/Math.pow(10, 3)));
	}
	public void method2(){
		String ss = Long.toString(number);
		char[] a = ss.toCharArray();
		int j = a.length;
		if(j < 7){
			System.out.println("数据输入错误！");
		}else {
			System.out.println("长整数：" + number + " 从右端开始的4~7位为：\n" + 
		a[j-7] + a[j-6] + a[j-5] + a[j-4]);
		}
	}
}
