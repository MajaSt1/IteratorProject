package datastructure.list;

/**
 * Component of linked list that stores a value and reference to the next element.
 */
public class Node <T> {
	private T value;
	 Node<T> next; //pointer
	
	public Node(T value){
		this.value=value;
	}

	public Node(T value, Node<T> next) {
		this.value= value;
		this.next= next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	} 
	
	
	
     
}
