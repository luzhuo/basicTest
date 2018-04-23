package com.lz.Demo1;

import java.util.Scanner;

/**
 * 假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，如果我们把该编码按字典序排序，形成一个数组如下：
 *  a, aa, aaa, aaaa, aaab, aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, yyyy 
 *  其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。 编写一个函数，输入是任意一个编码，输出这个编码对应的Index. 
 *  输入描述:
		输入一个待编码的字符串,字符串长度小于等于100.
		输出描述:
		输出这个编码的index
		输入例子1:
		baca
		输出例子1:
		16331
 */
public class Test9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] strArray = str.toCharArray();
		int index = toFindIndex(strArray);
		System.out.println(index);
		sc.close();
	}
	public static int toFindIndex(char[] strArray) {
		if(strArray.length==1){
			//每隔25*26*25+25  出现一次单字符
			int count = strArray[0]-'a';
			return (25*26*25+25+1)*count;
		}
		if(strArray.length==2){
			//每隔(26*25)出现一次双字符
			int count1 = strArray[0]-'a';
			int count2 = strArray[1]-'a';
			return ((25*26*25+25+1)*count1)+((26*25+1)*count2)+1;
		}
		if(strArray.length==3){
			//每隔25次出现一次3字符
			int count1 = strArray[0]-'a';
			int count2 = strArray[1]-'a';
			int count3 = strArray[2]-'a';
			return ((25*26*25+25+1)*count1)+((26*25+1)*count2) + count3*26+2;
		}
		if(strArray.length==4){
			
			int count1 = strArray[0]-'a';
			int count2 = strArray[1]-'a';
			int count3 = strArray[2]-'a';
			int count4 = strArray[3]-'a';
			return ((25*26*25+26)*count1)+((26*25+1)*count2) + count3*26 + count4+3;
		}
		return 0;
	}
	
}





























