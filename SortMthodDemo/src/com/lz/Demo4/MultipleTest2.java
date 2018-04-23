package com.lz.Demo4;

public class MultipleTest2 {
	public static void main(String[] args) {
		int num =999999999;
		long time11 = System.currentTimeMillis();
		mothod1(num);
		long time22 = System.currentTimeMillis();
		mothod2(num);
		long time33 = System.currentTimeMillis();
		mothod3(num);
		long time44 = System.currentTimeMillis();
		System.out.println("方法1 时间:"+(time22-time11));
		System.out.println("方法2 时间:"+(time33-time22));
		System.out.println("方法3 时间:"+(time44-time33));
		
	}
	public static int mothod1(int n){
		return n*10;
	}
	public static int mothod2(int n){
		int num = 0;
		for(int i= 1;i<=10;i++){
			num+=n;
		}
		return num;
	}
	public static int mothod3(int n){
		return n>>3+n>>1;
	}
}
