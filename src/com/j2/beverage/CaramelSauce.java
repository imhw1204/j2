package com.j2.beverage;

public class CaramelSauce extends CondimentDecorator {
 
 public CaramelSauce(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", Caramel Sauce";
 }
 
 public double cost() {
  return .10 + beverage.cost();
 }
}
