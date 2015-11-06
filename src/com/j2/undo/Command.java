package com.j2.undo;

public interface Command{
  public void execute();
  public void undo();
}