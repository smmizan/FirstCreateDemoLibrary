package com.smmizan.mizlibrary;

public class MizMath {

    public static int Plus(int a,int b){
        return a+b;
    }

    public static int Minus(int a,int b){
        return a-b;
    }

    public static int Multiply(int a,int b){
        return a*b;
    }

    public static int Divide(int a,int b){
        if ( b == 0){
            throw new IllegalArgumentException("Divide by Zero Error");
        }else {
            return a/b;
        }
    }




}
