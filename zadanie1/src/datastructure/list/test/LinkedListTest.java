package datastructure.list.test;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import datastructure.list.CustomLinkedList;

public class LinkedListTest {

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddT() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddIntT() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveInt() {
		fail("Not yet implemented");
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
		CustomLinkedList <Integer> linkedlist= new CustomLinkedList();
		
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		//When
		
		Iterator <Integer> list=linkedlist.iterator();
		
		int count=0;
		
		while(list.hasNext()){
			Integer element= list.next();
			
			count ++;
		}
	   //Then
		assertEquals(count, 3);
	}

}
