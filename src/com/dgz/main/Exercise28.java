/**
 * 
 */
package com.dgz.main;

/**题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * @author DamonTung
 * @date 2016年3月7日
 * @description 
 */
public class Exercise28 {
	InputUtils inputUtils = new InputUtils();
	
	int a[] = new int[]{13,24,26,34,38};
	int b[] = new int[a.length + 1];
	int n;//待排序数字
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise28 exercise28 = new Exercise28();
		exercise28.method();

	}
	public void method(){
		System.out.println("请输入待排序数字：");
		n = inputUtils.getInputInt();
		if(a[a.length-1] <= n){
			b = a.clone();
			b[b.length - 1] = n;
		}else {
			
			for(int i = 0; i < a.length; i++){
				if(n <= a[i]){
					b[i] = n;
					break;
				}else {
					b[i] = a[i];
				}
				for(int j = i+1; j < b.length; j++){
					b[j] = a[j-1];
				}
			}
		}
		System.out.println("原始数组：");
		for(int i:a){
			System.out.print(i + "-->");
		}
		System.out.println("\n插入新元素之后：");
		for(int i:b){
			System.out.print(i + "-->");
		}
	}

}
