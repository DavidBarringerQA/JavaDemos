package com.qa.javaexamples;

public class ForNumbers {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(printNum(i));
    }
  }

  private static String smalls(int num) {
    switch (num) {
      case 1:
        return "one";
      case 2:
        return "two";
      case 3:
        return "three";
      case 4:
        return "four";
      case 5:
        return "five";
      case 6:
        return "six";
      case 7:
        return "seven";
      case 8:
        return "eight";
      case 9:
        return "nine";
      case 10:
        return "ten";
      case 11:
        return "eleven";
      case 12:
        return "twelve";
      case 13:
        return "thirteen";
      case 14:
        return "fourteen";
      case 15:
        return "fifteen";
      case 16:
        return "sixteen";
      case 17:
        return "seventeen";
      case 18:
        return "eighteen";
      case 19:
        return "nineteen";
      default:
        return "";
    }
  }

  private static String printNum(int num) {
    if (num <= 0) {
      return "number out of scope";
    } else if (num < 20) {
      return smalls(num);
    } else if (num < 30) {
      return "twenty " + smalls(num - 20);
    } else if (num < 40) {
      return "thirty " + smalls(num - 30);
    } else if (num < 50) {
      return "forty " + smalls(num - 40);
    } else if (num < 60) {
      return "fifty " + smalls(num - 50);
    } else if (num < 70) {
      return "sixty " + smalls(num - 60);
    } else if (num < 80) {
      return "seventy " + smalls(num - 70);
    } else if (num < 90) {
      return "eighty " + smalls(num - 80);
    } else if (num < 100) {
      return "ninety " + smalls(num - 90);
    } else if (num == 100) {
      return "one hundred";
    } else {
      return "number out of scope";
    }
  }
}
