package com.j2.kimbab;

public abstract class IngredientDecorator extends Kimbab {
  Kimbab kimbab;
  public abstract String getDescription();
}
