package com.j2.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Dripping Coffee");
  }
  
  public void addCondiments(){
    System.out.println("Adding Milk and Sugar");
  }
  
  public boolean customerWantsCondiments() {
    String answer="yes";
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }

}