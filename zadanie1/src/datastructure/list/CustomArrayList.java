package datastructure.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;



/**
 * List based on the table
 *
 * @param <T>
 */
public class CustomArrayList<T> extends AbstractCustomListAdapter<T> {
    
	private Object[]value;
	private int initialCapacity;
	private static final int DEFAULT = 10;
	private static final Object[] EMPTY = {};
	private int size= size();
	// ASPECTJ
	
    public CustomArrayList() { 
    	value= new Object[DEFAULT];
    }

    public CustomArrayList(int initialCapacity) {
    	 if (initialCapacity > 0) {
             this.value = new Object[initialCapacity];
         } else if (initialCapacity == 0) {
             this.value = EMPTY;
         } else {
             throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
         }
    }

    @Override
    public int size() {
        return value.length; 
    }

    @Override
    public boolean isEmpty() {
    	return initialCapacity == 0;
    }

    @Override
    public boolean contains(Object o) {
    	 return indexOf(o) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomArrayListIterator<>();
    }

    @Override
    public boolean add(T t) {
    	
    	if(size() == initialCapacity){ 
            return false;
        }
        value[size--] = t;
        
        return true;
    }

    @Override
    public boolean remove(Object o) { 
    	if(size != 0){
    	 if (o == null) {
             for (int index = 0; index < size(); index++)
                 if (value[index] == null) {
                     remove(index);
                     return true;
                 }
         } else {
             for (int index = 0; index < size(); index++)
                 if (o.equals(value[index])) {
                     remove(index);
                     return true;
                 }
            } 
    	 }else { throw new IllegalArgumentException("Array is empty!");}
         
         return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++)
            value[i] = null;

        size = 0;
    }

    @Override
    public T get(int index) {
    	@SuppressWarnings("unchecked")
    	final T element = (T) value[index];
    	
    	return element;
    }

    @Override
    public T set(int index, T element) {
    	@SuppressWarnings("unchecked")
    	final T e = (T) value[index];
    	element=e;
    	
        return element;
    }

    @Override
    public void add(int index, T element) {
        if( index == size-1 || index > size-1){
       
        value[index] = element;
        size++; 
        }
    }

    @Override
    public T remove(int index) { // throw
    	if(size != 0){
     @SuppressWarnings("unchecked")
			T oldValue =(T) value[index];

    	  int numMoved = size - index - 1;
    	   if (numMoved > 0)
    	      System.arraycopy(value, index+1, value, index,
    	                             numMoved);
    	  value[--size] = null; 

    	  return oldValue;
    	  
        } else { throw new IllegalArgumentException("Array is empty!");}
    	 
    }	
  

    @Override
    public int indexOf(Object o) {
    	if(value==null) return -1;
    	else {
    	for (int i = 0; i < value.length; i++){
    		if(value[i]==o){
    			return i;
    		}
    	}
    	} return -1;
        
    }

    /**
     * Iterator for CustomArrayList
     */
    private class CustomArrayListIterator<E> implements Iterator<E> {

    	int current= 0;
    	
        @Override 
        public boolean hasNext() {
        	if(current < CustomArrayList.this.value.length){
        		return true;
        	}else{
        		return false;
        	}
        }

        @Override
        public E next() throws NoSuchElementException {
         if(!hasNext()){
        	 throw new NoSuchElementException("Array is empty!");
         }else{
        	 @SuppressWarnings("unchecked")
 			E nextValue =(E) value[current++];
        	 
        	 return nextValue;
            }
        }

        @Override
        public void remove() {
             
        }
    }
}
