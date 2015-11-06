package com.j2.undo;

public class DVDPlayer{
  public DVDPlayer(){}
  
  public void open(){
    System.out.println("Player is open");
    System.out.println("Please put a DVD!");
  }
  
  public void close(){
    System.out.println("Player is closed");
    System.out.println("DVD is loading...");
  }
}
  