/**
 * 
 */
package com.dgz.main;

/**题目：809*??=800*??+9*??    
 * 其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。
 * 求??代表的两位数，及809*??后的结果。
 * @author DamonTung
 * @date 2016年3月8日
 * @description 
 */
public class Exercise37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 10; i < 100; i++){
			if (i*8 > 10 && i*8 < 100 && i*9 > 99 && i*9 <1000) {
				if (809 * i == 800 * i + 9 * i) {
					System.out.println("题目所求两位数为：" + i);
					System.out.println("809*" + i + " = " + (809 * i));
				} else {
					System.out.println("不存在满足条件的两位数。");
				}
			}
		}
	}

}
