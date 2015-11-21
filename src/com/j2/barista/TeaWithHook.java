package com.j2.barista;

public class TeaWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Steeping the tea");
  }
  
  public void addCondiments(){
    System.out.println("Lemon");
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