package com.j2.undo;

public class DVDOpenCommand implements Command{
  DVDPlayer player;
  
  public DVDOpenCommand(DVDPlayer player){
    this.player=player;
  }
  
  public void execute(){
    player.open();
  }
  
  public void undo(){
    player.close();
  }
}