package com.aybars;

import java.util.ArrayList;
import java.util.List;

public class Main
{

  public static void main(String[] args)
  {
    // ArrayLists
    List<Employee> employees = new ArrayList<>()
    {{
      add(new Employee("Aybars", "Acar", 1));
      add(new Employee("Zuhre", "Acar", 2));
      add(new Employee("Isil", "Acar", 3));
      add(new Employee("Murat", "Acar", 4));
    }};

    employees.forEach(System.out::println);

    System.out.println("second employee is " + employees.get(1));

    System.out.println("is the List empty? " + employees.isEmpty());

    employees.set(2, new Employee("Isil", "Sozgec", 3));
    employees.forEach(System.out::println);

    System.out.println("size of the list is " + employees.size());

    employees.add(1, new Employee("Shuang", "Zhao", 5));
    employees.forEach(System.out::println);

//    create an array with the same size of the list
    Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);

    for (Employee employee : employeeArray)
    {
      System.out.println(employee);
    }

    System.out.println(employees.contains(new Employee("sdbgjla", "langl", 4109)));
  }
}
