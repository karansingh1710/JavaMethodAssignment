package com.AssignmentMethod;
import java.util.*;

public class MiddleChar {
    static String MiddleChar(String st){
        int n=st.length();
        String ans;
        if (n%2==0){
            int Index = n / 2;
            return st.substring(Index-1,Index+1);
        }
        else {
            int Index=n/2;
            return String.valueOf(st.charAt(Index));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.println("Enter the string");
        st=sc.next();
        System.out.println(MiddleChar(st));
    }
}
