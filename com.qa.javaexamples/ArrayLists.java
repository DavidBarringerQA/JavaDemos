package com.qa.javaexamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Element> pTable = new ArrayList<Element>();
    pTable.add(new Element("Hydrogen", 1, 1.008, "H"));
    pTable.add(new Element("Helium", 2, 4.002602, "He"));
    pTable.add(new Element("Radon", 86, 222, "Rn"));
    pTable.add(new Element("Tungsten", 74, 183.64, "W"));
    pTable.add(new Element("Carbon", 6, 12.011, "C"));
    System.out.println(pTable);
    for (int i = 0; i < pTable.size(); i++) {
      System.out.println(pTable.get(i));
    }
    for (Element e : pTable) {
      System.out.println(e);
    }
    pTable.set(1, new Element("Aluminium", 13, 26.9815385, "Al"));
    pTable.set(2, new Element("Cobalt", 27, 58.933194, "Co"));
    pTable.remove(4);
    Collections.sort(pTable);
    System.out.println(pTable);
    Collections.reverse(pTable);
    System.out.println(pTable);
    Collections.swap(pTable, 0, 4);
    System.out.println(pTable);
  }
}

class Element implements Comparable<Element> {
  private String name;
  private int atomicNo;
  private double atomicMass;
  private String symbol;

  public Element(String name, int atomicNo, double atomicMass, String symbol) {
    super();
    this.name = name;
    this.atomicNo = atomicNo;
    this.atomicMass = atomicMass;
    this.symbol = symbol;
  }

  public String getName() {
    return this.name;
  }

  public int getAtomicNo() {
    return this.atomicNo;
  }

  public double getAtomicMass() {
    return this.atomicMass;
  }

  public int compareTo(Element cElement) {
    return this.atomicNo - cElement.getAtomicNo();
  }

  public Element clone() {
    return new Element(this.name, this.atomicNo, this.atomicMass, this.symbol);
  }

  public String toString() {
    return "\n"
        + this.name
        + " ("
        + this.symbol
        + ")\nNo.: "
        + this.atomicNo
        + "\nMass: "
        + this.atomicMass;
  }
}
