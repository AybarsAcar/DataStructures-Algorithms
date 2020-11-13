package com.aybars.DoublyLinkedList;

import com.aybars.Employee;

public class EmployeeDoublyLinkedList
{
  private EmployeeNodeDLL head;
  private EmployeeNodeDLL tail;
  private int size = 0;

  public int getSize()
  {
    return size;
  }

  public void addToFront(Employee employee)
  {
    EmployeeNodeDLL node = new EmployeeNodeDLL(employee);

//    check if we are adding to an empty list - if so initailise it as tail as well
    if (head == null)
    {
      tail = node;
    } else
    {
      head.setPrevious(node);
      node.setNext(head);
    }

    head = node;

    size++;
  }

  public void addToEnd(Employee employee)
  {
    EmployeeNodeDLL node = new EmployeeNodeDLL(employee);

//    test whether the list is empty or not
    if (tail == null)
    {
      head = node;
    } else
    {
      tail.setNext(node);
      node.setPrevious(tail);
    }

    tail = node;

    size++;
  }

  public EmployeeNodeDLL removeFromFront()
  {
    if (isEmpty()) return null;

    EmployeeNodeDLL nodeToRemove = head;

//    check if we are removing the only node from the list
    if (head.getNext() == null)
    {
      tail = null;
    } else
    {
      head.getNext().setPrevious(null);
    }

    head = head.getNext();

    nodeToRemove.setNext(null);

    size--;

    return nodeToRemove;
  }

  public EmployeeNodeDLL removeFromEnd()
  {
    if (isEmpty()) return null;

    EmployeeNodeDLL nodeToRemove = tail;

    if (tail.getPrevious() == null)
    {
      head = null;
    } else
    {
      tail.getPrevious().setNext(null);
    }

    tail = tail.getPrevious();

    nodeToRemove.setPrevious(null);

    size--;

    return nodeToRemove;
  }

  public boolean isEmpty()
  {
    return head == null;
  }

  public void printList()
  {
    EmployeeNodeDLL current = head;
    System.out.println("HEAD -> ");

    while (current != null)
    {
      System.out.println(current);
      System.out.println(" <=> ");
      current = current.getNext();
    }
    System.out.println("null");
  }

  public EmployeeNodeDLL getHead()
  {
    return head;
  }

  public EmployeeNodeDLL getTail()
  {
    return tail;
  }


  /*
  addBefore() method
  2 employees
    - first one is the new employee
    - second one is the one we want to insert before
   */
  public boolean addBefore(Employee newEmployee, Employee existingEmployee)
  {
    if (head == null) return false;

    EmployeeNodeDLL current = head;
    while (current != null && !current.getEmployee().equals(existingEmployee))
    {
      current = current.getNext();
    }

    if (current == null) return false;

//    now we have the existing employee in the list
    EmployeeNodeDLL newNode = new EmployeeNodeDLL(newEmployee);

    newNode.setNext(current);
    newNode.setPrevious(current.getPrevious());

    current.setPrevious(newNode);

    if (head == current)
    {
      head = newNode;
    } else
    {
      newNode.getPrevious().setNext(newNode);
    }

    size++;

    return true;
  }
}
