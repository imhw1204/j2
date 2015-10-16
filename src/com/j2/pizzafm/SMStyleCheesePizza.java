package com.j2.pizzafm;

public class SMStyleCheesePizza extends Pizza {

 public SMStyleCheesePizza() { 
  name = "SangMyung Style Basic Cheese Pizza";
  dough = "Thin Crust Dough";
  sauce = "Plum Tomato Sauce";
 
  toppings.add("Shredded Mozzarella Cheese");
 }
 
 void cut() {
  System.out.println("Cutting the pizza into square slices");
 }
}
