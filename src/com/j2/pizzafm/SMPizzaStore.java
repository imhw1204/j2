package com.j2.pizzafm;

public class SMPizzaStore extends PizzaStore {

 Pizza createPizza(String item) {
         if (item.equals("cheese")) {
              return new SMStyleCheesePizza();
         } else if (item.equals("potato")) {
              return new SMStylePotatoPizza();
         }
         else return null;
 }
}
