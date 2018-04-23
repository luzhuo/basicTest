package com.lz.Demo3;

public class QuickSort2 {
	public static void main(String[] args) {
		int[] num = {888,555,666,888,999,777,333,222,444,111};
		int prev = 0;
		int end = num.length-1;
		quickSortTest(prev,end,num);
		System.out.print("交换完成 ：");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"  ");
		}
	}
	public static void quickSortTest(int prev,int end, int[] num) {
		int left = prev;
		int right = end;
		int start = num[left];
		while(right>left){
			while(right>left&&num[right]>=start) right--;
			if(left<right){
				int tmp = num[left];
				num[left] = num[right];
				num[right]= tmp;
				System.out.println("交换："+left+"和"+right+":");
				left++;
				
				
			}
			while(right>left&&num[right]>=num[left]) left++;
			if(left<right){
				int tmp = num[left];
				num[left] = num[right];
				num[right]= tmp;
				System.out.println("交换："+left+"和"+right+":");
				right--;
				
			}
		}
		if(left>prev){
			quickSortTest(prev,right-1,num);
		}
		if(right<end) {
			quickSortTest(right+1,end,num);
		}
		
	}
	
}
