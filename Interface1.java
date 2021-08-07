package com.company;

public class Interface1 {
    public interface Animal{
        void eit();
    }
    public static class Dog implements Animal{
        public void eit(){
            System.out.println("Dogs can eit animal");
        }

    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eit();


    }
}
