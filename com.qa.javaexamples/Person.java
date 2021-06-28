package com.qa.javaexamples;

public class Person {
  private String name;
  private int age;
  private String jobTitle;

  public Person() {
    this("FNU LNU", 0, "Unknown");
  }

  public Person(String name, int age, String jobTitle) {
    this.name = name;
    this.age = age;
    this.jobTitle = jobTitle;
  }

  public void print() {
    System.out.println(
        "Name: " + this.name + "\nAge: " + this.age + "\nOccuption: " + this.jobTitle);
  }
}
