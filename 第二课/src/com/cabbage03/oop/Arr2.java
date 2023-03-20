package com.cabbage03.oop;
//已知数组元素为{11,22,33,44,55}请将数组中偶数元素取出并求和，最后打印求和结果
public class Arr2{
    public static void main(String[] args){
        int[] arr={11,22,33,44,55};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % 2 == 0) {
                sum+=arr [i];
            }
        }System.out.println("偶数和为："+sum);
        }
    }



