package com.oogo.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTester {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(1);
    set.add(1);
    set.add(1);
    //set.forEach(System.out::println);

    test1();
  }

  public static void test(){
    Set<String> set = new HashSet<>();
    set.add("삼성전자");
    set.add("카카오");
    set.add("네이버");
    set.forEach(System.out::println);
  }

  public static void test1(){
    //리스트를 Set으로
    String[] arr = {"삼성전자","카카오","네이버"};
    Set<String> set = new HashSet<>(Arrays.asList(arr));
    set.forEach(System.out::println);

    //Set을 리스트로
    List<String> list = new ArrayList<>(set);
    list.stream().forEach(System.out::println);
  }
}
