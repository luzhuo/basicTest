package com.lz.Demo1;

import java.util.Scanner;

/**
 * �ٶ�һ�ֱ���ı��뷶Χ��a ~ y��25����ĸ����1λ��4λ�ı��룬������ǰѸñ��밴�ֵ��������γ�һ���������£�
 *  a, aa, aaa, aaaa, aaab, aaac, �� ��, b, ba, baa, baaa, baab, baac �� ��, yyyw, yyyx, yyyy 
 *  ����a��IndexΪ0��aa��IndexΪ1��aaa��IndexΪ2���Դ����ơ� ��дһ������������������һ�����룬�����������Ӧ��Index. 
 *  ��������:
		����һ����������ַ���,�ַ�������С�ڵ���100.
		�������:
		�����������index
		��������1:
		baca
		�������1:
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
			//ÿ��25*26*25+25  ����һ�ε��ַ�
			int count = strArray[0]-'a';
			return (25*26*25+25+1)*count;
		}
		if(strArray.length==2){
			//ÿ��(26*25)����һ��˫�ַ�
			int count1 = strArray[0]-'a';
			int count2 = strArray[1]-'a';
			return ((25*26*25+25+1)*count1)+((26*25+1)*count2)+1;
		}
		if(strArray.length==3){
			//ÿ��25�γ���һ��3�ַ�
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





























