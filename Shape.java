/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author abhiv
 */
//question 3

public abstract class Shape {
    public abstract double getArea();
}

abstract class TwoDimensionalShape extends Shape {}

abstract class ThreeDimensionalShape extends Shape {
    public abstract double getVolume();
}

class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
}

class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return this.side*this.side;
    }
}

class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double areaSq = s*(s-side1)*(s-side2)*(s-side3);//herons formula
        return Math.sqrt(areaSq);
    }
}

class Sphere extends ThreeDimensionalShape{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 4*3.14*this.radius*this.radius;
    }

    @Override
    public double getVolume(){
        return (4.0/3.0)*3.14*Math.pow(radius, 3);
    }
}

class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return this.side*this.side*6;
    }

    @Override
    public double getVolume(){
        return Math.pow(this.side, 3);
    }
}

class Tetrahedron extends ThreeDimensionalShape {
    private double edge;

    public Tetrahedron(double edge){
        this.edge = edge;
    }

    @Override
    public double getArea(){
        return Math.sqrt(3)*this.edge*this.edge;
    }

    @Override
    public double getVolume(){
        return Math.pow(edge, 3) / (6*Math.sqrt(2));
    }
}

class Test{
    public static void main (String[] args){
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new Sphere(3.0);
        shapes[4] = new Cube(4.0);
        shapes[5] = new Tetrahedron(6.0);

        for (Shape shape:shapes){
            System.out.println("Shape: " + shape.getClass().getSimpleName());

            if(shape instanceof TwoDimensionalShape){
                System.out.println("Area: " + shape.getArea());
            }else if (shape instanceof ThreeDimensionalShape){
                System.out.println("Area: " + shape.getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
