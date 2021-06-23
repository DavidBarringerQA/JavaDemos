package com.qa.javaexamples;

public class PrimeDivisors {
  public static void main(String args[]) {
    System.out.println(naivePrime(15));
    System.out.println(naivePrime(20));
    System.out.println(GCD(15, 30));
    System.out.println(GCD(13, 19));
    System.out.println(GCD(42, 36));
  }

  // A naive prime checker
  private static boolean naivePrime(int num) {
    if (num == 2) {
      return true;
    } else if (num % 2 == 0) {
      return false;
    }
    for (int i = 3; i < num / 2; i = i + 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static int GCD(int num1, int num2) {
    // Small efficiency bonus by always checking the smaller number first
    if (num1 > num2) {
      int tmp = num1;
      num1 = num2;
      num2 = tmp;
    }
    int gcd = 1;
    for (int i = 2; i <= num1; i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
}
