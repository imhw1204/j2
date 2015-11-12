package com.j2.iterenum;

import java.util.*;

public class EI {
 public static void main (String args[]) {
  Vector v = new Vector();
  v.add("1");
  v.add("2");
  v.add("3");
  Enumeration enumeration = v.elements();
  while (enumeration.hasMoreElements()) {
   System.out.println(enumeration.nextElement());
  }
  Iterator iterator = v.iterator();
  while (iterator.hasNext()) {
   System.out.println(iterator.next());
  }
 }
}
