package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

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
    // this.front = -1;
    // this.rear = -1;
    
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    if (size==capacity) {return false;}
    else {
    // TODO
    //System.out.println(front);
    //System.out.println(rear);
    rear = rear+1;
    size = size+1;
    if (rear==capacity) {rear = 0;}
    if (front==-1) {front = 0;}
    data[rear] = obj;
    //System.out.println(front);
    //System.out.println(rear);
    return true;
    }
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
      front = front+1;
      if (front == capacity) {front = 0;}
    }
    size = size-1;
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
