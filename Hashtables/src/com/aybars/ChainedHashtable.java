package com.aybars;

import java.util.LinkedList;
import java.util.ListIterator;

/*
backed by an array
each array position consists of a Linked List
StoredEmployee will be stored in the linked list as the node
 */
public class ChainedHashtable
{
  private LinkedList<StoredEmployee>[] hashtable;

  public ChainedHashtable()
  {
    hashtable = new LinkedList[10];
//    initialise each array position wiht an empty linked list

    for (int i = 0; i < hashtable.length; i++)
    {
      hashtable[i] = new LinkedList<>();
    }
  }

  public void put(String key, Employee value)
  {
    int hashedKey = hashKey(key);

    hashtable[hashedKey].add(new StoredEmployee(key, value));
  }

  public Employee get(String key)
  {
    int hashedKey = hashKey(key);

    for (StoredEmployee employee : hashtable[hashedKey])
    {
      if (employee.key.equals(key))
      {
        return employee.employee;
      }
    }

    return null;
  }

  public Employee remove(String key)
  {
    int hashedKey = hashKey(key);

    for (StoredEmployee employee : hashtable[hashedKey])
    {
      if (employee.key.equals(key))
      {
        hashtable[hashedKey].remove(employee);
        return employee.employee;
      }
    }

    return null;
  }

  public void printHashtable()
  {
    for (int i = 0; i < hashtable.length; i++)
    {
      if (hashtable[i].isEmpty())
      {
        System.out.println("empty position at " + i);
      } else
      {
        System.out.println("Position " + i + ": ");
        for (StoredEmployee storedEmployee : hashtable[i])
        {
          System.out.println(storedEmployee.employee);
          System.out.println("->");
        }
        System.out.println("null");
      }
    }
  }

  private int hashKey(String key)
  {
//    return key.length() % hashtable.length;

    return Math.abs(key.hashCode()) % hashtable.length;
  }
}
