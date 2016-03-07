/**
 * 
 */
package com.dgz.main;

/**题目：将一个数组逆序输出。
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise29 {
	InputUtils inputUtils = new InputUtils();
	int length;
	int[] a ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise29 exercise29 = new Exercise29();
		exercise29.initArray();
		exercise29.printArray();
		exercise29.reverseArray();
	}
	public void initArray(){
		System.out.println("请输入数组长度：");
		length = inputUtils.getInputInt();
		a = new int[length];
		System.out.println("请输入数组元素：");
		int count = 0;
		do {
			a[count++] = inputUtils.getInputInt();
			//count++;
		} while (count < length);
	}
	public void printArray(){
		System.out.println("原始数组为：");
		for(int i:a){
			System.out.print(i + "-->");
		}
	}
	
	public void reverseArray(){
		System.out.println("\n逆序输出为：");
		for(int i = a.length-1; i >= 0; i--){
			if(i == 0){
				
				System.out.print(a[i] );
			}else {
				
				System.out.print(a[i] + "-->");
			}
		}
	}
}
