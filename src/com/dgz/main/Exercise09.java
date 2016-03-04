/**
 * 
 */
package com.dgz.main;

/**题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
 * 求它在     第10次落地时，共经过多少米？第10次反弹多高？ 
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double init =100;
		double sum = init;
		double t = 0;
		for(int i = 1; i < 10; i++){
			sum += init;
			init /= 2;
		}
		System.out.println("第十次落地时总共经过了 " + sum + " 米。");
		System.out.println("第十次落地时反弹高度为 " + init/2 + " 米。");
	}

}
