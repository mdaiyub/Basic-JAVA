package com.company;

public class FormatHandle {
    public static void main(String args[]){
        try{
            String s="abc";
            int i=Integer.parseInt(s);

        }catch(NumberFormatException e){
            System.out.println(e);}

        System.out.println("Rest of the code here");
    }
}
