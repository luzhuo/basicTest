package com.lz.Demo1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[32];
		while(true){
			System.out.println("请输入关卡数");
			int num1 = sc.nextInt();
			System.out.println("请输入下一关");
			int num2 = sc.nextInt();
			int result = setCount(num1,num2,count);
			System.out.println(result);
			System.out.println("是否继续");
			int isQuit = sc.nextInt();
			if(isQuit==2525){
				break;
			}
				
		}
		sc.close();
		System.out.println("隐藏指令退出成功");
	}

	private static int setCount(int num1, int num2, int[] count) {
		if(num1>1024||num1<1||num2>1024||num2<1){
			return -1;
		}
		//算出组数  （数组下标）
		int groupId = (num1-1)/32;
		//算出位数 （第几位二进制）
		int index = num1%32;
		//移位运算 相当于1左移index个单位
		int value = 1<<index;
		
		//实现关卡完成
		if((value&count[groupId])==0){
			count[groupId]+=value;
		}
		groupId = (num2-1)/32;
		//算出位数 （第几位二进制）
		index = num2%32;
		value = 1<<index;
		//检测关卡是否完成
		if((value&count[groupId])==0){
			return 0;
		}
		return 1;
	}
}
