package com.cabbage03.oop;
//已知数组元素为{5，44，33，55，22}，请找出数组中最大值并打印在控制台
public class Arr3 {
    public static void main(String[] args){
        int[] arr={5,44,33,55,22};
        int max=arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]>max){
                max=arr [i];
            }
        }System.out.println("最大值为： "+max);
    }

}
