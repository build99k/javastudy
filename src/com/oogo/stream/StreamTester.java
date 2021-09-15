package com.oogo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTester {

  public static void main(String[] args) {

    //데이터 초기화
    List<String> strings = new ArrayList(){{
      add("A");
      add("B");
      add("C");
      add("d");
    }};
    strings.stream().forEach(System.out::println);

    Stream<String> strStream = strings.stream();
    strStream.forEach(System.out::println);
    //아래 구문은 오류 발생
    //strStream.forEach(System.out::println);

    //Test01();
    //Test02();
    Test03();
  }

  //기본형 배열 스트림 변환
  public static void Test01(){
    String[] abc = {"a","b","c"};
    Stream<String> stream = Arrays.stream(abc);
    stream.forEach(System.out::println);
  }

  //기본형 스트림
  public static void Test02(){
    System.out.println("IntStream 출력");
    IntStream intStream1 = IntStream.range(1, 5); //[1,2,3,4] 5를 포함하지 않음
    IntStream intStream2 = IntStream.rangeClosed(1, 5); //[1,2,3,4,5] 5를 포함
    IntStream intStream3 = new Random().ints(); //무한 스트림 생성( 무한으로 임의의 숫자가 생성됨)
    intStream3.limit(5).forEach(System.out::println); //무한 스트림을 출력할때는 limit으로 사이즈 제한을 해줘야함.

    //Long type도 가능함.
    System.out.println("LongStream 출력");
    LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
    longStream.forEach(System.out::println);
  }

  //iterate , generate
  public static void Test03(){
    Stream<Integer> stream = Stream.iterate(0,n->n+4);
    //stream.forEach(System.out::println); //무한 스트림 발생 ( 출력하면 무한히 계속 실행됨)
    stream.limit(5).forEach(System.out::println); //limit 으로 제한 [0,4,8,12,16]

    Stream<Integer> gen = Stream.generate(()-> 10);
    gen.limit(5).forEach(System.out::println);//[10,10,10,10,10]
  }
}
