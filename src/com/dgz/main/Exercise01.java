package com.dgz.main;
/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
//这是一个菲波拉契数列问题

 * @author DamonTung
 * @date 2016年3月3日
 * @description
 */
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1 = 1;
		int m2 = 1;
		System.out.println("第1个月兔子对数为：" + m1);
		System.out.println("第2个月兔子对数为：" + m2);
		int m,M = 24;
		for(int i = 3; i <= M; i++){
			m = m2;
			m2 = m1+m2;
			m1 = m;
			System.out.println("第" + i + "个月兔子对数为：" + m2);
		}

	}

}
