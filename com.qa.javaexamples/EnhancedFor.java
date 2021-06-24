package com.qa.javaexamples;

public class EnhancedFor {
  public static void main(String[] args) {
    String sentence[] = {"These ", "are ", "the ", "words ", "of ", "this ", "sentence."};
    for (String word : sentence) {
      System.out.print(word);
    }

    int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    for (int i : intArray) {
      // Syntatic sugar for: i = i*i;
      i *= i;
      System.out.println(i);
    }

    for (int i : intArray) {
      if (isEven(i)) {
        i *= i * i;
      } else {
        i *= i;
      }
      System.out.println(i);
    }
  }

  private static boolean isEven(int num) {
    // Don't bother with if/else since the equality test returns a boolean value
    return (num % 2 == 0);
  }
}
