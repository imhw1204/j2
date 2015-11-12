package com.j2.smarthome;

public class HomeTheaterFacade {
 Amplifier amp;
 Tuner tuner;
 DvdPlayer dvd;
 CdPlayer cd;
 Projector projector;
 Screen screen;
 TheaterLights lights;
 
 public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, TheaterLights lights) {
  this.amp = amp;
  this.tuner = tuner;
  this.dvd = dvd;
  this.cd = cd;
  this.projector = projector;
  this.screen = screen;
  this.lights = lights;
 }
 
 public void watchMovie(String movie) {
  System.out.println("Get ready to watch a movie...\n");
  lights.dim(10);
  screen.down();
  projector.on();
  projector.wideScreenMode();
  amp.on();
  amp.setDvd(dvd);
  amp.setVolume(5);
  dvd.on();
  dvd.play(movie);
 }
 
 
 public void endMovie() {
  System.out.println("Shutting movie theater down...\n");
  lights.on();
  screen.up();
  projector.off();
  amp.off();
  dvd.off();
 }

 public void listenToCd(String cdTitle) {
  System.out.println("Get ready for an audiopile experence...");
  lights.on();
  amp.on();
  amp.setVolume(5);
  amp.setCd(cd);
  cd.on();
  cd.play(cdTitle);
 }

 public void endCd() {
  System.out.println("Shutting down CD...");
  amp.off();
  amp.setCd(cd);
  cd.off();
 }

 public void listenToRadio(double frequency) {
  System.out.println("Tuning in the airwaves...");
  tuner.on();
  tuner.setFrequency(frequency);
  amp.on();
  amp.setVolume(5);
  amp.setTuner(tuner);
 }

 public void endRadio() {
  System.out.println("Shutting down the tuner...");
  tuner.off();
  amp.off();
 }
}
