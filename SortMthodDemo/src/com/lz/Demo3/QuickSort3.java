package com.lz.Demo3;

public class QuickSort3 {
	public static void main(String[] args) {
		int[] num = {888,555,666,888,999,777,333,222,444,111};
		int prev = 0;
		int end = num.length-1;
		quickSortTest(prev,end,num);
		System.out.print("������� ��");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"  ");
		}
	}
	public static void quickSortTest(int start,int end,int[] list){
        int left = start,right=end;//���忪ʼ  �ͽ�β
        int key = list[start];
        // SortUtil<T> sUtil = new SortUtil<T>();
        //��i��j������������������������ֵ  ����Ϊi++����С��key  j--�������key
        while(true){
            while(list[right]>key)  right--;
            while(list[left]<key&&left<right) left++;
            if(left>=right) break;
            int tmp = list[left];
            list[left] = list[right];
            list[right] = tmp;
            System.out.print("����:"+left+"��"+right);
            for (int k = 0; k < list.length; k++) {
    			System.out.print(list[k]+"  ");
    		}
            System.out.println();
            if(list[left]==key) right--;
            else left++;
        }
        int tmp = list[start];
        list[start] = list[right];
        list[right] = tmp;
        System.out.print("����:"+left+"��"+right);
        for (int k = 0; k < list.length; k++) {
			System.out.print(list[k]+"  ");
		}
        System.out.println();
        if(start<left-1){
        	quickSortTest(start,left-1,list);
        }
        if(right+1<end){
        	quickSortTest(right+1,end,list);
        }
    }
}
