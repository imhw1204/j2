package com.j2.smarthome;

public class StudyFacade {
  Amplifier amp;
  Tuner tuner;
  MP3Player mp3;
  StudyLights lights;
  DeskLamp lamp;
  LabTop labtop;
  MobilePhone phone;
  
  public StudyFacade(Amplifier amp, Tuner tuner, MP3Player mp3, StudyLights lights, DeskLamp lamp, LabTop labtop, MobilePhone phone) {
    this.amp=amp;
    this.tuner=tuner;
    this.mp3=mp3;
    this.lights=lights;
    this.lamp=lamp;
    this.labtop=labtop;
    this.phone=phone;
  }
  
  public void beginStudy() {
    System.out.println("Get ready to begin studying...\n");
    amp.on();
    amp.setMP3(mp3);
    amp.setVolume(3);
    mp3.on();
    mp3.play("classical music");
    lights.dim(15);
    lamp.on();
    labtop.on();
    phone.off();
  }
  
  public void endStudy() {
    System.out.println("Finish studying!\n");
    amp.off();
    tuner.off();
    mp3.off();
    lights.on();
    lamp.off();
    labtop.off();
    phone.on();
  }
}
    
  
  