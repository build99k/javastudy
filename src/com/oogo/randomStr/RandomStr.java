package com.oogo.randomStr;

import java.util.Random;

public class RandomStr {
  public static void main(String[] args) {
    Test_랜덤알파벳();
    Test_랜덤숫자앏파벳();
  }

  public static void Test_랜덤알파벳(){
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    String generatedString = random.ints(leftLimit, rightLimit + 1)
                                   .limit(targetStringLength)
                                   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                   .toString();
    System.out.println(generatedString);
  }

  public static void Test_랜덤숫자앏파벳() {
    int leftLimit = 48; // numeral '0'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    String generatedString = random.ints(leftLimit, rightLimit + 1)
                                   .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                                   .limit(targetStringLength)
                                   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                   .toString();
    System.out.println(generatedString);
  }
}
