package com.qa.javaexamples;

public class Element implements Comparable<Element> {
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
