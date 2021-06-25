package com.qa.javaexamples;

import java.util.stream.*;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println(
        IntStream.range(0, 50).mapToObj(i -> test(i)).collect(Collectors.joining("\n")));
  }

  private static String test(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else {
      return "" + num;
    }
  }
}
