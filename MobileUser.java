package com.company;

public class MobileUser {
    public static abstract class Mobile{
        abstract void sentMsg();

    }
    public static class Rahim extends Mobile{
        void sentMsg() {
            System.out.println("Hi, I'm Rahim");

        }
    }
    public static class Karim extends Mobile{
        void sentMsg() {
            System.out.println("Hi, I'm Karim");

        }
    }


    public static void main(String[] args) {
        Mobile m;

        m = new Rahim();
        m.sentMsg();
        m = new Karim();
        m.sentMsg();


    }
}
