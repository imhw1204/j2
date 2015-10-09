package com.j2.kimbab;

public class Pork extends IngredientDecorator {

 public Pork(Kimbab kimbab) {
  this.kimbab = kimbab;
 }

 public String getDescription() {
  return kimbab.getDescription() + ", Pork cutlet";
 }

 public double cost() {
  return .50 + kimbab.cost();
 }
}

