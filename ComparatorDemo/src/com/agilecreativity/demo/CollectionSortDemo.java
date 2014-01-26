package com.agilecreativity.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortDemo {

  public static List<CompositeKey> getSampleData() {
    List<CompositeKey> sample = new ArrayList<CompositeKey>();
    sample.add(new CompositeKey(25, "John Smith", 40));
    sample.add(new CompositeKey(15, "Jane Smith", 30));
    sample.add(new CompositeKey(35, "Jack Smith", 10));

    return sample;
  };

  public static void printList(List<CompositeKey> sample) {
    for (CompositeKey k : sample) {
      System.out.println(k);
    }
  }

  public static void main(String[] args) {

    List<CompositeKey> list = CollectionSortDemo.getSampleData();

    // natural order
    Collections.sort(list);
    System.out.println("Sort by id   : natural order (Comparable)");
    CollectionSortDemo.printList(list);

    // should sort by name then age.
    Collections.sort(list, new NameThenAgeComparator());
    System.out.println("Sort by name : using NameThenAgeComparator()");
    CollectionSortDemo.printList(list);

    // should sort by age then name
    Collections.sort(list, new AgeThenNameComparator());
    System.out.println("Sort by age : using AgeThenNameComparator()");
    CollectionSortDemo.printList(list);
  }
}
// -- end of CollectionSortDemo.java
