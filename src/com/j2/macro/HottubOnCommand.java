package com.j2.macro;

public class HottubOnCommand implements Command {
 Hottub hottub;

 public HottubOnCommand(Hottub hottub) {
  this.hottub = hottub;
 }
 
 public void execute() {
  hottub.on();
  hottub.setTemperature(104);
 }
 
 public void undo() {
  hottub.off();
 }
}
