package com.j2.threadsafe;
 
public class ChocolateBoiler {
 private boolean empty;
 private boolean boiled;
 private static ChocolateBoiler uniqueInstance;
 private static int numCalled=0;
  
 private ChocolateBoiler() {
  empty = true;
  boiled = false;
 }
  
 public static synchronized ChocolateBoiler getInstance() {
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new ChocolateBoiler();
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("numCalled: " + ++numCalled);
  return uniqueInstance;
 }

 public void fill() {
  if (isEmpty()) {
   empty = false;
   boiled = false;
   // fill the boiler with a milk/chocolate mixture
  }
  System.out.println("fill the boiler with a milk/chocolate mixture");
 }
 
 public void drain() {
  if (!isEmpty() && isBoiled()) {
   // drain the boiled milk and chocolate
   empty = true;
  }
  System.out.println("drain the boiled milk and chocolate");
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   boiled = true;
  }
  System.out.println("bring the contents to a boil");
 }
  
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isBoiled() {
  return boiled;
 }
}
