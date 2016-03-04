/**
 * 
 */
package com.dgz.main;

/**题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise23 {
	InputUtils inputUtils = new InputUtils();
	long number;
	boolean isTrue = true;//是否是回文数
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise23 exercise23 = new Exercise23();
		exercise23.method();
	}
	public void method(){
		do {//若不限位数，则取消该while条件
			System.out.println("请输入一个5位整数：");
			try {
				number = inputUtils.getInputLong();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("请输入正确数据类型：");
				break;
			}
			
		} while (number < 10000 || number > 99999);
		String string = Long.toString(number);
		char[] ch = string.toCharArray();
		int length = ch.length;
		for(int i = 0; i < length/2 - 1; i++){
			if(ch[i] != ch[length-i-1])
				isTrue=false;
		}
		if(isTrue){
			System.out.println(number + " 是一个回文数。");
		}else {
			System.out.println(number + " 不是一个回文数。");
		}
	}

}
