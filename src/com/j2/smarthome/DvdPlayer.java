package com.j2.smarthome;

public class DvdPlayer {
  String description;
  int currentTrack;
  Amplifier amplifier;
  String movie;
 
  public DvdPlayer(String description, Amplifier amplifier) {
    this.description = description;
    this.amplifier = amplifier;
  }
 
  public void on() {
    System.out.println(description + " on");
  }
 
  public void off() {
    System.out.println(description + " off");
  }
  
  public void play(String movie) {
    this.movie = movie;
    currentTrack = 0;
    System.out.println(description + " playing \"" + movie + "\"");
  }
  
   public void pause() {
     System.out.println(description + " paused \"" + movie + "\"");
   }
}
  