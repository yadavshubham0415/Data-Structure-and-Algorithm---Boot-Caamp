package com.first;

import java.util.Scanner;

public class Combinationofparanthesis {
    public static void main(String[] args) {
        // write your code here
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char[] str = new char[2 * n];
        cobp(str, n);


    }

    static void cobp(char str[], int n)
    {
        //Write code here
        int size = str.length;
        if(n ==1){
            System.out.println("{}");
        }else{
            for(int i =0;i<size;i++){
                System.out.print("{}");
            }
            System.out.print("\n");
            for(int i =0;i<size;i++){
                if(i < size/2){
                    System.out.print("{");
                }
                if(i >= size/2){
                    System.out.print("}");
                }
            }
        }
    }

}
