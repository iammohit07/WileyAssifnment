package com.recursive;

public class Staircase {
    public static int noOfWays(int n) {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        return noOfWays(n-1)+noOfWays(n-2)+noOfWays(n-3);
    }

    public static void main(String[] args) {
        System.out.println(Staircase.noOfWays(3));
    }
}
