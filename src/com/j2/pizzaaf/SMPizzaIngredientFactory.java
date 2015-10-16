package com.j2.pizzaaf;

public class SMPizzaIngredientFactory 
 implements PizzaIngredientFactory 
{

 public Dough createDough() {
  return new ThickCrustDough();
 }

 public Sauce createSauce() {
  return new PlumTomatoSauce();
 }

 public Cheese createCheese() {
  return new MozzarellaCheese();
 }

 public Veggies[] createVeggies() {
  Veggies veggies[] = { new BlackOlives(), 
                        new Onion(), 
                        new Garlic() };
  return veggies;
 }

 public Pepperoni createPepperoni() {
  return new SlicedPepperoni();
 }

 public Clams createClam() {
  return new FreshClams();
 }
 
 public Potato createPotato(){
   return new SlicedPotato();
 }
 
 public Shrimp createShrimp(){
   return new FreshShrimp();
 }
 
 
}
