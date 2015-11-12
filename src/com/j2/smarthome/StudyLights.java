package com.j2.smarthome;

public class StudyLights {
 String description;
 
 public StudyLights(String description) {
  this.description = description;
 }
  
 public void on() {
  System.out.println(description + " on");
 }
  
 public void off() {
  System.out.println(description + " off");
 }
  
 public void dim(int level) {
  System.out.println(description + " dimming to " + level  + "%");
 }
}
