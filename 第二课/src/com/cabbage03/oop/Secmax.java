package com.cabbage03.oop;

public class Secmax {
    public static void main(String[] args){
        int[] arr={35,34,99,87,2 };
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]> arr[max1]) {
                max1 = i;
            } if (arr[i]>arr[max2]&& arr[i]< arr[max1]) {
               max2=i;
            }

        }
        System.out.println("第二大的值为： "+arr[max2]);
    }
}
