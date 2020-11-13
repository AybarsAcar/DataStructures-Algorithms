package com.aybars;

import java.util.NoSuchElementException;

public class ArrayQueue
{
  private Employee[] queue;
  private int front;
  private int back;

  public ArrayQueue(int capacity)
  {
    queue = new Employee[capacity];
  }

  public void enqueue(Employee employee)
  {
    if (back == queue.length)
    {
//      queue is full so change the size of the array
      Employee[] newArray = new Employee[2 * queue.length];
      System.arraycopy(queue, 0, newArray, 0, queue.length);
      queue = newArray;
    }

    queue[back] = employee;
    back++;
  }

  public Employee dequeue()
  {
    if (front == back)
    {
//      queue is empty
      throw new NoSuchElementException();
    }

    Employee employee = queue[front];
    queue[front] = null;
    front++;

//    simple optimisation
    if (size() == 0)
    {
      front = 0;
      back = 0;
    }

    return employee;
  }

  public int size()
  {
    return back - front;
  }

  public Employee peek()
  {
    if (size() == 0)
    {
//      queue is empty
      throw new NoSuchElementException();
    }

    return queue[front];
  }

  public void printQueue()
  {
    for (int i = front; i < back; i++)
    {
      System.out.println(queue[i]);
    }
  }
}
