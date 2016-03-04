/**
 * 
 */
package com.dgz.main;

import java.util.Scanner;

/**
 * 题目：企业发放的奖金根据利润提成。
 * 利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润，求应发放奖金总数？ 
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise11 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double profit;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入当月利润(万)：");
		profit = scanner.nextDouble();
		if(profit < 0 ){
			System.out.println("数字无效；");
		}
		System.out.println("所得提成应为：" + new calcProfit(profit).calcProfitLast() + " 万");
	}

}
class calcProfit{
	double percentage;
	double total;
	public calcProfit(double profit) {
		// TODO Auto-generated constructor stub
		this.total = profit;
	}
	// < 10万
	public double calcP1(double i){
		return i*0.1;
	}
	// 10 - 20
	public double calcP2(double i){
		return i*0.075;
	}
	//20-40
	public double calcP3(double i){
		return i*0.05;
	}
	//40-60
	public double calcP4(double i){
		return  i*0.03;
	}
	//60-100
	public double calcP5(double i){
		return i*0.015;
	}
	//>100
	public double calcP6(double i){
		return i*0.01;
	}
	public double calcProfitLast(){
		if(total < 10){
			percentage = calcP1(total);
		}else if(total < 20){
			percentage = calcP1(10) + calcP2(total - 10);
		}else if(total < 40){
			percentage = calcP1(10) + calcP2(10) + calcP3(total - 20);
		}else if(total < 60){
			percentage = calcP1(10) + calcP2(10) + calcP3(20) + calcP4(total - 40);
		}else if(total < 100){
			percentage = calcP1(10) + calcP2(10) + calcP3(20) + calcP4(20) + calcP5(total - 60);
		}else {
			percentage = calcP1(10) + calcP2(10) + calcP3(20) + calcP4(20) + calcP5(40) + calcP6(total - 100);
		}
		return percentage;
	}
}
