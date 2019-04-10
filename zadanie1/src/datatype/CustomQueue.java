package datatype;

import java.util.List;


/**
 * FIFO queue
 */
public class CustomQueue<T> extends AbstractCustomQueueAdapter<T> {
    private List<T> storage;

    public CustomQueue(List<T> storage) {
    		this.storage = storage;
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
