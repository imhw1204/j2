package com.j2.printer;
 
public class Printer {
 private boolean empty;//�����Ϳ� �۾��� ������  ����
 private boolean isready;//�۾��� ������ ����Ʈ  �ɼ� �ִ���
 private static Printer uniqueInstance;
 private static int numCalled=0;
  
 private Printer() {
  empty = true;
  isready = false;
 }
  
 public static synchronized Printer getInstance() {
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of print");
   uniqueInstance = new Printer();
  }
  System.out.println("Returning instance of print");
  System.out.println("numCalled: " + ++numCalled);
  return uniqueInstance;
 }

 public void sendToM() {
  if (isEmpty()) {
   empty = false;
   isready = true;
  }
  System.out.println("send the file to memory");
 }
 
 public void ready() {
  if (!isEmpty() && isReady()) {
   empty = true;
  }
  System.out.println("printer is ready to print");
 }
 
 public void sendToP() {
  if (!isEmpty() && !isReady()) {
   empty = false;
  }
  System.out.println("sent the file to printer");
 }
 
 public void print(){
   System.out.println("print the file");
 }
  
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isReady() {
  return isready;
 }
}
