package com.qa.javaexamples;

import java.util.stream.*;

public class Strings {
  public static void main(String[] args) {
    String s1 = "TODAY IT IS SUNNY";
    String s2 = "YESTERDAY IT WAS RAINING";
    System.out.println(s1 + ", " + s2);
    System.out.println(s1.substring(0, 12) + s2.substring(17));
    System.out.println(lambdaWordCount(s1));
    // System.out.println(lambdaNewlineWord(s1));
    System.out.println(newlineWordRev(s2));
    System.out.println(manContains(s2, "WA"));
  }

  private static int wordCount(String s) {
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (s.substring(i, i + 1).equals(" ")) {
        count++;
      }
    }
    return count;
  }

  private static String newlineWord(String s) {
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.substring(i, i + 1).equals(" ")) {
        res += "\n";
      } else {
        res += s.substring(i, i + 1);
      }
    }
    return res;
  }

  private static String newlineWordRev(String s) {
    String res = "";
    String window = "";
    for (int i = s.length(); i > 0; i--) {
      if (s.substring(i - 1, i).equals(" ")) {
        res = window + res;
        window = "\n";
      } else {
        window = s.substring(i - 1, i) + window;
      }
    }
    res = window + res;
    return res;
  }

  private static boolean manContains(String s1, String s2) {
    String window = s2;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.substring(i, i + 1).equals(window.substring(0, 1))) {
        window = window.substring(1);
        if (window.equals("")) {
          return true;
        }
      } else {
        window = s2;
      }
    }
    return false;
  }

  public static int lambdaWordCount(String s) {
    return s.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> c == ' ')
            .collect(Collectors.counting())
            .intValue()
        + 1;
  }
}
