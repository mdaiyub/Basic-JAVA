package com.company;
import java.util.Arrays;

public class Encapsule {
    public static class Person {
        private String name;
        private int age;

        public void setName(String name, int age){
            this.name = name;
            this.age  = age;

        }

        public String getName(){
            return name;

        }
        public int getAge(){
            return age;

        }

    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Aiyub Ali", 21);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
