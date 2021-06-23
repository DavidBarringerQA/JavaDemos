package com.qa.javaexamples;

public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 0; i < 50; i++) {
      System.out.println(fizzBuzz(i));
    }
  }

  public static String fizzBuzz(int num) {
    String res = "";
    if (num % 3 == 0) {
      res = res + "Fizz";
    }
    if (num % 5 == 0) {
      res = res + "Buzz";
    }
    if (num % 3 != 0 && num % 5 != 0) {
      res = res + num;
    }
    return res;
  }
}
