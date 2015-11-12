package com.j2.smarthome;

public class LabTop {
 String description;
 
 public LabTop(String description) {
  this.description = description;
 }
  
 public void on() {
  System.out.println(description + " on");
 }
  
 public void off() {
  System.out.println(description + " off");
 }
  
}
