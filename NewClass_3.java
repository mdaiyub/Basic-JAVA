package com.company;

class shape{
    protected int location;
    public shape(int location){
        this.location = location;
    }
    public void display(){
        System.out.println("Location:" + location);
    }

}

class rectangle extends shape{
    private int Height;
    private int Width;
    public rectangle(int location, int Height, int Width){
        super(location);
        this.Height = Height;
        this.Width = Width;
    }
    public void display(){
        super.display();
        System.out.println(Width+""+Height);
    }
}

public class NewClass_3 {
    public static void main(String[] args) {
        rectangle r = new rectangle(5,15,25);
        r.display();
    }
}
