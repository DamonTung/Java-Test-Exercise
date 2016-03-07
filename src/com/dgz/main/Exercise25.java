/**
 * 
 */
package com.dgz.main;

/**题目：求100之内的素数
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise25 {
	boolean b;
	int count = 2;
	
	public void method(){
		System.out.println("100以内的素数包括：");
		System.out.print(2 +"--" + 3 + "--");
		for(int i = 3; i < 100; i+=2){
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					b = false;
					break;
				}else {
					b = true;
				}
			}
			if(b == true){
				System.out.print(i + "--");
				count++;
				if(count % 5 == 0){
					System.out.println();
				}
			}
			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise25 exercise25 = new Exercise25();
		exercise25.method();
		System.out.println("总个数：" + exercise25.count);
	}

}
