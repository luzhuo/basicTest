package com.lz.Demo4;

public class OperandLength {
	public static void main(String[] args) {
		int num = 500;
		long sum1 = method1(num,num);
		long sum2 = method2(num,num);
		System.out.println(sum1);
		System.out.println(sum2);
	}

	private static long method1(int num,int num2) {
		long produce = 0;
		for(;num>0;num--){
			long digit = num - (num/10)*10;
			for(;digit>0;digit--){
				produce = produce + num2;
			}
			num = num/10;
			num2 = 10*num2;
		}
		return produce;
	}
	private static long method2(int num,int num2) {
		long produce = 0;
		for(;num>0;num--){
			produce+=num2;
		}
		return produce;
	}
}
