package com.aybars.SinglyLinkedListInt;

public class NodeInteger
{
  private final int number;
  private NodeInteger next;

  public NodeInteger(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public NodeInteger getNext()
  {
    return next;
  }

  public void setNext(NodeInteger next)
  {
    this.next = next;
  }
}
