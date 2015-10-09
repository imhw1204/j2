package com.j2.beverage;

public class StarbuzzCoffee {
 
 public static void main(String args[]) {
  Beverage beverage = new Espresso();
  System.out.println(beverage.getDescription() 
    + " $" + beverage.cost());
 
  Beverage beverage2 = new DarkRoast();
  beverage2 = new Mocha(beverage2);
  beverage2 = new Mocha(beverage2);
  beverage2 = new Whip(beverage2);
  System.out.println(beverage2.getDescription() 
    + " $" + beverage2.cost());
 
  Beverage beverage3 = new HouseBlend();
  beverage3 = new Soy(beverage3);
  beverage3 = new Mocha(beverage3);
  beverage3 = new Whip(beverage3);
  System.out.println(beverage3.getDescription() 
    + " $" + beverage3.cost());
  
  Beverage beverage4 = new DarkRoast();
  beverage4 = new Milk(beverage4);
  beverage4 = new Caramel(beverage4);
  beverage4 = new Whip(beverage4);
  beverage4 = new CaramelSauce(beverage4);
  System.out.println(beverage4.getDescription() 
    + " $" + beverage4.cost());
  
  Beverage beverage5 = new Espresso();
  beverage5 = new Water(beverage5);
  beverage5 = new Hazelnut(beverage5);
  System.out.println(beverage5.getDescription() 
    + " $" + beverage5.cost());
  
 }
}
