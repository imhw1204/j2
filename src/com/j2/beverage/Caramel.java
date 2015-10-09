package com.j2.beverage;

public class Caramel extends CondimentDecorator {
 
 public Caramel(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", Caramel Syrup";
 }
 
 public double cost() {
  return .20 + beverage.cost();
 }
}
