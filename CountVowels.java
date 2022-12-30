package com.AssignmentMethod;
import java.util.*;

public class CountVowels {

    static int Count(String st){
        int n=st.length();
        int count=0;
        for (int i=0; i<n; i++){
            if (st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'){
                count++;
            }
        }
      return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.println("Enter a string in lowercase");
        st=sc.next();
        System.out.println(Count(st));
    }
}
