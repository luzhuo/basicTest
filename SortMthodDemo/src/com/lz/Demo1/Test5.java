package com.lz.Demo1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[32];
		while(true){
			System.out.println("������ؿ���");
			int num1 = sc.nextInt();
			System.out.println("��������һ��");
			int num2 = sc.nextInt();
			int result = setCount(num1,num2,count);
			System.out.println(result);
			System.out.println("�Ƿ����");
			int isQuit = sc.nextInt();
			if(isQuit==2525){
				break;
			}
				
		}
		sc.close();
		System.out.println("����ָ���˳��ɹ�");
	}

	private static int setCount(int num1, int num2, int[] count) {
		if(num1>1024||num1<1||num2>1024||num2<1){
			return -1;
		}
		//�������  �������±꣩
		int groupId = (num1-1)/32;
		//���λ�� ���ڼ�λ�����ƣ�
		int index = num1%32;
		//��λ���� �൱��1����index����λ
		int value = 1<<index;
		
		//ʵ�ֹؿ����
		if((value&count[groupId])==0){
			count[groupId]+=value;
		}
		groupId = (num2-1)/32;
		//���λ�� ���ڼ�λ�����ƣ�
		index = num2%32;
		value = 1<<index;
		//���ؿ��Ƿ����
		if((value&count[groupId])==0){
			return 0;
		}
		return 1;
	}
}
