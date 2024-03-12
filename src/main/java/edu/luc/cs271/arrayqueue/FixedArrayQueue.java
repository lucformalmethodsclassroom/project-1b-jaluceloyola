package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    // TODO check argument validity
    if (capacity <= 0)
    {
      throw new java.lang.IllegalArgumentException("Capacity must be 0 or greater");
    }
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;

    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    if (size==capacity) {return false;}
    else {
    // TODO
    rear = rear+1;
    size = size+1;
    if (rear==capacity) {rear = 0;}
    if (front==-1) {front = 0;}
    data[rear] = obj;
    return true;
    }
  }

  @Override
  public E peek() {
    // TODO
    if (size ==0){return null;}
    else{return data[front];}
  }

  @Override
  public E poll() {
    if (size ==0) {return null;}
    else {
      E x = data[front];
      if (front==rear) {
        front = -1;
        rear = -1;
      }
      else{
        front = front+1;
        if (front == capacity) {front = 0;}
      }
      size = size-1;
      return x;
    }
  }

  @Override
  public boolean isEmpty() {
    return size==0;
  }

  @Override
  public boolean isFull() {
    return size==capacity;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public int capacity() {
    return capacity;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    final ArrayList<E> result = new ArrayList<E>(capacity);
    E temp;
    for (int i = 0; i < this.size; i++) {
      temp = this.poll();
      result.add(temp);
      this.offer(temp);
    }

    return result;
  }
}
