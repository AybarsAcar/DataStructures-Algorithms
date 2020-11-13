package com.aybars;

/*
this hash table implementation will be backed by an array
this hash table is for our Employee class
 */
public class SimpleHashTable
{
  //  backing array
  private StoredEmployee[] hashtable;

  public SimpleHashTable()
  {
    hashtable = new StoredEmployee[10];
  }

  public void put(String key, Employee value)
  {
    int hashedKey = hashKey(key);

    if (isOccupied(hashedKey))
    {
//      do linear probing
      int stopIndex = hashedKey;
      if (hashedKey == hashtable.length - 1)
      {
//        to avoid out of bounds exception if its the end of the array
        hashedKey = 0;
      } else
      {
//        first probe position
        hashedKey++;
      }

      while (isOccupied(hashedKey) && hashedKey != stopIndex)
      {
//        next probe position at each iteration
        hashedKey = (hashedKey + 1) % hashtable.length;
      }
    }

    if (isOccupied(hashedKey))
    {
//      if we can find a position after checking the whole array
//      we get to this block if and only if the array is full
      System.out.println("There's already and employee at position " + hashedKey);
    } else
    {
//      assign the employee
      hashtable[hashedKey] = new StoredEmployee(key, value);
    }
  }

  public Employee get(String key)
  {
    int hashedKey = findKey(key);

    if (hashedKey == -1) return null;

    return hashtable[hashedKey].employee;
  }

  public Employee remove(String key)
  {
    int hashedKey = findKey(key);

    if (hashedKey == -1)
    {
      return null;
    }

    Employee employee = hashtable[hashedKey].employee;

    hashtable[hashedKey] = null;

//    rehashing
    StoredEmployee[] oldHashTable = hashtable;
    hashtable = new StoredEmployee[oldHashTable.length];

    for (StoredEmployee storedEmployee : oldHashTable)
    {
      if (storedEmployee != null)
      {
        put(storedEmployee.key, storedEmployee.employee);
      }
    }

    return employee;
  }

  public void printHashtable()
  {
    for (StoredEmployee value : hashtable)
    {
      if (value != null)
      {
        System.out.println(value.employee);
      } else
      {
        System.out.println("empty position");
      }
    }
  }

  private int findKey(String key)
  {
    int hashedKey = hashKey(key);

//    return the value if the raw key is the same in the hash table
    if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
    {
      return hashedKey;
    }


//      do linear probing
    int stopIndex = hashedKey;
    if (hashedKey == hashtable.length - 1)
    {
//        to avoid out of bounds exception if its the end of the array
      hashedKey = 0;
    } else
    {
//        first probe position
      hashedKey++;
    }

    while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key))
    {
//        next probe position at each iteration
      hashedKey = (hashedKey + 1) % hashtable.length;
    }

    if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
    {
      return hashedKey;
    }

    return -1;
  }

  /*
  hashing function
  hashed value needs to be always an integer
   */
  private int hashKey(String key)
  {
    return key.length() % hashtable.length;
  }

  /*
  check if the the position in the array is already occupied
   */
  private boolean isOccupied(int index)
  {
    return hashtable[index] != null;
  }
}
