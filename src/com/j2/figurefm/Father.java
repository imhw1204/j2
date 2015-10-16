package com.j2.figurefm;

public class Father extends DrawingPerson {

 Figure createFigure(String item) {
         if (item.equals("circle")) {
              return new FatherStyleCircle();
         } else if (item.equals("rectangle")) {
              return new FatherStyleRectangle();
         } else if (item.equals("triangle")) {
              return new FatherStyleTriangle();
         } 
         else return null;
 }
}
