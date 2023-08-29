package com.humber.labs;

//Name: Elena Pashkova, N01587121;
//Lab10

//GeometricObject class defines properties common to geometric objects
public class GeometricObject {
 private String color;
 private boolean filled;

 // Default constructor with default color and filled status
 public GeometricObject() {
     color = "white";
     filled = false;
 }

 // Constructor with specified color and filled status
 public GeometricObject(String color, boolean filled) {
     this.color = color;
     this.filled = filled;
 }

 // Getter and setter for colorl
 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 // Getter and setter for filled status
 public boolean isFilled() {
     return filled;
 }

 public void setFilled(boolean filled) {
     this.filled = filled;
 }

 // Override toString to display color and filled status
 @Override
 public String toString() {
     return "color: " + color + ", filled: " + filled;
 }
}

