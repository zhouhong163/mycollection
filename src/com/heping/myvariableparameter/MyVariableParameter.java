package com.heping.myvariableparameter;
//可变变量 指的是形参个数的可变
public class MyVariableParameter {
    public static void main(String[] args) {
        int sum1 = getSum(1,2,3,4,10);
        System.out.println(sum1);
    }
    public static int getSum(int...a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];

        }
        return sum;
    }
}
