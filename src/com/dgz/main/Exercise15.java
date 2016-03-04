/**
 * 
 */
package com.dgz.main;

/**题目：输出9*9口诀
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j +"*"+ i+" = " + i*j + " ");
				if(j*i < 10)System.out.print(" ");
			}
			System.out.println();
		}
	}

}
