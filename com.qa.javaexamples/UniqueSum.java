package com.qa.javaexamples;

public class UniqueSum {
  public static void main(String[] args) {
    System.out.println("Input(1, 2, 3) -> " + uniqueSum(1, 2, 3));
    System.out.println("Input(3, 3, 3) -> " + uniqueSum(3, 3, 3));
    System.out.println("Input(1, 1, 2) -> " + uniqueSum(1, 1, 3));
  }

  private static int uniqueSum(int n1, int n2, int n3) {
    int sum = 0;
    if (n1 != n2 && n1 != n3) {
      sum += n1;
    }
    if (n2 != n1 && n2 != n3) {
      sum += n2;
    }
    if (n3 != n1 && n3 != n2) {
      sum += n3;
    }
    return sum;
  }
}
