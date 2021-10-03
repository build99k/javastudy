package com.oogo.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTester {
  public static void main(String[] args) {
    test1();
    test2();
  }

  public static void test1(){
    System.out.println("HashMap->");
    Map<String,Integer> map = new HashMap<>();
    map.put("삼성전자",1);
    map.put("카카오",2);
    map.put("테스트",3);
    map.keySet().stream().forEach(System.out::println);
  }

  public static void test2(){
    System.out.println("LinkedHashMap->");
    Map<String,Integer> map = new LinkedHashMap<>();
    map.put("삼성전자",1);
    map.put("카카오",2);
    map.put("테스트",3);
    map.keySet().stream().forEach(System.out::println);
  }
}
