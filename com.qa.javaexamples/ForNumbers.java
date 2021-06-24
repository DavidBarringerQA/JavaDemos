package com.qa.javaexamples;

public class ForNumbers {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(printNum(i));
    }
    System.out.println(printNum(142));
    System.out.println(printNum(3000));
    System.out.println(printNum(7777));
    System.out.println(printNum(888888));
  }

  private static int digitAdd(int num) {
    if (num < 10 || num >= 100) {
      return -1;
    }
    int ones = num % 10;
    int tens = (num - ones) / 10;
    return ones + tens;
  }

  /*
   Numbers 1-15 don't have a fixed pattern, so they need to be handled as seperate cases,
   I've extended this to include 16-19, because they're not worth handling seperately
   Since each case returns, there isn't a need for break statements.
  */
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

  /*
   This is a check for each increment. We have a different name for each tens value.
   Then for the hundreds, we use the result of the smalls method, followed by "hundred"
   if it's not a round hundred, we then say "and" followed by the rest. That pattern is
   repeated for the thousands, but without the use of "and". Isn't English great?
   This solution works for numbers up to 999,999.
  */
  private static String printNum(int num) {
    if (num < 0) {
      return "number out of scope";
    } else if (num < 20) {
      return smalls(num);
    } else if (num < 30) {
      return "twenty-" + smalls(num - 20);
    } else if (num < 40) {
      return "thirty-" + smalls(num - 30);
    } else if (num < 50) {
      return "forty-" + smalls(num - 40);
    } else if (num < 60) {
      return "fifty-" + smalls(num - 50);
    } else if (num < 70) {
      return "sixty-" + smalls(num - 60);
    } else if (num < 80) {
      return "seventy-" + smalls(num - 70);
    } else if (num < 90) {
      return "eighty-" + smalls(num - 80);
    } else if (num < 100) {
      return "ninety-" + smalls(num - 90);
    } else if (num < 1000 && num % 100 == 0) {
      return printNum(num / 100) + " hundred";
    } else if (num < 1000) {
      return printNum((num - (num % 100)) / 100)
          + " hundred and "
          + printNum(num - (num - (num % 100)));
    } else if (num < 1000000 && num % 1000 == 0) {
      return printNum(num / 1000) + " thousand";
    } else if (num < 1000000) {
      return printNum((num - (num % 1000)) / 1000)
          + " thousand, "
          + printNum(num - (num - (num % 1000)));
    } else {
      return "number out of scope";
    }
  }
}
