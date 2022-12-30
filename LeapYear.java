package com.AssignmentMethod;

import java.util.Scanner;

public class LeapYear {
    static boolean Leap(int year){
        if (year%4==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int y=sc.nextInt();
        System.out.println(Leap(y));
    }
}
