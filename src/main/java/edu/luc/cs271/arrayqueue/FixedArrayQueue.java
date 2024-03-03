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

    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = -1;
    this.rear = -1;
    
    // this.front = 0;
    // this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    rear = rear++;
    size = size++;
    if (rear==capacity-1) {rear = 0;}
    if (front==-1) {front = 0;}
    data[rear] = obj;
    return true;
  }

//   Increment rear by 1.
// If rear is equal to n, set rear to 0.
// If front is -1, set front to 0.
// Set queue[rear] to x.

  @Override
  public E peek() {
    // TODO
    return data[front];
  }

  @Override
  public E poll() {
    E x = data[front];
    if (front==rear) {
      front = -1;
      rear = -1;
    }
    else{
      front++;
      if (front == capacity-1) {front = 0;}
    }
    size--;
    return x;
  }

//  Set x to queue[front].
//  If front is equal to rear, set front and rear to -1.
// Otherwise, increment front by 1 and if front is equal to n, set front to 0.
// Return x.


  @Override
  public boolean isEmpty() {
    return size==0;
  }

  @Override
  public boolean isFull() {
    return size==capacity-1;
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
    
    return result;
  }
}
