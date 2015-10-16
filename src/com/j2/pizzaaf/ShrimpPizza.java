package com.j2.pizzaaf;

public class ShrimpPizza extends Pizza {
 PizzaIngredientFactory ingredientFactory;
 
 public ShrimpPizza(PizzaIngredientFactory ingredientFactory) {
  this.ingredientFactory = ingredientFactory;
 }
 
 void prepare() {
  System.out.println("Preparing " + name);
  dough = ingredientFactory.createDough();
  sauce = ingredientFactory.createSauce();
  cheese = ingredientFactory.createCheese();
  veggies = ingredientFactory.createVeggies();
  shrimp = ingredientFactory.createShrimp();
 }
}
