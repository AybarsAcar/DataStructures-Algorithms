package com.aybars.DoublyLinkedList;

import com.aybars.Employee;
import com.aybars.SinglyLinkedList.EmployeeNode;

public class EmployeeNodeDLL
{
  private Employee employee;
  private EmployeeNodeDLL next;
  private EmployeeNodeDLL previous;

  public EmployeeNodeDLL(Employee employee)
  {
    this.employee = employee;
  }

  public Employee getEmployee()
  {
    return employee;
  }

  public void setEmployee(Employee employee)
  {
    this.employee = employee;
  }

  public EmployeeNodeDLL getNext()
  {
    return next;
  }

  public void setNext(EmployeeNodeDLL next)
  {
    this.next = next;
  }

  public EmployeeNodeDLL getPrevious()
  {
    return previous;
  }

  public void setPrevious(EmployeeNodeDLL previous)
  {
    this.previous = previous;
  }

  @Override
  public String toString()
  {
    return employee.toString();
  }
}
