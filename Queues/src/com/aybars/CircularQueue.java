package com.aybars;

import java.util.NoSuchElementException;

/*
this is an optimisation
so we dont need to resize the array if the aggregate length of the queue is not increasing
it is an optimisation on the ArrayQueue implementation
 */
public class CircularQueue
{
  private Employee[] queue;
  private int front;
  private int back;

  public CircularQueue(int capacity)
  {
    queue = new Employee[capacity];
  }

  public void enqueue(Employee employee)
  {
    if (size() == queue.length - 1)
    {
      int numItems = size();

//      queue is full so change the size of the array
      Employee[] newArray = new Employee[2 * queue.length];

//      when resizing unwrap the queue
//      copying from front pointer to the end of the array
      System.arraycopy(queue, front, newArray, 0, queue.length - front);
//      copying from the beginning of the array up to back pointer
      System.arraycopy(queue, 0, newArray, queue.length - front, back);

      queue = newArray;

//      re-setting the front and back
      front = 0;
      back = numItems;
    }

//    add the new employee to the currently available position -- which the back pointer points at
    queue[back] = employee;

    if (back < queue.length - 1)
    {
      back++;
    } else
    {
//      wrap it
      back = 0;
    }
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
    } else if (front == queue.length)
    {
//      wrap front to the beginning of the backing array
      front = 0;
    }

    return employee;
  }

  public int size()
  {
    //    check if the queue has been wrapped
    if (front <= back)
    {
//      the queue hasn't wrapper
      return back - front;
    } else
    {
//      the queue has wrapped
      return back - front + queue.length;
    }
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
    //    check if the queue has been wrapped
    if (front <= back)
    {
      for (int i = front; i < back; i++)
      {
        System.out.println(queue[i]);
      }
    } else
    {
//      the queue is wrapped
      for (int i = front; i < queue.length; i++)
      {
        System.out.println(queue[i]);
      }
      for (int i = 0; i < back; i++)
      {
        System.out.println(queue[i]);
      }
    }

  }
}
