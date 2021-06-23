package com.qa.javaexamples;

public class Results {
  public static void main(String[] args) {
    int phys = 60;
    int chem = 100;
    int bio = 150;
    printResults(phys, chem, bio);
    calcPercentage(phys, chem, bio);
  }

  private static void printResults(int phys, int chem, int bio) {
    int total = phys + chem + bio;
    System.out.println(
        "Physics: "
            + phys
            + "\nChemistry: "
            + chem
            + "\nBiology: "
            + bio
            + "\nTotal mark: "
            + total);
  }

  private static void calcPercentage(int phys, int chem, int bio) {
    int p1 = (100 * (phys + chem + bio));
    double percent = (double) p1 / 450;
    System.out.println("Percent total mark: " + percent);
    int fails = 0;
    if (100 * (double) phys / 150 < 60) {
      fails++;
    }
    if (100 * (double) chem / 150 < 60) {
      fails++;
    }
    if (100 * (double) bio / 150 < 60) {
      fails++;
    }
    if (fails > 0) {
      System.out.println(fails + " module(s) failed");
    } else {
      System.out.println("All modules passed");
    }
  }
}
