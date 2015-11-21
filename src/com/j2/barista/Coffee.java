package com.j2.barista;

public class Coffee extends CaffeineBeverage{
  public void brew(){
    System.out.println("Dropping Coffee through filter");
  }
  
  public void addCondiments(){
    System.out.println("Adding Sugar and Milk");
  }
}