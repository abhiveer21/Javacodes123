/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author abhiv
 */
public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed(){
        return speed;
    }
    public boolean isOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}

class Test{
    public static void main(String[] args){
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
