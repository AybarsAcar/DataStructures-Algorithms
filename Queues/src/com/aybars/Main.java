package com.aybars;

public class Main
{

  public static void main(String[] args)
  {
    Employee aybars = new Employee("aybars", "acar", 1234);
    Employee kobe = new Employee("kobe", "bryant", 1235);
    Employee jordan = new Employee("michael", "jordan", 1334);
    Employee lebron = new Employee("lebron", "james", 1452);
    Employee wade = new Employee("dwyane", "wade", 9023);

    ArrayQueue queue = new ArrayQueue(10);

//    queue.peek();

    queue.enqueue(aybars);
    queue.enqueue(kobe);
    queue.enqueue(jordan);
    queue.enqueue(lebron);

    queue.printQueue();

    System.out.println("Dequeued: " + queue.dequeue());

    queue.enqueue(wade);

    queue.printQueue();

    System.out.println("First in queue: " + queue.peek());
  }
}
