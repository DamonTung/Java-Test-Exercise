/**
 * 
 */
package com.dgz.main;

/**题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。 
 * @author DamonTung
 * @date 2016年3月8日
 * @description 
 */
public class Exercise39 {
	InputUtils inputUtils = new InputUtils();
	public void method(){
		int num;
		int n = 7;
		while(n > 0){
			do {
				System.out.println("请输入一个整数值n，(0<n<50):");
				num = inputUtils.getInputInt();
			} while (num <= 0 || num > 50);
			for(int i = 0; i < num; i++){
				System.out.print("*");
			}
			n--;
			System.out.println();
		}
		System.out.println("\n=== end ===");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise39 exercise39 = new Exercise39();
		exercise39.method();
	}

}
