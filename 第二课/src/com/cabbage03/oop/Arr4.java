package com.cabbage03.oop;

public class Arr4 {
    public static void main(String[] args){
   int[] arr={2,5,4,8,7,9};
   for(int i=0;i< arr.length-1;i++){
       for(int j=0;j< arr.length-1-i;j++){
           if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
           }
       }
   } System.out.print("排序后的数组为: ");
        for(int num:arr) {
            System.out.print( num+" " );

        }
    }
}
