package com.j2.threadsafe;
 
public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
  boiler1.fill();
  boiler1.boil();
  boiler1.drain();

  System.out.println("\n");
  
  ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
  boiler2.fill();
  boiler2.boil();
  boiler2.drain();
  
  
 }
}
