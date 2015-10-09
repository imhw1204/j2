package com.j2.kimbab;

public class Sausage extends IngredientDecorator {

 public Sausage(Kimbab kimbab) {
  this.kimbab = kimbab;
 }

 public String getDescription() {
  return kimbab.getDescription() + ", Sausage";
 }

 public double cost() {
  return .50 + kimbab.cost();
 }
}

