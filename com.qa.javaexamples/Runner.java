package com.qa.javaexamples;

import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {

    ArrayList<Element> pTable = new ArrayList<Element>();
    pTable.add(new Element("Hydrogen", 1, 1.008, "H"));
    pTable.add(new Element("Helium", 2, 4.002602, "He"));
    pTable.add(new Element("Radon", 86, 222, "Rn"));
    pTable.add(new Element("Tungsten", 74, 183.64, "W"));
    pTable.add(new Element("Carbon", 6, 12.011, "C"));
    System.out.println(pTable);
    System.out.println(Strings.lambdaWordCount("This is a test sentence"));
    System.out.println(ForNumbers.printNum(909122));
  }
}
