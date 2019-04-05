package datastructure.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
   
        return false;
    }

    @Override
    public boolean remove(Object o) {
     
        return false;
    }

    @Override
    public void clear() {
        
    }

    @Override
    public T get(int index) {
      
        return null;
    }

    @Override
    public T set(int index, T element) {
   
        return null;
    }

    @Override
    public void add(int index, T element) {
     
    }

    @Override
    public T remove(int index) {
       
        return null;
    }

    @Override
    public int indexOf(Object o) {
    
        return 0;
    }

    /**
     * Iterator for CustomArrayList
     */
    private class CustomArrayListIterator<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
             
            return false;
        }

        @Override
        public E next() {
         
            return null;
        }

        @Override
        public void remove() {
             
        }
    }
}
