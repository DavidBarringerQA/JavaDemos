package com.qa.javaexamples;

public class Flowcharts {
  public static void main(String[] args) {
    System.out.println("Input (3,3,false) -> " + addMul(3, 3, false));
    System.out.println("Flowchart 400 -> ");
    flowchart(400);
    System.out.println("Flowchart 700 -> ");
    flowchart(700);
    System.out.println("Flowchart 20 -> ");
    flowchart(20);
    System.out.println("Flowchart 5000 -> ");
    flowchart(5000);
  }

  private static int addMul(int num1, int num2, boolean add) {
    if (add) {
      return num1 + num2;
    } else {
      return num1 * num2;
    }
  }

  private static void flowchart(int A) {
    if (A > 2000) {
      System.out.println("A");
      if (A > 6000) {
        System.out.println("C");
      } else {
        System.out.println("B");
        if (A > 4000) {
          System.out.println("D");
        } else {
          System.out.println("E");
        }
      }
    } else {
      System.out.println(1);
      if (A > 100) {
        System.out.println(3);
        if (A > 600) {
          System.out.println(5);
        } else {
          System.out.println(4);
          if (A > 500) {
            System.out.println(6);
          } else {
            System.out.println(7);
          }
        }
      } else {
        System.out.println(2);
      }
    }
  }
}
