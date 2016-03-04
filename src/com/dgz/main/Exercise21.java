/**
 * 
 */
package com.dgz.main;

/**题目：利用递归方法求5!。
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise21 exercise21 = new Exercise21();
		System.out.println("5! = " + exercise21.rec(5));
	}
	public long rec(int n){
		long value = 0;
		if(n==1){
			value=1;
		}else {
			value = n*rec(n-1);
		}
		return value;
	}
}
