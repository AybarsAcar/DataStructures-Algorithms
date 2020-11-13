package com.aybars;


/*
node for the Binary Search Tree
which stores integer values at each node
 */
public class TreeNode
{
  private int data;
  private TreeNode leftChild;
  private TreeNode righChild;

  public TreeNode(int data)
  {
    this.data = data;
  }

  public TreeNode get(int value)
  {
    if (value == data) return this;

    if (value < data)
    {
      if (leftChild != null)
      {
        return leftChild.get(value);
      }
    } else
    {
      if (righChild != null)
      {
        return righChild.get(value);
      }
    }

    return null;
  }

  public int min()
  {
    if (leftChild == null)
    {
      return data;
    }

    return leftChild.min();
  }

  public int max()
  {
    if (righChild == null)
    {
      return data;
    }

    return righChild.max();
  }

  public void insert(int value)
  {
//    duplicate values are not allowed
    if (value == data) return;

    if (value < data)
    {
      if (leftChild == null)
      {
        leftChild = new TreeNode(value);
      } else
      {
        leftChild.insert(value);
      }
    } else
    {
//      value > data
      if (righChild == null)
      {
        righChild = new TreeNode(value);
      } else
      {
        righChild.insert(value);
      }
    }

  }

  public void traverseInOrder()
  {
    if (leftChild != null)
    {
      leftChild.traverseInOrder();
    }
    System.out.println("Data = " + data + ", ");

    if (righChild != null)
    {
      righChild.traverseInOrder();
    }
  }


  /*
   * root first
   * then visit the left subtree then the right subtree
   * for each subtree we visit the node as well
   * only change is where we visit the node -- rest is the same
   * */
  public void traversePreOrder()
  {
    System.out.println("Data = " + data + ", ");

    if (leftChild != null)
    {
      leftChild.traverseInOrder();
    }

    if (righChild != null)
    {
      righChild.traverseInOrder();
    }
  }

  public void traversePostOrder()
  {
    if (leftChild != null)
    {
      leftChild.traverseInOrder();
    }

    if (righChild != null)
    {
      righChild.traverseInOrder();
    }

    System.out.println("Data = " + data + ", ");
  }

  public int getData()
  {
    return data;
  }

  public void setData(int data)
  {
    this.data = data;
  }

  public TreeNode getLeftChild()
  {
    return leftChild;
  }

  public void setLeftChild(TreeNode leftChild)
  {
    this.leftChild = leftChild;
  }

  public TreeNode getRighChild()
  {
    return righChild;
  }

  public void setRighChild(TreeNode righChild)
  {
    this.righChild = righChild;
  }

  @Override
  public String toString()
  {
    return "Data = " + data;
  }
}
