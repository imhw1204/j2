package com.j2.barista;

public abstract class CaffeineBeverage{
  final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  
  abstract void brew();
  
  abstract void addCondiments();
  
  public void boilWater(){
    System.out.println("Boiling Water");
  }
  
  public void pourInCup(){
    System.out.println("Pouring into Cup");
  }
}