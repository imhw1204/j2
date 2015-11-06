package com.j2.macro;

public class TV {
 String location;

 public TV(String location) {
  this.location = location;
 }

 public void on() {
  System.out.println(location + " TV is on");
 }

 public void off() {
  System.out.println(location + " TV is off");
 }

 public void setInputChannel(int channel) {
   System.out.println(location + " TV channel is set to " + channel);
 }
}
