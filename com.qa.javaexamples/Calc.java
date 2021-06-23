package com.qa.javaexamples;

public class Calc {
  public static void main(String[] args) {
    System.out.println(
        "2 + 3 = " + add(2, 3) + "\n7 - 5 = " + sub(7, 5) + "\n4 * 3 = " + mul(4, 3));
    div(25, 5);
    div(5, 25);
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

  private static void div(double num1, double num2) {
    if (num1 < num2) {
      System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
    } else {
      System.out.println("Division cannot be performed");
    }
  }
}
