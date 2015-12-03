package com.j2.gumballstate;

public class HasQuarterState implements State{
  GumballMachine gm;
  
  public HasQuarterState(GumballMachine gm){
    this.gm=gm;
  }
  
  public void insertQuarter(){
    System.out.println("You can't insert another quarter");
  }
  
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gm.setState(gm.getNoQuarterState());
  }
  
  public void turnCrank(){
    System.out.println("You turned...");
    gm.setState(gm.getSoldState());
  }
  
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
  
  public void error(){
    System.out.println("Machine is working");
  }
  
  public String toString(){
    return "Waiting for turn of crank";
  }
}
  