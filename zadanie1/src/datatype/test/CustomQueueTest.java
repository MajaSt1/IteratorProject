package datatype.test;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import datastructure.list.CustomLinkedList;
import datatype.CustomQueue;

public class CustomQueueTest<T> {
	
    CustomLinkedList<Integer> custom= new CustomLinkedList<>();
    CustomQueue<Integer> customQ;
    
    @Before 
    public void add(){
    	customQ= new CustomQueue<Integer>(custom);
    
    }

	@Test
	public void testSize() {
		//
		custom.add(1);
    	custom.add(2);
    	custom.add(3);
		//
		int size= customQ.size();
		//
		assertEquals(size,3);
	}
	@Test
	public void testSizeNull() {
		//
		custom.add(null);
		//
		int size= customQ.size();
		//
		assertEquals(1,size);
	}
	
	@Test
	public void testIsNotEmptyNull() {
		//
		custom.add(null);
    	//
    	boolean empty=customQ.isEmpty();
    	//
    	assertFalse(empty);
	}

	@Test
	public void testIsEmpty() {
		//
		custom = new CustomLinkedList<>();
    	//
    	boolean empty=customQ.isEmpty();
    	//
    	assertTrue(empty);
	}

	@Test
	public void testAdd() {
		//
		custom.add(1);
    	custom.add(2);
    	custom.add(3);
    	//
    	
    	//
    	
	}

	@Test
	public void testPoll() {
		//
		custom.add(1);
    	custom.add(2);
    	custom.add(3);
    	//
    	Integer e = customQ.poll();
    	//
    	assertEquals(e,new Integer(1));
	}
	
	@Test(expected= NoSuchElementException.class)
	public void testPollEmpty() {
		//
    	//
    	Integer e = customQ.poll();
    	//
	}

	@Test
	public void testPeek() {
		//
		custom.add(1);
    	custom.add(2);
    	custom.add(3);
    	//
    	Integer e = customQ.peek();
    	//
    	assertEquals(e,new Integer(1));
	}

	@Test(expected= IllegalArgumentException.class)
	public void testPeekEmpty() {
		//
    	//
    	Integer e = customQ.peek();
    	//
	}
}
