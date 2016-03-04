/**
 * 
 */
package com.dgz.main;

/**
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
 * 因为153=1的三次方＋5的三次方＋3的三次方。
 * 
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1,b2,b3;
		System.out.println("水仙花数如下");
		for(int i = 100; i <= 999; i++){
			b3 = i / 100;
			b2 = i % 100 / 10;
			b1 = i % 10;
			if(b3*b3*b3 + b2*b2*b2 + b1*b1*b1 == i){
				System.out.println(i);
			}
		}
	}

}
