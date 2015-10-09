package com.j2.beverage;

public class Water extends CondimentDecorator {
 
 public Water(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", Water";
 }
 
 public double cost() {
  return .10 + beverage.cost();
 }
}
