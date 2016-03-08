/**
 * 
 */
package com.dgz.main;

/**题目：编写一个函数，
 * 输入n为偶数时，调用函数求1/2+1/4+...+1/n,
 * 当输入n为奇数时，调用函数1/1+1/3+...+1/n
 * (利用指针函数)
 * @author DamonTung
 * @date 2016年3月8日
 * @description 
 */
public class Exercise35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputUtils inputUtils = new InputUtils();
		System.out.println("请输入一个正整数：");
		int n = inputUtils.getInputInt();
		double result = 0;
		
		if(n % 2 == 0){
			for(int i = 2; i <= n; i+=2){
				result += (double) 1/i;
			}
		}else {
			for(int i = 1; i <= n; i+=2){
				result += (double) 1/(i);
			}
		}
		
		System.out.println("所求序列之和为：" + result);
	}

}
