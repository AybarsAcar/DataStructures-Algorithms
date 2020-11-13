package com.aybars;

/*
my Binary Search Tree
that stores nodes that hold int as data
in this implementation duplicate values are not allowed
 */
public class Tree
{
  private TreeNode root;

  public void insert(int value)
  {
    if (root == null)
    {
      root = new TreeNode(value);
    } else
    {
      root.insert(value);
    }
  }

  public void traverseInOrder()
  {
    if (root != null)
    {
      root.traverseInOrder();
    }
  }

  public void traversePreOrder()
  {
    if (root != null)
    {
      root.traversePreOrder();
    }
  }

  public void traversePostOrder()
  {
    if (root != null)
    {
      root.traversePostOrder();
    }
  }

  public TreeNode get(int value)
  {
    if (root != null) return root.get(value);

    return null;
  }

  public int min()
  {
    if (root == null) return Integer.MIN_VALUE;

    return root.min();
  }

  public int max()
  {
    if (root == null) return Integer.MAX_VALUE;

    return root.max();
  }

  public void delete(int value)
  {
    root = delete(root, value);
  }

  /*
  returns the replacement node
   */
  private TreeNode delete(TreeNode subtreeRoot, int value)
  {
    if (subtreeRoot == null)
    {
      return subtreeRoot;
    }

    if (value < subtreeRoot.getData())
    {
      subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
    }
    else if (value > subtreeRoot.getData())
    {
      subtreeRoot.setRighChild(delete(subtreeRoot.getRighChild(), value));
    }
    else
    {
//      we have found the node we want to delete
      if (subtreeRoot.getLeftChild() == null)
      {
//        if it has a right child it will be it if not it will be null so works for both cases
//        Case 1 & 2: node to delete has 0 or 1 child
        return subtreeRoot.getRighChild();
      }

      if (subtreeRoot.getRighChild() == null)
      {
//        if it has a left child it will be it if not it will be null so works for both cases
//        Case 1 & 2: node to delete has 0 or 1 child
        return subtreeRoot.getLeftChild();
      }

//      Case 3: node to delete has 2 children
//      replace the value in the subtreeRoot node with the smallest value from the right subtree
      subtreeRoot.setData(subtreeRoot.getRighChild().min());
//      delete the node that has the smallest value in the right subtree
      subtreeRoot.setRighChild(delete(subtreeRoot.getRighChild(), subtreeRoot.getData()));
    }

    return subtreeRoot;
  }

}
