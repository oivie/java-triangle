package com.humber.labs;
//Name: Elena Pashkova, N01587121;
//Lab10
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle, in the following format - 1.0 1.0 1.0: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.print("Enter a color: ");
        String color = scanner.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        // Create a Triangle object and set its properties
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle information
        System.out.println("Triangle Information:");
        System.out.printf("Area: %.2f%n", triangle.getArea());
        System.out.printf("Perimeter: %.2f%n", triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

        scanner.close();
    }
}
