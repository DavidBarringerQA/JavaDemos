package com.qa.javaexamples;

public class RiceBags {
  public static void main(String[] args) {
    System.out.println(smallBagCount(22, 6, 5));
    System.out.println(smallBagCount(13, 1, 3));
    System.out.println(smallBagCount(16, 8, 2));
  }

  /*
   Remove as many large bags as possible, if there are fewer small bags
   than remaining kilograms, it's not possible.
  */
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

  private static int smallBagCount(int goal, int small, int large) {
    if (!possible(goal, small, large)) {
      return -1;
    }
    if ((goal - (goal % 5)) / 5 > large) {
      goal -= large * 5;
    } else {
      goal = goal % 5;
    }
    return goal;
  }
}
