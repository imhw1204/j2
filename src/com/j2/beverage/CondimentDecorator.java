package com.j2.beverage;

public abstract class CondimentDecorator extends Beverage {
  Beverage beverage;
  public abstract String getDescription();
}
