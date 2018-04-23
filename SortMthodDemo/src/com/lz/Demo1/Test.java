package com.lz.Demo1;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		getObj(num);
	}

	public static void getObj(int number) {
		StringBuffer tmp = new StringBuffer();
		while(true){
			if((number-2)%2==0){
				tmp.insert(0, "2");
				number = (number-2)/2;
			}
			else if((number-1)%2==0){
				tmp.insert(0, "1");
				number = (number-1)/2;
			}
			if(number==0){
				break;
			}
		}
		System.out.println(tmp.toString());
	}

}
