package com.j2.player;

public class Player{
  State playState;
  State endState;
  State offState;
  
  State state;
  
  public Player(){
    playState=new PlayState(this);
    endState=new EndState(this);
    offState=new OffState(this);
    
    state=playState;
  }
  
  public void pause(){
    state.pause();
  }
  
  public void sleep(){
    state.sleep();
  }
  
  public void noSleep(){
    state.noSleep();
  }
  
  public void setState(State state){
    this.state=state;
  }
  
  public State getState(){
    return state;
  }
  
  public State getPlayState(){
    return playState;
  }
  
  public State getEndState(){
    return endState;
  }
  
  public State getOffState(){
    return offState;
  }
  
  public String toString(){
    StringBuffer result=new StringBuffer();
    result.append("\nHYEWON Player, Inc.");
    result.append("\nPlayer is "+state+"\n");
    return result.toString();
  }
}
    
  
  