package com.j2.pizzaaf;

public class PotatoPizza extends Pizza {
 PizzaIngredientFactory ingredientFactory;
 
 public PotatoPizza(PizzaIngredientFactory ingredientFactory) {
  this.ingredientFactory = ingredientFactory;
 }
 
 void prepare() {
  System.out.println("Preparing " + name);
  dough = ingredientFactory.createDough();
  sauce = ingredientFactory.createSauce();
  cheese = ingredientFactory.createCheese();
  veggies = ingredientFactory.createVeggies();
  potato = ingredientFactory.createPotato();
 }
}
