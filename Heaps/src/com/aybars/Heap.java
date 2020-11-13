package com.aybars;

/*
 * this is an implementation of a Max Heap
 * */
public class Heap
{
  //  backing array
  private int[] heap;
  private int size;

  public Heap(int capacity)
  {
    heap = new int[capacity];
  }

  public void insert(int value)
  {
    if (isFull())
    {
      throw new IndexOutOfBoundsException("Heap is full");
    }

    heap[size] = value;

//    now heapify -- fix the heap
    fixHeapAbove(size);

    size++;
  }

  /*
   * we take the index
   * if we take the value we need to do a binary search first to get the index
   * linear because our array is not sorted
   * and cant sort the array because it would destroy or heap structure
   * */
  public int delete(int index)
  {
    if (isEmpty())
    {
      throw new IndexOutOfBoundsException("Heap is empty");
    }

    int parent = getParent(index);
    int deletedValue = heap[index];

//    replacement step
    heap[index] = heap[size - 1];

//    look up or down the heap
    if (index == 0 || heap[index] < heap[parent])
    {
      fixHeapBelow(index, size - 1);
    }
    else
    {
      fixHeapAbove(index);
    }

    size--;

    return deletedValue;
  }

  public void sort()
  {
    int lastHeapIndex = size - 1;

    for (int i = 0; i < lastHeapIndex; i++)
    {
//      swap the root with the last item
      int temp = heap[0];
      heap[0] = heap[lastHeapIndex - i];
      heap[lastHeapIndex - i] = temp;

      fixHeapBelow(0, lastHeapIndex - i - 1);
    }
  }

  /*
   * index = the index of the item we are deleting
   * lastHeapIndex = heap.size - 1
   * */
  private void fixHeapBelow(int index, int lastHeapIndex)
  {
    int childToSwap;

//    swapping phase
    while (index <= lastHeapIndex)
    {
      int leftChild = getChild(index, true);
      int rightChild = getChild(index, false);

      if (leftChild <= lastHeapIndex)
      {
//        this node has a left child
        if (rightChild > lastHeapIndex)
        {
//          it does not have a right child because out of bounds
          childToSwap = leftChild;
        }
        else
        {
//          we also have a right child
          childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
        }

//        check if swap is needed
        if (heap[index] < heap[childToSwap])
        {
//          swap
          int temp = heap[index];
          heap[index] = heap[childToSwap];
          heap[childToSwap] = temp;
        }
        else
        {
          break;
        }

        index = childToSwap;
      }
      else
      {
        break;
      }
    }
  }

  /*
  returns the root of the heap
   */
  public int peek()
  {
    if (isEmpty())
    {
      throw new IndexOutOfBoundsException("Heap is empty");
    }

    return heap[0];
  }

  private void fixHeapAbove(int index)
  {
    int newValue = heap[index];

    while (index > 0 && newValue > heap[getParent(index)])
    {
      heap[index] = heap[getParent(index)];
      index = getParent(index);
    }

    heap[index] = newValue;
  }

  public boolean isFull()
  {
    return size == heap.length;
  }

  public boolean isEmpty()
  {
    return size == 0;
  }

  public int getChild(int parentIndex, boolean left)
  {
    return 2 * parentIndex + (left ? 1 : 2);
  }

  /*
  division with integers will be rounded down to the closest integer
  basically integer division in Java is flooring the result
   */
  public int getParent(int index)
  {
    return (index - 1) / 2;
  }

  public void printHeap()
  {
    for (int i = 0; i < size; i++)
    {
      System.out.println(heap[i]);
    }
  }
}
