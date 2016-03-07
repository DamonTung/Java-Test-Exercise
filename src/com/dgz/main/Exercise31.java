/**
 * 
 */
package com.dgz.main;

/**题目：打印出杨辉三角形（要求打印出10行如下图）
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[10][10];
		for(int i = 0; i < 10; i++){
			a[i][i] = 1;
			a[i][0] = 1;
		}
		for(int i = 2; i < 10; i++){
			for(int j = 1; j < i; j++){
				a[i][j] = a[i-1][j] + a[i-1][j-1];
			}
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 2*(10-i)-1; j++){
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++){
				if(a[i][j] < 10){
					System.out.print(a[i][j] + "   ");
									
				}else if(a[i][j] < 100) {
					System.out.print(a[i][j] + "  ");
					
				}else {
					System.out.print(a[i][j] + " ");
					
				}
			}
			System.out.println();
		}
	}

}
