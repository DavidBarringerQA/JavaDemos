package com.qa.javaexamples;

public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 0; i < 50; i++) {
      System.out.println(fizzBuzz(i));
    }
  }

  public static String fizzBuzz(int num) {
    // Appending strings removes a check for both %3 and %5
    String res = "";
    if (num % 3 == 0) {
      res = res + "Fizz";
    }
    if (num % 5 == 0) {
      res = res + "Buzz";
    } else if (num % 3 != 0) {
      res = res + num;
    }
    return res;
  }
}
