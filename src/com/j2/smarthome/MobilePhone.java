package com.j2.smarthome;

public class MobilePhone {
 String description;
 
 public MobilePhone(String description) {
  this.description = description;
 }
  
 public void on() {
  System.out.println(description + " on");
 }
  
 public void off() {
  System.out.println(description + " off");
 }
  
}
