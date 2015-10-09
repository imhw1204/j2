package com.j2.kimbab;

public class Kimgane {
 
 public static void main(String args[]) {
  Kimbab kimbab = new Kim();
  kimbab=new Kimchi(kimbab);
  kimbab=new Sausage(kimbab);
  System.out.println(kimbab.getDescription() 
    + " $" + kimbab.cost());
  
  Kimbab kimbab2 = new Nude();
  kimbab2=new Tuna(kimbab2);
  kimbab2=new Kimchi(kimbab2);
  System.out.println(kimbab2.getDescription() 
    + " $" + kimbab2.cost());
  
  Kimbab kimbab3 = new FriedEgg();
  kimbab3=new Pork(kimbab3);
  kimbab3=new Kimchi(kimbab3);
  System.out.println(kimbab3.getDescription() 
    + " $" + kimbab3.cost());
  
  Kimbab kimbab4 = new Kim();
  kimbab4=new Shrimp(kimbab4);
  kimbab4=new Sausage(kimbab4);
  kimbab4=new Kimchi(kimbab4);
  System.out.println(kimbab4.getDescription() 
    + " $" + kimbab4.cost());
 
  
  
 }
}
