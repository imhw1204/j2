package com.j2.pizzas;

public class SimplePizzaFactory {

 public Pizza createPizza(String type) {
  Pizza pizza = null;

  if (type.equals("cheese")) {
   pizza = new CheesePizza();
  } else if (type.equals("pepperoni")) {
   pizza = new PepperoniPizza();
  } else if (type.equals("clam")) {
   pizza = new ClamPizza();
  } else if (type.equals("veggie")) {
   pizza = new VeggiePizza();
  } else if (type.equals("potato")){
    pizza = new PotatoPizza();
  }  else if (type.equals("shrimp")){
    pizza = new ShrimpPizza();
  }
  
  return pizza;
 }
}
