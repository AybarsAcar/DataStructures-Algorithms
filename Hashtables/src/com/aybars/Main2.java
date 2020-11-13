package com.aybars;

public class Main2
{
  public static void main(String[] args)
  {
    Employee john = new Employee("john", "doe", 1232);
    Employee jane = new Employee("jane", "jones", 1234);
    Employee michael = new Employee("michael", "jordan", 2323);
    Employee kobe = new Employee("kobe", "bryant", 2408);
    Employee bill = new Employee("bill", "clinton", 2410);

    ChainedHashtable ht = new ChainedHashtable();

    ht.put("Doe", john);
    ht.put("Jones", jane);
    ht.put("Jordan", michael);
    ht.put("Bryant", kobe);
    ht.put("Clinton", bill);

//    System.out.println(ht.remove("Doe"));
//    ht.remove("Jordan");

    ht.printHashtable();

//    System.out.println(ht.get("Doe"));
  }
}
