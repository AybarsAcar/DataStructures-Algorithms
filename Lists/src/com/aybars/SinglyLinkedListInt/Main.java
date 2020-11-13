package com.aybars.SinglyLinkedListInt;

public class Main
{
  public static void main(String[] args)
  {
    SinglyLinkedList list = new SinglyLinkedList();

    list.insertSorted(1);
    list.printList();

    list.insertSorted(5);
    list.printList();

    list.insertSorted(3);
    list.printList();
  }
}
