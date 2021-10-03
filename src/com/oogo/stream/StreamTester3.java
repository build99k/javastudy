package com.oogo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTester3 {

  public static void main(String[] args) {
    List<Stock> list = new ArrayList<>();
    list.add(new Stock(1, 100000, "하이닉스"));
    list.add(new Stock(2, 400000, "네이버"));
    list.add(new Stock(2, 30000, "카카오뱅크"));
    list.add(new Stock(3, 110000, "카카오"));
    list.add(new Stock(4, 77000, "삼성전자"));

    //가격 순
    list.stream()
        .sorted(Comparator.comparing(Stock::getPrice))
        .map(Stock::getName)
        .forEach(System.out::println);
    System.out.println();

    //No 오름차순, 가격 오름차순
    list.stream()
        .sorted(Comparator.comparing(Stock::getNo)
                          .thenComparing(Stock::getPrice))
        .map(Stock::getName)
        .forEach(System.out::println);
    System.out.println();

    //No 오름차순, 가격 내림차순
    list.stream()
        .sorted(Comparator.comparing(Stock::getNo)
                          .thenComparing(Stock::getPrice,Comparator.reverseOrder()))
        .map(Stock::getName)
        .forEach(System.out::println);
  }
}
