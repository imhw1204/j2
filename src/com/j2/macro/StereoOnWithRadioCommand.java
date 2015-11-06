package com.j2.macro;


public class StereoOnWithRadioCommand implements Command {
 Stereo stereo;
 
 public StereoOnWithRadioCommand(Stereo stereo) {
  this.stereo = stereo;
 }
 
 public void execute() {
  stereo.on();
  stereo.setRadio();
  stereo.setVolume(11);
 }

 public void undo() {
  stereo.off();
 }
}
