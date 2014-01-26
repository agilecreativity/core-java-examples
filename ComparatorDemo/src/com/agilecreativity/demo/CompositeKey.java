package com.agilecreativity.demo;

public class CompositeKey implements Comparable<CompositeKey> {
  private int id;

  private String name;

  private int age;

  // Note: we omitted the setter to make our class immutable..
  public CompositeKey(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static void main(String[] args) {
    CompositeKey key1 = new CompositeKey(10, "bb", 30);
    CompositeKey key2 = new CompositeKey(20, "bb", 50);
    System.out.println(String.format("result :%s", key1.compareTo(key2)));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    CompositeKey other = (CompositeKey) obj;
    if (age != other.age) return false;
    if (id != other.id) return false;
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    return true;
  }

  @Override
  public int compareTo(CompositeKey o) {

    return this.getId() - o.getId();
    // zero value - is equals
    // +ve value - is greater
    // -ve value - is less than
  }

  @Override
  public String toString() {
    return "CompositeKey [id=" + id + ", name=" + name + ", age=" + age + "]";
  }
}
// -- end of CompositeKey.java
