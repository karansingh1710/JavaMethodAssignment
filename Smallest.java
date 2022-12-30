package com.AssignmentMethod;
import java.util.*;

public class Smallest {

    static int SmallNumber(int num1, int num2, int num3){
        return (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(SmallNumber(a,b,c));
    }
}