package com.j2.pizzaaf;

public class SMPizzaStore extends PizzaStore {

 protected Pizza createPizza(String item) {
  Pizza pizza = null;
  PizzaIngredientFactory ingredientFactory =
  new SMPizzaIngredientFactory();

  if (item.equals("cheese")) {

   pizza = new CheesePizza(ingredientFactory);
   pizza.setName("Sang Myung Style Cheese Pizza");

  } else if (item.equals("veggie")) {

   pizza = new VeggiePizza(ingredientFactory);
   pizza.setName("Sang Myung Style Veggie Pizza");

  } else if (item.equals("clam")) {

   pizza = new ClamPizza(ingredientFactory);
   pizza.setName("Sang Myung Style Clam Pizza");

  } else if (item.equals("pepperoni")) {

   pizza = new PepperoniPizza(ingredientFactory);
   pizza.setName("Sang Myung Style Pepperoni Pizza");

  } else if (item.equals("potato")) {
    
    pizza = new PotatoPizza(ingredientFactory);
    pizza.setName("Sang Myung Style Potato Pizza");
  
  } else if (item.equals("shrimp")) {
    
    pizza = new ShrimpPizza(ingredientFactory);
    pizza.setName("Sang Myung Style Shrimp Pizza");
    
  }
  return pizza;
 }
}
