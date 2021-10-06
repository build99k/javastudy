package com.oogo.algo.leetcode;

public class Longest_Palindromic_Substring {

  public static void main(String[] args) {
    String str = longestPalindrome("abcdef");
    System.out.println(str);
    //System.out.println("babad".substring(2, 4));
    //System.out.println(longestPalindrome("babad"));
  }

  public static String longestPalindrome(String s) {
    String maxStr = "";
    for (int i = 0; i < s.length(); i++) {
      String str1 = checkPalind(s, i, i);
      String str2 = checkPalind(s, i, i + 1);

      if (str1.length() > maxStr.length() && str1.length() >= str2.length()) {
        maxStr = str1;
      }
      if (str2.length() > maxStr.length() && str1.length() < str2.length()) {
        maxStr = str2;
      }
    }
    return maxStr;
  }

  public static String checkPalind(String s, int left, int right) {
    while (left >= 0 && right < s.length()) {
      if (s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
      } else {
        break;
      }
    }
    left++;
    right--;
    return s.substring(left, right + 1);
  }
}
