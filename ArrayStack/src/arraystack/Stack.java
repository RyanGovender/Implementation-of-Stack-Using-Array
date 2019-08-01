/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author 21614
 */
public class Stack <T> implements StackInterface<T> {
    
  private T elements[];
  private int Size;
  
  Stack()
  {
     elements = (T[]) new Object[20];
     Size=0;
  }
  @Override
  public boolean isEmpty()
  {
      return Size==0;
  }
  @Override
  public int Size()
  {
      return Size;
  }
  @Override
    public void push(T item)
    {
        if(elements.length==Size) elements=Arrays.copyOf(elements, 2*Size);
        
        elements[Size]=item;
        Size++;
    }
    
  @Override
    public T pop()
    {
        if(isEmpty())throw new EmptyStackException();
        
            T item=elements[Size-1];
            Size--;
            return item;
    }
    
  @Override
    public T peek()
    {
        if(isEmpty())throw new EmptyStackException();
   
        return elements[Size-1];
    }
   
}
