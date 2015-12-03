package com.j2.gumballstate;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    
    GumballMachine gm=new GumballMachine(5);
    System.out.println(gm+"\n\n");
    
    gm.insertQuarter();
    gm.turnCrank();
    
    System.out.println("\n\n"+gm+"\n\n");
    
    gm.insertQuarter();
    gm.turnCrank();
    gm.insertQuarter();
    gm.turnCrank();
    
    System.out.println("\n\n"+gm+"\n\n");
    
    gm.error();
    
    System.out.println("\n\n"+gm+"\n\n");
    
    gm.insertQuarter();
    gm.turnCrank();
    gm.insertQuarter();
    gm.turnCrank();
    gm.insertQuarter();
    gm.error();
    gm.insertQuarter();
    gm.error();
    
    
    
  }
}