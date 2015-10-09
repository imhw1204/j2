package com.j2.kimbab;

public class Shrimp extends IngredientDecorator {

 public Shrimp(Kimbab kimbab) {
  this.kimbab = kimbab;
 }

 public String getDescription() {
  return kimbab.getDescription() + ", Shrimp";
 }

 public double cost() {
  return .50 + kimbab.cost();
 }
}

