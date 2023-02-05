package com.example.LinkedList;

public class Main {

  public static void main(String[] args) {

    LinkedListRealization<String> linkedListRealization=new LinkedListRealization<>();

    //call method addLast
    linkedListRealization.addLast("B");
    linkedListRealization.addLast("C");
    linkedListRealization.addLast("D");
    linkedListRealization.addLast("E");

    System.out.println("List1-> :  "+linkedListRealization);


    //call method addFirst
    linkedListRealization.addFirst("A");

    System.out.println("List2-> :  "+linkedListRealization);


    //call method get

    System.out.println("Index of element  with value C ->  "+linkedListRealization.get("C"));
    System.out.println("Index of element  with value XXX ->  "+linkedListRealization.get("XXX"));

    //call method remove

    linkedListRealization.remove("D");
    System.out.println("List3 -> : " +linkedListRealization);

  }

}
