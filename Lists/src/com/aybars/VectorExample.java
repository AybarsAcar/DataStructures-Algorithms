package com.aybars;

import java.util.List;
import java.util.Vector;

public class VectorExample
{
  public static void main(String[] args)
  {
    List<Employee> employees = new Vector<>()
    {{
      add(new Employee("Aybars", "Acar", 1));
      add(new Employee("Zuhre", "Acar", 2));
      add(new Employee("Isil", "Acar", 3));
      add(new Employee("Murat", "Acar", 4));
    }};
  }
}
