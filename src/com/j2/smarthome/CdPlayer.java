package com.j2.smarthome;

public class CdPlayer {
  String description;
  int currentTrack;
  Amplifier amplifier;
  String title;
  
  public CdPlayer(String description, Amplifier amplifier) {
    this.description = description;
    this.amplifier = amplifier;
  }
 
  public void on() {
    System.out.println(description + " on");
  }
 
  public void off() {
    System.out.println(description + " off");
  }
  
  public void play(String title) {
    this.title = title;
    currentTrack = 0;
    System.out.println(description + " playing \"" + title + "\"");
  }
  
  public void pause() {
    System.out.println(description + " paused \"" + title + "\"");
  }
}

  