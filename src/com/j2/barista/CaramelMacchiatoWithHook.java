package com.j2.barista;

public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Dropping Coffee with Filter");
  }
  
  public void addCondiments(){
    System.out.println("Adding Vanilla syrup");
    System.out.println("Adding Milk");
    System.out.println("Adding Caramel sauce");
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