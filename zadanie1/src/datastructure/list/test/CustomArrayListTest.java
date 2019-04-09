package datastructure.list.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

import datastructure.list.CustomArrayList;


public class CustomArrayListTest<T> {
	

    List<Integer> custom;

	@Test
	public void testDefaultSize() {
		// Given
		custom = new CustomArrayList<>();
		// When
		int size = custom.size();
		// Then
		Assert.assertEquals(size, 10);
	}
	
	@ Test
	public void testRandomSize(){
		//
		custom= new ArrayList<>(4);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		assertEquals(custom.size(),4);
	}

	@Test
	public void testIsEmpty() {
		//
		custom = new CustomArrayList<>(0);
		//
		boolean isEmpty = custom.isEmpty();
		//
		Assert.assertTrue(isEmpty);
	}

	@Test
	public void testIndexOf() {
		//
		custom= new ArrayList<>(4);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		int index= custom.indexOf(new Integer(4));
		//
		Assert.assertEquals(2, index);
	}
	
	@ Test
	public void testNullIndex(){
		//
		custom= new ArrayList <>();
		//
		int index= custom.indexOf(null);
		//
		assertEquals(-1, index);
	}

	@Test
	public void testContains() {
		//
		custom= new ArrayList<>(4);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		boolean contains= custom.contains(new Integer(1));
		//
		assertTrue(contains);
	}
	
	@Test
	public void shouldNotContainstest(){
		//
		custom= new ArrayList<>(4);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		boolean contains= custom.contains("integer");
		//
		assertFalse(contains);
	}
	
	@Test
	public void shouldNotContainsTestNull(){ 
		//
		custom= new ArrayList<>();
		//
		boolean containsNull= custom.contains("null");
		//
		assertFalse(containsNull);
		
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

	@Test
	public void shouldAddtestT() {
		//
		custom= new ArrayList<>(5);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		boolean add = custom.add(new Integer(6));
	    //
		assertTrue(add);
	}

	@Test
	public void shouldRemoveObjectTest() {
		//
		custom= new ArrayList<>(5);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		boolean removeObject= custom.remove(new Integer(5));
		//
		assertTrue(removeObject);
	}
	
	@Test
	public void shouldRemoveNullObjectTest() {
		//
		custom= new ArrayList<>(5);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(null);
		//
		boolean removeObject= custom.remove(null);
		//
		assertTrue(removeObject);
	}
	
	@Test
	public void shouldNotRemoveObjectTest() {
		//
		custom= new ArrayList<>(5);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		boolean removeObject= custom.remove(null);
		//
		assertFalse(removeObject);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void shouldThrowExceptionRemoveObjectTest() {
		//
		custom = new ArrayList<>();
		//
		custom.remove(new Integer(1));
	}

	@Test
	public void testGet() {
		//
		custom= new ArrayList<>(5);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		@SuppressWarnings("unchecked")
		T element = (T) custom.get(0);
		//
		assertEquals(element, new Integer(6));
	}
	
	@Test(expected = IndexOutOfBoundsException.class )
	public void testNotGet(){
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
        //
		@SuppressWarnings("unchecked")
		T element = (T) custom.get(7);
	}

	@Test
	public void testSet() {
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		//
		@SuppressWarnings("unchecked")
		T element = (T) custom.set(0, new Integer(8));
		//
		assertEquals(element, new Integer(6));
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public void throwExceptionTestSet(){
		//
		custom= new ArrayList<>(4);
		custom.add(1);
		//
		@SuppressWarnings("unchecked")
		T element = (T) custom.set(10, new Integer(8));
	}

	@Test
	public void testAddIntTAtBorder() {
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		//
		custom.add(3, new Integer(2));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(3);
		//
		assertEquals(element, new Integer(2));
		assertEquals(custom.size(), 4);
	}
	
	@Test
	public void testAddIntT() {
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		custom.add(5);
		//
		custom.add(1,new Integer(2));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(2);
        //
		assertEquals(element, 2);
		assertEquals(custom.size(), 5);	
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public void shouldThrowExceptionAddIntT(){
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		//
		custom.add(4, new Integer(2));
	}
	
	@Test
	public void shouldReturnOldValueRemoveIntTest() {
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		//
		@SuppressWarnings("unchecked")
		T element= (T)custom.remove(2);
		//
		assertEquals(element, 4);
		assertEquals(custom.size(),2);
	}

	@Test
	public void testIncreasingArrayLength() {
		//
		custom= new ArrayList<>(3);
		custom.add(6);
		custom.add(2);
		custom.add(4);
		//
		
	}
	
	

}
