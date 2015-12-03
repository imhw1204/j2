package com.j2.gumballstate;

public class SoldState implements State{
  GumballMachine gm;
  
  public SoldState(GumballMachine gm){
    this.gm=gm;
  }
  
  public void insertQuarter(){
    System.out.println("Please wait, we're already giving you a gumball");
  }
  
  public void ejectQuarter(){
    System.out.println("Sorry, you already turned the crank");
  }
  
  public void turnCrank(){
    System.out.println("Turning twice doesn't get you another gumball");
  }
  
  public void dispense(){
    gm.releaseBall();
    if(gm.getCount()>0){
      gm.setState(gm.getNoQuarterState());
    }
    else{
      System.out.println("Sold Out-");
      System.out.println("Don't insert a quarter");
      gm.setState(gm.getSoldOutState());
    }
  }
  
  public void error(){
    System.out.println("Machine is working");
  }

  
  public String toString(){
    return "Dispensing a gumball";
  }
}