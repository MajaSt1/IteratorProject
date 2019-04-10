package datatype;

import java.util.List;

/**
 * Stack, LIFO queue
 */
public class CustomStack<T> extends AbstractCustomStackAdapter<T> {
    List<T> storage;

    public CustomStack(List<T> storage) {
        this.storage = storage;
    }

    @Override
    public void push(T t) {
        storage.add(0,t);
    }

    @Override
    public T pop() {
    	 if(!storage.isEmpty()){
    		 return storage.remove(0);} else {
    			 throw new IllegalStateException("Empty");
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
}
