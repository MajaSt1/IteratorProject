package datastructure.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.LinkedList.Node;

/**
 * List based on recursively related objects
 *
 * @param <T>
 */
public class CustomLinkedList<T> extends AbstractCustomListAdapter<T> {
    
	private Node<T> next;
	private Node<T> head;
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
    public boolean contains(Object o) throws NoSuchElementException {
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
    	if(head.getNext().equals(null)){
    		head.setNext(new Node(t));
    		}   
        return false;
    }

    @Override
    public boolean remove(Object o) {
    	if(head == null) throw new RuntimeException("cannot delete");
    	  if (o == null) {
              for (Node<T> x = head; x != null; x = x.getNext()) {
                  if (x.getValue() == null) {
                      remove(x);
                      return true;
                  }
              }
          } else {
              for (Node<T> x = head; x != null; x = x.next) {
                  if (o.equals(x.item)) {
                      remove(x);
                      return true;
                  }
              }
          }
          
        return false;
    }

    @Override
    public void clear() {
    	head.setNext(null);
    	size=0;
       
    }

    @Override
    public T get(int index) {
    	/* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public T set(int index, T element) {
    /*	Node<T> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
        return null; */
    }

    @Override
    public void add(int index, T element) {
       Node <T> node= new Node<T> (element);
    }

    @Override
    public T remove(int index) {
    	/*	Node temp = head;
		for(int i=0; i< index - 1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		numNodes--;
        return null; */
    }

    @Override
    public int indexOf(Object o) {
    	/* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }

    /**
     * Iterator for CustomLinkedList
     */
    private class CustomLinkedListIterator<E> implements Iterator<E> {
    	 Node currentValue= null; //wartownik
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
        public E next() { // element , WYJATEK!!
             if(currentValue.getNext() == null) {
            	 currentValue = head; 
            	 return currentValue.getValue();}
             else if(currentValue ==null){
            	 return null;
             }
        }

        @Override
        public void remove() {
             
        }
    }
}
