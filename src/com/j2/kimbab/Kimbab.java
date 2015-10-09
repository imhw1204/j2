package com.j2.kimbab;

public abstract class Kimbab{
  String description = "Unknown Beverage";
  
  public String getDescription(){
    return description;
  }
  
  public abstract double cost();
}