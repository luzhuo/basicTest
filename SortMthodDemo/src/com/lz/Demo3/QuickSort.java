package com.lz.Demo3;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Integer [] list = {9,8,7,6,5,4,3,2,1,0};
        long startTime = System.currentTimeMillis();
        //sortMethodOne(list,0,list.length-1);
        sortMethodSecond(list,0,list.length-1);
        //sortMethodThird(list,0,list.length-1);
        long endTime = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
        System.out.println();
        System.out.print(endTime - startTime);
    }


    public static void sortMethodOne(int[] arr,int low,int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while(l<h){
           while(l<h&&arr[h]>=povit)   h--;
        if(l<h){
           int temp=arr[h];
           arr[h]=arr[l];
           arr[l]=temp;
           l++;
        }

        while(l<h&&arr[l]<=povit)  l++;

           if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
           }
        }
        if(l>low) sortMethodOne(arr,low,l-1);
        if(h<high) sortMethodOne(arr,l+1,high);
    }
    public static <T extends Comparable <? super T>>T[] sortMethodSecond(T[] list,int start,int end){
        int i = start+1,j=end;//���忪ʼ  �ͽ�β
        T key = list[start];
        // SortUtil<T> sUtil = new SortUtil<T>();
        //��i��j������������������������ֵ  ����Ϊi++����С��key  j--�������key
        while(true){
            while(list[j].compareTo(key)>0)  j--;
            while(list[i].compareTo(key)<0&&i<j) i++;
            if(i>=j) break;
            T tmp = list[i];
            list[i] = list[j];
            list[j] = tmp;
            System.out.println("����:"+i+"��"+j);
            if(list[i]==key) j--;
            else i++;
        }
        T tmp = list[start];
        list[start] = list[j];
        list[j] = tmp;
        System.out.println("����:"+i+"��"+j);
        if(start<i-1){
            sortMethodSecond(list,start,i-1);
        }
        if(j+1<end){
            sortMethodSecond(list,j+1,end);
        }
        return list;
    }
//  public static <T extends Comparable<? super T>> void sortMethodThird(T[] list,int start,int end){
//    	// Integer [] list = {9,8,7,6,5,4,3,2,1,0};
//    	/*
//    	 * start0 end9 
//    	 *  i0 j9 key9
//    	 *  
//    	 * 
//    	 */
//        int i = start,j = end;
//        T key = list[start];
//        while(i<j){
//            //��j--������� ֪�����ֱ�keyС��ֵΪֹ
//            while(i<j&&list[j].compareTo(key)>=0)  {j--;}
//            if(i<j){
//                //list[i]�Ѿ�������key  �������ֵ����
//                list[i] = list[j];
//                i++;
//            }
//            //��i++�������Ŀ������  ֪���ҵ���key���ֵΪֹ
//            while(i<j&&list[i].compareTo(key)<=0){
//                //�˴�ʹ��С�ڵ��ڼ���������10000��1.0������� ��key����1�Ļ�  ��ô���С�ڵ��ڵ����þͻ��������if�����ִ��10000��
//                i++;
//            }
//            if(i<j){
//                //list[j]��ֵ�Ѿ�����list[i]�� �˴��ɽ�ǰ���ֵ����
//                list[j] = list[i];
//                j--;
//            }
//            //��ʱi==j
//            list[i] = key;
//            sortMethodThird(list,start,i-1);
//            sortMethodThird(list,j+1,end);
//        }
//    }
}