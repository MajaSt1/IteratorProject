package datastructure.list.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import datastructure.list.CustomLinkedList;

public class LinkedListTest {
	
	List<Integer> custom;
	

	@Test
	public void testSize() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		//
		int size=custom.size();
		//
		assertEquals(size, 2);	
	}

	@Test
	public void testIsEmpty() {
		//
		custom= new LinkedList<>();
		//
		boolean isEmpty=custom.isEmpty();
		//
		assertTrue(isEmpty);
	}
	
	@Test
	public void testIsNotEmpty() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		//
		boolean isEmpty=custom.isEmpty();
		//
		assertFalse(isEmpty);
	}

	@Test
	public void testContainsValueTrue() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		//
		boolean contains= custom.contains(new Integer(2));
		//
		assertTrue(contains);
	}
	
	@Test
	public void testContainsValueFalse() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		//
		boolean contains= custom.contains(new Integer(5));
		//
		assertFalse(contains);
	}

	@Test
	public void testAddTReturnTrue() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		//
		boolean addT= custom.add(new Integer(56));
		//
		assertTrue(addT);
	}
	
	//@Test
	/*public void testAddTReturnFalse() {
		//
		custom= new LinkedList<>();
		int size=custom.size();
		//
		boolean addT= custom.add(new Integer(56));
		//
		assertTrue(addT);
	} */

	@Test
	public void testRemoveObjectReturnTrue() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		boolean removeObj= custom.remove(new Integer(6));
		//
		assertTrue(removeObj);
	}
	
	@Test
	public void testRemoveObjectReturnFalse() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		boolean removeObjF= custom.remove(new Integer(37));
		//
		assertFalse(removeObjF);
	}

	@Test
	public void testClear() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		//
		custom.clear();
		int size= custom.size();
		//
		assertEquals(size, 0);
	}

	@Test
	public <T> void testGet() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		@SuppressWarnings("unchecked")
		T getValue = (T) custom.get(1);
		//
		assertEquals(getValue, new Integer(6));
	}
	
	@Test(expected = IndexOutOfBoundsException.class )
	public void testNotGet(){
		
	}

	@Test
	public <T> void testSet() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		@SuppressWarnings("unchecked")
		T current = (T) custom.set(1, new Integer(23));
		int size=custom.size();
		//
		assertEquals(new Integer (23), current);
		assertEquals(3, size);
	}
	@Test(expected= IndexOutOfBoundsException.class)
	public void throwExceptionTestSet(){
		
	}

	@Test
	public <T> void testAddIntTIndex0() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		custom.add(0, new Integer(1));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(0);
		int size= custom.size();
		//
		assertEquals(element, new Integer(1));
		assertEquals(4, size);
	}

	@Test
	public <T> void testAddIntTIndex() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		custom.add(3, new Integer(1));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(3);
		int size= custom.size();
		//
		assertEquals(element, new Integer(1));
		assertEquals(4, size);
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public <T> void testAddIntTOutOfBonds() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		custom.add(4, new Integer(1));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(4);	
	}

	@Test
	public void testRemoveIntIndex0() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		custom.remove(0);
		int size = custom.size();
		//
		assertEquals(2,size);
	}
	
	@Test
	public <T> void testRemoveIntIndex() {
		//
		custom= new LinkedList<>();
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		@SuppressWarnings("unchecked")
		T remove=(T)custom.remove(2);
		int size = custom.size();
		//
		assertEquals(2,size);
	}

	@Test
	public void testIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testCustomLinkedList() {
		fail("Not yet implemented");
	}
	
	@Test
	public void iterate_through_linkedList(){
		//Given
		List <Integer> linkedlist= new LinkedList();
		
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		//When
		
		Iterator <Integer> list=linkedlist.iterator();
		
		int count=0;
		
		//while(linkedlist.hasNext()){
			Integer element= list.next();
			
			count ++;
		}
	   //Then
	//	assertEquals(count, 3);
	

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}
}
