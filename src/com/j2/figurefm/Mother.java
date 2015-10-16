package com.j2.figurefm;

public class Mother extends DrawingPerson {

 Figure createFigure(String item) {
         if (item.equals("circle")) {
              return new MotherStyleCircle();
         } else if (item.equals("rectangle")) {
              return new MotherStyleRectangle();
         } else if (item.equals("triangle")) {
              return new MotherStyleTriangle();
         } 
         else return null;
 }
}
