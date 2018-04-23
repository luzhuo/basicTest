package com.lz.Demo1;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws Exception {
		//����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = getPrimeNumberSum(num);
		System.out.println(count);
	}
	//�ж��Ƿ�������
	public static boolean  isPrimeNumber(int num){
		if(num==2) return true;  //2,3��������
		if(num%2==0||num<=0) return false;   //�ų�С��0������ż��
		for(int i = 3;i<=Math.sqrt(num);i+=2){   //��num����������������ȡ��
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	//��ȡ�ж��ٶ�����
	public static int getPrimeNumberSum(int num) throws Exception{
		if(num<0||num>1000){
			throw new Exception("�����루1-1000���ڵ�����");
		}
		
		int count =0;
		//����������Ϊ   2+һ������ ʱ  count++;
		if(num==3) return 0;
		if(isPrimeNumber(num-2)) count++;
		//������3���������һ�������  �����Ϊż�� ��ôcount++
		for(int i = 3;i<=num/2;i+=2){
			if(isPrimeNumber(i)&&isPrimeNumber(num-i))  {
				System.out.println(i+"and"+(num-i));
				count++;
			}
		}
		return count;
	}
}
