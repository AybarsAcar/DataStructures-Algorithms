package com.aybars;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
stack implementation for the Employee
backed by a linked list
only expose push, pop, and peak methods
the reason is that we want a class that behaves as a Stack
 */
public class LinkedStack
{
  private LinkedList<Employee> stack;

  public LinkedStack()
  {
    stack = new LinkedList<>();
  }

  public void push(Employee employee)
  {
    stack.push(employee);
  }

  public Employee pop()
  {
    return stack.pop();
  }

  public Employee peek()
  {
    return stack.peek();
  }

  public boolean isEmpty()
  {
    return stack.isEmpty();
  }

  public void printStack()
  {
    for (Employee employee : stack)
    {
      System.out.println(employee);
    }
  }

}
