package com.qa.javaexamples;

public class Calc {
  public static void main(String[] args) {
    System.out.println(
        "2 + 3 = "
            + add(2, 3)
            + "\n7 - 5 = "
            + sub(7, 5)
            + "\n4 * 3 = "
            + mul(4, 3)
            + "\n25 / 5 = "
            + div(25, 5));
  }

  private static int add(int num1, int num2) {
    return num1 + num2;
  }

  private static int sub(int num1, int num2) {
    return num1 - num2;
  }

  private static int mul(int num1, int num2) {
    return num1 * num2;
  }

  private static int div(int num1, int num2) {
    return num1 / num2;
  }
}
