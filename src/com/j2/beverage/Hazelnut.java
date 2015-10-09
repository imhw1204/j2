package com.j2.beverage;

public class Hazelnut extends CondimentDecorator {
 
 public Hazelnut(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", Hazelnut Syrup";
 }
 
 public double cost() {
  return .10 + beverage.cost();
 }
}
