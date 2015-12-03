package com.j2.gumballstate;

public class BreakDownState implements State{
  GumballMachine gm;
  
  public BreakDownState(GumballMachine gm){
    this.gm=gm;
  }
  
  public void insertQuarter(){
    gm.trouble();
    System.out.println("--Error--");
    System.out.println("You can't insert a quarter");
  }
  
  public void ejectQuarter(){
    gm.trouble();
    System.out.println("--Error--");
    System.out.println("You can't eject a quarter");
  }
  
  public void turnCrank(){
    gm.trouble();
    System.out.println("--Error--");
    System.out.println("You turned, but you can't get a quarter");
  }
  
  public void dispense(){
    System.out.println("--Error--");
    System.out.println("No gumball dispensed");
  }
  
  public void error(){
    gm.trouble();
    System.out.println("--Error--");
    System.out.println("You inserted a quarter wrong place");
  }
  
  public String toString(){
    return "--Error--";
  }
}
  
  