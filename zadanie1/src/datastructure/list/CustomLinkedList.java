package datastructure.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import javax.naming.SizeLimitExceededException;

/**
 * List based on recursively related objects
 *
 * @param <T>
 */
public class CustomLinkedList<T> extends AbstractCustomListAdapter<T> {

	private Node<T> head;
	private int size;

	public CustomLinkedList() {
		head = null;
	}

	@Override
	public int size()  {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) throws NoSuchElementException {
		if (head.getValue().equals(o)) {
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
		Node<T> newnode = new Node<T>(t);
		Node<T> current = head;
		if(size > 0){
			
		int count = 0;
		while (count <= size) {
			current = current.getNext();
			count++;
		}
		current.setNext(newnode) ;
		
		return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(Object o) {
		Node<T> current = head;
		if(current.getValue().equals(o)){
			current= current.getNext();
			
			size --;
			return true;
		} else {
			
			return false;
		}

	}

	@Override
	public void clear() {
		head = null;
		size = 0;

	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		Node<T> current = head;
		int count = 0;
		while (count <= index) {
			current = current.getNext();
			count++;
		}	
		return current.getValue();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T set(int index, T element) throws IndexOutOfBoundsException {
		Node<T> current = head;
		int count = 0;
		while (count <= index) {
			current = current.getNext();
			count++;
		}
		current.setValue(element);
		return (T) current;
	}

	@Override
	public void add(int index, T element) {
		Node<T> newnode = new Node<T>(element, null);

		if (index == 0) {
			newnode.setNext(head);
			head = newnode;
		}
		Node<T> current = head;
		int count = 0;
		while (count < index - 1) {
			current = current.getNext();
			count++;
		}
		newnode.setNext(current.getNext());
		current.setNext(newnode);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		if (index == 0) {
			head = head.getNext();
		} else {
		Node<T> current = head;
		int count = 0;
		
		while (count < index - 1) {
			current = current.getNext();
			count++;
		}

		current.setNext(current.getNext().getNext());
		size --;
		
		return (T) current;
		}
			return null;	
	}

	@Override
	public int indexOf(Object o) {
		int index = 0;
	    Node<T> current = head;

	    while (current != null) {
	        if (current.equals(o)) {
	            return index;
	        }
	        index++;
	        current = current.getNext();
	    }

	    return -1;
	}

	/**
	 * Iterator for CustomLinkedList
	 */
	private class CustomLinkedListIterator<E> implements Iterator<E> {
		Node<T> current = head; 
		Node<T> previous =null; // This method can be called only once per call to next()
		Node<T> previous2 =null;
		private boolean removedCalled= false;

		@Override
		public boolean hasNext() {
			return (current != null && current.getNext() != null);
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if (!this.hasNext()) {
	            throw new IllegalStateException("There is no next");
	        }
			
			previous2= previous;
			previous = current;
	        current = current.getNext();
	        removedCalled = false;
	        return (E) current.getValue();
		}

		@Override
		public void remove() {
			if (previous == null || removedCalled ) {
				throw new IllegalStateException();
			} if (previous2 == null){
				head = current;
			} else {
				previous2.setNext(current);
			}
			size --;
			
			removedCalled = true;
		}
	}
}
