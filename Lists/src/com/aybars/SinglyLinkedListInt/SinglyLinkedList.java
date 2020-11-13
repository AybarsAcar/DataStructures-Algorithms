package com.aybars.SinglyLinkedListInt;



public class SinglyLinkedList
{
  private NodeInteger head;
  private int size;

  public void insertSorted(int numberToAdd)
  {
    if (head == null || head.getNumber() >= numberToAdd)
    {
      addToFront(numberToAdd);
      return;
    }

//    find insertion point
    NodeInteger current = head.getNext();
    NodeInteger previous = head;
    while (current != null && current.getNumber() < numberToAdd)
    {
      previous = current;
      current = current.getNext();
    }

    NodeInteger newNode = new NodeInteger(numberToAdd);
    newNode.setNext(current);
    previous.setNext(newNode);

    size++;
  }

  public boolean isEmpty()
  {
    return head == null;
  }

  public void printList()
  {
    NodeInteger current = head;
    System.out.println("HEAD -> ");
    while (current != null)
    {
      System.out.println(current.getNumber());
      System.out.println(" -> ");
      current = current.getNext();
    }
    System.out.println("null");
  }

  private void addToFront(int value)
  {
    NodeInteger node = new NodeInteger(value);

    node.setNext(head);

    head = node;

    size++;
  }

}
