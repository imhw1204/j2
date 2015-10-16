package com.j2.figurefm;

public abstract class Figure {
 String name;
 String dimension;
 String shadow;
 String color;
 
 void prepare() {
  System.out.println("Drawing " + name);
  System.out.println("Checking dimension...");
  System.out.println("Checking shadow...");
  System.out.println("Checking color... ");
 }
 
 public String getName() {
  return name;
 }

 public String toString() {
  StringBuffer display = new StringBuffer();
  display.append("---- " + name + " ----\n");
  display.append(dimension + "\n");
  display.append(shadow + "\n");
  display.append(color + "\n");
  return display.toString();
 }
}

 
 
