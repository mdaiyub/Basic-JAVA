package com.company;

public class ArrayHandle {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[10]=50;
            System.out.println(a[10]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);}

        System.out.println("Rest of the code here");
    }
}
