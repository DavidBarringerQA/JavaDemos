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
    System.out.println("FlowchartLoopA ->");
    flowchartLoopA();
    System.out.println("FlowchartLoopB ->");
    flowchartLoopB();
    System.out.println("OneTenLoopA ->");
    oneTenLoopA();
    System.out.println("OneTenLoopB ->");
    oneTenLoopB();
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

  private static void flowchartLoopA() {
    for (int A = 100; A <= 200; A++) {
      System.out.print("A");
    }
    System.out.println("");
  }

  private static void flowchartLoopB() {
    for (int A = 100; A < 200; A++) {
      if (A % 2 == 0) {
        System.out.print("-");
      } else {
        System.out.print("*");
      }
    }
    System.out.println("");
  }

  private static void oneTenLoopA() {
    for (int i = 1; i <= 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println(i);
      }
    }
  }

  private static void oneTenLoopB() {
    for (int i = 1; i <= 10; i++) {
      for (int j = 0; j < i; j++) {
        System.out.println(i);
      }
    }
  }
}
