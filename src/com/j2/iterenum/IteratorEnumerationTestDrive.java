package com.j2.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {
 public static void main (String args[]) {
  ArrayList l = new ArrayList();
  l.add("IteratorEnumeration 1");
  l.add("IteratorEnumeration 2");
  l.add("IteratorEnumeration 3");
  Enumeration enumeration = new IteratorEnumeration(l.iterator());
  while (enumeration.hasMoreElements()) {
   System.out.println(enumeration.nextElement());
  }
 }
}
