package com.humber.labs;
//Name: Elena Pashkova, N01587121;
//Lab10

//Triangle class extends GeometricObject
public class Triangle extends GeometricObject {
 private double side1;
 private double side2;
 private double side3;

 // Default constructor with default sides
 public Triangle() {
     side1 = side2 = side3 = 1.0;
 }

 // Constructor with specified sides
 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 // Getters for sides
 public double getSide1() {
     return side1;
 }

 public double getSide2() {
     return side2;
 }

 public double getSide3() {
     return side3;
 }

 // Calculate and return the area of the triangle
 public double getArea() {
	    double s = (side1 + side2 + side3) / 2;
	    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}


 // Calculate and return the perimeter of the triangle
 public double getPerimeter() {
     return side1 + side2 + side3;
 }

 // Override toString to display sides, color, and filled status
 @Override
 public String toString() {
     return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", " + super.toString();
 }
}
