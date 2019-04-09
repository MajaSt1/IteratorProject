package datatype;

import java.util.ArrayList;
import java.util.List;

import datastructure.list.CustomArrayList;

/**
 * FIFO queue
 */
public class CustomQueue<T> extends AbstractCustomQueueAdapter<T> {
    List<T> storage = null;
    private int initialCapacity;

    public CustomQueue(List<T> storage, int initialCapacity) {
    	if (initialCapacity > 0) {
    		this.storage = storage;
		} else if (initialCapacity == 0) {
			this.storage = null;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
    }

    @Override
    public int size() {   
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
        return storage.size()== 0;
    }

    @Override
    public boolean add(T t) {
    	for (int i = 0; i < storage.size(); i++) {
			if (storage.isEmpty()) {
				storage.add(t);

				return true;
			} if (initialCapacity < size()){
				throw new IllegalStateException ("Element cannot be added at this time due to capacity restrictions");
			}
		}
		return false;
    }

    @Override
    public T poll() {
    	return storage.remove(0);
    }

    @Override
    public T peek() {
        return storage.get(0);
    }
}
