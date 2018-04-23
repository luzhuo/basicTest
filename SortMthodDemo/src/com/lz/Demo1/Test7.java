package com.lz.Demo1;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws Exception {
		//测试
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = getPrimeNumberSum(num);
		System.out.println(count);
	}
	//判断是否是质数
	public static boolean  isPrimeNumber(int num){
		if(num==2) return true;  //2,3单独处理
		if(num%2==0||num<=0) return false;   //排除小于0的数和偶数
		for(int i = 3;i<=Math.sqrt(num);i+=2){   //对num开根号内所有奇数取余
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	//获取有多少对质数
	public static int getPrimeNumberSum(int num) throws Exception{
		if(num<0||num>1000){
			throw new Exception("请输入（1-1000）内的整数");
		}
		
		int count =0;
		//如果输入的数为   2+一个质数 时  count++;
		if(num==3) return 0;
		if(isPrimeNumber(num-2)) count++;
		//遍历从3到这个数的一半的奇数  如果都为偶数 那么count++
		for(int i = 3;i<=num/2;i+=2){
			if(isPrimeNumber(i)&&isPrimeNumber(num-i))  {
				System.out.println(i+"and"+(num-i));
				count++;
			}
		}
		return count;
	}
}
