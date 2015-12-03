package com.j2.gumballstate;

public class NoQuarterState implements State{
  GumballMachine gm;
  
  public NoQuarterState(GumballMachine gm){
    this.gm=gm;
  }
  
  public void insertQuarter(){
    System.out.println("You inserted a Quarter");
    gm.setState(gm.getHasQuarterState());
  }
  
  public void ejectQuarter(){
    System.out.println("You haven't inserted a quarter");
  }
  
  public void turnCrank(){
    System.out.println("You turned, but there's no quarter");
  }
  
  public void dispense(){
    System.out.println("You need to pay first");
  }
  
  public void error(){
    System.out.println("Machine is working");
  }

  
  public String toString(){
    return "Waiting for quarter";
  }
}