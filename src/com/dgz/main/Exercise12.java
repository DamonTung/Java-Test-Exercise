/**
 * 
 */
package com.dgz.main;

/**题目：一个整数，它加上100后是一个完全平方数，再加上268又是一个完全平方数，请问该数是多少？ 
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = -100; i < 1000000000; i++){
			if(Math.sqrt(i+100) % 1 == 0 && Math.sqrt(i+268) % 1 ==0){
				System.out.println( i + " 加上100后是一个完全平方数，再加上268又是一个完全平方数. ");
			}
		}
	}

}
