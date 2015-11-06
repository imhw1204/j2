package com.j2.macro;

public class BeamProjecterOffCommand implements Command {
 BeamProjecter projecter;

 public BeamProjecterOffCommand(BeamProjecter projecter) {
  this.projecter= projecter;
 }

 public void execute() {
  projecter.off();
 }

 public void undo() {
  projecter.on();
 }
}
