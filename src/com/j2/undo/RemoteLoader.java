package com.j2.undo;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();
    
    Light livingRoom=new Light("Living Room");
    LightOnCommand livingRoomOn=new LightOnCommand(livingRoom);
    LightOffCommand livingRoomOff=new LightOffCommand(livingRoom);
    remoteControl.setCommand(0, livingRoomOn, livingRoomOff);
    
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    
    System.out.println("*undo button*");
    remoteControl.undoButtonWasPushed();
    
    System.out.println();
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    
    System.out.println("*undo button*");
    remoteControl.undoButtonWasPushed();
   
    System.out.println("---------------------------");
    
    DVDPlayer dvdPlayer=new DVDPlayer();
    DVDOpenCommand dvdPlayerOpen=new DVDOpenCommand(dvdPlayer);
    DVDCloseCommand dvdPlayerClose=new DVDCloseCommand(dvdPlayer);
    remoteControl.setCommand(1, dvdPlayerOpen, dvdPlayerClose);
    
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    
    System.out.println("*undo button*");
    remoteControl.undoButtonWasPushed();
    
    System.out.println();
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(1);
    
    System.out.println("*undo button*");
    remoteControl.undoButtonWasPushed();
    
    
  }
}