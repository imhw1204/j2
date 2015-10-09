package com.j2.kimbab;

public class Cheese extends IngredientDecorator {

 public Cheese(Kimbab kimbab) {
  this.kimbab = kimbab;
 }

 public String getDescription() {
  return kimbab.getDescription() + ", Cheese";
 }

 public double cost() {
  return .50 + kimbab.cost();
 }
}

