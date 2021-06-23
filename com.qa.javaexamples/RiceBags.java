package com.qa.javaexamples;

public class RiceBags {
  public static void main(String[] args) {
    System.out.println(possible(22, 6, 5));
    System.out.println(possible(13, 1, 3));
    System.out.println(possible(16, 8, 2));
  }

  private static boolean possible(int goal, int small, int large) {
    if ((goal - (goal % 5)) / 5 > large) {
      goal -= large * 5;
    } else {
      goal = goal % 5;
    }
    if (goal > small) {
      return false;
    }
    return true;
  }
}
