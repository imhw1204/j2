package com.j2.kimbab;

public class Tuna extends IngredientDecorator {

 public Tuna(Kimbab kimbab) {
  this.kimbab = kimbab;
 }

 public String getDescription() {
  return kimbab.getDescription() + ", Tuna";
 }

 public double cost() {
  return .50 + kimbab.cost();
 }
}

