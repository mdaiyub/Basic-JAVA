package com.company;

public class polymorphism {
    public static class Person{

        void display(){
            System.out.println("I'm a Person");
        }

    }
    public static class Teacher extends Person{
        // display
        void display(){
            System.out.println("I'm a Teacher");
        }

    }
    public static class Student extends Person{
        // display
        void display(){
            System.out.println("I'm a Student");
        }

    }

    public static void main(String[] args) {

        Person p = new Person();
        p.display();
        p = new Teacher();
        p.display();
        p = new Student();
        p.display();

    }
}
