package com.lz.Demo1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int count = getCount(line);
		System.out.println(count);
	}

	private static int getCount(String line) {
		int num = getChar(line);
		if(num==2){
			return 2;
		}
		if(num==1){
			return 1;
		}
		return 0;
	}
	private static int getChar(String line){
		int num = 0;
		char[] charArray = line.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if(-1==sb.indexOf(charArray[i]+"")){
				sb.append(charArray[i]);
				num++;
			}
			
		}
		return num;
	}
}
