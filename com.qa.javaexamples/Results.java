package com.qa.javaexamples;

public class Results {
  public static void main(String[] args) {
    int phys = 97;
    int chem = 43;
    int bio = 98;
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
  }
}
