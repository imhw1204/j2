package com.j2.figurefm;

public class DependentDrawingPerson {
 
 public Figure createFigure(String style, String type) {
  Figure figure = null;
  if (style.equals("Father")) {
   if (type.equals("circle")) {
    figure = new FatherStyleCircle();
   } else if (type.equals("rectangle")) {
    figure = new FatherStyleRectangle();
   } else if (type.equals("triangle")) {
    figure = new FatherStyleTriangle();
   }
  }
  else if (style.equals("Mother")) {
   if (type.equals("circle")) {
    figure = new MotherStyleCircle();
   } else if (type.equals("rectangle")) {
    figure = new MotherStyleRectangle();
   } else if (type.equals("triangle")) {
    figure = new MotherStyleTriangle();
   }
  }
 else if (style.equals("Me")) {
   if (type.equals("circle")) {
    figure = new MyStyleCircle();
   } else if (type.equals("rectangle")) {
    figure = new MyStyleRectangle();
   } else if (type.equals("triangle")) {
    figure = new MyStyleTriangle();
   }
  }
 else {
   System.out.println("Error: invalid type of pizza");
   return null;
  }
  figure.prepare();
  
  return figure;
 }
}
