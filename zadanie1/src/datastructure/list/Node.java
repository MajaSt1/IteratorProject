package datastructure.list;

/**
 * Component of linked list that stores a value and reference to the next element.
 */
public class Node { // tzw.wartownik
	private Object value;
	private Node next;
	
	public Node(){
		
	}

	public Node(Object value, Node next) {
		this.value= value;
		this.next= next;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	} 
	
	
	
     
}
