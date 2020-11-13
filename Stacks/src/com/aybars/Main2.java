package com.aybars;

public class Main2
{
  public static void main(String[] args)
  {
    LinkedStack stack = new LinkedStack();

    stack.push(new Employee("jane", "jones", 1234));
    stack.push(new Employee("john", "doe", 1232));
    stack.push(new Employee("michael", "jordan", 2323));
    stack.push(new Employee("kobe", "bryant", 2408));
    stack.push(new Employee("bill", "clinton", 2410));

    System.out.println(stack.peek());
    stack.printStack();
  }
}
