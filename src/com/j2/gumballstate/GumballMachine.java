package com.j2.gumballstate;

public class GumballMachine{
  State hasQuarterState;
  State noQuarterState;
  State soldState;
  State soldOutState;
  State breakDownState;
  
  State state=soldOutState;
  int count=0;
  
  public GumballMachine(int count){
    hasQuarterState=new HasQuarterState(this);
    noQuarterState=new NoQuarterState(this);
    soldState=new SoldState(this);
    soldOutState=new SoldOutState(this);
    breakDownState=new BreakDownState(this);
    
    this.count=count;
    if(count>0){
      state=noQuarterState;
    }
  }
  
  public void insertQuarter(){
    state.insertQuarter();
  }
  
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  
  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }
  
  public void error(){
    state.error();
  }
  
  public void releaseBall(){
    System.out.println("A gumball comes rolling out the slot...");
    if(count!=0){
      count=count-1;
    }
  }
  
  public void trouble(){
    System.out.println("----------");
  }
  
  public int getCount(){
    return count;
  }
  
  public void setState(State state){
    this.state=state;
  }
  
  public State getState(){
    return state;
  }
  
  public State getHasQuarterState(){
    return hasQuarterState;
  }
  
  public State getNoQuarterState(){
    return noQuarterState;
  }
  
  public State getSoldState(){
    return soldState;
  }
  
  public State getSoldOutState(){
    return soldOutState;
  }
  
  public State getBreakDownState(){
    return breakDownState;
  }
  
  public String toString(){
    StringBuffer result=new StringBuffer();
    result.append("\nHYEWON Gumball, Inc.");
    result.append("\nInventory: "+count+" gumball");
    if(count!=1){
      result.append("s");
    }
    result.append("\nMachine is "+state+"\n");
    return result.toString();
  }
}
  
  
  