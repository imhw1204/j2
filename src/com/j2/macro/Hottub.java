package com.j2.macro;

public class Hottub{
  boolean on;
  int temperature;

  public Hottub() {
  }

  public void on() {
    on = true;
  }

  public void off() {
    on = false;
  }
  
  public void setTemperature(int temperature) {
    if (temperature > this.temperature) {
      System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
    }
    else {
      System.out.println("Hottub is cooling to " + temperature + " degrees");
    }
    this.temperature = temperature;
  }
}
