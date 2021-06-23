package com.qa.javaexamples;

public class Taxes {
  public static void main(String[] args) {
    System.out.println("Tax 13000 -> " + taxAmount(13000));
    System.out.println("Tax 17000 -> " + taxAmount(17000));
    System.out.println("Tax 31000 -> " + taxAmount(31000));
    System.out.println("Tax 49231 -> " + taxAmount(49231));
  }

  private static double taxRate(int salary) {
    if (salary < 15000) {
      return 0;
    } else if (salary < 20000) {
      return 0.1d;
    } else if (salary < 30000) {
      return 0.15d;
    } else if (salary < 45000) {
      return 0.2d;
    } else {
      return 0.25d;
    }
  }

  private static double taxAmount(int salary) {
    double amount = taxRate(salary) * salary;
    return amount;
  }
}
