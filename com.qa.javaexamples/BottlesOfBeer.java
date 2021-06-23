package com.qa.javaexamples;

public class BottlesOfBeer {
  public static void main(String[] args) {
    for (int i = 99; i > 1; i--) {
      System.out.println(
          i
              + " bottles of beer on the wall, "
              + i
              + " bottles of beer.\nTake one down and pass it around, "
              + (i - 1)
              + "bottles of beer on the wall.");
    }
    System.out.println(
        "One bottle of beer on the wall, one bottle of beer.\n"
            + "Take one down and pass it around, no more bottles of beer on the wall.");
    System.out.println(
        "No more bottles of beer on the wall, no more bottles of beer.\n"
            + "Go to the store and buy some more, 99 bottles of beer on the wall.");
  }
}
