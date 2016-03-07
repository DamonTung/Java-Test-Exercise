/**
 * 
 */
package com.dgz.main;

/**题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise32 {
	InputUtils inputUtils = new InputUtils();
	int maxNumber;
	int minNumber;
	int maxIndex;
	int minIndex;
	int[] arrayNumber;
	int arrayLength;
	
	public void initArrayNumber(){
		System.out.println("请输入数组总长度：");
		arrayLength = inputUtils.getInputInt();
		arrayNumber = new int[arrayLength];
		System.out.println("请输入数组元素：");
		for(int i=0; i<arrayLength; i++){
			arrayNumber[i] = inputUtils.getInputInt();
		}
		System.out.println("初始数组为：");
		for(int i:arrayNumber){
			System.out.print(i + " ");
		}
		
		
	}
	
	public int[] method(){
		maxIndex = 0;
		minIndex = 0;
		maxNumber = arrayNumber[0];
		minNumber = arrayNumber[0];
		
		for(int i = 0; i < arrayLength; i++){
			if(arrayNumber[i] > maxNumber){
				maxNumber = arrayNumber[i];
				maxIndex = i;
			}
			if(arrayNumber[i] < minNumber){
				minNumber = arrayNumber[i];
				minIndex = i;
			}
		}
		if(maxIndex != 0){
			int temp = arrayNumber[0];
			arrayNumber[0] = arrayNumber[maxIndex];
			arrayNumber[maxIndex] = temp;
		}
		if(minIndex != arrayLength-1){
			int temp = arrayNumber[arrayLength-1];
			arrayNumber[arrayLength-1] = arrayNumber[minIndex];
			arrayNumber[minIndex] = temp;
		}
		return arrayNumber;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise32 exercise32 = new Exercise32();
		exercise32.initArrayNumber();
		int[] result = exercise32.method();
		
		System.out.println("\n处理后的数组为：");
		for(int i:result){
			System.out.print(i + " ");
		}
	}

}
