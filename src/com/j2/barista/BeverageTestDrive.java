package com.j2.barista;

public class BeverageTestDrive{
  public static void main(String[] args){
    System.out.println("...Making Coffee...");
    Coffee coffee=new Coffee();
    coffee.prepareRecipe();
    System.out.println("...Making Tea...");
    Tea tea=new Tea();
    tea.prepareRecipe();
   
    System.out.println("--------------------");
    System.out.println("...Making Coffee...");
    CoffeeWithHook coffeeHook=new CoffeeWithHook();
    coffeeHook.prepareRecipe();
    System.out.println("...Making Tea...");
    TeaWithHook teeHook=new TeaWithHook();
    teeHook.prepareRecipe();
    System.out.println("...Making CaramelMacchiato...");
    CaramelMacchiatoWithHook macchiato=new CaramelMacchiatoWithHook();
    macchiato.prepareRecipe();
  }
}