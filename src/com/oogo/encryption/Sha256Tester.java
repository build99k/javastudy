package com.oogo.encryption;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256Tester {

  public static void main(String[] args) throws NoSuchAlgorithmException {
    //sha256 테스트
    String sha256Result = Sha256("test");
    //출력
    System.out.println(sha256Result);
  }

  public static String Sha256(String originalString) throws NoSuchAlgorithmException {
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
    return bytesToHex(encodedhash);
  }

  public static String bytesToHex(byte[] hash) {
    StringBuilder hexString = new StringBuilder(2 * hash.length);
    for (int i = 0; i < hash.length; i++) {
      String hex = Integer.toHexString(0xff & hash[i]);
      if (hex.length() == 1) {
        hexString.append('0');
      }
      hexString.append(hex);
    }
    return hexString.toString();
  }
}
