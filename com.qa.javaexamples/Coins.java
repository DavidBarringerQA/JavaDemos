package com.qa.javaexamples;

public class Coins {
  public static char pound = '\u00A3';

  public static void main(String[] args) {
    System.out.println(
        "Cost: " + pound + "4.58, Paid: " + pound + "20, Change:\n" + payment(4.58d, 20d));
    System.out.println(
        "Cost: " + pound + "15.32, Paid: " + pound + "20, Change:\n" + payment(15.32d, 20d));
    System.out.println(
        "Cost: " + pound + "0.99, Paid: " + pound + "10, Change:\n" + payment(0.99d, 10d));
    System.out.println(
        "Cost: " + pound + "16.70, Paid: " + pound + "18.40, Change:\n" + payment(16.70d, 18.40d));
  }

  private static String payment(double cost, double paid) {
    if (cost > paid) {
      return "Not enough money given";
    }
    return change((int) ((paid - cost) * 100));
  }

  private static String change(int money) {
    if (money == 0) {
      return "";
    } else if (money / 2000 >= 1) {
      return (money - (money % 2000)) / 2000 + " " + pound + "20 note\n" + change(money % 2000);
    } else if (money / 1000 >= 1) {
      return (money - (money % 1000)) / 1000 + " " + pound + "10 note\n" + change(money % 1000);
    } else if (money / 500 >= 1) {
      return (money - (money % 500)) / 500 + " " + pound + "5 note\n" + change(money % 500);
    } else if (money / 200 >= 1) {
      return (money - (money % 200)) / 200 + " " + pound + "2 coin\n" + change(money % 200);
    } else if (money / 100 >= 1) {
      return (money - (money % 100)) / 100 + " " + pound + "1 coin\n" + change(money % 100);
    } else if (money / 50 >= 1) {
      return (money - (money % 50)) / 50 + " 50p coin\n" + change(money % 50);
    } else if (money / 20 >= 1) {
      return (money - (money % 20)) / 20 + " 20p coin\n" + change(money % 20);
    } else if (money / 10 >= 1) {
      return (money - (money % 10)) / 10 + " 10p coin\n" + change(money % 10);
    } else if (money / 5 >= 1) {
      return (money - (money % 5)) / 5 + " 5p coin\n" + change(money % 5);
    } else if (money / 2 >= 1) {
      return (money - (money % 2)) / 2 + " 2p coin\n" + change(money % 2);
    } else if (money / 1 >= 1) {
      return (money - (money % 1)) / 1 + " 1p coin\n" + change(money % 1);
    } else {
      return "Denomination too small";
    }
  }
}
