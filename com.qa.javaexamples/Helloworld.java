package com.qa.javaexamples;

public class Helloworld {

  public static String target = "stranger";

  public static void main(String[] args) {
    System.out.println("Hello " + target + "!");
  }

  private static String location() {
    return "World";
  }
}
