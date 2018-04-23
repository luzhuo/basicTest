package com.lz.Demo1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charStr = str.toCharArray();
		double[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int countIndex = 1;
		for (int i = 0; i < charStr.length; i++) {
			if((i+1)<charStr.length&&charStr[i]!=charStr[i+1]){
				countIndex++;
			}
			count[countIndex] ++;
		}
		double aum = 0;
		for (int i = 0; i < count.length; i++) {
			aum += count[i];
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		 df.setRoundingMode(RoundingMode.HALF_UP);
		 String s = df.format(aum/countIndex);
		System.out.println(s);
	}

}
