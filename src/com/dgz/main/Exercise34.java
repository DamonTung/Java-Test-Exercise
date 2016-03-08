/**
 * 
 */
package com.dgz.main;

/**题目：有n个人围成一圈，顺序排号。
 * 从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。 
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise34 {
	InputUtils inputUtils = new InputUtils();
	int n;//所有人数
	int array[];
	public  Exercise34() {
		// TODO Auto-generated constructor stub
		System.out.println("请输入所有人数：");
		n = inputUtils.getInputInt();
		array = new int[n];
		for(int i=0; i < n; i++){
			array[i] = 1;
		}
	}
	
	public void method(){
		int leftNumber = n;
		int countNum = 0;
		int index = 0;
		while(leftNumber > 1){
			if(array[index] == 1){
				countNum++;
				if(countNum == 3){
					countNum = 0;
					array[index] = 0;
					leftNumber--;
				}
			}
			index++;
			if(index == n){
				index = 0;
			}
		}
		for(int i = 0; i < n; i++){
			if(array[i] == 1){
				System.out.println("最后留下的是原来第" + (i+1) +"位的人。");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise34 exercise34 = new Exercise34();
		exercise34.method();
		
		/*System.out.println("请输入字符串。。");
		String string = exercise34.inputUtils.getInputString();
		System.out.println(string + "长度为：" + string.length());*/
	}

}
