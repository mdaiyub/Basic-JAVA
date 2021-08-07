package com.company;

public class Constrac{
    public static class Man{
        String name, gender, id;
        int phone;

        Man(String n, String g, String i, int p){
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

            Man student1 = new Man("Aiyub Ali","Male","193-15-13465",1725688000 );
            student1.display();

            Man student2 = new Man("Sourov Mia","Male", "193-15-13465",1745789065 );
            student2.display();
        }

   }

