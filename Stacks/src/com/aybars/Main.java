package com.aybars;

public class Main
{

  public static void main(String[] args)
  {
    ArrayStack stack = new ArrayStack(10);

    stack.push(new Employee("jane", "jones", 1234));
    stack.push(new Employee("john", "doe", 1232));
    stack.push(new Employee("michael", "jordan", 2323));
    stack.push(new Employee("kobe", "bryant", 2408));
    stack.push(new Employee("bill", "clinton", 2410));

    stack.printStack();

    System.out.println("---------------");

    System.out.println("Peak: " + stack.peak());
    System.out.println("Size: " + stack.size());

    System.out.println("Popped: " + stack.pop());
    System.out.println("Peak: " + stack.peak());
    System.out.println("Size: " + stack.size());

    System.out.println("---------------");
    stack.printStack();
  }
}
