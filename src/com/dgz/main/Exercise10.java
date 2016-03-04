/**
 * 
 */
package com.dgz.main;

/**题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？   
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("1、2、3、4四个数字，组成的互不相同且无重复数字的三位数为：");
		for(int i = 1; i <=4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k =1; k <=4; k++){
					if(i != j && i!= k && j != k){
						count++;
						System.out.print(i*100 + j*10 + k + " ;");
						if (count % 6 == 0) {
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("总个数为：" + count);
	}

}
