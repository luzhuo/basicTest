package com.lz.Demo1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		char[] tmp = number.toString().toCharArray();
		StringBuffer strb = new StringBuffer();
		for (int i = tmp.length-1; i >=0; i--) {
			Character c = tmp[i];
				strb.append(c);
		}
		

		Integer numberNew = Integer.valueOf(strb.toString());
		System.out.println(number+numberNew);
		
	}

}
