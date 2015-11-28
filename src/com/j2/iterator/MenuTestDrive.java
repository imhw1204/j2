package com.j2.iterator;

import java.util.*;

public class MenuTestDrive{
  public static void main(String[] args){
    printMenu();
  }
  
  public static void printMenu(){
    PancakeHouseMenu p=new PancakeHouseMenu();
    DinerMenu d=new DinerMenu();
    
    System.out.println("\n********** Pancake House  Menu ***********");
    ArrayList pItems=p.getMenuItems();
    for(int i=0; i<pItems.size(); i++){
      MenuItem menuItem=(MenuItem)pItems.get(i);
      System.out.println(menuItem.getName());
      System.out.println("\t\t" + menuItem.getPrice());
      System.out.println("\t" + menuItem.getDescription());
    }
    
    System.out.println("\n----------For Vegetarian----------");
    for(int i=0; i<pItems.size(); i++){
      MenuItem menuItem=(MenuItem)pItems.get(i);
      if(menuItem.getVegetarian()==true){
        System.out.println(menuItem.getName());
        System.out.println("\t\t" + menuItem.getPrice());
        System.out.println("\t" + menuItem.getDescription());
      }
    }
    
    System.out.println("\n\n\n********** Diner Menu **********");
    
    MenuItem[] dItems=d.getMenuItems();
    for(int i=0; i<dItems.length; i++){
      MenuItem menuItem=dItems[i];
      System.out.println(menuItem.getName());
      System.out.println("\t\t" + menuItem.getPrice());
      System.out.println("\t" + menuItem.getDescription());
    }
    
    System.out.println("\n----------For Vegetarian----------");
    for(int i=0; i<dItems.length; i++){
      MenuItem menuItem=dItems[i];
      if(menuItem.getVegetarian()==true){
        System.out.println(menuItem.getName());
        System.out.println("\t\t" + menuItem.getPrice());
        System.out.println("\t" + menuItem.getDescription());
      
      }
    }
  }
}