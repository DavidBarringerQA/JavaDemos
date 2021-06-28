package com.qa.javaexamples;

import java.util.ArrayList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {

    List<Person> people = new ArrayList<Person>();
    people.add(new Person());
    people.add(new Person("Sam Samson", 20, "Architect"));
    people.add(new Person("Sonya Smith", 42, "Invesigative Reporter"));
    people.add(new Person("Gareth Butcher", 29, "Beauty Consultant"));
    people.add(new Person("Josephine Sutton", 33, "Unlicensed Chiropractor"));
    for (Person p : people) {
      p.print();
    }
    // ArrayList<Element> pTable = new ArrayList<Element>();
    // pTable.add(new Element("Hydrogen", 1, 1.008, "H"));
    // pTable.add(new Element("Helium", 2, 4.002602, "He"));
    // pTable.add(new Element("Radon", 86, 222, "Rn"));
    // pTable.add(new Element("Tungsten", 74, 183.64, "W"));
    // pTable.add(new Element("Carbon", 6, 12.011, "C"));
    // System.out.println(pTable);
    // System.out.println(Strings.lambdaWordCount("This is a test sentence"));
    // System.out.println(ForNumbers.printNum(909122));
  }
}
