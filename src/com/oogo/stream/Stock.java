package com.oogo.stream;

public class Stock {

  int no;
  int price;
  String name;

  Stock(int price, String name) {
    this.price = price;
    this.name = name;
  }

  Stock(int no, int price, String name) {
    this.no = no;
    this.price = price;
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
