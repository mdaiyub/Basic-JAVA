package com.company;

public class Enheritance {
    public static class Student {
        String name;
        int age;

        void display1(){
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("\n");

        }
    }
    public static class Teacher extends Student{
        //String name;
        //int age;
        String qualification;

        void display2(){
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("Qualification: "+ qualification);
            System.out.println("\n");

        }

        public static void main(String[] args) {

            Teacher t1 = new Teacher();
            t1.name= "Zabirul Islam";
            t1.age = 26;
            t1.qualification = "BSc in CSE";
            t1.display2();

            Student s1 = new Student();
            t1.name= "Aiyub Ali";
            t1.age = 20;
            t1.display1();
        }


    }


}