package com.oogo.uuid;

import java.util.UUID;

public class UudiTeser {

  public static void main(String[] args) {
    UUID first = UUID.randomUUID();
    UUID second = UUID.randomUUID();

    System.out.println("UUID first: " + first.toString());
    System.out.println("UUID second: " + second.toString());
  }
}
