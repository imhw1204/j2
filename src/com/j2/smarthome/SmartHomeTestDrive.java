package com.j2.smarthome;

public class SmartHomeTestDrive {
 public static void main(String[] args) {
  Amplifier amp = new Amplifier("Top-O-Line Amplifier");
  Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
  DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
  CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
  Projector projector = new Projector("Top-O-Line Projector", dvd);
  TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
  Screen screen = new Screen("Theater Screen");
  
  MP3Player mp3 = new MP3Player("I-Pod", amp);
  StudyLights lights2 = new StudyLights("StudyRoom Ceiling Lights");
  DeskLamp lamp = new DeskLamp("SamSung Desk Lamp");
  LabTop labtop = new LabTop("LG Labtop");
  MobilePhone phone = new MobilePhone("IPhone");

  HomeTheaterFacade homeTheater = 
    new HomeTheaterFacade(amp, tuner, dvd, cd, 
      projector, screen, lights);
 
  homeTheater.watchMovie("About Time");
  System.out.println("\n\n");
  homeTheater.endMovie();
  System.out.println("--------------------------------------------");
  
  StudyFacade study = new StudyFacade(amp, tuner, mp3, lights2, lamp, labtop, phone);
  study.beginStudy();
  System.out.println("\n\n");
  study.endStudy();
 }
}
