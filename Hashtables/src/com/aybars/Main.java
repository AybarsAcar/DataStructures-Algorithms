package com.aybars;

public class Main
{

  public static void main(String[] args)
  {
    Employee john = new Employee("john", "doe", 1232);
    Employee jane = new Employee("jane", "jones", 1234);
    Employee michael = new Employee("michael", "jordan", 2323);
    Employee kobe = new Employee("kobe", "bryant", 2408);
    Employee bill = new Employee("bill", "clinton", 2410);

    SimpleHashTable ht = new SimpleHashTable();

    ht.put("Doe", john);
    ht.put("Jones", jane);
    ht.put("Jordan", michael);
    ht.put("Bryant", kobe);
    ht.put("Clinton", bill);

    ht.printHashtable();

    ht.remove("Clinton");

    System.out.println("-----------------");
    ht.printHashtable();

    System.out.println("Retrieved Value: " + ht.get("Bryant"));
  }
}
