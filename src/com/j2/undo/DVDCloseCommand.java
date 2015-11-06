package com.j2.undo;

public class DVDCloseCommand implements Command{
  DVDPlayer player;
  
  public DVDCloseCommand(DVDPlayer player){
    this.player=player;
  }
  
  public void execute(){
    player.close();
  }
  
  public void undo(){
    player.open();
  }
}