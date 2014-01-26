package com.agilecreativity.demo;

import java.util.Comparator;

public class NameThenAgeComparator implements Comparator<CompositeKey> {

  @Override
  public int compare(CompositeKey k1, CompositeKey k2) {

    int nameCompare = k1.getName().compareTo(k2.getName());
    int ageCompare = k1.getAge() - k2.getAge();

    if (nameCompare != 0) {
      return nameCompare;
    } else {
      return ageCompare;
    }

    // zero value - is equqls
    // +ve value - is greater
    // -ve value - is less than
  }
}
// -- end of NameThenAgeComparator.java
