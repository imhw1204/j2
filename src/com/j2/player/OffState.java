package com.j2.player;

public class OffState implements State{
  Player player;
  
  public OffState(Player player){
    this.player=player;
  }
  
  public void pause(){
    System.out.println("***Pause, It is sleep***");
  }
  
  public void sleep(){
    System.out.println("Do not sleep");
  }
  
  public void noSleep(){
    System.out.println("No sleep");
  }
}