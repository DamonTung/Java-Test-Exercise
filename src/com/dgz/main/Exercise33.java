/**
 * 
 */
package com.dgz.main;

/**题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise33 {
	InputUtils inputUtils = new InputUtils();
	int sourceArray[];
	int length;
	int[] tempArray;
	int tempLength;
	
	public void initSourceArray(){
		System.out.println("请输入原始数组长度:");
		length = inputUtils.getInputInt();
		sourceArray = new int[length];
		System.out.println("请输入各数组元素：");
		for(int i = 0; i < length; i++){
			sourceArray[i] = inputUtils.getInputInt();
		}
		System.out.println("初始化数组为：");
		for(int i:sourceArray){
			System.out.print(i + " ");
		}
	}
	
	public void shiftArray(int[] source){
		System.out.println("请输入数组移动位数:");
		tempLength = inputUtils.getInputInt();
		tempArray = new int[tempLength];
		for(int i = 0; i < tempLength; i++){
			tempArray[i] = source[source.length-tempLength+i];
		}
		
		//下面方法有问题。。。。
//		for(int i = 0; i < source.length-tempLength; i++){
//			source[tempLength+i] = source[i ];
//		}
		for(int i = source.length - 1; i >= tempLength; i--){
			source[i] = source[i - tempLength];
		}
		for(int i = 0; i < tempLength; i++){
			source[i] = tempArray[i];
		}
		System.out.println("移位后的数组为：");
		for(int i:source){
			System.out.print(i + " ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise33 exercise33 = new Exercise33();
		exercise33.initSourceArray();
		exercise33.shiftArray(exercise33.sourceArray);
	}

}
