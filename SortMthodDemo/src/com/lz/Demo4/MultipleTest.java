package com.lz.Demo4;

public class MultipleTest {
	public static void main(String[] args) {
		int num =200000;
		long time11 = System.currentTimeMillis();
		mothod1(num);
		long time22 = System.currentTimeMillis();
		mothod2(num);
		long time33 = System.currentTimeMillis();
		mothod3(num);
		long time44 = System.currentTimeMillis();
		System.out.println("����1 ʱ��:"+(time22-time11));
		System.out.println("����2 ʱ��:"+(time33-time22));
		System.out.println("����3 ʱ��:"+(time44-time33));
		
	}
	public static int mothod1(int n){
		int sum = 0;
		for(int i =1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
	public static int mothod2(int n){
		int sum = 0;
		for(int i =1;i<=n;i++){
			for(int j =1;j<=i;j++){
				sum+=1;
			}
		}
		return sum;
	}
	public static int mothod3(int n){
		return n*(n+1)/2;
	}
}
