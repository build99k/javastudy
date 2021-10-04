package com.oogo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMin {

  public static void main(String[] args) {

    Integer[] arr = {1, 2, 3, 4, 5};
    List<Integer> list = Arrays.asList(arr);

    Integer max = list.stream()
                      .mapToInt(x -> x)
                      .max()
                      .getAsInt();

    Integer min = list.stream()
                      .mapToInt(x -> x)
                      .min()
                      .getAsInt();

    System.out.println("max : " + max);
    System.out.println("min : " + min);
  }


  public static void test1() {
    //타입이 int일경우
    int[] arr = {1, 2, 3, 4, 5};
    int max = Arrays.stream(arr)
                    .max()
                    .getAsInt();
    int min = Arrays.stream(arr)
                    .min()
                    .getAsInt();

    System.out.println("max : " + max);
    System.out.println("min : " + min);
  }
}
