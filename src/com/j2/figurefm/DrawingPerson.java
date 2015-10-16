package com.j2.figurefm;

public abstract class DrawingPerson {
 
 abstract Figure createFigure(String item);
 
 public Figure order(String type) {
  Figure figure = createFigure(type);
  System.out.println("--- Drawing a " + figure.getName() + " ---");
  figure.prepare();
  return figure;
 }
}
