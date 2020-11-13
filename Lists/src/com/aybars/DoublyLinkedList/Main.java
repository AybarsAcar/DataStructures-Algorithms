package com.aybars.DoublyLinkedList;

import com.aybars.Employee;

public class Main
{
  public static void main(String[] args)
  {
    Employee aybars = new Employee("Aybars", "Acar", 1);
    Employee zuhre = new Employee("Zuhre", "Acar", 2);
    Employee isil = new Employee("Isil", "Acar", 3);
    Employee murat = new Employee("Murat", "Acar", 4);
    Employee kazim = new Employee("Kazim", "Sozgec", 4);

    EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList()
    {{
      addToFront(aybars);
      addToFront(zuhre);
      addToFront(isil);
      addToFront(murat);
    }};

    list.printList();
    System.out.println(list.getSize());

    list.addToEnd(new Employee("Shuang", "Zhao", 1));
    list.printList();
    System.out.println(list.getSize());

    list.removeFromFront();
    list.printList();
    System.out.println(list.getSize());

    System.out.println(list.addBefore(kazim, aybars));
    list.printList();

    System.out.println(list.addBefore(kazim, new Employee("hello", "hello", 2)));

  }
}
