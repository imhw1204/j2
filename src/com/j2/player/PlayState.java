package com.j2.player;

public class PlayState implements State{
  Player player;
  
  public PlayState(Player player){
    this.player=player;
  }
  
  public void pause(){
    System.out.println("Do not pause, It is playing");
  }
  
  public void sleep(){
    System.out.println("Do not sleep, It is playing");
  }
  
  public void noSleep(){
    System.out.println("***No sleep. It is playing***");
    player.setState(player.getEndState());
  }
}