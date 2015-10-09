package com.j2.kimbab;

public class Kimchi extends IngredientDecorator {

 public Kimchi(Kimbab kimbab) {
  this.kimbab = kimbab;
 }

 public String getDescription() {
  return kimbab.getDescription() + ", Kimchi";
 }

 public double cost() {
  return .50 + kimbab.cost();
 }
}

