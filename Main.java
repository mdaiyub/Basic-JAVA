package com.company;

public class Main {
    public static class Student{
        String name, gender, id;
        int phone;
    }

    public static void main(String[] args) {
	Student student1 = new Student();
	student1.name = "Aiyub Ali";
	student1.id = "193-15-13456";
	student1.gender = "Male";
	student1.phone = 1725688000;
	System.out.println("Name: "+ student1.name);
	System.out.println("ID: "+ student1.id);
	System.out.println("Gender: "+ student1.gender);
	System.out.println("Phone: "+ student1.phone);

	Student student2 = new Student();
	student2.name = "Istiak Ridoy";
	student2.id = "193-15-13567";
	student2.gender = "Male";
	student2.phone = 1725683456;
	System.out.println("Name: "+ student2.name);
	System.out.println("ID: "+ student2.id);
	System.out.println("Gender: "+ student2.gender);
	System.out.println("Phone: "+ student2.phone);

    }
}
