package datastructure.list;

import java.util.Iterator;

/**
 * List based on recursively related objects
 *
 * @param <T>
 */
public class CustomLinkedList<T> extends AbstractCustomListAdapter<T> {
    
	private Node<T>head;
	private int size;

	public CustomLinkedList(){
		clear();
	}
	
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
    	if(size == 0) return true;
    	
        return false;
        // return size==0;
    }

    @Override
    public boolean contains(Object o) {
    	if(head.getValue().equals(o)){
    		return true;
    	}
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        
        return new CustomLinkedListIterator<>();
    }

    @Override
    public boolean add(T t) {
    	if(head.getNext().equals(null)) head.setNext(new Node(t));
        
        return false;
    }

    @Override
    public boolean remove(Object o) {
       
        return false;
    }

    @Override
    public void clear() {
    	head.setNext(null);
    	size=0;
       
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
       Node <T> node= new Node<T> (element);
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
     * Iterator for CustomLinkedList
     */
    private class CustomLinkedListIterator<E> implements Iterator<E> {
    	 Node <T> currentValue= null; 
        @Override
        public boolean hasNext() {
             if(currentValue == null && head != null){
            	 return true;
             }else if (currentValue != null){
            	 return currentValue.getNext()!=null; // true
             }	
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
