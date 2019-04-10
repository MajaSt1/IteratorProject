package datastructure.list.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import datastructure.list.CustomArrayList;
import datastructure.list.CustomLinkedList;
import datastructure.list.Node;

public class LinkedListTest {
	
	CustomLinkedList<Integer> custom;
	
	@Before 
	public void list(){
		//
		   custom= new CustomLinkedList<>(4);
			custom.add(1);
			custom.add(2);
			custom.add(6);
			custom.add(5);
	} 
	

	@Test
	public void testSize() {
		//
		//
		int size=custom.size();
		//
		assertEquals(size, 4);	
	}

	@Test
	public void testIsEmpty() {
		//
		custom.clear();
		//
		boolean isEmpty=custom.isEmpty();
		//
		assertTrue(isEmpty);
	}
	
	@Test
	public void testIsNotEmpty() {
		//
		//
		boolean isEmpty=custom.isEmpty();
		//
		assertFalse(isEmpty);
	}

	@Test
	public void testContainsValueTrue() {
		//
		custom= new CustomLinkedList<>(2);
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
		custom= new CustomLinkedList<>(2);
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
		custom= new CustomLinkedList<>(2);
		custom.add(2);
		custom.add(6);
		//
		boolean addT= custom.add(new Integer(56));
		//
		assertTrue(addT);
	}
	
	@Test
	public void testAddTReturnTrueWhenAddNull() {
		//
		custom= new CustomLinkedList<>(2);
		//
		boolean addT= custom.add(null);
		//
		assertTrue(addT);
	} 

	@Test
	public void testRemoveObjectReturnTrue() {
		//
	
		//
		boolean removeObj= custom.remove(new Integer(4));
		//
		assertTrue(removeObj);
	}
	
	@Test
	public void testRemoveObjectReturnFalse() {
		//
		//
		boolean removeObjF= custom.remove(new Integer(37));
		//
		assertFalse(removeObjF);
	}

	@Test
	public void testClear() {
		//
		custom= new CustomLinkedList<>(2);
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
		//
		@SuppressWarnings("unchecked")
		T getValue = (T) custom.get(1);
		//
		assertEquals(getValue, new Integer(1));
	}
	
	@Test
	public <T> void testSet() {
		//
		//
		@SuppressWarnings("unchecked")
		T current = (T) custom.set(1, new Integer(23));
		int size=custom.size();
		//
		assertEquals(new Integer (2), current);
		assertEquals(4, size);
	}
	
	@Test
	public <T> void testAddIntTIndex0() {
		//
		//
		custom.add(0, new Integer(1));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(0);
		int size= custom.size();
		//
		assertEquals(element, new Integer(1));
		assertEquals(5, size);
	}

	@Test
	public <T> void testAddIntTIndex() {
		//
		//
		custom.add(3, new Integer(1));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(3);
		int size= custom.size();
		//
		assertEquals(element, new Integer(1));
		assertEquals(5, size);
	}
	
	@Test
	public void testRemoveIntIndex0() {
		//
		//
		int size1 = custom.size();
		custom.remove(0);
		int size2 = custom.size();
		//
		assertEquals(4,size1);
		assertEquals(3,size2);
	}
	
	@Test
	public <T> void testRemoveIntIndex() {
		//
		custom= new CustomLinkedList<>(3);
		custom.add(2);
		custom.add(6);
		custom.add(7);
		//
		@SuppressWarnings("unchecked")
		T remove=(T)custom.remove(2);
		int size = custom.size();
		//
		assertEquals(remove, new Integer(2));
		assertEquals(2,size);
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testRemoveIntException() {
		//
		custom= new CustomLinkedList<>(0);
		//
		custom.remove(3);
	}

	@Test
	public void testIndexOf() {
	    //
		//
		int index= custom.indexOf(new Integer(6));
		//
		assertEquals(index, 3);
	}
	
	//@Test
/*	public void iterateThroughLinkedList(){
		//
		custom.add(2);
		custom.add(3);
		custom.add(4);
		//
		
		int count=0;
		while(custom.iterator().hasNext()){
			Integer element= custom.iterator().next();
			count ++;}
	   //
		assertEquals(count, 3); */

	
	@Test
	public void testIteratorHasNextTrue() {
		//
		custom= new CustomLinkedList<>(3);
		custom.add(2);
		custom.add(3);
		custom.add(4);
		//
		boolean hasNext= custom.iterator().hasNext();
		//
		assertTrue(hasNext);
		
	}
	
	@Test(expected= IllegalStateException.class )
	public void testIteratorNextException() {
		//
		custom= new CustomLinkedList<>();
		//
		custom.iterator().next();
		
	}
	@Test
	public <E> void testIteratorNextValue() {
		//
		
		//
	     custom.iterator().hasNext();
		@SuppressWarnings("unchecked")
		E next= (E) custom.iterator().next();
		//
		Assert.assertEquals(1, next);	

	}
	
	@Test(expected= IllegalStateException.class)
	public void testIteratorRemoveException(){
		//
		//
		custom.iterator().remove();
		custom.iterator().remove();
		//
	}
	
	}

