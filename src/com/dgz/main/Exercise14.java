/**
 * 
 */
package com.dgz.main;

/**题目：输入三个整数x,y,z，请把这三个数由小到大输出。   
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise14 {
	InputUtils inputUtils = new InputUtils();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise14 exercise14 = new Exercise14();
		int x,y,z;
		System.out.println("请输入第一个整数：");
		x = exercise14.inputUtils.getInputInt();
		System.out.println("请输入第二个整数：");
		y = exercise14.inputUtils.getInputInt();
		System.out.println("请输入第三个整数：");
		z = exercise14.inputUtils.getInputInt();
		
		if (x > y) {
			//swap(x,y);
			int t = x;
			x = y;
			y = t;
		}
		if (x > z){
			//swap(y, z);
			int t = x;
			x = z;
			z = t;
		}
		if (y > z){
			//swap(x, z);
			int t = y;
			y = z;
			z = t;
		}
		System.out.println("从小到大排列依次为：" + x +"--"+ y + "--" + z);
	}
	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int t = x;
		x = y;
		y = t;
	}

}
