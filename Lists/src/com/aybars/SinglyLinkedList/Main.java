package com.aybars.SinglyLinkedList;

import com.aybars.Employee;

public class Main
{
  public static void main(String[] args)
  {

    Employee aybars = new Employee("Aybars", "Acar", 1);
    Employee zuhre = new Employee("Zuhre", "Acar", 2);
    Employee isil = new Employee("Isil", "Acar", 3);
    Employee murat = new Employee("Murat", "Acar", 4);

    EmployeeLinkedList list = new EmployeeLinkedList();

    System.out.println(list.getSize());
    System.out.println(list.isEmpty());

    list.addToFront(aybars);
    list.addToFront(zuhre);
    list.addToFront(isil);
    list.addToFront(murat);

    System.out.println(list.getSize());

    list.removeFromFront();

    list.printList();

    System.out.println(list.getSize());

    list.addToFront(new Employee("Shuang", "Zhao", 5));
    list.printList();
  }
}
