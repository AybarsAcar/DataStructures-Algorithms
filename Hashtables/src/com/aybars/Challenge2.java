package com.aybars;

import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.LinkedList;

/*
remove duplicate items from a linked list
use JDK linked list class
use JDK HashMap
if two employees have the same id they are the same so remove
 */
public class Challenge2
{
  public static void main(String[] args)
  {
    LinkedList<Employee> employees = new LinkedList<>()
    {{
      add(new Employee("Jane", "Jones", 123));
      add(new Employee("John", "Doe", 5678));
      add(new Employee("Mike", "Wilson", 45));
      add(new Employee("Mary", "Smith", 5555));
      add(new Employee("John", "Doe", 5678));
      add(new Employee("Bill", "End", 3948));
      add(new Employee("Jane", "Jones", 123));
    }};

    employees.forEach(System.out::println);
    System.out.println("------------------");

    removeDuplicates(employees);

    employees.forEach(System.out::println);
  }

  public static void removeDuplicates(LinkedList<Employee> input)
  {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    LinkedList<Employee> newEmployees = new LinkedList<>();

    for (Employee employee : input)
    {
      if (!countMap.containsKey(employee.getId()))
      {
        countMap.put(employee.getId(), 1);
        newEmployees.add(employee);
      }
    }

    input.clear();
    input.addAll(newEmployees);
  }
}
