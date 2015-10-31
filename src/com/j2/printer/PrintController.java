package com.j2.printer;
 
public class PrintController {
 public static void main(String args[]) {
  Printer print1 = Printer.getInstance();
  print1.sendToM();
  print1.ready();
  print1.sendToP();
  print1.print();

  System.out.println("\n");
  
  Printer print2 = Printer.getInstance();
  print2.sendToM();
  print2.ready();
  print2.sendToP();
  print2.print();
  
  System.out.println("\n");
  
  Printer print3 = Printer.getInstance();
  print3.sendToM();
  print3.ready();
  print3.sendToP();
  print3.print();
  
 }
}
