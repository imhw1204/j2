package com.j2.macro;

public class BeamProjecterOnCommand implements Command {
 BeamProjecter projecter;

 public BeamProjecterOnCommand(BeamProjecter projecter) {
  this.projecter= projecter;
 }

 public void execute() {
  projecter.on();
 }

 public void undo() {
  projecter.off();
 }
}
