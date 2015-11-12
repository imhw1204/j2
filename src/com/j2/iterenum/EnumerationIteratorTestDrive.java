package com.j2.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
 public static void main (String args[]) {
  Vector v = new Vector();
  v.add("EnumerationIterator 1");
  v.add("EnumerationIterator 2");
  v.add("EnumerationIterator 3");
  Iterator iterator = new EnumerationIterator(v.elements());
  while (iterator.hasNext()) {
   System.out.println(iterator.next());
  }
 }
}
