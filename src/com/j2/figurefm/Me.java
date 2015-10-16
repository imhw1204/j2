package com.j2.figurefm;

public class Me extends DrawingPerson {

 Figure createFigure(String item) {
         if (item.equals("circle")) {
              return new MyStyleCircle();
         } else if (item.equals("rectangle")) {
              return new MyStyleRectangle();
         } else if (item.equals("triangle")) {
              return new MyStyleTriangle();
         } 
         else return null;
 }
}
