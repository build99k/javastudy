package com.oogo.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class StreamTester2 {

  public static void main(String[] args) {
    //Test_Filter();
    //Test_Map();
    //Test01();
    //Test_limit();
    Test_sort();
  }

  public static void Test_Filter() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    //기본 출력
    list.stream()
        .forEach(System.out::print);
    System.out.println();
    list.stream()
        .filter(i -> i > 2)
        .forEach(System.out::print);
    System.out.println();
    list.stream()
        .distinct()
        .forEach(System.out::print);
  }

  public static void Test_Map() {
    List<Stock> list = new ArrayList<>();
    list.add(new Stock(77000, "삼성전자"));
    list.add(new Stock(100000, "하이닉스"));
    list.add(new Stock(110000, "카카오"));
    list.add(new Stock(400000, "네이버"));

    //객체에서 이름만 뽑아냄
    list.stream()
        .map(Stock::getName)
        .forEach(System.out::println);
  }

  public static void Test01() {
    List<List<Stock>> mainlist = new ArrayList<>();

    List<Stock> list = new ArrayList<>();
    list.add(new Stock(77000, "삼성전자"));
    list.add(new Stock(100000, "하이닉스"));

    List<Stock> list2 = new ArrayList<>();
    list2.add(new Stock(110000, "카카오"));
    list2.add(new Stock(400000, "네이버"));

    mainlist.add(list);
    mainlist.add(list2);

    mainlist.stream()
            .flatMap(Collection::stream)
            .map(Stock::getName)
            .forEach(System.out::println);
  }

  public static void Test_limit() {
    List<Stock> list = new ArrayList<>();
    list.add(new Stock(77000, "삼성전자"));
    list.add(new Stock(100000, "하이닉스"));
    list.add(new Stock(110000, "카카오"));
    list.add(new Stock(400000, "네이버"));

    list.stream()
        .skip(2)
        .map(Stock::getName)
        .forEach(System.out::println);

  }

  public static void Test_sort() {
    List<Stock> list = new ArrayList<>();
    list.add(new Stock(77000, "삼성전자"));
    list.add(new Stock(100000, "하이닉스"));
    list.add(new Stock(110000, "카카오"));
    list.add(new Stock(400000, "네이버"));

    System.out.println("가격 순으로 오름차순");
    list.stream()
        .sorted(Comparator.comparing(Stock::getPrice))
        .map(Stock::getName)
        .forEach(System.out::println);

    System.out.println("가격 순으로 내림차순");
    list.stream()
        .sorted(Comparator.comparing(Stock::getPrice, Comparator.reverseOrder()))
        .map(Stock::getName)
        .forEach(System.out::println);
  }
}
