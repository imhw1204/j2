package com.j2.figurefm;

public class DrawingTest {
 
 public static void main(String[] args) {
  DrawingPerson father = new Father();
  DrawingPerson mother = new Mother();
  DrawingPerson me = new Me();
 
  Figure figure = father.order("circle");
  System.out.println("Father is drawing " + figure.getName() + "\n" + figure.toString());
 
  figure = father.order("rectangle");
  System.out.println("Father is drawing " + figure.getName() + "\n" + figure.toString());

  figure = father.order("triangle");
  System.out.println("Father is drawing " + figure.getName() + "\n" + figure.toString());
  
  figure = mother.order("circle");
  System.out.println("Mother is drawing " + figure.getName() + "\n" + figure.toString());
 
  figure = mother.order("rectangle");
  System.out.println("Mother is drawing " + figure.getName() + "\n" + figure.toString());

  figure = father.order("triangle");
  System.out.println("Mother is drawing " + figure.getName() + "\n" + figure.toString());
  
  figure = me.order("circle");
  System.out.println("I am drawing " + figure.getName() + "\n" + figure.toString());
 
  figure = me.order("rectangle");
  System.out.println("I am drawing " + figure.getName() + "\n" + figure.toString());

  figure = me.order("triangle");
  System.out.println("I am drawing " + figure.getName() + "\n" + figure.toString());

}
}
