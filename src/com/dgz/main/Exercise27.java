/**
 * 
 */
package com.dgz.main;

/**题目：求一个3*3矩阵对角线元素之和
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise27 {
	InputUtils inputUtils = new InputUtils();
	int[][] a = new int[3][3];
	int sumOfDiagonal = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfDiagonal;
		Exercise27 exercise27 = new Exercise27();
		exercise27.initArray();
		exercise27.printArray();
		sumOfDiagonal = exercise27.getSum();
		System.out.println("所属矩阵的对角线元素之和为： " + sumOfDiagonal);

	}
	public void initArray(){
		System.out.println("请输入3*3矩阵各元素数值：");
		for(int i = 0; i < 3; i++){
			System.out.println("第" + i + "行");
			for(int j = 0; j < 3; j++){
				a[i][j] = inputUtils.getInputInt();
			}
		}
	}
	public void printArray(){
		System.out.println("初始矩阵为：");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//求对角线元素之和
	public int getSum(){
		for(int i = 0; i < 3; i++){
			//System.out.println();
			for(int j = 0; j < 3; j++){
				if(i == j){
					sumOfDiagonal += a[i][j];
				}
			}
		}
		return sumOfDiagonal;
	}
}
