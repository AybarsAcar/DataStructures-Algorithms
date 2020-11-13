package com.aybars;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main3
{
  public static void main(String[] args)
  {
    Employee john = new Employee("john", "doe", 1232);
    Employee jane = new Employee("jane", "jones", 1234);
    Employee michael = new Employee("michael", "jordan", 2323);
    Employee kobe = new Employee("kobe", "bryant", 2408);
    Employee bill = new Employee("bill", "clinton", 2410);

    Map<String, Employee> ht = new HashMap<>()
    {{
      put("Doe", john);
    }};

    ht.put("Jones", jane);
    ht.put("Jordan", michael);
    ht.put("Bryant", kobe);
    ht.put("Clinton", bill);

//    Iterator<Employee> iterator = ht.values().iterator();
//    while (iterator.hasNext())
//    {
//      System.out.println(iterator.next());
//    }

//    for (Employee employee : ht.values())
//    {
//      System.out.println(employee);
//    }

    ht.values().forEach(System.out::println);

//    ht.forEach((k, v) -> System.out.println(v));

    System.out.println("-----------------");
    System.out.println(ht.containsKey("Doe"));
    System.out.println(ht.containsValue(jane));

    System.out.println(ht.get("Doe"));
    System.out.println(ht.getOrDefault("Dhahahoe", michael));

  }
}
