package com.j2.sort_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Duck{
  String name;
  int weight;

 public Duck(String name, int weight){
    this.name=name;
    this.weight=weight;
  }
}

class MyCompare implements Comparator<Duck>//비교  클래스
{
  @Override
  public int compare(Duck o1, Duck o2)
  {
   // TODO Auto-generated method stub
   return o1.weight - o2.weight;//비교
 }
 }

public class DuckTest
 {
  public static void main(String[] args)
  {
   ArrayList<Duck> duck = new ArrayList<Duck>();
   duck.add(new Duck("Daffy", 8));
   duck.add(new Duck("Dewey", 2));
   duck.add(new Duck("Howard", 7));
   duck.add(new Duck("Louie", 2));
   duck.add(new Duck("Donald",10));
   duck.add(new Duck("Huey", 2));
   
   System.out.println("Before Sorting");
   //display(duck);
   for (int i = 0; i < duck.size(); i++)
  {
    System.out.println("name: " + duck.get(i).name
      + "weight: " + duck.get(i).weight);
   }
   
   System.out.println("-----------------------");
   System.out.println("After Sorting");
   Collections.sort(duck, new MyCompare());//정렬
   //display(duck);
   for (int i = 0; i < duck.size(); i++)
  {
    System.out.println("name: " + duck.get(i).name
      + "weight: " + duck.get(i).weight);
   }
  }
  
  /*public static void display(ArrayList duck){
  for (int i = 0; i < duck.size(); i++)
  {
    System.out.println("name: " + (duck.get(i)).name
      + "weight: " + (duck.get(i)).weight);
   }
  }*/
 

}
