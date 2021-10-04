package com.oogo.algo;

import java.util.Stack;

public class StackToQueue {

  public static void main(String[] args) {

    Queue<Integer> queue = new Queue<>();
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    System.out.println(queue.deQueue());
    queue.enQueue(4);
    System.out.println(queue.deQueue());
    queue.enQueue(5);
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
  }
}

class Queue<T>{
  Stack<T> inner = new Stack<>();
  Stack<T> outer = new Stack<>();

  public void enQueue(T data){
    inner.add(data);
  }

  public T deQueue(){
    if(outer.isEmpty()){
      while(!inner.isEmpty()){
        outer.push(inner.pop());
      }
    }
    return outer.pop();
  }
}
