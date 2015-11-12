package com.j2.smarthome;

public class MP3Player {
 String description;
 Amplifier amplifier;
 String title;
 
 public MP3Player(String description, Amplifier amplifier) {
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
  System.out.println(description + " playing \"" + title + "\"");
 }
 
 public void pause() {
  System.out.println(description + " paused \"" + title + "\"");
 }
}

