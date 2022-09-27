package com.recursive;
import java.util.*;

public class LastSurvivor {
    static int survive(int n,int k){
        if (n==1)return 1;
        return (survive(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int k=2;
        System.out.println(survive(n,k));
    }
}
