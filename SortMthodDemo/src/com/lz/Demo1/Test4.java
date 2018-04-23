package com.lz.Demo1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j <arr.length;j++){
				if(arr[i]>arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] =tmp;
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[1]-arr[0]!=arr[i]-arr[i-1]){
				System.out.println("Impossible");
				break;
			}
			if(i==arr.length-1){
				System.out.println("Possible");
			}
		}
	}

}
