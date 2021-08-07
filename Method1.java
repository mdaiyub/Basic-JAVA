package com.company;

public class Method1 {
    public static class Student{
        String name, gender, id;
        int phone;

        void setInformation(String n, String g, String i, int p){
            name = n;
            gender = g;
            id = i;
            phone = p;

        }

        void display(){
            System.out.println("Name: "+ name);
            System.out.println("ID: "+ id);
            System.out.println("Gender: "+ gender);
            System.out.println("Phone: "+ phone);
            System.out.println("\n");

        }
    }

        public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInformation("Aiyub Ali","193-15-13456","Male",1725688000);
        student1.display();

        Student student2 = new Student();
        student2.setInformation("Sourov Mia","193-15-13465","Male",1745789065);
        student2.display();


        }

}






