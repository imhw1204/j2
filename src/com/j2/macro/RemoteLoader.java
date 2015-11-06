package com.j2.macro;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
    
    Light light=new Light("Party Room");
    Stereo stereo=new Stereo("Party Room");
    TV tv=new TV("Party Room");
    BeamProjecter projecter=new BeamProjecter("Party Room");
    Hottub hottub=new Hottub();
    
    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    BeamProjecterOnCommand progerterOn=new BeamProjecterOnCommand(projecter);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    BeamProjecterOffCommand progerterOff=new BeamProjecterOffCommand(projecter);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);
    
    Command[] partyOn={lightOn, stereoOn, tvOn, progerterOn, hottubOn};
    Command[] partyOff = {lightOff, stereoOff, tvOff, progerterOff, hottubOff};
    
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
    
    System.out.println("--- Pushing Macro On---");
    remoteControl.onButtonWasPushed(0);
    System.out.println("--- Pushing Macro Off---");
    remoteControl.offButtonWasPushed(0);
  }
}
    
    
    
    
  