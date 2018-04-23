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
        int i = start+1,j=end;//定义开始  和结尾
        T key = list[start];
        // SortUtil<T> sUtil = new SortUtil<T>();
        //从i和j俩个方向搜索不满足条件的值  条件为i++方向小于key  j--方向大于key
        while(true){
            while(list[j].compareTo(key)>0)  j--;
            while(list[i].compareTo(key)<0&&i<j) i++;
            if(i>=j) break;
            T tmp = list[i];
            list[i] = list[j];
            list[j] = tmp;
            System.out.println("交换:"+i+"和"+j);
            if(list[i]==key) j--;
            else i++;
        }
        T tmp = list[start];
        list[start] = list[j];
        list[j] = tmp;
        System.out.println("交换:"+i+"和"+j);
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
//            //按j--方向遍历 知道发现比key小得值为止
//            while(i<j&&list[j].compareTo(key)>=0)  {j--;}
//            if(i<j){
//                //list[i]已经保存在key  将后面的值传入
//                list[i] = list[j];
//                i++;
//            }
//            //按i++方向遍历目标数组  知道找到比key大的值为止
//            while(i<j&&list[i].compareTo(key)<=0){
//                //此处使用小于等于假设数组内10000个1.0交替出现 而key又是1的话  那么这个小于等于的作用就会是下面的if语句少执行10000次
//                i++;
//            }
//            if(i<j){
//                //list[j]的值已经传入list[i]中 此处可将前面的值传入
//                list[j] = list[i];
//                j--;
//            }
//            //此时i==j
//            list[i] = key;
//            sortMethodThird(list,start,i-1);
//            sortMethodThird(list,j+1,end);
//        }
//    }
}