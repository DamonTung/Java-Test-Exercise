/**
 * 
 */
package com.dgz.main;

import java.net.Inet4Address;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.omg.CORBA.portable.ValueBase;

/**题目：输入某年某月某日，判断这一天是这一年的第几天？
 * @author DamonTung
 * @date 2016年3月3日
 * @description 
 */
public class Exercise13 {
	int year;
	int month;
	int day;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totals = 0;
		boolean b = true;
		int y,m,d;
		Exercise13 exercise13 = new Exercise13();
		do {
			b = false;
			System.out.println("请输入年份：");
			exercise13.year = exercise13.input();
			if(exercise13.year < 0){
				b = true;
				System.out.println("输入数据有误，请重新输入！");
				continue;
			}
			System.out.println("请输入月份：");
			exercise13.month = exercise13.input();
			if(exercise13.month < 0
					|| exercise13.month > 12){
				b = true;
				System.out.println("输入数据有误，请重新输入！");
				continue;
			}
			System.out.println("请输入天：");
			exercise13.day = exercise13.input();
			if ( exercise13.day < 0
					|| exercise13.day > 31 ) {
				b = true;
				System.out.println("输入数据有误，请重新输入！");
				continue;
			}
			if ((exercise13.isThirty(exercise13.month)) && exercise13.day > 30) {
				b = true;
				System.out.println("输入数据有误，请重新输入！");
				continue;
			}
			if(exercise13.month == 2 && exercise13.day > 29){
				b = true;
				System.out.println("输入数据有误，请重新输入！");
				continue;
			}
			if(!exercise13.isLeapYear(exercise13.year)&&exercise13.month == 2 && exercise13.day > 28){
				b = true;
				System.out.println("输入数据有误，请重新输入！");
				continue;
			}
		} while (b);
		y = exercise13.year;
		m = exercise13.month;
		d = exercise13.day;
		for(int i = 1; i < m; i++){
			totals += exercise13.getDaysPerMonth(i);
		}
		System.out.println(y + " 年 " + m + " 月 " + d + " 日是当年的第" + (d+totals) + " 天");
	}
	public int input(){
		int value;
		Scanner scanner = new Scanner(System.in);
		value = scanner.nextInt();
		return value;
	}
	public int getDaysPerMonth(int month){
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			
			if(isLeapYear(year)){
				days = 29;
			}else {
				days = 28;
			}
		default:
			days = 0;
			break;
		}
		return days;
	}
	//判断是否闰年
	public boolean isLeapYear(int year){
		boolean isLeap;
		if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
			isLeap = true;
		}else {
			isLeap = false;
		}
		return isLeap;
	}
	//判断月份是否包含31天
	public boolean isThirtyO(int month){
		boolean isThirtyO;
		Set<Integer> set = new HashSet<>();
		set.add(Integer.valueOf(1));
		set.add(Integer.valueOf(3));
		set.add(Integer.valueOf(5));
		set.add(Integer.valueOf(7));
		set.add(Integer.valueOf(8));
		set.add(Integer.valueOf(10));
		set.add(Integer.valueOf(12));
		if(set.contains(Integer.valueOf(month))){
			isThirtyO = true;
		}else {
			isThirtyO = false;
		}
		return isThirtyO;
	}
	//判断月份是否包含30天
		public boolean isThirty(int month){
			boolean isThirty;
			Set<Integer> set = new HashSet<>();
			set.add(Integer.valueOf(4));
			set.add(Integer.valueOf(6));
			set.add(Integer.valueOf(9));
			set.add(Integer.valueOf(11));
			
			if(set.contains(Integer.valueOf(month))){
				isThirty = true;
			}else {
				isThirty = false;
			}
			return isThirty;
		}
	public void errMessage(){
		
		System.out.println("输入数据有误，请重新输入！");
		
	}
}
