package com.aybars;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedListMain
{
  public static void main(String[] args)
  {
    Employee aybars = new Employee("Aybars", "Acar", 1);
    Employee zuhre = new Employee("Zuhre", "Acar", 2);
    Employee isil = new Employee("Isil", "Acar", 3);
    Employee murat = new Employee("Murat", "Acar", 4);

    LinkedList<Employee> employees = new LinkedList<>();

    employees.addFirst(aybars);
    employees.addFirst(zuhre);
    employees.addFirst(isil);
    employees.addFirst(murat);

//    Iterator iter = employees.iterator();
//
//    while (iter.hasNext())
//    {
//      System.out.println(iter.next());
//    }

    for (Employee employee : employees)
    {
      System.out.println(employee);
    }

    System.out.println("----------------------");

    employees.addLast(new Employee("Shuang", "Zhao", 1));

    for (Employee employee : employees)
    {
      System.out.println(employee);
    }
  }
}
