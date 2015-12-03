package com.j2.player;

public class EndState implements State{
  Player player;
  
  public EndState(Player player){
    this.player=player;
  }
  
  public void pause(){
    System.out.println("Do not pause");
  }
  
  public void sleep(){
    System.out.println("***Sleep, It is end***");
    player.setState(player.getOffState());
  }
  
  public void noSleep(){
    System.out.println("Sleep. It is End");
  }
}