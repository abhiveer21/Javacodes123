/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author abhiv
 */

// question 2

public class Triangles {
    private double side1;
    private double side2;
    private double side3;

    public Triangles() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangles(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double areaSq = s*(s-side1)*(s-side2)*(s-side3);//herons formula
        return Math.sqrt(areaSq);
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}

class Demo {
    public static void main (String[] args){
        Triangles triangle1 = new Triangles(4, 5, 6);
        Triangles triangle2 = new Triangles(1.5, 2.5, 3.5);

        System.out.println("Triangle 1: ");
        System.out.println("Side 1 >> " + triangle1.getSide1());
        System.out.println("Side 2 >> " + triangle1.getSide2());
        System.out.println("Side 3 >> " + triangle1.getSide3());
        System.out.println("Area of Triangle 1: " + triangle1.getArea());
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());

        System.out.println("Triangle 2: ");
        System.out.println("Side 1 >> " + triangle2.getSide1());
        System.out.println("Side 2 >> " + triangle2.getSide2());
        System.out.println("Side 3 >> " + triangle2.getSide3());
        System.out.println("Area of Triangle 2: " + triangle2.getArea());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());
    }
}

