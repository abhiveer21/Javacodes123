/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author abhiv
 */
//Ques 1
//declaring parent class shapes
public class Shapes{
}

//inhertiance circle class
class Circle extends Shapes{
    private double radius; //declaring variable radius

    //parametrized constructor for circle
    public Circle(double radius){
        this.radius = radius;
    }
    //getter for radius
    public double getRadius(){
        return radius;
    }

    //setter for radius
    public void setRadius(double radius){
        this.radius = radius;
    }

    //method to get the area of circle
    public double getArea(){
        return this.radius*this.radius*3.14; //area
    }
}

//inheritance class rectangle
class Rectangle extends Shapes{
    private double breadth; //data field declararions
    private double length;

    //parametrized constructor
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //getter and setter for lenght
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    //getter and setter for breadth
    public double getBreadth(){
        return breadth;
    }
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }

    //method to get area
    public double getArea(){
        return this.length*this.breadth;
    }
}

//inheritance class triangle
class Triangle extends Shapes{
    private double side1;
    private double side2;
    private double side3;

    //parametriused constructor
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //getters of all sides
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    //setters for all sides
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    //method to get area of triangle
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double areaSq = s*(s-side1)*(s-side2)*(s-side3);//herons formula
        return Math.sqrt(areaSq);
    }
}

class DemoTest{
    public static void main (String[] args){
        Shapes circle1 = new Circle(4);
        Shapes rectangle1 = new Rectangle(2,3);
        Shapes triangle1 = new Triangle(3,4,5);

        System.out.println("Area of circle: " + ((Circle) circle1).getArea());
        System.out.println("Area of rectangle: " + ((Rectangle) rectangle1).getArea());
        System.out.println("Area of triangle: " + ((Triangle) triangle1).getArea());
    }
}

//answer to question: Comment on the runtime behavior of the variables of type “shape”
//it exhibits runtime polymorphism, or dynamic method dispatch.
//based on the subclass type of the object of type shape, the program decides which version of getArea() to call.