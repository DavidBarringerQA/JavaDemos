package com.qa.javaexamples;

public class BlackJack {
  public static void main(String[] args) {
    System.out.println("play (10, 21) -> " + winner(10, 21));
    System.out.println("play (20, 18) -> " + winner(20, 18));
    System.out.println("play (1, 22) -> " + winner(1, 22));
    System.out.println("play (22, 23) -> " + winner(22, 23));
  }

  private static int winner(int p1, int p2) {
    if (p1 > 21 && p2 > 21) {
      return 0;
    }
    if (p1 > 21) {
      return p2;
    }
    if (p2 > 21) {
      return p1;
    }
    if (p1 > p2) {
      return p1;
    } else {
      return p2;
    }
  }
}
