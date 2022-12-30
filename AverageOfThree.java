package com.AssignmentMethod;
import java.util.*;
public class AverageOfThree {

    static float CalculateAvg(int a, int b, int c)
    {
        return (float)((a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average of three given number is "+CalculateAvg(a,b,c));
    }
}
