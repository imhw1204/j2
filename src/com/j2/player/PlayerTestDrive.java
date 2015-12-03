package com.j2.player;

public class PlayerTestDrive{
  public static void main(String[] args){
    
    Player player=new Player();
    System.out.println(player+"\n\n");
    
    player.noSleep();
    
    System.out.println("\n\n"+player);
    
    player.sleep();
    
    System.out.println("\n\n"+player);
    
    player.pause();
  }
}
    