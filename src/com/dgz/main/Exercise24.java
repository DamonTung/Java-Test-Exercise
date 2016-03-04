/**
 * 
 */
package com.dgz.main;

/**题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise24 {
	InputUtils inputUtils = new InputUtils();
	char ch;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise24 exercise24 = new Exercise24();
		exercise24.method();

	}
	public void method(){
		System.out.println("请输入第一个大写字符：");
		ch = inputUtils.getInputChar();
		switch (ch) {
		case 'M':
			System.out.println("Monday...周一");
			break;
		case 'W':
			System.out.println("Wednesday...周三");
			break;
		case 'F':
			System.out.println("Friday...周五");
		case 'T':
			System.out.println("请输入第二个大写字符：");
			char ch2 = inputUtils.getInputChar();
			if(ch2 == 'H'){
				System.out.println("Tuesday...周二");
				break;
			}else if(ch2 == 'H'){
				System.out.println("Thursday...周四");
				break;
			}else {
				System.out.println("输入错误。");
				break;
			}
		case 'S':
			System.out.println("请输入第二个大写字符：");
			char ch3 = inputUtils.getInputChar();
			if(ch3 == 'A'){
				System.out.println("Saturday...周六");
				break;
			}else if(ch3 == 'U'){
				System.out.println("Sunday...周日");
				break;
			}else {
				System.out.println("输入错误。");
				break;
			}
		default:
			System.out.println("输入错误。");
			break;
		}
	}

}
