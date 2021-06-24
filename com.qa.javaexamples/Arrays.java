package com.qa.javaexamples;

public class Arrays {
  public static void main(String[] args) {
    int[] arrayA;
    arrayA = new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34};
    for (int i : arrayA) {
      System.out.println(i);
    }
    int[] arrayB = new int[10];
    for (int i = 0; i < arrayB.length; i++) {
      arrayB[i] = i * 2;
      System.out.println(arrayB[i]);
    }
    for (int i = 0; i < arrayB.length; i++) {
      arrayB[i] *= 10;
      System.out.println(arrayB[i]);
    }
  }
}
