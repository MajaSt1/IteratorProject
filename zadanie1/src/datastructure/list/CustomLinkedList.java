package datastructure.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

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
		size = 0;
	}
	
	public CustomLinkedList(T element){
		head = new Node<T>(element);
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

		if (head==null) {
			Node<T> head = new Node<T>(t);
		}
		Node<T> temp = new Node<T>(t);
		Node<T> current = head;

		if (current != null) {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
		size++;

		return true;
	}

	@Override
	public boolean remove(Object o) {
		Node<T> current =  head;
		if(current.value.equals(o)){
			current= current.getNext();
			
			size --;
			return true;
		} else {
			throw new IllegalArgumentException("Array is empty!");
		}
	}

	@Override
	public void clear() {
		head = null;
		size = 0;

	}

	@Override
	public T get(int index)  {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("index was out of bounds");
		}
		
		Node<T> current = head;
		int count = 0;
		for(int i =0; i < index; i ++){
			current = current.next;
		}
	//	Optional<T> nullable= Optional.of(current.value);
		return (T) current.next;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T set(int index, T element) throws IndexOutOfBoundsException {
		Node <T> current = head;
		int count = 0;
		while (count <= index) {
			current = current.getNext();
			count++;
		}
		 T e= current.value;
		 current.value= element;
		return e;
	}

	@Override
	public void add(int index, T element)  {
		Node<T> newnode = new Node<T>(element);

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
		
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new NoSuchElementException();
			
		} else if (index == 0) {
			size--;
	
			T temp = head.value;
			head = head.next;
			
			return temp;
		} else {
			Node<T> current = head;
			for  (int i = 0; i < index - 1; i++) {
				current = current.next; 
			}
			current.next = current.next.next;
			size--;
			
			return current.value;
		}	
	}

	@Override
	public int indexOf(Object o) {
		int index = 0;
	    Node<T> current = head;

	    while (current != null) {
	        if (current.value.equals(o)) {
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
		public void remove()  {
			if (previous == null || removedCalled  ) {
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
