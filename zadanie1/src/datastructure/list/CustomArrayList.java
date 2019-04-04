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
	
    public CustomArrayList() { 
    	value= new Object[DEFAULT];
    }

    public CustomArrayList(int initialCapacity) {
    	this.initialCapacity=initialCapacity;
    	value=new Object[initialCapacity];
    }
    public int getvalue(){
		return value.length;
    }

    @Override
    public int size() {
    	
    /*	 if (initialCapacity > 0) {
            this.value = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.value = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        }
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }


    @Override
    public boolean isEmpty() {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public boolean contains(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public Iterator<T> iterator() {
    	
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return new CustomArrayListIterator<>();
    }

    @Override
    public boolean add(T t) {
    
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public boolean remove(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public void clear() {
        
    }

    @Override
    public T get(int index) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public T set(int index, T element) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public void add(int index, T element) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
    }

    @Override
    public T remove(int index) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public int indexOf(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }

    /**
     * Iterator for CustomArrayList
     */
    private class CustomArrayListIterator<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
            return false;
        }

        @Override
        public E next() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
            return null;
        }

        @Override
        public void remove() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
        }
    }
}
