package com.lz.Demo1;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(binarySearchingApproach(num));
	}
	public static String binarySearchingApproach(int num){
		
		int left = 90;
		int right = -90;
		StringBuffer sb = new StringBuffer();
		int i =6;
		while(i>0){
			if(num<=90&&num>=(right+left)/2){
				sb.append("1");
				right = (left+right)/2;
				i--;
			}
			if(num>=-90&&num<(right+left)/2){
				sb.append("0");
				left = (left+right)/2;
				i--;
			}
		}
		return sb.toString();
	}
}
