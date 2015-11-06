package com.j2.macro;

public class BeamProjecter {
 String location;

 public BeamProjecter(String location) {
  this.location = location;
 }

 public void on() {
  System.out.println(location + " BeamProjecter is on");
 }

 public void off() {
  System.out.println(location + " BeamProjecter is off");
 }
 
}
