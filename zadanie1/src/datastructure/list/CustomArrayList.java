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

	private Object[] value;
	private int initialCapacity;
	private static final int DEFAULT = 10;
	private static final Object[] EMPTY = {};
	private int size;

	public CustomArrayList() {
		value = new Object[DEFAULT];
	}

	public CustomArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			this.value = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.value = EMPTY;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}

	private void increasingArrayLength() {
		if (initialCapacity != 0) {
			if ( Math.round(value.length / initialCapacity) >= 0.9){
				String[] newArray = new String[value.length + 4];
			    System.arraycopy(value, 0, newArray, 0, value.length);
			    
			    value = newArray;
			} else if ( Math.round(value.length / initialCapacity) <= 0.6){
				String[] newArray = new String[value.length - 4];
			    System.arraycopy(value, 0, newArray, 0, value.length);
			    
			    value = newArray;
				}
			}
	}
	
	 private void rangeCheck(int index) {
	        if (index >= size)
	            throw new IndexOutOfBoundsException("Out of array" + (index));
	    }

	@Override
	public int size() {
		return size = value.length;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
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
		increasingArrayLength();
		
        value[size++] = t;
        return true;
	}

	@Override
	public boolean remove(Object o) {
		if (size() != 0) {
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
		} else {
			throw new IllegalArgumentException("Array is empty!");
		}

		return false;
	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public T get(int index) {
		rangeCheck(index);
		
		@SuppressWarnings("unchecked")
		 T element = (T) value[index];

		return element;
	}

	@Override
	public T set(int index, T element) {
		rangeCheck(index);
		
		@SuppressWarnings("unchecked")
		T oldValue = (T) value[index];
		value[index] = element;

		return oldValue;
	}

	@Override
	public void add(int index, T element) {
		increasingArrayLength();
		rangeCheck(index);

		if (index == size - 1 || index > size - 1) {

			value[index] = element;
			size++;
		} else {
			Object[] result = new Object[value.length];

			for (int i = 0; i < index; i++)
				result[i] = value[i];
			
			result[index] = element;

			for (int i = index + 1; i < value.length; i++)
				result[i] = value[i - 1];
			
			size ++;
		}
	} 

	@Override
	public T remove(int index) {
		increasingArrayLength();
		
		if (size != 0) {
			@SuppressWarnings("unchecked")
			T oldValue = (T) value[index];
			
			for(int i = 0; i < value.length; i++){
	            if(value[i] == oldValue){
	                for(int n = i; n < value.length - 1; n++){
	                    value[n] = value[n+1];
	                }
	                break; }
	        }
			return oldValue;

		} else {
			throw new IllegalArgumentException("Array is empty!");
		}

	}

	@Override
	public int indexOf(Object o) {
		if (size != 0) {
			for (int i = 0; i < value.length; i++) {
				if (value[i].equals(o)) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * Iterator for CustomArrayList
	 */
	private class CustomArrayListIterator<E> implements Iterator<E> {

		int current = 0;
		boolean elementRemoved= false;

		@Override
		public boolean hasNext() {
			if (current < CustomArrayList.this.value.length) {
				return true;} else {
					return false;
				}
		}

		@Override
		public E next()  {
			if (!hasNext()) {
				throw new NoSuchElementException("Array is empty!");
			} else {
				@SuppressWarnings("unchecked")
				E nextValue = (E) value[current++];
				
				elementRemoved= false;
				return nextValue;
			}
		}

		@Override
		public void remove() {
			if( elementRemoved ){
	            throw new IllegalStateException("must call next() before calling remove()");}
			else{
			Object[] newValue = new Object[value.length - 1];
	        System.arraycopy(value, 0, newValue, 0, value.length - 1); 
	 
	        value = newValue;
	        
	        elementRemoved = true;
			}
		}
	}
}
