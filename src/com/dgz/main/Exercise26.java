/**
 * 
 */
package com.dgz.main;

/**题目：对10个数进行排序
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise26 {
	InputUtils inputUtils = new InputUtils();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise26 exercise26 = new Exercise26();
		exercise26.method();
	}
	public void method(){
		int n;//数字个数
		//int[] a;
		System.out.println("请输入需要排序的数字个数：");
		n = inputUtils.getInputInt();
		int[] a = new int[n];
		System.out.println("请分别输入排序数字。。。");
		for(int i = 0; i < n; i++){
			a[i] = inputUtils.getInputInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(a[i] > a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("排序结果为：" );
		for(int i = 0; i < n; i++){
			System.out.print(i + ":"+ a[i] + "-->" );
		}
	}

}
